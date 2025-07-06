package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.Sf */
/* loaded from: classes.dex */
public final class C1525Sf extends MessageNano {

    /* renamed from: e */
    public static final int f5418e = 0;

    /* renamed from: f */
    public static final int f5419f = 1;

    /* renamed from: g */
    public static final int f5420g = 2;

    /* renamed from: h */
    public static volatile C1525Sf[] f5421h;

    /* renamed from: a */
    public String f5422a;

    /* renamed from: b */
    public long f5423b;

    /* renamed from: c */
    public long f5424c;

    /* renamed from: d */
    public int f5425d;

    public C1525Sf() {
        m3322a();
    }

    /* renamed from: b */
    public static C1525Sf[] m3321b() {
        if (f5421h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5421h == null) {
                        f5421h = new C1525Sf[0];
                    }
                } finally {
                }
            }
        }
        return f5421h;
    }

    /* renamed from: a */
    public final C1525Sf m3322a() {
        this.f5422a = "";
        this.f5423b = 0L;
        this.f5424c = 0L;
        this.f5425d = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f5422a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f5422a);
        }
        long j2 = this.f5423b;
        if (j2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(2, j2);
        }
        long j3 = this.f5424c;
        if (j3 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(3, j3);
        }
        int r12 = this.f5425d;
        return r12 != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(4, r12) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f5422a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f5422a);
        }
        long j2 = this.f5423b;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeUInt64(2, j2);
        }
        long j3 = this.f5424c;
        if (j3 != 0) {
            codedOutputByteBufferNano.writeUInt64(3, j3);
        }
        int r02 = this.f5425d;
        if (r02 != 0) {
            codedOutputByteBufferNano.writeInt32(4, r02);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1525Sf mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f5422a = codedInputByteBufferNano.readString();
            } else if (readTag == 16) {
                this.f5423b = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 24) {
                this.f5424c = codedInputByteBufferNano.readUInt64();
            } else if (readTag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                    this.f5425d = readInt32;
                }
            }
        }
    }

    /* renamed from: b */
    public static C1525Sf m3320b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1525Sf().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C1525Sf m3319a(byte[] bArr) {
        return (C1525Sf) MessageNano.mergeFrom(new C1525Sf(), bArr);
    }
}
