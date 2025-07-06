package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.z6 */
/* loaded from: classes.dex */
public final class C2339z6 implements ProtobufConverter {

    /* renamed from: a */
    public final C1924ig f7517a;

    public C2339z6() {
        this(new C1924ig());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1814e6 fromModel(C2314y6 c2314y6) {
        C1814e6 fromModel = this.f7517a.fromModel(c2314y6.f7488a);
        fromModel.f6133g = 1;
        C1789d6 c1789d6 = new C1789d6();
        fromModel.f6134h = c1789d6;
        c1789d6.f6076a = c2314y6.f7489b;
        return fromModel;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C2339z6(C1924ig c1924ig) {
        this.f7517a = c1924ig;
    }

    /* renamed from: a */
    public final C2314y6 m4678a(C1814e6 c1814e6) {
        throw new UnsupportedOperationException();
    }
}
