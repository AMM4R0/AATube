package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceCartItem;
import java.math.BigDecimal;

/* renamed from: io.appmetrica.analytics.impl.L3 */
/* loaded from: classes.dex */
public final class C1339L3 {

    /* renamed from: a */
    public final C1898hf f4988a;

    /* renamed from: b */
    public final BigDecimal f4989b;

    /* renamed from: c */
    public final C1698Ze f4990c;

    /* renamed from: d */
    public final C1749bg f4991d;

    public C1339L3(ECommerceCartItem eCommerceCartItem) {
        this(new C1898hf(eCommerceCartItem.getProduct()), eCommerceCartItem.getQuantity(), new C1698Ze(eCommerceCartItem.getRevenue()), eCommerceCartItem.getReferrer() == null ? null : new C1749bg(eCommerceCartItem.getReferrer()));
    }

    public final String toString() {
        return "CartItemWrapper{product=" + this.f4988a + ", quantity=" + this.f4989b + ", revenue=" + this.f4990c + ", referrer=" + this.f4991d + '}';
    }

    public C1339L3(C1898hf c1898hf, BigDecimal bigDecimal, C1698Ze c1698Ze, C1749bg c1749bg) {
        this.f4988a = c1898hf;
        this.f4989b = bigDecimal;
        this.f4990c = c1698Ze;
        this.f4991d = c1749bg;
    }
}
