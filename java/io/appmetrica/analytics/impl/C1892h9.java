package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.h9 */
/* loaded from: classes.dex */
public final class C1892h9 extends MessageNano {

    /* renamed from: d */
    public static final int f6386d = 0;

    /* renamed from: e */
    public static final int f6387e = 1;

    /* renamed from: f */
    public static final int f6388f = 2;

    /* renamed from: g */
    public static final int f6389g = 3;

    /* renamed from: h */
    public static final int f6390h = 4;

    /* renamed from: i */
    public static final int f6391i = 5;

    /* renamed from: j */
    public static final int f6392j = 6;

    /* renamed from: k */
    public static final int f6393k = 7;

    /* renamed from: l */
    public static final int f6394l = 8;

    /* renamed from: m */
    public static final int f6395m = 9;

    /* renamed from: n */
    public static final int f6396n = 10;

    /* renamed from: o */
    public static final int f6397o = 11;

    /* renamed from: p */
    public static final int f6398p = 12;

    /* renamed from: q */
    public static volatile C1892h9[] f6399q;

    /* renamed from: a */
    public long f6400a;

    /* renamed from: b */
    public C1867g9 f6401b;

    /* renamed from: c */
    public C1842f9[] f6402c;

    public C1892h9() {
        m3938a();
    }

    /* renamed from: b */
    public static C1892h9[] m3937b() {
        if (f6399q == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6399q == null) {
                        f6399q = new C1892h9[0];
                    }
                } finally {
                }
            }
        }
        return f6399q;
    }

    /* renamed from: a */
    public final C1892h9 m3938a() {
        this.f6400a = 0L;
        this.f6401b = null;
        this.f6402c = C1842f9.m3823b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeUInt64Size = CodedOutputByteBufferNano.computeUInt64Size(1, this.f6400a) + super.computeSerializedSize();
        C1867g9 c1867g9 = this.f6401b;
        if (c1867g9 != null) {
            computeUInt64Size += CodedOutputByteBufferNano.computeMessageSize(2, c1867g9);
        }
        C1842f9[] c1842f9Arr = this.f6402c;
        if (c1842f9Arr != null && c1842f9Arr.length > 0) {
            int r02 = 0;
            while (true) {
                C1842f9[] c1842f9Arr2 = this.f6402c;
                if (r02 >= c1842f9Arr2.length) {
                    break;
                }
                C1842f9 c1842f9 = c1842f9Arr2[r02];
                if (c1842f9 != null) {
                    computeUInt64Size = CodedOutputByteBufferNano.computeMessageSize(3, c1842f9) + computeUInt64Size;
                }
                r02++;
            }
        }
        return computeUInt64Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeUInt64(1, this.f6400a);
        C1867g9 c1867g9 = this.f6401b;
        if (c1867g9 != null) {
            codedOutputByteBufferNano.writeMessage(2, c1867g9);
        }
        C1842f9[] c1842f9Arr = this.f6402c;
        if (c1842f9Arr != null && c1842f9Arr.length > 0) {
            int r02 = 0;
            while (true) {
                C1842f9[] c1842f9Arr2 = this.f6402c;
                if (r02 >= c1842f9Arr2.length) {
                    break;
                }
                C1842f9 c1842f9 = c1842f9Arr2[r02];
                if (c1842f9 != null) {
                    codedOutputByteBufferNano.writeMessage(3, c1842f9);
                }
                r02++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1892h9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f6400a = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 18) {
                if (this.f6401b == null) {
                    this.f6401b = new C1867g9();
                }
                codedInputByteBufferNano.readMessage(this.f6401b);
            } else if (readTag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                C1842f9[] c1842f9Arr = this.f6402c;
                int length = c1842f9Arr == null ? 0 : c1842f9Arr.length;
                int r02 = repeatedFieldArrayLength + length;
                C1842f9[] c1842f9Arr2 = new C1842f9[r02];
                if (length != 0) {
                    System.arraycopy(c1842f9Arr, 0, c1842f9Arr2, 0, length);
                }
                while (length < r02 - 1) {
                    C1842f9 c1842f9 = new C1842f9();
                    c1842f9Arr2[length] = c1842f9;
                    codedInputByteBufferNano.readMessage(c1842f9);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C1842f9 c1842f92 = new C1842f9();
                c1842f9Arr2[length] = c1842f92;
                codedInputByteBufferNano.readMessage(c1842f92);
                this.f6402c = c1842f9Arr2;
            }
        }
    }

    /* renamed from: b */
    public static C1892h9 m3936b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1892h9().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C1892h9 m3935a(byte[] bArr) {
        return (C1892h9) MessageNano.mergeFrom(new C1892h9(), bArr);
    }
}
