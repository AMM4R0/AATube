package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.bd */
/* loaded from: classes.dex */
public final class C1746bd {
    /* renamed from: a */
    public static void m3649a() {
        Iterator it = C2312y4.m4633h().f7487l.m2874a().iterator();
        while (it.hasNext()) {
            Object loadAndInstantiateClassWithDefaultConstructor = ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor((String) it.next(), ModuleClientEntryPoint.class);
            if (loadAndInstantiateClassWithDefaultConstructor != null) {
                C2312y4.m4633h().m4643j().f7256a.add((ModuleClientEntryPoint) loadAndInstantiateClassWithDefaultConstructor);
            }
        }
    }
}
