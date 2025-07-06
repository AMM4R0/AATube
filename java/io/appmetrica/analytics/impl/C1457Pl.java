package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.Pl */
/* loaded from: classes.dex */
public final class C1457Pl extends MessageNano {

    /* renamed from: b */
    public static volatile C1457Pl[] f5233b;

    /* renamed from: a */
    public int f5234a;

    public C1457Pl() {
        m3216a();
    }

    /* renamed from: b */
    public static C1457Pl[] m3215b() {
        if (f5233b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5233b == null) {
                        f5233b = new C1457Pl[0];
                    }
                } finally {
                }
            }
        }
        return f5233b;
    }

    /* renamed from: a */
    public final C1457Pl m3216a() {
        this.f5234a = 86400;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int r12 = this.f5234a;
        return r12 != 86400 ? computeSerializedSize + CodedOutputByteBufferNano.computeUInt32Size(1, r12) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int r02 = this.f5234a;
        if (r02 != 86400) {
            codedOutputByteBufferNano.writeUInt32(1, r02);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1457Pl mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
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
                this.f5234a = codedInputByteBufferNano.readUInt32();
            }
        }
    }

    /* renamed from: a */
    public static C1457Pl m3213a(byte[] bArr) {
        return (C1457Pl) MessageNano.mergeFrom(new C1457Pl(), bArr);
    }

    /* renamed from: b */
    public static C1457Pl m3214b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1457Pl().mergeFrom(codedInputByteBufferNano);
    }
}
