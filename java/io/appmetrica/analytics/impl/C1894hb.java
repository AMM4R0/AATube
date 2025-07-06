package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.hb */
/* loaded from: classes.dex */
public final class C1894hb implements Converter {

    /* renamed from: a */
    public final C1123Cc f6404a;

    public C1894hb() {
        this(new C1123Cc(new C1856fn()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final byte[] fromModel(C1831en c1831en) {
        return MessageNano.toByteArray((MessageNano) this.f6404a.f4578a.fromModel(c1831en));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C1894hb(C1123Cc c1123Cc) {
        this.f6404a = c1123Cc;
    }

    /* renamed from: a */
    public final C1831en m3941a(byte[] bArr) {
        throw new UnsupportedOperationException();
    }
}
