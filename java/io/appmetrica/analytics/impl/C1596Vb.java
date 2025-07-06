package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.Vb */
/* loaded from: classes.dex */
public final class C1596Vb implements InterfaceC1090B4 {
    @Override // io.appmetrica.analytics.impl.InterfaceC1090B4
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C1415O4 mo2746a(Context context, C2163s5 c2163s5, C2062o4 c2062o4, C1290J4 c1290j4) {
        C1489R4 c1489r4;
        C1440P4 c1440p4 = new C1440P4(c2062o4.f6838b);
        C1514S4 c1514s4 = new C1514S4();
        synchronized (c2163s5) {
            c1489r4 = (C1489R4) c2163s5.m4411a(c1440p4, c1290j4, c1514s4, c2163s5.f7113b);
        }
        return new C1415O4(context, c1489r4, c1290j4);
    }
}
