package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.e9 */
/* loaded from: classes.dex */
public final class C1817e9 extends MessageNano {

    /* renamed from: c */
    public static volatile C1817e9[] f6142c;

    /* renamed from: a */
    public int f6143a;

    /* renamed from: b */
    public String f6144b;

    public C1817e9() {
        m3783a();
    }

    /* renamed from: b */
    public static C1817e9[] m3782b() {
        if (f6142c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6142c == null) {
                        f6142c = new C1817e9[0];
                    }
                } finally {
                }
            }
        }
        return f6142c;
    }

    /* renamed from: a */
    public final C1817e9 m3783a() {
        this.f6143a = 2;
        this.f6144b = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int r12 = this.f6143a;
        if (r12 != 2) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(3, r12);
        }
        return !this.f6144b.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(4, this.f6144b) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int r02 = this.f6143a;
        if (r02 != 2) {
            codedOutputByteBufferNano.writeInt32(3, r02);
        }
        if (!this.f6144b.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f6144b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1817e9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 24) {
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
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        this.f6143a = readInt32;
                        break;
                }
            } else if (readTag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f6144b = codedInputByteBufferNano.readString();
            }
        }
    }

    /* renamed from: b */
    public static C1817e9 m3781b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1817e9().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C1817e9 m3780a(byte[] bArr) {
        return (C1817e9) MessageNano.mergeFrom(new C1817e9(), bArr);
    }
}
