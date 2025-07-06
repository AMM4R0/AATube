package io.appmetrica.analytics.impl;

import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.impl.W4 */
/* loaded from: classes.dex */
public final class C1614W4 extends AbstractC1798df {

    /* renamed from: a */
    public final C1589V4 f5620a;

    public C1614W4(C1489R4 c1489r4) {
        this.f5620a = new C1589V4(c1489r4);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC1798df
    /* renamed from: a */
    public final AbstractC1643X8 mo3455a(int r3) {
        ArrayList arrayList = new ArrayList();
        int ordinal = EnumC1670Ya.m3538a(r3).ordinal();
        if (ordinal == 12) {
            arrayList.add(this.f5620a.f5560a);
        } else if (ordinal == 14) {
            arrayList.add(this.f5620a.f5561b);
        } else if (ordinal == 34) {
            arrayList.add(this.f5620a.f5562c);
        }
        return new C1618W8(arrayList);
    }
}
