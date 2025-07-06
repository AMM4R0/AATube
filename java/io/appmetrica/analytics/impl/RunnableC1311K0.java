package io.appmetrica.analytics.impl;

import android.location.Location;

/* renamed from: io.appmetrica.analytics.impl.K0 */
/* loaded from: classes.dex */
public final class RunnableC1311K0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Location f4935a;

    /* renamed from: b */
    public final /* synthetic */ C2009m1 f4936b;

    public RunnableC1311K0(C2009m1 c2009m1, Location location) {
        this.f4936b = c2009m1;
        this.f4935a = location;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2133r0 c2133r0 = this.f4936b.f6673a;
        Location location = this.f4935a;
        c2133r0.getClass();
        C2108q0.m4319c().mo2751a(location);
    }
}
