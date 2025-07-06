package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import p002A1.AbstractC0008a;
import p108m1.AbstractC2671u;

/* renamed from: io.appmetrica.analytics.impl.Yj */
/* loaded from: classes.dex */
public final class C1679Yj implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1728ak fromModel(Map<String, byte[]> map) {
        C1728ak c1728ak = new C1728ak();
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, byte[]> entry : map.entrySet()) {
            C1753bk c1753bk = new C1753bk();
            c1753bk.f5951a = entry.getKey().getBytes(AbstractC0008a.f6a);
            c1753bk.f5952b = entry.getValue();
            arrayList.add(c1753bk);
        }
        Object[] array = arrayList.toArray(new C1753bk[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        c1728ak.f5890a = (C1753bk[]) array;
        return c1728ak;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, byte[]> toModel(C1728ak c1728ak) {
        C1753bk[] c1753bkArr = c1728ak.f5890a;
        int m5125b0 = AbstractC2671u.m5125b0(c1753bkArr.length);
        if (m5125b0 < 16) {
            m5125b0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(m5125b0);
        for (C1753bk c1753bk : c1753bkArr) {
            linkedHashMap.put(new String(c1753bk.f5951a, AbstractC0008a.f6a), c1753bk.f5952b);
        }
        return linkedHashMap;
    }
}
