package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.p8 */
/* loaded from: classes.dex */
public final class C2091p8 extends MessageNano {

    /* renamed from: b */
    public static volatile C2091p8[] f6901b;

    /* renamed from: a */
    public byte[] f6902a;

    public C2091p8() {
        m4283a();
    }

    /* renamed from: b */
    public static C2091p8[] m4282b() {
        if (f6901b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6901b == null) {
                        f6901b = new C2091p8[0];
                    }
                } finally {
                }
            }
        }
        return f6901b;
    }

    /* renamed from: a */
    public final C2091p8 m4283a() {
        this.f6902a = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        return !Arrays.equals(this.f6902a, WireFormatNano.EMPTY_BYTES) ? computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(1, this.f6902a) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!Arrays.equals(this.f6902a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f6902a);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2091p8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
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
                this.f6902a = codedInputByteBufferNano.readBytes();
            }
        }
    }

    /* renamed from: a */
    public static C2091p8 m4280a(byte[] bArr) {
        return (C2091p8) MessageNano.mergeFrom(new C2091p8(), bArr);
    }

    /* renamed from: b */
    public static C2091p8 m4281b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C2091p8().mergeFrom(codedInputByteBufferNano);
    }
}
