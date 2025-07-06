package io.appmetrica.analytics.impl;

import java.util.HashMap;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.uc */
/* loaded from: classes.dex */
public class C2220uc {

    /* renamed from: a */
    public final Map f7220a;

    /* renamed from: b */
    public final Object f7221b;

    public C2220uc(Object obj) {
        this(new HashMap(), obj);
    }

    /* renamed from: a */
    public final void m4483a(Object obj, Object obj2) {
        this.f7220a.put(obj, obj2);
    }

    public C2220uc(HashMap hashMap, Object obj) {
        this.f7220a = hashMap;
        this.f7221b = obj;
    }

    /* renamed from: a */
    public final Object m4482a(Object obj) {
        Object obj2 = this.f7220a.get(obj);
        return obj2 == null ? this.f7221b : obj2;
    }
}
