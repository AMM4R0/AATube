package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.c6 */
/* loaded from: classes.dex */
public final class C1764c6 extends MessageNano {

    /* renamed from: k */
    public static final int f5994k = 0;

    /* renamed from: l */
    public static final int f5995l = 1;

    /* renamed from: m */
    public static volatile C1764c6[] f5996m;

    /* renamed from: n */
    public static byte[] f5997n;

    /* renamed from: o */
    public static volatile boolean f5998o;

    /* renamed from: a */
    public C1914i6 f5999a;

    /* renamed from: b */
    public C1665Y5 f6000b;

    /* renamed from: c */
    public String f6001c;

    /* renamed from: d */
    public int f6002d;

    /* renamed from: e */
    public C1864g6[] f6003e;

    /* renamed from: f */
    public int f6004f;

    /* renamed from: g */
    public C1739b6 f6005g;

    /* renamed from: h */
    public byte[] f6006h;

    /* renamed from: i */
    public byte[] f6007i;

    /* renamed from: j */
    public C1714a6[] f6008j;

    public C1764c6() {
        if (!f5998o) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (!f5998o) {
                        f5997n = InternalNano.bytesDefaultValue("JVM");
                        f5998o = true;
                    }
                } finally {
                }
            }
        }
        m3693a();
    }

    /* renamed from: b */
    public static C1764c6[] m3692b() {
        if (f5996m == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5996m == null) {
                        f5996m = new C1764c6[0];
                    }
                } finally {
                }
            }
        }
        return f5996m;
    }

    /* renamed from: a */
    public final C1764c6 m3693a() {
        this.f5999a = null;
        this.f6000b = null;
        this.f6001c = "";
        this.f6002d = -1;
        this.f6003e = C1864g6.m3854b();
        this.f6004f = 0;
        this.f6005g = null;
        this.f6006h = (byte[]) f5997n.clone();
        this.f6007i = WireFormatNano.EMPTY_BYTES;
        this.f6008j = C1714a6.m3600b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C1914i6 c1914i6 = this.f5999a;
        if (c1914i6 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c1914i6);
        }
        C1665Y5 c1665y5 = this.f6000b;
        if (c1665y5 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c1665y5);
        }
        if (!this.f6001c.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f6001c);
        }
        int r12 = this.f6002d;
        if (r12 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, r12);
        }
        C1864g6[] c1864g6Arr = this.f6003e;
        int r2 = 0;
        if (c1864g6Arr != null && c1864g6Arr.length > 0) {
            int r13 = 0;
            while (true) {
                C1864g6[] c1864g6Arr2 = this.f6003e;
                if (r13 >= c1864g6Arr2.length) {
                    break;
                }
                C1864g6 c1864g6 = c1864g6Arr2[r13];
                if (c1864g6 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(5, c1864g6) + computeSerializedSize;
                }
                r13++;
            }
        }
        int r14 = this.f6004f;
        if (r14 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(6, r14);
        }
        C1739b6 c1739b6 = this.f6005g;
        if (c1739b6 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(7, c1739b6);
        }
        if (!Arrays.equals(this.f6006h, f5997n)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(8, this.f6006h);
        }
        if (!Arrays.equals(this.f6007i, WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(9, this.f6007i);
        }
        C1714a6[] c1714a6Arr = this.f6008j;
        if (c1714a6Arr != null && c1714a6Arr.length > 0) {
            while (true) {
                C1714a6[] c1714a6Arr2 = this.f6008j;
                if (r2 >= c1714a6Arr2.length) {
                    break;
                }
                C1714a6 c1714a6 = c1714a6Arr2[r2];
                if (c1714a6 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(10, c1714a6) + computeSerializedSize;
                }
                r2++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        C1914i6 c1914i6 = this.f5999a;
        if (c1914i6 != null) {
            codedOutputByteBufferNano.writeMessage(1, c1914i6);
        }
        C1665Y5 c1665y5 = this.f6000b;
        if (c1665y5 != null) {
            codedOutputByteBufferNano.writeMessage(2, c1665y5);
        }
        if (!this.f6001c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f6001c);
        }
        int r02 = this.f6002d;
        if (r02 != -1) {
            codedOutputByteBufferNano.writeInt32(4, r02);
        }
        C1864g6[] c1864g6Arr = this.f6003e;
        int r12 = 0;
        if (c1864g6Arr != null && c1864g6Arr.length > 0) {
            int r03 = 0;
            while (true) {
                C1864g6[] c1864g6Arr2 = this.f6003e;
                if (r03 >= c1864g6Arr2.length) {
                    break;
                }
                C1864g6 c1864g6 = c1864g6Arr2[r03];
                if (c1864g6 != null) {
                    codedOutputByteBufferNano.writeMessage(5, c1864g6);
                }
                r03++;
            }
        }
        int r04 = this.f6004f;
        if (r04 != 0) {
            codedOutputByteBufferNano.writeInt32(6, r04);
        }
        C1739b6 c1739b6 = this.f6005g;
        if (c1739b6 != null) {
            codedOutputByteBufferNano.writeMessage(7, c1739b6);
        }
        if (!Arrays.equals(this.f6006h, f5997n)) {
            codedOutputByteBufferNano.writeBytes(8, this.f6006h);
        }
        if (!Arrays.equals(this.f6007i, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(9, this.f6007i);
        }
        C1714a6[] c1714a6Arr = this.f6008j;
        if (c1714a6Arr != null && c1714a6Arr.length > 0) {
            while (true) {
                C1714a6[] c1714a6Arr2 = this.f6008j;
                if (r12 >= c1714a6Arr2.length) {
                    break;
                }
                C1714a6 c1714a6 = c1714a6Arr2[r12];
                if (c1714a6 != null) {
                    codedOutputByteBufferNano.writeMessage(10, c1714a6);
                }
                r12++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    /* renamed from: b */
    public static C1764c6 m3691b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1764c6().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1764c6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    return this;
                case 10:
                    if (this.f5999a == null) {
                        this.f5999a = new C1914i6();
                    }
                    codedInputByteBufferNano.readMessage(this.f5999a);
                    break;
                case 18:
                    if (this.f6000b == null) {
                        this.f6000b = new C1665Y5();
                    }
                    codedInputByteBufferNano.readMessage(this.f6000b);
                    break;
                case C1842f9.f6212I /* 26 */:
                    this.f6001c = codedInputByteBufferNano.readString();
                    break;
                case 32:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 != -1 && readInt32 != 0 && readInt32 != 1) {
                        break;
                    } else {
                        this.f6002d = readInt32;
                        break;
                    }
                case C1842f9.f6218O /* 42 */:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                    C1864g6[] c1864g6Arr = this.f6003e;
                    int length = c1864g6Arr == null ? 0 : c1864g6Arr.length;
                    int r02 = repeatedFieldArrayLength + length;
                    C1864g6[] c1864g6Arr2 = new C1864g6[r02];
                    if (length != 0) {
                        System.arraycopy(c1864g6Arr, 0, c1864g6Arr2, 0, length);
                    }
                    while (length < r02 - 1) {
                        C1864g6 c1864g6 = new C1864g6();
                        c1864g6Arr2[length] = c1864g6;
                        codedInputByteBufferNano.readMessage(c1864g6);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    C1864g6 c1864g62 = new C1864g6();
                    c1864g6Arr2[length] = c1864g62;
                    codedInputByteBufferNano.readMessage(c1864g62);
                    this.f6003e = c1864g6Arr2;
                    break;
                case 48:
                    int readInt322 = codedInputByteBufferNano.readInt32();
                    if (readInt322 != 0 && readInt322 != 1) {
                        break;
                    } else {
                        this.f6004f = readInt322;
                        break;
                    }
                case 58:
                    if (this.f6005g == null) {
                        this.f6005g = new C1739b6();
                    }
                    codedInputByteBufferNano.readMessage(this.f6005g);
                    break;
                case 66:
                    this.f6006h = codedInputByteBufferNano.readBytes();
                    break;
                case 74:
                    this.f6007i = codedInputByteBufferNano.readBytes();
                    break;
                case 82:
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 82);
                    C1714a6[] c1714a6Arr = this.f6008j;
                    int length2 = c1714a6Arr == null ? 0 : c1714a6Arr.length;
                    int r03 = repeatedFieldArrayLength2 + length2;
                    C1714a6[] c1714a6Arr2 = new C1714a6[r03];
                    if (length2 != 0) {
                        System.arraycopy(c1714a6Arr, 0, c1714a6Arr2, 0, length2);
                    }
                    while (length2 < r03 - 1) {
                        C1714a6 c1714a6 = new C1714a6();
                        c1714a6Arr2[length2] = c1714a6;
                        codedInputByteBufferNano.readMessage(c1714a6);
                        codedInputByteBufferNano.readTag();
                        length2++;
                    }
                    C1714a6 c1714a62 = new C1714a6();
                    c1714a6Arr2[length2] = c1714a62;
                    codedInputByteBufferNano.readMessage(c1714a62);
                    this.f6008j = c1714a6Arr2;
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
    public static C1764c6 m3690a(byte[] bArr) {
        return (C1764c6) MessageNano.mergeFrom(new C1764c6(), bArr);
    }
}
