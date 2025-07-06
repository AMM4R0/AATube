package p108m1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2492i;
import p001A0.AbstractC0005b;
import p105l1.C2632c;

/* renamed from: m1.u */
/* loaded from: classes.dex */
public abstract class AbstractC2671u extends AbstractC0005b {
    /* renamed from: b0 */
    public static int m5125b0(int r12) {
        if (r12 < 0) {
            return r12;
        }
        if (r12 < 3) {
            return r12 + 1;
        }
        if (r12 < 1073741824) {
            return (int) ((r12 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: c0 */
    public static Map m5126c0(C2632c pair) {
        AbstractC2492i.m4915e(pair, "pair");
        Map singletonMap = Collections.singletonMap(pair.f8550a, pair.f8551b);
        AbstractC2492i.m4914d(singletonMap, "singletonMap(...)");
        return singletonMap;
    }

    /* renamed from: d0 */
    public static Map m5127d0(C2632c... c2632cArr) {
        if (c2632cArr.length <= 0) {
            return C2669s.f8608a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(m5125b0(c2632cArr.length));
        m5128e0(linkedHashMap, c2632cArr);
        return linkedHashMap;
    }

    /* renamed from: e0 */
    public static final void m5128e0(LinkedHashMap linkedHashMap, C2632c[] c2632cArr) {
        for (C2632c c2632c : c2632cArr) {
            linkedHashMap.put(c2632c.f8550a, c2632c.f8551b);
        }
    }

    /* renamed from: f0 */
    public static Map m5129f0(ArrayList arrayList) {
        C2669s c2669s = C2669s.f8608a;
        int size = arrayList.size();
        if (size == 0) {
            return c2669s;
        }
        if (size == 1) {
            return m5126c0((C2632c) arrayList.get(0));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(m5125b0(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C2632c c2632c = (C2632c) it.next();
            linkedHashMap.put(c2632c.f8550a, c2632c.f8551b);
        }
        return linkedHashMap;
    }

    /* renamed from: g0 */
    public static Map m5130g0(Map map) {
        AbstractC2492i.m4915e(map, "<this>");
        int size = map.size();
        if (size == 0) {
            return C2669s.f8608a;
        }
        if (size != 1) {
            return new LinkedHashMap(map);
        }
        AbstractC2492i.m4915e(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        AbstractC2492i.m4914d(singletonMap, "with(...)");
        return singletonMap;
    }
}
