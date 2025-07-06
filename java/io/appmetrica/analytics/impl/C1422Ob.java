package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProviderFactory;

/* renamed from: io.appmetrica.analytics.impl.Ob */
/* loaded from: classes.dex */
public final class C1422Ob implements LocationReceiverProviderFactory {

    /* renamed from: a */
    public final C1447Pb f5165a = new C1447Pb();

    @Override // io.appmetrica.analytics.locationapi.internal.LocationReceiverProviderFactory
    public final LocationReceiverProvider getPassiveLocationReceiverProvider() {
        return this.f5165a;
    }
}
