package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.q8 */
/* loaded from: classes.dex */
public final class C2116q8 extends MessageNano {

    /* renamed from: d */
    public static volatile C2116q8[] f6987d;

    /* renamed from: a */
    public byte[] f6988a;

    /* renamed from: b */
    public byte[] f6989b;

    /* renamed from: c */
    public C2141r8 f6990c;

    public C2116q8() {
        m4350a();
    }

    /* renamed from: b */
    public static C2116q8[] m4349b() {
        if (f6987d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6987d == null) {
                        f6987d = new C2116q8[0];
                    }
                } finally {
                }
            }
        }
        return f6987d;
    }

    /* renamed from: a */
    public final C2116q8 m4350a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f6988a = bArr;
        this.f6989b = bArr;
        this.f6990c = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f6988a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f6988a);
        }
        if (!Arrays.equals(this.f6989b, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(2, this.f6989b);
        }
        C2141r8 c2141r8 = this.f6990c;
        return c2141r8 != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(3, c2141r8) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        byte[] bArr = this.f6988a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f6988a);
        }
        if (!Arrays.equals(this.f6989b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f6989b);
        }
        C2141r8 c2141r8 = this.f6990c;
        if (c2141r8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c2141r8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2116q8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f6988a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 18) {
                this.f6989b = codedInputByteBufferNano.readBytes();
            } else if (readTag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f6990c == null) {
                    this.f6990c = new C2141r8();
                }
                codedInputByteBufferNano.readMessage(this.f6990c);
            }
        }
    }

    /* renamed from: b */
    public static C2116q8 m4348b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C2116q8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C2116q8 m4347a(byte[] bArr) {
        return (C2116q8) MessageNano.mergeFrom(new C2116q8(), bArr);
    }
}
