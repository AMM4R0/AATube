package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.i1 */
/* loaded from: classes.dex */
public final class RunnableC1909i1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f6453a;

    /* renamed from: b */
    public final /* synthetic */ C2009m1 f6454b;

    public RunnableC1909i1(C2009m1 c2009m1, String str) {
        this.f6454b = c2009m1;
        this.f6453a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2009m1.m4119a(this.f6454b).reportEvent(this.f6453a);
    }
}
