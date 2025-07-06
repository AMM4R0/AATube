package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.s8 */
/* loaded from: classes.dex */
public final class C2166s8 extends MessageNano {

    /* renamed from: c */
    public static volatile C2166s8[] f7121c;

    /* renamed from: a */
    public C2066o8 f7122a;

    /* renamed from: b */
    public C2141r8 f7123b;

    public C2166s8() {
        m4421a();
    }

    /* renamed from: b */
    public static C2166s8[] m4420b() {
        if (f7121c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7121c == null) {
                        f7121c = new C2166s8[0];
                    }
                } finally {
                }
            }
        }
        return f7121c;
    }

    /* renamed from: a */
    public final C2166s8 m4421a() {
        this.f7122a = null;
        this.f7123b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C2066o8 c2066o8 = this.f7122a;
        if (c2066o8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c2066o8);
        }
        C2141r8 c2141r8 = this.f7123b;
        return c2141r8 != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, c2141r8) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        C2066o8 c2066o8 = this.f7122a;
        if (c2066o8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c2066o8);
        }
        C2141r8 c2141r8 = this.f7123b;
        if (c2141r8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c2141r8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2166s8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                if (this.f7122a == null) {
                    this.f7122a = new C2066o8();
                }
                codedInputByteBufferNano.readMessage(this.f7122a);
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f7123b == null) {
                    this.f7123b = new C2141r8();
                }
                codedInputByteBufferNano.readMessage(this.f7123b);
            }
        }
    }

    /* renamed from: b */
    public static C2166s8 m4419b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C2166s8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C2166s8 m4418a(byte[] bArr) {
        return (C2166s8) MessageNano.mergeFrom(new C2166s8(), bArr);
    }
}
