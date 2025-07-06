package io.appmetrica.analytics.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;

/* renamed from: io.appmetrica.analytics.impl.ym */
/* loaded from: classes.dex */
public final class C2330ym implements FunctionWithThrowable {

    /* renamed from: a */
    public static final C2330ym f7508a = new C2330ym();

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public final Object apply(Object obj) {
        return ((Activity) obj).getIntent();
    }
}
