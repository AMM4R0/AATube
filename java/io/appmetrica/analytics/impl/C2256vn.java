package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.vn */
/* loaded from: classes.dex */
public final class C2256vn extends MessageNano {

    /* renamed from: e */
    public static volatile C2256vn[] f7317e;

    /* renamed from: a */
    public byte[] f7318a;

    /* renamed from: b */
    public double f7319b;

    /* renamed from: c */
    public double f7320c;

    /* renamed from: d */
    public boolean f7321d;

    public C2256vn() {
        m4530a();
    }

    /* renamed from: b */
    public static C2256vn[] m4529b() {
        if (f7317e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7317e == null) {
                        f7317e = new C2256vn[0];
                    }
                } finally {
                }
            }
        }
        return f7317e;
    }

    /* renamed from: a */
    public final C2256vn m4530a() {
        this.f7318a = WireFormatNano.EMPTY_BYTES;
        this.f7319b = 0.0d;
        this.f7320c = 0.0d;
        this.f7321d = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f7318a, WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f7318a);
        }
        if (Double.doubleToLongBits(this.f7319b) != Double.doubleToLongBits(0.0d)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(2, this.f7319b);
        }
        if (Double.doubleToLongBits(this.f7320c) != Double.doubleToLongBits(0.0d)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(3, this.f7320c);
        }
        boolean z2 = this.f7321d;
        return z2 ? computeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(4, z2) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!Arrays.equals(this.f7318a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f7318a);
        }
        if (Double.doubleToLongBits(this.f7319b) != Double.doubleToLongBits(0.0d)) {
            codedOutputByteBufferNano.writeDouble(2, this.f7319b);
        }
        if (Double.doubleToLongBits(this.f7320c) != Double.doubleToLongBits(0.0d)) {
            codedOutputByteBufferNano.writeDouble(3, this.f7320c);
        }
        boolean z2 = this.f7321d;
        if (z2) {
            codedOutputByteBufferNano.writeBool(4, z2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2256vn mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f7318a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 17) {
                this.f7319b = codedInputByteBufferNano.readDouble();
            } else if (readTag == 25) {
                this.f7320c = codedInputByteBufferNano.readDouble();
            } else if (readTag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f7321d = codedInputByteBufferNano.readBool();
            }
        }
    }

    /* renamed from: b */
    public static C2256vn m4528b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C2256vn().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C2256vn m4527a(byte[] bArr) {
        return (C2256vn) MessageNano.mergeFrom(new C2256vn(), bArr);
    }
}
