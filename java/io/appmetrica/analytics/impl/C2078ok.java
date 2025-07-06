package io.appmetrica.analytics.impl;

import android.app.Activity;

/* renamed from: io.appmetrica.analytics.impl.ok */
/* loaded from: classes.dex */
public final class C2078ok implements InterfaceC1124Cd {

    /* renamed from: a */
    public final /* synthetic */ Activity f6873a;

    /* renamed from: b */
    public final /* synthetic */ C2103pk f6874b;

    public C2078ok(C2103pk c2103pk, Activity activity) {
        this.f6874b = c2103pk;
        this.f6873a = activity;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1124Cd
    public final void consume(Object obj) {
        C1795dc c1795dc = (C1795dc) obj;
        C2128qk c2128qk = this.f6874b.f6935a;
        Activity activity = this.f6873a;
        if (c2128qk.f7006e.m4406a(activity, EnumC2132r.PAUSED)) {
            c1795dc.mo2933b(activity);
        }
    }
}
