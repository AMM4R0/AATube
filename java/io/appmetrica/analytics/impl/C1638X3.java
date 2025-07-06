package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.X3 */
/* loaded from: classes.dex */
public final class C1638X3 extends MessageNano {

    /* renamed from: b */
    public static volatile C1638X3[] f5687b;

    /* renamed from: a */
    public C1613W3[] f5688a;

    public C1638X3() {
        m3510a();
    }

    /* renamed from: b */
    public static C1638X3[] m3509b() {
        if (f5687b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5687b == null) {
                        f5687b = new C1638X3[0];
                    }
                } finally {
                }
            }
        }
        return f5687b;
    }

    /* renamed from: a */
    public final C1638X3 m3510a() {
        this.f5688a = C1613W3.m3452b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C1613W3[] c1613w3Arr = this.f5688a;
        if (c1613w3Arr != null && c1613w3Arr.length > 0) {
            int r12 = 0;
            while (true) {
                C1613W3[] c1613w3Arr2 = this.f5688a;
                if (r12 >= c1613w3Arr2.length) {
                    break;
                }
                C1613W3 c1613w3 = c1613w3Arr2[r12];
                if (c1613w3 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c1613w3) + computeSerializedSize;
                }
                r12++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        C1613W3[] c1613w3Arr = this.f5688a;
        if (c1613w3Arr != null && c1613w3Arr.length > 0) {
            int r02 = 0;
            while (true) {
                C1613W3[] c1613w3Arr2 = this.f5688a;
                if (r02 >= c1613w3Arr2.length) {
                    break;
                }
                C1613W3 c1613w3 = c1613w3Arr2[r02];
                if (c1613w3 != null) {
                    codedOutputByteBufferNano.writeMessage(1, c1613w3);
                }
                r02++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1638X3 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
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
                C1613W3[] c1613w3Arr = this.f5688a;
                int length = c1613w3Arr == null ? 0 : c1613w3Arr.length;
                int r02 = repeatedFieldArrayLength + length;
                C1613W3[] c1613w3Arr2 = new C1613W3[r02];
                if (length != 0) {
                    System.arraycopy(c1613w3Arr, 0, c1613w3Arr2, 0, length);
                }
                while (length < r02 - 1) {
                    C1613W3 c1613w3 = new C1613W3();
                    c1613w3Arr2[length] = c1613w3;
                    codedInputByteBufferNano.readMessage(c1613w3);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C1613W3 c1613w32 = new C1613W3();
                c1613w3Arr2[length] = c1613w32;
                codedInputByteBufferNano.readMessage(c1613w32);
                this.f5688a = c1613w3Arr2;
            }
        }
    }

    /* renamed from: b */
    public static C1638X3 m3508b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1638X3().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C1638X3 m3507a(byte[] bArr) {
        return (C1638X3) MessageNano.mergeFrom(new C1638X3(), bArr);
    }
}
