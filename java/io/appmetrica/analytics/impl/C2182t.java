package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.t */
/* loaded from: classes.dex */
public final class C2182t extends MessageNano {

    /* renamed from: c */
    public static volatile C2182t[] f7140c;

    /* renamed from: a */
    public long f7141a;

    /* renamed from: b */
    public int f7142b;

    public C2182t() {
        m4432a();
    }

    /* renamed from: b */
    public static C2182t[] m4431b() {
        if (f7140c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7140c == null) {
                        f7140c = new C2182t[0];
                    }
                } finally {
                }
            }
        }
        return f7140c;
    }

    /* renamed from: a */
    public final C2182t m4432a() {
        this.f7141a = 0L;
        this.f7142b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j2 = this.f7141a;
        if (j2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j2);
        }
        int r12 = this.f7142b;
        return r12 != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(2, r12) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        long j2 = this.f7141a;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeInt64(1, j2);
        }
        int r02 = this.f7142b;
        if (r02 != 0) {
            codedOutputByteBufferNano.writeInt32(2, r02);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2182t mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f7141a = codedInputByteBufferNano.readInt64();
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f7142b = codedInputByteBufferNano.readInt32();
            }
        }
    }

    /* renamed from: b */
    public static C2182t m4430b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C2182t().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C2182t m4429a(byte[] bArr) {
        return (C2182t) MessageNano.mergeFrom(new C2182t(), bArr);
    }
}
