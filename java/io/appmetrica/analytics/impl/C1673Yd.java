package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.Yd */
/* loaded from: classes.dex */
public final class C1673Yd implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1432Ol fromModel(C1648Xd c1648Xd) {
        C1432Ol c1432Ol = new C1432Ol();
        c1432Ol.f5189a = c1648Xd.f5691a;
        c1432Ol.f5190b = c1648Xd.f5692b;
        return c1432Ol;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        C1432Ol c1432Ol = (C1432Ol) obj;
        return new C1648Xd(c1432Ol.f5189a, c1432Ol.f5190b);
    }

    /* renamed from: a */
    public final C1648Xd m3548a(C1432Ol c1432Ol) {
        return new C1648Xd(c1432Ol.f5189a, c1432Ol.f5190b);
    }
}
