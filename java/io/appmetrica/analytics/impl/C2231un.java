package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.un */
/* loaded from: classes.dex */
public final class C2231un extends MessageNano {

    /* renamed from: c */
    public static volatile C2231un[] f7242c;

    /* renamed from: a */
    public boolean f7243a;

    /* renamed from: b */
    public boolean f7244b;

    public C2231un() {
        m4506a();
    }

    /* renamed from: b */
    public static C2231un[] m4505b() {
        if (f7242c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7242c == null) {
                        f7242c = new C2231un[0];
                    }
                } finally {
                }
            }
        }
        return f7242c;
    }

    /* renamed from: a */
    public final C2231un m4506a() {
        this.f7243a = false;
        this.f7244b = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        boolean z2 = this.f7243a;
        if (z2) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z2);
        }
        boolean z3 = this.f7244b;
        return z3 ? computeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(2, z3) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        boolean z2 = this.f7243a;
        if (z2) {
            codedOutputByteBufferNano.writeBool(1, z2);
        }
        boolean z3 = this.f7244b;
        if (z3) {
            codedOutputByteBufferNano.writeBool(2, z3);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2231un mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f7243a = codedInputByteBufferNano.readBool();
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f7244b = codedInputByteBufferNano.readBool();
            }
        }
    }

    /* renamed from: b */
    public static C2231un m4504b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C2231un().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C2231un m4503a(byte[] bArr) {
        return (C2231un) MessageNano.mergeFrom(new C2231un(), bArr);
    }
}
