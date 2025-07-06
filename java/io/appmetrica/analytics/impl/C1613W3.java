package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.W3 */
/* loaded from: classes.dex */
public final class C1613W3 extends MessageNano {

    /* renamed from: c */
    public static volatile C1613W3[] f5617c;

    /* renamed from: a */
    public String f5618a;

    /* renamed from: b */
    public String f5619b;

    public C1613W3() {
        m3453a();
    }

    /* renamed from: b */
    public static C1613W3[] m3452b() {
        if (f5617c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5617c == null) {
                        f5617c = new C1613W3[0];
                    }
                } finally {
                }
            }
        }
        return f5617c;
    }

    /* renamed from: a */
    public final C1613W3 m3453a() {
        this.f5618a = "";
        this.f5619b = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f5618a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f5618a);
        }
        return !this.f5619b.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(2, this.f5619b) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f5618a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f5618a);
        }
        if (!this.f5619b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f5619b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1613W3 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f5618a = codedInputByteBufferNano.readString();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f5619b = codedInputByteBufferNano.readString();
            }
        }
    }

    /* renamed from: b */
    public static C1613W3 m3451b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1613W3().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C1613W3 m3450a(byte[] bArr) {
        return (C1613W3) MessageNano.mergeFrom(new C1613W3(), bArr);
    }
}
