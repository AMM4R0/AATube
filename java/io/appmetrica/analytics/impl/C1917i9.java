package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.i9 */
/* loaded from: classes.dex */
public final class C1917i9 extends MessageNano {

    /* renamed from: e */
    public static volatile C1917i9[] f6480e;

    /* renamed from: a */
    public int f6481a;

    /* renamed from: b */
    public int f6482b;

    /* renamed from: c */
    public String f6483c;

    /* renamed from: d */
    public boolean f6484d;

    public C1917i9() {
        m4002a();
    }

    /* renamed from: b */
    public static C1917i9[] m4001b() {
        if (f6480e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6480e == null) {
                        f6480e = new C1917i9[0];
                    }
                } finally {
                }
            }
        }
        return f6480e;
    }

    /* renamed from: a */
    public final C1917i9 m4002a() {
        this.f6481a = 0;
        this.f6482b = 0;
        this.f6483c = "";
        this.f6484d = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int r12 = this.f6481a;
        if (r12 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, r12);
        }
        int r13 = this.f6482b;
        if (r13 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(2, r13);
        }
        if (!this.f6483c.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f6483c);
        }
        boolean z2 = this.f6484d;
        return z2 ? computeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(4, z2) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int r02 = this.f6481a;
        if (r02 != 0) {
            codedOutputByteBufferNano.writeUInt32(1, r02);
        }
        int r03 = this.f6482b;
        if (r03 != 0) {
            codedOutputByteBufferNano.writeUInt32(2, r03);
        }
        if (!this.f6483c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f6483c);
        }
        boolean z2 = this.f6484d;
        if (z2) {
            codedOutputByteBufferNano.writeBool(4, z2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1917i9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f6481a = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 16) {
                this.f6482b = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 26) {
                this.f6483c = codedInputByteBufferNano.readString();
            } else if (readTag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f6484d = codedInputByteBufferNano.readBool();
            }
        }
    }

    /* renamed from: b */
    public static C1917i9 m4000b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1917i9().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C1917i9 m3999a(byte[] bArr) {
        return (C1917i9) MessageNano.mergeFrom(new C1917i9(), bArr);
    }
}
