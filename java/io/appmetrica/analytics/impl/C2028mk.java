package io.appmetrica.analytics.impl;

import android.app.Activity;

/* renamed from: io.appmetrica.analytics.impl.mk */
/* loaded from: classes.dex */
public final class C2028mk implements InterfaceC1124Cd {

    /* renamed from: a */
    public final /* synthetic */ Activity f6779a;

    /* renamed from: b */
    public final /* synthetic */ C2053nk f6780b;

    public C2028mk(C2053nk c2053nk, Activity activity) {
        this.f6780b = c2053nk;
        this.f6779a = activity;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1124Cd
    public final void consume(Object obj) {
        C1795dc c1795dc = (C1795dc) obj;
        C2128qk c2128qk = this.f6780b.f6827a;
        Activity activity = this.f6779a;
        if (c2128qk.f7006e.m4406a(activity, EnumC2132r.RESUMED)) {
            c1795dc.mo2927a(activity);
        }
    }
}
