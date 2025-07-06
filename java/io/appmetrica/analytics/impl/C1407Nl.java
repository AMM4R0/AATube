package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.Nl */
/* loaded from: classes.dex */
public final class C1407Nl extends MessageNano {

    /* renamed from: c */
    public static volatile C1407Nl[] f5138c;

    /* renamed from: a */
    public String f5139a;

    /* renamed from: b */
    public byte[] f5140b;

    public C1407Nl() {
        m3130a();
    }

    /* renamed from: b */
    public static C1407Nl[] m3129b() {
        if (f5138c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5138c == null) {
                        f5138c = new C1407Nl[0];
                    }
                } finally {
                }
            }
        }
        return f5138c;
    }

    /* renamed from: a */
    public final C1407Nl m3130a() {
        this.f5139a = "";
        this.f5140b = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f5139a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f5139a);
        }
        return !Arrays.equals(this.f5140b, WireFormatNano.EMPTY_BYTES) ? computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f5140b) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f5139a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f5139a);
        }
        if (!Arrays.equals(this.f5140b, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(2, this.f5140b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1407Nl mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f5139a = codedInputByteBufferNano.readString();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f5140b = codedInputByteBufferNano.readBytes();
            }
        }
    }

    /* renamed from: b */
    public static C1407Nl m3128b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1407Nl().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C1407Nl m3127a(byte[] bArr) {
        return (C1407Nl) MessageNano.mergeFrom(new C1407Nl(), bArr);
    }
}
