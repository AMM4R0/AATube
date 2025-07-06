package io.appmetrica.analytics.adrevenue.fyber.p092v3.impl;

import com.fyber.fairbid.ads.PlacementType;

/* renamed from: io.appmetrica.analytics.adrevenue.fyber.v3.impl.a */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0985a {

    /* renamed from: a */
    public static final /* synthetic */ int[] f4160a;

    static {
        int[] r02 = new int[PlacementType.values().length];
        f4160a = r02;
        try {
            r02[PlacementType.BANNER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f4160a[PlacementType.REWARDED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f4160a[PlacementType.INTERSTITIAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
