package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.g */
/* loaded from: classes.dex */
public abstract class AbstractC1857g implements InterfaceC1065A4 {

    /* renamed from: a */
    public final Context f6285a;

    /* renamed from: b */
    public final C1849fg f6286b;

    public AbstractC1857g(Context context, C1849fg c1849fg) {
        this.f6285a = context.getApplicationContext();
        this.f6286b = c1849fg;
        c1849fg.m3828a(this);
        C2018ma.m4192h().m4204k().mo2766b(this);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1065A4
    /* renamed from: a */
    public final void mo2692a(C1615W5 c1615w5, C1290J4 c1290j4) {
        mo3790b(c1615w5, c1290j4);
    }

    /* renamed from: b */
    public final C1849fg m3842b() {
        return this.f6286b;
    }

    /* renamed from: b */
    public abstract void mo3790b(C1615W5 c1615w5, C1290J4 c1290j4);

    /* renamed from: c */
    public final Context m3843c() {
        return this.f6285a;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1065A4
    /* renamed from: a */
    public final void mo2691a() {
        this.f6286b.m3831b(this);
        C2018ma.f6725C.m4203j().mo2764a(this);
    }
}
