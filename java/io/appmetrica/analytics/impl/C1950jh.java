package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.jh */
/* loaded from: classes.dex */
public class C1950jh implements InterfaceC1090B4, InterfaceC2038n5 {
    @Override // io.appmetrica.analytics.impl.InterfaceC2038n5
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2013m5 mo3881a(Context context, C1838f5 c1838f5, C1265I4 r11, C1606Vl c1606Vl) {
        return new C1975kh(context, c1838f5, r11, C2018ma.f6725C.m4200f(), c1606Vl.m3442e(), new C1949jg(c1606Vl));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1090B4
    /* renamed from: a */
    public final InterfaceC1065A4 mo2746a(Context context, C2163s5 c2163s5, C2062o4 c2062o4, C1290J4 c1290j4) {
        C1849fg c1849fg;
        C1838f5 c1838f5 = new C1838f5(c2062o4.f6838b, c2062o4.f6837a);
        C1874gg c1874gg = new C1874gg(this);
        synchronized (c2163s5) {
            c1849fg = (C1849fg) c2163s5.m4411a(c1838f5, c1290j4, c1874gg, c2163s5.f7112a);
        }
        return new C1824eg(context, c1849fg);
    }
}
