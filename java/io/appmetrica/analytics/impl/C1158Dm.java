package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.Dm */
/* loaded from: classes.dex */
public class C1158Dm implements InterfaceC1305Jj {

    /* renamed from: a */
    public final InterfaceC1146Da f4677a;

    /* renamed from: b */
    public final Object f4678b = new Object();

    /* renamed from: c */
    public boolean f4679c = false;

    /* renamed from: d */
    public final InterfaceC1804dl f4680d;

    public C1158Dm(InterfaceC1146Da interfaceC1146Da, InterfaceC1804dl interfaceC1804dl) {
        this.f4677a = interfaceC1146Da;
        this.f4680d = interfaceC1804dl;
    }

    /* renamed from: a */
    public void mo2840a() {
    }

    /* renamed from: b */
    public final void m2841b() {
        synchronized (this.f4678b) {
            try {
                if (!this.f4679c) {
                    m2844e();
                    mo2840a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: c */
    public final InterfaceC1146Da m2842c() {
        return this.f4677a;
    }

    /* renamed from: d */
    public final InterfaceC1804dl m2843d() {
        return this.f4680d;
    }

    /* renamed from: e */
    public final void m2844e() {
        synchronized (this.f4678b) {
            try {
                if (!this.f4679c) {
                    mo2845f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: f */
    public void mo2845f() {
        this.f4680d.mo3767a();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1305Jj
    public final void onCreate() {
        synchronized (this.f4678b) {
            try {
                if (this.f4679c) {
                    this.f4679c = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1305Jj
    public final void onDestroy() {
        synchronized (this.f4678b) {
            try {
                if (!this.f4679c) {
                    mo2840a();
                    this.f4679c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
