package io.appmetrica.analytics.impl;

import android.util.Base64;

/* renamed from: io.appmetrica.analytics.impl.L9 */
/* loaded from: classes.dex */
public final class C1345L9 implements InterfaceC1194F8 {
    @Override // io.appmetrica.analytics.impl.InterfaceC1194F8
    /* renamed from: a */
    public final C2341z8 mo2871a(C1615W5 c1615w5) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1194F8
    /* renamed from: a */
    public final byte[] mo2872a(byte[] bArr) {
        try {
            return Base64.decode(bArr, 0);
        } catch (Throwable unused) {
            return new byte[0];
        }
    }

    /* renamed from: a */
    public final EnumC1244H8 m3044a() {
        return EnumC1244H8.EXTERNALLY_ENCRYPTED_EVENT_CRYPTER;
    }
}
