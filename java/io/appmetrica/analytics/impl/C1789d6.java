package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.d6 */
/* loaded from: classes.dex */
public final class C1789d6 extends MessageNano {

    /* renamed from: b */
    public static volatile C1789d6[] f6075b;

    /* renamed from: a */
    public String f6076a;

    public C1789d6() {
        m3728a();
    }

    /* renamed from: b */
    public static C1789d6[] m3727b() {
        if (f6075b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6075b == null) {
                        f6075b = new C1789d6[0];
                    }
                } finally {
                }
            }
        }
        return f6075b;
    }

    /* renamed from: a */
    public final C1789d6 m3728a() {
        this.f6076a = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeStringSize(1, this.f6076a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeString(1, this.f6076a);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1789d6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
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
                this.f6076a = codedInputByteBufferNano.readString();
            }
        }
    }

    /* renamed from: a */
    public static C1789d6 m3725a(byte[] bArr) {
        return (C1789d6) MessageNano.mergeFrom(new C1789d6(), bArr);
    }

    /* renamed from: b */
    public static C1789d6 m3726b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1789d6().mergeFrom(codedInputByteBufferNano);
    }
}
