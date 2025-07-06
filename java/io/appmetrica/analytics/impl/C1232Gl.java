package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.Gl */
/* loaded from: classes.dex */
public final class C1232Gl extends MessageNano {

    /* renamed from: c */
    public static volatile C1232Gl[] f4804c;

    /* renamed from: a */
    public String f4805a;

    /* renamed from: b */
    public C1207Fl f4806b;

    public C1232Gl() {
        m2920a();
    }

    /* renamed from: b */
    public static C1232Gl[] m2919b() {
        if (f4804c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f4804c == null) {
                        f4804c = new C1232Gl[0];
                    }
                } finally {
                }
            }
        }
        return f4804c;
    }

    /* renamed from: a */
    public final C1232Gl m2920a() {
        this.f4805a = "";
        this.f4806b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f4805a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f4805a);
        }
        C1207Fl c1207Fl = this.f4806b;
        return c1207Fl != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, c1207Fl) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f4805a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f4805a);
        }
        C1207Fl c1207Fl = this.f4806b;
        if (c1207Fl != null) {
            codedOutputByteBufferNano.writeMessage(2, c1207Fl);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1232Gl mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f4805a = codedInputByteBufferNano.readString();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f4806b == null) {
                    this.f4806b = new C1207Fl();
                }
                codedInputByteBufferNano.readMessage(this.f4806b);
            }
        }
    }

    /* renamed from: b */
    public static C1232Gl m2918b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1232Gl().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C1232Gl m2917a(byte[] bArr) {
        return (C1232Gl) MessageNano.mergeFrom(new C1232Gl(), bArr);
    }
}
