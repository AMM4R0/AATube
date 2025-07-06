package io.appmetrica.analytics.location.impl;

import android.location.LocationManager;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import p105l1.C2636g;

/* renamed from: io.appmetrica.analytics.location.impl.r */
/* loaded from: classes.dex */
public final class C2378r implements FunctionWithThrowable {

    /* renamed from: a */
    public final /* synthetic */ C2380t f7620a;

    public C2378r(C2380t c2380t) {
        this.f7620a = c2380t;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public final Object apply(Object obj) {
        LocationManager locationManager = (LocationManager) obj;
        C2380t c2380t = this.f7620a;
        locationManager.requestLocationUpdates(c2380t.f7633d, c2380t.f7623f, 0.0f, c2380t.f7632c, c2380t.f7622e);
        return C2636g.f8557a;
    }
}
