package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.J8 */
/* loaded from: classes.dex */
public final class C1294J8 extends MessageNano {

    /* renamed from: c */
    public static volatile C1294J8[] f4904c;

    /* renamed from: a */
    public String f4905a;

    /* renamed from: b */
    public byte[] f4906b;

    public C1294J8() {
        m2983a();
    }

    /* renamed from: b */
    public static C1294J8[] m2982b() {
        if (f4904c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f4904c == null) {
                        f4904c = new C1294J8[0];
                    }
                } finally {
                }
            }
        }
        return f4904c;
    }

    /* renamed from: a */
    public final C1294J8 m2983a() {
        this.f4905a = "";
        this.f4906b = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f4905a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f4905a);
        }
        return !Arrays.equals(this.f4906b, WireFormatNano.EMPTY_BYTES) ? computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f4906b) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f4905a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f4905a);
        }
        if (!Arrays.equals(this.f4906b, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(2, this.f4906b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1294J8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f4905a = codedInputByteBufferNano.readString();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f4906b = codedInputByteBufferNano.readBytes();
            }
        }
    }

    /* renamed from: b */
    public static C1294J8 m2981b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1294J8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C1294J8 m2980a(byte[] bArr) {
        return (C1294J8) MessageNano.mergeFrom(new C1294J8(), bArr);
    }
}
