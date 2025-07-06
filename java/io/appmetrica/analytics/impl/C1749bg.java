package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceReferrer;

/* renamed from: io.appmetrica.analytics.impl.bg */
/* loaded from: classes.dex */
public final class C1749bg {

    /* renamed from: a */
    public final String f5923a;

    /* renamed from: b */
    public final String f5924b;

    /* renamed from: c */
    public final C1204Fi f5925c;

    public C1749bg(ECommerceReferrer eCommerceReferrer) {
        this(eCommerceReferrer.getType(), eCommerceReferrer.getIdentifier(), eCommerceReferrer.getScreen() == null ? null : new C1204Fi(eCommerceReferrer.getScreen()));
    }

    public final String toString() {
        return "ReferrerWrapper{type='" + this.f5923a + "', identifier='" + this.f5924b + "', screen=" + this.f5925c + '}';
    }

    public C1749bg(String str, String str2, C1204Fi c1204Fi) {
        this.f5923a = str;
        this.f5924b = str2;
        this.f5925c = c1204Fi;
    }
}
