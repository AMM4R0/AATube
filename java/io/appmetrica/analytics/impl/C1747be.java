package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.AndroidUtils;

/* renamed from: io.appmetrica.analytics.impl.be */
/* loaded from: classes.dex */
public final class C1747be extends C2220uc {
    public C1747be() {
        super(EnumC1847fe.UNDEFINED);
        m4483a(1, EnumC1847fe.WIFI);
        m4483a(0, EnumC1847fe.CELL);
        m4483a(7, EnumC1847fe.BLUETOOTH);
        m4483a(9, EnumC1847fe.ETHERNET);
        m4483a(4, EnumC1847fe.MOBILE_DUN);
        m4483a(5, EnumC1847fe.MOBILE_HIPRI);
        m4483a(2, EnumC1847fe.MOBILE_MMS);
        m4483a(3, EnumC1847fe.MOBILE_SUPL);
        m4483a(6, EnumC1847fe.WIMAX);
        if (AndroidUtils.isApiAchieved(21)) {
            m4483a(17, EnumC1847fe.VPN);
        }
    }
}
