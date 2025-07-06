package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.Ql */
/* loaded from: classes.dex */
public final class C1482Ql extends MessageNano {

    /* renamed from: b */
    public static volatile C1482Ql[] f5262b;

    /* renamed from: a */
    public long f5263a;

    public C1482Ql() {
        m3242a();
    }

    /* renamed from: b */
    public static C1482Ql[] m3241b() {
        if (f5262b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5262b == null) {
                        f5262b = new C1482Ql[0];
                    }
                } finally {
                }
            }
        }
        return f5262b;
    }

    /* renamed from: a */
    public final C1482Ql m3242a() {
        this.f5263a = 18000000L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeInt64Size(1, this.f5263a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeInt64(1, this.f5263a);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1482Ql mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
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
                this.f5263a = codedInputByteBufferNano.readInt64();
            }
        }
    }

    /* renamed from: a */
    public static C1482Ql m3239a(byte[] bArr) {
        return (C1482Ql) MessageNano.mergeFrom(new C1482Ql(), bArr);
    }

    /* renamed from: b */
    public static C1482Ql m3240b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1482Ql().mergeFrom(codedInputByteBufferNano);
    }
}
