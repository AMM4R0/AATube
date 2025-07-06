package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.s7 */
/* loaded from: classes.dex */
public final class C2165s7 extends MessageNano {

    /* renamed from: d */
    public static volatile C2165s7[] f7117d;

    /* renamed from: a */
    public long f7118a;

    /* renamed from: b */
    public long f7119b;

    /* renamed from: c */
    public int f7120c;

    public C2165s7() {
        m4416a();
    }

    /* renamed from: b */
    public static C2165s7[] m4415b() {
        if (f7117d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7117d == null) {
                        f7117d = new C2165s7[0];
                    }
                } finally {
                }
            }
        }
        return f7117d;
    }

    /* renamed from: a */
    public final C2165s7 m4416a() {
        this.f7118a = -1L;
        this.f7119b = -1L;
        this.f7120c = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j2 = this.f7118a;
        if (j2 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j2);
        }
        long j3 = this.f7119b;
        if (j3 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(2, j3);
        }
        int r12 = this.f7120c;
        return r12 != -1 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(3, r12) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        long j2 = this.f7118a;
        if (j2 != -1) {
            codedOutputByteBufferNano.writeInt64(1, j2);
        }
        long j3 = this.f7119b;
        if (j3 != -1) {
            codedOutputByteBufferNano.writeInt64(2, j3);
        }
        int r02 = this.f7120c;
        if (r02 != -1) {
            codedOutputByteBufferNano.writeInt32(3, r02);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2165s7 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f7118a = codedInputByteBufferNano.readInt64();
            } else if (readTag == 16) {
                this.f7119b = codedInputByteBufferNano.readInt64();
            } else if (readTag != 24) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == -1 || readInt32 == 0 || readInt32 == 1) {
                    this.f7120c = readInt32;
                }
            }
        }
    }

    /* renamed from: b */
    public static C2165s7 m4414b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C2165s7().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C2165s7 m4413a(byte[] bArr) {
        return (C2165s7) MessageNano.mergeFrom(new C2165s7(), bArr);
    }
}
