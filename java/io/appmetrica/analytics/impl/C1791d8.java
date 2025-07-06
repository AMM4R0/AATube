package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.d8 */
/* loaded from: classes.dex */
public final class C1791d8 extends MessageNano {

    /* renamed from: c */
    public static volatile C1791d8[] f6080c;

    /* renamed from: a */
    public byte[] f6081a;

    /* renamed from: b */
    public C1891h8 f6082b;

    public C1791d8() {
        m3735a();
    }

    /* renamed from: b */
    public static C1791d8[] m3734b() {
        if (f6080c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6080c == null) {
                        f6080c = new C1791d8[0];
                    }
                } finally {
                }
            }
        }
        return f6080c;
    }

    /* renamed from: a */
    public final C1791d8 m3735a() {
        this.f6081a = WireFormatNano.EMPTY_BYTES;
        this.f6082b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f6081a, WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f6081a);
        }
        C1891h8 c1891h8 = this.f6082b;
        return c1891h8 != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, c1891h8) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!Arrays.equals(this.f6081a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f6081a);
        }
        C1891h8 c1891h8 = this.f6082b;
        if (c1891h8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c1891h8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1791d8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f6081a = codedInputByteBufferNano.readBytes();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f6082b == null) {
                    this.f6082b = new C1891h8();
                }
                codedInputByteBufferNano.readMessage(this.f6082b);
            }
        }
    }

    /* renamed from: b */
    public static C1791d8 m3733b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1791d8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C1791d8 m3732a(byte[] bArr) {
        return (C1791d8) MessageNano.mergeFrom(new C1791d8(), bArr);
    }
}
