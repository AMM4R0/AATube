package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.j1 */
/* loaded from: classes.dex */
public final class RunnableC1934j1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f6510a;

    /* renamed from: b */
    public final /* synthetic */ String f6511b;

    /* renamed from: c */
    public final /* synthetic */ C2009m1 f6512c;

    public RunnableC1934j1(C2009m1 c2009m1, String str, String str2) {
        this.f6512c = c2009m1;
        this.f6510a = str;
        this.f6511b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2009m1.m4119a(this.f6512c).reportEvent(this.f6510a, this.f6511b);
    }
}
