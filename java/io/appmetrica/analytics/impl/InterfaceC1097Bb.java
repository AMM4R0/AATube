package io.appmetrica.analytics.impl;

import android.location.Location;
import io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi;

/* renamed from: io.appmetrica.analytics.impl.Bb */
/* loaded from: classes.dex */
public interface InterfaceC1097Bb extends LocationServiceApi {
    /* renamed from: a */
    void mo2764a(Object obj);

    /* renamed from: a */
    void mo2765a(boolean z2);

    /* renamed from: b */
    void mo2766b(Object obj);

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    Location getLocation();

    void init();
}
