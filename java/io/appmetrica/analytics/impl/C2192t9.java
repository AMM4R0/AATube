package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.t9 */
/* loaded from: classes.dex */
public final class C2192t9 extends MessageNano {

    /* renamed from: e */
    public static volatile C2192t9[] f7155e;

    /* renamed from: a */
    public boolean f7156a;

    /* renamed from: b */
    public int f7157b;

    /* renamed from: c */
    public int f7158c;

    /* renamed from: d */
    public int[] f7159d;

    public C2192t9() {
        m4454a();
    }

    /* renamed from: b */
    public static C2192t9[] m4453b() {
        if (f7155e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7155e == null) {
                        f7155e = new C2192t9[0];
                    }
                } finally {
                }
            }
        }
        return f7155e;
    }

    /* renamed from: a */
    public final C2192t9 m4454a() {
        this.f7156a = false;
        this.f7157b = 0;
        this.f7158c = 0;
        this.f7159d = WireFormatNano.EMPTY_INT_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeUInt32Size = CodedOutputByteBufferNano.computeUInt32Size(3, this.f7158c) + CodedOutputByteBufferNano.computeUInt32Size(2, this.f7157b) + CodedOutputByteBufferNano.computeBoolSize(1, this.f7156a) + super.computeSerializedSize();
        int[] r02 = this.f7159d;
        if (r02 == null || r02.length <= 0) {
            return computeUInt32Size;
        }
        int r03 = 0;
        int r2 = 0;
        while (true) {
            int[] r3 = this.f7159d;
            if (r03 >= r3.length) {
                return computeUInt32Size + r2 + r3.length;
            }
            r2 += CodedOutputByteBufferNano.computeInt32SizeNoTag(r3[r03]);
            r03++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeBool(1, this.f7156a);
        codedOutputByteBufferNano.writeUInt32(2, this.f7157b);
        codedOutputByteBufferNano.writeUInt32(3, this.f7158c);
        int[] r02 = this.f7159d;
        if (r02 != null && r02.length > 0) {
            int r03 = 0;
            while (true) {
                int[] r12 = this.f7159d;
                if (r03 >= r12.length) {
                    break;
                }
                codedOutputByteBufferNano.writeInt32(4, r12[r03]);
                r03++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2192t9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f7156a = codedInputByteBufferNano.readBool();
            } else if (readTag == 16) {
                this.f7157b = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 24) {
                this.f7158c = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 32) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 32);
                int[] r12 = this.f7159d;
                int length = r12 == null ? 0 : r12.length;
                int r02 = repeatedFieldArrayLength + length;
                int[] r4 = new int[r02];
                if (length != 0) {
                    System.arraycopy(r12, 0, r4, 0, length);
                }
                while (length < r02 - 1) {
                    r4[length] = codedInputByteBufferNano.readInt32();
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                r4[length] = codedInputByteBufferNano.readInt32();
                this.f7159d = r4;
            } else if (readTag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int pushLimit = codedInputByteBufferNano.pushLimit(codedInputByteBufferNano.readRawVarint32());
                int position = codedInputByteBufferNano.getPosition();
                int r3 = 0;
                while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                    codedInputByteBufferNano.readInt32();
                    r3++;
                }
                codedInputByteBufferNano.rewindToPosition(position);
                int[] r13 = this.f7159d;
                int length2 = r13 == null ? 0 : r13.length;
                int r32 = r3 + length2;
                int[] r5 = new int[r32];
                if (length2 != 0) {
                    System.arraycopy(r13, 0, r5, 0, length2);
                }
                while (length2 < r32) {
                    r5[length2] = codedInputByteBufferNano.readInt32();
                    length2++;
                }
                this.f7159d = r5;
                codedInputByteBufferNano.popLimit(pushLimit);
            }
        }
    }

    /* renamed from: b */
    public static C2192t9 m4452b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C2192t9().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C2192t9 m4451a(byte[] bArr) {
        return (C2192t9) MessageNano.mergeFrom(new C2192t9(), bArr);
    }
}
