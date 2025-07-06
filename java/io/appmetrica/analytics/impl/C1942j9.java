package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.j9 */
/* loaded from: classes.dex */
public final class C1942j9 extends MessageNano {

    /* renamed from: e */
    public static volatile C1942j9[] f6531e;

    /* renamed from: a */
    public long f6532a;

    /* renamed from: b */
    public int f6533b;

    /* renamed from: c */
    public long f6534c;

    /* renamed from: d */
    public boolean f6535d;

    public C1942j9() {
        m4035a();
    }

    /* renamed from: b */
    public static C1942j9[] m4034b() {
        if (f6531e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6531e == null) {
                        f6531e = new C1942j9[0];
                    }
                } finally {
                }
            }
        }
        return f6531e;
    }

    /* renamed from: a */
    public final C1942j9 m4035a() {
        this.f6532a = 0L;
        this.f6533b = 0;
        this.f6534c = 0L;
        this.f6535d = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSInt32Size = CodedOutputByteBufferNano.computeSInt32Size(2, this.f6533b) + CodedOutputByteBufferNano.computeUInt64Size(1, this.f6532a) + super.computeSerializedSize();
        long j2 = this.f6534c;
        if (j2 != 0) {
            computeSInt32Size += CodedOutputByteBufferNano.computeInt64Size(3, j2);
        }
        boolean z2 = this.f6535d;
        return z2 ? computeSInt32Size + CodedOutputByteBufferNano.computeBoolSize(4, z2) : computeSInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeUInt64(1, this.f6532a);
        codedOutputByteBufferNano.writeSInt32(2, this.f6533b);
        long j2 = this.f6534c;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeInt64(3, j2);
        }
        boolean z2 = this.f6535d;
        if (z2) {
            codedOutputByteBufferNano.writeBool(4, z2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1942j9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f6532a = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 16) {
                this.f6533b = codedInputByteBufferNano.readSInt32();
            } else if (readTag == 24) {
                this.f6534c = codedInputByteBufferNano.readInt64();
            } else if (readTag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f6535d = codedInputByteBufferNano.readBool();
            }
        }
    }

    /* renamed from: b */
    public static C1942j9 m4033b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1942j9().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C1942j9 m4032a(byte[] bArr) {
        return (C1942j9) MessageNano.mergeFrom(new C1942j9(), bArr);
    }
}
