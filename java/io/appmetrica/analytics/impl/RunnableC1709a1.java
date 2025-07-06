package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.a1 */
/* loaded from: classes.dex */
public final class RunnableC1709a1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f5818a;

    /* renamed from: b */
    public final /* synthetic */ String f5819b;

    /* renamed from: c */
    public final /* synthetic */ C2009m1 f5820c;

    public RunnableC1709a1(C2009m1 c2009m1, String str, String str2) {
        this.f5820c = c2009m1;
        this.f5818a = str;
        this.f5819b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2133r0 c2133r0 = this.f5820c.f6673a;
        String str = this.f5818a;
        String str2 = this.f5819b;
        c2133r0.getClass();
        C2108q0.m4319c().putAppEnvironmentValue(str, str2);
    }
}
