package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.l8 */
/* loaded from: classes.dex */
public final class C1991l8 extends MessageNano {

    /* renamed from: c */
    public static volatile C1991l8[] f6633c;

    /* renamed from: a */
    public byte[] f6634a;

    /* renamed from: b */
    public byte[] f6635b;

    public C1991l8() {
        m4098a();
    }

    /* renamed from: b */
    public static C1991l8[] m4097b() {
        if (f6633c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6633c == null) {
                        f6633c = new C1991l8[0];
                    }
                } finally {
                }
            }
        }
        return f6633c;
    }

    /* renamed from: a */
    public final C1991l8 m4098a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f6634a = bArr;
        this.f6635b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f6634a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f6634a);
        }
        return !Arrays.equals(this.f6635b, bArr2) ? computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f6635b) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        byte[] bArr = this.f6634a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f6634a);
        }
        if (!Arrays.equals(this.f6635b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f6635b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1991l8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f6634a = codedInputByteBufferNano.readBytes();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f6635b = codedInputByteBufferNano.readBytes();
            }
        }
    }

    /* renamed from: b */
    public static C1991l8 m4096b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1991l8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C1991l8 m4095a(byte[] bArr) {
        return (C1991l8) MessageNano.mergeFrom(new C1991l8(), bArr);
    }
}
