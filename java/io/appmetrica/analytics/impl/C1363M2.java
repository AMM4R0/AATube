package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.M2 */
/* loaded from: classes.dex */
public final class C1363M2 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1710a2 fromModel(C1413O2 c1413o2) {
        C1710a2 c1710a2 = new C1710a2();
        EnumC1388N2 enumC1388N2 = c1413o2.f5146a;
        if (enumC1388N2 != null) {
            int ordinal = enumC1388N2.ordinal();
            if (ordinal == 0) {
                c1710a2.f5831a = 1;
            } else if (ordinal == 1) {
                c1710a2.f5831a = 2;
            } else if (ordinal == 2) {
                c1710a2.f5831a = 3;
            } else if (ordinal == 3) {
                c1710a2.f5831a = 4;
            } else if (ordinal == 4) {
                c1710a2.f5831a = 5;
            }
        }
        Boolean bool = c1413o2.f5147b;
        if (bool != null) {
            if (bool.booleanValue()) {
                c1710a2.f5832b = 1;
            } else {
                c1710a2.f5832b = 0;
            }
        }
        return c1710a2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1413O2 toModel(C1710a2 c1710a2) {
        EnumC1388N2 enumC1388N2;
        int r02 = c1710a2.f5831a;
        Boolean bool = null;
        if (r02 == 1) {
            enumC1388N2 = EnumC1388N2.ACTIVE;
        } else if (r02 == 2) {
            enumC1388N2 = EnumC1388N2.WORKING_SET;
        } else if (r02 == 3) {
            enumC1388N2 = EnumC1388N2.FREQUENT;
        } else if (r02 != 4) {
            enumC1388N2 = r02 != 5 ? null : EnumC1388N2.RESTRICTED;
        } else {
            enumC1388N2 = EnumC1388N2.RARE;
        }
        int r5 = c1710a2.f5832b;
        if (r5 == 0) {
            bool = Boolean.FALSE;
        } else if (r5 == 1) {
            bool = Boolean.TRUE;
        }
        return new C1413O2(enumC1388N2, bool);
    }
}
