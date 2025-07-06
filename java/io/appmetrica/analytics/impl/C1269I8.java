package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.LinkedHashMap;
import java.util.Map;
import p108m1.AbstractC2660j;
import p108m1.AbstractC2671u;

/* renamed from: io.appmetrica.analytics.impl.I8 */
/* loaded from: classes.dex */
public final class C1269I8 implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final byte[] fromModel(Map<String, byte[]> map) {
        C1319K8 c1319k8 = new C1319K8();
        int size = map.size();
        C1294J8[] c1294j8Arr = new C1294J8[size];
        int r3 = 0;
        for (int r4 = 0; r4 < size; r4++) {
            c1294j8Arr[r4] = new C1294J8();
        }
        c1319k8.f4952a = c1294j8Arr;
        for (Object obj : map.entrySet()) {
            int r2 = r3 + 1;
            if (r3 < 0) {
                AbstractC2660j.m5121Y();
                throw null;
            }
            Map.Entry entry = (Map.Entry) obj;
            c1319k8.f4952a[r3].f4905a = (String) entry.getKey();
            c1319k8.f4952a[r3].f4906b = (byte[]) entry.getValue();
            r3 = r2;
        }
        return MessageNano.toByteArray(c1319k8);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, byte[]> toModel(byte[] bArr) {
        C1294J8[] c1294j8Arr = ((C1319K8) MessageNano.mergeFrom(new C1319K8(), bArr)).f4952a;
        int m5125b0 = AbstractC2671u.m5125b0(c1294j8Arr.length);
        if (m5125b0 < 16) {
            m5125b0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(m5125b0);
        for (C1294J8 c1294j8 : c1294j8Arr) {
            linkedHashMap.put(c1294j8.f4905a, c1294j8.f4906b);
        }
        return linkedHashMap;
    }
}
