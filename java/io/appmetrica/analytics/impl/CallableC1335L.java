package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import java.util.concurrent.Callable;

/* renamed from: io.appmetrica.analytics.impl.L */
/* loaded from: classes.dex */
public final class CallableC1335L implements Callable {

    /* renamed from: a */
    public final /* synthetic */ Context f4981a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC1951ji f4982b;

    /* renamed from: c */
    public final /* synthetic */ C1534T f4983c;

    public CallableC1335L(C1534T c1534t, Context context, InterfaceC1951ji interfaceC1951ji) {
        this.f4983c = c1534t;
        this.f4981a = context;
        this.f4982b = interfaceC1951ji;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        AdvertisingIdsHolder advertisingIdsHolder = this.f4983c.f5450m;
        C1534T c1534t = this.f4983c;
        AdTrackingInfoResult m3330a = C1534T.m3330a(c1534t, this.f4981a);
        AdTrackingInfoResult google = advertisingIdsHolder.getGoogle();
        IdentifierStatus identifierStatus = m3330a.mStatus;
        IdentifierStatus identifierStatus2 = IdentifierStatus.OK;
        if (identifierStatus != identifierStatus2) {
            m3330a = new AdTrackingInfoResult(google.mAdTrackingInfo, identifierStatus, m3330a.mErrorExplanation);
        }
        AdTrackingInfoResult m3331b = C1534T.m3331b(this.f4983c, this.f4981a);
        AdTrackingInfoResult huawei = advertisingIdsHolder.getHuawei();
        IdentifierStatus identifierStatus3 = m3331b.mStatus;
        if (identifierStatus3 != identifierStatus2) {
            m3331b = new AdTrackingInfoResult(huawei.mAdTrackingInfo, identifierStatus3, m3331b.mErrorExplanation);
        }
        C1534T c1534t2 = this.f4983c;
        AdTrackingInfoResult mo2849a = c1534t2.f5444g.mo3074a(c1534t2.f5440c) ? c1534t2.f5447j.mo2849a(this.f4981a, this.f4982b) : new AdTrackingInfoResult(null, IdentifierStatus.UNKNOWN, "identifiers collecting is forbidden for unknown reason");
        AdTrackingInfoResult yandex = advertisingIdsHolder.getYandex();
        IdentifierStatus identifierStatus4 = mo2849a.mStatus;
        if (identifierStatus4 != identifierStatus2) {
            mo2849a = new AdTrackingInfoResult(yandex.mAdTrackingInfo, identifierStatus4, mo2849a.mErrorExplanation);
        }
        c1534t.f5450m = new AdvertisingIdsHolder(m3330a, m3331b, mo2849a);
        return null;
    }
}
