package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.Fi */
/* loaded from: classes.dex */
public final class C1204Fi {

    /* renamed from: a */
    public final String f4736a;

    /* renamed from: b */
    public final List f4737b;

    /* renamed from: c */
    public final String f4738c;

    /* renamed from: d */
    public final Map f4739d;

    public C1204Fi(ECommerceScreen eCommerceScreen) {
        this(eCommerceScreen.getName(), eCommerceScreen.getSearchQuery(), CollectionUtils.arrayListCopyOfNullableCollection(eCommerceScreen.getCategoriesPath()), CollectionUtils.mapCopyOfNullableMap(eCommerceScreen.getPayload()));
    }

    public final String toString() {
        return "ScreenWrapper{name='" + this.f4736a + "', categoriesPath=" + this.f4737b + ", searchQuery='" + this.f4738c + "', payload=" + this.f4739d + '}';
    }

    public C1204Fi(String str, String str2, List list, Map map) {
        this.f4736a = str;
        this.f4737b = list;
        this.f4738c = str2;
        this.f4739d = map;
    }
}
