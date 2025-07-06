package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.q9 */
/* loaded from: classes.dex */
public final class C2117q9 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2067o9 fromModel(C2092p9 c2092p9) {
        C2067o9 c2067o9 = new C2067o9();
        String str = c2092p9.f6903a;
        if (str != null) {
            c2067o9.f6853a = str.getBytes();
        }
        return c2067o9;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2092p9 toModel(C2067o9 c2067o9) {
        return new C2092p9(new String(c2067o9.f6853a));
    }
}
