package io.appmetrica.analytics.identifiers.impl;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import p124s0.C2736g;

/* renamed from: io.appmetrica.analytics.identifiers.impl.h */
/* loaded from: classes.dex */
public final class C1046h implements InterfaceC1040b {
    @Override // io.appmetrica.analytics.identifiers.impl.InterfaceC1040b
    /* renamed from: a */
    public final C1041c mo2673a(Context context) {
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            return new C1041c(IdentifierStatus.OK, new C1039a("google", advertisingIdInfo.getId(), Boolean.valueOf(advertisingIdInfo.isLimitAdTrackingEnabled())), null, 4);
        } catch (C2736g unused) {
            return new C1041c(IdentifierStatus.IDENTIFIER_PROVIDER_UNAVAILABLE, null, "could not resolve google services", 2);
        } catch (Throwable th) {
            return new C1041c(IdentifierStatus.UNKNOWN, null, "exception while fetching google adv_id: " + th.getMessage(), 2);
        }
    }
}
