package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import io.appmetrica.analytics.coreutils.internal.p097io.GZIPCompressor;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.w3 */
/* loaded from: classes.dex */
public final class C2261w3 {

    /* renamed from: a */
    public final C2236v3 f7333a;

    /* renamed from: b */
    public final GZIPCompressor f7334b;

    public C2261w3() {
        this(new C2236v3(), new GZIPCompressor());
    }

    /* renamed from: a */
    public final byte[] m4532a(byte[] bArr) {
        try {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
            C2236v3 c2236v3 = this.f7333a;
            byte[] bytes = "hBnBQbZrmjPXEWVJ".getBytes();
            c2236v3.getClass();
            AESEncrypter aESEncrypter = new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, bytes, copyOfRange);
            if (bArr != null && bArr.length != 0) {
                return this.f7334b.uncompress(aESEncrypter.decrypt(bArr, 16, bArr.length - 16));
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public C2261w3(C2236v3 c2236v3, GZIPCompressor gZIPCompressor) {
        this.f7333a = c2236v3;
        this.f7334b = gZIPCompressor;
    }
}
