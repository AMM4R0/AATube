package io.appmetrica.analytics.locationapi.internal;

/* loaded from: classes.dex */
public interface LastKnownLocationExtractorProviderFactory {
    LastKnownLocationExtractorProvider getGplLastKnownLocationExtractorProvider();

    LastKnownLocationExtractorProvider getGpsLastKnownLocationExtractorProvider();

    LastKnownLocationExtractorProvider getNetworkLastKnownLocationExtractorProvider();

    LastKnownLocationExtractorProvider getPassiveLastKnownLocationExtractorProvider();
}
