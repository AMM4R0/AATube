package io.appmetrica.analytics.impl;

import android.annotation.TargetApi;
import android.content.Context;
import android.telephony.SubscriptionInfo;
import io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.ArrayList;
import java.util.List;
import p108m1.AbstractC2661k;
import p108m1.C2668r;

@DoNotInline
@TargetApi(23)
/* renamed from: io.appmetrica.analytics.impl.Hk */
/* loaded from: classes.dex */
public final class C1256Hk {

    /* renamed from: a */
    public static final C1256Hk f4825a = new C1256Hk();

    private C1256Hk() {
    }

    /* renamed from: a */
    public static final List<C1081Ak> m2942a(Context context) {
        List<SubscriptionInfo> list = (List) SystemServiceUtils.accessSystemServiceByNameSafely(context, "telephony_subscription_service", "getting active subcription info list", "SubscriptionManager", C1231Gk.f4803a);
        if (list == null) {
            return C2668r.f8607a;
        }
        ArrayList arrayList = new ArrayList(AbstractC2661k.m5122Z(list));
        for (SubscriptionInfo subscriptionInfo : list) {
            Integer m2968a = AndroidUtils.isApiAchieved(29) ? C1281Ik.m2968a(subscriptionInfo) : Integer.valueOf(subscriptionInfo.getMcc());
            Integer m2969b = AndroidUtils.isApiAchieved(29) ? C1281Ik.m2969b(subscriptionInfo) : Integer.valueOf(subscriptionInfo.getMnc());
            boolean z2 = subscriptionInfo.getDataRoaming() == 1;
            CharSequence carrierName = subscriptionInfo.getCarrierName();
            arrayList.add(new C1081Ak(m2968a, m2969b, z2, carrierName != null ? carrierName.toString() : null));
        }
        return arrayList;
    }
}
