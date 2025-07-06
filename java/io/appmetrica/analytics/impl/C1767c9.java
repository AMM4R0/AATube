package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.c9 */
/* loaded from: classes.dex */
public final class C1767c9 extends MessageNano {

    /* renamed from: n */
    public static volatile C1767c9[] f6029n;

    /* renamed from: a */
    public String f6030a;

    /* renamed from: b */
    public String f6031b;

    /* renamed from: c */
    public String f6032c;

    /* renamed from: d */
    public int f6033d;

    /* renamed from: e */
    public String f6034e;

    /* renamed from: f */
    public String f6035f;

    /* renamed from: g */
    public boolean f6036g;

    /* renamed from: h */
    public int f6037h;

    /* renamed from: i */
    public String f6038i;

    /* renamed from: j */
    public String f6039j;

    /* renamed from: k */
    public int f6040k;

    /* renamed from: l */
    public C1742b9[] f6041l;

    /* renamed from: m */
    public String f6042m;

    public C1767c9() {
        m3710a();
    }

    /* renamed from: b */
    public static C1767c9[] m3709b() {
        if (f6029n == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6029n == null) {
                        f6029n = new C1767c9[0];
                    }
                } finally {
                }
            }
        }
        return f6029n;
    }

    /* renamed from: a */
    public final C1767c9 m3710a() {
        this.f6030a = "";
        this.f6031b = "";
        this.f6032c = "";
        this.f6033d = 0;
        this.f6034e = "";
        this.f6035f = "";
        this.f6036g = false;
        this.f6037h = 0;
        this.f6038i = "";
        this.f6039j = "";
        this.f6040k = 0;
        this.f6041l = C1742b9.m3646b();
        this.f6042m = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f6030a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f6030a);
        }
        if (!this.f6031b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f6031b);
        }
        if (!this.f6032c.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(4, this.f6032c);
        }
        int r12 = this.f6033d;
        if (r12 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(5, r12);
        }
        if (!this.f6034e.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(10, this.f6034e);
        }
        if (!this.f6035f.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(15, this.f6035f);
        }
        boolean z2 = this.f6036g;
        if (z2) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(17, z2);
        }
        int r13 = this.f6037h;
        if (r13 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(18, r13);
        }
        if (!this.f6038i.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(19, this.f6038i);
        }
        if (!this.f6039j.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(21, this.f6039j);
        }
        int r14 = this.f6040k;
        if (r14 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(22, r14);
        }
        C1742b9[] c1742b9Arr = this.f6041l;
        if (c1742b9Arr != null && c1742b9Arr.length > 0) {
            int r15 = 0;
            while (true) {
                C1742b9[] c1742b9Arr2 = this.f6041l;
                if (r15 >= c1742b9Arr2.length) {
                    break;
                }
                C1742b9 c1742b9 = c1742b9Arr2[r15];
                if (c1742b9 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(23, c1742b9) + computeSerializedSize;
                }
                r15++;
            }
        }
        return !this.f6042m.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(24, this.f6042m) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f6030a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f6030a);
        }
        if (!this.f6031b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f6031b);
        }
        if (!this.f6032c.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f6032c);
        }
        int r02 = this.f6033d;
        if (r02 != 0) {
            codedOutputByteBufferNano.writeUInt32(5, r02);
        }
        if (!this.f6034e.equals("")) {
            codedOutputByteBufferNano.writeString(10, this.f6034e);
        }
        if (!this.f6035f.equals("")) {
            codedOutputByteBufferNano.writeString(15, this.f6035f);
        }
        boolean z2 = this.f6036g;
        if (z2) {
            codedOutputByteBufferNano.writeBool(17, z2);
        }
        int r03 = this.f6037h;
        if (r03 != 0) {
            codedOutputByteBufferNano.writeUInt32(18, r03);
        }
        if (!this.f6038i.equals("")) {
            codedOutputByteBufferNano.writeString(19, this.f6038i);
        }
        if (!this.f6039j.equals("")) {
            codedOutputByteBufferNano.writeString(21, this.f6039j);
        }
        int r04 = this.f6040k;
        if (r04 != 0) {
            codedOutputByteBufferNano.writeUInt32(22, r04);
        }
        C1742b9[] c1742b9Arr = this.f6041l;
        if (c1742b9Arr != null && c1742b9Arr.length > 0) {
            int r05 = 0;
            while (true) {
                C1742b9[] c1742b9Arr2 = this.f6041l;
                if (r05 >= c1742b9Arr2.length) {
                    break;
                }
                C1742b9 c1742b9 = c1742b9Arr2[r05];
                if (c1742b9 != null) {
                    codedOutputByteBufferNano.writeMessage(23, c1742b9);
                }
                r05++;
            }
        }
        if (!this.f6042m.equals("")) {
            codedOutputByteBufferNano.writeString(24, this.f6042m);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    /* renamed from: b */
    public static C1767c9 m3708b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1767c9().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1767c9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    return this;
                case 10:
                    this.f6030a = codedInputByteBufferNano.readString();
                    break;
                case 18:
                    this.f6031b = codedInputByteBufferNano.readString();
                    break;
                case 34:
                    this.f6032c = codedInputByteBufferNano.readString();
                    break;
                case C1842f9.f6217N /* 40 */:
                    this.f6033d = codedInputByteBufferNano.readUInt32();
                    break;
                case 82:
                    this.f6034e = codedInputByteBufferNano.readString();
                    break;
                case 122:
                    this.f6035f = codedInputByteBufferNano.readString();
                    break;
                case 136:
                    this.f6036g = codedInputByteBufferNano.readBool();
                    break;
                case 144:
                    this.f6037h = codedInputByteBufferNano.readUInt32();
                    break;
                case 154:
                    this.f6038i = codedInputByteBufferNano.readString();
                    break;
                case 170:
                    this.f6039j = codedInputByteBufferNano.readString();
                    break;
                case 176:
                    this.f6040k = codedInputByteBufferNano.readUInt32();
                    break;
                case 186:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 186);
                    C1742b9[] c1742b9Arr = this.f6041l;
                    int length = c1742b9Arr == null ? 0 : c1742b9Arr.length;
                    int r02 = repeatedFieldArrayLength + length;
                    C1742b9[] c1742b9Arr2 = new C1742b9[r02];
                    if (length != 0) {
                        System.arraycopy(c1742b9Arr, 0, c1742b9Arr2, 0, length);
                    }
                    while (length < r02 - 1) {
                        C1742b9 c1742b9 = new C1742b9();
                        c1742b9Arr2[length] = c1742b9;
                        codedInputByteBufferNano.readMessage(c1742b9);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    C1742b9 c1742b92 = new C1742b9();
                    c1742b9Arr2[length] = c1742b92;
                    codedInputByteBufferNano.readMessage(c1742b92);
                    this.f6041l = c1742b9Arr2;
                    break;
                case 194:
                    this.f6042m = codedInputByteBufferNano.readString();
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
    public static C1767c9 m3707a(byte[] bArr) {
        return (C1767c9) MessageNano.mergeFrom(new C1767c9(), bArr);
    }
}
