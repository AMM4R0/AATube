package io.appmetrica.analytics.location.impl;

import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory;

/* renamed from: io.appmetrica.analytics.location.impl.g */
/* loaded from: classes.dex */
public final class C2367g implements LastKnownLocationExtractorProviderFactory {

    /* renamed from: a */
    public final LastKnownLocationExtractorProvider f7586a;

    /* renamed from: b */
    public final C2363c f7587b = new C2363c("location-module-gpl");

    /* renamed from: c */
    public final C2385y f7588c = new C2385y("network", new C2366f(), "location-module-network");

    /* renamed from: d */
    public final C2385y f7589d = new C2385y("gps", new C2365e(), "location-module-gps");

    public C2367g(LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        this.f7586a = lastKnownLocationExtractorProvider;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory
    public final LastKnownLocationExtractorProvider getGplLastKnownLocationExtractorProvider() {
        return this.f7587b;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory
    public final LastKnownLocationExtractorProvider getGpsLastKnownLocationExtractorProvider() {
        return this.f7589d;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory
    public final LastKnownLocationExtractorProvider getNetworkLastKnownLocationExtractorProvider() {
        return this.f7588c;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory
    public final LastKnownLocationExtractorProvider getPassiveLastKnownLocationExtractorProvider() {
        return this.f7586a;
    }
}
