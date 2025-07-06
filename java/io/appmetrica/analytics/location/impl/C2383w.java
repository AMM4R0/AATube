package io.appmetrica.analytics.location.impl;

import android.location.LocationManager;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;

/* renamed from: io.appmetrica.analytics.location.impl.w */
/* loaded from: classes.dex */
public final class C2383w implements FunctionWithThrowable {

    /* renamed from: a */
    public final /* synthetic */ C2384x f7629a;

    public C2383w(C2384x c2384x) {
        this.f7629a = c2384x;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public final Object apply(Object obj) {
        return ((LocationManager) obj).getLastKnownLocation(this.f7629a.f7633d);
    }
}
