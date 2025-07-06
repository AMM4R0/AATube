package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.billinginterface.internal.Period;
import io.appmetrica.analytics.billinginterface.internal.ProductType;

/* renamed from: io.appmetrica.analytics.impl.ff */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1848ff {

    /* renamed from: a */
    public static final /* synthetic */ int[] f6266a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f6267b;

    static {
        int[] r02 = new int[Period.TimeUnit.values().length];
        f6267b = r02;
        try {
            r02[Period.TimeUnit.DAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f6267b[Period.TimeUnit.WEEK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f6267b[Period.TimeUnit.MONTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f6267b[Period.TimeUnit.YEAR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] r2 = new int[ProductType.values().length];
        f6266a = r2;
        try {
            r2[ProductType.INAPP.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f6266a[ProductType.SUBS.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
