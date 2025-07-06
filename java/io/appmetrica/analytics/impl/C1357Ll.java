package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.Ll */
/* loaded from: classes.dex */
public final class C1357Ll extends MessageNano {

    /* renamed from: b */
    public static volatile C1357Ll[] f5015b;

    /* renamed from: a */
    public long f5016a;

    public C1357Ll() {
        m3065a();
    }

    /* renamed from: b */
    public static C1357Ll[] m3064b() {
        if (f5015b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5015b == null) {
                        f5015b = new C1357Ll[0];
                    }
                } finally {
                }
            }
        }
        return f5015b;
    }

    /* renamed from: a */
    public final C1357Ll m3065a() {
        this.f5016a = 864000000L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j2 = this.f5016a;
        return j2 != 864000000 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt64Size(1, j2) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        long j2 = this.f5016a;
        if (j2 != 864000000) {
            codedOutputByteBufferNano.writeInt64(1, j2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1357Ll mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
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
                this.f5016a = codedInputByteBufferNano.readInt64();
            }
        }
    }

    /* renamed from: a */
    public static C1357Ll m3062a(byte[] bArr) {
        return (C1357Ll) MessageNano.mergeFrom(new C1357Ll(), bArr);
    }

    /* renamed from: b */
    public static C1357Ll m3063b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1357Ll().mergeFrom(codedInputByteBufferNano);
    }
}
