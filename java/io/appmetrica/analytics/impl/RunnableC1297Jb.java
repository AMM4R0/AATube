package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;

/* renamed from: io.appmetrica.analytics.impl.Jb */
/* loaded from: classes.dex */
public final class RunnableC1297Jb implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1322Kb f4914a;

    /* renamed from: b */
    public final /* synthetic */ LocationControllerObserver f4915b;

    /* renamed from: c */
    public final /* synthetic */ boolean f4916c;

    public RunnableC1297Jb(C1322Kb c1322Kb, LocationControllerObserver locationControllerObserver, boolean z2) {
        this.f4914a = c1322Kb;
        this.f4915b = locationControllerObserver;
        this.f4916c = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4914a.f4953a.add(this.f4915b);
        if (this.f4916c) {
            if (this.f4914a.f4956d) {
                this.f4915b.startLocationTracking();
            } else {
                this.f4915b.stopLocationTracking();
            }
        }
    }
}
