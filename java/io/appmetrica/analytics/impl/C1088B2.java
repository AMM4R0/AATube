package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.B2 */
/* loaded from: classes.dex */
public final class C1088B2 extends MessageNano {

    /* renamed from: f */
    public static volatile C1088B2[] f4508f;

    /* renamed from: a */
    public int f4509a;

    /* renamed from: b */
    public String f4510b;

    /* renamed from: c */
    public String f4511c;

    /* renamed from: d */
    public long f4512d;

    /* renamed from: e */
    public long f4513e;

    public C1088B2() {
        m2742a();
    }

    /* renamed from: b */
    public static C1088B2[] m2741b() {
        if (f4508f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f4508f == null) {
                        f4508f = new C1088B2[0];
                    }
                } finally {
                }
            }
        }
        return f4508f;
    }

    /* renamed from: a */
    public final C1088B2 m2742a() {
        this.f4509a = 1;
        this.f4510b = "";
        this.f4511c = "";
        this.f4512d = 0L;
        this.f4513e = 0L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeUInt64Size(5, this.f4513e) + CodedOutputByteBufferNano.computeUInt64Size(4, this.f4512d) + CodedOutputByteBufferNano.computeStringSize(3, this.f4511c) + CodedOutputByteBufferNano.computeStringSize(2, this.f4510b) + CodedOutputByteBufferNano.computeInt32Size(1, this.f4509a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeInt32(1, this.f4509a);
        codedOutputByteBufferNano.writeString(2, this.f4510b);
        codedOutputByteBufferNano.writeString(3, this.f4511c);
        codedOutputByteBufferNano.writeUInt64(4, this.f4512d);
        codedOutputByteBufferNano.writeUInt64(5, this.f4513e);
        super.writeTo(codedOutputByteBufferNano);
    }

    /* renamed from: b */
    public static C1088B2 m2740b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1088B2().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1088B2 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 1 || readInt32 == 2 || readInt32 == 3) {
                    this.f4509a = readInt32;
                }
            } else if (readTag == 18) {
                this.f4510b = codedInputByteBufferNano.readString();
            } else if (readTag == 26) {
                this.f4511c = codedInputByteBufferNano.readString();
            } else if (readTag == 32) {
                this.f4512d = codedInputByteBufferNano.readUInt64();
            } else if (readTag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f4513e = codedInputByteBufferNano.readUInt64();
            }
        }
    }

    /* renamed from: a */
    public static C1088B2 m2739a(byte[] bArr) {
        return (C1088B2) MessageNano.mergeFrom(new C1088B2(), bArr);
    }
}
