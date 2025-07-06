package io.appmetrica.analytics.impl;

import android.util.Base64;

/* renamed from: io.appmetrica.analytics.impl.D3 */
/* loaded from: classes.dex */
public final class C1139D3 implements InterfaceC1259Hn {

    /* renamed from: a */
    public final C1219G8 f4623a;

    public C1139D3() {
        this(new C1219G8());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1259Hn
    /* renamed from: a */
    public final byte[] mo2793a(C1369M8 c1369m8, C1501Rg c1501Rg) {
        byte[] bArr = new byte[0];
        String str = c1369m8.f5032b;
        if (str != null) {
            try {
                bArr = Base64.decode(str, 0);
            } catch (Throwable unused) {
            }
        }
        C1219G8 c1219g8 = this.f4623a;
        return ((InterfaceC1194F8) c1219g8.f4778a.m4482a(c1369m8.f5045o)).mo2872a(bArr);
    }

    public C1139D3(C1219G8 c1219g8) {
        this.f4623a = c1219g8;
    }
}
