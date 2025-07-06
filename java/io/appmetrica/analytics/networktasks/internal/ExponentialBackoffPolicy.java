package io.appmetrica.analytics.networktasks.internal;

/* loaded from: classes.dex */
public interface ExponentialBackoffPolicy {
    boolean canBeExecuted(RetryPolicyConfig retryPolicyConfig);

    void onAllHostsAttemptsFinished(boolean z2);

    void onHostAttemptFinished(boolean z2);
}
