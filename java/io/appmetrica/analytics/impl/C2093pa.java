package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.pa */
/* loaded from: classes.dex */
public class C2093pa extends AbstractC1537T2 {

    /* renamed from: b */
    public final InterfaceC2168sa f6904b;

    public C2093pa(int r2) {
        this(r2, null);
    }

    /* renamed from: b */
    public int mo3550b(Object obj) {
        return 0;
    }

    public C2093pa(int r12, InterfaceC2168sa interfaceC2168sa) {
        super(r12);
        this.f6904b = interfaceC2168sa;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC1537T2, io.appmetrica.analytics.impl.InterfaceC2168sa
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1731an mo3342a(List<Object> list) {
        int r2;
        int r02 = 0;
        if (list == null || (list.size() <= this.f5459a && this.f6904b == null)) {
            r2 = 0;
        } else {
            ArrayList arrayList = new ArrayList();
            r2 = 0;
            int r3 = 0;
            for (Object obj : list) {
                if (r3 < this.f5459a) {
                    InterfaceC2168sa interfaceC2168sa = this.f6904b;
                    if (interfaceC2168sa != null) {
                        C1731an mo3342a = interfaceC2168sa.mo3342a(obj);
                        Object obj2 = mo3342a.f5895a;
                        r2 += mo3342a.f5896b.getBytesTruncated();
                        obj = obj2;
                    }
                    arrayList.add(obj);
                } else {
                    r02++;
                    r2 += mo3550b(obj);
                }
                r3++;
            }
            list = arrayList;
        }
        return new C1731an(list, new C1240H4(r02, r2));
    }

    /* renamed from: b */
    public final InterfaceC2168sa m4286b() {
        return this.f6904b;
    }
}
