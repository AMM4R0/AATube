package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.Jl */
/* loaded from: classes.dex */
public final class C1307Jl extends MessageNano {

    /* renamed from: b */
    public static volatile C1307Jl[] f4931b;

    /* renamed from: a */
    public long f4932a;

    public C1307Jl() {
        m2997a();
    }

    /* renamed from: b */
    public static C1307Jl[] m2996b() {
        if (f4931b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f4931b == null) {
                        f4931b = new C1307Jl[0];
                    }
                } finally {
                }
            }
        }
        return f4931b;
    }

    /* renamed from: a */
    public final C1307Jl m2997a() {
        this.f4932a = 10000L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j2 = this.f4932a;
        return j2 != 10000 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt64Size(1, j2) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        long j2 = this.f4932a;
        if (j2 != 10000) {
            codedOutputByteBufferNano.writeInt64(1, j2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1307Jl mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag != 8) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f4932a = codedInputByteBufferNano.readInt64();
            }
        }
    }

    /* renamed from: a */
    public static C1307Jl m2994a(byte[] bArr) {
        return (C1307Jl) MessageNano.mergeFrom(new C1307Jl(), bArr);
    }

    /* renamed from: b */
    public static C1307Jl m2995b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1307Jl().mergeFrom(codedInputByteBufferNano);
    }
}
