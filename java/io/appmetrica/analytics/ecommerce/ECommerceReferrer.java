package io.appmetrica.analytics.ecommerce;

/* loaded from: classes.dex */
public class ECommerceReferrer {

    /* renamed from: a */
    private String f4400a;

    /* renamed from: b */
    private String f4401b;

    /* renamed from: c */
    private ECommerceScreen f4402c;

    public String getIdentifier() {
        return this.f4401b;
    }

    public ECommerceScreen getScreen() {
        return this.f4402c;
    }

    public String getType() {
        return this.f4400a;
    }

    public ECommerceReferrer setIdentifier(String str) {
        this.f4401b = str;
        return this;
    }

    public ECommerceReferrer setScreen(ECommerceScreen eCommerceScreen) {
        this.f4402c = eCommerceScreen;
        return this;
    }

    public ECommerceReferrer setType(String str) {
        this.f4400a = str;
        return this;
    }

    public String toString() {
        return "ECommerceReferrer{type='" + this.f4400a + "', identifier='" + this.f4401b + "', screen=" + this.f4402c + '}';
    }
}
