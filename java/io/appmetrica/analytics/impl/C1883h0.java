package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.internal.IAppMetricaService;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.h0 */
/* loaded from: classes.dex */
public final class C1883h0 {

    /* renamed from: j */
    public static final long f6344j = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: a */
    public final Context f6345a;

    /* renamed from: b */
    public final ICommonExecutor f6346b;

    /* renamed from: e */
    public CountDownLatch f6349e;

    /* renamed from: g */
    public final C1312K1 f6351g;

    /* renamed from: d */
    public IAppMetricaService f6348d = null;

    /* renamed from: f */
    public final Object f6350f = new Object();

    /* renamed from: h */
    public final RunnableC1833f0 f6352h = new RunnableC1833f0(this);

    /* renamed from: i */
    public final ServiceConnectionC1858g0 f6353i = new ServiceConnectionC1858g0(this);

    /* renamed from: c */
    public boolean f6347c = false;

    public C1883h0(Context context, ICommonExecutor iCommonExecutor, C1312K1 c1312k1) {
        this.f6345a = context.getApplicationContext();
        this.f6346b = iCommonExecutor;
        this.f6351g = c1312k1;
    }

    /* renamed from: a */
    public final synchronized boolean m3903a() {
        return this.f6348d != null;
    }

    /* renamed from: b */
    public final void m3904b() {
        synchronized (this.f6350f) {
            this.f6346b.remove(this.f6352h);
        }
    }

    /* renamed from: c */
    public final void m3905c() {
        ICommonExecutor iCommonExecutor = this.f6346b;
        synchronized (this.f6350f) {
            try {
                iCommonExecutor.remove(this.f6352h);
                if (!this.f6347c) {
                    iCommonExecutor.executeDelayed(this.f6352h, f6344j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public final void m3902a(Long l2) {
        try {
            synchronized (this) {
                try {
                    CountDownLatch countDownLatch = this.f6349e;
                    if (countDownLatch == null) {
                        return;
                    }
                    countDownLatch.await(l2.longValue(), TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (InterruptedException unused) {
        }
    }
}
