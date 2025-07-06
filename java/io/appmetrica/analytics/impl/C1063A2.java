package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.impl.A2 */
/* loaded from: classes.dex */
public final class C1063A2 implements ProtobufConverter {

    /* renamed from: a */
    public final C1986l3 f4449a;

    public C1063A2() {
        this(new C1986l3());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1113C2 fromModel(C2335z2 c2335z2) {
        C1113C2 c1113c2 = new C1113C2();
        c1113c2.f4565a = new C1088B2[c2335z2.f7513a.size()];
        int r2 = 0;
        for (BillingInfo billingInfo : c2335z2.f7513a) {
            C1088B2[] c1088b2Arr = c1113c2.f4565a;
            this.f4449a.getClass();
            c1088b2Arr[r2] = C1986l3.m4078a(billingInfo);
            r2++;
        }
        c1113c2.f4566b = c2335z2.f7514b;
        return c1113c2;
    }

    public C1063A2(C1986l3 c1986l3) {
        this.f4449a = c1986l3;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2335z2 toModel(C1113C2 c1113c2) {
        ProductType productType;
        ArrayList arrayList = new ArrayList(c1113c2.f4565a.length);
        for (C1088B2 c1088b2 : c1113c2.f4565a) {
            this.f4449a.getClass();
            int r6 = c1088b2.f4509a;
            if (r6 == 2) {
                productType = ProductType.INAPP;
            } else if (r6 != 3) {
                productType = ProductType.UNKNOWN;
            } else {
                productType = ProductType.SUBS;
            }
            arrayList.add(new BillingInfo(productType, c1088b2.f4510b, c1088b2.f4511c, c1088b2.f4512d, c1088b2.f4513e));
        }
        return new C2335z2(arrayList, c1113c2.f4566b);
    }
}
