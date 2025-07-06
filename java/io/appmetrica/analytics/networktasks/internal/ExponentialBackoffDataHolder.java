package io.appmetrica.analytics.networktasks.internal;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;

/* loaded from: classes.dex */
public class ExponentialBackoffDataHolder {

    /* renamed from: a */
    private final TimePassedChecker f7726a;

    /* renamed from: b */
    private final TimeProvider f7727b;

    /* renamed from: c */
    private final HostRetryInfoProvider f7728c;

    /* renamed from: d */
    private long f7729d;

    /* renamed from: e */
    private int f7730e;

    public ExponentialBackoffDataHolder(HostRetryInfoProvider hostRetryInfoProvider) {
        this(hostRetryInfoProvider, new SystemTimeProvider(), new TimePassedChecker());
    }

    public void reset() {
        this.f7730e = 1;
        this.f7729d = 0L;
        this.f7728c.saveNextSendAttemptNumber(1);
        this.f7728c.saveLastAttemptTimeSeconds(this.f7729d);
    }

    public void updateLastAttemptInfo() {
        long currentTimeSeconds = this.f7727b.currentTimeSeconds();
        this.f7729d = currentTimeSeconds;
        this.f7730e++;
        this.f7728c.saveLastAttemptTimeSeconds(currentTimeSeconds);
        this.f7728c.saveNextSendAttemptNumber(this.f7730e);
    }

    public boolean wasLastAttemptLongAgoEnough(RetryPolicyConfig retryPolicyConfig) {
        if (retryPolicyConfig != null) {
            long j2 = this.f7729d;
            if (j2 != 0) {
                TimePassedChecker timePassedChecker = this.f7726a;
                int r5 = ((1 << (this.f7730e - 1)) - 1) * retryPolicyConfig.exponentialMultiplier;
                int r8 = retryPolicyConfig.maxIntervalSeconds;
                if (r5 > r8) {
                    r5 = r8;
                }
                return timePassedChecker.didTimePassSeconds(j2, r5, "last send attempt");
            }
        }
        return true;
    }

    public ExponentialBackoffDataHolder(HostRetryInfoProvider hostRetryInfoProvider, SystemTimeProvider systemTimeProvider, TimePassedChecker timePassedChecker) {
        this.f7728c = hostRetryInfoProvider;
        this.f7727b = systemTimeProvider;
        this.f7726a = timePassedChecker;
        this.f7729d = hostRetryInfoProvider.getLastAttemptTimeSeconds();
        this.f7730e = hostRetryInfoProvider.getNextSendAttemptNumber();
    }
}
