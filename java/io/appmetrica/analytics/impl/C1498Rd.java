package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceCartItem;
import io.appmetrica.analytics.ecommerce.ECommerceOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: io.appmetrica.analytics.impl.Rd */
/* loaded from: classes.dex */
public final class C1498Rd {

    /* renamed from: a */
    public final String f5321a;

    /* renamed from: b */
    public final String f5322b;

    /* renamed from: c */
    public final List f5323c;

    /* renamed from: d */
    public final Map f5324d;

    public C1498Rd(ECommerceOrder eCommerceOrder) {
        this(UUID.randomUUID().toString(), eCommerceOrder.getIdentifier(), m3257a(eCommerceOrder.getCartItems()), CollectionUtils.mapCopyOfNullableMap(eCommerceOrder.getPayload()));
    }

    /* renamed from: a */
    public static ArrayList m3257a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C1339L3((ECommerceCartItem) it.next()));
        }
        return arrayList;
    }

    public final String toString() {
        return "OrderWrapper{uuid='" + this.f5321a + "', identifier='" + this.f5322b + "', cartItems=" + this.f5323c + ", payload=" + this.f5324d + '}';
    }

    public C1498Rd(String str, String str2, ArrayList arrayList, Map map) {
        this.f5321a = str;
        this.f5322b = str2;
        this.f5323c = arrayList;
        this.f5324d = map;
    }
}
