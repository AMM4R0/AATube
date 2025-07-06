package io.appmetrica.analytics.impl;

import android.app.Activity;

/* renamed from: io.appmetrica.analytics.impl.f1 */
/* loaded from: classes.dex */
public final class RunnableC1834f1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Activity f6182a;

    /* renamed from: b */
    public final /* synthetic */ C2009m1 f6183b;

    public RunnableC1834f1(C2009m1 c2009m1, Activity activity) {
        this.f6183b = c2009m1;
        this.f6182a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2009m1 c2009m1 = this.f6183b;
        C2128qk c2128qk = c2009m1.f6681i;
        Activity activity = this.f6182a;
        InterfaceC1246Ha interfaceC1246Ha = c2009m1.m4151c().f6146a;
        if (activity != null) {
            c2128qk.f7007f.m4117a(activity);
        }
        if (c2128qk.f7006e.m4406a(activity, EnumC2132r.RESUMED)) {
            interfaceC1246Ha.mo2927a(activity);
        }
    }
}
