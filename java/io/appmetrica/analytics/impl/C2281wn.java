package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.wn */
/* loaded from: classes.dex */
public final class C2281wn extends MessageNano {

    /* renamed from: b */
    public static volatile C2281wn[] f7405b;

    /* renamed from: a */
    public C2206tn[] f7406a;

    public C2281wn() {
        m4589a();
    }

    /* renamed from: b */
    public static C2281wn[] m4588b() {
        if (f7405b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7405b == null) {
                        f7405b = new C2281wn[0];
                    }
                } finally {
                }
            }
        }
        return f7405b;
    }

    /* renamed from: a */
    public final C2281wn m4589a() {
        this.f7406a = C2206tn.m4464b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C2206tn[] c2206tnArr = this.f7406a;
        if (c2206tnArr != null && c2206tnArr.length > 0) {
            int r12 = 0;
            while (true) {
                C2206tn[] c2206tnArr2 = this.f7406a;
                if (r12 >= c2206tnArr2.length) {
                    break;
                }
                C2206tn c2206tn = c2206tnArr2[r12];
                if (c2206tn != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c2206tn) + computeSerializedSize;
                }
                r12++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        C2206tn[] c2206tnArr = this.f7406a;
        if (c2206tnArr != null && c2206tnArr.length > 0) {
            int r02 = 0;
            while (true) {
                C2206tn[] c2206tnArr2 = this.f7406a;
                if (r02 >= c2206tnArr2.length) {
                    break;
                }
                C2206tn c2206tn = c2206tnArr2[r02];
                if (c2206tn != null) {
                    codedOutputByteBufferNano.writeMessage(1, c2206tn);
                }
                r02++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2281wn mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
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
                C2206tn[] c2206tnArr = this.f7406a;
                int length = c2206tnArr == null ? 0 : c2206tnArr.length;
                int r02 = repeatedFieldArrayLength + length;
                C2206tn[] c2206tnArr2 = new C2206tn[r02];
                if (length != 0) {
                    System.arraycopy(c2206tnArr, 0, c2206tnArr2, 0, length);
                }
                while (length < r02 - 1) {
                    C2206tn c2206tn = new C2206tn();
                    c2206tnArr2[length] = c2206tn;
                    codedInputByteBufferNano.readMessage(c2206tn);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C2206tn c2206tn2 = new C2206tn();
                c2206tnArr2[length] = c2206tn2;
                codedInputByteBufferNano.readMessage(c2206tn2);
                this.f7406a = c2206tnArr2;
            }
        }
    }

    /* renamed from: b */
    public static C2281wn m4587b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C2281wn().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C2281wn m4586a(byte[] bArr) {
        return (C2281wn) MessageNano.mergeFrom(new C2281wn(), bArr);
    }
}
