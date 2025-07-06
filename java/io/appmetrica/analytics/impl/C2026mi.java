package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.mi */
/* loaded from: classes.dex */
public final class C2026mi extends MessageNano {

    /* renamed from: c */
    public static final int f6769c = 0;

    /* renamed from: d */
    public static final int f6770d = 1;

    /* renamed from: e */
    public static final int f6771e = 2;

    /* renamed from: f */
    public static final int f6772f = 3;

    /* renamed from: g */
    public static final int f6773g = 4;

    /* renamed from: h */
    public static volatile C2026mi[] f6774h;

    /* renamed from: a */
    public int f6775a;

    /* renamed from: b */
    public int f6776b;

    public C2026mi() {
        m4224a();
    }

    /* renamed from: b */
    public static C2026mi[] m4223b() {
        if (f6774h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6774h == null) {
                        f6774h = new C2026mi[0];
                    }
                } finally {
                }
            }
        }
        return f6774h;
    }

    /* renamed from: a */
    public final C2026mi m4224a() {
        this.f6775a = 0;
        this.f6776b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int r12 = this.f6775a;
        if (r12 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, r12);
        }
        int r13 = this.f6776b;
        return r13 != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(2, r13) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int r02 = this.f6775a;
        if (r02 != 0) {
            codedOutputByteBufferNano.writeUInt32(1, r02);
        }
        int r03 = this.f6776b;
        if (r03 != 0) {
            codedOutputByteBufferNano.writeInt32(2, r03);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2026mi mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f6775a = codedInputByteBufferNano.readUInt32();
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3 || readInt32 == 4) {
                    this.f6776b = readInt32;
                }
            }
        }
    }

    /* renamed from: b */
    public static C2026mi m4222b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C2026mi().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C2026mi m4221a(byte[] bArr) {
        return (C2026mi) MessageNano.mergeFrom(new C2026mi(), bArr);
    }
}
