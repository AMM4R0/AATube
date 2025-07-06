package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.profile.UserProfile;

/* renamed from: io.appmetrica.analytics.impl.sh */
/* loaded from: classes.dex */
public final class RunnableC2175sh implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ UserProfile f7128a;

    /* renamed from: b */
    public final /* synthetic */ C1353Lh f7129b;

    public RunnableC2175sh(C1353Lh c1353Lh, UserProfile userProfile) {
        this.f7129b = c1353Lh;
        this.f7128a = userProfile;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1353Lh c1353Lh = this.f7129b;
        C1353Lh.m3053a(c1353Lh.f5004a, c1353Lh.f5007d, c1353Lh.f5008e).reportUserProfile(this.f7128a);
    }
}
