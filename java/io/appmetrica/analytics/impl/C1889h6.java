package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.h6 */
/* loaded from: classes.dex */
public final class C1889h6 extends MessageNano {

    /* renamed from: g */
    public static volatile C1889h6[] f6358g;

    /* renamed from: a */
    public String f6359a;

    /* renamed from: b */
    public int f6360b;

    /* renamed from: c */
    public long f6361c;

    /* renamed from: d */
    public String f6362d;

    /* renamed from: e */
    public int f6363e;

    /* renamed from: f */
    public C1864g6[] f6364f;

    public C1889h6() {
        m3912a();
    }

    /* renamed from: b */
    public static C1889h6[] m3911b() {
        if (f6358g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6358g == null) {
                        f6358g = new C1889h6[0];
                    }
                } finally {
                }
            }
        }
        return f6358g;
    }

    /* renamed from: a */
    public final C1889h6 m3912a() {
        this.f6359a = "";
        this.f6360b = 0;
        this.f6361c = 0L;
        this.f6362d = "";
        this.f6363e = 0;
        this.f6364f = C1864g6.m3854b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSInt64Size = CodedOutputByteBufferNano.computeSInt64Size(3, this.f6361c) + CodedOutputByteBufferNano.computeSInt32Size(2, this.f6360b) + CodedOutputByteBufferNano.computeStringSize(1, this.f6359a) + super.computeSerializedSize();
        if (!this.f6362d.equals("")) {
            computeSInt64Size += CodedOutputByteBufferNano.computeStringSize(4, this.f6362d);
        }
        int r02 = this.f6363e;
        if (r02 != 0) {
            computeSInt64Size += CodedOutputByteBufferNano.computeUInt32Size(5, r02);
        }
        C1864g6[] c1864g6Arr = this.f6364f;
        if (c1864g6Arr != null && c1864g6Arr.length > 0) {
            int r03 = 0;
            while (true) {
                C1864g6[] c1864g6Arr2 = this.f6364f;
                if (r03 >= c1864g6Arr2.length) {
                    break;
                }
                C1864g6 c1864g6 = c1864g6Arr2[r03];
                if (c1864g6 != null) {
                    computeSInt64Size = CodedOutputByteBufferNano.computeMessageSize(6, c1864g6) + computeSInt64Size;
                }
                r03++;
            }
        }
        return computeSInt64Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeString(1, this.f6359a);
        codedOutputByteBufferNano.writeSInt32(2, this.f6360b);
        codedOutputByteBufferNano.writeSInt64(3, this.f6361c);
        if (!this.f6362d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f6362d);
        }
        int r02 = this.f6363e;
        if (r02 != 0) {
            codedOutputByteBufferNano.writeUInt32(5, r02);
        }
        C1864g6[] c1864g6Arr = this.f6364f;
        if (c1864g6Arr != null && c1864g6Arr.length > 0) {
            int r03 = 0;
            while (true) {
                C1864g6[] c1864g6Arr2 = this.f6364f;
                if (r03 >= c1864g6Arr2.length) {
                    break;
                }
                C1864g6 c1864g6 = c1864g6Arr2[r03];
                if (c1864g6 != null) {
                    codedOutputByteBufferNano.writeMessage(6, c1864g6);
                }
                r03++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    /* renamed from: b */
    public static C1889h6 m3910b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1889h6().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1889h6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f6359a = codedInputByteBufferNano.readString();
            } else if (readTag == 16) {
                this.f6360b = codedInputByteBufferNano.readSInt32();
            } else if (readTag == 24) {
                this.f6361c = codedInputByteBufferNano.readSInt64();
            } else if (readTag == 34) {
                this.f6362d = codedInputByteBufferNano.readString();
            } else if (readTag == 40) {
                this.f6363e = codedInputByteBufferNano.readUInt32();
            } else if (readTag != 50) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 50);
                C1864g6[] c1864g6Arr = this.f6364f;
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
                this.f6364f = c1864g6Arr2;
            }
        }
    }

    /* renamed from: a */
    public static C1889h6 m3909a(byte[] bArr) {
        return (C1889h6) MessageNano.mergeFrom(new C1889h6(), bArr);
    }
}
