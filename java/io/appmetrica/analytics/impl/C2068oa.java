package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.oa */
/* loaded from: classes.dex */
public final class C2068oa {

    /* renamed from: a */
    public final HashMap f6854a;

    /* renamed from: b */
    public final boolean f6855b;

    public C2068oa() {
        this(false);
    }

    /* renamed from: a */
    public final void m4264a(Object obj, Object obj2) {
        Collection collection = (Collection) this.f6854a.get(obj);
        ArrayList arrayList = collection == null ? new ArrayList() : new ArrayList(collection);
        arrayList.add(obj2);
    }

    public final String toString() {
        return this.f6854a.toString();
    }

    public C2068oa(boolean z2) {
        this.f6854a = new HashMap();
        this.f6855b = z2;
    }
}
