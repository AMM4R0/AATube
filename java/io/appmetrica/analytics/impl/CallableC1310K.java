package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import java.util.concurrent.Callable;

/* renamed from: io.appmetrica.analytics.impl.K */
/* loaded from: classes.dex */
public final class CallableC1310K implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C1534T f4934a;

    public CallableC1310K(C1534T c1534t) {
        this.f4934a = c1534t;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C1534T c1534t = this.f4934a;
        AdTrackingInfoResult m3330a = C1534T.m3330a(c1534t, c1534t.f5448k);
        C1534T c1534t2 = this.f4934a;
        AdTrackingInfoResult m3331b = C1534T.m3331b(c1534t2, c1534t2.f5448k);
        C1534T c1534t3 = this.f4934a;
        c1534t.f5450m = new AdvertisingIdsHolder(m3330a, m3331b, c1534t3.f5444g.mo3074a(c1534t3.f5440c) ? c1534t3.f5447j.mo2849a(c1534t3.f5448k, new C2346zd()) : new AdTrackingInfoResult(null, IdentifierStatus.UNKNOWN, "identifiers collecting is forbidden for unknown reason"));
        return null;
    }
}
