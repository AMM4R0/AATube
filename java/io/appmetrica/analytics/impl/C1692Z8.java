package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.Z8 */
/* loaded from: classes.dex */
public final class C1692Z8 extends MessageNano {

    /* renamed from: c */
    public static volatile C1692Z8[] f5795c;

    /* renamed from: a */
    public String f5796a;

    /* renamed from: b */
    public String f5797b;

    public C1692Z8() {
        m3571a();
    }

    /* renamed from: b */
    public static C1692Z8[] m3570b() {
        if (f5795c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5795c == null) {
                        f5795c = new C1692Z8[0];
                    }
                } finally {
                }
            }
        }
        return f5795c;
    }

    /* renamed from: a */
    public final C1692Z8 m3571a() {
        this.f5796a = "";
        this.f5797b = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeStringSize(2, this.f5797b) + CodedOutputByteBufferNano.computeStringSize(1, this.f5796a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeString(1, this.f5796a);
        codedOutputByteBufferNano.writeString(2, this.f5797b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1692Z8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f5796a = codedInputByteBufferNano.readString();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f5797b = codedInputByteBufferNano.readString();
            }
        }
    }

    /* renamed from: b */
    public static C1692Z8 m3569b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1692Z8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C1692Z8 m3568a(byte[] bArr) {
        return (C1692Z8) MessageNano.mergeFrom(new C1692Z8(), bArr);
    }
}
