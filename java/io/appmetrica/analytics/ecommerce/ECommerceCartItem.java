package io.appmetrica.analytics.ecommerce;

import io.appmetrica.analytics.impl.AbstractC2356zn;
import java.math.BigDecimal;

/* loaded from: classes.dex */
public class ECommerceCartItem {

    /* renamed from: a */
    private final ECommerceProduct f4384a;

    /* renamed from: b */
    private final BigDecimal f4385b;

    /* renamed from: c */
    private final ECommercePrice f4386c;

    /* renamed from: d */
    private ECommerceReferrer f4387d;

    public ECommerceCartItem(ECommerceProduct eCommerceProduct, ECommercePrice eCommercePrice, long j2) {
        this(eCommerceProduct, eCommercePrice, AbstractC2356zn.m4697a(j2));
    }

    public ECommerceProduct getProduct() {
        return this.f4384a;
    }

    public BigDecimal getQuantity() {
        return this.f4385b;
    }

    public ECommerceReferrer getReferrer() {
        return this.f4387d;
    }

    public ECommercePrice getRevenue() {
        return this.f4386c;
    }

    public ECommerceCartItem setReferrer(ECommerceReferrer eCommerceReferrer) {
        this.f4387d = eCommerceReferrer;
        return this;
    }

    public String toString() {
        return "ECommerceCartItem{product=" + this.f4384a + ", quantity=" + this.f4385b + ", revenue=" + this.f4386c + ", referrer=" + this.f4387d + '}';
    }

    public ECommerceCartItem(ECommerceProduct eCommerceProduct, ECommercePrice eCommercePrice, double d2) {
        this(eCommerceProduct, eCommercePrice, new BigDecimal(AbstractC2356zn.m4695a(d2)));
    }

    public ECommerceCartItem(ECommerceProduct eCommerceProduct, ECommercePrice eCommercePrice, BigDecimal bigDecimal) {
        this.f4384a = eCommerceProduct;
        this.f4385b = bigDecimal;
        this.f4386c = eCommercePrice;
    }
}
