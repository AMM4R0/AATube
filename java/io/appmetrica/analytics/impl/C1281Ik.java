package io.appmetrica.analytics.impl;

import android.annotation.TargetApi;
import android.telephony.SubscriptionInfo;
import io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline;
import io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils;

@DoNotInline
@TargetApi(C1842f9.f6214K)
/* renamed from: io.appmetrica.analytics.impl.Ik */
/* loaded from: classes.dex */
public final class C1281Ik {

    /* renamed from: a */
    public static final C1281Ik f4881a = new C1281Ik();

    private C1281Ik() {
    }

    /* renamed from: a */
    public static final Integer m2968a(SubscriptionInfo subscriptionInfo) {
        String mccString;
        mccString = subscriptionInfo.getMccString();
        return ParseUtils.intValueOf(mccString);
    }

    /* renamed from: b */
    public static final Integer m2969b(SubscriptionInfo subscriptionInfo) {
        String mncString;
        mncString = subscriptionInfo.getMncString();
        return ParseUtils.intValueOf(mncString);
    }
}
