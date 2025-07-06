package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.Ni */
/* loaded from: classes.dex */
public abstract class AbstractC1404Ni implements InterfaceC1090B4 {
    @Override // io.appmetrica.analytics.impl.InterfaceC1090B4
    /* renamed from: a */
    public abstract /* synthetic */ InterfaceC1065A4 mo2746a(Context context, C2163s5 c2163s5, C2062o4 c2062o4, C1290J4 c1290j4);

    /* renamed from: a */
    public final InterfaceC1065A4 m3124a(C1838f5 c1838f5, C2163s5 c2163s5) {
        C1849fg c1849fg;
        synchronized (c2163s5) {
            c1849fg = (C1849fg) c2163s5.f7112a.get(c1838f5.toString());
        }
        return new C1379Mi(c1849fg);
    }
}
