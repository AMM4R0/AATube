package io.appmetrica.analytics.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p108m1.AbstractC2659i;

/* renamed from: io.appmetrica.analytics.impl.Ce */
/* loaded from: classes.dex */
public final class C1125Ce implements InterfaceC2106pn {

    /* renamed from: a */
    public final boolean f4579a;

    public C1125Ce(C1175Ee c1175Ee) {
        boolean z2;
        List<C1150De> list = c1175Ee.f4697b;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((C1150De) it.next()).f4642c == EnumC1517S7.f5405c) {
                    z2 = false;
                    break;
                }
            }
        }
        z2 = true;
        this.f4579a = z2;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2106pn, p131u1.InterfaceC2814p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<C1150De> invoke(List<? extends C1150De> list, C1499Re c1499Re) {
        C1150De c1150De = new C1150De(c1499Re.f5325a, c1499Re.f5326b, c1499Re.f5329e);
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((C1150De) it.next()).f4642c == c1499Re.f5329e) {
                    if (c1150De.f4642c == EnumC1517S7.f5405c && this.f4579a) {
                        return AbstractC2659i.m5116f0(list, c1150De);
                    }
                    return null;
                }
            }
        }
        return AbstractC2659i.m5116f0(list, c1150De);
    }
}
