package io.appmetrica.analytics.protobuf.nano;

import p000A.AbstractC0002c;

/* loaded from: classes.dex */
public final class CodedInputByteBufferNano {
    private static final int DEFAULT_RECURSION_LIMIT = 64;
    private static final int DEFAULT_SIZE_LIMIT = 67108864;
    private final byte[] buffer;
    private int bufferPos;
    private int bufferSize;
    private int bufferSizeAfterLimit;
    private int bufferStart;
    private int lastTag;
    private int recursionDepth;
    private int currentLimit = Integer.MAX_VALUE;
    private int recursionLimit = DEFAULT_RECURSION_LIMIT;
    private int sizeLimit = DEFAULT_SIZE_LIMIT;

    private CodedInputByteBufferNano(byte[] bArr, int r3, int r4) {
        this.buffer = bArr;
        this.bufferStart = r3;
        this.bufferSize = r4 + r3;
        this.bufferPos = r3;
    }

    public static int decodeZigZag32(int r12) {
        return (-(r12 & 1)) ^ (r12 >>> 1);
    }

    public static long decodeZigZag64(long j2) {
        return (-(j2 & 1)) ^ (j2 >>> 1);
    }

    public static CodedInputByteBufferNano newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    private void recomputeBufferSizeAfterLimit() {
        int r02 = this.bufferSize + this.bufferSizeAfterLimit;
        this.bufferSize = r02;
        int r12 = this.currentLimit;
        if (r02 <= r12) {
            this.bufferSizeAfterLimit = 0;
            return;
        }
        int r13 = r02 - r12;
        this.bufferSizeAfterLimit = r13;
        this.bufferSize = r02 - r13;
    }

    public void checkLastTagWas(int r2) {
        if (this.lastTag != r2) {
            throw InvalidProtocolBufferNanoException.invalidEndTag();
        }
    }

    public int getBytesUntilLimit() {
        int r02 = this.currentLimit;
        if (r02 == Integer.MAX_VALUE) {
            return -1;
        }
        return r02 - this.bufferPos;
    }

    public byte[] getData(int r4, int r5) {
        if (r5 == 0) {
            return WireFormatNano.EMPTY_BYTES;
        }
        byte[] bArr = new byte[r5];
        System.arraycopy(this.buffer, this.bufferStart + r4, bArr, 0, r5);
        return bArr;
    }

    public int getPosition() {
        return this.bufferPos - this.bufferStart;
    }

    public boolean isAtEnd() {
        return this.bufferPos == this.bufferSize;
    }

    public void popLimit(int r12) {
        this.currentLimit = r12;
        recomputeBufferSizeAfterLimit();
    }

