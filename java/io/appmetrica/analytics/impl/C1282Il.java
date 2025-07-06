package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.Il */
/* loaded from: classes.dex */
public final class C1282Il extends MessageNano {

    /* renamed from: c */
    public static volatile C1282Il[] f4882c;

    /* renamed from: a */
    public int f4883a;

    /* renamed from: b */
    public int f4884b;

    public C1282Il() {
        m2973a();
    }

    /* renamed from: b */
    public static C1282Il[] m2972b() {
        if (f4882c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f4882c == null) {
                        f4882c = new C1282Il[0];
                    }
                } finally {
                }
            }
        }
        return f4882c;
    }

    /* renamed from: a */
    public final C1282Il m2973a() {
        this.f4883a = 86400;
        this.f4884b = 86400;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int r12 = this.f4883a;
        if (r12 != 86400) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, r12);
        }
        int r13 = this.f4884b;
        return r13 != 86400 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(2, r13) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int r02 = this.f4883a;
        if (r02 != 86400) {
            codedOutputByteBufferNano.writeInt32(1, r02);
        }
        int r03 = this.f4884b;
        if (r03 != 86400) {
            codedOutputByteBufferNano.writeInt32(2, r03);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1282Il mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f4883a = codedInputByteBufferNano.readInt32();
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f4884b = codedInputByteBufferNano.readInt32();
            }
        }
    }

    /* renamed from: b */
    public static C1282Il m2971b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1282Il().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C1282Il m2970a(byte[] bArr) {
        return (C1282Il) MessageNano.mergeFrom(new C1282Il(), bArr);
    }
}
