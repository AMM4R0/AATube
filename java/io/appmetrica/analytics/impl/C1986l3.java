package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.l3 */
/* loaded from: classes.dex */
public final class C1986l3 implements ProtobufConverter {
    /* renamed from: a */
    public static C1088B2 m4078a(BillingInfo billingInfo) {
        C1088B2 c1088b2 = new C1088B2();
        int r12 = AbstractC1961k3.f6558a[billingInfo.type.ordinal()];
        c1088b2.f4509a = r12 != 1 ? r12 != 2 ? 1 : 3 : 2;
        c1088b2.f4510b = billingInfo.productId;
        c1088b2.f4511c = billingInfo.purchaseToken;
        c1088b2.f4512d = billingInfo.purchaseTime;
        c1088b2.f4513e = billingInfo.sendTime;
        return c1088b2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final /* bridge */ /* synthetic */ Object fromModel(Object obj) {
        return m4078a((BillingInfo) obj);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        C1088B2 c1088b2 = (C1088B2) obj;
        int r02 = c1088b2.f4509a;
        return new BillingInfo(r02 != 2 ? r02 != 3 ? ProductType.UNKNOWN : ProductType.SUBS : ProductType.INAPP, c1088b2.f4510b, c1088b2.f4511c, c1088b2.f4512d, c1088b2.f4513e);
    }
}
