package io.appmetrica.analytics.impl;

import java.util.LinkedList;

/* renamed from: io.appmetrica.analytics.impl.m9 */
/* loaded from: classes.dex */
public final class C2017m9 extends AbstractC1798df {

    /* renamed from: a */
    public final C1551Tg f6722a;

    /* renamed from: b */
    public final C1601Vg f6723b;

    /* renamed from: c */
    public final C1252Hg f6724c;

    public C2017m9(C2013m5 c2013m5) {
        this.f6722a = new C1551Tg(c2013m5);
        this.f6723b = new C1601Vg(c2013m5);
        this.f6724c = new C1252Hg(c2013m5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC1798df
    /* renamed from: a */
    public final AbstractC1643X8 mo3455a(int r3) {
        LinkedList linkedList = new LinkedList();
        int ordinal = EnumC1670Ya.m3538a(r3).ordinal();
        if (ordinal == 1) {
            linkedList.add(this.f6722a);
        } else if (ordinal == 3) {
            linkedList.add(this.f6724c);
        } else if (ordinal == 27) {
            linkedList.add(this.f6723b);
            linkedList.add(this.f6722a);
        }
        return new C1618W8(linkedList);
    }
}
