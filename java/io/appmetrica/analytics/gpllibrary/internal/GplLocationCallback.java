package io.appmetrica.analytics.gpllibrary.internal;

import android.location.LocationListener;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;

/* loaded from: classes.dex */
class GplLocationCallback extends LocationCallback {

    /* renamed from: a */
    private final LocationListener f4416a;

    public GplLocationCallback(LocationListener locationListener) {
        this.f4416a = locationListener;
    }

    public void onLocationResult(LocationResult locationResult) {
        this.f4416a.onLocationChanged(locationResult.getLastLocation());
    }
}
