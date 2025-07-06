package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.BiFunction;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: io.appmetrica.analytics.impl.Rm */
/* loaded from: classes.dex */
public final class C1507Rm {

    /* renamed from: a */
    public final InterfaceC1483Qm f5395a;

    /* renamed from: b */
    public final BiFunction f5396b;

    /* renamed from: c */
    public final InterfaceC1773cf f5397c;

    public C1507Rm() {
        this(new C1433Om(), new C1968ka(), C2312y4.m4633h().m4644k());
    }

    /* renamed from: a */
    public final ArrayList m3307a(Thread thread, Thread thread2) {
        Map<Thread, StackTraceElement[]> map;
        ArrayList arrayList = new ArrayList();
        TreeMap treeMap = new TreeMap(new C1458Pm());
        try {
            ((C1433Om) this.f5395a).getClass();
            map = Thread.getAllStackTraces();
        } catch (SecurityException unused) {
            map = null;
        }
        if (map != null) {
            treeMap.putAll(map);
        }
        if (thread2 != null) {
            treeMap.remove(thread2);
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            Thread thread3 = (Thread) entry.getKey();
            if (thread3 != thread && thread3 != thread2) {
                arrayList.add(this.f5396b.apply(thread3, (StackTraceElement[]) entry.getValue()));
            }
        }
        return arrayList;
    }

    public C1507Rm(C1433Om c1433Om, C1968ka c1968ka, C1671Yb c1671Yb) {
        this.f5395a = c1433Om;
        this.f5396b = c1968ka;
        this.f5397c = c1671Yb;
    }
}
