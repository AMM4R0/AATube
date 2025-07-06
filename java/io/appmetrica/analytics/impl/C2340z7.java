package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.math.BigDecimal;
import java.math.BigInteger;

/* renamed from: io.appmetrica.analytics.impl.z7 */
/* loaded from: classes.dex */
public final class C2340z7 implements ProtobufConverter {
    /* renamed from: a */
    public final BigDecimal m4680a(C1891h8 c1891h8) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1891h8 fromModel(BigDecimal bigDecimal) {
        BigInteger bigInteger = AbstractC1093B7.f4520a;
        int r02 = -bigDecimal.scale();
        BigInteger unscaledValue = bigDecimal.unscaledValue();
        while (true) {
            if (unscaledValue.compareTo(AbstractC1093B7.f4520a) <= 0 && unscaledValue.compareTo(AbstractC1093B7.f4521b) >= 0) {
                Long valueOf = Long.valueOf(unscaledValue.longValue());
                Integer valueOf2 = Integer.valueOf(r02);
                C1068A7 c1068a7 = new C1068A7(valueOf2.intValue(), valueOf.longValue());
                C1891h8 c1891h8 = new C1891h8();
                c1891h8.f6384a = c1068a7.f4451a;
                c1891h8.f6385b = c1068a7.f4452b;
                return c1891h8;
            }
            unscaledValue = unscaledValue.divide(BigInteger.TEN);
            r02++;
        }
    }
}
