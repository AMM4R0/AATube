package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerFactory;
import java.util.LinkedHashMap;
import java.util.Map;
import p108m1.AbstractC2671u;

/* renamed from: io.appmetrica.analytics.impl.Hc */
/* loaded from: classes.dex */
public final class C1248Hc {

    /* renamed from: a */
    public final LinkedHashMap f4823a = new LinkedHashMap();

    /* renamed from: a */
    public final LinkedHashMap m2937a(String str) {
        LinkedHashMap linkedHashMap = this.f4823a;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC2671u.m5125b0(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), ((ModuleEventServiceHandlerFactory) entry.getValue()).createEventHandler(str));
        }
        return linkedHashMap2;
    }
}
