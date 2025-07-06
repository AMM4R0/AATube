package io.appmetrica.analytics.impl;

import p002A1.AbstractC0008a;

/* renamed from: io.appmetrica.analytics.impl.G9 */
/* loaded from: classes.dex */
public abstract class AbstractC1220G9 {
    /* renamed from: a */
    public static final C1070A9 m2898a(int r12, String str) {
        byte[] bArr;
        C1070A9 c1070a9 = new C1070A9();
        c1070a9.f4461a = r12;
        if (str == null || (bArr = str.getBytes(AbstractC0008a.f6a)) == null) {
            bArr = c1070a9.f4462b;
        }
        c1070a9.f4462b = bArr;
        return c1070a9;
    }
}
