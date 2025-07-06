package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.C8 */
/* loaded from: classes.dex */
public final class C1119C8 implements InterfaceC1259Hn {

    /* renamed from: a */
    public final C1219G8 f4570a;

    public C1119C8() {
        this(new C1219G8());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1259Hn
    /* renamed from: a */
    public final byte[] mo2793a(C1369M8 c1369m8, C1501Rg c1501Rg) {
        String str = c1369m8.f5032b;
        return ((InterfaceC1194F8) this.f4570a.f4778a.m4482a(c1369m8.f5045o)).mo2872a(str != null ? StringUtils.getUTF8Bytes(str) : new byte[0]);
    }

    public C1119C8(C1219G8 c1219g8) {
        this.f4570a = c1219g8;
    }
}
