package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.Y3 */
/* loaded from: classes.dex */
public final class C1663Y3 extends MessageNano {

    /* renamed from: c */
    public static final int f5711c = 0;

    /* renamed from: d */
    public static final int f5712d = 1;

    /* renamed from: e */
    public static final int f5713e = 2;

    /* renamed from: f */
    public static final int f5714f = 3;

    /* renamed from: g */
    public static volatile C1663Y3[] f5715g;

    /* renamed from: a */
    public C1588V3 f5716a;

    /* renamed from: b */
    public C1588V3[] f5717b;

    public C1663Y3() {
        m3522a();
    }

    /* renamed from: b */
    public static C1663Y3[] m3521b() {
        if (f5715g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5715g == null) {
                        f5715g = new C1663Y3[0];
                    }
                } finally {
                }
            }
        }
        return f5715g;
    }

    /* renamed from: a */
    public final C1663Y3 m3522a() {
        this.f5716a = null;
        this.f5717b = C1588V3.m3405b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C1588V3 c1588v3 = this.f5716a;
        if (c1588v3 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c1588v3);
        }
        C1588V3[] c1588v3Arr = this.f5717b;
        if (c1588v3Arr != null && c1588v3Arr.length > 0) {
            int r12 = 0;
            while (true) {
                C1588V3[] c1588v3Arr2 = this.f5717b;
                if (r12 >= c1588v3Arr2.length) {
                    break;
                }
                C1588V3 c1588v32 = c1588v3Arr2[r12];
                if (c1588v32 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, c1588v32) + computeSerializedSize;
                }
                r12++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        C1588V3 c1588v3 = this.f5716a;
        if (c1588v3 != null) {
            codedOutputByteBufferNano.writeMessage(1, c1588v3);
        }
        C1588V3[] c1588v3Arr = this.f5717b;
        if (c1588v3Arr != null && c1588v3Arr.length > 0) {
            int r02 = 0;
            while (true) {
                C1588V3[] c1588v3Arr2 = this.f5717b;
                if (r02 >= c1588v3Arr2.length) {
                    break;
                }
                C1588V3 c1588v32 = c1588v3Arr2[r02];
                if (c1588v32 != null) {
                    codedOutputByteBufferNano.writeMessage(2, c1588v32);
                }
                r02++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1663Y3 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                if (this.f5716a == null) {
                    this.f5716a = new C1588V3();
                }
                codedInputByteBufferNano.readMessage(this.f5716a);
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C1588V3[] c1588v3Arr = this.f5717b;
                int length = c1588v3Arr == null ? 0 : c1588v3Arr.length;
                int r02 = repeatedFieldArrayLength + length;
                C1588V3[] c1588v3Arr2 = new C1588V3[r02];
                if (length != 0) {
                    System.arraycopy(c1588v3Arr, 0, c1588v3Arr2, 0, length);
                }
                while (length < r02 - 1) {
                    C1588V3 c1588v3 = new C1588V3();
                    c1588v3Arr2[length] = c1588v3;
                    codedInputByteBufferNano.readMessage(c1588v3);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C1588V3 c1588v32 = new C1588V3();
                c1588v3Arr2[length] = c1588v32;
                codedInputByteBufferNano.readMessage(c1588v32);
                this.f5717b = c1588v3Arr2;
            }
        }
    }

    /* renamed from: b */
    public static C1663Y3 m3520b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1663Y3().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C1663Y3 m3519a(byte[] bArr) {
        return (C1663Y3) MessageNano.mergeFrom(new C1663Y3(), bArr);
    }
}
