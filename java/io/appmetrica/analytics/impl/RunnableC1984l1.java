package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.l1 */
/* loaded from: classes.dex */
public final class RunnableC1984l1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f6611a;

    /* renamed from: b */
    public final /* synthetic */ Throwable f6612b;

    /* renamed from: c */
    public final /* synthetic */ C2009m1 f6613c;

    public RunnableC1984l1(C2009m1 c2009m1, String str, Throwable th) {
        this.f6613c = c2009m1;
        this.f6611a = str;
        this.f6612b = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2009m1.m4119a(this.f6613c).reportError(this.f6611a, this.f6612b);
    }
}
