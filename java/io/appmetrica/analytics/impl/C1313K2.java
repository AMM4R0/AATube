package io.appmetrica.analytics.impl;

import android.app.ActivityManager;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;

/* renamed from: io.appmetrica.analytics.impl.K2 */
/* loaded from: classes.dex */
public final class C1313K2 implements FunctionWithThrowable {

    /* renamed from: a */
    public static final C1313K2 f4939a = new C1313K2();

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public final Object apply(Object obj) {
        boolean isBackgroundRestricted;
        isBackgroundRestricted = ((ActivityManager) obj).isBackgroundRestricted();
        return Boolean.valueOf(isBackgroundRestricted);
    }
}
