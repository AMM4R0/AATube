package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import p108m1.AbstractC2659i;
import p108m1.AbstractC2661k;

/* renamed from: io.appmetrica.analytics.impl.Fc */
/* loaded from: classes.dex */
public final class C1198Fc {

    /* renamed from: a */
    public final LinkedHashSet f4733a = new LinkedHashSet();

    /* renamed from: a */
    public final synchronized Set m2874a() {
        ArrayList arrayList;
        try {
            LinkedHashSet linkedHashSet = this.f4733a;
            ArrayList arrayList2 = new ArrayList(AbstractC2661k.m5122Z(linkedHashSet));
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                arrayList2.add(((InterfaceC1173Ec) it.next()).mo2855a());
            }
            arrayList = new ArrayList();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (((String) next).length() > 0) {
                    arrayList.add(next);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return AbstractC2659i.m5119i0(arrayList);
    }
}
