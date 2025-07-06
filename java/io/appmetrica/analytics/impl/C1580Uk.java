package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ListConverter;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.Uk */
/* loaded from: classes.dex */
public final class C1580Uk implements ListConverter {

    /* renamed from: a */
    public final C1605Vk f5545a = new C1605Vk();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1864g6[] fromModel(List<C1630Wk> list) {
        C1864g6[] c1864g6Arr = new C1864g6[list.size()];
        Iterator<C1630Wk> it = list.iterator();
        int r12 = 0;
        while (it.hasNext()) {
            c1864g6Arr[r12] = this.f5545a.fromModel(it.next());
            r12++;
        }
        return c1864g6Arr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final List<C1630Wk> m3398a(C1864g6[] c1864g6Arr) {
        throw new UnsupportedOperationException();
    }
}
