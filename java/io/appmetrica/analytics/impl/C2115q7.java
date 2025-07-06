package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.q7 */
/* loaded from: classes.dex */
public final class C2115q7 extends MessageNano {

    /* renamed from: s */
    public static volatile C2115q7[] f6968s;

    /* renamed from: a */
    public int f6969a;

    /* renamed from: b */
    public String f6970b;

    /* renamed from: c */
    public String f6971c;

    /* renamed from: d */
    public long f6972d;

    /* renamed from: e */
    public C2140r7 f6973e;

    /* renamed from: f */
    public String f6974f;

    /* renamed from: g */
    public String f6975g;

    /* renamed from: h */
    public long f6976h;

    /* renamed from: i */
    public int f6977i;

    /* renamed from: j */
    public int f6978j;

    /* renamed from: k */
    public String f6979k;

    /* renamed from: l */
    public int f6980l;

    /* renamed from: m */
    public String f6981m;

    /* renamed from: n */
    public int f6982n;

    /* renamed from: o */
    public int f6983o;

    /* renamed from: p */
    public int f6984p;

    /* renamed from: q */
    public int f6985q;

    /* renamed from: r */
    public byte[] f6986r;

    public C2115q7() {
        m4345a();
    }

    /* renamed from: b */
    public static C2115q7[] m4344b() {
        if (f6968s == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6968s == null) {
                        f6968s = new C2115q7[0];
                    }
                } finally {
                }
            }
        }
        return f6968s;
    }

    /* renamed from: a */
    public final C2115q7 m4345a() {
        this.f6969a = -1;
        this.f6970b = "";
        this.f6971c = "";
        this.f6972d = -1L;
        this.f6973e = null;
        this.f6974f = "";
        this.f6975g = "";
        this.f6976h = -1L;
        this.f6977i = -1;
        this.f6978j = -1;
        this.f6979k = "";
        this.f6980l = -1;
        this.f6981m = "";
        this.f6982n = -1;
        this.f6983o = -1;
        this.f6984p = -1;
        this.f6985q = -1;
        this.f6986r = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int r12 = this.f6969a;
        if (r12 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, r12);
        }
        if (!this.f6970b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f6970b);
        }
        if (!this.f6971c.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f6971c);
        }
        long j2 = this.f6972d;
        if (j2 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(4, j2);
        }
        C2140r7 c2140r7 = this.f6973e;
        if (c2140r7 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, c2140r7);
        }
        if (!this.f6974f.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(6, this.f6974f);
        }
        if (!this.f6975g.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(7, this.f6975g);
        }
        long j3 = this.f6976h;
        if (j3 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(8, j3);
        }
        int r13 = this.f6977i;
        if (r13 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(9, r13);
        }
        int r14 = this.f6978j;
        if (r14 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(10, r14);
        }
        if (!this.f6979k.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(11, this.f6979k);
        }
        int r15 = this.f6980l;
        if (r15 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(12, r15);
        }
        if (!this.f6981m.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(13, this.f6981m);
        }
        int r16 = this.f6982n;
        if (r16 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(14, r16);
        }
        int r17 = this.f6983o;
        if (r17 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(15, r17);
        }
        int r18 = this.f6984p;
        if (r18 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(16, r18);
        }
        int r19 = this.f6985q;
        if (r19 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(17, r19);
        }
        return !Arrays.equals(this.f6986r, WireFormatNano.EMPTY_BYTES) ? computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(18, this.f6986r) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int r02 = this.f6969a;
        if (r02 != -1) {
            codedOutputByteBufferNano.writeInt32(1, r02);
        }
        if (!this.f6970b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f6970b);
        }
        if (!this.f6971c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f6971c);
        }
        long j2 = this.f6972d;
        if (j2 != -1) {
            codedOutputByteBufferNano.writeInt64(4, j2);
        }
        C2140r7 c2140r7 = this.f6973e;
        if (c2140r7 != null) {
            codedOutputByteBufferNano.writeMessage(5, c2140r7);
        }
        if (!this.f6974f.equals("")) {
            codedOutputByteBufferNano.writeString(6, this.f6974f);
        }
        if (!this.f6975g.equals("")) {
            codedOutputByteBufferNano.writeString(7, this.f6975g);
        }
        long j3 = this.f6976h;
        if (j3 != -1) {
            codedOutputByteBufferNano.writeInt64(8, j3);
        }
        int r03 = this.f6977i;
        if (r03 != -1) {
            codedOutputByteBufferNano.writeInt32(9, r03);
        }
        int r04 = this.f6978j;
        if (r04 != -1) {
            codedOutputByteBufferNano.writeInt32(10, r04);
        }
        if (!this.f6979k.equals("")) {
            codedOutputByteBufferNano.writeString(11, this.f6979k);
        }
        int r05 = this.f6980l;
        if (r05 != -1) {
            codedOutputByteBufferNano.writeInt32(12, r05);
        }
        if (!this.f6981m.equals("")) {
            codedOutputByteBufferNano.writeString(13, this.f6981m);
        }
        int r06 = this.f6982n;
        if (r06 != -1) {
            codedOutputByteBufferNano.writeInt32(14, r06);
        }
        int r07 = this.f6983o;
        if (r07 != -1) {
            codedOutputByteBufferNano.writeInt32(15, r07);
        }
        int r08 = this.f6984p;
        if (r08 != -1) {
            codedOutputByteBufferNano.writeInt32(16, r08);
        }
        int r09 = this.f6985q;
        if (r09 != -1) {
            codedOutputByteBufferNano.writeInt32(17, r09);
        }
        if (!Arrays.equals(this.f6986r, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(18, this.f6986r);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    /* renamed from: b */
    public static C2115q7 m4343b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C2115q7().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2115q7 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    return this;
                case 8:
                    this.f6969a = codedInputByteBufferNano.readInt32();
                    break;
                case 18:
                    this.f6970b = codedInputByteBufferNano.readString();
                    break;
                case C1842f9.f6212I /* 26 */:
                    this.f6971c = codedInputByteBufferNano.readString();
                    break;
                case 32:
                    this.f6972d = codedInputByteBufferNano.readInt64();
                    break;
                case C1842f9.f6218O /* 42 */:
                    if (this.f6973e == null) {
                        this.f6973e = new C2140r7();
                    }
                    codedInputByteBufferNano.readMessage(this.f6973e);
                    break;
                case 50:
                    this.f6974f = codedInputByteBufferNano.readString();
                    break;
                case 58:
                    this.f6975g = codedInputByteBufferNano.readString();
                    break;
                case 64:
                    this.f6976h = codedInputByteBufferNano.readInt64();
                    break;
                case 72:
                    this.f6977i = codedInputByteBufferNano.readInt32();
                    break;
                case 80:
                    this.f6978j = codedInputByteBufferNano.readInt32();
                    break;
                case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                    this.f6979k = codedInputByteBufferNano.readString();
                    break;
                case 96:
                    this.f6980l = codedInputByteBufferNano.readInt32();
                    break;
                case 106:
                    this.f6981m = codedInputByteBufferNano.readString();
                    break;
                case 112:
                    this.f6982n = codedInputByteBufferNano.readInt32();
                    break;
                case 120:
                    this.f6983o = codedInputByteBufferNano.readInt32();
                    break;
                case 128:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 != -1 && readInt32 != 0 && readInt32 != 1) {
                        break;
                    } else {
                        this.f6984p = readInt32;
                        break;
                    }
                case 136:
                    this.f6985q = codedInputByteBufferNano.readInt32();
                    break;
                case 146:
                    this.f6986r = codedInputByteBufferNano.readBytes();
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
    public static C2115q7 m4342a(byte[] bArr) {
        return (C2115q7) MessageNano.mergeFrom(new C2115q7(), bArr);
    }
}
