package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.Ol */
/* loaded from: classes.dex */
public final class C1432Ol extends MessageNano {

    /* renamed from: c */
    public static volatile C1432Ol[] f5188c;

    /* renamed from: a */
    public long f5189a;

    /* renamed from: b */
    public long f5190b;

    public C1432Ol() {
        m3189a();
    }

    /* renamed from: b */
    public static C1432Ol[] m3188b() {
        if (f5188c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5188c == null) {
                        f5188c = new C1432Ol[0];
                    }
                } finally {
                }
            }
        }
        return f5188c;
    }

    /* renamed from: a */
    public final C1432Ol m3189a() {
        this.f5189a = 86400L;
        this.f5190b = 432000L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeInt64Size(2, this.f5190b) + CodedOutputByteBufferNano.computeInt64Size(1, this.f5189a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeInt64(1, this.f5189a);
        codedOutputByteBufferNano.writeInt64(2, this.f5190b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1432Ol mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f5189a = codedInputByteBufferNano.readInt64();
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f5190b = codedInputByteBufferNano.readInt64();
            }
        }
    }

    /* renamed from: b */
    public static C1432Ol m3187b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1432Ol().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C1432Ol m3186a(byte[] bArr) {
        return (C1432Ol) MessageNano.mergeFrom(new C1432Ol(), bArr);
    }
}
