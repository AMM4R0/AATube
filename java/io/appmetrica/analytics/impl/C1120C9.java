package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.C9 */
/* loaded from: classes.dex */
public final class C1120C9 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1357Ll fromModel(C1095B9 c1095b9) {
        C1357Ll c1357Ll = new C1357Ll();
        if (c1095b9 != null) {
            c1357Ll.f5016a = c1095b9.f4524a;
        }
        return c1357Ll;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new C1095B9(((C1357Ll) obj).f5016a);
    }

    /* renamed from: a */
    public final C1095B9 m2794a(C1357Ll c1357Ll) {
        return new C1095B9(c1357Ll.f5016a);
    }
}
