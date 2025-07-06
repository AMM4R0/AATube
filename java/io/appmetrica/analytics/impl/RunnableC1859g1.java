package io.appmetrica.analytics.impl;

import android.app.Activity;

/* renamed from: io.appmetrica.analytics.impl.g1 */
/* loaded from: classes.dex */
public final class RunnableC1859g1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Activity f6288a;

    /* renamed from: b */
    public final /* synthetic */ C2009m1 f6289b;

    public RunnableC1859g1(C2009m1 c2009m1, Activity activity) {
        this.f6289b = c2009m1;
        this.f6288a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2009m1 c2009m1 = this.f6289b;
        C2128qk c2128qk = c2009m1.f6681i;
        Activity activity = this.f6288a;
        InterfaceC1246Ha interfaceC1246Ha = c2009m1.m4151c().f6146a;
        if (activity != null) {
            c2128qk.f7007f.m4117a(activity);
        }
        if (c2128qk.f7006e.m4406a(activity, EnumC2132r.PAUSED)) {
            interfaceC1246Ha.mo2933b(activity);
        }
    }
}
