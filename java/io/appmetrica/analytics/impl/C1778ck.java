package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.ck */
/* loaded from: classes.dex */
public final class C1778ck extends AbstractC1587V2 {
    @Override // io.appmetrica.analytics.impl.AbstractC1587V2
    /* renamed from: a */
    public final MessageNano defaultValue() {
        return new C1728ak();
    }

    /* renamed from: b */
    public final C1728ak m3716b() {
        return new C1728ak();
    }

    @Override // io.appmetrica.analytics.impl.AbstractC1587V2, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final Object defaultValue() {
        return new C1728ak();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1728ak toState(byte[] bArr) {
        return (C1728ak) MessageNano.mergeFrom(new C1728ak(), bArr);
    }
}
