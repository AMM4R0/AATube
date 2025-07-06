package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.Ml */
/* loaded from: classes.dex */
public final class C1382Ml extends MessageNano {

    /* renamed from: g */
    public static volatile C1382Ml[] f5085g;

    /* renamed from: a */
    public boolean f5086a;

    /* renamed from: b */
    public boolean f5087b;

    /* renamed from: c */
    public boolean f5088c;

    /* renamed from: d */
    public boolean f5089d;

    /* renamed from: e */
    public boolean f5090e;

    /* renamed from: f */
    public int f5091f;

    public C1382Ml() {
        m3103a();
    }

    /* renamed from: b */
    public static C1382Ml[] m3102b() {
        if (f5085g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5085g == null) {
                        f5085g = new C1382Ml[0];
                    }
                } finally {
                }
            }
        }
        return f5085g;
    }

    /* renamed from: a */
    public final C1382Ml m3103a() {
        this.f5086a = false;
        this.f5087b = false;
        this.f5088c = false;
        this.f5089d = false;
        this.f5090e = false;
        this.f5091f = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeBoolSize = CodedOutputByteBufferNano.computeBoolSize(4, this.f5089d) + CodedOutputByteBufferNano.computeBoolSize(3, this.f5088c) + CodedOutputByteBufferNano.computeBoolSize(2, this.f5087b) + CodedOutputByteBufferNano.computeBoolSize(1, this.f5086a) + super.computeSerializedSize();
        boolean z2 = this.f5090e;
        if (z2) {
            computeBoolSize += CodedOutputByteBufferNano.computeBoolSize(5, z2);
        }
        int r12 = this.f5091f;
        return r12 != -1 ? computeBoolSize + CodedOutputByteBufferNano.computeInt32Size(6, r12) : computeBoolSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeBool(1, this.f5086a);
        codedOutputByteBufferNano.writeBool(2, this.f5087b);
        codedOutputByteBufferNano.writeBool(3, this.f5088c);
        codedOutputByteBufferNano.writeBool(4, this.f5089d);
        boolean z2 = this.f5090e;
        if (z2) {
            codedOutputByteBufferNano.writeBool(5, z2);
        }
        int r02 = this.f5091f;
        if (r02 != -1) {
            codedOutputByteBufferNano.writeInt32(6, r02);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    /* renamed from: b */
    public static C1382Ml m3101b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1382Ml().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1382Ml mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f5086a = codedInputByteBufferNano.readBool();
            } else if (readTag == 16) {
                this.f5087b = codedInputByteBufferNano.readBool();
            } else if (readTag == 24) {
                this.f5088c = codedInputByteBufferNano.readBool();
            } else if (readTag == 32) {
                this.f5089d = codedInputByteBufferNano.readBool();
            } else if (readTag == 40) {
                this.f5090e = codedInputByteBufferNano.readBool();
            } else if (readTag != 48) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == -1 || readInt32 == 0 || readInt32 == 1) {
                    this.f5091f = readInt32;
                }
            }
        }
    }

    /* renamed from: a */
    public static C1382Ml m3100a(byte[] bArr) {
        return (C1382Ml) MessageNano.mergeFrom(new C1382Ml(), bArr);
    }
}
