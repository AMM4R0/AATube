package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.hf */
/* loaded from: classes.dex */
public final class C1898hf {

    /* renamed from: a */
    public final String f6406a;

    /* renamed from: b */
    public final String f6407b;

    /* renamed from: c */
    public final List f6408c;

    /* renamed from: d */
    public final Map f6409d;

    /* renamed from: e */
    public final C1698Ze f6410e;

    /* renamed from: f */
    public final C1698Ze f6411f;

    /* renamed from: g */
    public final List f6412g;

    public C1898hf(ECommerceProduct eCommerceProduct) {
        this(eCommerceProduct.getSku(), eCommerceProduct.getName(), CollectionUtils.arrayListCopyOfNullableCollection(eCommerceProduct.getCategoriesPath()), CollectionUtils.mapCopyOfNullableMap(eCommerceProduct.getPayload()), eCommerceProduct.getActualPrice() == null ? null : new C1698Ze(eCommerceProduct.getActualPrice()), eCommerceProduct.getOriginalPrice() == null ? null : new C1698Ze(eCommerceProduct.getOriginalPrice()), CollectionUtils.arrayListCopyOfNullableCollection(eCommerceProduct.getPromocodes()));
    }

    public final String toString() {
        return "ProductWrapper{sku='" + this.f6406a + "', name='" + this.f6407b + "', categoriesPath=" + this.f6408c + ", payload=" + this.f6409d + ", actualPrice=" + this.f6410e + ", originalPrice=" + this.f6411f + ", promocodes=" + this.f6412g + '}';
    }

    public C1898hf(String str, String str2, List list, Map map, C1698Ze c1698Ze, C1698Ze c1698Ze2, List list2) {
        this.f6406a = str;
        this.f6407b = str2;
        this.f6408c = list;
        this.f6409d = map;
        this.f6410e = c1698Ze;
        this.f6411f = c1698Ze2;
        this.f6412g = list2;
    }
}
