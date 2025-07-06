package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.C2 */
/* loaded from: classes.dex */
public final class C1113C2 extends MessageNano {

    /* renamed from: c */
    public static final int f4561c = 1;

    /* renamed from: d */
    public static final int f4562d = 2;

    /* renamed from: e */
    public static final int f4563e = 3;

    /* renamed from: f */
    public static volatile C1113C2[] f4564f;

    /* renamed from: a */
    public C1088B2[] f4565a;

    /* renamed from: b */
    public boolean f4566b;

    public C1113C2() {
        m2787a();
    }

    /* renamed from: b */
    public static C1113C2[] m2786b() {
        if (f4564f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f4564f == null) {
                        f4564f = new C1113C2[0];
                    }
                } finally {
                }
            }
        }
        return f4564f;
    }

    /* renamed from: a */
    public final C1113C2 m2787a() {
        this.f4565a = C1088B2.m2741b();
        this.f4566b = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C1088B2[] c1088b2Arr = this.f4565a;
        if (c1088b2Arr != null && c1088b2Arr.length > 0) {
            int r12 = 0;
            while (true) {
                C1088B2[] c1088b2Arr2 = this.f4565a;
                if (r12 >= c1088b2Arr2.length) {
                    break;
                }
                C1088B2 c1088b2 = c1088b2Arr2[r12];
                if (c1088b2 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c1088b2) + computeSerializedSize;
                }
                r12++;
            }
        }
        return CodedOutputByteBufferNano.computeBoolSize(2, this.f4566b) + computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        C1088B2[] c1088b2Arr = this.f4565a;
        if (c1088b2Arr != null && c1088b2Arr.length > 0) {
            int r02 = 0;
            while (true) {
                C1088B2[] c1088b2Arr2 = this.f4565a;
                if (r02 >= c1088b2Arr2.length) {
                    break;
                }
                C1088B2 c1088b2 = c1088b2Arr2[r02];
                if (c1088b2 != null) {
                    codedOutputByteBufferNano.writeMessage(1, c1088b2);
                }
                r02++;
            }
        }
        codedOutputByteBufferNano.writeBool(2, this.f4566b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1113C2 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C1088B2[] c1088b2Arr = this.f4565a;
                int length = c1088b2Arr == null ? 0 : c1088b2Arr.length;
                int r02 = repeatedFieldArrayLength + length;
                C1088B2[] c1088b2Arr2 = new C1088B2[r02];
                if (length != 0) {
                    System.arraycopy(c1088b2Arr, 0, c1088b2Arr2, 0, length);
                }
                while (length < r02 - 1) {
                    C1088B2 c1088b2 = new C1088B2();
                    c1088b2Arr2[length] = c1088b2;
                    codedInputByteBufferNano.readMessage(c1088b2);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C1088B2 c1088b22 = new C1088B2();
                c1088b2Arr2[length] = c1088b22;
                codedInputByteBufferNano.readMessage(c1088b22);
                this.f4565a = c1088b2Arr2;
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f4566b = codedInputByteBufferNano.readBool();
            }
        }
    }

    /* renamed from: b */
    public static C1113C2 m2785b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1113C2().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C1113C2 m2784a(byte[] bArr) {
        return (C1113C2) MessageNano.mergeFrom(new C1113C2(), bArr);
    }
}
