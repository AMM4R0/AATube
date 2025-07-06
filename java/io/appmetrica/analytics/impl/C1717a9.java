package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.a9 */
/* loaded from: classes.dex */
public final class C1717a9 extends MessageNano {

    /* renamed from: j */
    public static final int f5850j = 0;

    /* renamed from: k */
    public static final int f5851k = 1;

    /* renamed from: l */
    public static final int f5852l = 2;

    /* renamed from: m */
    public static volatile C1717a9[] f5853m;

    /* renamed from: a */
    public double f5854a;

    /* renamed from: b */
    public double f5855b;

    /* renamed from: c */
    public long f5856c;

    /* renamed from: d */
    public int f5857d;

    /* renamed from: e */
    public int f5858e;

    /* renamed from: f */
    public int f5859f;

    /* renamed from: g */
    public int f5860g;

    /* renamed from: h */
    public int f5861h;

    /* renamed from: i */
    public String f5862i;

    public C1717a9() {
        m3606a();
    }

    /* renamed from: b */
    public static C1717a9[] m3605b() {
        if (f5853m == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5853m == null) {
                        f5853m = new C1717a9[0];
                    }
                } finally {
                }
            }
        }
        return f5853m;
    }

    /* renamed from: a */
    public final C1717a9 m3606a() {
        this.f5854a = 0.0d;
        this.f5855b = 0.0d;
        this.f5856c = 0L;
        this.f5857d = 0;
        this.f5858e = 0;
        this.f5859f = 0;
        this.f5860g = 0;
        this.f5861h = 0;
        this.f5862i = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeDoubleSize = CodedOutputByteBufferNano.computeDoubleSize(2, this.f5855b) + CodedOutputByteBufferNano.computeDoubleSize(1, this.f5854a) + super.computeSerializedSize();
        long j2 = this.f5856c;
        if (j2 != 0) {
            computeDoubleSize += CodedOutputByteBufferNano.computeUInt64Size(3, j2);
        }
        int r12 = this.f5857d;
        if (r12 != 0) {
            computeDoubleSize += CodedOutputByteBufferNano.computeUInt32Size(4, r12);
        }
        int r13 = this.f5858e;
        if (r13 != 0) {
            computeDoubleSize += CodedOutputByteBufferNano.computeUInt32Size(5, r13);
        }
        int r14 = this.f5859f;
        if (r14 != 0) {
            computeDoubleSize += CodedOutputByteBufferNano.computeUInt32Size(6, r14);
        }
        int r15 = this.f5860g;
        if (r15 != 0) {
            computeDoubleSize += CodedOutputByteBufferNano.computeInt32Size(7, r15);
        }
        int r16 = this.f5861h;
        if (r16 != 0) {
            computeDoubleSize += CodedOutputByteBufferNano.computeInt32Size(8, r16);
        }
        return !this.f5862i.equals("") ? computeDoubleSize + CodedOutputByteBufferNano.computeStringSize(9, this.f5862i) : computeDoubleSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeDouble(1, this.f5854a);
        codedOutputByteBufferNano.writeDouble(2, this.f5855b);
        long j2 = this.f5856c;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeUInt64(3, j2);
        }
        int r02 = this.f5857d;
        if (r02 != 0) {
            codedOutputByteBufferNano.writeUInt32(4, r02);
        }
        int r03 = this.f5858e;
        if (r03 != 0) {
            codedOutputByteBufferNano.writeUInt32(5, r03);
        }
        int r04 = this.f5859f;
        if (r04 != 0) {
            codedOutputByteBufferNano.writeUInt32(6, r04);
        }
        int r05 = this.f5860g;
        if (r05 != 0) {
            codedOutputByteBufferNano.writeInt32(7, r05);
        }
        int r06 = this.f5861h;
        if (r06 != 0) {
            codedOutputByteBufferNano.writeInt32(8, r06);
        }
        if (!this.f5862i.equals("")) {
            codedOutputByteBufferNano.writeString(9, this.f5862i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    /* renamed from: b */
    public static C1717a9 m3604b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1717a9().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1717a9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 9) {
                this.f5854a = codedInputByteBufferNano.readDouble();
            } else if (readTag == 17) {
                this.f5855b = codedInputByteBufferNano.readDouble();
            } else if (readTag == 24) {
                this.f5856c = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 32) {
                this.f5857d = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 40) {
                this.f5858e = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 48) {
                this.f5859f = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 56) {
                this.f5860g = codedInputByteBufferNano.readInt32();
            } else if (readTag == 64) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                    this.f5861h = readInt32;
                }
            } else if (readTag != 74) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f5862i = codedInputByteBufferNano.readString();
            }
        }
    }

    /* renamed from: a */
    public static C1717a9 m3603a(byte[] bArr) {
        return (C1717a9) MessageNano.mergeFrom(new C1717a9(), bArr);
    }
}
