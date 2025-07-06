package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.internal.IdentifiersResult;

/* renamed from: io.appmetrica.analytics.impl.J */
/* loaded from: classes.dex */
public final class C1285J {
    /* renamed from: a */
    public static AdvIdentifiersResult.AdvId m2977a(IdentifiersResult identifiersResult) {
        AdvIdentifiersResult.Details details;
        String str = identifiersResult == null ? null : identifiersResult.f7574id;
        if (identifiersResult == null) {
            details = AdvIdentifiersResult.Details.INTERNAL_ERROR;
        } else {
            int r3 = AbstractC1260I.f4828a[identifiersResult.status.ordinal()];
            details = r3 != 1 ? r3 != 2 ? r3 != 3 ? r3 != 4 ? r3 != 5 ? AdvIdentifiersResult.Details.INTERNAL_ERROR : AdvIdentifiersResult.Details.INVALID_ADV_ID : AdvIdentifiersResult.Details.IDENTIFIER_PROVIDER_UNAVAILABLE : AdvIdentifiersResult.Details.FEATURE_DISABLED : AdvIdentifiersResult.Details.NO_STARTUP : AdvIdentifiersResult.Details.OK;
        }
        return new AdvIdentifiersResult.AdvId(str, details, identifiersResult != null ? identifiersResult.errorExplanation : null);
    }
}
