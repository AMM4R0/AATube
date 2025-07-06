package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.Oe */
/* loaded from: classes.dex */
public final class C1425Oe extends MessageNano {

    /* renamed from: c */
    public static final int f5170c = 0;

    /* renamed from: d */
    public static final int f5171d = 1;

    /* renamed from: e */
    public static final int f5172e = 2;

    /* renamed from: f */
    public static final int f5173f = 3;

    /* renamed from: g */
    public static volatile C1425Oe[] f5174g;

    /* renamed from: a */
    public C1375Me f5175a;

    /* renamed from: b */
    public C1400Ne[] f5176b;

    public C1425Oe() {
        m3177a();
    }

    /* renamed from: b */
    public static C1425Oe[] m3176b() {
        if (f5174g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5174g == null) {
                        f5174g = new C1425Oe[0];
                    }
                } finally {
                }
            }
        }
        return f5174g;
    }

    /* renamed from: a */
    public final C1425Oe m3177a() {
        this.f5175a = null;
        this.f5176b = C1400Ne.m3116b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C1375Me c1375Me = this.f5175a;
        if (c1375Me != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c1375Me);
        }
        C1400Ne[] c1400NeArr = this.f5176b;
        if (c1400NeArr != null && c1400NeArr.length > 0) {
            int r12 = 0;
            while (true) {
                C1400Ne[] c1400NeArr2 = this.f5176b;
                if (r12 >= c1400NeArr2.length) {
                    break;
                }
                C1400Ne c1400Ne = c1400NeArr2[r12];
                if (c1400Ne != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, c1400Ne) + computeSerializedSize;
                }
                r12++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        C1375Me c1375Me = this.f5175a;
        if (c1375Me != null) {
            codedOutputByteBufferNano.writeMessage(1, c1375Me);
        }
        C1400Ne[] c1400NeArr = this.f5176b;
        if (c1400NeArr != null && c1400NeArr.length > 0) {
            int r02 = 0;
            while (true) {
                C1400Ne[] c1400NeArr2 = this.f5176b;
                if (r02 >= c1400NeArr2.length) {
                    break;
                }
                C1400Ne c1400Ne = c1400NeArr2[r02];
                if (c1400Ne != null) {
                    codedOutputByteBufferNano.writeMessage(2, c1400Ne);
                }
                r02++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1425Oe mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                if (this.f5175a == null) {
                    this.f5175a = new C1375Me();
                }
                codedInputByteBufferNano.readMessage(this.f5175a);
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C1400Ne[] c1400NeArr = this.f5176b;
                int length = c1400NeArr == null ? 0 : c1400NeArr.length;
                int r02 = repeatedFieldArrayLength + length;
                C1400Ne[] c1400NeArr2 = new C1400Ne[r02];
                if (length != 0) {
                    System.arraycopy(c1400NeArr, 0, c1400NeArr2, 0, length);
                }
                while (length < r02 - 1) {
                    C1400Ne c1400Ne = new C1400Ne();
                    c1400NeArr2[length] = c1400Ne;
                    codedInputByteBufferNano.readMessage(c1400Ne);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C1400Ne c1400Ne2 = new C1400Ne();
                c1400NeArr2[length] = c1400Ne2;
                codedInputByteBufferNano.readMessage(c1400Ne2);
                this.f5176b = c1400NeArr2;
            }
        }
    }

    /* renamed from: b */
    public static C1425Oe m3175b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1425Oe().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C1425Oe m3174a(byte[] bArr) {
        return (C1425Oe) MessageNano.mergeFrom(new C1425Oe(), bArr);
    }
}
