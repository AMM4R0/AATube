package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.Ne */
/* loaded from: classes.dex */
public final class C1400Ne extends MessageNano {

    /* renamed from: d */
    public static volatile C1400Ne[] f5123d;

    /* renamed from: a */
    public String f5124a;

    /* renamed from: b */
    public String f5125b;

    /* renamed from: c */
    public int f5126c;

    public C1400Ne() {
        m3117a();
    }

    /* renamed from: b */
    public static C1400Ne[] m3116b() {
        if (f5123d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5123d == null) {
                        f5123d = new C1400Ne[0];
                    }
                } finally {
                }
            }
        }
        return f5123d;
    }

    /* renamed from: a */
    public final C1400Ne m3117a() {
        this.f5124a = "";
        this.f5125b = "";
        this.f5126c = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f5124a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f5124a);
        }
        if (!this.f5125b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f5125b);
        }
        return CodedOutputByteBufferNano.computeInt32Size(3, this.f5126c) + computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f5124a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f5124a);
        }
        if (!this.f5125b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f5125b);
        }
        codedOutputByteBufferNano.writeInt32(3, this.f5126c);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1400Ne mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f5124a = codedInputByteBufferNano.readString();
            } else if (readTag == 18) {
                this.f5125b = codedInputByteBufferNano.readString();
            } else if (readTag != 24) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3) {
                    this.f5126c = readInt32;
                }
            }
        }
    }

    /* renamed from: b */
    public static C1400Ne m3115b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1400Ne().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C1400Ne m3114a(byte[] bArr) {
        return (C1400Ne) MessageNano.mergeFrom(new C1400Ne(), bArr);
    }
}
