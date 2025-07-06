package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.tm */
/* loaded from: classes.dex */
public final class C2205tm implements InterfaceC1259Hn {
    @Override // io.appmetrica.analytics.impl.InterfaceC1259Hn
    /* renamed from: a */
    public final byte[] mo2793a(C1369M8 c1369m8, C1501Rg c1501Rg) {
        return !TextUtils.isEmpty(c1369m8.f5032b) ? StringUtils.getUTF8Bytes(c1369m8.f5032b) : new byte[0];
    }
}
