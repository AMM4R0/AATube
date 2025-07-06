package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.Z3 */
/* loaded from: classes.dex */
public final class C1687Z3 extends AbstractC1587V2 {
    @Override // io.appmetrica.analytics.impl.AbstractC1587V2
    /* renamed from: a */
    public final MessageNano defaultValue() {
        return new C1663Y3();
    }

    /* renamed from: b */
    public final C1663Y3 m3561b() {
        return new C1663Y3();
    }

    @Override // io.appmetrica.analytics.impl.AbstractC1587V2, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final Object defaultValue() {
        return new C1663Y3();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1663Y3 toState(byte[] bArr) {
        return (C1663Y3) MessageNano.mergeFrom(new C1663Y3(), bArr);
    }
}
