package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.BuildConfig;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.f9 */
/* loaded from: classes.dex */
public final class C1842f9 extends MessageNano {

    /* renamed from: A */
    public static final int f6204A = 13;

    /* renamed from: B */
    public static final int f6205B = 16;

    /* renamed from: C */
    public static final int f6206C = 17;

    /* renamed from: D */
    public static final int f6207D = 18;

    /* renamed from: E */
    public static final int f6208E = 19;

    /* renamed from: F */
    public static final int f6209F = 20;

    /* renamed from: G */
    public static final int f6210G = 21;

    /* renamed from: H */
    public static final int f6211H = 25;

    /* renamed from: I */
    public static final int f6212I = 26;

    /* renamed from: J */
    public static final int f6213J = 27;

    /* renamed from: K */
    public static final int f6214K = 29;

    /* renamed from: L */
    public static final int f6215L = 35;

    /* renamed from: M */
    public static final int f6216M = 38;

    /* renamed from: N */
    public static final int f6217N = 40;

    /* renamed from: O */
    public static final int f6218O = 42;

    /* renamed from: P */
    public static final int f6219P = 0;

    /* renamed from: Q */
    public static final int f6220Q = 1;

    /* renamed from: R */
    public static final int f6221R = 2;

    /* renamed from: S */
    public static final int f6222S = 0;

    /* renamed from: T */
    public static final int f6223T = 1;

    /* renamed from: U */
    public static volatile C1842f9[] f6224U = null;

    /* renamed from: t */
    public static final int f6225t = 1;

    /* renamed from: u */
    public static final int f6226u = 2;

    /* renamed from: v */
    public static final int f6227v = 3;

    /* renamed from: w */
    public static final int f6228w = 4;

    /* renamed from: x */
    public static final int f6229x = 5;

    /* renamed from: y */
    public static final int f6230y = 6;

    /* renamed from: z */
    public static final int f6231z = 7;

    /* renamed from: a */
    public long f6232a;

    /* renamed from: b */
    public long f6233b;

    /* renamed from: c */
    public int f6234c;

    /* renamed from: d */
    public String f6235d;

    /* renamed from: e */
    public byte[] f6236e;

    /* renamed from: f */
    public C1717a9 f6237f;

    /* renamed from: g */
    public C1817e9 f6238g;

    /* renamed from: h */
    public String f6239h;

    /* renamed from: i */
    public int f6240i;

    /* renamed from: j */
    public int f6241j;

    /* renamed from: k */
    public int f6242k;

    /* renamed from: l */
    public byte[] f6243l;

    /* renamed from: m */
    public int f6244m;

    /* renamed from: n */
    public long f6245n;

    /* renamed from: o */
    public long f6246o;

    /* renamed from: p */
    public int f6247p;

    /* renamed from: q */
    public boolean f6248q;

    /* renamed from: r */
    public long f6249r;

    /* renamed from: s */
    public C1792d9[] f6250s;

    public C1842f9() {
        m3824a();
    }

