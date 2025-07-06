package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingResult;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.List;
import p131u1.InterfaceC2799a;

/* renamed from: io.appmetrica.analytics.billingv6.impl.h */
/* loaded from: classes.dex */
public final class C1001h extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ C1004k f4193a;

    /* renamed from: b */
    public final /* synthetic */ BillingResult f4194b;

    /* renamed from: c */
    public final /* synthetic */ List f4195c;

    public C1001h(C1004k c1004k, BillingResult billingResult, List list) {
        this.f4193a = c1004k;
        this.f4194b = billingResult;
        this.f4195c = list;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C1004k c1004k = this.f4193a;
        BillingResult billingResult = this.f4194b;
        List list = this.f4195c;
        c1004k.getClass();
        if (billingResult.getResponseCode() == 0 && !list.isEmpty()) {
            UtilsProvider utilsProvider = c1004k.f4202c;
            InterfaceC2799a interfaceC2799a = c1004k.f4203d;
            List list2 = c1004k.f4204e;
            C1000g c1000g = c1004k.f4205f;
            C1011r c1011r = new C1011r(utilsProvider, interfaceC2799a, list2, list, c1000g);
            c1000g.f4192c.add(c1011r);
            c1004k.f4202c.getUiExecutor().execute(new C1003j(c1004k, c1011r));
        }
        C1004k c1004k2 = this.f4193a;
        c1004k2.f4205f.m2655a(c1004k2);
    }
}
