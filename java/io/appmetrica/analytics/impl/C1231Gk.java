package io.appmetrica.analytics.impl;

import android.telephony.SubscriptionManager;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;

/* renamed from: io.appmetrica.analytics.impl.Gk */
/* loaded from: classes.dex */
public final class C1231Gk implements FunctionWithThrowable {

    /* renamed from: a */
    public static final C1231Gk f4803a = new C1231Gk();

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public final Object apply(Object obj) {
        return ((SubscriptionManager) obj).getActiveSubscriptionInfoList();
    }
}
