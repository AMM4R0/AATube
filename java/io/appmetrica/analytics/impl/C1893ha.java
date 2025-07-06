package io.appmetrica.analytics.impl;

import java.util.Map;
import p002A1.AbstractC0008a;
import p108m1.AbstractC2660j;

/* renamed from: io.appmetrica.analytics.impl.ha */
/* loaded from: classes.dex */
public final class C1893ha implements InterfaceC1395N9 {

    /* renamed from: a */
    public final C1269I8 f6403a = new C1269I8();

    /* renamed from: a */
    public final C1792d9[] m3940a(byte[] bArr) {
        int r02 = 0;
        if (bArr == null) {
            return new C1792d9[0];
        }
        Map<String, byte[]> model = this.f6403a.toModel(bArr);
        int size = model.size();
        C1792d9[] c1792d9Arr = new C1792d9[size];
        for (int r3 = 0; r3 < size; r3++) {
            c1792d9Arr[r3] = new C1792d9();
        }
        for (Object obj : model.entrySet()) {
            int r32 = r02 + 1;
            if (r02 < 0) {
                AbstractC2660j.m5121Y();
                throw null;
            }
            Map.Entry entry = (Map.Entry) obj;
            C1792d9 c1792d9 = c1792d9Arr[r02];
            c1792d9.f6084a = ((String) entry.getKey()).getBytes(AbstractC0008a.f6a);
            c1792d9.f6085b = (byte[]) entry.getValue();
            r02 = r32;
        }
        return c1792d9Arr;
    }
}
