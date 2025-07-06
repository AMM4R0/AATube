package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* renamed from: io.appmetrica.analytics.impl.Qe */
/* loaded from: classes.dex */
public final class C1475Qe implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Integer fromModel(EnumC1517S7 enumC1517S7) {
        int ordinal = enumC1517S7.ordinal();
        if (ordinal == 1) {
            return 1;
        }
        if (ordinal != 2) {
            return ordinal != 3 ? 0 : 2;
        }
        return 3;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final EnumC1517S7 toModel(Integer num) {
        int intValue = num.intValue();
        if (intValue == 1) {
            return EnumC1517S7.f5405c;
        }
        if (intValue == 2) {
            return EnumC1517S7.f5407e;
        }
        if (intValue != 3) {
            return EnumC1517S7.f5404b;
        }
        return EnumC1517S7.f5406d;
    }
}
