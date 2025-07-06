package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.X0 */
/* loaded from: classes.dex */
public final class RunnableC1635X0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f5678a;

    /* renamed from: b */
    public final /* synthetic */ String f5679b;

    /* renamed from: c */
    public final /* synthetic */ C2009m1 f5680c;

    public RunnableC1635X0(C2009m1 c2009m1, String str, String str2) {
        this.f5680c = c2009m1;
        this.f5678a = str;
        this.f5679b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2009m1.m4119a(this.f5680c).mo2797b(this.f5678a, this.f5679b);
    }
}
