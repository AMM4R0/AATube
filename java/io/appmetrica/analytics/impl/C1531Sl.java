package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.Sl */
/* loaded from: classes.dex */
public final class C1531Sl extends AbstractC1587V2 {
    @Override // io.appmetrica.analytics.impl.AbstractC1587V2, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C1506Rl defaultValue() {
        C1506Rl c1506Rl = new C1506Rl();
        c1506Rl.f5377i = new C1382Ml();
        return c1506Rl;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1506Rl toState(byte[] bArr) {
        return (C1506Rl) MessageNano.mergeFrom(new C1506Rl(), bArr);
    }
}
