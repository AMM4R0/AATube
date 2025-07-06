package io.appmetrica.analytics.ecommerce;

import java.util.List;

/* loaded from: classes.dex */
public class ECommercePrice {

    /* renamed from: a */
    private final ECommerceAmount f4391a;

    /* renamed from: b */
    private List f4392b;

    public ECommercePrice(ECommerceAmount eCommerceAmount) {
        this.f4391a = eCommerceAmount;
    }

    public ECommerceAmount getFiat() {
        return this.f4391a;
    }

    public List<ECommerceAmount> getInternalComponents() {
        return this.f4392b;
    }

    public ECommercePrice setInternalComponents(List<ECommerceAmount> list) {
        this.f4392b = list;
        return this;
    }

    public String toString() {
        return "ECommercePrice{fiat=" + this.f4391a + ", internalComponents=" + this.f4392b + '}';
    }
}
