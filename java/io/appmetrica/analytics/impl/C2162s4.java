package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.s4 */
/* loaded from: classes.dex */
public final class C2162s4 {

    /* renamed from: a */
    public final C1606Vl f7109a;

    /* renamed from: b */
    public final C1534T f7110b;

    /* renamed from: c */
    public final Context f7111c;

    public C2162s4(C1606Vl c1606Vl, C1534T c1534t, Context context) {
        this.f7109a = c1606Vl;
        this.f7110b = c1534t;
        this.f7111c = context;
    }

    /* renamed from: a */
    public final C2137r4 m4410a(HashMap hashMap) {
        C2354zl m3442e = this.f7109a.m3442e();
        C1534T c1534t = this.f7110b;
        Context context = this.f7111c;
        c1534t.getClass();
        AdvertisingIdsHolder mo3334a = c1534t.mo3334a(context, new C2346zd());
        return new C2137r4(C2137r4.m4368a(m3442e.f7542d), C2137r4.m4368a(m3442e.f7539a), C2137r4.m4368a(m3442e.f7540b), C2137r4.m4368a(m3442e.f7548j), C2137r4.m4368a(m3442e.f7547i), C2137r4.m4368a(AbstractC1794db.m3747a(AbstractC1730am.m3629a(m3442e.f7549k))), C2137r4.m4368a(AbstractC1794db.m3747a(hashMap)), new IdentifiersResult(mo3334a.getGoogle().mAdTrackingInfo == null ? null : mo3334a.getGoogle().mAdTrackingInfo.advId, mo3334a.getGoogle().mStatus, mo3334a.getGoogle().mErrorExplanation), new IdentifiersResult(mo3334a.getHuawei().mAdTrackingInfo == null ? null : mo3334a.getHuawei().mAdTrackingInfo.advId, mo3334a.getHuawei().mStatus, mo3334a.getHuawei().mErrorExplanation), new IdentifiersResult(mo3334a.getYandex().mAdTrackingInfo != null ? mo3334a.getYandex().mAdTrackingInfo.advId : null, mo3334a.getYandex().mStatus, mo3334a.getYandex().mErrorExplanation), C2137r4.m4368a(AbstractC1794db.m3748a(m3442e.f7546h)), AbstractC1632Wm.m3499a(), m3442e.f7553o + m3442e.f7536A.f5697a, C2137r4.m4366a(m3442e.f7552n.f4727f));
    }
}
