package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.xf */
/* loaded from: classes.dex */
public final class C2298xf extends MessageNano {

    /* renamed from: e */
    public static final int f7450e = 0;

    /* renamed from: f */
    public static final int f7451f = 1;

    /* renamed from: g */
    public static final int f7452g = 2;

    /* renamed from: h */
    public static volatile C2298xf[] f7453h;

    /* renamed from: a */
    public byte[] f7454a;

    /* renamed from: b */
    public long f7455b;

    /* renamed from: c */
    public long f7456c;

    /* renamed from: d */
    public int f7457d;

    public C2298xf() {
        m4630a();
    }

    /* renamed from: b */
    public static C2298xf[] m4629b() {
        if (f7453h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7453h == null) {
                        f7453h = new C2298xf[0];
                    }
                } finally {
                }
            }
        }
        return f7453h;
    }

    /* renamed from: a */
    public final C2298xf m4630a() {
        this.f7454a = WireFormatNano.EMPTY_BYTES;
        this.f7455b = 0L;
        this.f7456c = 0L;
        this.f7457d = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeBytesSize = CodedOutputByteBufferNano.computeBytesSize(1, this.f7454a) + super.computeSerializedSize();
        long j2 = this.f7455b;
        if (j2 != 0) {
            computeBytesSize += CodedOutputByteBufferNano.computeUInt64Size(2, j2);
        }
        long j3 = this.f7456c;
        if (j3 != 0) {
            computeBytesSize += CodedOutputByteBufferNano.computeUInt64Size(3, j3);
        }
        int r02 = this.f7457d;
        return r02 != 0 ? computeBytesSize + CodedOutputByteBufferNano.computeInt32Size(4, r02) : computeBytesSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeBytes(1, this.f7454a);
        long j2 = this.f7455b;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeUInt64(2, j2);
        }
        long j3 = this.f7456c;
        if (j3 != 0) {
            codedOutputByteBufferNano.writeUInt64(3, j3);
        }
        int r02 = this.f7457d;
        if (r02 != 0) {
            codedOutputByteBufferNano.writeInt32(4, r02);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2298xf mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f7454a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 16) {
                this.f7455b = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 24) {
                this.f7456c = codedInputByteBufferNano.readUInt64();
            } else if (readTag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                    this.f7457d = readInt32;
                }
            }
        }
    }

    /* renamed from: b */
    public static C2298xf m4628b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C2298xf().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C2298xf m4627a(byte[] bArr) {
        return (C2298xf) MessageNano.mergeFrom(new C2298xf(), bArr);
    }
}
