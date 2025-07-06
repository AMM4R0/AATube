package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.LocationManager;

/* renamed from: io.appmetrica.analytics.impl.G2 */
/* loaded from: classes.dex */
public final class C1213G2 {

    /* renamed from: a */
    public final LocationManager f4765a;

    public C1213G2(Context context) {
        this((LocationManager) context.getSystemService("location"));
    }

    public C1213G2(LocationManager locationManager) {
        this.f4765a = locationManager;
    }
}
