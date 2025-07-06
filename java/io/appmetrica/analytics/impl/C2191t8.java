package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.t8 */
/* loaded from: classes.dex */
public final class C2191t8 extends MessageNano {

    /* renamed from: c */
    public static volatile C2191t8[] f7152c;

    /* renamed from: a */
    public C2066o8 f7153a;

    /* renamed from: b */
    public C2116q8 f7154b;

    public C2191t8() {
        m4449a();
    }

    /* renamed from: b */
    public static C2191t8[] m4448b() {
        if (f7152c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7152c == null) {
                        f7152c = new C2191t8[0];
                    }
                } finally {
                }
            }
        }
        return f7152c;
    }

    /* renamed from: a */
    public final C2191t8 m4449a() {
        this.f7153a = null;
        this.f7154b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C2066o8 c2066o8 = this.f7153a;
        if (c2066o8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c2066o8);
        }
        C2116q8 c2116q8 = this.f7154b;
        return c2116q8 != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, c2116q8) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        C2066o8 c2066o8 = this.f7153a;
        if (c2066o8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c2066o8);
        }
        C2116q8 c2116q8 = this.f7154b;
        if (c2116q8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c2116q8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2191t8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                if (this.f7153a == null) {
                    this.f7153a = new C2066o8();
                }
                codedInputByteBufferNano.readMessage(this.f7153a);
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f7154b == null) {
                    this.f7154b = new C2116q8();
                }
                codedInputByteBufferNano.readMessage(this.f7154b);
            }
        }
    }

    /* renamed from: b */
    public static C2191t8 m4447b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C2191t8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C2191t8 m4446a(byte[] bArr) {
        return (C2191t8) MessageNano.mergeFrom(new C2191t8(), bArr);
    }
}
