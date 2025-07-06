package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.E0 */
/* loaded from: classes.dex */
public final class RunnableC1161E0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f4681a;

    /* renamed from: b */
    public final /* synthetic */ String f4682b;

    /* renamed from: c */
    public final /* synthetic */ Throwable f4683c;

    /* renamed from: d */
    public final /* synthetic */ C2009m1 f4684d;

    public RunnableC1161E0(C2009m1 c2009m1, String str, String str2, Throwable th) {
        this.f4684d = c2009m1;
        this.f4681a = str;
        this.f4682b = str2;
        this.f4683c = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2009m1.m4119a(this.f4684d).reportError(this.f4681a, this.f4682b, this.f4683c);
    }
}
