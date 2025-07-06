package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.Fl */
/* loaded from: classes.dex */
public final class C1207Fl extends MessageNano {

    /* renamed from: b */
    public static volatile C1207Fl[] f4744b;

    /* renamed from: a */
    public String f4745a;

    public C1207Fl() {
        m2881a();
    }

    /* renamed from: b */
    public static C1207Fl[] m2880b() {
        if (f4744b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f4744b == null) {
                        f4744b = new C1207Fl[0];
                    }
                } finally {
                }
            }
        }
        return f4744b;
    }

    /* renamed from: a */
    public final C1207Fl m2881a() {
        this.f4745a = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        return !this.f4745a.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(1, this.f4745a) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f4745a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f4745a);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1207Fl mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag != 10) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f4745a = codedInputByteBufferNano.readString();
            }
        }
    }

    /* renamed from: a */
    public static C1207Fl m2878a(byte[] bArr) {
        return (C1207Fl) MessageNano.mergeFrom(new C1207Fl(), bArr);
    }

    /* renamed from: b */
    public static C1207Fl m2879b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1207Fl().mergeFrom(codedInputByteBufferNano);
    }
}
