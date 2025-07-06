package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.k9 */
/* loaded from: classes.dex */
public final class C1967k9 extends MessageNano {

    /* renamed from: f */
    public static final int f6569f = -1;

    /* renamed from: g */
    public static final int f6570g = 0;

    /* renamed from: h */
    public static final int f6571h = 1;

    /* renamed from: i */
    public static volatile C1967k9[] f6572i;

    /* renamed from: a */
    public C1892h9[] f6573a;

    /* renamed from: b */
    public C1767c9 f6574b;

    /* renamed from: c */
    public C1692Z8[] f6575c;

    /* renamed from: d */
    public C1917i9[] f6576d;

    /* renamed from: e */
    public String[] f6577e;

    public C1967k9() {
        m4051a();
    }

    /* renamed from: b */
    public static C1967k9[] m4050b() {
        if (f6572i == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6572i == null) {
                        f6572i = new C1967k9[0];
                    }
                } finally {
                }
            }
        }
        return f6572i;
    }

    /* renamed from: a */
    public final C1967k9 m4051a() {
        this.f6573a = C1892h9.m3937b();
        this.f6574b = null;
        this.f6575c = C1692Z8.m3570b();
        this.f6576d = C1917i9.m4001b();
        this.f6577e = WireFormatNano.EMPTY_STRING_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C1892h9[] c1892h9Arr = this.f6573a;
        int r2 = 0;
        if (c1892h9Arr != null && c1892h9Arr.length > 0) {
            int r12 = 0;
            while (true) {
                C1892h9[] c1892h9Arr2 = this.f6573a;
                if (r12 >= c1892h9Arr2.length) {
                    break;
                }
                C1892h9 c1892h9 = c1892h9Arr2[r12];
                if (c1892h9 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(3, c1892h9) + computeSerializedSize;
                }
                r12++;
            }
        }
        C1767c9 c1767c9 = this.f6574b;
        if (c1767c9 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, c1767c9);
        }
        C1692Z8[] c1692z8Arr = this.f6575c;
        if (c1692z8Arr != null && c1692z8Arr.length > 0) {
            int r13 = 0;
            while (true) {
                C1692Z8[] c1692z8Arr2 = this.f6575c;
                if (r13 >= c1692z8Arr2.length) {
                    break;
                }
                C1692Z8 c1692z8 = c1692z8Arr2[r13];
                if (c1692z8 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(7, c1692z8) + computeSerializedSize;
                }
                r13++;
            }
        }
        C1917i9[] c1917i9Arr = this.f6576d;
        if (c1917i9Arr != null && c1917i9Arr.length > 0) {
            int r14 = 0;
            while (true) {
                C1917i9[] c1917i9Arr2 = this.f6576d;
                if (r14 >= c1917i9Arr2.length) {
                    break;
                }
                C1917i9 c1917i9 = c1917i9Arr2[r14];
                if (c1917i9 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(10, c1917i9) + computeSerializedSize;
                }
                r14++;
            }
        }
        String[] strArr = this.f6577e;
        if (strArr == null || strArr.length <= 0) {
            return computeSerializedSize;
        }
        int r15 = 0;
        int r3 = 0;
        while (true) {
            String[] strArr2 = this.f6577e;
            if (r2 >= strArr2.length) {
                return computeSerializedSize + r15 + r3;
            }
            String str = strArr2[r2];
            if (str != null) {
                r3++;
                r15 = CodedOutputByteBufferNano.computeStringSizeNoTag(str) + r15;
            }
            r2++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        C1892h9[] c1892h9Arr = this.f6573a;
        int r12 = 0;
        if (c1892h9Arr != null && c1892h9Arr.length > 0) {
            int r02 = 0;
            while (true) {
                C1892h9[] c1892h9Arr2 = this.f6573a;
                if (r02 >= c1892h9Arr2.length) {
                    break;
                }
                C1892h9 c1892h9 = c1892h9Arr2[r02];
                if (c1892h9 != null) {
                    codedOutputByteBufferNano.writeMessage(3, c1892h9);
                }
                r02++;
            }
        }
        C1767c9 c1767c9 = this.f6574b;
        if (c1767c9 != null) {
            codedOutputByteBufferNano.writeMessage(4, c1767c9);
        }
        C1692Z8[] c1692z8Arr = this.f6575c;
        if (c1692z8Arr != null && c1692z8Arr.length > 0) {
            int r03 = 0;
            while (true) {
                C1692Z8[] c1692z8Arr2 = this.f6575c;
                if (r03 >= c1692z8Arr2.length) {
                    break;
                }
                C1692Z8 c1692z8 = c1692z8Arr2[r03];
                if (c1692z8 != null) {
                    codedOutputByteBufferNano.writeMessage(7, c1692z8);
                }
                r03++;
            }
        }
        C1917i9[] c1917i9Arr = this.f6576d;
        if (c1917i9Arr != null && c1917i9Arr.length > 0) {
            int r04 = 0;
            while (true) {
                C1917i9[] c1917i9Arr2 = this.f6576d;
                if (r04 >= c1917i9Arr2.length) {
                    break;
                }
                C1917i9 c1917i9 = c1917i9Arr2[r04];
                if (c1917i9 != null) {
                    codedOutputByteBufferNano.writeMessage(10, c1917i9);
                }
                r04++;
            }
        }
        String[] strArr = this.f6577e;
        if (strArr != null && strArr.length > 0) {
            while (true) {
                String[] strArr2 = this.f6577e;
                if (r12 >= strArr2.length) {
                    break;
                }
                String str = strArr2[r12];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(11, str);
                }
                r12++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    /* renamed from: b */
    public static C1967k9 m4049b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1967k9().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1967k9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 26) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                C1892h9[] c1892h9Arr = this.f6573a;
                int length = c1892h9Arr == null ? 0 : c1892h9Arr.length;
                int r02 = repeatedFieldArrayLength + length;
                C1892h9[] c1892h9Arr2 = new C1892h9[r02];
                if (length != 0) {
                    System.arraycopy(c1892h9Arr, 0, c1892h9Arr2, 0, length);
                }
                while (length < r02 - 1) {
                    C1892h9 c1892h9 = new C1892h9();
                    c1892h9Arr2[length] = c1892h9;
                    codedInputByteBufferNano.readMessage(c1892h9);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C1892h9 c1892h92 = new C1892h9();
                c1892h9Arr2[length] = c1892h92;
                codedInputByteBufferNano.readMessage(c1892h92);
                this.f6573a = c1892h9Arr2;
            } else if (readTag == 34) {
                if (this.f6574b == null) {
                    this.f6574b = new C1767c9();
                }
                codedInputByteBufferNano.readMessage(this.f6574b);
            } else if (readTag == 58) {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                C1692Z8[] c1692z8Arr = this.f6575c;
                int length2 = c1692z8Arr == null ? 0 : c1692z8Arr.length;
                int r03 = repeatedFieldArrayLength2 + length2;
                C1692Z8[] c1692z8Arr2 = new C1692Z8[r03];
                if (length2 != 0) {
                    System.arraycopy(c1692z8Arr, 0, c1692z8Arr2, 0, length2);
                }
                while (length2 < r03 - 1) {
                    C1692Z8 c1692z8 = new C1692Z8();
                    c1692z8Arr2[length2] = c1692z8;
                    codedInputByteBufferNano.readMessage(c1692z8);
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                C1692Z8 c1692z82 = new C1692Z8();
                c1692z8Arr2[length2] = c1692z82;
                codedInputByteBufferNano.readMessage(c1692z82);
                this.f6575c = c1692z8Arr2;
            } else if (readTag == 82) {
                int repeatedFieldArrayLength3 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 82);
                C1917i9[] c1917i9Arr = this.f6576d;
                int length3 = c1917i9Arr == null ? 0 : c1917i9Arr.length;
                int r04 = repeatedFieldArrayLength3 + length3;
                C1917i9[] c1917i9Arr2 = new C1917i9[r04];
                if (length3 != 0) {
                    System.arraycopy(c1917i9Arr, 0, c1917i9Arr2, 0, length3);
                }
                while (length3 < r04 - 1) {
                    C1917i9 c1917i9 = new C1917i9();
                    c1917i9Arr2[length3] = c1917i9;
                    codedInputByteBufferNano.readMessage(c1917i9);
                    codedInputByteBufferNano.readTag();
                    length3++;
                }
                C1917i9 c1917i92 = new C1917i9();
                c1917i9Arr2[length3] = c1917i92;
                codedInputByteBufferNano.readMessage(c1917i92);
                this.f6576d = c1917i9Arr2;
            } else if (readTag != 90) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength4 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 90);
                String[] strArr = this.f6577e;
                int length4 = strArr == null ? 0 : strArr.length;
                int r05 = repeatedFieldArrayLength4 + length4;
                String[] strArr2 = new String[r05];
                if (length4 != 0) {
                    System.arraycopy(strArr, 0, strArr2, 0, length4);
                }
                while (length4 < r05 - 1) {
                    strArr2[length4] = codedInputByteBufferNano.readString();
                    codedInputByteBufferNano.readTag();
                    length4++;
                }
                strArr2[length4] = codedInputByteBufferNano.readString();
                this.f6577e = strArr2;
            }
        }
    }

    /* renamed from: a */
    public static C1967k9 m4048a(byte[] bArr) {
        return (C1967k9) MessageNano.mergeFrom(new C1967k9(), bArr);
    }
}
