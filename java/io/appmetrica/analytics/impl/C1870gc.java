package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.gc */
/* loaded from: classes.dex */
public final class C1870gc implements InterfaceC1090B4, InterfaceC2038n5 {
    @Override // io.appmetrica.analytics.impl.InterfaceC1090B4
    /* renamed from: a */
    public final InterfaceC1065A4 mo2746a(Context context, C2163s5 c2163s5, C2062o4 c2062o4, C1290J4 c1290j4) {
        C1849fg c1849fg;
        C1920ic c1920ic = new C1920ic(c2062o4.f6838b, c2062o4.f6837a);
        C1874gg c1874gg = new C1874gg(this);
        synchronized (c2163s5) {
            c1849fg = (C1849fg) c2163s5.m4411a(c1920ic, c1290j4, c1874gg, c2163s5.f7112a);
        }
        return new C1895hc(context, c1849fg);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2038n5
    /* renamed from: a */
    public final InterfaceC1421Oa mo3881a(Context context, C1838f5 c1838f5, C1265I4 r12, C1606Vl c1606Vl) {
        return new C1970kc(context, c1606Vl.m3442e(), c1838f5, r12, C2018ma.f6725C.m4211r(), C2018ma.f6725C.m4200f(), new C1949jg(c1606Vl));
    }
}
