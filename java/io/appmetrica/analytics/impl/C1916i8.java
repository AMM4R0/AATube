package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.i8 */
/* loaded from: classes.dex */
public final class C1916i8 extends MessageNano {

    /* renamed from: f */
    public static volatile C1916i8[] f6474f;

    /* renamed from: a */
    public byte[] f6475a;

    /* renamed from: b */
    public byte[] f6476b;

    /* renamed from: c */
    public C2016m8 f6477c;

    /* renamed from: d */
    public C1941j8[] f6478d;

    /* renamed from: e */
    public int f6479e;

    public C1916i8() {
        m3997a();
    }

    /* renamed from: b */
    public static C1916i8[] m3996b() {
        if (f6474f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6474f == null) {
                        f6474f = new C1916i8[0];
                    }
                } finally {
                }
            }
        }
        return f6474f;
    }

    /* renamed from: a */
    public final C1916i8 m3997a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f6475a = bArr;
        this.f6476b = bArr;
        this.f6477c = null;
        this.f6478d = C1941j8.m4029b();
        this.f6479e = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f6475a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f6475a);
        }
        if (!Arrays.equals(this.f6476b, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(2, this.f6476b);
        }
        C2016m8 c2016m8 = this.f6477c;
        if (c2016m8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c2016m8);
        }
        C1941j8[] c1941j8Arr = this.f6478d;
        if (c1941j8Arr != null && c1941j8Arr.length > 0) {
            int r12 = 0;
            while (true) {
                C1941j8[] c1941j8Arr2 = this.f6478d;
                if (r12 >= c1941j8Arr2.length) {
                    break;
                }
                C1941j8 c1941j8 = c1941j8Arr2[r12];
                if (c1941j8 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(4, c1941j8) + computeSerializedSize;
                }
                r12++;
            }
        }
        int r13 = this.f6479e;
        return r13 != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeUInt32Size(5, r13) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        byte[] bArr = this.f6475a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f6475a);
        }
        if (!Arrays.equals(this.f6476b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f6476b);
        }
        C2016m8 c2016m8 = this.f6477c;
        if (c2016m8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c2016m8);
        }
        C1941j8[] c1941j8Arr = this.f6478d;
        if (c1941j8Arr != null && c1941j8Arr.length > 0) {
            int r02 = 0;
            while (true) {
                C1941j8[] c1941j8Arr2 = this.f6478d;
                if (r02 >= c1941j8Arr2.length) {
                    break;
                }
                C1941j8 c1941j8 = c1941j8Arr2[r02];
                if (c1941j8 != null) {
                    codedOutputByteBufferNano.writeMessage(4, c1941j8);
                }
                r02++;
            }
        }
        int r03 = this.f6479e;
        if (r03 != 0) {
            codedOutputByteBufferNano.writeUInt32(5, r03);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    /* renamed from: b */
    public static C1916i8 m3995b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1916i8().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1916i8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f6475a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 18) {
                this.f6476b = codedInputByteBufferNano.readBytes();
            } else if (readTag == 26) {
                if (this.f6477c == null) {
                    this.f6477c = new C2016m8();
                }
                codedInputByteBufferNano.readMessage(this.f6477c);
            } else if (readTag == 34) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 34);
                C1941j8[] c1941j8Arr = this.f6478d;
                int length = c1941j8Arr == null ? 0 : c1941j8Arr.length;
                int r02 = repeatedFieldArrayLength + length;
                C1941j8[] c1941j8Arr2 = new C1941j8[r02];
                if (length != 0) {
                    System.arraycopy(c1941j8Arr, 0, c1941j8Arr2, 0, length);
                }
                while (length < r02 - 1) {
                    C1941j8 c1941j8 = new C1941j8();
                    c1941j8Arr2[length] = c1941j8;
                    codedInputByteBufferNano.readMessage(c1941j8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C1941j8 c1941j82 = new C1941j8();
                c1941j8Arr2[length] = c1941j82;
                codedInputByteBufferNano.readMessage(c1941j82);
                this.f6478d = c1941j8Arr2;
            } else if (readTag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f6479e = codedInputByteBufferNano.readUInt32();
            }
        }
    }

    /* renamed from: a */
    public static C1916i8 m3994a(byte[] bArr) {
        return (C1916i8) MessageNano.mergeFrom(new C1916i8(), bArr);
    }
}
