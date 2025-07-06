package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.i6 */
/* loaded from: classes.dex */
public final class C1914i6 extends MessageNano {

    /* renamed from: f */
    public static volatile C1914i6[] f6461f;

    /* renamed from: a */
    public String f6462a;

    /* renamed from: b */
    public String f6463b;

    /* renamed from: c */
    public C1864g6[] f6464c;

    /* renamed from: d */
    public C1914i6 f6465d;

    /* renamed from: e */
    public C1914i6[] f6466e;

    public C1914i6() {
        m3987a();
    }

    /* renamed from: b */
    public static C1914i6[] m3986b() {
        if (f6461f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6461f == null) {
                        f6461f = new C1914i6[0];
                    }
                } finally {
                }
            }
        }
        return f6461f;
    }

    /* renamed from: a */
    public final C1914i6 m3987a() {
        this.f6462a = "";
        this.f6463b = "";
        this.f6464c = C1864g6.m3854b();
        this.f6465d = null;
        this.f6466e = m3986b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeStringSize = CodedOutputByteBufferNano.computeStringSize(1, this.f6462a) + super.computeSerializedSize();
        if (!this.f6463b.equals("")) {
            computeStringSize += CodedOutputByteBufferNano.computeStringSize(2, this.f6463b);
        }
        C1864g6[] c1864g6Arr = this.f6464c;
        int r2 = 0;
        if (c1864g6Arr != null && c1864g6Arr.length > 0) {
            int r02 = 0;
            while (true) {
                C1864g6[] c1864g6Arr2 = this.f6464c;
                if (r02 >= c1864g6Arr2.length) {
                    break;
                }
                C1864g6 c1864g6 = c1864g6Arr2[r02];
                if (c1864g6 != null) {
                    computeStringSize = CodedOutputByteBufferNano.computeMessageSize(3, c1864g6) + computeStringSize;
                }
                r02++;
            }
        }
        C1914i6 c1914i6 = this.f6465d;
        if (c1914i6 != null) {
            computeStringSize += CodedOutputByteBufferNano.computeMessageSize(4, c1914i6);
        }
        C1914i6[] c1914i6Arr = this.f6466e;
        if (c1914i6Arr != null && c1914i6Arr.length > 0) {
            while (true) {
                C1914i6[] c1914i6Arr2 = this.f6466e;
                if (r2 >= c1914i6Arr2.length) {
                    break;
                }
                C1914i6 c1914i62 = c1914i6Arr2[r2];
                if (c1914i62 != null) {
                    computeStringSize = CodedOutputByteBufferNano.computeMessageSize(5, c1914i62) + computeStringSize;
                }
                r2++;
            }
        }
        return computeStringSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeString(1, this.f6462a);
        if (!this.f6463b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f6463b);
        }
        C1864g6[] c1864g6Arr = this.f6464c;
        int r12 = 0;
        if (c1864g6Arr != null && c1864g6Arr.length > 0) {
            int r02 = 0;
            while (true) {
                C1864g6[] c1864g6Arr2 = this.f6464c;
                if (r02 >= c1864g6Arr2.length) {
                    break;
                }
                C1864g6 c1864g6 = c1864g6Arr2[r02];
                if (c1864g6 != null) {
                    codedOutputByteBufferNano.writeMessage(3, c1864g6);
                }
                r02++;
            }
        }
        C1914i6 c1914i6 = this.f6465d;
        if (c1914i6 != null) {
            codedOutputByteBufferNano.writeMessage(4, c1914i6);
        }
        C1914i6[] c1914i6Arr = this.f6466e;
        if (c1914i6Arr != null && c1914i6Arr.length > 0) {
            while (true) {
                C1914i6[] c1914i6Arr2 = this.f6466e;
                if (r12 >= c1914i6Arr2.length) {
                    break;
                }
                C1914i6 c1914i62 = c1914i6Arr2[r12];
                if (c1914i62 != null) {
                    codedOutputByteBufferNano.writeMessage(5, c1914i62);
                }
                r12++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    /* renamed from: b */
    public static C1914i6 m3985b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1914i6().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1914i6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f6462a = codedInputByteBufferNano.readString();
            } else if (readTag == 18) {
                this.f6463b = codedInputByteBufferNano.readString();
            } else if (readTag == 26) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                C1864g6[] c1864g6Arr = this.f6464c;
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
                this.f6464c = c1864g6Arr2;
            } else if (readTag == 34) {
                if (this.f6465d == null) {
                    this.f6465d = new C1914i6();
                }
                codedInputByteBufferNano.readMessage(this.f6465d);
            } else if (readTag != 42) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                C1914i6[] c1914i6Arr = this.f6466e;
                int length2 = c1914i6Arr == null ? 0 : c1914i6Arr.length;
                int r03 = repeatedFieldArrayLength2 + length2;
                C1914i6[] c1914i6Arr2 = new C1914i6[r03];
                if (length2 != 0) {
                    System.arraycopy(c1914i6Arr, 0, c1914i6Arr2, 0, length2);
                }
                while (length2 < r03 - 1) {
                    C1914i6 c1914i6 = new C1914i6();
                    c1914i6Arr2[length2] = c1914i6;
                    codedInputByteBufferNano.readMessage(c1914i6);
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                C1914i6 c1914i62 = new C1914i6();
                c1914i6Arr2[length2] = c1914i62;
                codedInputByteBufferNano.readMessage(c1914i62);
                this.f6466e = c1914i6Arr2;
            }
        }
    }

    /* renamed from: a */
    public static C1914i6 m3984a(byte[] bArr) {
        return (C1914i6) MessageNano.mergeFrom(new C1914i6(), bArr);
    }
}
