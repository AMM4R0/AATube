package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.Z5 */
/* loaded from: classes.dex */
public final class C1689Z5 extends MessageNano {

    /* renamed from: d */
    public static volatile C1689Z5[] f5783d;

    /* renamed from: a */
    public C1665Y5 f5784a;

    /* renamed from: b */
    public String f5785b;

    /* renamed from: c */
    public int f5786c;

    public C1689Z5() {
        m3566a();
    }

    /* renamed from: b */
    public static C1689Z5[] m3565b() {
        if (f5783d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5783d == null) {
                        f5783d = new C1689Z5[0];
                    }
                } finally {
                }
            }
        }
        return f5783d;
    }

    /* renamed from: a */
    public final C1689Z5 m3566a() {
        this.f5784a = null;
        this.f5785b = "";
        this.f5786c = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C1665Y5 c1665y5 = this.f5784a;
        if (c1665y5 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c1665y5);
        }
        if (!this.f5785b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f5785b);
        }
        int r12 = this.f5786c;
        return r12 != -1 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(3, r12) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        C1665Y5 c1665y5 = this.f5784a;
        if (c1665y5 != null) {
            codedOutputByteBufferNano.writeMessage(1, c1665y5);
        }
        if (!this.f5785b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f5785b);
        }
        int r02 = this.f5786c;
        if (r02 != -1) {
            codedOutputByteBufferNano.writeInt32(3, r02);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1689Z5 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                if (this.f5784a == null) {
                    this.f5784a = new C1665Y5();
                }
                codedInputByteBufferNano.readMessage(this.f5784a);
            } else if (readTag == 18) {
                this.f5785b = codedInputByteBufferNano.readString();
            } else if (readTag != 24) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == -1 || readInt32 == 0 || readInt32 == 1) {
                    this.f5786c = readInt32;
                }
            }
        }
    }

    /* renamed from: b */
    public static C1689Z5 m3564b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1689Z5().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C1689Z5 m3563a(byte[] bArr) {
        return (C1689Z5) MessageNano.mergeFrom(new C1689Z5(), bArr);
    }
}
