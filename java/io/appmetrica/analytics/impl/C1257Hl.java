package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.Hl */
/* loaded from: classes.dex */
public final class C1257Hl extends MessageNano {

    /* renamed from: b */
    public static volatile C1257Hl[] f4826b;

    /* renamed from: a */
    public C1232Gl[] f4827a;

    public C1257Hl() {
        m2946a();
    }

    /* renamed from: b */
    public static C1257Hl[] m2945b() {
        if (f4826b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f4826b == null) {
                        f4826b = new C1257Hl[0];
                    }
                } finally {
                }
            }
        }
        return f4826b;
    }

    /* renamed from: a */
    public final C1257Hl m2946a() {
        this.f4827a = C1232Gl.m2919b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C1232Gl[] c1232GlArr = this.f4827a;
        if (c1232GlArr != null && c1232GlArr.length > 0) {
            int r12 = 0;
            while (true) {
                C1232Gl[] c1232GlArr2 = this.f4827a;
                if (r12 >= c1232GlArr2.length) {
                    break;
                }
                C1232Gl c1232Gl = c1232GlArr2[r12];
                if (c1232Gl != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c1232Gl) + computeSerializedSize;
                }
                r12++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        C1232Gl[] c1232GlArr = this.f4827a;
        if (c1232GlArr != null && c1232GlArr.length > 0) {
            int r02 = 0;
            while (true) {
                C1232Gl[] c1232GlArr2 = this.f4827a;
                if (r02 >= c1232GlArr2.length) {
                    break;
                }
                C1232Gl c1232Gl = c1232GlArr2[r02];
                if (c1232Gl != null) {
                    codedOutputByteBufferNano.writeMessage(1, c1232Gl);
                }
                r02++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1257Hl mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag != 10) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C1232Gl[] c1232GlArr = this.f4827a;
                int length = c1232GlArr == null ? 0 : c1232GlArr.length;
                int r02 = repeatedFieldArrayLength + length;
                C1232Gl[] c1232GlArr2 = new C1232Gl[r02];
                if (length != 0) {
                    System.arraycopy(c1232GlArr, 0, c1232GlArr2, 0, length);
                }
                while (length < r02 - 1) {
                    C1232Gl c1232Gl = new C1232Gl();
                    c1232GlArr2[length] = c1232Gl;
                    codedInputByteBufferNano.readMessage(c1232Gl);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C1232Gl c1232Gl2 = new C1232Gl();
                c1232GlArr2[length] = c1232Gl2;
                codedInputByteBufferNano.readMessage(c1232Gl2);
                this.f4827a = c1232GlArr2;
            }
        }
    }

    /* renamed from: b */
    public static C1257Hl m2944b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1257Hl().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C1257Hl m2943a(byte[] bArr) {
        return (C1257Hl) MessageNano.mergeFrom(new C1257Hl(), bArr);
    }
}
