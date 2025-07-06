package io.appmetrica.analytics.protobuf.nano;

import io.appmetrica.analytics.protobuf.nano.MapFactories;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Map;
import p000A.AbstractC0002c;

/* loaded from: classes.dex */
public final class InternalNano {
    public static final int TYPE_BOOL = 8;
    public static final int TYPE_BYTES = 12;
    public static final int TYPE_DOUBLE = 1;
    public static final int TYPE_ENUM = 14;
    public static final int TYPE_FIXED32 = 7;
    public static final int TYPE_FIXED64 = 6;
    public static final int TYPE_FLOAT = 2;
    public static final int TYPE_GROUP = 10;
    public static final int TYPE_INT32 = 5;
    public static final int TYPE_INT64 = 3;
    public static final int TYPE_MESSAGE = 11;
    public static final int TYPE_SFIXED32 = 15;
    public static final int TYPE_SFIXED64 = 16;
    public static final int TYPE_SINT32 = 17;
    public static final int TYPE_SINT64 = 18;
    public static final int TYPE_STRING = 9;
    public static final int TYPE_UINT32 = 13;
    public static final int TYPE_UINT64 = 4;
    static final Charset UTF_8 = Charset.forName("UTF-8");
    static final Charset ISO_8859_1 = Charset.forName("ISO-8859-1");
    public static final Object LAZY_INIT_LOCK = new Object();

    private InternalNano() {
    }

    public static byte[] bytesDefaultValue(String str) {
        return str.getBytes(ISO_8859_1);
    }

    public static void cloneUnknownFieldData(ExtendableMessageNano extendableMessageNano, ExtendableMessageNano extendableMessageNano2) {
        FieldArray fieldArray = extendableMessageNano.unknownFieldData;
        if (fieldArray != null) {
            extendableMessageNano2.unknownFieldData = fieldArray.m5538clone();
        }
    }