    public int pushLimit(int r2) {
        if (r2 < 0) {
            throw InvalidProtocolBufferNanoException.negativeSize();
        }
        int r22 = r2 + this.bufferPos;
        int r02 = this.currentLimit;
        if (r22 > r02) {
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        this.currentLimit = r22;
        recomputeBufferSizeAfterLimit();
        return r02;
    }

    public boolean readBool() {
        return readRawVarint32() != 0;
    }

    public byte[] readBytes() {
        int readRawVarint32 = readRawVarint32();
        int r12 = this.bufferSize;
        int r2 = this.bufferPos;
        if (readRawVarint32 > r12 - r2 || readRawVarint32 <= 0) {
            return readRawVarint32 == 0 ? WireFormatNano.EMPTY_BYTES : readRawBytes(readRawVarint32);
        }
        byte[] bArr = new byte[readRawVarint32];
        System.arraycopy(this.buffer, r2, bArr, 0, readRawVarint32);
        this.bufferPos += readRawVarint32;
        return bArr;
    }

    public double readDouble() {
        return Double.longBitsToDouble(readRawLittleEndian64());
    }

    public int readEnum() {
        return readRawVarint32();
    }

    public int readFixed32() {
        return readRawLittleEndian32();
    }

    public long readFixed64() {
        return readRawLittleEndian64();
    }

    public float readFloat() {
        return Float.intBitsToFloat(readRawLittleEndian32());
    }

    public void readGroup(MessageNano messageNano, int r4) {
        int r02 = this.recursionDepth;
        if (r02 >= this.recursionLimit) {
            throw InvalidProtocolBufferNanoException.recursionLimitExceeded();
        }
        this.recursionDepth = r02 + 1;
        messageNano.mergeFrom(this);
        checkLastTagWas(WireFormatNano.makeTag(r4, 4));
        this.recursionDepth--;
    }

    public int readInt32() {
        return readRawVarint32();
    }

    public long readInt64() {
        return readRawVarint64();
    }

    public void readMessage(MessageNano messageNano) {
        int readRawVarint32 = readRawVarint32();
        if (this.recursionDepth >= this.recursionLimit) {
            throw InvalidProtocolBufferNanoException.recursionLimitExceeded();
        }
        int pushLimit = pushLimit(readRawVarint32);
        this.recursionDepth++;
        messageNano.mergeFrom(this);
        checkLastTagWas(0);
        this.recursionDepth--;
        popLimit(pushLimit);
    }

    public Object readPrimitiveField(int r3) {
        switch (r3) {
            case 1:
                return Double.valueOf(readDouble());
            case 2:
                return Float.valueOf(readFloat());
            case 3:
                return Long.valueOf(readInt64());
            case 4:
                return Long.valueOf(readUInt64());
            case 5:
                return Integer.valueOf(readInt32());
            case 6:
                return Long.valueOf(readFixed64());
            case 7:
                return Integer.valueOf(readFixed32());
            case 8:
                return Boolean.valueOf(readBool());
            case 9:
                return readString();
            case 10:
            case 11:
            default:
                throw new IllegalArgumentException(AbstractC0002c.m11f(r3, "Unknown type "));
            case 12:
                return readBytes();
            case 13:
                return Integer.valueOf(readUInt32());
            case 14:
                return Integer.valueOf(readEnum());
            case 15:
                return Integer.valueOf(readSFixed32());
            case 16:
                return Long.valueOf(readSFixed64());
            case 17:
                return Integer.valueOf(readSInt32());
            case 18:
                return Long.valueOf(readSInt64());
        }
    }

    public byte readRawByte() {
        int r02 = this.bufferPos;
        if (r02 == this.bufferSize) {
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        byte[] bArr = this.buffer;
        this.bufferPos = r02 + 1;
        return bArr[r02];
    }

    public byte[] readRawBytes(int r5) {
        if (r5 < 0) {
            throw InvalidProtocolBufferNanoException.negativeSize();
        }
        int r02 = this.bufferPos;
        int r12 = r02 + r5;
        int r2 = this.currentLimit;
        if (r12 > r2) {
            skipRawBytes(r2 - r02);
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        if (r5 > this.bufferSize - r02) {
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        byte[] bArr = new byte[r5];
        System.arraycopy(this.buffer, r02, bArr, 0, r5);
        this.bufferPos += r5;
        return bArr;
    }

    public int readRawLittleEndian32() {
        return (readRawByte() & 255) | ((readRawByte() & 255) << 8) | ((readRawByte() & 255) << 16) | ((readRawByte() & 255) << 24);
    }

    public long readRawLittleEndian64() {
        return ((readRawByte() & 255) << 8) | (readRawByte() & 255) | ((readRawByte() & 255) << 16) | ((readRawByte() & 255) << 24) | ((readRawByte() & 255) << 32) | ((readRawByte() & 255) << 40) | ((readRawByte() & 255) << 48) | ((readRawByte() & 255) << 56);
    }

    public int readRawVarint32() {
        int r12;
        byte readRawByte = readRawByte();
        if (readRawByte >= 0) {
            return readRawByte;
        }
        int r02 = readRawByte & Byte.MAX_VALUE;
        byte readRawByte2 = readRawByte();
        if (readRawByte2 >= 0) {
            r12 = readRawByte2 << 7;
        } else {
            r02 |= (readRawByte2 & Byte.MAX_VALUE) << 7;
            byte readRawByte3 = readRawByte();
            if (readRawByte3 >= 0) {
                r12 = readRawByte3 << 14;
            } else {
                r02 |= (readRawByte3 & Byte.MAX_VALUE) << 14;
                byte readRawByte4 = readRawByte();
                if (readRawByte4 < 0) {
                    int r03 = r02 | ((readRawByte4 & Byte.MAX_VALUE) << 21);
                    byte readRawByte5 = readRawByte();
                    int r04 = r03 | (readRawByte5 << 28);
                    if (readRawByte5 >= 0) {
                        return r04;
                    }
                    for (int r13 = 0; r13 < 5; r13++) {
                        if (readRawByte() >= 0) {
                            return r04;
                        }
                    }
                    throw InvalidProtocolBufferNanoException.malformedVarint();
                }
                r12 = readRawByte4 << 21;
            }
        }
        return r02 | r12;
    }

    public long readRawVarint64() {
        long j2 = 0;
        for (int r02 = 0; r02 < DEFAULT_RECURSION_LIMIT; r02 += 7) {
            j2 |= (r3 & Byte.MAX_VALUE) << r02;
            if ((readRawByte() & 128) == 0) {
                return j2;
            }
        }
        throw InvalidProtocolBufferNanoException.malformedVarint();
    }

    public int readSFixed32() {
        return readRawLittleEndian32();
    }

    public long readSFixed64() {
        return readRawLittleEndian64();
    }

    public int readSInt32() {
        return decodeZigZag32(readRawVarint32());
    }

    public long readSInt64() {
        return decodeZigZag64(readRawVarint64());
    }

    public String readString() {
        int readRawVarint32 = readRawVarint32();
        int r12 = this.bufferSize;
        int r2 = this.bufferPos;
        if (readRawVarint32 > r12 - r2 || readRawVarint32 <= 0) {
            return new String(readRawBytes(readRawVarint32), InternalNano.UTF_8);
        }
        String str = new String(this.buffer, r2, readRawVarint32, InternalNano.UTF_8);
        this.bufferPos += readRawVarint32;
        return str;
    }

    public int readTag() {
        if (isAtEnd()) {
            this.lastTag = 0;
            return 0;
        }
        int readRawVarint32 = readRawVarint32();
        this.lastTag = readRawVarint32;
        if (readRawVarint32 != 0) {
            return readRawVarint32;
        }
        throw InvalidProtocolBufferNanoException.invalidTag();
    }

    public int readUInt32() {
        return readRawVarint32();
    }

    public long readUInt64() {
        return readRawVarint64();
    }

    public void resetSizeCounter() {
    }

    public void rewindToPosition(int r4) {
        int r02 = this.bufferPos;
        int r12 = this.bufferStart;
        if (r4 <= r02 - r12) {
            if (r4 < 0) {
                throw new IllegalArgumentException(AbstractC0002c.m11f(r4, "Bad position "));
            }
            this.bufferPos = r12 + r4;
        } else {
            throw new IllegalArgumentException("Position " + r4 + " is beyond current " + (this.bufferPos - this.bufferStart));
        }
    }

    public int setRecursionLimit(int r3) {
        if (r3 < 0) {
            throw new IllegalArgumentException(AbstractC0002c.m11f(r3, "Recursion limit cannot be negative: "));
        }
        int r02 = this.recursionLimit;
        this.recursionLimit = r3;
        return r02;
    }

    public int setSizeLimit(int r3) {
        if (r3 < 0) {
            throw new IllegalArgumentException(AbstractC0002c.m11f(r3, "Size limit cannot be negative: "));
        }
        int r02 = this.sizeLimit;
        this.sizeLimit = r3;
        return r02;
    }

    public boolean skipField(int r5) {
        int tagWireType = WireFormatNano.getTagWireType(r5);
        if (tagWireType == 0) {
            readInt32();
            return true;
        }
        if (tagWireType == 1) {
            readRawLittleEndian64();
            return true;
        }
        if (tagWireType == 2) {
            skipRawBytes(readRawVarint32());
            return true;
        }
        if (tagWireType == 3) {
            skipMessage();
            checkLastTagWas(WireFormatNano.makeTag(WireFormatNano.getTagFieldNumber(r5), 4));
            return true;
        }
        if (tagWireType == 4) {
            return false;
        }
        if (tagWireType != 5) {
            throw InvalidProtocolBufferNanoException.invalidWireType();
        }
        readRawLittleEndian32();
        return true;
    }

    public void skipMessage() {
        int readTag;
        do {
            readTag = readTag();
            if (readTag == 0) {
                return;
            }
        } while (skipField(readTag));
    }

    public void skipRawBytes(int r4) {
        if (r4 < 0) {
            throw InvalidProtocolBufferNanoException.negativeSize();
        }
        int r02 = this.bufferPos;
        int r12 = r02 + r4;
        int r2 = this.currentLimit;
        if (r12 > r2) {
            skipRawBytes(r2 - r02);
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        if (r4 > this.bufferSize - r02) {
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        this.bufferPos = r12;
    }

    public static CodedInputByteBufferNano newInstance(byte[] bArr, int r2, int r3) {
        return new CodedInputByteBufferNano(bArr, r2, r3);
    }
}
