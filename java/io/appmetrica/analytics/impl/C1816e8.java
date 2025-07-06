package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.e8 */
/* loaded from: classes.dex */
public final class C1816e8 extends MessageNano {

    /* renamed from: b */
    public static volatile C1816e8[] f6140b;

    /* renamed from: a */
    public C1841f8 f6141a;

    public C1816e8() {
        m3778a();
    }

    /* renamed from: b */
    public static C1816e8[] m3777b() {
        if (f6140b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6140b == null) {
                        f6140b = new C1816e8[0];
                    }
                } finally {
                }
            }
        }
        return f6140b;
    }

    /* renamed from: a */
    public final C1816e8 m3778a() {
        this.f6141a = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C1841f8 c1841f8 = this.f6141a;
        return c1841f8 != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(1, c1841f8) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        C1841f8 c1841f8 = this.f6141a;
        if (c1841f8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c1841f8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1816e8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
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
                if (this.f6141a == null) {
                    this.f6141a = new C1841f8();
                }
                codedInputByteBufferNano.readMessage(this.f6141a);
            }
        }
    }

    /* renamed from: b */
    public static C1816e8 m3776b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1816e8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C1816e8 m3775a(byte[] bArr) {
        return (C1816e8) MessageNano.mergeFrom(new C1816e8(), bArr);
    }
}
