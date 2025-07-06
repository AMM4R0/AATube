package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.g8 */
/* loaded from: classes.dex */
public final class C1866g8 extends MessageNano {

    /* renamed from: b */
    public static volatile C1866g8[] f6303b;

    /* renamed from: a */
    public byte[][] f6304a;

    public C1866g8() {
        m3862a();
    }

    /* renamed from: b */
    public static C1866g8[] m3861b() {
        if (f6303b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6303b == null) {
                        f6303b = new C1866g8[0];
                    }
                } finally {
                }
            }
        }
        return f6303b;
    }

    /* renamed from: a */
    public final C1866g8 m3862a() {
        this.f6304a = WireFormatNano.EMPTY_BYTES_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[][] bArr = this.f6304a;
        if (bArr == null || bArr.length <= 0) {
            return computeSerializedSize;
        }
        int r12 = 0;
        int r2 = 0;
        int r3 = 0;
        while (true) {
            byte[][] bArr2 = this.f6304a;
            if (r12 >= bArr2.length) {
                return computeSerializedSize + r2 + r3;
            }
            byte[] bArr3 = bArr2[r12];
            if (bArr3 != null) {
                r3++;
                r2 = CodedOutputByteBufferNano.computeBytesSizeNoTag(bArr3) + r2;
            }
            r12++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        byte[][] bArr = this.f6304a;
        if (bArr != null && bArr.length > 0) {
            int r02 = 0;
            while (true) {
                byte[][] bArr2 = this.f6304a;
                if (r02 >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[r02];
                if (bArr3 != null) {
                    codedOutputByteBufferNano.writeBytes(1, bArr3);
                }
                r02++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1866g8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag != 10) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                byte[][] bArr = this.f6304a;
                int length = bArr == null ? 0 : bArr.length;
                int r02 = repeatedFieldArrayLength + length;
                byte[][] bArr2 = new byte[r02][];
                if (length != 0) {
                    System.arraycopy(bArr, 0, bArr2, 0, length);
                }
                while (length < r02 - 1) {
                    bArr2[length] = codedInputByteBufferNano.readBytes();
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                bArr2[length] = codedInputByteBufferNano.readBytes();
                this.f6304a = bArr2;
            }
        }
    }

    /* renamed from: b */
    public static C1866g8 m3860b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1866g8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C1866g8 m3859a(byte[] bArr) {
        return (C1866g8) MessageNano.mergeFrom(new C1866g8(), bArr);
    }
}
