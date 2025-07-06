package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.F0 */
/* loaded from: classes.dex */
public final class RunnableC1186F0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Throwable f4718a;

    /* renamed from: b */
    public final /* synthetic */ C2009m1 f4719b;

    public RunnableC1186F0(C2009m1 c2009m1, Throwable th) {
        this.f4719b = c2009m1;
        this.f4718a = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2009m1.m4119a(this.f4719b).reportUnhandledException(this.f4718a);
    }
}
