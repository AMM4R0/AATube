package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.u */
/* loaded from: classes.dex */
public final class C2207u extends MessageNano {

    /* renamed from: l */
    public static final int f7188l = 0;

    /* renamed from: m */
    public static final int f7189m = 1;

    /* renamed from: n */
    public static final int f7190n = 2;

    /* renamed from: o */
    public static final int f7191o = 3;

    /* renamed from: p */
    public static final int f7192p = 4;

    /* renamed from: q */
    public static final int f7193q = 5;

    /* renamed from: r */
    public static final int f7194r = 6;

    /* renamed from: s */
    public static volatile C2207u[] f7195s;

    /* renamed from: t */
    public static byte[] f7196t;

    /* renamed from: u */
    public static volatile boolean f7197u;

    /* renamed from: a */
    public byte[] f7198a;

    /* renamed from: b */
    public C2182t f7199b;

    /* renamed from: c */
    public byte[] f7200c;

    /* renamed from: d */
    public int f7201d;

    /* renamed from: e */
    public byte[] f7202e;

    /* renamed from: f */
    public byte[] f7203f;

    /* renamed from: g */
    public byte[] f7204g;

    /* renamed from: h */
    public byte[] f7205h;

    /* renamed from: i */
    public byte[] f7206i;

    /* renamed from: j */
    public byte[] f7207j;

    /* renamed from: k */
    public byte[] f7208k;

    public C2207u() {
        if (!f7197u) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (!f7197u) {
                        f7196t = InternalNano.bytesDefaultValue("manual");
                        f7197u = true;
                    }
                } finally {
                }
            }
        }
        m4470a();
    }

    /* renamed from: b */
    public static C2207u[] m4469b() {
        if (f7195s == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7195s == null) {
                        f7195s = new C2207u[0];
                    }
                } finally {
                }
            }
        }
        return f7195s;
    }

    /* renamed from: a */
    public final C2207u m4470a() {
        this.f7198a = (byte[]) f7196t.clone();
        this.f7199b = null;
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f7200c = bArr;
        this.f7201d = 0;
        this.f7202e = bArr;
        this.f7203f = bArr;
        this.f7204g = bArr;
        this.f7205h = bArr;
        this.f7206i = bArr;
        this.f7207j = bArr;
        this.f7208k = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f7198a, f7196t)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f7198a);
        }
        C2182t c2182t = this.f7199b;
        if (c2182t != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c2182t);
        }
        byte[] bArr = this.f7200c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(3, this.f7200c);
        }
        int r12 = this.f7201d;
        if (r12 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, r12);
        }
        if (!Arrays.equals(this.f7202e, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(5, this.f7202e);
        }
        if (!Arrays.equals(this.f7203f, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(6, this.f7203f);
        }
        if (!Arrays.equals(this.f7204g, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(7, this.f7204g);
        }
        if (!Arrays.equals(this.f7205h, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(8, this.f7205h);
        }
        if (!Arrays.equals(this.f7206i, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(9, this.f7206i);
        }
        if (!Arrays.equals(this.f7207j, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(10, this.f7207j);
        }
        return !Arrays.equals(this.f7208k, bArr2) ? computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(11, this.f7208k) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!Arrays.equals(this.f7198a, f7196t)) {
            codedOutputByteBufferNano.writeBytes(1, this.f7198a);
        }
        C2182t c2182t = this.f7199b;
        if (c2182t != null) {
            codedOutputByteBufferNano.writeMessage(2, c2182t);
        }
        byte[] bArr = this.f7200c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(3, this.f7200c);
        }
        int r02 = this.f7201d;
        if (r02 != 0) {
            codedOutputByteBufferNano.writeInt32(4, r02);
        }
        if (!Arrays.equals(this.f7202e, bArr2)) {
            codedOutputByteBufferNano.writeBytes(5, this.f7202e);
        }
        if (!Arrays.equals(this.f7203f, bArr2)) {
            codedOutputByteBufferNano.writeBytes(6, this.f7203f);
        }
        if (!Arrays.equals(this.f7204g, bArr2)) {
            codedOutputByteBufferNano.writeBytes(7, this.f7204g);
        }
        if (!Arrays.equals(this.f7205h, bArr2)) {
            codedOutputByteBufferNano.writeBytes(8, this.f7205h);
        }
        if (!Arrays.equals(this.f7206i, bArr2)) {
            codedOutputByteBufferNano.writeBytes(9, this.f7206i);
        }
        if (!Arrays.equals(this.f7207j, bArr2)) {
            codedOutputByteBufferNano.writeBytes(10, this.f7207j);
        }
        if (!Arrays.equals(this.f7208k, bArr2)) {
            codedOutputByteBufferNano.writeBytes(11, this.f7208k);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    /* renamed from: b */
    public static C2207u m4468b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C2207u().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2207u mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    return this;
                case 10:
                    this.f7198a = codedInputByteBufferNano.readBytes();
                    break;
                case 18:
                    if (this.f7199b == null) {
                        this.f7199b = new C2182t();
                    }
                    codedInputByteBufferNano.readMessage(this.f7199b);
                    break;
                case C1842f9.f6212I /* 26 */:
                    this.f7200c = codedInputByteBufferNano.readBytes();
                    break;
                case 32:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    switch (readInt32) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            this.f7201d = readInt32;
                            break;
                    }
                case C1842f9.f6218O /* 42 */:
                    this.f7202e = codedInputByteBufferNano.readBytes();
                    break;
                case 50:
                    this.f7203f = codedInputByteBufferNano.readBytes();
                    break;
                case 58:
                    this.f7204g = codedInputByteBufferNano.readBytes();
                    break;
                case 66:
                    this.f7205h = codedInputByteBufferNano.readBytes();
                    break;
                case 74:
                    this.f7206i = codedInputByteBufferNano.readBytes();
                    break;
                case 82:
                    this.f7207j = codedInputByteBufferNano.readBytes();
                    break;
                case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                    this.f7208k = codedInputByteBufferNano.readBytes();
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
    public static C2207u m4467a(byte[] bArr) {
        return (C2207u) MessageNano.mergeFrom(new C2207u(), bArr);
    }
}
