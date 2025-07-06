package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.yj */
/* loaded from: classes.dex */
public final class C2327yj {

    /* renamed from: a */
    public volatile long f7502a;

    /* renamed from: b */
    public C1075Ae f7503b;

    /* renamed from: c */
    public TimeProvider f7504c;

    /* renamed from: c */
    public static C2327yj m4662c() {
        return AbstractC2302xj.f7461a;
    }

    /* renamed from: a */
    public final synchronized long m4663a() {
        return (System.currentTimeMillis() / 1000) + this.f7502a;
    }

    /* renamed from: b */
    public final synchronized void m4666b() {
        this.f7503b.m2720c(false);
        this.f7503b.m4658b();
    }

    /* renamed from: d */
    public final synchronized long m4667d() {
        return this.f7502a;
    }

    /* renamed from: e */
    public final synchronized void m4668e() {
        m4665a(C2018ma.f6725C.m4216w(), new SystemTimeProvider());
    }

    /* renamed from: f */
    public final synchronized boolean m4669f() {
        return this.f7503b.m2714a(true);
    }

    /* renamed from: a */
    public final synchronized void m4664a(long j2, Long l2) {
        try {
            this.f7502a = (j2 - this.f7504c.currentTimeMillis()) / 1000;
            boolean z2 = true;
            if (this.f7503b.m2714a(true)) {
                if (l2 != null) {
                    long abs = Math.abs(j2 - this.f7504c.currentTimeMillis());
                    C1075Ae c1075Ae = this.f7503b;
                    if (abs <= TimeUnit.SECONDS.toMillis(l2.longValue())) {
                        z2 = false;
                    }
                    c1075Ae.m2720c(z2);
                } else {
                    this.f7503b.m2720c(false);
                }
            }
            this.f7503b.m2722d(this.f7502a);
            this.f7503b.m4658b();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: a */
    public final void m4665a(C1075Ae c1075Ae, TimeProvider timeProvider) {
        this.f7503b = c1075Ae;
        this.f7502a = c1075Ae.m2709a(0);
        this.f7504c = timeProvider;
    }
}
