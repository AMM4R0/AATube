package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.o9 */
/* loaded from: classes.dex */
public final class C2067o9 extends MessageNano {

    /* renamed from: b */
    public static volatile C2067o9[] f6852b;

    /* renamed from: a */
    public byte[] f6853a;

    public C2067o9() {
        m4262a();
    }

    /* renamed from: b */
    public static C2067o9[] m4261b() {
        if (f6852b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6852b == null) {
                        f6852b = new C2067o9[0];
                    }
                } finally {
                }
            }
        }
        return f6852b;
    }

    /* renamed from: a */
    public final C2067o9 m4262a() {
        this.f6853a = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        return !Arrays.equals(this.f6853a, WireFormatNano.EMPTY_BYTES) ? computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(1, this.f6853a) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!Arrays.equals(this.f6853a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f6853a);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2067o9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
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
                this.f6853a = codedInputByteBufferNano.readBytes();
            }
        }
    }

    /* renamed from: a */
    public static C2067o9 m4259a(byte[] bArr) {
        return (C2067o9) MessageNano.mergeFrom(new C2067o9(), bArr);
    }

    /* renamed from: b */
    public static C2067o9 m4260b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C2067o9().mergeFrom(codedInputByteBufferNano);
    }
}
