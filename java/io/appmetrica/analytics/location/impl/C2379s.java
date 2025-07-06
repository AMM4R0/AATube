package io.appmetrica.analytics.location.impl;

import android.location.LocationManager;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import p105l1.C2636g;

/* renamed from: io.appmetrica.analytics.location.impl.s */
/* loaded from: classes.dex */
public final class C2379s implements FunctionWithThrowable {

    /* renamed from: a */
    public final /* synthetic */ C2380t f7621a;

    public C2379s(C2380t c2380t) {
        this.f7621a = c2380t;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public final Object apply(Object obj) {
        ((LocationManager) obj).removeUpdates(this.f7621a.f7632c);
        return C2636g.f8557a;
    }
}
