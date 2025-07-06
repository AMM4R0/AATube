package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.e6 */
/* loaded from: classes.dex */
public final class C1814e6 extends MessageNano {

    /* renamed from: l */
    public static final int f6122l = 0;

    /* renamed from: m */
    public static final int f6123m = 1;

    /* renamed from: n */
    public static volatile C1814e6[] f6124n;

    /* renamed from: o */
    public static byte[] f6125o;

    /* renamed from: p */
    public static volatile boolean f6126p;

    /* renamed from: a */
    public C1914i6 f6127a;

    /* renamed from: b */
    public C1665Y5 f6128b;

    /* renamed from: c */
    public String f6129c;

    /* renamed from: d */
    public int f6130d;

    /* renamed from: e */
    public C1864g6[] f6131e;

    /* renamed from: f */
    public String f6132f;

    /* renamed from: g */
    public int f6133g;

    /* renamed from: h */
    public C1789d6 f6134h;

    /* renamed from: i */
    public byte[] f6135i;

    /* renamed from: j */
    public byte[] f6136j;

    /* renamed from: k */
    public C1714a6[] f6137k;

    public C1814e6() {
        if (!f6126p) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (!f6126p) {
                        f6125o = InternalNano.bytesDefaultValue("JVM");
                        f6126p = true;
                    }
                } finally {
                }
            }
        }
        m3773a();
    }

    /* renamed from: b */
    public static C1814e6[] m3772b() {
        if (f6124n == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6124n == null) {
                        f6124n = new C1814e6[0];
                    }
                } finally {
                }
            }
        }
        return f6124n;
    }

    /* renamed from: a */
    public final C1814e6 m3773a() {
        this.f6127a = null;
        this.f6128b = null;
        this.f6129c = "";
        this.f6130d = -1;
        this.f6131e = C1864g6.m3854b();
        this.f6132f = "";
        this.f6133g = 0;
        this.f6134h = null;
        this.f6135i = (byte[]) f6125o.clone();
        this.f6136j = WireFormatNano.EMPTY_BYTES;
        this.f6137k = C1714a6.m3600b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C1914i6 c1914i6 = this.f6127a;
        if (c1914i6 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c1914i6);
        }
        C1665Y5 c1665y5 = this.f6128b;
        if (c1665y5 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c1665y5);
        }
        if (!this.f6129c.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f6129c);
        }
        int r12 = this.f6130d;
        if (r12 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, r12);
        }
        C1864g6[] c1864g6Arr = this.f6131e;
        int r3 = 0;
        if (c1864g6Arr != null && c1864g6Arr.length > 0) {
            int r13 = 0;
            while (true) {
                C1864g6[] c1864g6Arr2 = this.f6131e;
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
        if (!this.f6132f.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(6, this.f6132f);
        }
        int r14 = this.f6133g;
        if (r14 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(7, r14);
        }
        C1789d6 c1789d6 = this.f6134h;
        if (c1789d6 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(8, c1789d6);
        }
        if (!Arrays.equals(this.f6135i, f6125o)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(9, this.f6135i);
        }
        if (!Arrays.equals(this.f6136j, WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(10, this.f6136j);
        }
        C1714a6[] c1714a6Arr = this.f6137k;
        if (c1714a6Arr != null && c1714a6Arr.length > 0) {
            while (true) {
                C1714a6[] c1714a6Arr2 = this.f6137k;
                if (r3 >= c1714a6Arr2.length) {
                    break;
                }
                C1714a6 c1714a6 = c1714a6Arr2[r3];
                if (c1714a6 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(11, c1714a6) + computeSerializedSize;
                }
                r3++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        C1914i6 c1914i6 = this.f6127a;
        if (c1914i6 != null) {
            codedOutputByteBufferNano.writeMessage(1, c1914i6);
        }
        C1665Y5 c1665y5 = this.f6128b;
        if (c1665y5 != null) {
            codedOutputByteBufferNano.writeMessage(2, c1665y5);
        }
        if (!this.f6129c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f6129c);
        }
        int r02 = this.f6130d;
        if (r02 != -1) {
            codedOutputByteBufferNano.writeInt32(4, r02);
        }
        C1864g6[] c1864g6Arr = this.f6131e;
        int r2 = 0;
        if (c1864g6Arr != null && c1864g6Arr.length > 0) {
            int r03 = 0;
            while (true) {
                C1864g6[] c1864g6Arr2 = this.f6131e;
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
        if (!this.f6132f.equals("")) {
            codedOutputByteBufferNano.writeString(6, this.f6132f);
        }
        int r04 = this.f6133g;
        if (r04 != 0) {
            codedOutputByteBufferNano.writeInt32(7, r04);
        }
        C1789d6 c1789d6 = this.f6134h;
        if (c1789d6 != null) {
            codedOutputByteBufferNano.writeMessage(8, c1789d6);
        }
        if (!Arrays.equals(this.f6135i, f6125o)) {
            codedOutputByteBufferNano.writeBytes(9, this.f6135i);
        }
        if (!Arrays.equals(this.f6136j, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(10, this.f6136j);
        }
        C1714a6[] c1714a6Arr = this.f6137k;
        if (c1714a6Arr != null && c1714a6Arr.length > 0) {
            while (true) {
                C1714a6[] c1714a6Arr2 = this.f6137k;
                if (r2 >= c1714a6Arr2.length) {
                    break;
                }
                C1714a6 c1714a6 = c1714a6Arr2[r2];
                if (c1714a6 != null) {
                    codedOutputByteBufferNano.writeMessage(11, c1714a6);
                }
                r2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    /* renamed from: b */
    public static C1814e6 m3771b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1814e6().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1814e6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    return this;
                case 10:
                    if (this.f6127a == null) {
                        this.f6127a = new C1914i6();
                    }
                    codedInputByteBufferNano.readMessage(this.f6127a);
                    break;
                case 18:
                    if (this.f6128b == null) {
                        this.f6128b = new C1665Y5();
                    }
                    codedInputByteBufferNano.readMessage(this.f6128b);
                    break;
                case C1842f9.f6212I /* 26 */:
                    this.f6129c = codedInputByteBufferNano.readString();
                    break;
                case 32:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 != -1 && readInt32 != 0 && readInt32 != 1) {
                        break;
                    } else {
                        this.f6130d = readInt32;
                        break;
                    }
                case C1842f9.f6218O /* 42 */:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                    C1864g6[] c1864g6Arr = this.f6131e;
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
                    this.f6131e = c1864g6Arr2;
                    break;
                case 50:
                    this.f6132f = codedInputByteBufferNano.readString();
                    break;
                case 56:
                    int readInt322 = codedInputByteBufferNano.readInt32();
                    if (readInt322 != 0 && readInt322 != 1) {
                        break;
                    } else {
                        this.f6133g = readInt322;
                        break;
                    }
                case 66:
                    if (this.f6134h == null) {
                        this.f6134h = new C1789d6();
                    }
                    codedInputByteBufferNano.readMessage(this.f6134h);
                    break;
                case 74:
                    this.f6135i = codedInputByteBufferNano.readBytes();
                    break;
                case 82:
                    this.f6136j = codedInputByteBufferNano.readBytes();
                    break;
                case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 90);
                    C1714a6[] c1714a6Arr = this.f6137k;
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
                    this.f6137k = c1714a6Arr2;
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
    public static C1814e6 m3770a(byte[] bArr) {
        return (C1814e6) MessageNano.mergeFrom(new C1814e6(), bArr);
    }
}
