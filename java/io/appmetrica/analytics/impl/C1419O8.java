package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.O8 */
/* loaded from: classes.dex */
public final class C1419O8 implements ProtobufConverter {
    /* renamed from: a */
    public static C2192t9 m3167a(C1394N8 c1394n8) {
        C2192t9 c2192t9 = new C2192t9();
        c2192t9.f7159d = new int[c1394n8.f5119b.size()];
        Iterator it = c1394n8.f5119b.iterator();
        int r2 = 0;
        while (it.hasNext()) {
            c2192t9.f7159d[r2] = ((Integer) it.next()).intValue();
            r2++;
        }
        c2192t9.f7158c = c1394n8.f5121d;
        c2192t9.f7157b = c1394n8.f5120c;
        c2192t9.f7156a = c1394n8.f5118a;
        return c2192t9;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final /* bridge */ /* synthetic */ Object fromModel(Object obj) {
        return m3167a((C1394N8) obj);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        C2192t9 c2192t9 = (C2192t9) obj;
        return new C1394N8(c2192t9.f7156a, c2192t9.f7157b, c2192t9.f7158c, CollectionUtils.hashSetFromIntArray(c2192t9.f7159d));
    }
}
