package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.N0 */
/* loaded from: classes.dex */
public final class RunnableC1386N0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f5099a;

    /* renamed from: b */
    public final /* synthetic */ C2009m1 f5100b;

    public RunnableC1386N0(C2009m1 c2009m1, String str) {
        this.f5100b = c2009m1;
        this.f5099a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2133r0 c2133r0 = this.f5100b.f6673a;
        String str = this.f5099a;
        c2133r0.getClass();
        C2108q0.m4319c().setUserProfileID(str);
    }
}
