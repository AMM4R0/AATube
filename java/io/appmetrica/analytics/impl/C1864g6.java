package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.g6 */
/* loaded from: classes.dex */
public final class C1864g6 extends MessageNano {

    /* renamed from: g */
    public static volatile C1864g6[] f6295g;

    /* renamed from: a */
    public String f6296a;

    /* renamed from: b */
    public String f6297b;

    /* renamed from: c */
    public int f6298c;

    /* renamed from: d */
    public String f6299d;

    /* renamed from: e */
    public boolean f6300e;

    /* renamed from: f */
    public int f6301f;

    public C1864g6() {
        m3855a();
    }

    /* renamed from: b */
    public static C1864g6[] m3854b() {
        if (f6295g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6295g == null) {
                        f6295g = new C1864g6[0];
                    }
                } finally {
                }
            }
        }
        return f6295g;
    }

    /* renamed from: a */
    public final C1864g6 m3855a() {
        this.f6296a = "";
        this.f6297b = "";
        this.f6298c = -1;
        this.f6299d = "";
        this.f6300e = false;
        this.f6301f = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f6296a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f6296a);
        }
        if (!this.f6297b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f6297b);
        }
        int r12 = this.f6298c;
        if (r12 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeSInt32Size(3, r12);
        }
        if (!this.f6299d.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(4, this.f6299d);
        }
        boolean z2 = this.f6300e;
        if (z2) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(5, z2);
        }
        int r13 = this.f6301f;
        return r13 != -1 ? computeSerializedSize + CodedOutputByteBufferNano.computeSInt32Size(6, r13) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f6296a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f6296a);
        }
        if (!this.f6297b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f6297b);
        }
        int r02 = this.f6298c;
        if (r02 != -1) {
            codedOutputByteBufferNano.writeSInt32(3, r02);
        }
        if (!this.f6299d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f6299d);
        }
        boolean z2 = this.f6300e;
        if (z2) {
            codedOutputByteBufferNano.writeBool(5, z2);
        }
        int r03 = this.f6301f;
        if (r03 != -1) {
            codedOutputByteBufferNano.writeSInt32(6, r03);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    /* renamed from: b */
    public static C1864g6 m3853b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1864g6().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1864g6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f6296a = codedInputByteBufferNano.readString();
            } else if (readTag == 18) {
                this.f6297b = codedInputByteBufferNano.readString();
            } else if (readTag == 24) {
                this.f6298c = codedInputByteBufferNano.readSInt32();
            } else if (readTag == 34) {
                this.f6299d = codedInputByteBufferNano.readString();
            } else if (readTag == 40) {
                this.f6300e = codedInputByteBufferNano.readBool();
            } else if (readTag != 48) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f6301f = codedInputByteBufferNano.readSInt32();
            }
        }
    }

    /* renamed from: a */
    public static C1864g6 m3852a(byte[] bArr) {
        return (C1864g6) MessageNano.mergeFrom(new C1864g6(), bArr);
    }
}
