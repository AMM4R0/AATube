package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p108m1.AbstractC2658h;
import p108m1.AbstractC2660j;
import p108m1.AbstractC2671u;

/* renamed from: io.appmetrica.analytics.impl.A6 */
/* loaded from: classes.dex */
public final class C1067A6 implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1332Kl[] fromModel(Map<String, ? extends List<String>> map) {
        int size = map.size();
        C1332Kl[] c1332KlArr = new C1332Kl[size];
        for (int r3 = 0; r3 < size; r3++) {
            c1332KlArr[r3] = new C1332Kl();
        }
        int r02 = 0;
        for (Object obj : map.entrySet()) {
            int r4 = r02 + 1;
            if (r02 < 0) {
                AbstractC2660j.m5121Y();
                throw null;
            }
            Map.Entry entry = (Map.Entry) obj;
            c1332KlArr[r02].f4974a = (String) entry.getKey();
            C1332Kl c1332Kl = c1332KlArr[r02];
            Object[] array = ((Collection) entry.getValue()).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            c1332Kl.f4975b = (String[]) array;
            r02 = r4;
        }
        return c1332KlArr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, List<String>> toModel(C1332Kl[] c1332KlArr) {
        int m5125b0 = AbstractC2671u.m5125b0(c1332KlArr.length);
        if (m5125b0 < 16) {
            m5125b0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(m5125b0);
        for (C1332Kl c1332Kl : c1332KlArr) {
            linkedHashMap.put(c1332Kl.f4974a, AbstractC2658h.m5112J(c1332Kl.f4975b));
        }
        return linkedHashMap;
    }
}
