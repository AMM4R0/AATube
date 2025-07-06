package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.b9 */
/* loaded from: classes.dex */
public final class C1742b9 extends MessageNano {

    /* renamed from: c */
    public static volatile C1742b9[] f5913c;

    /* renamed from: a */
    public String f5914a;

    /* renamed from: b */
    public long f5915b;

    public C1742b9() {
        m3647a();
    }

    /* renamed from: b */
    public static C1742b9[] m3646b() {
        if (f5913c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5913c == null) {
                        f5913c = new C1742b9[0];
                    }
                } finally {
                }
            }
        }
        return f5913c;
    }

    /* renamed from: a */
    public final C1742b9 m3647a() {
        this.f5914a = "";
        this.f5915b = 0L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeUInt64Size(2, this.f5915b) + CodedOutputByteBufferNano.computeStringSize(1, this.f5914a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeString(1, this.f5914a);
        codedOutputByteBufferNano.writeUInt64(2, this.f5915b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1742b9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f5914a = codedInputByteBufferNano.readString();
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f5915b = codedInputByteBufferNano.readUInt64();
            }
        }
    }

    /* renamed from: b */
    public static C1742b9 m3645b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1742b9().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C1742b9 m3644a(byte[] bArr) {
        return (C1742b9) MessageNano.mergeFrom(new C1742b9(), bArr);
    }
}
