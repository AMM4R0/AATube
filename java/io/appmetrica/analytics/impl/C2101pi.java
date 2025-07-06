package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.pi */
/* loaded from: classes.dex */
public final class C2101pi extends MessageNano {

    /* renamed from: l */
    public static final int f6917l = 0;

    /* renamed from: m */
    public static final int f6918m = 1;

    /* renamed from: n */
    public static final int f6919n = 2;

    /* renamed from: o */
    public static final int f6920o = 1;

    /* renamed from: p */
    public static final int f6921p = 2;

    /* renamed from: q */
    public static volatile C2101pi[] f6922q;

    /* renamed from: a */
    public int f6923a;

    /* renamed from: b */
    public byte[] f6924b;

    /* renamed from: c */
    public byte[] f6925c;

    /* renamed from: d */
    public byte[] f6926d;

    /* renamed from: e */
    public C1976ki f6927e;

    /* renamed from: f */
    public long f6928f;

    /* renamed from: g */
    public boolean f6929g;

    /* renamed from: h */
    public int f6930h;

    /* renamed from: i */
    public int f6931i;

    /* renamed from: j */
    public C2076oi f6932j;

    /* renamed from: k */
    public C2051ni f6933k;

    public C2101pi() {
        m4291a();
    }

    /* renamed from: b */
    public static C2101pi[] m4290b() {
        if (f6922q == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6922q == null) {
                        f6922q = new C2101pi[0];
                    }
                } finally {
                }
            }
        }
        return f6922q;
    }

    /* renamed from: a */
    public final C2101pi m4291a() {
        this.f6923a = 1;
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f6924b = bArr;
        this.f6925c = bArr;
        this.f6926d = bArr;
        this.f6927e = null;
        this.f6928f = 0L;
        this.f6929g = false;
        this.f6930h = 0;
        this.f6931i = 1;
        this.f6932j = null;
        this.f6933k = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int r12 = this.f6923a;
        if (r12 != 1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, r12);
        }
        int computeBytesSize = CodedOutputByteBufferNano.computeBytesSize(3, this.f6924b) + computeSerializedSize;
        byte[] bArr = this.f6925c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeBytesSize += CodedOutputByteBufferNano.computeBytesSize(4, this.f6925c);
        }
        if (!Arrays.equals(this.f6926d, bArr2)) {
            computeBytesSize += CodedOutputByteBufferNano.computeBytesSize(5, this.f6926d);
        }
        C1976ki c1976ki = this.f6927e;
        if (c1976ki != null) {
            computeBytesSize += CodedOutputByteBufferNano.computeMessageSize(6, c1976ki);
        }
        long j2 = this.f6928f;
        if (j2 != 0) {
            computeBytesSize += CodedOutputByteBufferNano.computeInt64Size(7, j2);
        }
        boolean z2 = this.f6929g;
        if (z2) {
            computeBytesSize += CodedOutputByteBufferNano.computeBoolSize(8, z2);
        }
        int r02 = this.f6930h;
        if (r02 != 0) {
            computeBytesSize += CodedOutputByteBufferNano.computeInt32Size(9, r02);
        }
        int r03 = this.f6931i;
        if (r03 != 1) {
            computeBytesSize += CodedOutputByteBufferNano.computeInt32Size(10, r03);
        }
        C2076oi c2076oi = this.f6932j;
        if (c2076oi != null) {
            computeBytesSize += CodedOutputByteBufferNano.computeMessageSize(11, c2076oi);
        }
        C2051ni c2051ni = this.f6933k;
        return c2051ni != null ? computeBytesSize + CodedOutputByteBufferNano.computeMessageSize(12, c2051ni) : computeBytesSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int r02 = this.f6923a;
        if (r02 != 1) {
            codedOutputByteBufferNano.writeUInt32(1, r02);
        }
        codedOutputByteBufferNano.writeBytes(3, this.f6924b);
        byte[] bArr = this.f6925c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(4, this.f6925c);
        }
        if (!Arrays.equals(this.f6926d, bArr2)) {
            codedOutputByteBufferNano.writeBytes(5, this.f6926d);
        }
        C1976ki c1976ki = this.f6927e;
        if (c1976ki != null) {
            codedOutputByteBufferNano.writeMessage(6, c1976ki);
        }
        long j2 = this.f6928f;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeInt64(7, j2);
        }
        boolean z2 = this.f6929g;
        if (z2) {
            codedOutputByteBufferNano.writeBool(8, z2);
        }
        int r03 = this.f6930h;
        if (r03 != 0) {
            codedOutputByteBufferNano.writeInt32(9, r03);
        }
        int r04 = this.f6931i;
        if (r04 != 1) {
            codedOutputByteBufferNano.writeInt32(10, r04);
        }
        C2076oi c2076oi = this.f6932j;
        if (c2076oi != null) {
            codedOutputByteBufferNano.writeMessage(11, c2076oi);
        }
        C2051ni c2051ni = this.f6933k;
        if (c2051ni != null) {
            codedOutputByteBufferNano.writeMessage(12, c2051ni);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    /* renamed from: b */
    public static C2101pi m4289b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C2101pi().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2101pi mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    return this;
                case 8:
                    this.f6923a = codedInputByteBufferNano.readUInt32();
                    break;
                case C1842f9.f6212I /* 26 */:
                    this.f6924b = codedInputByteBufferNano.readBytes();
                    break;
                case 34:
                    this.f6925c = codedInputByteBufferNano.readBytes();
                    break;
                case C1842f9.f6218O /* 42 */:
                    this.f6926d = codedInputByteBufferNano.readBytes();
                    break;
                case 50:
                    if (this.f6927e == null) {
                        this.f6927e = new C1976ki();
                    }
                    codedInputByteBufferNano.readMessage(this.f6927e);
                    break;
                case 56:
                    this.f6928f = codedInputByteBufferNano.readInt64();
                    break;
                case 64:
                    this.f6929g = codedInputByteBufferNano.readBool();
                    break;
                case 72:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 != 0 && readInt32 != 1 && readInt32 != 2) {
                        break;
                    } else {
                        this.f6930h = readInt32;
                        break;
                    }
                case 80:
                    int readInt322 = codedInputByteBufferNano.readInt32();
                    if (readInt322 != 1 && readInt322 != 2) {
                        break;
                    } else {
                        this.f6931i = readInt322;
                        break;
                    }
                case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                    if (this.f6932j == null) {
                        this.f6932j = new C2076oi();
                    }
                    codedInputByteBufferNano.readMessage(this.f6932j);
                    break;
                case 98:
                    if (this.f6933k == null) {
                        this.f6933k = new C2051ni();
                    }
                    codedInputByteBufferNano.readMessage(this.f6933k);
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        return this;
                    }
                    break;
            }
        }
    }

    /* renamed from: a */
    public static C2101pi m4288a(byte[] bArr) {
        return (C2101pi) MessageNano.mergeFrom(new C2101pi(), bArr);
    }
}
