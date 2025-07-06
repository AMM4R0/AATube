package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.n8 */
/* loaded from: classes.dex */
public final class C2041n8 extends MessageNano {

    /* renamed from: c */
    public static volatile C2041n8[] f6798c;

    /* renamed from: a */
    public C1791d8 f6799a;

    /* renamed from: b */
    public C1791d8[] f6800b;

    public C2041n8() {
        m4239a();
    }

    /* renamed from: b */
    public static C2041n8[] m4238b() {
        if (f6798c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6798c == null) {
                        f6798c = new C2041n8[0];
                    }
                } finally {
                }
            }
        }
        return f6798c;
    }

    /* renamed from: a */
    public final C2041n8 m4239a() {
        this.f6799a = null;
        this.f6800b = C1791d8.m3734b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C1791d8 c1791d8 = this.f6799a;
        if (c1791d8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c1791d8);
        }
        C1791d8[] c1791d8Arr = this.f6800b;
        if (c1791d8Arr != null && c1791d8Arr.length > 0) {
            int r12 = 0;
            while (true) {
                C1791d8[] c1791d8Arr2 = this.f6800b;
                if (r12 >= c1791d8Arr2.length) {
                    break;
                }
                C1791d8 c1791d82 = c1791d8Arr2[r12];
                if (c1791d82 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, c1791d82) + computeSerializedSize;
                }
                r12++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        C1791d8 c1791d8 = this.f6799a;
        if (c1791d8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c1791d8);
        }
        C1791d8[] c1791d8Arr = this.f6800b;
        if (c1791d8Arr != null && c1791d8Arr.length > 0) {
            int r02 = 0;
            while (true) {
                C1791d8[] c1791d8Arr2 = this.f6800b;
                if (r02 >= c1791d8Arr2.length) {
                    break;
                }
                C1791d8 c1791d82 = c1791d8Arr2[r02];
                if (c1791d82 != null) {
                    codedOutputByteBufferNano.writeMessage(2, c1791d82);
                }
                r02++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2041n8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                if (this.f6799a == null) {
                    this.f6799a = new C1791d8();
                }
                codedInputByteBufferNano.readMessage(this.f6799a);
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C1791d8[] c1791d8Arr = this.f6800b;
                int length = c1791d8Arr == null ? 0 : c1791d8Arr.length;
                int r02 = repeatedFieldArrayLength + length;
                C1791d8[] c1791d8Arr2 = new C1791d8[r02];
                if (length != 0) {
                    System.arraycopy(c1791d8Arr, 0, c1791d8Arr2, 0, length);
                }
                while (length < r02 - 1) {
                    C1791d8 c1791d8 = new C1791d8();
                    c1791d8Arr2[length] = c1791d8;
                    codedInputByteBufferNano.readMessage(c1791d8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C1791d8 c1791d82 = new C1791d8();
                c1791d8Arr2[length] = c1791d82;
                codedInputByteBufferNano.readMessage(c1791d82);
                this.f6800b = c1791d8Arr2;
            }
        }
    }

    /* renamed from: b */
    public static C2041n8 m4237b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C2041n8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C2041n8 m4236a(byte[] bArr) {
        return (C2041n8) MessageNano.mergeFrom(new C2041n8(), bArr);
    }
}
