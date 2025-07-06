package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.Kl */
/* loaded from: classes.dex */
public final class C1332Kl extends MessageNano {

    /* renamed from: c */
    public static volatile C1332Kl[] f4973c;

    /* renamed from: a */
    public String f4974a;

    /* renamed from: b */
    public String[] f4975b;

    public C1332Kl() {
        m3034a();
    }

    /* renamed from: b */
    public static C1332Kl[] m3033b() {
        if (f4973c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f4973c == null) {
                        f4973c = new C1332Kl[0];
                    }
                } finally {
                }
            }
        }
        return f4973c;
    }

    /* renamed from: a */
    public final C1332Kl m3034a() {
        this.f4974a = "";
        this.f4975b = WireFormatNano.EMPTY_STRING_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f4974a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f4974a);
        }
        String[] strArr = this.f4975b;
        if (strArr == null || strArr.length <= 0) {
            return computeSerializedSize;
        }
        int r12 = 0;
        int r2 = 0;
        int r3 = 0;
        while (true) {
            String[] strArr2 = this.f4975b;
            if (r12 >= strArr2.length) {
                return computeSerializedSize + r2 + r3;
            }
            String str = strArr2[r12];
            if (str != null) {
                r3++;
                r2 = CodedOutputByteBufferNano.computeStringSizeNoTag(str) + r2;
            }
            r12++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f4974a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f4974a);
        }
        String[] strArr = this.f4975b;
        if (strArr != null && strArr.length > 0) {
            int r02 = 0;
            while (true) {
                String[] strArr2 = this.f4975b;
                if (r02 >= strArr2.length) {
                    break;
                }
                String str = strArr2[r02];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(2, str);
                }
                r02++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1332Kl mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f4974a = codedInputByteBufferNano.readString();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                String[] strArr = this.f4975b;
                int length = strArr == null ? 0 : strArr.length;
                int r02 = repeatedFieldArrayLength + length;
                String[] strArr2 = new String[r02];
                if (length != 0) {
                    System.arraycopy(strArr, 0, strArr2, 0, length);
                }
                while (length < r02 - 1) {
                    strArr2[length] = codedInputByteBufferNano.readString();
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                strArr2[length] = codedInputByteBufferNano.readString();
                this.f4975b = strArr2;
            }
        }
    }

    /* renamed from: b */
    public static C1332Kl m3032b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1332Kl().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C1332Kl m3031a(byte[] bArr) {
        return (C1332Kl) MessageNano.mergeFrom(new C1332Kl(), bArr);
    }
}
