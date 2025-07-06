package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.a2 */
/* loaded from: classes.dex */
public final class C1710a2 extends MessageNano {

    /* renamed from: c */
    public static final int f5821c = 0;

    /* renamed from: d */
    public static final int f5822d = 1;

    /* renamed from: e */
    public static final int f5823e = 2;

    /* renamed from: f */
    public static final int f5824f = 3;

    /* renamed from: g */
    public static final int f5825g = 4;

    /* renamed from: h */
    public static final int f5826h = 5;

    /* renamed from: i */
    public static final int f5827i = -1;

    /* renamed from: j */
    public static final int f5828j = 0;

    /* renamed from: k */
    public static final int f5829k = 1;

    /* renamed from: l */
    public static volatile C1710a2[] f5830l;

    /* renamed from: a */
    public int f5831a;

    /* renamed from: b */
    public int f5832b;

    public C1710a2() {
        m3585a();
    }

    /* renamed from: b */
    public static C1710a2[] m3584b() {
        if (f5830l == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5830l == null) {
                        f5830l = new C1710a2[0];
                    }
                } finally {
                }
            }
        }
        return f5830l;
    }

    /* renamed from: a */
    public final C1710a2 m3585a() {
        this.f5831a = 0;
        this.f5832b = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeInt32Size(3, this.f5832b) + CodedOutputByteBufferNano.computeInt32Size(2, this.f5831a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeInt32(2, this.f5831a);
        codedOutputByteBufferNano.writeInt32(3, this.f5832b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1710a2 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 16) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3 || readInt32 == 4 || readInt32 == 5) {
                    this.f5831a = readInt32;
                }
            } else if (readTag != 24) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int readInt322 = codedInputByteBufferNano.readInt32();
                if (readInt322 == -1 || readInt322 == 0 || readInt322 == 1) {
                    this.f5832b = readInt322;
                }
            }
        }
    }

    /* renamed from: b */
    public static C1710a2 m3583b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1710a2().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C1710a2 m3582a(byte[] bArr) {
        return (C1710a2) MessageNano.mergeFrom(new C1710a2(), bArr);
    }
}
