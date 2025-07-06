package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.k8 */
/* loaded from: classes.dex */
public final class C1966k8 extends MessageNano {

    /* renamed from: b */
    public static volatile C1966k8[] f6567b;

    /* renamed from: a */
    public C1916i8 f6568a;

    public C1966k8() {
        m4046a();
    }

    /* renamed from: b */
    public static C1966k8[] m4045b() {
        if (f6567b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6567b == null) {
                        f6567b = new C1966k8[0];
                    }
                } finally {
                }
            }
        }
        return f6567b;
    }

    /* renamed from: a */
    public final C1966k8 m4046a() {
        this.f6568a = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C1916i8 c1916i8 = this.f6568a;
        return c1916i8 != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(1, c1916i8) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        C1916i8 c1916i8 = this.f6568a;
        if (c1916i8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c1916i8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1966k8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
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
                if (this.f6568a == null) {
                    this.f6568a = new C1916i8();
                }
                codedInputByteBufferNano.readMessage(this.f6568a);
            }
        }
    }

    /* renamed from: b */
    public static C1966k8 m4044b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1966k8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C1966k8 m4043a(byte[] bArr) {
        return (C1966k8) MessageNano.mergeFrom(new C1966k8(), bArr);
    }
}
