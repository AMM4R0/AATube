package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.v8 */
/* loaded from: classes.dex */
public final class C2241v8 extends MessageNano {

    /* renamed from: g */
    public static final int f7264g = 0;

    /* renamed from: h */
    public static final int f7265h = 1;

    /* renamed from: i */
    public static final int f7266i = 2;

    /* renamed from: j */
    public static final int f7267j = 3;

    /* renamed from: k */
    public static final int f7268k = 4;

    /* renamed from: l */
    public static final int f7269l = 5;

    /* renamed from: m */
    public static final int f7270m = 6;

    /* renamed from: n */
    public static final int f7271n = 7;

    /* renamed from: o */
    public static volatile C2241v8[] f7272o;

    /* renamed from: a */
    public int f7273a;

    /* renamed from: b */
    public C2216u8 f7274b;

    /* renamed from: c */
    public C2166s8 f7275c;

    /* renamed from: d */
    public C2191t8 f7276d;

    /* renamed from: e */
    public C1816e8 f7277e;

    /* renamed from: f */
    public C1966k8 f7278f;

    public C2241v8() {
        m4514a();
    }

    /* renamed from: b */
    public static C2241v8[] m4513b() {
        if (f7272o == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7272o == null) {
                        f7272o = new C2241v8[0];
                    }
                } finally {
                }
            }
        }
        return f7272o;
    }

    /* renamed from: a */
    public final C2241v8 m4514a() {
        this.f7273a = 0;
        this.f7274b = null;
        this.f7275c = null;
        this.f7276d = null;
        this.f7277e = null;
        this.f7278f = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int r12 = this.f7273a;
        if (r12 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, r12);
        }
        C2216u8 c2216u8 = this.f7274b;
        if (c2216u8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c2216u8);
        }
        C2166s8 c2166s8 = this.f7275c;
        if (c2166s8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c2166s8);
        }
        C2191t8 c2191t8 = this.f7276d;
        if (c2191t8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, c2191t8);
        }
        C1816e8 c1816e8 = this.f7277e;
        if (c1816e8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, c1816e8);
        }
        C1966k8 c1966k8 = this.f7278f;
        return c1966k8 != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(6, c1966k8) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int r02 = this.f7273a;
        if (r02 != 0) {
            codedOutputByteBufferNano.writeInt32(1, r02);
        }
        C2216u8 c2216u8 = this.f7274b;
        if (c2216u8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c2216u8);
        }
        C2166s8 c2166s8 = this.f7275c;
        if (c2166s8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c2166s8);
        }
        C2191t8 c2191t8 = this.f7276d;
        if (c2191t8 != null) {
            codedOutputByteBufferNano.writeMessage(4, c2191t8);
        }
        C1816e8 c1816e8 = this.f7277e;
        if (c1816e8 != null) {
            codedOutputByteBufferNano.writeMessage(5, c1816e8);
        }
        C1966k8 c1966k8 = this.f7278f;
        if (c1966k8 != null) {
            codedOutputByteBufferNano.writeMessage(6, c1966k8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    /* renamed from: b */
    public static C2241v8 m4512b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C2241v8().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2241v8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                switch (readInt32) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        this.f7273a = readInt32;
                        break;
                }
            } else if (readTag == 18) {
                if (this.f7274b == null) {
                    this.f7274b = new C2216u8();
                }
                codedInputByteBufferNano.readMessage(this.f7274b);
            } else if (readTag == 26) {
                if (this.f7275c == null) {
                    this.f7275c = new C2166s8();
                }
                codedInputByteBufferNano.readMessage(this.f7275c);
            } else if (readTag == 34) {
                if (this.f7276d == null) {
                    this.f7276d = new C2191t8();
                }
                codedInputByteBufferNano.readMessage(this.f7276d);
            } else if (readTag == 42) {
                if (this.f7277e == null) {
                    this.f7277e = new C1816e8();
                }
                codedInputByteBufferNano.readMessage(this.f7277e);
            } else if (readTag != 50) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f7278f == null) {
                    this.f7278f = new C1966k8();
                }
                codedInputByteBufferNano.readMessage(this.f7278f);
            }
        }
    }

    /* renamed from: a */
    public static C2241v8 m4511a(byte[] bArr) {
        return (C2241v8) MessageNano.mergeFrom(new C2241v8(), bArr);
    }
}
