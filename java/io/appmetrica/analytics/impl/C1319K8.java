package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.K8 */
/* loaded from: classes.dex */
public final class C1319K8 extends MessageNano {

    /* renamed from: b */
    public static volatile C1319K8[] f4951b;

    /* renamed from: a */
    public C1294J8[] f4952a;

    public C1319K8() {
        m3009a();
    }

    /* renamed from: b */
    public static C1319K8[] m3008b() {
        if (f4951b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f4951b == null) {
                        f4951b = new C1319K8[0];
                    }
                } finally {
                }
            }
        }
        return f4951b;
    }

    /* renamed from: a */
    public final C1319K8 m3009a() {
        this.f4952a = C1294J8.m2982b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C1294J8[] c1294j8Arr = this.f4952a;
        if (c1294j8Arr != null && c1294j8Arr.length > 0) {
            int r12 = 0;
            while (true) {
                C1294J8[] c1294j8Arr2 = this.f4952a;
                if (r12 >= c1294j8Arr2.length) {
                    break;
                }
                C1294J8 c1294j8 = c1294j8Arr2[r12];
                if (c1294j8 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c1294j8) + computeSerializedSize;
                }
                r12++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        C1294J8[] c1294j8Arr = this.f4952a;
        if (c1294j8Arr != null && c1294j8Arr.length > 0) {
            int r02 = 0;
            while (true) {
                C1294J8[] c1294j8Arr2 = this.f4952a;
                if (r02 >= c1294j8Arr2.length) {
                    break;
                }
                C1294J8 c1294j8 = c1294j8Arr2[r02];
                if (c1294j8 != null) {
                    codedOutputByteBufferNano.writeMessage(1, c1294j8);
                }
                r02++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1319K8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag != 10) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C1294J8[] c1294j8Arr = this.f4952a;
                int length = c1294j8Arr == null ? 0 : c1294j8Arr.length;
                int r02 = repeatedFieldArrayLength + length;
                C1294J8[] c1294j8Arr2 = new C1294J8[r02];
                if (length != 0) {
                    System.arraycopy(c1294j8Arr, 0, c1294j8Arr2, 0, length);
                }
                while (length < r02 - 1) {
                    C1294J8 c1294j8 = new C1294J8();
                    c1294j8Arr2[length] = c1294j8;
                    codedInputByteBufferNano.readMessage(c1294j8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C1294J8 c1294j82 = new C1294J8();
                c1294j8Arr2[length] = c1294j82;
                codedInputByteBufferNano.readMessage(c1294j82);
                this.f4952a = c1294j8Arr2;
            }
        }
    }

    /* renamed from: b */
    public static C1319K8 m3007b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1319K8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C1319K8 m3006a(byte[] bArr) {
        return (C1319K8) MessageNano.mergeFrom(new C1319K8(), bArr);
    }
}
