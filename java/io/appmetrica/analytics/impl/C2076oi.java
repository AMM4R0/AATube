package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.oi */
/* loaded from: classes.dex */
public final class C2076oi extends MessageNano {

    /* renamed from: f */
    public static final int f6864f = 0;

    /* renamed from: g */
    public static final int f6865g = 1;

    /* renamed from: h */
    public static final int f6866h = 2;

    /* renamed from: i */
    public static volatile C2076oi[] f6867i;

    /* renamed from: a */
    public byte[] f6868a;

    /* renamed from: b */
    public long f6869b;

    /* renamed from: c */
    public int f6870c;

    /* renamed from: d */
    public byte[] f6871d;

    /* renamed from: e */
    public long f6872e;

    public C2076oi() {
        m4273a();
    }

    /* renamed from: b */
    public static C2076oi[] m4272b() {
        if (f6867i == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6867i == null) {
                        f6867i = new C2076oi[0];
                    }
                } finally {
                }
            }
        }
        return f6867i;
    }

    /* renamed from: a */
    public final C2076oi m4273a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f6868a = bArr;
        this.f6869b = 0L;
        this.f6870c = 0;
        this.f6871d = bArr;
        this.f6872e = 0L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f6868a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f6868a);
        }
        long j2 = this.f6869b;
        if (j2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(2, j2);
        }
        int r12 = this.f6870c;
        if (r12 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(3, r12);
        }
        if (!Arrays.equals(this.f6871d, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(4, this.f6871d);
        }
        long j3 = this.f6872e;
        return j3 != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeUInt64Size(5, j3) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        byte[] bArr = this.f6868a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f6868a);
        }
        long j2 = this.f6869b;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeUInt64(2, j2);
        }
        int r02 = this.f6870c;
        if (r02 != 0) {
            codedOutputByteBufferNano.writeInt32(3, r02);
        }
        if (!Arrays.equals(this.f6871d, bArr2)) {
            codedOutputByteBufferNano.writeBytes(4, this.f6871d);
        }
        long j3 = this.f6872e;
        if (j3 != 0) {
            codedOutputByteBufferNano.writeUInt64(5, j3);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    /* renamed from: b */
    public static C2076oi m4271b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C2076oi().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2076oi mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f6868a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 16) {
                this.f6869b = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 24) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                    this.f6870c = readInt32;
                }
            } else if (readTag == 34) {
                this.f6871d = codedInputByteBufferNano.readBytes();
            } else if (readTag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f6872e = codedInputByteBufferNano.readUInt64();
            }
        }
    }

    /* renamed from: a */
    public static C2076oi m4270a(byte[] bArr) {
        return (C2076oi) MessageNano.mergeFrom(new C2076oi(), bArr);
    }
}
