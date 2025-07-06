package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.li */
/* loaded from: classes.dex */
public final class C2001li extends MessageNano {

    /* renamed from: e */
    public static volatile C2001li[] f6659e;

    /* renamed from: a */
    public long f6660a;

    /* renamed from: b */
    public C2026mi f6661b;

    /* renamed from: c */
    public int f6662c;

    /* renamed from: d */
    public byte[] f6663d;

    public C2001li() {
        m4114a();
    }

    /* renamed from: b */
    public static C2001li[] m4113b() {
        if (f6659e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6659e == null) {
                        f6659e = new C2001li[0];
                    }
                } finally {
                }
            }
        }
        return f6659e;
    }

    /* renamed from: a */
    public final C2001li m4114a() {
        this.f6660a = 0L;
        this.f6661b = null;
        this.f6662c = 0;
        this.f6663d = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j2 = this.f6660a;
        if (j2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j2);
        }
        C2026mi c2026mi = this.f6661b;
        if (c2026mi != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c2026mi);
        }
        int r12 = this.f6662c;
        if (r12 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(3, r12);
        }
        return !Arrays.equals(this.f6663d, WireFormatNano.EMPTY_BYTES) ? computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(4, this.f6663d) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        long j2 = this.f6660a;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeInt64(1, j2);
        }
        C2026mi c2026mi = this.f6661b;
        if (c2026mi != null) {
            codedOutputByteBufferNano.writeMessage(2, c2026mi);
        }
        int r02 = this.f6662c;
        if (r02 != 0) {
            codedOutputByteBufferNano.writeUInt32(3, r02);
        }
        if (!Arrays.equals(this.f6663d, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(4, this.f6663d);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2001li mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f6660a = codedInputByteBufferNano.readInt64();
            } else if (readTag == 18) {
                if (this.f6661b == null) {
                    this.f6661b = new C2026mi();
                }
                codedInputByteBufferNano.readMessage(this.f6661b);
            } else if (readTag == 24) {
                this.f6662c = codedInputByteBufferNano.readUInt32();
            } else if (readTag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f6663d = codedInputByteBufferNano.readBytes();
            }
        }
    }

    /* renamed from: b */
    public static C2001li m4112b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C2001li().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C2001li m4111a(byte[] bArr) {
        return (C2001li) MessageNano.mergeFrom(new C2001li(), bArr);
    }
}
