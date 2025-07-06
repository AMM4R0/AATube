package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.b2 */
/* loaded from: classes.dex */
public final class C1735b2 extends MessageNano {

    /* renamed from: c */
    public static volatile C1735b2[] f5901c;

    /* renamed from: a */
    public String f5902a;

    /* renamed from: b */
    public boolean f5903b;

    public C1735b2() {
        m3636a();
    }

    /* renamed from: b */
    public static C1735b2[] m3635b() {
        if (f5901c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5901c == null) {
                        f5901c = new C1735b2[0];
                    }
                } finally {
                }
            }
        }
        return f5901c;
    }

    /* renamed from: a */
    public final C1735b2 m3636a() {
        this.f5902a = "";
        this.f5903b = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeBoolSize(2, this.f5903b) + CodedOutputByteBufferNano.computeStringSize(1, this.f5902a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeString(1, this.f5902a);
        codedOutputByteBufferNano.writeBool(2, this.f5903b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1735b2 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f5902a = codedInputByteBufferNano.readString();
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f5903b = codedInputByteBufferNano.readBool();
            }
        }
    }

    /* renamed from: b */
    public static C1735b2 m3634b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1735b2().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C1735b2 m3633a(byte[] bArr) {
        return (C1735b2) MessageNano.mergeFrom(new C1735b2(), bArr);
    }
}
