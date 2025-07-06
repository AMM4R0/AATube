package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceAmount;
import io.appmetrica.analytics.ecommerce.ECommercePrice;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.Ze */
/* loaded from: classes.dex */
public final class C1698Ze {

    /* renamed from: a */
    public final C1634X f5805a;

    /* renamed from: b */
    public final List f5806b;

    public C1698Ze(ECommercePrice eCommercePrice) {
        this(new C1634X(eCommercePrice.getFiat()), m3575a(eCommercePrice.getInternalComponents()));
    }

    /* renamed from: a */
    public static LinkedList m3575a(List list) {
        if (list == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ECommerceAmount eCommerceAmount = (ECommerceAmount) it.next();
            linkedList.add(new C1634X(eCommerceAmount.getAmount(), eCommerceAmount.getUnit()));
        }
        return linkedList;
    }

    public final String toString() {
        return "PriceWrapper{fiat=" + this.f5805a + ", internalComponents=" + this.f5806b + '}';
    }

    public C1698Ze(C1634X c1634x, LinkedList linkedList) {
        this.f5805a = c1634x;
        this.f5806b = linkedList;
    }
}
