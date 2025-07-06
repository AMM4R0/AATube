package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceAmount;
import java.math.BigDecimal;
import p000A.AbstractC0002c;

/* renamed from: io.appmetrica.analytics.impl.X */
/* loaded from: classes.dex */
public final class C1634X {

    /* renamed from: a */
    public final BigDecimal f5676a;

    /* renamed from: b */
    public final String f5677b;

    public C1634X(ECommerceAmount eCommerceAmount) {
        this(eCommerceAmount.getAmount(), eCommerceAmount.getUnit());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AmountWrapper{amount=");
        sb.append(this.f5676a);
        sb.append(", unit='");
        return AbstractC0002c.m17l(sb, this.f5677b, "'}");
    }

    public C1634X(BigDecimal bigDecimal, String str) {
        this.f5676a = bigDecimal;
        this.f5677b = str;
    }
}
