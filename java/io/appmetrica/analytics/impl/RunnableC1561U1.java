package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.U1 */
/* loaded from: classes.dex */
public final class RunnableC1561U1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC1124Cd f5513a;

    /* renamed from: b */
    public final /* synthetic */ C1118C7 f5514b;

    public RunnableC1561U1(C1611W1 c1611w1, C1118C7 c1118c7) {
        this.f5513a = c1611w1;
        this.f5514b = c1118c7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5513a.consume(this.f5514b);
    }
}
