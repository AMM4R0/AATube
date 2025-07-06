package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.a6 */
/* loaded from: classes.dex */
public final class C1714a6 extends MessageNano {

    /* renamed from: c */
    public static volatile C1714a6[] f5847c;

    /* renamed from: a */
    public byte[] f5848a;

    /* renamed from: b */
    public byte[] f5849b;

    public C1714a6() {
        m3601a();
    }

    /* renamed from: b */
    public static C1714a6[] m3600b() {
        if (f5847c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5847c == null) {
                        f5847c = new C1714a6[0];
                    }
                } finally {
                }
            }
        }
        return f5847c;
    }

    /* renamed from: a */
    public final C1714a6 m3601a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f5848a = bArr;
        this.f5849b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f5848a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f5848a);
        }
        return !Arrays.equals(this.f5849b, bArr2) ? computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f5849b) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        byte[] bArr = this.f5848a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f5848a);
        }
        if (!Arrays.equals(this.f5849b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f5849b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1714a6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f5848a = codedInputByteBufferNano.readBytes();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f5849b = codedInputByteBufferNano.readBytes();
            }
        }
    }

    /* renamed from: b */
    public static C1714a6 m3599b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1714a6().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C1714a6 m3598a(byte[] bArr) {
        return (C1714a6) MessageNano.mergeFrom(new C1714a6(), bArr);
    }
}
