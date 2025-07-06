package io.appmetrica.analytics.location.impl;

import android.location.Location;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.locationapi.internal.LocationFilter;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: io.appmetrica.analytics.location.impl.v */
/* loaded from: classes.dex */
public final class C2382v {

    /* renamed from: a */
    public LocationFilter f7624a;

    /* renamed from: d */
    public Location f7627d;

    /* renamed from: e */
    public long f7628e;

    /* renamed from: c */
    public final CopyOnWriteArrayList f7626c = new CopyOnWriteArrayList();

    /* renamed from: b */
    public final TimePassedChecker f7625b = new TimePassedChecker();

    public C2382v(LocationFilter locationFilter) {
        this.f7624a = locationFilter;
    }
}
