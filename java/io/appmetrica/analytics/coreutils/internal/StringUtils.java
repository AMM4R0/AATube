package io.appmetrica.analytics.coreutils.internal;

import android.content.ContentValues;
import android.text.TextUtils;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class StringUtils {
    public static final String COMMA = ",";
    public static final String EMPTY = "";
    public static final String PROCESS_POSTFIX_DELIMITER = ":";

    public static String capitalize(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        char charAt = str.charAt(0);
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        return Character.toUpperCase(charAt) + str.substring(1);
    }

    public static int compare(String str, String str2) {
        if (str == null) {
            return str2 == null ? 0 : -1;
        }
        if (str2 == null) {
            return 1;
        }
        return str.compareTo(str2);
    }

    public static String contentValuesToString(ContentValues contentValues) {
        return contentValues == null ? "null" : contentValues.toString();
    }

    public static String emptyIfNull(String str) {
        return ifIsNullToDef(str, "");
    }

    public static boolean equalsNullSafety(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null || str2 == null) {
            return false;
        }
        return str.equals(str2);
    }

    public static String formatSha1(byte[] bArr) {
        return toHexString(bArr).toUpperCase(Locale.US).replaceAll("(.{2})(?=.+)", "$1:");
    }

    public static byte[] getUTF8Bytes(String str) {
        if (str != null) {
            try {
                return str.getBytes("UTF-8");
            } catch (Throwable unused) {
            }
        }
        return new byte[0];
    }

    public static int getUtf8BytesLength(String str) {
        return getUTF8Bytes(str).length;
    }

    public static byte[] hexToBytes(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Input string must contain an even number of characters");
        }
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int r2 = 0; r2 < length; r2 += 2) {
            bArr[r2 / 2] = (byte) (Character.digit(str.charAt(r2 + 1), 16) + (Character.digit(str.charAt(r2), 16) << 4));
        }
        return bArr;
    }

    public static String ifIsEmptyToDef(String str, String str2) {
        return TextUtils.isEmpty(str) ? str2 : str;
    }

    public static String ifIsNullToDef(String str, String str2) {
        return str == null ? str2 : str;
    }

    public static byte[] stringToBytesForProtobuf(String str) {
        return str == null ? new byte[0] : str.getBytes();
    }

    public static String toHexString(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            sb.append("0123456789abcdef".charAt((b2 & 240) >> 4));
            sb.append("0123456789abcdef".charAt(b2 & 15));
        }
        return sb.toString();
    }

    public static final String wrapFeatures(String... strArr) {
        return TextUtils.join(COMMA, strArr);
    }

    public static byte[][] getUTF8Bytes(List<String> list) {
        byte[][] bArr = new byte[0][];
        if (list != null) {
            bArr = new byte[list.size()][];
            for (int r02 = 0; r02 < list.size(); r02++) {
                bArr[r02] = getUTF8Bytes(list.get(r02));
            }
        }
        return bArr;
    }
}
