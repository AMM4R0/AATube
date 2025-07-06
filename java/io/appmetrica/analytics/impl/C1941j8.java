package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.j8 */
/* loaded from: classes.dex */
public final class C1941j8 extends MessageNano {

    /* renamed from: c */
    public static volatile C1941j8[] f6528c;

    /* renamed from: a */
    public int f6529a;

    /* renamed from: b */
    public C1841f8 f6530b;

    public C1941j8() {
        m4030a();
    }

    /* renamed from: b */
    public static C1941j8[] m4029b() {
        if (f6528c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6528c == null) {
                        f6528c = new C1941j8[0];
                    }
                } finally {
                }
            }
        }
        return f6528c;
    }

    /* renamed from: a */
    public final C1941j8 m4030a() {
        this.f6529a = 0;
        this.f6530b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int r12 = this.f6529a;
        if (r12 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, r12);
        }
        C1841f8 c1841f8 = this.f6530b;
        return c1841f8 != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, c1841f8) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int r02 = this.f6529a;
        if (r02 != 0) {
            codedOutputByteBufferNano.writeUInt32(1, r02);
        }
        C1841f8 c1841f8 = this.f6530b;
        if (c1841f8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c1841f8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1941j8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f6529a = codedInputByteBufferNano.readUInt32();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f6530b == null) {
                    this.f6530b = new C1841f8();
                }
                codedInputByteBufferNano.readMessage(this.f6530b);
            }
        }
    }

    /* renamed from: b */
    public static C1941j8 m4028b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1941j8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C1941j8 m4027a(byte[] bArr) {
        return (C1941j8) MessageNano.mergeFrom(new C1941j8(), bArr);
    }
}
