package io.appmetrica.analytics.protobuf.nano;

/* loaded from: classes.dex */
public final class WireFormatNano {
    static final int TAG_TYPE_BITS = 3;
    static final int TAG_TYPE_MASK = 7;
    static final int WIRETYPE_END_GROUP = 4;
    static final int WIRETYPE_FIXED32 = 5;
    static final int WIRETYPE_FIXED64 = 1;
    static final int WIRETYPE_LENGTH_DELIMITED = 2;
    static final int WIRETYPE_START_GROUP = 3;
    static final int WIRETYPE_VARINT = 0;
    public static final int[] EMPTY_INT_ARRAY = new int[0];
    public static final long[] EMPTY_LONG_ARRAY = new long[0];
    public static final float[] EMPTY_FLOAT_ARRAY = new float[0];
    public static final double[] EMPTY_DOUBLE_ARRAY = new double[0];
    public static final boolean[] EMPTY_BOOLEAN_ARRAY = new boolean[0];
    public static final String[] EMPTY_STRING_ARRAY = new String[0];
    public static final byte[][] EMPTY_BYTES_ARRAY = new byte[0][];
    public static final byte[] EMPTY_BYTES = new byte[0];

    private WireFormatNano() {
    }

    public static final int getRepeatedFieldArrayLength(CodedInputByteBufferNano codedInputByteBufferNano, int r4) {
        int position = codedInputByteBufferNano.getPosition();
        codedInputByteBufferNano.skipField(r4);
        int r12 = 1;
        while (codedInputByteBufferNano.readTag() == r4) {
            codedInputByteBufferNano.skipField(r4);
            r12++;
        }
        codedInputByteBufferNano.rewindToPosition(position);
        return r12;
    }

    public static int getTagFieldNumber(int r02) {
        return r02 >>> 3;
    }

    public static int getTagWireType(int r02) {
        return r02 & 7;
    }

    public static int makeTag(int r02, int r12) {
        return (r02 << 3) | r12;
    }

    public static boolean parseUnknownField(CodedInputByteBufferNano codedInputByteBufferNano, int r12) {
        return codedInputByteBufferNano.skipField(r12);
    }
}
