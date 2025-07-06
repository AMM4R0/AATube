package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.Y5 */
/* loaded from: classes.dex */
public final class C1665Y5 extends MessageNano {

    /* renamed from: d */
    public static volatile C1665Y5[] f5718d;

    /* renamed from: a */
    public C1889h6 f5719a;

    /* renamed from: b */
    public C1889h6[] f5720b;

    /* renamed from: c */
    public String f5721c;

    public C1665Y5() {
        m3528a();
    }

    /* renamed from: b */
    public static C1665Y5[] m3527b() {
        if (f5718d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5718d == null) {
                        f5718d = new C1665Y5[0];
                    }
                } finally {
                }
            }
        }
        return f5718d;
    }

    /* renamed from: a */
    public final C1665Y5 m3528a() {
        this.f5719a = null;
        this.f5720b = C1889h6.m3911b();
        this.f5721c = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C1889h6 c1889h6 = this.f5719a;
        if (c1889h6 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c1889h6);
        }
        C1889h6[] c1889h6Arr = this.f5720b;
        if (c1889h6Arr != null && c1889h6Arr.length > 0) {
            int r12 = 0;
            while (true) {
                C1889h6[] c1889h6Arr2 = this.f5720b;
                if (r12 >= c1889h6Arr2.length) {
                    break;
                }
                C1889h6 c1889h62 = c1889h6Arr2[r12];
                if (c1889h62 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, c1889h62) + computeSerializedSize;
                }
                r12++;
            }
        }
        return !this.f5721c.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(3, this.f5721c) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        C1889h6 c1889h6 = this.f5719a;
        if (c1889h6 != null) {
            codedOutputByteBufferNano.writeMessage(1, c1889h6);
        }
        C1889h6[] c1889h6Arr = this.f5720b;
        if (c1889h6Arr != null && c1889h6Arr.length > 0) {
            int r02 = 0;
            while (true) {
                C1889h6[] c1889h6Arr2 = this.f5720b;
                if (r02 >= c1889h6Arr2.length) {
                    break;
                }
                C1889h6 c1889h62 = c1889h6Arr2[r02];
                if (c1889h62 != null) {
                    codedOutputByteBufferNano.writeMessage(2, c1889h62);
                }
                r02++;
            }
        }
        if (!this.f5721c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f5721c);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1665Y5 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                if (this.f5719a == null) {
                    this.f5719a = new C1889h6();
                }
                codedInputByteBufferNano.readMessage(this.f5719a);
            } else if (readTag == 18) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C1889h6[] c1889h6Arr = this.f5720b;
                int length = c1889h6Arr == null ? 0 : c1889h6Arr.length;
                int r02 = repeatedFieldArrayLength + length;
                C1889h6[] c1889h6Arr2 = new C1889h6[r02];
                if (length != 0) {
                    System.arraycopy(c1889h6Arr, 0, c1889h6Arr2, 0, length);
                }
                while (length < r02 - 1) {
                    C1889h6 c1889h6 = new C1889h6();
                    c1889h6Arr2[length] = c1889h6;
                    codedInputByteBufferNano.readMessage(c1889h6);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C1889h6 c1889h62 = new C1889h6();
                c1889h6Arr2[length] = c1889h62;
                codedInputByteBufferNano.readMessage(c1889h62);
                this.f5720b = c1889h6Arr2;
            } else if (readTag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f5721c = codedInputByteBufferNano.readString();
            }
        }
    }

    /* renamed from: b */
    public static C1665Y5 m3526b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1665Y5().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C1665Y5 m3525a(byte[] bArr) {
        return (C1665Y5) MessageNano.mergeFrom(new C1665Y5(), bArr);
    }
}
