package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.p097io.Base64Utils;

/* renamed from: io.appmetrica.analytics.impl.dn */
/* loaded from: classes.dex */
public final class C1806dn implements InterfaceC1259Hn {

    /* renamed from: a */
    public final C1219G8 f6111a;

    public C1806dn() {
        this(new C1219G8());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1259Hn
    /* renamed from: a */
    public final byte[] mo2793a(C1369M8 c1369m8, C1501Rg c1501Rg) {
        byte[] bArr = new byte[0];
        try {
            bArr = Base64Utils.decompressBase64GzipAsBytes(c1369m8.f5032b);
        } catch (Throwable unused) {
        }
        byte[] mo2872a = ((InterfaceC1194F8) this.f6111a.f4778a.m4482a(c1369m8.f5045o)).mo2872a(bArr);
        return mo2872a == null ? new byte[0] : mo2872a;
    }

    public C1806dn(C1219G8 c1219g8) {
        this.f6111a = c1219g8;
    }

    /* renamed from: a */
    public final C1219G8 m3768a() {
        return this.f6111a;
    }
}
