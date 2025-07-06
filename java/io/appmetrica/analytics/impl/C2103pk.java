package io.appmetrica.analytics.impl;

import android.app.Activity;

/* renamed from: io.appmetrica.analytics.impl.pk */
/* loaded from: classes.dex */
public final class C2103pk implements InterfaceC2057o {

    /* renamed from: a */
    public final /* synthetic */ C2128qk f6935a;

    public C2103pk(C2128qk c2128qk) {
        this.f6935a = c2128qk;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2057o
    /* renamed from: a */
    public final void mo3040a(Activity activity, EnumC2032n enumC2032n) {
        C2238v5 c2238v5 = this.f6935a.f7003b;
        c2238v5.f7258b.execute(new RunnableC2213u5(c2238v5, new C2078ok(this, activity)));
    }
}
