package io.appmetrica.analytics.location.impl;

import io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProviderFactory;

/* renamed from: io.appmetrica.analytics.location.impl.o */
/* loaded from: classes.dex */
public final class C2375o implements LocationReceiverProviderFactory {

    /* renamed from: a */
    public final C2377q f7612a;

    public C2375o(C2377q c2377q) {
        this.f7612a = c2377q;
    }

    /* renamed from: a */
    public final C2377q m4734a() {
        return this.f7612a;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationReceiverProviderFactory
    public final LocationReceiverProvider getPassiveLocationReceiverProvider() {
        return this.f7612a;
    }
}
