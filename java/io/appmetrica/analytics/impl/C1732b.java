package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import android.util.Base64;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;

/* renamed from: io.appmetrica.analytics.impl.b */
/* loaded from: classes.dex */
public final class C1732b implements InterfaceC1194F8 {

    /* renamed from: a */
    public final AESEncrypter f5897a;

    public C1732b() {
        this(new C1707a(C2018ma.m4192h().m4199e()));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1194F8
    /* renamed from: a */
    public final C2341z8 mo2871a(C1615W5 c1615w5) {
        byte[] encrypt;
        String encodeToString;
        String value = c1615w5.getValue();
        if (!TextUtils.isEmpty(value)) {
            try {
                encrypt = this.f5897a.encrypt(value.getBytes("UTF-8"));
            } catch (Throwable unused) {
            }
            if (encrypt != null) {
                encodeToString = Base64.encodeToString(encrypt, 0);
                c1615w5.setValue(encodeToString);
                return new C2341z8(c1615w5, EnumC1244H8.AES_VALUE_ENCRYPTION);
            }
        }
        encodeToString = null;
        c1615w5.setValue(encodeToString);
        return new C2341z8(c1615w5, EnumC1244H8.AES_VALUE_ENCRYPTION);
    }

    public C1732b(C1707a c1707a) {
        this(new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, c1707a.m3580b(), c1707a.m3579a()));
    }

    public C1732b(AESEncrypter aESEncrypter) {
        this.f5897a = aESEncrypter;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1194F8
    /* renamed from: a */
    public final byte[] mo2872a(byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (bArr == null || bArr.length <= 0) {
            return bArr2;
        }
        try {
            return this.f5897a.decrypt(Base64.decode(bArr, 0));
        } catch (Throwable unused) {
            return bArr2;
        }
    }

    /* renamed from: a */
    public final EnumC1244H8 m3632a() {
        return EnumC1244H8.AES_VALUE_ENCRYPTION;
    }
}
