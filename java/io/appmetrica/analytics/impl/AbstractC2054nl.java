package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;

/* renamed from: io.appmetrica.analytics.impl.nl */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC2054nl {

    /* renamed from: a */
    public static final /* synthetic */ int[] f6828a;

    static {
        int[] r02 = new int[IdentifierStatus.values().length];
        r02[IdentifierStatus.OK.ordinal()] = 1;
        r02[IdentifierStatus.IDENTIFIER_PROVIDER_UNAVAILABLE.ordinal()] = 2;
        r02[IdentifierStatus.INVALID_ADV_ID.ordinal()] = 3;
        r02[IdentifierStatus.NO_STARTUP.ordinal()] = 4;
        r02[IdentifierStatus.FEATURE_DISABLED.ordinal()] = 5;
        f6828a = r02;
    }
}
