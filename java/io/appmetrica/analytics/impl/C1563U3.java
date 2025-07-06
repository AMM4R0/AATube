package io.appmetrica.analytics.impl;

import androidx.fragment.app.C0665o;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import p108m1.AbstractC2671u;

/* renamed from: io.appmetrica.analytics.impl.U3 */
/* loaded from: classes.dex */
public final class C1563U3 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1663Y3 fromModel(C1538T3 c1538t3) {
        C1663Y3 c1663y3 = new C1663Y3();
        c1663y3.f5716a = m3385a(c1538t3.f5460a);
        int size = c1538t3.f5461b.size();
        C1588V3[] c1588v3Arr = new C1588V3[size];
        for (int r3 = 0; r3 < size; r3++) {
            c1588v3Arr[r3] = m3385a((C1513S3) c1538t3.f5461b.get(r3));
        }
        c1663y3.f5717b = c1588v3Arr;
        return c1663y3;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1538T3 toModel(C1663Y3 c1663y3) {
        C1588V3 c1588v3 = c1663y3.f5716a;
        if (c1588v3 == null) {
            c1588v3 = new C1588V3();
        }
        C1513S3 m3384a = m3384a(c1588v3);
        C1588V3[] c1588v3Arr = c1663y3.f5717b;
        ArrayList arrayList = new ArrayList(c1588v3Arr.length);
        for (C1588V3 c1588v32 : c1588v3Arr) {
            arrayList.add(m3384a(c1588v32));
        }
        return new C1538T3(m3384a, arrayList);
    }

    /* renamed from: a */
    public static C1588V3 m3385a(C1513S3 c1513s3) {
        C1638X3 c1638x3;
        C1588V3 c1588v3 = new C1588V3();
        Map map = c1513s3.f5401a;
        int r2 = 0;
        if (map != null) {
            c1638x3 = new C1638X3();
            int size = map.size();
            C1613W3[] c1613w3Arr = new C1613W3[size];
            for (int r7 = 0; r7 < size; r7++) {
                c1613w3Arr[r7] = new C1613W3();
            }
            c1638x3.f5688a = c1613w3Arr;
            int r5 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                C1613W3 c1613w3 = c1638x3.f5688a[r5];
                c1613w3.f5618a = str;
                c1613w3.f5619b = str2;
                r5++;
            }
        } else {
            c1638x3 = null;
        }
        c1588v3.f5558a = c1638x3;
        int ordinal = c1513s3.f5402b.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                r2 = 2;
                if (ordinal != 2) {
                    r2 = 3;
                    if (ordinal != 3) {
                        throw new C0665o();
                    }
                }
            } else {
                r2 = 1;
            }
        }
        c1588v3.f5559b = r2;
        return c1588v3;
    }

    /* renamed from: a */
    public static C1513S3 m3384a(C1588V3 c1588v3) {
        LinkedHashMap linkedHashMap;
        EnumC1517S7 enumC1517S7;
        C1638X3 c1638x3 = c1588v3.f5558a;
        if (c1638x3 != null) {
            C1613W3[] c1613w3Arr = c1638x3.f5688a;
            int m5125b0 = AbstractC2671u.m5125b0(c1613w3Arr.length);
            if (m5125b0 < 16) {
                m5125b0 = 16;
            }
            linkedHashMap = new LinkedHashMap(m5125b0);
            for (C1613W3 c1613w3 : c1613w3Arr) {
                linkedHashMap.put(c1613w3.f5618a, c1613w3.f5619b);
            }
        } else {
            linkedHashMap = null;
        }
        int r6 = c1588v3.f5559b;
        if (r6 == 0) {
            enumC1517S7 = EnumC1517S7.f5404b;
        } else if (r6 == 1) {
            enumC1517S7 = EnumC1517S7.f5405c;
        } else if (r6 == 2) {
            enumC1517S7 = EnumC1517S7.f5406d;
        } else if (r6 != 3) {
            enumC1517S7 = EnumC1517S7.f5404b;
        } else {
            enumC1517S7 = EnumC1517S7.f5407e;
        }
        return new C1513S3(linkedHashMap, enumC1517S7);
    }
}
