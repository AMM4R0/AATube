package io.appmetrica.analytics.impl;

import android.content.Intent;
import android.os.RemoteException;
import io.appmetrica.analytics.internal.IAppMetricaService;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import p105l1.C2636g;

/* renamed from: io.appmetrica.analytics.impl.eh */
/* loaded from: classes.dex */
public abstract class AbstractCallableC1825eh implements Callable {

    /* renamed from: d */
    public static final C1800dh f6155d = new C1800dh();

    /* renamed from: a */
    public final C1883h0 f6156a;

    /* renamed from: b */
    public final InterfaceC2178sk f6157b;

    /* renamed from: c */
    public boolean f6158c;

    public AbstractCallableC1825eh(C1883h0 c1883h0, InterfaceC2178sk interfaceC2178sk) {
        this.f6156a = c1883h0;
        this.f6157b = interfaceC2178sk;
    }

    /* renamed from: a */
    public abstract void mo3316a(IAppMetricaService iAppMetricaService);

    /* renamed from: a */
    public void mo3792a(Throwable th) {
    }

    /* renamed from: b */
    public final C1883h0 m3794b() {
        return this.f6156a;
    }

    /* renamed from: c */
    public boolean mo3795c() {
        C1883h0 c1883h0 = this.f6156a;
        synchronized (c1883h0) {
            try {
                if (c1883h0.f6348d == null) {
                    c1883h0.f6349e = new CountDownLatch(1);
                    Intent m3212a = AbstractC1455Pj.m3212a(c1883h0.f6345a);
                    try {
                        c1883h0.f6351g.m3001b(c1883h0.f6345a);
                        c1883h0.f6345a.bindService(m3212a, c1883h0.f6353i, 1);
                    } catch (Throwable unused) {
                    }
                }
            } finally {
            }
        }
        this.f6156a.m3902a(5000L);
        return true;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        mo3791a();
        return C2636g.f8557a;
    }

    /* renamed from: d */
    public final boolean m3796d() {
        return this.f6158c;
    }

    /* renamed from: a */
    public final void m3793a(boolean z2) {
        this.f6158c = z2;
    }

    /* renamed from: a */
    public void mo3791a() {
        IAppMetricaService iAppMetricaService;
        try {
            if (this.f6158c) {
                return;
            }
            this.f6158c = true;
            int r12 = 0;
            do {
                C1883h0 c1883h0 = this.f6156a;
                synchronized (c1883h0) {
                    iAppMetricaService = c1883h0.f6348d;
                }
                if (iAppMetricaService != null) {
                    try {
                        mo3316a(iAppMetricaService);
                        InterfaceC2178sk interfaceC2178sk = this.f6157b;
                        if (interfaceC2178sk != null && !((C1403Nh) interfaceC2178sk).m3123a()) {
                            return;
                        }
                        this.f6156a.m3905c();
                        return;
                    } catch (RemoteException unused) {
                    }
                }
                r12++;
                if (!mo3795c() || C1536T1.f5453f.get()) {
                    return;
                }
            } while (r12 < 3);
        } catch (Throwable th) {
            mo3792a(th);
        }
    }
}
