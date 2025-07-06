package io.appmetrica.analytics.gpllibrary.internal;

import android.location.Location;
import android.location.LocationListener;
import p026J0.InterfaceC0222c;

/* loaded from: classes.dex */
class GplOnSuccessListener implements InterfaceC0222c {

    /* renamed from: a */
    private final LocationListener f4417a;

    public GplOnSuccessListener(LocationListener locationListener) {
        this.f4417a = locationListener;
    }

    @Override // p026J0.InterfaceC0222c
    public void onSuccess(Location location) {
        this.f4417a.onLocationChanged(location);
    }
}
