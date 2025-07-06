package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.tn */
/* loaded from: classes.dex */
public final class C2206tn extends MessageNano {

    /* renamed from: e */
    public static final int f7179e = 0;

    /* renamed from: f */
    public static final int f7180f = 1;

    /* renamed from: g */
    public static final int f7181g = 2;

    /* renamed from: h */
    public static final int f7182h = 3;

    /* renamed from: i */
    public static volatile C2206tn[] f7183i;

    /* renamed from: a */
    public byte[] f7184a;

    /* renamed from: b */
    public int f7185b;

    /* renamed from: c */
    public C2231un f7186c;

    /* renamed from: d */
    public C2256vn f7187d;

    public C2206tn() {
        m4465a();
    }

    /* renamed from: b */
    public static C2206tn[] m4464b() {
        if (f7183i == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7183i == null) {
                        f7183i = new C2206tn[0];
                    }
                } finally {
                }
            }
        }
        return f7183i;
    }

    /* renamed from: a */
    public final C2206tn m4465a() {
        this.f7184a = WireFormatNano.EMPTY_BYTES;
        this.f7185b = 0;
        this.f7186c = null;
        this.f7187d = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeInt32Size = CodedOutputByteBufferNano.computeInt32Size(2, this.f7185b) + CodedOutputByteBufferNano.computeBytesSize(1, this.f7184a) + super.computeSerializedSize();
        C2231un c2231un = this.f7186c;
        if (c2231un != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(3, c2231un);
        }
        C2256vn c2256vn = this.f7187d;
        return c2256vn != null ? computeInt32Size + CodedOutputByteBufferNano.computeMessageSize(4, c2256vn) : computeInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeBytes(1, this.f7184a);
        codedOutputByteBufferNano.writeInt32(2, this.f7185b);
        C2231un c2231un = this.f7186c;
        if (c2231un != null) {
            codedOutputByteBufferNano.writeMessage(3, c2231un);
        }
        C2256vn c2256vn = this.f7187d;
        if (c2256vn != null) {
            codedOutputByteBufferNano.writeMessage(4, c2256vn);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2206tn mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f7184a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 16) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3) {
                    this.f7185b = readInt32;
                }
            } else if (readTag == 26) {
                if (this.f7186c == null) {
                    this.f7186c = new C2231un();
                }
                codedInputByteBufferNano.readMessage(this.f7186c);
            } else if (readTag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f7187d == null) {
                    this.f7187d = new C2256vn();
                }
                codedInputByteBufferNano.readMessage(this.f7187d);
            }
        }
    }

    /* renamed from: b */
    public static C2206tn m4463b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C2206tn().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C2206tn m4462a(byte[] bArr) {
        return (C2206tn) MessageNano.mergeFrom(new C2206tn(), bArr);
    }
}
