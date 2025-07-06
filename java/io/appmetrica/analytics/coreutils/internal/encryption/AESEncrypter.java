package io.appmetrica.analytics.coreutils.internal.encryption;

import android.annotation.SuppressLint;
import io.appmetrica.analytics.coreapi.internal.crypto.Encrypter;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public class AESEncrypter implements Encrypter {
    public static final String DEFAULT_ALGORITHM = "AES/CBC/PKCS5Padding";
    public static final int DEFAULT_KEY_LENGTH = 16;
    public static final String TAG = "[AESEncrypter]";

    /* renamed from: a */
    private final String f4322a;

    /* renamed from: b */
    private final byte[] f4323b;

    /* renamed from: c */
    private final byte[] f4324c;

    public AESEncrypter(String str, byte[] bArr, byte[] bArr2) {
        this.f4322a = str;
        this.f4323b = bArr;
        this.f4324c = bArr2;
    }

    @SuppressLint({"TrulyRandom"})
    public byte[] decrypt(byte[] bArr) {
        return decrypt(bArr, 0, bArr.length);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.crypto.Encrypter
    @SuppressLint({"TrulyRandom"})
    public byte[] encrypt(byte[] bArr) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(this.f4323b, "AES");
            Cipher cipher = Cipher.getInstance(this.f4322a);
            cipher.init(1, secretKeySpec, new IvParameterSpec(this.f4324c));
            return cipher.doFinal(bArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    public String getAlgorithm() {
        return this.f4322a;
    }

    public byte[] getIV() {
        return this.f4324c;
    }

    public byte[] getPassword() {
        return this.f4323b;
    }

    public byte[] decrypt(byte[] bArr, int r6, int r7) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(this.f4323b, "AES");
            Cipher cipher = Cipher.getInstance(this.f4322a);
            cipher.init(2, secretKeySpec, new IvParameterSpec(this.f4324c));
            return cipher.doFinal(bArr, r6, r7);
        } catch (Throwable unused) {
            return null;
        }
    }
}
