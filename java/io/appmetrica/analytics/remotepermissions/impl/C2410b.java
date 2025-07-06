package io.appmetrica.analytics.remotepermissions.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.remotepermissions.impl.b */
/* loaded from: classes.dex */
public final class C2410b implements Converter {

    /* renamed from: a */
    public final C2411c f7804a = new C2411c();

    /* renamed from: a */
    public final byte[] m4764a(C2409a c2409a) {
        return MessageNano.toByteArray(this.f7804a.fromModel(c2409a));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.f7804a.fromModel((C2409a) obj));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2409a toModel(byte[] bArr) {
        return this.f7804a.toModel((C2414f) MessageNano.mergeFrom(new C2414f(), bArr));
    }
}
