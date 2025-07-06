package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.d9 */
/* loaded from: classes.dex */
public final class C1792d9 extends MessageNano {

    /* renamed from: c */
    public static volatile C1792d9[] f6083c;

    /* renamed from: a */
    public byte[] f6084a;

    /* renamed from: b */
    public byte[] f6085b;

    public C1792d9() {
        m3740a();
    }

    /* renamed from: b */
    public static C1792d9[] m3739b() {
        if (f6083c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6083c == null) {
                        f6083c = new C1792d9[0];
                    }
                } finally {
                }
            }
        }
        return f6083c;
    }

    /* renamed from: a */
    public final C1792d9 m3740a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f6084a = bArr;
        this.f6085b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f6084a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f6084a);
        }
        return !Arrays.equals(this.f6085b, bArr2) ? computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f6085b) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        byte[] bArr = this.f6084a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f6084a);
        }
        if (!Arrays.equals(this.f6085b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f6085b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1792d9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f6084a = codedInputByteBufferNano.readBytes();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f6085b = codedInputByteBufferNano.readBytes();
            }
        }
    }

    /* renamed from: b */
    public static C1792d9 m3738b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1792d9().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C1792d9 m3737a(byte[] bArr) {
        return (C1792d9) MessageNano.mergeFrom(new C1792d9(), bArr);
    }
}
