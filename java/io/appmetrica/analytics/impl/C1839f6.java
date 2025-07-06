package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.f6 */
/* loaded from: classes.dex */
public final class C1839f6 extends MessageNano {

    /* renamed from: c */
    public static volatile C1839f6[] f6194c;

    /* renamed from: a */
    public int f6195a;

    /* renamed from: b */
    public String f6196b;

    public C1839f6() {
        m3812a();
    }

    /* renamed from: b */
    public static C1839f6[] m3811b() {
        if (f6194c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6194c == null) {
                        f6194c = new C1839f6[0];
                    }
                } finally {
                }
            }
        }
        return f6194c;
    }

    /* renamed from: a */
    public final C1839f6 m3812a() {
        this.f6195a = 0;
        this.f6196b = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int r12 = this.f6195a;
        if (r12 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, r12);
        }
        return !this.f6196b.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(2, this.f6196b) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int r02 = this.f6195a;
        if (r02 != 0) {
            codedOutputByteBufferNano.writeInt32(1, r02);
        }
        if (!this.f6196b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f6196b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1839f6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 3) {
                    this.f6195a = readInt32;
                }
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f6196b = codedInputByteBufferNano.readString();
            }
        }
    }

    /* renamed from: b */
    public static C1839f6 m3810b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1839f6().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C1839f6 m3809a(byte[] bArr) {
        return (C1839f6) MessageNano.mergeFrom(new C1839f6(), bArr);
    }
}
