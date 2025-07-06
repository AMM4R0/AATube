package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.Me */
/* loaded from: classes.dex */
public final class C1375Me extends MessageNano {

    /* renamed from: f */
    public static volatile C1375Me[] f5059f;

    /* renamed from: a */
    public String f5060a;

    /* renamed from: b */
    public String f5061b;

    /* renamed from: c */
    public boolean f5062c;

    /* renamed from: d */
    public boolean f5063d;

    /* renamed from: e */
    public int f5064e;

    public C1375Me() {
        m3088a();
    }

    /* renamed from: b */
    public static C1375Me[] m3087b() {
        if (f5059f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5059f == null) {
                        f5059f = new C1375Me[0];
                    }
                } finally {
                }
            }
        }
        return f5059f;
    }

    /* renamed from: a */
    public final C1375Me m3088a() {
        this.f5060a = "";
        this.f5061b = "";
        this.f5062c = false;
        this.f5063d = false;
        this.f5064e = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f5060a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f5060a);
        }
        if (!this.f5061b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f5061b);
        }
        boolean z2 = this.f5062c;
        if (z2) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(3, z2);
        }
        boolean z3 = this.f5063d;
        if (z3) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(4, z3);
        }
        return CodedOutputByteBufferNano.computeInt32Size(5, this.f5064e) + computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f5060a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f5060a);
        }
        if (!this.f5061b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f5061b);
        }
        boolean z2 = this.f5062c;
        if (z2) {
            codedOutputByteBufferNano.writeBool(3, z2);
        }
        boolean z3 = this.f5063d;
        if (z3) {
            codedOutputByteBufferNano.writeBool(4, z3);
        }
        codedOutputByteBufferNano.writeInt32(5, this.f5064e);
        super.writeTo(codedOutputByteBufferNano);
    }

    /* renamed from: b */
    public static C1375Me m3086b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1375Me().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1375Me mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f5060a = codedInputByteBufferNano.readString();
            } else if (readTag == 18) {
                this.f5061b = codedInputByteBufferNano.readString();
            } else if (readTag == 24) {
                this.f5062c = codedInputByteBufferNano.readBool();
            } else if (readTag == 32) {
                this.f5063d = codedInputByteBufferNano.readBool();
            } else if (readTag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3) {
                    this.f5064e = readInt32;
                }
            }
        }
    }

    /* renamed from: a */
    public static C1375Me m3085a(byte[] bArr) {
        return (C1375Me) MessageNano.mergeFrom(new C1375Me(), bArr);
    }
}
