package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.bk */
/* loaded from: classes.dex */
public final class C1753bk extends MessageNano {

    /* renamed from: c */
    public static volatile C1753bk[] f5950c;

    /* renamed from: a */
    public byte[] f5951a;

    /* renamed from: b */
    public byte[] f5952b;

    public C1753bk() {
        m3678a();
    }

    /* renamed from: b */
    public static C1753bk[] m3677b() {
        if (f5950c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5950c == null) {
                        f5950c = new C1753bk[0];
                    }
                } finally {
                }
            }
        }
        return f5950c;
    }

    /* renamed from: a */
    public final C1753bk m3678a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f5951a = bArr;
        this.f5952b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f5951a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f5951a);
        }
        return !Arrays.equals(this.f5952b, bArr2) ? computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f5952b) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        byte[] bArr = this.f5951a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f5951a);
        }
        if (!Arrays.equals(this.f5952b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f5952b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1753bk mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f5951a = codedInputByteBufferNano.readBytes();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f5952b = codedInputByteBufferNano.readBytes();
            }
        }
    }

    /* renamed from: b */
    public static C1753bk m3676b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1753bk().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C1753bk m3675a(byte[] bArr) {
        return (C1753bk) MessageNano.mergeFrom(new C1753bk(), bArr);
    }
}
