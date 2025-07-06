package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* renamed from: io.appmetrica.analytics.impl.Vk */
/* loaded from: classes.dex */
public final class C1605Vk implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1864g6 fromModel(C1630Wk c1630Wk) {
        C1864g6 c1864g6 = new C1864g6();
        c1864g6.f6296a = (String) WrapUtils.getOrDefault(c1630Wk.f5655a, c1864g6.f6296a);
        c1864g6.f6297b = (String) WrapUtils.getOrDefault(c1630Wk.f5656b, c1864g6.f6297b);
        c1864g6.f6298c = ((Integer) WrapUtils.getOrDefault(c1630Wk.f5657c, Integer.valueOf(c1864g6.f6298c))).intValue();
        c1864g6.f6301f = ((Integer) WrapUtils.getOrDefault(c1630Wk.f5658d, Integer.valueOf(c1864g6.f6301f))).intValue();
        c1864g6.f6299d = (String) WrapUtils.getOrDefault(c1630Wk.f5659e, c1864g6.f6299d);
        c1864g6.f6300e = ((Boolean) WrapUtils.getOrDefault(c1630Wk.f5660f, Boolean.valueOf(c1864g6.f6300e))).booleanValue();
        return c1864g6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final C1630Wk m3428a(C1864g6 c1864g6) {
        throw new UnsupportedOperationException();
    }
}
