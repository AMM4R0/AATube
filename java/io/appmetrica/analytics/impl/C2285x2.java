package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.x2 */
/* loaded from: classes.dex */
public final class C2285x2 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1282Il fromModel(BillingConfig billingConfig) {
        C1282Il c1282Il = new C1282Il();
        c1282Il.f4883a = billingConfig.sendFrequencySeconds;
        c1282Il.f4884b = billingConfig.firstCollectingInappMaxAgeSeconds;
        return c1282Il;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        C1282Il c1282Il = (C1282Il) obj;
        return new BillingConfig(c1282Il.f4883a, c1282Il.f4884b);
    }

    /* renamed from: a */
    public final BillingConfig m4593a(C1282Il c1282Il) {
        return new BillingConfig(c1282Il.f4883a, c1282Il.f4884b);
    }
}
