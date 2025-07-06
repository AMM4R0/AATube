package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AnrListener;

/* renamed from: io.appmetrica.analytics.impl.d1 */
/* loaded from: classes.dex */
public final class RunnableC1784d1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AnrListener f6063a;

    /* renamed from: b */
    public final /* synthetic */ C2009m1 f6064b;

    public RunnableC1784d1(C2009m1 c2009m1, AnrListener anrListener) {
        this.f6064b = c2009m1;
        this.f6063a = anrListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2009m1.m4119a(this.f6064b).mo2928a(this.f6063a);
    }
}
