package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.ni */
/* loaded from: classes.dex */
public final class C2051ni extends MessageNano {

    /* renamed from: d */
    public static volatile C2051ni[] f6823d;

    /* renamed from: a */
    public boolean f6824a;

    /* renamed from: b */
    public C2026mi f6825b;

    /* renamed from: c */
    public C2001li f6826c;

    public C2051ni() {
        m4250a();
    }

    /* renamed from: b */
    public static C2051ni[] m4249b() {
        if (f6823d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6823d == null) {
                        f6823d = new C2051ni[0];
                    }
                } finally {
                }
            }
        }
        return f6823d;
    }

    /* renamed from: a */
    public final C2051ni m4250a() {
        this.f6824a = false;
        this.f6825b = null;
        this.f6826c = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        boolean z2 = this.f6824a;
        if (z2) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z2);
        }
        C2026mi c2026mi = this.f6825b;
        if (c2026mi != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c2026mi);
        }
        C2001li c2001li = this.f6826c;
        return c2001li != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(3, c2001li) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        boolean z2 = this.f6824a;
        if (z2) {
            codedOutputByteBufferNano.writeBool(1, z2);
        }
        C2026mi c2026mi = this.f6825b;
        if (c2026mi != null) {
            codedOutputByteBufferNano.writeMessage(2, c2026mi);
        }
        C2001li c2001li = this.f6826c;
        if (c2001li != null) {
            codedOutputByteBufferNano.writeMessage(3, c2001li);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2051ni mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f6824a = codedInputByteBufferNano.readBool();
            } else if (readTag == 18) {
                if (this.f6825b == null) {
                    this.f6825b = new C2026mi();
                }
                codedInputByteBufferNano.readMessage(this.f6825b);
            } else if (readTag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f6826c == null) {
                    this.f6826c = new C2001li();
                }
                codedInputByteBufferNano.readMessage(this.f6826c);
            }
        }
    }

    /* renamed from: b */
    public static C2051ni m4248b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C2051ni().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C2051ni m4247a(byte[] bArr) {
        return (C2051ni) MessageNano.mergeFrom(new C2051ni(), bArr);
    }
}
