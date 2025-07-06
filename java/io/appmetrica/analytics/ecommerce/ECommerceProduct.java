package io.appmetrica.analytics.ecommerce;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class ECommerceProduct {

    /* renamed from: a */
    private final String f4393a;

    /* renamed from: b */
    private String f4394b;

    /* renamed from: c */
    private List f4395c;

    /* renamed from: d */
    private Map f4396d;

    /* renamed from: e */
    private ECommercePrice f4397e;

    /* renamed from: f */
    private ECommercePrice f4398f;

    /* renamed from: g */
    private List f4399g;

    public ECommerceProduct(String str) {
        this.f4393a = str;
    }

    public ECommercePrice getActualPrice() {
        return this.f4397e;
    }

    public List<String> getCategoriesPath() {
        return this.f4395c;
    }

    public String getName() {
        return this.f4394b;
    }

    public ECommercePrice getOriginalPrice() {
        return this.f4398f;
    }

    public Map<String, String> getPayload() {
        return this.f4396d;
    }

    public List<String> getPromocodes() {
        return this.f4399g;
    }

    public String getSku() {
        return this.f4393a;
    }

    public ECommerceProduct setActualPrice(ECommercePrice eCommercePrice) {
        this.f4397e = eCommercePrice;
        return this;
    }

    public ECommerceProduct setCategoriesPath(List<String> list) {
        this.f4395c = list;
        return this;
    }

    public ECommerceProduct setName(String str) {
        this.f4394b = str;
        return this;
    }

    public ECommerceProduct setOriginalPrice(ECommercePrice eCommercePrice) {
        this.f4398f = eCommercePrice;
        return this;
    }

    public ECommerceProduct setPayload(Map<String, String> map) {
        this.f4396d = map;
        return this;
    }

    public ECommerceProduct setPromocodes(List<String> list) {
        this.f4399g = list;
        return this;
    }

    public String toString() {
        return "ECommerceProduct{sku='" + this.f4393a + "', name='" + this.f4394b + "', categoriesPath=" + this.f4395c + ", payload=" + this.f4396d + ", actualPrice=" + this.f4397e + ", originalPrice=" + this.f4398f + ", promocodes=" + this.f4399g + '}';
    }
}
