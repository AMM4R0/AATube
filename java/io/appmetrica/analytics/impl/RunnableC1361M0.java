package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.M0 */
/* loaded from: classes.dex */
public final class RunnableC1361M0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ boolean f5019a;

    /* renamed from: b */
    public final /* synthetic */ C2009m1 f5020b;

    public RunnableC1361M0(C2009m1 c2009m1, boolean z2) {
        this.f5020b = c2009m1;
        this.f5019a = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2133r0 c2133r0 = this.f5020b.f6673a;
        boolean z2 = this.f5019a;
        c2133r0.getClass();
        C2108q0.m4319c().setDataSendingEnabled(z2);
    }
}
