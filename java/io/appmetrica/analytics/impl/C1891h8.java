package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.h8 */
/* loaded from: classes.dex */
public final class C1891h8 extends MessageNano {

    /* renamed from: c */
    public static volatile C1891h8[] f6383c;

    /* renamed from: a */
    public long f6384a;

    /* renamed from: b */
    public int f6385b;

    public C1891h8() {
        m3933a();
    }

    /* renamed from: b */
    public static C1891h8[] m3932b() {
        if (f6383c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6383c == null) {
                        f6383c = new C1891h8[0];
                    }
                } finally {
                }
            }
        }
        return f6383c;
    }

    /* renamed from: a */
    public final C1891h8 m3933a() {
        this.f6384a = 0L;
        this.f6385b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j2 = this.f6384a;
        if (j2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j2);
        }
        int r12 = this.f6385b;
        return r12 != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(2, r12) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        long j2 = this.f6384a;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeInt64(1, j2);
        }
        int r02 = this.f6385b;
        if (r02 != 0) {
            codedOutputByteBufferNano.writeInt32(2, r02);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1891h8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f6384a = codedInputByteBufferNano.readInt64();
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f6385b = codedInputByteBufferNano.readInt32();
            }
        }
    }

    /* renamed from: b */
    public static C1891h8 m3931b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1891h8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C1891h8 m3930a(byte[] bArr) {
        return (C1891h8) MessageNano.mergeFrom(new C1891h8(), bArr);
    }
}
