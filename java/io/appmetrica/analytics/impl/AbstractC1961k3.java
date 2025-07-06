package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.billinginterface.internal.ProductType;

/* renamed from: io.appmetrica.analytics.impl.k3 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1961k3 {

    /* renamed from: a */
    public static final /* synthetic */ int[] f6558a;

    static {
        int[] r02 = new int[ProductType.values().length];
        f6558a = r02;
        try {
            r02[ProductType.INAPP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f6558a[ProductType.SUBS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
