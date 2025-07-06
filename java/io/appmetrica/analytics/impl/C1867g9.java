package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.g9 */
/* loaded from: classes.dex */
public final class C1867g9 extends MessageNano {

    /* renamed from: d */
    public static final int f6305d = 0;

    /* renamed from: e */
    public static final int f6306e = 1;

    /* renamed from: f */
    public static final int f6307f = 2;

    /* renamed from: g */
    public static volatile C1867g9[] f6308g;

    /* renamed from: a */
    public C1942j9 f6309a;

    /* renamed from: b */
    public String f6310b;

    /* renamed from: c */
    public int f6311c;

    public C1867g9() {
        m3867a();
    }

    /* renamed from: b */
    public static C1867g9[] m3866b() {
        if (f6308g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6308g == null) {
                        f6308g = new C1867g9[0];
                    }
                } finally {
                }
            }
        }
        return f6308g;
    }

    /* renamed from: a */
    public final C1867g9 m3867a() {
        this.f6309a = null;
        this.f6310b = "";
        this.f6311c = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C1942j9 c1942j9 = this.f6309a;
        if (c1942j9 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c1942j9);
        }
        int computeStringSize = CodedOutputByteBufferNano.computeStringSize(2, this.f6310b) + computeSerializedSize;
        int r02 = this.f6311c;
        return r02 != 0 ? computeStringSize + CodedOutputByteBufferNano.computeInt32Size(5, r02) : computeStringSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        C1942j9 c1942j9 = this.f6309a;
        if (c1942j9 != null) {
            codedOutputByteBufferNano.writeMessage(1, c1942j9);
        }
        codedOutputByteBufferNano.writeString(2, this.f6310b);
        int r02 = this.f6311c;
        if (r02 != 0) {
            codedOutputByteBufferNano.writeInt32(5, r02);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1867g9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                if (this.f6309a == null) {
                    this.f6309a = new C1942j9();
                }
                codedInputByteBufferNano.readMessage(this.f6309a);
            } else if (readTag == 18) {
                this.f6310b = codedInputByteBufferNano.readString();
            } else if (readTag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                    this.f6311c = readInt32;
                }
            }
        }
    }

    /* renamed from: b */
    public static C1867g9 m3865b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1867g9().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C1867g9 m3864a(byte[] bArr) {
        return (C1867g9) MessageNano.mergeFrom(new C1867g9(), bArr);
    }
}
