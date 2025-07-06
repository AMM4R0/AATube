package io.appmetrica.analytics.ecommerce;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class ECommerceScreen {

    /* renamed from: a */
    private String f4403a;

    /* renamed from: b */
    private List f4404b;

    /* renamed from: c */
    private String f4405c;

    /* renamed from: d */
    private Map f4406d;

    public List<String> getCategoriesPath() {
        return this.f4404b;
    }

    public String getName() {
        return this.f4403a;
    }

    public Map<String, String> getPayload() {
        return this.f4406d;
    }

    public String getSearchQuery() {
        return this.f4405c;
    }

    public ECommerceScreen setCategoriesPath(List<String> list) {
        this.f4404b = list;
        return this;
    }

    public ECommerceScreen setName(String str) {
        this.f4403a = str;
        return this;
    }

    public ECommerceScreen setPayload(Map<String, String> map) {
        this.f4406d = map;
        return this;
    }

    public ECommerceScreen setSearchQuery(String str) {
        this.f4405c = str;
        return this;
    }

    public String toString() {
        return "ECommerceScreen{name='" + this.f4403a + "', categoriesPath=" + this.f4404b + ", searchQuery='" + this.f4405c + "', payload=" + this.f4406d + '}';
    }
}
