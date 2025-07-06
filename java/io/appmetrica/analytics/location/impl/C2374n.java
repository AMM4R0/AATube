package io.appmetrica.analytics.location.impl;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.location.impl.n */
/* loaded from: classes.dex */
public final class C2374n implements LocationListener {

    /* renamed from: a */
    public final C2376p f7611a;

    public C2374n(C2376p c2376p) {
        this.f7611a = c2376p;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        if (location != null) {
            C2376p c2376p = this.f7611a;
            c2376p.getClass();
            String provider = location.getProvider();
            C2382v c2382v = (C2382v) c2376p.f7617e.get(provider);
            if (c2382v == null) {
                C2382v c2382v2 = new C2382v(c2376p.f7613a.f7591a);
                c2382v2.f7626c.add(c2376p.f7615c);
                Iterator it = c2376p.f7616d.iterator();
                while (it.hasNext()) {
                    c2382v2.f7626c.add((Consumer) it.next());
                }
                c2376p.f7617e.put(provider, c2382v2);
                c2382v = c2382v2;
            } else {
                c2382v.f7624a = c2376p.f7613a.f7591a;
            }
            if (c2382v.f7627d != null) {
                boolean didTimePassMillis = c2382v.f7625b.didTimePassMillis(c2382v.f7628e, c2382v.f7624a.getUpdateTimeInterval(), "isSavedLocationOutdated");
                boolean z2 = location.distanceTo(c2382v.f7627d) > c2382v.f7624a.getUpdateDistanceInterval();
                boolean z3 = c2382v.f7627d == null || location.getTime() - c2382v.f7627d.getTime() >= 0;
                if ((!didTimePassMillis && !z2) || !z3) {
                    return;
                }
            }
            c2382v.f7627d = location;
            c2382v.f7628e = System.currentTimeMillis();
            Iterator it2 = c2382v.f7626c.iterator();
            while (it2.hasNext()) {
                ((Consumer) it2.next()).consume(location);
            }
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int r2, Bundle bundle) {
    }
}
