package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.vb */
/* loaded from: classes.dex */
public final class C2244vb extends MessageNano {

    /* renamed from: f */
    public static volatile C2244vb[] f7290f;

    /* renamed from: a */
    public String f7291a;

    /* renamed from: b */
    public String f7292b;

    /* renamed from: c */
    public boolean f7293c;

    /* renamed from: d */
    public String f7294d;

    /* renamed from: e */
    public String f7295e;

    public C2244vb() {
        m4519a();
    }

    /* renamed from: b */
    public static C2244vb[] m4518b() {
        if (f7290f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7290f == null) {
                        f7290f = new C2244vb[0];
                    }
                } finally {
                }
            }
        }
        return f7290f;
    }

    /* renamed from: a */
    public final C2244vb m4519a() {
        this.f7291a = "";
        this.f7292b = "";
        this.f7293c = false;
        this.f7294d = "";
        this.f7295e = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f7291a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f7291a);
        }
        if (!this.f7292b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(19, this.f7292b);
        }
        boolean z2 = this.f7293c;
        if (z2) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(22, z2);
        }
        if (!this.f7294d.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(25, this.f7294d);
        }
        return !this.f7295e.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(26, this.f7295e) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f7291a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f7291a);
        }
        if (!this.f7292b.equals("")) {
            codedOutputByteBufferNano.writeString(19, this.f7292b);
        }
        boolean z2 = this.f7293c;
        if (z2) {
            codedOutputByteBufferNano.writeBool(22, z2);
        }
        if (!this.f7294d.equals("")) {
            codedOutputByteBufferNano.writeString(25, this.f7294d);
        }
        if (!this.f7295e.equals("")) {
            codedOutputByteBufferNano.writeString(26, this.f7295e);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    /* renamed from: b */
    public static C2244vb m4517b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C2244vb().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2244vb mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f7291a = codedInputByteBufferNano.readString();
            } else if (readTag == 154) {
                this.f7292b = codedInputByteBufferNano.readString();
            } else if (readTag == 176) {
                this.f7293c = codedInputByteBufferNano.readBool();
            } else if (readTag == 202) {
                this.f7294d = codedInputByteBufferNano.readString();
            } else if (readTag != 210) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f7295e = codedInputByteBufferNano.readString();
            }
        }
    }

    /* renamed from: a */
    public static C2244vb m4516a(byte[] bArr) {
        return (C2244vb) MessageNano.mergeFrom(new C2244vb(), bArr);
    }
}
