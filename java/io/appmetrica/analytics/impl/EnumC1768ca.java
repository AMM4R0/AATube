package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ca */
/* loaded from: classes.dex */
public enum EnumC1768ca {
    UNKNOWN(0),
    FIRST_OCCURRENCE(1),
    NON_FIRST_OCCURENCE(2);


    /* renamed from: a */
    public final int f6047a;

    EnumC1768ca(int r3) {
        this.f6047a = r3;
    }

    /* renamed from: a */
    public static EnumC1768ca m3712a(Integer num) {
        if (num != null) {
            for (EnumC1768ca enumC1768ca : values()) {
                if (enumC1768ca.f6047a == num.intValue()) {
                    return enumC1768ca;
                }
            }
        }
        return UNKNOWN;
    }
}
