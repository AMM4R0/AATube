package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.profile.UserProfile;

/* renamed from: io.appmetrica.analytics.impl.Zi */
/* loaded from: classes.dex */
public final class C1702Zi implements InterfaceC1446Pa {

    /* renamed from: a */
    public final /* synthetic */ UserProfile f5812a;

    public C1702Zi(UserProfile userProfile) {
        this.f5812a = userProfile;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1446Pa
    /* renamed from: a */
    public final void mo3202a(InterfaceC1471Qa interfaceC1471Qa) {
        interfaceC1471Qa.reportUserProfile(this.f5812a);
    }
}
