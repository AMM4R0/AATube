package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.Yl */
/* loaded from: classes.dex */
public final class C1681Yl implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1457Pl fromModel(C1656Xl c1656Xl) {
        C1457Pl c1457Pl = new C1457Pl();
        c1457Pl.f5234a = c1656Xl.f5697a;
        return c1457Pl;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new C1656Xl(((C1457Pl) obj).f5234a);
    }

    /* renamed from: a */
    public final C1656Xl m3555a(C1457Pl c1457Pl) {
        return new C1656Xl(c1457Pl.f5234a);
    }
}
