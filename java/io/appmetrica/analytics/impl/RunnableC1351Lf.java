package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.Lf */
/* loaded from: classes.dex */
public final class RunnableC1351Lf implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC1625Wf f5002a;

    /* renamed from: b */
    public final /* synthetic */ Throwable f5003b;

    public RunnableC1351Lf(InterfaceC1625Wf interfaceC1625Wf, Throwable th) {
        this.f5002a = interfaceC1625Wf;
        this.f5003b = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5002a.mo2861a(this.f5003b);
    }
}
