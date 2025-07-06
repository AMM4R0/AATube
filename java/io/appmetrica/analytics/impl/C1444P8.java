package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.P8 */
/* loaded from: classes.dex */
public final class C1444P8 extends AbstractC1587V2 {
    @Override // io.appmetrica.analytics.impl.AbstractC1587V2
    /* renamed from: a */
    public final MessageNano defaultValue() {
        return new C2192t9();
    }

    /* renamed from: b */
    public final C2192t9 m3201b() {
        return new C2192t9();
    }

    @Override // io.appmetrica.analytics.impl.AbstractC1587V2, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final Object defaultValue() {
        return new C2192t9();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2192t9 toState(byte[] bArr) {
        return (C2192t9) MessageNano.mergeFrom(new C2192t9(), bArr);
    }
}
