package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.c2 */
/* loaded from: classes.dex */
public final class C1760c2 extends MessageNano {

    /* renamed from: d */
    public static volatile C1760c2[] f5965d;

    /* renamed from: a */
    public C1735b2[] f5966a;

    /* renamed from: b */
    public C1710a2 f5967b;

    /* renamed from: c */
    public String[] f5968c;

    public C1760c2() {
        m3686a();
    }

    /* renamed from: b */
    public static C1760c2[] m3685b() {
        if (f5965d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5965d == null) {
                        f5965d = new C1760c2[0];
                    }
                } finally {
                }
            }
        }
        return f5965d;
    }

    /* renamed from: a */
    public final C1760c2 m3686a() {
        this.f5966a = C1735b2.m3635b();
        this.f5967b = null;
        this.f5968c = WireFormatNano.EMPTY_STRING_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C1735b2[] c1735b2Arr = this.f5966a;
        int r2 = 0;
        if (c1735b2Arr != null && c1735b2Arr.length > 0) {
            int r12 = 0;
            while (true) {
                C1735b2[] c1735b2Arr2 = this.f5966a;
                if (r12 >= c1735b2Arr2.length) {
                    break;
                }
                C1735b2 c1735b2 = c1735b2Arr2[r12];
                if (c1735b2 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c1735b2) + computeSerializedSize;
                }
                r12++;
            }
        }
        C1710a2 c1710a2 = this.f5967b;
        if (c1710a2 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c1710a2);
        }
        String[] strArr = this.f5968c;
        if (strArr == null || strArr.length <= 0) {
            return computeSerializedSize;
        }
        int r13 = 0;
        int r3 = 0;
        while (true) {
            String[] strArr2 = this.f5968c;
            if (r2 >= strArr2.length) {
                return computeSerializedSize + r13 + r3;
            }
            String str = strArr2[r2];
            if (str != null) {
                r3++;
                r13 = CodedOutputByteBufferNano.computeStringSizeNoTag(str) + r13;
            }
            r2++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        C1735b2[] c1735b2Arr = this.f5966a;
        int r12 = 0;
        if (c1735b2Arr != null && c1735b2Arr.length > 0) {
            int r02 = 0;
            while (true) {
                C1735b2[] c1735b2Arr2 = this.f5966a;
                if (r02 >= c1735b2Arr2.length) {
                    break;
                }
                C1735b2 c1735b2 = c1735b2Arr2[r02];
                if (c1735b2 != null) {
                    codedOutputByteBufferNano.writeMessage(1, c1735b2);
                }
                r02++;
            }
        }
        C1710a2 c1710a2 = this.f5967b;
        if (c1710a2 != null) {
            codedOutputByteBufferNano.writeMessage(2, c1710a2);
        }
        String[] strArr = this.f5968c;
        if (strArr != null && strArr.length > 0) {
            while (true) {
                String[] strArr2 = this.f5968c;
                if (r12 >= strArr2.length) {
                    break;
                }
                String str = strArr2[r12];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(3, str);
                }
                r12++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1760c2 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C1735b2[] c1735b2Arr = this.f5966a;
                int length = c1735b2Arr == null ? 0 : c1735b2Arr.length;
                int r02 = repeatedFieldArrayLength + length;
                C1735b2[] c1735b2Arr2 = new C1735b2[r02];
                if (length != 0) {
                    System.arraycopy(c1735b2Arr, 0, c1735b2Arr2, 0, length);
                }
                while (length < r02 - 1) {
                    C1735b2 c1735b2 = new C1735b2();
                    c1735b2Arr2[length] = c1735b2;
                    codedInputByteBufferNano.readMessage(c1735b2);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C1735b2 c1735b22 = new C1735b2();
                c1735b2Arr2[length] = c1735b22;
                codedInputByteBufferNano.readMessage(c1735b22);
                this.f5966a = c1735b2Arr2;
            } else if (readTag == 18) {
                if (this.f5967b == null) {
                    this.f5967b = new C1710a2();
                }
                codedInputByteBufferNano.readMessage(this.f5967b);
            } else if (readTag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                String[] strArr = this.f5968c;
                int length2 = strArr == null ? 0 : strArr.length;
                int r03 = repeatedFieldArrayLength2 + length2;
                String[] strArr2 = new String[r03];
                if (length2 != 0) {
                    System.arraycopy(strArr, 0, strArr2, 0, length2);
                }
                while (length2 < r03 - 1) {
                    strArr2[length2] = codedInputByteBufferNano.readString();
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                strArr2[length2] = codedInputByteBufferNano.readString();
                this.f5968c = strArr2;
            }
        }
    }

    /* renamed from: b */
    public static C1760c2 m3684b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1760c2().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C1760c2 m3683a(byte[] bArr) {
        return (C1760c2) MessageNano.mergeFrom(new C1760c2(), bArr);
    }
}
