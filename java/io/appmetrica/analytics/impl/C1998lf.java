package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import android.util.Base64;

/* renamed from: io.appmetrica.analytics.impl.lf */
/* loaded from: classes.dex */
public final class C1998lf implements InterfaceC1259Hn, InterfaceC2316y8 {
    @Override // io.appmetrica.analytics.impl.InterfaceC2316y8
    /* renamed from: a */
    public final int mo2856a(EnumC1244H8 enumC1244H8) {
        return 2;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1259Hn
    /* renamed from: a */
    public final byte[] mo2793a(C1369M8 c1369m8, C1501Rg c1501Rg) {
        return TextUtils.isEmpty(c1369m8.f5032b) ? new byte[0] : Base64.decode(c1369m8.f5032b, 0);
    }
}
