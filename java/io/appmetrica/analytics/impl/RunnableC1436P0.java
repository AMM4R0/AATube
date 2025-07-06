package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.profile.UserProfile;

/* renamed from: io.appmetrica.analytics.impl.P0 */
/* loaded from: classes.dex */
public final class RunnableC1436P0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ UserProfile f5195a;

    /* renamed from: b */
    public final /* synthetic */ C2009m1 f5196b;

    public RunnableC1436P0(C2009m1 c2009m1, UserProfile userProfile) {
        this.f5196b = c2009m1;
        this.f5195a = userProfile;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2009m1.m4119a(this.f5196b).reportUserProfile(this.f5195a);
    }
}
