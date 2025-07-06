package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.V3 */
/* loaded from: classes.dex */
public final class C1588V3 extends MessageNano {

    /* renamed from: c */
    public static volatile C1588V3[] f5557c;

    /* renamed from: a */
    public C1638X3 f5558a;

    /* renamed from: b */
    public int f5559b;

    public C1588V3() {
        m3406a();
    }

    /* renamed from: b */
    public static C1588V3[] m3405b() {
        if (f5557c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5557c == null) {
                        f5557c = new C1588V3[0];
                    }
                } finally {
                }
            }
        }
        return f5557c;
    }

    /* renamed from: a */
    public final C1588V3 m3406a() {
        this.f5558a = null;
        this.f5559b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C1638X3 c1638x3 = this.f5558a;
        if (c1638x3 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c1638x3);
        }
        int r12 = this.f5559b;
        return r12 != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(2, r12) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        C1638X3 c1638x3 = this.f5558a;
        if (c1638x3 != null) {
            codedOutputByteBufferNano.writeMessage(1, c1638x3);
        }
        int r02 = this.f5559b;
        if (r02 != 0) {
            codedOutputByteBufferNano.writeInt32(2, r02);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1588V3 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                if (this.f5558a == null) {
                    this.f5558a = new C1638X3();
                }
                codedInputByteBufferNano.readMessage(this.f5558a);
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3) {
                    this.f5559b = readInt32;
                }
            }
        }
    }

    /* renamed from: b */
    public static C1588V3 m3404b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1588V3().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C1588V3 m3403a(byte[] bArr) {
        return (C1588V3) MessageNano.mergeFrom(new C1588V3(), bArr);
    }
}