    public static <K, V> int computeMapFieldSize(Map<K, V> map, int r5, int r6, int r7) {
        int computeTagSize = CodedOutputByteBufferNano.computeTagSize(r5);
        int r02 = 0;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            if (key == null || value == null) {
                throw new IllegalStateException("keys and values in maps cannot be null");
            }
            int computeFieldSize = CodedOutputByteBufferNano.computeFieldSize(2, r7, value) + CodedOutputByteBufferNano.computeFieldSize(1, r6, key);
            r02 += CodedOutputByteBufferNano.computeRawVarint32Size(computeFieldSize) + computeTagSize + computeFieldSize;
        }
        return r02;
    }

    public static byte[] copyFromUtf8(String str) {
        return str.getBytes(UTF_8);
    }

    public static boolean equals(int[] r12, int[] r2) {
        return (r12 == null || r12.length == 0) ? r2 == null || r2.length == 0 : Arrays.equals(r12, r2);
    }

    private static boolean equalsMapValue(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            throw new IllegalStateException("keys and values in maps cannot be null");
        }
        return ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) obj, (byte[]) obj2) : obj.equals(obj2);
    }

    public static int hashCode(int[] r12) {
        if (r12 == null || r12.length == 0) {
            return 0;
        }
        return Arrays.hashCode(r12);
    }

    private static int hashCodeForMap(Object obj) {
        return obj instanceof byte[] ? Arrays.hashCode((byte[]) obj) : obj.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> mergeMapEntry(CodedInputByteBufferNano codedInputByteBufferNano, Map<K, V> map, MapFactories.MapFactory mapFactory, int r5, int r6, V v2, int r8, int r9) {
        Map<K, V> forMap = mapFactory.forMap(map);
        int pushLimit = codedInputByteBufferNano.pushLimit(codedInputByteBufferNano.readRawVarint32());
        Object obj = null;
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == r8) {
                obj = codedInputByteBufferNano.readPrimitiveField(r5);
            } else if (readTag == r9) {
                if (r6 == 11) {
                    codedInputByteBufferNano.readMessage(v2);
                } else {
                    v2 = (V) codedInputByteBufferNano.readPrimitiveField(r6);
                }
            } else if (!codedInputByteBufferNano.skipField(readTag)) {
                break;
            }
        }
        codedInputByteBufferNano.checkLastTagWas(0);
        codedInputByteBufferNano.popLimit(pushLimit);
        if (obj == null) {
            obj = primitiveDefaultValue(r5);
        }
        if (v2 == 0) {
            v2 = primitiveDefaultValue(r6);
        }
        forMap.put(obj, v2);
        return forMap;
    }

    private static Object primitiveDefaultValue(int r3) {
        switch (r3) {
            case 1:
                return Double.valueOf(0.0d);
            case 2:
                return Float.valueOf(0.0f);
            case 3:
            case 4:
            case 6:
            case 16:
            case 18:
                return 0L;
            case 5:
            case 7:
            case 13:
            case 14:
            case 15:
            case 17:
                return 0;
            case 8:
                return Boolean.FALSE;
            case 9:
                return "";
            case 10:
            case 11:
            default:
                throw new IllegalArgumentException(AbstractC0002c.m13h("Type: ", r3, " is not a primitive type."));
            case 12:
                return WireFormatNano.EMPTY_BYTES;
        }
    }

    public static <K, V> void serializeMapField(CodedOutputByteBufferNano codedOutputByteBufferNano, Map<K, V> map, int r8, int r9, int r10) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            if (key == null || value == null) {
                throw new IllegalStateException("keys and values in maps cannot be null");
            }
            int computeFieldSize = CodedOutputByteBufferNano.computeFieldSize(2, r10, value) + CodedOutputByteBufferNano.computeFieldSize(1, r9, key);
            codedOutputByteBufferNano.writeTag(r8, 2);
            codedOutputByteBufferNano.writeRawVarint32(computeFieldSize);
            codedOutputByteBufferNano.writeField(1, r9, key);
            codedOutputByteBufferNano.writeField(2, r10, value);
        }
    }

    public static String stringDefaultValue(String str) {
        return new String(str.getBytes(ISO_8859_1), UTF_8);
    }

    public static int hashCode(long[] jArr) {
        if (jArr == null || jArr.length == 0) {
            return 0;
        }
        return Arrays.hashCode(jArr);
    }

    public static int hashCode(float[] fArr) {
        if (fArr == null || fArr.length == 0) {
            return 0;
        }
        return Arrays.hashCode(fArr);
    }

    public static boolean equals(long[] jArr, long[] jArr2) {
        if (jArr == null || jArr.length == 0) {
            return jArr2 == null || jArr2.length == 0;
        }
        return Arrays.equals(jArr, jArr2);
    }

    public static int hashCode(double[] dArr) {
        if (dArr == null || dArr.length == 0) {
            return 0;
        }
        return Arrays.hashCode(dArr);
    }

    public static int hashCode(boolean[] zArr) {
        if (zArr == null || zArr.length == 0) {
            return 0;
        }
        return Arrays.hashCode(zArr);
    }

    public static int hashCode(byte[][] bArr) {
        int length;
        int r2;
        if (bArr == null) {
            length = 0;
            r2 = 0;
        } else {
            length = bArr.length;
            r2 = 0;
        }
        for (int r02 = 0; r02 < length; r02++) {
            byte[] bArr2 = bArr[r02];
            if (bArr2 != null) {
                r2 = Arrays.hashCode(bArr2) + (r2 * 31);
            }
        }
        return r2;
    }

    public static boolean equals(float[] fArr, float[] fArr2) {
        if (fArr == null || fArr.length == 0) {
            return fArr2 == null || fArr2.length == 0;
        }
        return Arrays.equals(fArr, fArr2);
    }

    public static int hashCode(Object[] objArr) {
        int length;
        int r2;
        if (objArr == null) {
            length = 0;
            r2 = 0;
        } else {
            length = objArr.length;
            r2 = 0;
        }
        for (int r02 = 0; r02 < length; r02++) {
            Object obj = objArr[r02];
            if (obj != null) {
                r2 = obj.hashCode() + (r2 * 31);
            }
        }
        return r2;
    }

    public static boolean equals(double[] dArr, double[] dArr2) {
        if (dArr == null || dArr.length == 0) {
            return dArr2 == null || dArr2.length == 0;
        }
        return Arrays.equals(dArr, dArr2);
    }

    public static <K, V> int hashCode(Map<K, V> map) {
        int r02 = 0;
        if (map == null) {
            return 0;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            r02 += hashCodeForMap(entry.getValue()) ^ hashCodeForMap(entry.getKey());
        }
        return r02;
    }

    public static boolean equals(boolean[] zArr, boolean[] zArr2) {
        if (zArr == null || zArr.length == 0) {
            return zArr2 == null || zArr2.length == 0;
        }
        return Arrays.equals(zArr, zArr2);
    }

    public static boolean equals(byte[][] bArr, byte[][] bArr2) {
        int length;
        int r3;
        int length2 = bArr == null ? 0 : bArr.length;
        if (bArr2 == null) {
            length = 0;
            r3 = 0;
        } else {
            length = bArr2.length;
            r3 = 0;
        }
        int r4 = r3;
        while (true) {
            if (r3 >= length2 || bArr[r3] != null) {
                while (r4 < length && bArr2[r4] == null) {
                    r4++;
                }
                boolean z2 = r3 >= length2;
                boolean z3 = r4 >= length;
                if (z2 && z3) {
                    return true;
                }
                if (z2 != z3 || !Arrays.equals(bArr[r3], bArr2[r4])) {
                    return false;
                }
                r3++;
                r4++;
            } else {
                r3++;
            }
        }
    }

    public static boolean equals(Object[] objArr, Object[] objArr2) {
        int length;
        int r3;
        int length2 = objArr == null ? 0 : objArr.length;
        if (objArr2 == null) {
            length = 0;
            r3 = 0;
        } else {
            length = objArr2.length;
            r3 = 0;
        }
        int r4 = r3;
        while (true) {
            if (r3 >= length2 || objArr[r3] != null) {
                while (r4 < length && objArr2[r4] == null) {
                    r4++;
                }
                boolean z2 = r3 >= length2;
                boolean z3 = r4 >= length;
                if (z2 && z3) {
                    return true;
                }
                if (z2 != z3 || !objArr[r3].equals(objArr2[r4])) {
                    return false;
                }
                r3++;
                r4++;
            } else {
                r3++;
            }
        }
    }

    public static <K, V> boolean equals(Map<K, V> map, Map<K, V> map2) {
        if (map == map2) {
            return true;
        }
        if (map == null) {
            return map2.size() == 0;
        }
        if (map2 == null) {
            return map.size() == 0;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !equalsMapValue(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }
}
