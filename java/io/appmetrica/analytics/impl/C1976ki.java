package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.ki */
/* loaded from: classes.dex */
public final class C1976ki extends MessageNano {

    /* renamed from: c */
    public static volatile C1976ki[] f6588c;

    /* renamed from: a */
    public byte[] f6589a;

    /* renamed from: b */
    public byte[] f6590b;

    public C1976ki() {
        m4059a();
    }

    /* renamed from: b */
    public static C1976ki[] m4058b() {
        if (f6588c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6588c == null) {
                        f6588c = new C1976ki[0];
                    }
                } finally {
                }
            }
        }
        return f6588c;
    }

    /* renamed from: a */
    public final C1976ki m4059a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f6589a = bArr;
        this.f6590b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f6589a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f6589a);
        }
        return !Arrays.equals(this.f6590b, bArr2) ? computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f6590b) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        byte[] bArr = this.f6589a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f6589a);
        }
        if (!Arrays.equals(this.f6590b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f6590b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1976ki mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f6589a = codedInputByteBufferNano.readBytes();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f6590b = codedInputByteBufferNano.readBytes();
            }
        }
    }

    /* renamed from: b */
    public static C1976ki m4057b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1976ki().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C1976ki m4056a(byte[] bArr) {
        return (C1976ki) MessageNano.mergeFrom(new C1976ki(), bArr);
    }
}
