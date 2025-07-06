package io.appmetrica.analytics.location.impl;

import android.content.Context;
import android.location.Location;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.cache.LocationDataCacheUpdateScheduler;
import io.appmetrica.analytics.locationapi.internal.ILastKnownUpdater;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import io.appmetrica.analytics.locationapi.internal.LocationReceiver;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.location.impl.k */
/* loaded from: classes.dex */
public final class C2371k implements ILastKnownUpdater, LocationControllerObserver {

    /* renamed from: a */
    public final Context f7595a;

    /* renamed from: b */
    public final PermissionExtractor f7596b;

    /* renamed from: c */
    public final C2376p f7597c;

    /* renamed from: d */
    public final IHandlerExecutor f7598d;

    /* renamed from: e */
    public final C2374n f7599e;

    /* renamed from: f */
    public final LocationDataCacheUpdateScheduler f7600f;

    /* renamed from: g */
    public boolean f7601g;

    /* renamed from: h */
    public final HashMap f7602h = new HashMap();

    /* renamed from: i */
    public final HashMap f7603i = new HashMap();

    public C2371k(Context context, PermissionExtractor permissionExtractor, IHandlerExecutor iHandlerExecutor, C2376p c2376p) {
        this.f7595a = context;
        this.f7597c = c2376p;
        this.f7596b = permissionExtractor;
        this.f7598d = iHandlerExecutor;
        this.f7599e = new C2374n(c2376p);
        LocationDataCacheUpdateScheduler locationDataCacheUpdateScheduler = new LocationDataCacheUpdateScheduler(iHandlerExecutor, this, c2376p.m4735a(), "loc");
        this.f7600f = locationDataCacheUpdateScheduler;
        c2376p.m4735a().setUpdateScheduler(locationDataCacheUpdateScheduler);
    }

    /* renamed from: a */
    public final Location m4724a() {
        return (Location) this.f7597c.f7614b.getData();
    }

    /* renamed from: b */
    public final synchronized void m4728b() {
        try {
            this.f7600f.startUpdates();
            Iterator it = this.f7603i.values().iterator();
            while (it.hasNext()) {
                ((LocationReceiver) it.next()).startLocationUpdates();
            }
            updateLastKnown();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: c */
    public final synchronized void m4731c() {
        this.f7600f.stopUpdates();
        Iterator it = this.f7603i.values().iterator();
        while (it.hasNext()) {
            ((LocationReceiver) it.next()).stopLocationUpdates();
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final synchronized void startLocationTracking() {
        if (!this.f7601g) {
            this.f7601g = true;
            m4728b();
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final synchronized void stopLocationTracking() {
        if (this.f7601g) {
            this.f7601g = false;
            m4731c();
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.ILastKnownUpdater
    public final synchronized void updateLastKnown() {
        Iterator it = this.f7602h.values().iterator();
        while (it.hasNext()) {
            ((LastKnownLocationExtractor) it.next()).updateLastKnownLocation();
        }
    }

    /* renamed from: a */
    public final void m4725a(C2369i c2369i) {
        this.f7598d.execute(new RunnableC2370j(this, c2369i));
    }

    /* renamed from: a */
    public final synchronized void m4726a(LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        LastKnownLocationExtractor extractor = lastKnownLocationExtractorProvider.getExtractor(this.f7595a, this.f7596b, this.f7598d, this.f7599e);
        this.f7602h.put(lastKnownLocationExtractorProvider.getIdentifier(), extractor);
        if (this.f7601g) {
            extractor.updateLastKnownLocation();
        }
    }

    /* renamed from: b */
    public final synchronized void m4729b(LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        this.f7602h.remove(lastKnownLocationExtractorProvider.getIdentifier());
    }

    /* renamed from: b */
    public final synchronized void m4730b(LocationReceiverProvider locationReceiverProvider) {
        LocationReceiver locationReceiver = (LocationReceiver) this.f7603i.remove(locationReceiverProvider.getIdentifier());
        if (locationReceiver != null && this.f7601g) {
            locationReceiver.stopLocationUpdates();
        }
    }

    /* renamed from: a */
    public final synchronized void m4727a(LocationReceiverProvider locationReceiverProvider) {
        try {
            LocationReceiver locationReceiver = locationReceiverProvider.getLocationReceiver(this.f7595a, this.f7596b, this.f7598d, this.f7599e);
            LocationReceiver locationReceiver2 = (LocationReceiver) this.f7603i.put(locationReceiverProvider.getIdentifier(), locationReceiver);
            if (this.f7601g) {
                if (locationReceiver2 != null) {
                    locationReceiver2.stopLocationUpdates();
                }
                locationReceiver.startLocationUpdates();
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
