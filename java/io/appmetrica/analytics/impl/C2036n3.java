package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.billinginterface.internal.ProductInfo;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.n3 */
/* loaded from: classes.dex */
public final class C2036n3 implements BillingInfoSender {

    /* renamed from: a */
    public final InterfaceC1421Oa f6795a;

    /* renamed from: b */
    public final ICommonExecutor f6796b;

    public C2036n3(InterfaceC1421Oa interfaceC1421Oa) {
        this(interfaceC1421Oa, C2018ma.m4192h().m4214u().m2966e());
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender
    public final void sendInfo(List<ProductInfo> list) {
        Iterator<ProductInfo> it = list.iterator();
        while (it.hasNext()) {
            this.f6796b.execute(new C2011m3(this, it.next()));
        }
    }

    public C2036n3(InterfaceC1421Oa interfaceC1421Oa, ICommonExecutor iCommonExecutor) {
        this.f6795a = interfaceC1421Oa;
        this.f6796b = iCommonExecutor;
    }
}
