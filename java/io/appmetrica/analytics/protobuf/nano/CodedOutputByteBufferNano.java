package io.appmetrica.analytics.protobuf.nano;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;
import p000A.AbstractC0002c;

/* loaded from: classes.dex */
public final class CodedOutputByteBufferNano {
    public static final int LITTLE_ENDIAN_32_SIZE = 4;
    public static final int LITTLE_ENDIAN_64_SIZE = 8;
    private static final int MAX_UTF8_EXPANSION = 3;
    private final ByteBuffer buffer;

    public static class OutOfSpaceException extends IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        public OutOfSpaceException(int r3, int r4) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space (pos " + r3 + " limit " + r4 + ").");
        }
    }

    private CodedOutputByteBufferNano(byte[] bArr, int r2, int r3) {
        this(ByteBuffer.wrap(bArr, r2, r3));
    }

    public static int computeBoolSize(int r02, boolean z2) {
        return computeBoolSizeNoTag(z2) + computeTagSize(r02);
    }

    public static int computeBoolSizeNoTag(boolean z2) {
        return 1;
    }

    public static int computeBytesSize(int r02, byte[] bArr) {
        return computeBytesSizeNoTag(bArr) + computeTagSize(r02);
    }

    public static int computeBytesSizeNoTag(byte[] bArr) {
        return computeRawVarint32Size(bArr.length) + bArr.length;
    }

    public static int computeDoubleSize(int r02, double d2) {
        return computeDoubleSizeNoTag(d2) + computeTagSize(r02);
    }

    public static int computeDoubleSizeNoTag(double d2) {
        return 8;
    }

    public static int computeEnumSize(int r02, int r12) {
        return computeEnumSizeNoTag(r12) + computeTagSize(r02);
    }

    public static int computeEnumSizeNoTag(int r02) {
        return computeRawVarint32Size(r02);
    }

    public static int computeFieldSize(int r02, int r12, Object obj) {
        switch (r12) {
            case 1:
                return computeDoubleSize(r02, ((Double) obj).doubleValue());
            case 2:
                return computeFloatSize(r02, ((Float) obj).floatValue());
            case 3:
                return computeInt64Size(r02, ((Long) obj).longValue());
            case 4:
                return computeUInt64Size(r02, ((Long) obj).longValue());
            case 5:
                return computeInt32Size(r02, ((Integer) obj).intValue());
            case 6:
                return computeFixed64Size(r02, ((Long) obj).longValue());
            case 7:
                return computeFixed32Size(r02, ((Integer) obj).intValue());
            case 8:
                return computeBoolSize(r02, ((Boolean) obj).booleanValue());
            case 9:
                return computeStringSize(r02, (String) obj);
            case 10:
                return computeGroupSize(r02, (MessageNano) obj);
            case 11:
                return computeMessageSize(r02, (MessageNano) obj);
            case 12:
                return computeBytesSize(r02, (byte[]) obj);
            case 13:
                return computeUInt32Size(r02, ((Integer) obj).intValue());
            case 14:
                return computeEnumSize(r02, ((Integer) obj).intValue());
            case 15:
                return computeSFixed32Size(r02, ((Integer) obj).intValue());
            case 16:
                return computeSFixed64Size(r02, ((Long) obj).longValue());
            case 17:
                return computeSInt32Size(r02, ((Integer) obj).intValue());
            case 18:
                return computeSInt64Size(r02, ((Long) obj).longValue());
            default:
                throw new IllegalArgumentException(AbstractC0002c.m11f(r12, "Unknown type: "));
        }
    }

    public static int computeFixed32Size(int r02, int r12) {
        return computeFixed32SizeNoTag(r12) + computeTagSize(r02);
    }

    public static int computeFixed32SizeNoTag(int r02) {
        return 4;
    }

    public static int computeFixed64Size(int r02, long j2) {
        return computeFixed64SizeNoTag(j2) + computeTagSize(r02);
    }

    public static int computeFixed64SizeNoTag(long j2) {
        return 8;
    }

    public static int computeFloatSize(int r02, float f) {
        return computeFloatSizeNoTag(f) + computeTagSize(r02);
    }

    public static int computeFloatSizeNoTag(float f) {
        return 4;
    }

    public static int computeGroupSize(int r02, MessageNano messageNano) {
        return computeGroupSizeNoTag(messageNano) + (computeTagSize(r02) * 2);
    }

    public static int computeGroupSizeNoTag(MessageNano messageNano) {
        return messageNano.getSerializedSize();
    }

    public static int computeInt32Size(int r02, int r12) {
        return computeInt32SizeNoTag(r12) + computeTagSize(r02);
    }

    public static int computeInt32SizeNoTag(int r02) {
        if (r02 >= 0) {
            return computeRawVarint32Size(r02);
        }
        return 10;
    }

    public static int computeInt64Size(int r02, long j2) {
        return computeInt64SizeNoTag(j2) + computeTagSize(r02);
    }

    public static int computeInt64SizeNoTag(long j2) {
        return computeRawVarint64Size(j2);
    }

    public static int computeMessageSize(int r02, MessageNano messageNano) {
        return computeMessageSizeNoTag(messageNano) + computeTagSize(r02);
    }

    public static int computeMessageSizeNoTag(MessageNano messageNano) {
        int serializedSize = messageNano.getSerializedSize();
        return computeRawVarint32Size(serializedSize) + serializedSize;
    }

    public static int computeRawVarint32Size(int r12) {
        if ((r12 & (-128)) == 0) {
            return 1;
        }
        if ((r12 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & r12) == 0) {
            return 3;
        }
        return (r12 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int computeRawVarint64Size(long j2) {
        if (((-128) & j2) == 0) {
            return 1;
        }
        if (((-16384) & j2) == 0) {
            return 2;
        }
        if (((-2097152) & j2) == 0) {
            return 3;
        }
        if (((-268435456) & j2) == 0) {
            return 4;
        }
        if (((-34359738368L) & j2) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j2) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j2) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j2) == 0) {
            return 8;
        }
        return (j2 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int computeSFixed32Size(int r02, int r12) {
        return computeSFixed32SizeNoTag(r12) + computeTagSize(r02);
    }

    public static int computeSFixed32SizeNoTag(int r02) {
        return 4;
    }

    public static int computeSFixed64Size(int r02, long j2) {
        return computeSFixed64SizeNoTag(j2) + computeTagSize(r02);
    }

    public static int computeSFixed64SizeNoTag(long j2) {
        return 8;
    }

    public static int computeSInt32Size(int r02, int r12) {
        return computeSInt32SizeNoTag(r12) + computeTagSize(r02);
    }

    public static int computeSInt32SizeNoTag(int r02) {
        return computeRawVarint32Size(encodeZigZag32(r02));
    }

    public static int computeSInt64Size(int r02, long j2) {
        return computeSInt64SizeNoTag(j2) + computeTagSize(r02);
    }

    public static int computeSInt64SizeNoTag(long j2) {
        return computeRawVarint64Size(encodeZigZag64(j2));
    }

    public static int computeStringSize(int r02, String str) {
        return computeStringSizeNoTag(str) + computeTagSize(r02);
    }

    public static int computeStringSizeNoTag(String str) {
        int encodedLength = encodedLength(str);
        return computeRawVarint32Size(encodedLength) + encodedLength;
    }

    public static int computeTagSize(int r12) {
        return computeRawVarint32Size(WireFormatNano.makeTag(r12, 0));
    }

    public static int computeUInt32Size(int r02, int r12) {
        return computeUInt32SizeNoTag(r12) + computeTagSize(r02);
    }

    public static int computeUInt32SizeNoTag(int r02) {
        return computeRawVarint32Size(r02);
    }

    public static int computeUInt64Size(int r02, long j2) {
        return computeUInt64SizeNoTag(j2) + computeTagSize(r02);
    }

    public static int computeUInt64SizeNoTag(long j2) {
        return computeRawVarint64Size(j2);
    }

    private static void encode(CharSequence charSequence, ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        }
        if (!byteBuffer.hasArray()) {
            encodeDirect(charSequence, byteBuffer);
            return;
        }
        try {
            byteBuffer.position(encode(charSequence, byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining()) - byteBuffer.arrayOffset());
        } catch (ArrayIndexOutOfBoundsException e2) {
            BufferOverflowException bufferOverflowException = new BufferOverflowException();
            bufferOverflowException.initCause(e2);
            throw bufferOverflowException;
        }
    }

    private static void encodeDirect(CharSequence charSequence, ByteBuffer byteBuffer) {
        int length = charSequence.length();
        int r12 = 0;
        while (r12 < length) {
            char charAt = charSequence.charAt(r12);
            if (charAt < 128) {
                byteBuffer.put((byte) charAt);
            } else if (charAt < 2048) {
                byteBuffer.put((byte) ((charAt >>> 6) | 960));
                byteBuffer.put((byte) ((charAt & '?') | 128));
            } else {
                if (charAt >= 55296 && 57343 >= charAt) {
                    int r4 = r12 + 1;
                    if (r4 != charSequence.length()) {
                        char charAt2 = charSequence.charAt(r4);
                        if (Character.isSurrogatePair(charAt, charAt2)) {
                            int codePoint = Character.toCodePoint(charAt, charAt2);
                            byteBuffer.put((byte) ((codePoint >>> 18) | 240));
                            byteBuffer.put((byte) (((codePoint >>> 12) & 63) | 128));
                            byteBuffer.put((byte) (((codePoint >>> 6) & 63) | 128));
                            byteBuffer.put((byte) ((codePoint & 63) | 128));
                            r12 = r4;
                        } else {
                            r12 = r4;
                        }
                    }
                    StringBuilder sb = new StringBuilder("Unpaired surrogate at index ");
                    sb.append(r12 - 1);
                    throw new IllegalArgumentException(sb.toString());
                }
                byteBuffer.put((byte) ((charAt >>> '\f') | 480));
                byteBuffer.put((byte) (((charAt >>> 6) & 63) | 128));
                byteBuffer.put((byte) ((charAt & '?') | 128));
            }
            r12++;
        }
    }

    public static int encodeZigZag32(int r12) {
        return (r12 >> 31) ^ (r12 << 1);
    }

    public static long encodeZigZag64(long j2) {
        return (j2 >> 63) ^ (j2 << 1);
    }

    private static int encodedLength(CharSequence charSequence) {
        int length = charSequence.length();
        int r12 = 0;
        while (r12 < length && charSequence.charAt(r12) < 128) {
            r12++;
        }
        int r2 = length;
        while (true) {
            if (r12 < length) {
                char charAt = charSequence.charAt(r12);
                if (charAt >= 2048) {
                    r2 += encodedLengthGeneral(charSequence, r12);
                    break;
                }
                r2 += (127 - charAt) >>> 31;
                r12++;
            } else {
                break;
            }
        }
        if (r2 >= length) {
            return r2;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (r2 + 4294967296L));
    }

    private static int encodedLengthGeneral(CharSequence charSequence, int r5) {
        int length = charSequence.length();
        int r12 = 0;
        while (r5 < length) {
            char charAt = charSequence.charAt(r5);
            if (charAt < 2048) {
                r12 += (127 - charAt) >>> 31;
            } else {
                r12 += 2;
                if (55296 <= charAt && charAt <= 57343) {
                    if (Character.codePointAt(charSequence, r5) < 65536) {
                        throw new IllegalArgumentException(AbstractC0002c.m11f(r5, "Unpaired surrogate at index "));
                    }
                    r5++;
                }
            }
            r5++;
        }
        return r12;
    }

    public static CodedOutputByteBufferNano newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public void checkNoSpaceLeft() {
        if (spaceLeft() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public int position() {
        return this.buffer.position();
    }

    public void reset() {
        this.buffer.clear();
    }

    public int spaceLeft() {
        return this.buffer.remaining();
    }

    public void writeBool(int r2, boolean z2) {
        writeTag(r2, 0);
        writeBoolNoTag(z2);
    }

    public void writeBoolNoTag(boolean z2) {
        writeRawByte(z2 ? 1 : 0);
    }

    public void writeBytes(int r2, byte[] bArr) {
        writeTag(r2, 2);
        writeBytesNoTag(bArr);
    }

    public void writeBytesNoTag(byte[] bArr) {
        writeRawVarint32(bArr.length);
        writeRawBytes(bArr);
    }

    public void writeDouble(int r2, double d2) {
        writeTag(r2, 1);
        writeDoubleNoTag(d2);
    }

    public void writeDoubleNoTag(double d2) {
        writeRawLittleEndian64(Double.doubleToLongBits(d2));
    }

    public void writeEnum(int r2, int r3) {
        writeTag(r2, 0);
        writeEnumNoTag(r3);
    }

    public void writeEnumNoTag(int r12) {
        writeRawVarint32(r12);
    }

    public void writeField(int r12, int r2, Object obj) {
        switch (r2) {
            case 1:
                writeDouble(r12, ((Double) obj).doubleValue());
                return;
            case 2:
                writeFloat(r12, ((Float) obj).floatValue());
                return;
            case 3:
                writeInt64(r12, ((Long) obj).longValue());
                return;
            case 4:
                writeUInt64(r12, ((Long) obj).longValue());
                return;
            case 5:
                writeInt32(r12, ((Integer) obj).intValue());
                return;
            case 6:
                writeFixed64(r12, ((Long) obj).longValue());
                return;
            case 7:
                writeFixed32(r12, ((Integer) obj).intValue());
                return;
            case 8:
                writeBool(r12, ((Boolean) obj).booleanValue());
                return;
            case 9:
                writeString(r12, (String) obj);
                return;
            case 10:
                writeGroup(r12, (MessageNano) obj);
                return;
            case 11:
                writeMessage(r12, (MessageNano) obj);
                return;
            case 12:
                writeBytes(r12, (byte[]) obj);
                return;
            case 13:
                writeUInt32(r12, ((Integer) obj).intValue());
                return;
            case 14:
                writeEnum(r12, ((Integer) obj).intValue());
                return;
            case 15:
                writeSFixed32(r12, ((Integer) obj).intValue());
                return;
            case 16:
                writeSFixed64(r12, ((Long) obj).longValue());
                return;
            case 17:
                writeSInt32(r12, ((Integer) obj).intValue());
                return;
            case 18:
                writeSInt64(r12, ((Long) obj).longValue());
                return;
            default:
                throw new IOException(AbstractC0002c.m11f(r2, "Unknown type: "));
        }
    }

    public void writeFixed32(int r2, int r3) {
        writeTag(r2, 5);
        writeFixed32NoTag(r3);
    }

    public void writeFixed32NoTag(int r12) {
        writeRawLittleEndian32(r12);
    }

    public void writeFixed64(int r2, long j2) {
        writeTag(r2, 1);
        writeFixed64NoTag(j2);
    }

    public void writeFixed64NoTag(long j2) {
        writeRawLittleEndian64(j2);
    }

    public void writeFloat(int r2, float f) {
        writeTag(r2, 5);
        writeFloatNoTag(f);
    }

    public void writeFloatNoTag(float f) {
        writeRawLittleEndian32(Float.floatToIntBits(f));
    }

    public void writeGroup(int r2, MessageNano messageNano) {
        writeTag(r2, 3);
        writeGroupNoTag(messageNano);
        writeTag(r2, 4);
    }

    public void writeGroupNoTag(MessageNano messageNano) {
        messageNano.writeTo(this);
    }

    public void writeInt32(int r2, int r3) {
        writeTag(r2, 0);
        writeInt32NoTag(r3);
    }

    public void writeInt32NoTag(int r3) {
        if (r3 >= 0) {
            writeRawVarint32(r3);
        } else {
            writeRawVarint64(r3);
        }
    }

    public void writeInt64(int r2, long j2) {
        writeTag(r2, 0);
        writeInt64NoTag(j2);
    }

    public void writeInt64NoTag(long j2) {
        writeRawVarint64(j2);
    }

    public void writeMessage(int r2, MessageNano messageNano) {
        writeTag(r2, 2);
        writeMessageNoTag(messageNano);
    }

    public void writeMessageNoTag(MessageNano messageNano) {
        writeRawVarint32(messageNano.getCachedSize());
        messageNano.writeTo(this);
    }

    public void writeRawByte(byte b2) {
        if (!this.buffer.hasRemaining()) {
            throw new OutOfSpaceException(this.buffer.position(), this.buffer.limit());
        }
        this.buffer.put(b2);
    }

    public void writeRawBytes(byte[] bArr) {
        writeRawBytes(bArr, 0, bArr.length);
    }

    public void writeRawLittleEndian32(int r3) {
        if (this.buffer.remaining() < 4) {
            throw new OutOfSpaceException(this.buffer.position(), this.buffer.limit());
        }
        this.buffer.putInt(r3);
    }

    public void writeRawLittleEndian64(long j2) {
        if (this.buffer.remaining() < 8) {
            throw new OutOfSpaceException(this.buffer.position(), this.buffer.limit());
        }
        this.buffer.putLong(j2);
    }

    public void writeRawVarint32(int r2) {
        while ((r2 & (-128)) != 0) {
            writeRawByte((r2 & 127) | 128);
            r2 >>>= 7;
        }
        writeRawByte(r2);
    }

    public void writeRawVarint64(long j2) {
        while (((-128) & j2) != 0) {
            writeRawByte((((int) j2) & 127) | 128);
            j2 >>>= 7;
        }
        writeRawByte((int) j2);
    }

    public void writeSFixed32(int r2, int r3) {
        writeTag(r2, 5);
        writeSFixed32NoTag(r3);
    }

    public void writeSFixed32NoTag(int r12) {
        writeRawLittleEndian32(r12);
    }

    public void writeSFixed64(int r2, long j2) {
        writeTag(r2, 1);
        writeSFixed64NoTag(j2);
    }

    public void writeSFixed64NoTag(long j2) {
        writeRawLittleEndian64(j2);
    }

    public void writeSInt32(int r2, int r3) {
        writeTag(r2, 0);
        writeSInt32NoTag(r3);
    }

    public void writeSInt32NoTag(int r12) {
        writeRawVarint32(encodeZigZag32(r12));
    }

    public void writeSInt64(int r2, long j2) {
        writeTag(r2, 0);
        writeSInt64NoTag(j2);
    }

    public void writeSInt64NoTag(long j2) {
        writeRawVarint64(encodeZigZag64(j2));
    }

    public void writeString(int r2, String str) {
        writeTag(r2, 2);
        writeStringNoTag(str);
    }

    public void writeStringNoTag(String str) {
        try {
            int computeRawVarint32Size = computeRawVarint32Size(str.length());
            if (computeRawVarint32Size != computeRawVarint32Size(str.length() * 3)) {
                writeRawVarint32(encodedLength(str));
                encode(str, this.buffer);
                return;
            }
            int position = this.buffer.position();
            if (this.buffer.remaining() < computeRawVarint32Size) {
                throw new OutOfSpaceException(position + computeRawVarint32Size, this.buffer.limit());
            }
            this.buffer.position(position + computeRawVarint32Size);
            encode(str, this.buffer);
            int position2 = this.buffer.position();
            this.buffer.position(position);
            writeRawVarint32((position2 - position) - computeRawVarint32Size);
            this.buffer.position(position2);
        } catch (BufferOverflowException e2) {
            OutOfSpaceException outOfSpaceException = new OutOfSpaceException(this.buffer.position(), this.buffer.limit());
            outOfSpaceException.initCause(e2);
            throw outOfSpaceException;
        }
    }

    public void writeTag(int r12, int r2) {
        writeRawVarint32(WireFormatNano.makeTag(r12, r2));
    }

    public void writeUInt32(int r2, int r3) {
        writeTag(r2, 0);
        writeUInt32NoTag(r3);
    }

    public void writeUInt32NoTag(int r12) {
        writeRawVarint32(r12);
    }

    public void writeUInt64(int r2, long j2) {
        writeTag(r2, 0);
        writeUInt64NoTag(j2);
    }

    public void writeUInt64NoTag(long j2) {
        writeRawVarint64(j2);
    }

    private CodedOutputByteBufferNano(ByteBuffer byteBuffer) {
        this.buffer = byteBuffer;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }

    public static CodedOutputByteBufferNano newInstance(byte[] bArr, int r2, int r3) {
        return new CodedOutputByteBufferNano(bArr, r2, r3);
    }

    public void writeRawBytes(byte[] bArr, int r3, int r4) {
        if (this.buffer.remaining() < r4) {
            throw new OutOfSpaceException(this.buffer.position(), this.buffer.limit());
        }
        this.buffer.put(bArr, r3, r4);
    }

    public void writeRawByte(int r12) {
        writeRawByte((byte) r12);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        return r9 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int encode(java.lang.CharSequence r7, byte[] r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.encode(java.lang.CharSequence, byte[], int, int):int");
    }
}
