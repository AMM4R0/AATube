package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.o8 */
/* loaded from: classes.dex */
public final class C2066o8 extends MessageNano {

    /* renamed from: h */
    public static volatile C2066o8[] f6844h;

    /* renamed from: a */
    public byte[] f6845a;

    /* renamed from: b */
    public byte[] f6846b;

    /* renamed from: c */
    public C1866g8 f6847c;

    /* renamed from: d */
    public C2016m8 f6848d;

    /* renamed from: e */
    public C2041n8 f6849e;

    /* renamed from: f */
    public C2041n8 f6850f;

    /* renamed from: g */
    public C2091p8[] f6851g;

    public C2066o8() {
        m4257a();
    }

    /* renamed from: b */
    public static C2066o8[] m4256b() {
        if (f6844h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6844h == null) {
                        f6844h = new C2066o8[0];
                    }
                } finally {
                }
            }
        }
        return f6844h;
    }

    /* renamed from: a */
    public final C2066o8 m4257a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f6845a = bArr;
        this.f6846b = bArr;
        this.f6847c = null;
        this.f6848d = null;
        this.f6849e = null;
        this.f6850f = null;
        this.f6851g = C2091p8.m4282b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f6845a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f6845a);
        }
        if (!Arrays.equals(this.f6846b, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(2, this.f6846b);
        }
        C1866g8 c1866g8 = this.f6847c;
        if (c1866g8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c1866g8);
        }
        C2016m8 c2016m8 = this.f6848d;
        if (c2016m8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, c2016m8);
        }
        C2041n8 c2041n8 = this.f6849e;
        if (c2041n8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, c2041n8);
        }
        C2041n8 c2041n82 = this.f6850f;
        if (c2041n82 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(6, c2041n82);
        }
        C2091p8[] c2091p8Arr = this.f6851g;
        if (c2091p8Arr != null && c2091p8Arr.length > 0) {
            int r12 = 0;
            while (true) {
                C2091p8[] c2091p8Arr2 = this.f6851g;
                if (r12 >= c2091p8Arr2.length) {
                    break;
                }
                C2091p8 c2091p8 = c2091p8Arr2[r12];
                if (c2091p8 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(7, c2091p8) + computeSerializedSize;
                }
                r12++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        byte[] bArr = this.f6845a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f6845a);
        }
        if (!Arrays.equals(this.f6846b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f6846b);
        }
        C1866g8 c1866g8 = this.f6847c;
        if (c1866g8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c1866g8);
        }
        C2016m8 c2016m8 = this.f6848d;
        if (c2016m8 != null) {
            codedOutputByteBufferNano.writeMessage(4, c2016m8);
        }
        C2041n8 c2041n8 = this.f6849e;
        if (c2041n8 != null) {
            codedOutputByteBufferNano.writeMessage(5, c2041n8);
        }
        C2041n8 c2041n82 = this.f6850f;
        if (c2041n82 != null) {
            codedOutputByteBufferNano.writeMessage(6, c2041n82);
        }
        C2091p8[] c2091p8Arr = this.f6851g;
        if (c2091p8Arr != null && c2091p8Arr.length > 0) {
            int r02 = 0;
            while (true) {
                C2091p8[] c2091p8Arr2 = this.f6851g;
                if (r02 >= c2091p8Arr2.length) {
                    break;
                }
                C2091p8 c2091p8 = c2091p8Arr2[r02];
                if (c2091p8 != null) {
                    codedOutputByteBufferNano.writeMessage(7, c2091p8);
                }
                r02++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    /* renamed from: b */
    public static C2066o8 m4255b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C2066o8().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2066o8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f6845a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 18) {
                this.f6846b = codedInputByteBufferNano.readBytes();
            } else if (readTag == 26) {
                if (this.f6847c == null) {
                    this.f6847c = new C1866g8();
                }
                codedInputByteBufferNano.readMessage(this.f6847c);
            } else if (readTag == 34) {
                if (this.f6848d == null) {
                    this.f6848d = new C2016m8();
                }
                codedInputByteBufferNano.readMessage(this.f6848d);
            } else if (readTag == 42) {
                if (this.f6849e == null) {
                    this.f6849e = new C2041n8();
                }
                codedInputByteBufferNano.readMessage(this.f6849e);
            } else if (readTag == 50) {
                if (this.f6850f == null) {
                    this.f6850f = new C2041n8();
                }
                codedInputByteBufferNano.readMessage(this.f6850f);
            } else if (readTag != 58) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                C2091p8[] c2091p8Arr = this.f6851g;
                int length = c2091p8Arr == null ? 0 : c2091p8Arr.length;
                int r02 = repeatedFieldArrayLength + length;
                C2091p8[] c2091p8Arr2 = new C2091p8[r02];
                if (length != 0) {
                    System.arraycopy(c2091p8Arr, 0, c2091p8Arr2, 0, length);
                }
                while (length < r02 - 1) {
                    C2091p8 c2091p8 = new C2091p8();
                    c2091p8Arr2[length] = c2091p8;
                    codedInputByteBufferNano.readMessage(c2091p8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C2091p8 c2091p82 = new C2091p8();
                c2091p8Arr2[length] = c2091p82;
                codedInputByteBufferNano.readMessage(c2091p82);
                this.f6851g = c2091p8Arr2;
            }
        }
    }

    /* renamed from: a */
    public static C2066o8 m4254a(byte[] bArr) {
        return (C2066o8) MessageNano.mergeFrom(new C2066o8(), bArr);
    }
}
