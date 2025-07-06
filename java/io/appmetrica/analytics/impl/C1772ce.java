package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.AndroidUtils;

/* renamed from: io.appmetrica.analytics.impl.ce */
/* loaded from: classes.dex */
public final class C1772ce extends C2220uc {
    public C1772ce() {
        super(EnumC1847fe.UNDEFINED);
        m4483a(1, EnumC1847fe.WIFI);
        m4483a(0, EnumC1847fe.CELL);
        m4483a(3, EnumC1847fe.ETHERNET);
        m4483a(2, EnumC1847fe.BLUETOOTH);
        m4483a(4, EnumC1847fe.VPN);
        if (AndroidUtils.isApiAchieved(27)) {
            m4483a(6, EnumC1847fe.LOWPAN);
        }
        if (AndroidUtils.isApiAchieved(26)) {
            m4483a(5, EnumC1847fe.WIFI_AWARE);
        }
    }
}
