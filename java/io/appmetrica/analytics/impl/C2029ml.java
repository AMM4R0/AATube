package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.StartupParamsItem;
import io.appmetrica.analytics.StartupParamsItemStatus;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;

/* renamed from: io.appmetrica.analytics.impl.ml */
/* loaded from: classes.dex */
public final class C2029ml {

    /* renamed from: a */
    public final C2079ol f6781a = new C2079ol();

    /* renamed from: a */
    public final StartupParamsItem m4226a(IdentifiersResult identifiersResult) {
        String str = identifiersResult.f7574id;
        C2079ol c2079ol = this.f6781a;
        IdentifierStatus identifierStatus = identifiersResult.status;
        c2079ol.getClass();
        int r2 = AbstractC2054nl.f6828a[identifierStatus.ordinal()];
        return new StartupParamsItem(str, r2 != 1 ? r2 != 2 ? r2 != 3 ? r2 != 4 ? r2 != 5 ? StartupParamsItemStatus.UNKNOWN_ERROR : StartupParamsItemStatus.FEATURE_DISABLED : StartupParamsItemStatus.NETWORK_ERROR : StartupParamsItemStatus.INVALID_VALUE_FROM_PROVIDER : StartupParamsItemStatus.PROVIDER_UNAVAILABLE : StartupParamsItemStatus.OK, identifiersResult.errorExplanation);
    }
}
