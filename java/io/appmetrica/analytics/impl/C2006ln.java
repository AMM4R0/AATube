package io.appmetrica.analytics.impl;

import android.os.UserManager;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;

/* renamed from: io.appmetrica.analytics.impl.ln */
/* loaded from: classes.dex */
public final class C2006ln implements FunctionWithThrowable {
    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public final Object apply(Object obj) {
        boolean isUserUnlocked;
        isUserUnlocked = ((UserManager) obj).isUserUnlocked();
        return Boolean.valueOf(isUserUnlocked);
    }
}
