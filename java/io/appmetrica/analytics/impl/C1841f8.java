package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.f8 */
/* loaded from: classes.dex */
public final class C1841f8 extends MessageNano {

    /* renamed from: e */
    public static volatile C1841f8[] f6199e;

    /* renamed from: a */
    public C2066o8 f6200a;

    /* renamed from: b */
    public C2116q8 f6201b;

    /* renamed from: c */
    public C1891h8 f6202c;

    /* renamed from: d */
    public C2041n8 f6203d;

    public C1841f8() {
        m3819a();
    }

    /* renamed from: b */
    public static C1841f8[] m3818b() {
        if (f6199e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6199e == null) {
                        f6199e = new C1841f8[0];
                    }
                } finally {
                }
            }
        }
        return f6199e;
    }

    /* renamed from: a */
    public final C1841f8 m3819a() {
        this.f6200a = null;
        this.f6201b = null;
        this.f6202c = null;
        this.f6203d = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C2066o8 c2066o8 = this.f6200a;
        if (c2066o8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c2066o8);
        }
        C2116q8 c2116q8 = this.f6201b;
        if (c2116q8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c2116q8);
        }
        C1891h8 c1891h8 = this.f6202c;
        if (c1891h8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c1891h8);
        }
        C2041n8 c2041n8 = this.f6203d;
        return c2041n8 != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(4, c2041n8) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        C2066o8 c2066o8 = this.f6200a;
        if (c2066o8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c2066o8);
        }
        C2116q8 c2116q8 = this.f6201b;
        if (c2116q8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c2116q8);
        }
        C1891h8 c1891h8 = this.f6202c;
        if (c1891h8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c1891h8);
        }
        C2041n8 c2041n8 = this.f6203d;
        if (c2041n8 != null) {
            codedOutputByteBufferNano.writeMessage(4, c2041n8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1841f8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                if (this.f6200a == null) {
                    this.f6200a = new C2066o8();
                }
                codedInputByteBufferNano.readMessage(this.f6200a);
            } else if (readTag == 18) {
                if (this.f6201b == null) {
                    this.f6201b = new C2116q8();
                }
                codedInputByteBufferNano.readMessage(this.f6201b);
            } else if (readTag == 26) {
                if (this.f6202c == null) {
                    this.f6202c = new C1891h8();
                }
                codedInputByteBufferNano.readMessage(this.f6202c);
            } else if (readTag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f6203d == null) {
                    this.f6203d = new C2041n8();
                }
                codedInputByteBufferNano.readMessage(this.f6203d);
            }
        }
    }

    /* renamed from: b */
    public static C1841f8 m3817b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1841f8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C1841f8 m3816a(byte[] bArr) {
        return (C1841f8) MessageNano.mergeFrom(new C1841f8(), bArr);
    }
}
