package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AutoAdType;

/* renamed from: io.appmetrica.analytics.impl.v2 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC2235v2 {

    /* renamed from: a */
    public static final /* synthetic */ int[] f7255a;

    static {
        int[] r02 = new int[AutoAdType.values().length];
        r02[AutoAdType.NATIVE.ordinal()] = 1;
        r02[AutoAdType.BANNER.ordinal()] = 2;
        r02[AutoAdType.REWARDED.ordinal()] = 3;
        r02[AutoAdType.INTERSTITIAL.ordinal()] = 4;
        r02[AutoAdType.MREC.ordinal()] = 5;
        r02[AutoAdType.OTHER.ordinal()] = 6;
        f7255a = r02;
    }
}
