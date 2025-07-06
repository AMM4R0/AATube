package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.A9 */
/* loaded from: classes.dex */
public final class C1070A9 extends MessageNano {

    /* renamed from: c */
    public static final int f4453c = 0;

    /* renamed from: d */
    public static final int f4454d = 1;

    /* renamed from: e */
    public static final int f4455e = 2;

    /* renamed from: f */
    public static final int f4456f = 3;

    /* renamed from: g */
    public static final int f4457g = 4;

    /* renamed from: h */
    public static final int f4458h = 5;

    /* renamed from: i */
    public static final int f4459i = 6;

    /* renamed from: j */
    public static volatile C1070A9[] f4460j;

    /* renamed from: a */
    public int f4461a;

    /* renamed from: b */
    public byte[] f4462b;

    public C1070A9() {
        m2698a();
    }

    /* renamed from: b */
    public static C1070A9[] m2697b() {
        if (f4460j == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f4460j == null) {
                        f4460j = new C1070A9[0];
                    }
                } finally {
                }
            }
        }
        return f4460j;
    }

    /* renamed from: a */
    public final C1070A9 m2698a() {
        this.f4461a = 0;
        this.f4462b = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int r12 = this.f4461a;
        if (r12 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, r12);
        }
        return !Arrays.equals(this.f4462b, WireFormatNano.EMPTY_BYTES) ? computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f4462b) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int r02 = this.f4461a;
        if (r02 != 0) {
            codedOutputByteBufferNano.writeInt32(1, r02);
        }
        if (!Arrays.equals(this.f4462b, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(2, this.f4462b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1070A9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                switch (readInt32) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        this.f4461a = readInt32;
                        break;
                }
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f4462b = codedInputByteBufferNano.readBytes();
            }
        }
    }

    /* renamed from: b */
    public static C1070A9 m2696b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1070A9().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C1070A9 m2695a(byte[] bArr) {
        return (C1070A9) MessageNano.mergeFrom(new C1070A9(), bArr);
    }
}
