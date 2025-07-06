package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.H8 */
/* loaded from: classes.dex */
public enum EnumC1244H8 {
    NONE(0),
    EXTERNALLY_ENCRYPTED_EVENT_CRYPTER(1),
    AES_VALUE_ENCRYPTION(2);


    /* renamed from: a */
    public final int f4820a;

    EnumC1244H8(int r3) {
        this.f4820a = r3;
    }

    /* renamed from: a */
    public static EnumC1244H8 m2926a(Integer num) {
        if (num != null) {
            for (EnumC1244H8 enumC1244H8 : values()) {
                if (enumC1244H8.f4820a == num.intValue()) {
                    return enumC1244H8;
                }
            }
        }
        return NONE;
    }
}