    /* renamed from: b */
    public static C1842f9[] m3823b() {
        if (f6224U == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6224U == null) {
                        f6224U = new C1842f9[0];
                    }
                } finally {
                }
            }
        }
        return f6224U;
    }

    /* renamed from: a */
    public final C1842f9 m3824a() {
        this.f6232a = 0L;
        this.f6233b = 0L;
        this.f6234c = 0;
        this.f6235d = "";
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f6236e = bArr;
        this.f6237f = null;
        this.f6238g = null;
        this.f6239h = "";
        this.f6240i = 0;
        this.f6241j = 0;
        this.f6242k = -1;
        this.f6243l = bArr;
        this.f6244m = -1;
        this.f6245n = 0L;
        this.f6246o = 0L;
        this.f6247p = 0;
        this.f6248q = false;
        this.f6249r = 1L;
        this.f6250s = C1792d9.m3739b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeUInt32Size = CodedOutputByteBufferNano.computeUInt32Size(3, this.f6234c) + CodedOutputByteBufferNano.computeUInt64Size(2, this.f6233b) + CodedOutputByteBufferNano.computeUInt64Size(1, this.f6232a) + super.computeSerializedSize();
        if (!this.f6235d.equals("")) {
            computeUInt32Size += CodedOutputByteBufferNano.computeStringSize(4, this.f6235d);
        }
        byte[] bArr = this.f6236e;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeUInt32Size += CodedOutputByteBufferNano.computeBytesSize(5, this.f6236e);
        }
        C1717a9 c1717a9 = this.f6237f;
        if (c1717a9 != null) {
            computeUInt32Size += CodedOutputByteBufferNano.computeMessageSize(6, c1717a9);
        }
        C1817e9 c1817e9 = this.f6238g;
        if (c1817e9 != null) {
            computeUInt32Size += CodedOutputByteBufferNano.computeMessageSize(7, c1817e9);
        }
        if (!this.f6239h.equals("")) {
            computeUInt32Size += CodedOutputByteBufferNano.computeStringSize(8, this.f6239h);
        }
        int r02 = this.f6240i;
        if (r02 != 0) {
            computeUInt32Size += CodedOutputByteBufferNano.computeUInt32Size(10, r02);
        }
        int r03 = this.f6241j;
        if (r03 != 0) {
            computeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(12, r03);
        }
        int r04 = this.f6242k;
        if (r04 != -1) {
            computeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(13, r04);
        }
        if (!Arrays.equals(this.f6243l, bArr2)) {
            computeUInt32Size += CodedOutputByteBufferNano.computeBytesSize(14, this.f6243l);
        }
        int r05 = this.f6244m;
        if (r05 != -1) {
            computeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(15, r05);
        }
        long j2 = this.f6245n;
        if (j2 != 0) {
            computeUInt32Size += CodedOutputByteBufferNano.computeUInt64Size(16, j2);
        }
        long j3 = this.f6246o;
        if (j3 != 0) {
            computeUInt32Size += CodedOutputByteBufferNano.computeUInt64Size(17, j3);
        }
        int r06 = this.f6247p;
        if (r06 != 0) {
            computeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(22, r06);
        }
        boolean z2 = this.f6248q;
        if (z2) {
            computeUInt32Size += CodedOutputByteBufferNano.computeBoolSize(23, z2);
        }
        long j4 = this.f6249r;
        if (j4 != 1) {
            computeUInt32Size += CodedOutputByteBufferNano.computeUInt64Size(24, j4);
        }
        C1792d9[] c1792d9Arr = this.f6250s;
        if (c1792d9Arr != null && c1792d9Arr.length > 0) {
            int r07 = 0;
            while (true) {
                C1792d9[] c1792d9Arr2 = this.f6250s;
                if (r07 >= c1792d9Arr2.length) {
                    break;
                }
                C1792d9 c1792d9 = c1792d9Arr2[r07];
                if (c1792d9 != null) {
                    computeUInt32Size = CodedOutputByteBufferNano.computeMessageSize(25, c1792d9) + computeUInt32Size;
                }
                r07++;
            }
        }
        return computeUInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeUInt64(1, this.f6232a);
        codedOutputByteBufferNano.writeUInt64(2, this.f6233b);
        codedOutputByteBufferNano.writeUInt32(3, this.f6234c);
        if (!this.f6235d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f6235d);
        }
        byte[] bArr = this.f6236e;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(5, this.f6236e);
        }
        C1717a9 c1717a9 = this.f6237f;
        if (c1717a9 != null) {
            codedOutputByteBufferNano.writeMessage(6, c1717a9);
        }
        C1817e9 c1817e9 = this.f6238g;
        if (c1817e9 != null) {
            codedOutputByteBufferNano.writeMessage(7, c1817e9);
        }
        if (!this.f6239h.equals("")) {
            codedOutputByteBufferNano.writeString(8, this.f6239h);
        }
        int r02 = this.f6240i;
        if (r02 != 0) {
            codedOutputByteBufferNano.writeUInt32(10, r02);
        }
        int r03 = this.f6241j;
        if (r03 != 0) {
            codedOutputByteBufferNano.writeInt32(12, r03);
        }
        int r04 = this.f6242k;
        if (r04 != -1) {
            codedOutputByteBufferNano.writeInt32(13, r04);
        }
        if (!Arrays.equals(this.f6243l, bArr2)) {
            codedOutputByteBufferNano.writeBytes(14, this.f6243l);
        }
        int r05 = this.f6244m;
        if (r05 != -1) {
            codedOutputByteBufferNano.writeInt32(15, r05);
        }
        long j2 = this.f6245n;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeUInt64(16, j2);
        }
        long j3 = this.f6246o;
        if (j3 != 0) {
            codedOutputByteBufferNano.writeUInt64(17, j3);
        }
        int r06 = this.f6247p;
        if (r06 != 0) {
            codedOutputByteBufferNano.writeInt32(22, r06);
        }
        boolean z2 = this.f6248q;
        if (z2) {
            codedOutputByteBufferNano.writeBool(23, z2);
        }
        long j4 = this.f6249r;
        if (j4 != 1) {
            codedOutputByteBufferNano.writeUInt64(24, j4);
        }
        C1792d9[] c1792d9Arr = this.f6250s;
        if (c1792d9Arr != null && c1792d9Arr.length > 0) {
            int r07 = 0;
            while (true) {
                C1792d9[] c1792d9Arr2 = this.f6250s;
                if (r07 >= c1792d9Arr2.length) {
                    break;
                }
                C1792d9 c1792d9 = c1792d9Arr2[r07];
                if (c1792d9 != null) {
                    codedOutputByteBufferNano.writeMessage(25, c1792d9);
                }
                r07++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    /* renamed from: b */
    public static C1842f9 m3822b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1842f9().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1842f9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    return this;
                case 8:
                    this.f6232a = codedInputByteBufferNano.readUInt64();
                    break;
                case 16:
                    this.f6233b = codedInputByteBufferNano.readUInt64();
                    break;
                case 24:
                    this.f6234c = codedInputByteBufferNano.readUInt32();
                    break;
                case 34:
                    this.f6235d = codedInputByteBufferNano.readString();
                    break;
                case f6218O /* 42 */:
                    this.f6236e = codedInputByteBufferNano.readBytes();
                    break;
                case 50:
                    if (this.f6237f == null) {
                        this.f6237f = new C1717a9();
                    }
                    codedInputByteBufferNano.readMessage(this.f6237f);
                    break;
                case 58:
                    if (this.f6238g == null) {
                        this.f6238g = new C1817e9();
                    }
                    codedInputByteBufferNano.readMessage(this.f6238g);
                    break;
                case 66:
                    this.f6239h = codedInputByteBufferNano.readString();
                    break;
                case 80:
                    this.f6240i = codedInputByteBufferNano.readUInt32();
                    break;
                case 96:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 != 0 && readInt32 != 1 && readInt32 != 2) {
                        break;
                    } else {
                        this.f6241j = readInt32;
                        break;
                    }
                case 104:
                    int readInt322 = codedInputByteBufferNano.readInt32();
                    if (readInt322 != -1 && readInt322 != 0 && readInt322 != 1) {
                        break;
                    } else {
                        this.f6242k = readInt322;
                        break;
                    }
                case BuildConfig.API_LEVEL /* 114 */:
                    this.f6243l = codedInputByteBufferNano.readBytes();
                    break;
                case 120:
                    int readInt323 = codedInputByteBufferNano.readInt32();
                    if (readInt323 != -1 && readInt323 != 0 && readInt323 != 1) {
                        break;
                    } else {
                        this.f6244m = readInt323;
                        break;
                    }
                case 128:
                    this.f6245n = codedInputByteBufferNano.readUInt64();
                    break;
                case 136:
                    this.f6246o = codedInputByteBufferNano.readUInt64();
                    break;
                case 176:
                    int readInt324 = codedInputByteBufferNano.readInt32();
                    if (readInt324 != 0 && readInt324 != 1) {
                        break;
                    } else {
                        this.f6247p = readInt324;
                        break;
                    }
                case 184:
                    this.f6248q = codedInputByteBufferNano.readBool();
                    break;
                case 192:
                    this.f6249r = codedInputByteBufferNano.readUInt64();
                    break;
                case 202:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 202);
                    C1792d9[] c1792d9Arr = this.f6250s;
                    int length = c1792d9Arr == null ? 0 : c1792d9Arr.length;
                    int r02 = repeatedFieldArrayLength + length;
                    C1792d9[] c1792d9Arr2 = new C1792d9[r02];
                    if (length != 0) {
                        System.arraycopy(c1792d9Arr, 0, c1792d9Arr2, 0, length);
                    }
                    while (length < r02 - 1) {
                        C1792d9 c1792d9 = new C1792d9();
                        c1792d9Arr2[length] = c1792d9;
                        codedInputByteBufferNano.readMessage(c1792d9);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    C1792d9 c1792d92 = new C1792d9();
                    c1792d9Arr2[length] = c1792d92;
                    codedInputByteBufferNano.readMessage(c1792d92);
                    this.f6250s = c1792d9Arr2;
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
    public static C1842f9 m3821a(byte[] bArr) {
        return (C1842f9) MessageNano.mergeFrom(new C1842f9(), bArr);
    }
}
