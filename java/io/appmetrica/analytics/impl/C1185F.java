package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;

/* renamed from: io.appmetrica.analytics.impl.F */
/* loaded from: classes.dex */
public final class C1185F implements Provider {

    /* renamed from: a */
    public final /* synthetic */ Context f4716a;

    /* renamed from: b */
    public final /* synthetic */ C1235H f4717b;

    public C1185F(C1235H c1235h, Context context) {
        this.f4717b = c1235h;
        this.f4716a = context;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final AdTrackingInfoResult get() {
        return this.f4717b.f4807a.mo2848a(this.f4716a);
    }
}
