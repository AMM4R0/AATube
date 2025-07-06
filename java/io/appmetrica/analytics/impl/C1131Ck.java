package io.appmetrica.analytics.impl;

import android.telephony.TelephonyManager;
import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;

/* renamed from: io.appmetrica.analytics.impl.Ck */
/* loaded from: classes.dex */
public final class C1131Ck implements FunctionWithThrowable {
    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public final Object apply(Object obj) {
        String simOperator = ((TelephonyManager) obj).getSimOperator();
        String substring = !TextUtils.isEmpty(simOperator) ? simOperator.substring(3) : null;
        if (TextUtils.isEmpty(substring)) {
            return null;
        }
        return Integer.valueOf(Integer.parseInt(substring));
    }
}
