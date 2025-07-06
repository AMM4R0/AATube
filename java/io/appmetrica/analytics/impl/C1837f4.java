package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.toggle.SimpleThreadSafeToggle;

/* renamed from: io.appmetrica.analytics.impl.f4 */
/* loaded from: classes.dex */
public final class C1837f4 extends SimpleThreadSafeToggle {

    /* renamed from: a */
    public final C1075Ae f6191a;

    public C1837f4(C1075Ae c1075Ae) {
        super(c1075Ae.m2725e(), "[ClientApiTrackingStatusToggle]");
        this.f6191a = c1075Ae;
    }

    /* renamed from: a */
    public final void m3804a(boolean z2) {
        updateState(z2);
        this.f6191a.m2724d(z2);
    }
}
