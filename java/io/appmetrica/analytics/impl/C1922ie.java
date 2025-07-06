package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.nio.charset.Charset;
import java.util.Map;
import p002A1.AbstractC0008a;

/* renamed from: io.appmetrica.analytics.impl.ie */
/* loaded from: classes.dex */
public final class C1922ie implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1714a6[] fromModel(Map<String, String> map) {
        int size = map.size();
        C1714a6[] c1714a6Arr = new C1714a6[size];
        int r2 = 0;
        for (int r3 = 0; r3 < size; r3++) {
            c1714a6Arr[r3] = new C1714a6();
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            C1714a6 c1714a6 = c1714a6Arr[r2];
            String key = entry.getKey();
            Charset charset = AbstractC0008a.f6a;
            c1714a6.f5848a = key.getBytes(charset);
            c1714a6Arr[r2].f5849b = entry.getValue().getBytes(charset);
            r2++;
        }
        return c1714a6Arr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final Map<String, String> m4013a(C1714a6[] c1714a6Arr) {
        throw new UnsupportedOperationException();
    }
}
