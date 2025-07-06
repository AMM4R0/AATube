package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.r7 */
/* loaded from: classes.dex */
public final class C2140r7 extends MessageNano {

    /* renamed from: k */
    public static volatile C2140r7[] f7043k;

    /* renamed from: a */
    public int f7044a;

    /* renamed from: b */
    public double f7045b;

    /* renamed from: c */
    public double f7046c;

    /* renamed from: d */
    public int f7047d;

    /* renamed from: e */
    public int f7048e;

    /* renamed from: f */
    public int f7049f;

    /* renamed from: g */
    public int f7050g;

    /* renamed from: h */
    public long f7051h;

    /* renamed from: i */
    public String f7052i;

    /* renamed from: j */
    public String f7053j;

    public C2140r7() {
        m4390a();
    }

    /* renamed from: b */
    public static C2140r7[] m4389b() {
        if (f7043k == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7043k == null) {
                        f7043k = new C2140r7[0];
                    }
                } finally {
                }
            }
        }
        return f7043k;
    }

    /* renamed from: a */
    public final C2140r7 m4390a() {
        this.f7044a = -1;
        this.f7045b = -1.0d;
        this.f7046c = -1.0d;
        this.f7047d = -1;
        this.f7048e = -1;
        this.f7049f = -1;
        this.f7050g = -1;
        this.f7051h = -1L;
        this.f7052i = "";
        this.f7053j = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int r12 = this.f7044a;
        if (r12 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, r12);
        }
        if (Double.doubleToLongBits(this.f7045b) != Double.doubleToLongBits(-1.0d)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(2, this.f7045b);
        }
        if (Double.doubleToLongBits(this.f7046c) != Double.doubleToLongBits(-1.0d)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(3, this.f7046c);
        }
        int r13 = this.f7047d;
        if (r13 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, r13);
        }
        int r14 = this.f7048e;
        if (r14 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(5, r14);
        }
        int r15 = this.f7049f;
        if (r15 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(6, r15);
        }
        int r16 = this.f7050g;
        if (r16 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(7, r16);
        }
        long j2 = this.f7051h;
        if (j2 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(8, j2);
        }
        if (!this.f7052i.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(9, this.f7052i);
        }
        return !this.f7053j.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(10, this.f7053j) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int r02 = this.f7044a;
        if (r02 != -1) {
            codedOutputByteBufferNano.writeInt32(1, r02);
        }
        if (Double.doubleToLongBits(this.f7045b) != Double.doubleToLongBits(-1.0d)) {
            codedOutputByteBufferNano.writeDouble(2, this.f7045b);
        }
        if (Double.doubleToLongBits(this.f7046c) != Double.doubleToLongBits(-1.0d)) {
            codedOutputByteBufferNano.writeDouble(3, this.f7046c);
        }
        int r03 = this.f7047d;
        if (r03 != -1) {
            codedOutputByteBufferNano.writeInt32(4, r03);
        }
        int r04 = this.f7048e;
        if (r04 != -1) {
            codedOutputByteBufferNano.writeInt32(5, r04);
        }
        int r05 = this.f7049f;
        if (r05 != -1) {
            codedOutputByteBufferNano.writeInt32(6, r05);
        }
        int r06 = this.f7050g;
        if (r06 != -1) {
            codedOutputByteBufferNano.writeInt32(7, r06);
        }
        long j2 = this.f7051h;
        if (j2 != -1) {
            codedOutputByteBufferNano.writeInt64(8, j2);
        }
        if (!this.f7052i.equals("")) {
            codedOutputByteBufferNano.writeString(9, this.f7052i);
        }
        if (!this.f7053j.equals("")) {
            codedOutputByteBufferNano.writeString(10, this.f7053j);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    /* renamed from: b */
    public static C2140r7 m4388b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C2140r7().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2140r7 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    return this;
                case 8:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 != -1 && readInt32 != 0 && readInt32 != 1) {
                        break;
                    } else {
                        this.f7044a = readInt32;
                        break;
                    }
                case 17:
                    this.f7045b = codedInputByteBufferNano.readDouble();
                    break;
                case C1842f9.f6211H /* 25 */:
                    this.f7046c = codedInputByteBufferNano.readDouble();
                    break;
                case 32:
                    this.f7047d = codedInputByteBufferNano.readInt32();
                    break;
                case C1842f9.f6217N /* 40 */:
                    this.f7048e = codedInputByteBufferNano.readInt32();
                    break;
                case 48:
                    this.f7049f = codedInputByteBufferNano.readInt32();
                    break;
                case 56:
                    this.f7050g = codedInputByteBufferNano.readInt32();
                    break;
                case 64:
                    this.f7051h = codedInputByteBufferNano.readInt64();
                    break;
                case 74:
                    this.f7052i = codedInputByteBufferNano.readString();
                    break;
                case 82:
                    this.f7053j = codedInputByteBufferNano.readString();
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        return this;
                    }
                    break;
            }
        }
    }

    /* renamed from: a */
    public static C2140r7 m4387a(byte[] bArr) {
        return (C2140r7) MessageNano.mergeFrom(new C2140r7(), bArr);
    }
}
