package io.appmetrica.analytics.impl;

import android.telephony.TelephonyManager;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;

/* renamed from: io.appmetrica.analytics.impl.Ek */
/* loaded from: classes.dex */
public final class C1181Ek implements FunctionWithThrowable {

    /* renamed from: a */
    public final /* synthetic */ C1206Fk f4711a;

    public C1181Ek(C1206Fk c1206Fk) {
        this.f4711a = c1206Fk;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public final Object apply(Object obj) {
        TelephonyManager telephonyManager = (TelephonyManager) obj;
        C1206Fk c1206Fk = this.f4711a;
        if (c1206Fk.f4742b.hasPermission(c1206Fk.f4741a, "android.permission.READ_PHONE_STATE")) {
            return Boolean.valueOf(telephonyManager.isNetworkRoaming());
        }
        return null;
    }
}
