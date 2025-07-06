package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.b6 */
/* loaded from: classes.dex */
public final class C1739b6 extends MessageNano {

    /* renamed from: c */
    public static volatile C1739b6[] f5907c;

    /* renamed from: a */
    public byte[] f5908a;

    /* renamed from: b */
    public C1839f6 f5909b;

    public C1739b6() {
        m3642a();
    }

    /* renamed from: b */
    public static C1739b6[] m3641b() {
        if (f5907c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5907c == null) {
                        f5907c = new C1739b6[0];
                    }
                } finally {
                }
            }
        }
        return f5907c;
    }

    /* renamed from: a */
    public final C1739b6 m3642a() {
        this.f5908a = WireFormatNano.EMPTY_BYTES;
        this.f5909b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f5908a, WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f5908a);
        }
        C1839f6 c1839f6 = this.f5909b;
        return c1839f6 != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, c1839f6) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!Arrays.equals(this.f5908a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f5908a);
        }
        C1839f6 c1839f6 = this.f5909b;
        if (c1839f6 != null) {
            codedOutputByteBufferNano.writeMessage(2, c1839f6);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1739b6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f5908a = codedInputByteBufferNano.readBytes();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f5909b == null) {
                    this.f5909b = new C1839f6();
                }
                codedInputByteBufferNano.readMessage(this.f5909b);
            }
        }
    }

    /* renamed from: b */
    public static C1739b6 m3640b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1739b6().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C1739b6 m3639a(byte[] bArr) {
        return (C1739b6) MessageNano.mergeFrom(new C1739b6(), bArr);
    }
}
