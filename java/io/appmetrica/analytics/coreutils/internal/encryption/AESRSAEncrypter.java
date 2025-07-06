package io.appmetrica.analytics.coreutils.internal.encryption;

import android.annotation.SuppressLint;
import android.util.Base64;
import io.appmetrica.analytics.coreapi.internal.crypto.Encrypter;
import io.appmetrica.analytics.coreutils.internal.p097io.CloseableUtilsKt;
import java.io.ByteArrayOutputStream;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;

/* loaded from: classes.dex */
public class AESRSAEncrypter implements Encrypter {

    /* renamed from: a */
    private final String f4325a;

    /* renamed from: b */
    private final String f4326b;

    public AESRSAEncrypter() {
        this(0);
    }

    /* renamed from: a */
    public final byte[] m2660a(byte[] bArr, byte[] bArr2, byte[] bArr3, PublicKey publicKey) {
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] encrypt;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(bArr2.length + bArr3.length);
            byteArrayOutputStream2.write(bArr2);
            byteArrayOutputStream2.write(bArr3);
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            byteArrayOutputStream2.close();
            Cipher cipher = Cipher.getInstance(this.f4326b);
            cipher.init(1, publicKey);
            byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
            try {
                byteArrayOutputStream.write(cipher.doFinal(byteArray));
                encrypt = new AESEncrypter(this.f4325a, bArr2, bArr3).encrypt(bArr);
            } catch (Throwable unused) {
                CloseableUtilsKt.closeSafely(byteArrayOutputStream);
                return null;
            }
        } catch (Throwable unused2) {
            byteArrayOutputStream = null;
        }
        if (encrypt == null) {
            CloseableUtilsKt.closeSafely(byteArrayOutputStream);
            return null;
        }
        byteArrayOutputStream.write(encrypt);
        byte[] byteArray2 = byteArrayOutputStream.toByteArray();
        CloseableUtilsKt.closeSafely(byteArrayOutputStream);
        return byteArray2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.crypto.Encrypter
    @SuppressLint({"TrulyRandom"})
    public byte[] encrypt(byte[] bArr) {
        try {
            SecureRandom secureRandom = new SecureRandom();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[16];
            secureRandom.nextBytes(bArr3);
            secureRandom.nextBytes(bArr2);
            return m2660a(bArr, bArr3, bArr2, KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode("MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDhmH/m2qrRjxDHP794CeaZpENQNYydf8pqyXJilo6XxK+n+pvo27VxWfB3Z1yHrtKow+eZXKLQzrQ8wZMfRgADrYCQJ20y2hGZEUCN1tGSM+xqVKMeCtVi3NvQa54Cx7mT5ECVsH5DKEs/aeScDHP56FzcgEbtOSwyRZ8dsEM0wwIDAQAB", 0))));
        } catch (Throwable unused) {
            return null;
        }
    }

    public AESRSAEncrypter(int r12) {
        this.f4325a = AESEncrypter.DEFAULT_ALGORITHM;
        this.f4326b = "RSA/ECB/PKCS1Padding";
    }
}
