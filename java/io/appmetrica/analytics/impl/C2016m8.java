package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.m8 */
/* loaded from: classes.dex */
public final class C2016m8 extends MessageNano {

    /* renamed from: c */
    public static volatile C2016m8[] f6719c;

    /* renamed from: a */
    public C1991l8[] f6720a;

    /* renamed from: b */
    public int f6721b;

    public C2016m8() {
        m4189a();
    }

    /* renamed from: b */
    public static C2016m8[] m4188b() {
        if (f6719c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6719c == null) {
                        f6719c = new C2016m8[0];
                    }
                } finally {
                }
            }
        }
        return f6719c;
    }

    /* renamed from: a */
    public final C2016m8 m4189a() {
        this.f6720a = C1991l8.m4097b();
        this.f6721b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C1991l8[] c1991l8Arr = this.f6720a;
        if (c1991l8Arr != null && c1991l8Arr.length > 0) {
            int r12 = 0;
            while (true) {
                C1991l8[] c1991l8Arr2 = this.f6720a;
                if (r12 >= c1991l8Arr2.length) {
                    break;
                }
                C1991l8 c1991l8 = c1991l8Arr2[r12];
                if (c1991l8 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c1991l8) + computeSerializedSize;
                }
                r12++;
            }
        }
        int r13 = this.f6721b;
        return r13 != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeUInt32Size(2, r13) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        C1991l8[] c1991l8Arr = this.f6720a;
        if (c1991l8Arr != null && c1991l8Arr.length > 0) {
            int r02 = 0;
            while (true) {
                C1991l8[] c1991l8Arr2 = this.f6720a;
                if (r02 >= c1991l8Arr2.length) {
                    break;
                }
                C1991l8 c1991l8 = c1991l8Arr2[r02];
                if (c1991l8 != null) {
                    codedOutputByteBufferNano.writeMessage(1, c1991l8);
                }
                r02++;
            }
        }
        int r03 = this.f6721b;
        if (r03 != 0) {
            codedOutputByteBufferNano.writeUInt32(2, r03);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2016m8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C1991l8[] c1991l8Arr = this.f6720a;
                int length = c1991l8Arr == null ? 0 : c1991l8Arr.length;
                int r02 = repeatedFieldArrayLength + length;
                C1991l8[] c1991l8Arr2 = new C1991l8[r02];
                if (length != 0) {
                    System.arraycopy(c1991l8Arr, 0, c1991l8Arr2, 0, length);
                }
                while (length < r02 - 1) {
                    C1991l8 c1991l8 = new C1991l8();
                    c1991l8Arr2[length] = c1991l8;
                    codedInputByteBufferNano.readMessage(c1991l8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C1991l8 c1991l82 = new C1991l8();
                c1991l8Arr2[length] = c1991l82;
                codedInputByteBufferNano.readMessage(c1991l82);
                this.f6720a = c1991l8Arr2;
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f6721b = codedInputByteBufferNano.readUInt32();
            }
        }
    }

    /* renamed from: b */
    public static C2016m8 m4187b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C2016m8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C2016m8 m4186a(byte[] bArr) {
        return (C2016m8) MessageNano.mergeFrom(new C2016m8(), bArr);
    }
}
