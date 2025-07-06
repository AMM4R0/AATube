package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.ak */
/* loaded from: classes.dex */
public final class C1728ak extends MessageNano {

    /* renamed from: b */
    public static volatile C1728ak[] f5889b;

    /* renamed from: a */
    public C1753bk[] f5890a;

    public C1728ak() {
        m3623a();
    }

    /* renamed from: b */
    public static C1728ak[] m3622b() {
        if (f5889b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5889b == null) {
                        f5889b = new C1728ak[0];
                    }
                } finally {
                }
            }
        }
        return f5889b;
    }

    /* renamed from: a */
    public final C1728ak m3623a() {
        this.f5890a = C1753bk.m3677b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C1753bk[] c1753bkArr = this.f5890a;
        if (c1753bkArr != null && c1753bkArr.length > 0) {
            int r12 = 0;
            while (true) {
                C1753bk[] c1753bkArr2 = this.f5890a;
                if (r12 >= c1753bkArr2.length) {
                    break;
                }
                C1753bk c1753bk = c1753bkArr2[r12];
                if (c1753bk != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c1753bk) + computeSerializedSize;
                }
                r12++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        C1753bk[] c1753bkArr = this.f5890a;
        if (c1753bkArr != null && c1753bkArr.length > 0) {
            int r02 = 0;
            while (true) {
                C1753bk[] c1753bkArr2 = this.f5890a;
                if (r02 >= c1753bkArr2.length) {
                    break;
                }
                C1753bk c1753bk = c1753bkArr2[r02];
                if (c1753bk != null) {
                    codedOutputByteBufferNano.writeMessage(1, c1753bk);
                }
                r02++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1728ak mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
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
                C1753bk[] c1753bkArr = this.f5890a;
                int length = c1753bkArr == null ? 0 : c1753bkArr.length;
                int r02 = repeatedFieldArrayLength + length;
                C1753bk[] c1753bkArr2 = new C1753bk[r02];
                if (length != 0) {
                    System.arraycopy(c1753bkArr, 0, c1753bkArr2, 0, length);
                }
                while (length < r02 - 1) {
                    C1753bk c1753bk = new C1753bk();
                    c1753bkArr2[length] = c1753bk;
                    codedInputByteBufferNano.readMessage(c1753bk);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C1753bk c1753bk2 = new C1753bk();
                c1753bkArr2[length] = c1753bk2;
                codedInputByteBufferNano.readMessage(c1753bk2);
                this.f5890a = c1753bkArr2;
            }
        }
    }

    /* renamed from: b */
    public static C1728ak m3621b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1728ak().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C1728ak m3620a(byte[] bArr) {
        return (C1728ak) MessageNano.mergeFrom(new C1728ak(), bArr);
    }
}
