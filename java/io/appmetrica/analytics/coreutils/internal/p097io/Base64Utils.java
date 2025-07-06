package io.appmetrica.analytics.coreutils.internal.p097io;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.util.zip.GZIPInputStream;
import p002A1.AbstractC0008a;
import p103k0.AbstractC2480a;

/* loaded from: classes.dex */
public final class Base64Utils {
    public static final Base64Utils INSTANCE = new Base64Utils();
    public static final int IO_BUFFER_SIZE = 4096;

    private Base64Utils() {
    }

    public static final String compressBase64(byte[] bArr) {
        try {
            return Base64.encodeToString(GZIPUtils.gzipBytes(bArr), 0);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final String compressBase64String(String str) {
        byte[] bytes;
        if (str != null) {
            try {
                bytes = str.getBytes(AbstractC0008a.f6a);
            } catch (Throwable unused) {
                return null;
            }
        } else {
            bytes = null;
        }
        return compressBase64(bytes);
    }

    public static final byte[] decompressBase64GzipAsBytes(String str) {
        GZIPInputStream gZIPInputStream;
        byte[] bArr;
        ByteArrayInputStream byteArrayInputStream;
        ByteArrayInputStream byteArrayInputStream2 = null;
        try {
            byteArrayInputStream = new ByteArrayInputStream(Base64.decode(str, 0));
            try {
                gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            } catch (Throwable unused) {
                gZIPInputStream = null;
            }
        } catch (Throwable unused2) {
            gZIPInputStream = null;
        }
        try {
            bArr = AbstractC2480a.m4873N(gZIPInputStream);
        } catch (Throwable unused3) {
            byteArrayInputStream2 = byteArrayInputStream;
            try {
                bArr = new byte[0];
                byteArrayInputStream = byteArrayInputStream2;
                return bArr;
            } finally {
                CloseableUtilsKt.closeSafely(gZIPInputStream);
                CloseableUtilsKt.closeSafely(byteArrayInputStream2);
            }
        }
        return bArr;
    }

    public static final String decompressBase64GzipAsString(String str) {
        try {
            return new String(decompressBase64GzipAsBytes(str), AbstractC0008a.f6a);
        } catch (Throwable unused) {
            return null;
        }
    }
}
