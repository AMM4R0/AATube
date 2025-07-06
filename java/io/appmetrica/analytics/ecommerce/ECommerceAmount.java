package io.appmetrica.analytics.ecommerce;

import io.appmetrica.analytics.impl.AbstractC2356zn;
import java.math.BigDecimal;
import p000A.AbstractC0002c;

/* loaded from: classes.dex */
public class ECommerceAmount {

    /* renamed from: a */
    private final BigDecimal f4382a;

    /* renamed from: b */
    private final String f4383b;

    public ECommerceAmount(long j2, String str) {
        this(AbstractC2356zn.m4697a(j2), str);
    }

    public BigDecimal getAmount() {
        return this.f4382a;
    }

    public String getUnit() {
        return this.f4383b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ECommerceAmount{amount=");
        sb.append(this.f4382a);
        sb.append(", unit='");
        return AbstractC0002c.m17l(sb, this.f4383b, "'}");
    }

    public ECommerceAmount(double d2, String str) {
        this(new BigDecimal(AbstractC2356zn.m4695a(d2)), str);
    }

    public ECommerceAmount(BigDecimal bigDecimal, String str) {
        this.f4382a = bigDecimal;
        this.f4383b = str;
    }
}
