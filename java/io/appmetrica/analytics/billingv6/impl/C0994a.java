package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import p108m1.AbstractC2660j;

/* renamed from: io.appmetrica.analytics.billingv6.impl.a */
/* loaded from: classes.dex */
public final class C0994a extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ C0997d f4175a;

    /* renamed from: b */
    public final /* synthetic */ BillingResult f4176b;

    public C0994a(C0997d c0997d, BillingResult billingResult) {
        this.f4175a = c0997d;
        this.f4176b = billingResult;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C0997d c0997d = this.f4175a;
        BillingResult billingResult = this.f4176b;
        c0997d.getClass();
        if (billingResult.getResponseCode() != 0) {
            return;
        }
        for (String str : AbstractC2660j.m5120X("inapp", "subs")) {
            BillingConfig billingConfig = c0997d.f4182a;
            BillingClient billingClient = c0997d.f4183b;
            UtilsProvider utilsProvider = c0997d.f4184c;
            C1000g c1000g = c0997d.f4185d;
            C1009p c1009p = new C1009p(billingConfig, billingClient, utilsProvider, str, c1000g);
            c1000g.f4192c.add(c1009p);
            c0997d.f4184c.getUiExecutor().execute(new C0996c(c0997d, str, c1009p));
        }
    }
}
