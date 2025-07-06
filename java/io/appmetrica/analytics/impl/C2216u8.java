package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.u8 */
/* loaded from: classes.dex */
public final class C2216u8 extends MessageNano {

    /* renamed from: b */
    public static volatile C2216u8[] f7215b;

    /* renamed from: a */
    public C2141r8 f7216a;

    public C2216u8() {
        m4479a();
    }

    /* renamed from: b */
    public static C2216u8[] m4478b() {
        if (f7215b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7215b == null) {
                        f7215b = new C2216u8[0];
                    }
                } finally {
                }
            }
        }
        return f7215b;
    }

    /* renamed from: a */
    public final C2216u8 m4479a() {
        this.f7216a = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C2141r8 c2141r8 = this.f7216a;
        return c2141r8 != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(1, c2141r8) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        C2141r8 c2141r8 = this.f7216a;
        if (c2141r8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c2141r8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2216u8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
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
                if (this.f7216a == null) {
                    this.f7216a = new C2141r8();
                }
                codedInputByteBufferNano.readMessage(this.f7216a);
            }
        }
    }

    /* renamed from: b */
    public static C2216u8 m4477b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C2216u8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C2216u8 m4476a(byte[] bArr) {
        return (C2216u8) MessageNano.mergeFrom(new C2216u8(), bArr);
    }
}
