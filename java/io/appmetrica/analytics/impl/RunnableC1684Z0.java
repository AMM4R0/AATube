package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.Z0 */
/* loaded from: classes.dex */
public final class RunnableC1684Z0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C2009m1 f5780a;

    public RunnableC1684Z0(C2009m1 c2009m1) {
        this.f5780a = c2009m1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2009m1.m4119a(this.f5780a).sendEventsBuffer();
    }
}
