package io.appmetrica.analytics.ecommerce;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class ECommerceOrder {

    /* renamed from: a */
    private final String f4388a;

    /* renamed from: b */
    private final List f4389b;

    /* renamed from: c */
    private Map f4390c;

    public ECommerceOrder(String str, List<ECommerceCartItem> list) {
        this.f4388a = str;
        this.f4389b = list;
    }

    public List<ECommerceCartItem> getCartItems() {
        return this.f4389b;
    }

    public String getIdentifier() {
        return this.f4388a;
    }

    public Map<String, String> getPayload() {
        return this.f4390c;
    }

    public ECommerceOrder setPayload(Map<String, String> map) {
        this.f4390c = map;
        return this;
    }

    public String toString() {
        return "ECommerceOrder{identifier='" + this.f4388a + "', cartItems=" + this.f4389b + ", payload=" + this.f4390c + '}';
    }
}
