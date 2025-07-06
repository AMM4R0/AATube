package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfo;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;

/* renamed from: io.appmetrica.analytics.impl.H */
/* loaded from: classes.dex */
public final class C1235H implements InterfaceC1160E {

    /* renamed from: a */
    public final InterfaceC1160E f4807a;

    public C1235H(InterfaceC1160E interfaceC1160E) {
        this.f4807a = interfaceC1160E;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1160E
    /* renamed from: a */
    public final AdTrackingInfoResult mo2848a(Context context) {
        return m2923a(new C1185F(this, context));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1160E
    /* renamed from: a */
    public final AdTrackingInfoResult mo2849a(Context context, InterfaceC1951ji interfaceC1951ji) {
        return m2923a(new C1210G(this, context, interfaceC1951ji));
    }

    /* renamed from: a */
    public static AdTrackingInfoResult m2923a(Provider provider) {
        AdTrackingInfoResult adTrackingInfoResult = (AdTrackingInfoResult) provider.get();
        AdTrackingInfo adTrackingInfo = adTrackingInfoResult.mAdTrackingInfo;
        return (adTrackingInfo == null || !"00000000-0000-0000-0000-000000000000".equals(adTrackingInfo.advId)) ? adTrackingInfoResult : new AdTrackingInfoResult(null, IdentifierStatus.INVALID_ADV_ID, "AdvId is invalid: 00000000-0000-0000-0000-000000000000");
    }
}
