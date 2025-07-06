package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.r8 */
/* loaded from: classes.dex */
public final class C2141r8 extends MessageNano {

    /* renamed from: e */
    public static volatile C2141r8[] f7054e;

    /* renamed from: a */
    public byte[] f7055a;

    /* renamed from: b */
    public C1866g8 f7056b;

    /* renamed from: c */
    public byte[] f7057c;

    /* renamed from: d */
    public C2016m8 f7058d;

    public C2141r8() {
        m4395a();
    }

    /* renamed from: b */
    public static C2141r8[] m4394b() {
        if (f7054e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7054e == null) {
                        f7054e = new C2141r8[0];
                    }
                } finally {
                }
            }
        }
        return f7054e;
    }

    /* renamed from: a */
    public final C2141r8 m4395a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f7055a = bArr;
        this.f7056b = null;
        this.f7057c = bArr;
        this.f7058d = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f7055a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f7055a);
        }
        C1866g8 c1866g8 = this.f7056b;
        if (c1866g8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c1866g8);
        }
        if (!Arrays.equals(this.f7057c, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(3, this.f7057c);
        }
        C2016m8 c2016m8 = this.f7058d;
        return c2016m8 != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(4, c2016m8) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        byte[] bArr = this.f7055a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f7055a);
        }
        C1866g8 c1866g8 = this.f7056b;
        if (c1866g8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c1866g8);
        }
        if (!Arrays.equals(this.f7057c, bArr2)) {
            codedOutputByteBufferNano.writeBytes(3, this.f7057c);
        }
        C2016m8 c2016m8 = this.f7058d;
        if (c2016m8 != null) {
            codedOutputByteBufferNano.writeMessage(4, c2016m8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2141r8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f7055a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 18) {
                if (this.f7056b == null) {
                    this.f7056b = new C1866g8();
                }
                codedInputByteBufferNano.readMessage(this.f7056b);
            } else if (readTag == 26) {
                this.f7057c = codedInputByteBufferNano.readBytes();
            } else if (readTag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f7058d == null) {
                    this.f7058d = new C2016m8();
                }
                codedInputByteBufferNano.readMessage(this.f7058d);
            }
        }
    }

    /* renamed from: b */
    public static C2141r8 m4393b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C2141r8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C2141r8 m4392a(byte[] bArr) {
        return (C2141r8) MessageNano.mergeFrom(new C2141r8(), bArr);
    }
}
