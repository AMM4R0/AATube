package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.BuildConfig;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.Rl */
/* loaded from: classes.dex */
public final class C1506Rl extends MessageNano {

    /* renamed from: E */
    public static final int f5361E = -1;

    /* renamed from: F */
    public static final int f5362F = 0;

    /* renamed from: G */
    public static final int f5363G = 1;

    /* renamed from: H */
    public static volatile C1506Rl[] f5364H;

    /* renamed from: A */
    public C1257Hl f5365A;

    /* renamed from: B */
    public C1457Pl f5366B;

    /* renamed from: C */
    public C1407Nl[] f5367C;

    /* renamed from: D */
    public C1357Ll f5368D;

    /* renamed from: a */
    public String f5369a;

    /* renamed from: b */
    public long f5370b;

    /* renamed from: c */
    public String[] f5371c;

    /* renamed from: d */
    public String f5372d;

    /* renamed from: e */
    public String f5373e;

    /* renamed from: f */
    public String[] f5374f;

    /* renamed from: g */
    public String[] f5375g;

    /* renamed from: h */
    public C1332Kl[] f5376h;

    /* renamed from: i */
    public C1382Ml f5377i;

    /* renamed from: j */
    public String f5378j;

    /* renamed from: k */
    public String f5379k;

    /* renamed from: l */
    public String f5380l;

    /* renamed from: m */
    public boolean f5381m;

    /* renamed from: n */
    public String f5382n;

    /* renamed from: o */
    public String[] f5383o;

    /* renamed from: p */
    public C1482Ql f5384p;

    /* renamed from: q */
    public boolean f5385q;

    /* renamed from: r */
    public String f5386r;

    /* renamed from: s */
    public long f5387s;

    /* renamed from: t */
    public long f5388t;

    /* renamed from: u */
    public boolean f5389u;

    /* renamed from: v */
    public C1432Ol f5390v;

    /* renamed from: w */
    public int f5391w;

    /* renamed from: x */
    public int f5392x;

    /* renamed from: y */
    public C1307Jl f5393y;

    /* renamed from: z */
    public C1282Il f5394z;

    public C1506Rl() {
        m3305a();
    }

    /* renamed from: b */
    public static C1506Rl[] m3304b() {
        if (f5364H == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5364H == null) {
                        f5364H = new C1506Rl[0];
                    }
                } finally {
                }
            }
        }
        return f5364H;
    }

    /* renamed from: a */
    public final C1506Rl m3305a() {
        this.f5369a = "";
        this.f5370b = 0L;
        String[] strArr = WireFormatNano.EMPTY_STRING_ARRAY;
        this.f5371c = strArr;
        this.f5372d = "";
        this.f5373e = "";
        this.f5374f = strArr;
        this.f5375g = strArr;
        this.f5376h = C1332Kl.m3033b();
        this.f5377i = null;
        this.f5378j = "";
        this.f5379k = "";
        this.f5380l = "";
        this.f5381m = false;
        this.f5382n = "";
        this.f5383o = strArr;
        this.f5384p = null;
        this.f5385q = false;
        this.f5386r = "";
        this.f5387s = 0L;
        this.f5388t = 0L;
        this.f5389u = false;
        this.f5390v = null;
        this.f5391w = 600;
        this.f5392x = 1;
        this.f5393y = null;
        this.f5394z = null;
        this.f5365A = null;
        this.f5366B = null;
        this.f5367C = C1407Nl.m3129b();
        this.f5368D = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f5369a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f5369a);
        }
        int computeInt64Size = CodedOutputByteBufferNano.computeInt64Size(2, this.f5370b) + computeSerializedSize;
        String[] strArr = this.f5371c;
        int r3 = 0;
        if (strArr != null && strArr.length > 0) {
            int r02 = 0;
            int r4 = 0;
            int r5 = 0;
            while (true) {
                String[] strArr2 = this.f5371c;
                if (r02 >= strArr2.length) {
                    break;
                }
                String str = strArr2[r02];
                if (str != null) {
                    r5++;
                    r4 += CodedOutputByteBufferNano.computeStringSizeNoTag(str);
                }
                r02++;
            }
            computeInt64Size = computeInt64Size + r4 + r5;
        }
        if (!this.f5372d.equals("")) {
            computeInt64Size += CodedOutputByteBufferNano.computeStringSize(4, this.f5372d);
        }
        if (!this.f5373e.equals("")) {
            computeInt64Size += CodedOutputByteBufferNano.computeStringSize(5, this.f5373e);
        }
        String[] strArr3 = this.f5374f;
        if (strArr3 != null && strArr3.length > 0) {
            int r03 = 0;
            int r42 = 0;
            int r52 = 0;
            while (true) {
                String[] strArr4 = this.f5374f;
                if (r03 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[r03];
                if (str2 != null) {
                    r52++;
                    r42 += CodedOutputByteBufferNano.computeStringSizeNoTag(str2);
                }
                r03++;
            }
            computeInt64Size = computeInt64Size + r42 + r52;
        }
        String[] strArr5 = this.f5375g;
        if (strArr5 != null && strArr5.length > 0) {
            int r04 = 0;
            int r43 = 0;
            int r53 = 0;
            while (true) {
                String[] strArr6 = this.f5375g;
                if (r04 >= strArr6.length) {
                    break;
                }
                String str3 = strArr6[r04];
                if (str3 != null) {
                    r53++;
                    r43 += CodedOutputByteBufferNano.computeStringSizeNoTag(str3);
                }
                r04++;
            }
            computeInt64Size = computeInt64Size + r43 + r53;
        }
        C1332Kl[] c1332KlArr = this.f5376h;
        if (c1332KlArr != null && c1332KlArr.length > 0) {
            int r05 = 0;
            while (true) {
                C1332Kl[] c1332KlArr2 = this.f5376h;
                if (r05 >= c1332KlArr2.length) {
                    break;
                }
                C1332Kl c1332Kl = c1332KlArr2[r05];
                if (c1332Kl != null) {
                    computeInt64Size = CodedOutputByteBufferNano.computeMessageSize(8, c1332Kl) + computeInt64Size;
                }
                r05++;
            }
        }
        C1382Ml c1382Ml = this.f5377i;
        if (c1382Ml != null) {
            computeInt64Size += CodedOutputByteBufferNano.computeMessageSize(9, c1382Ml);
        }
        if (!this.f5378j.equals("")) {
            computeInt64Size += CodedOutputByteBufferNano.computeStringSize(10, this.f5378j);
        }
        if (!this.f5379k.equals("")) {
            computeInt64Size += CodedOutputByteBufferNano.computeStringSize(11, this.f5379k);
        }
        if (!this.f5380l.equals("")) {
            computeInt64Size += CodedOutputByteBufferNano.computeStringSize(12, this.f5380l);
        }
        int computeBoolSize = CodedOutputByteBufferNano.computeBoolSize(13, this.f5381m) + computeInt64Size;
        if (!this.f5382n.equals("")) {
            computeBoolSize += CodedOutputByteBufferNano.computeStringSize(14, this.f5382n);
        }
        String[] strArr7 = this.f5383o;
        if (strArr7 != null && strArr7.length > 0) {
            int r12 = 0;
            int r44 = 0;
            int r54 = 0;
            while (true) {
                String[] strArr8 = this.f5383o;
                if (r12 >= strArr8.length) {
                    break;
                }
                String str4 = strArr8[r12];
                if (str4 != null) {
                    r54++;
                    r44 += CodedOutputByteBufferNano.computeStringSizeNoTag(str4);
                }
                r12++;
            }
            computeBoolSize = computeBoolSize + r44 + r54;
        }
        C1482Ql c1482Ql = this.f5384p;
        if (c1482Ql != null) {
            computeBoolSize += CodedOutputByteBufferNano.computeMessageSize(16, c1482Ql);
        }
        boolean z2 = this.f5385q;
        if (z2) {
            computeBoolSize += CodedOutputByteBufferNano.computeBoolSize(17, z2);
        }
        if (!this.f5386r.equals("")) {
            computeBoolSize += CodedOutputByteBufferNano.computeStringSize(20, this.f5386r);
        }
        int computeInt64Size2 = CodedOutputByteBufferNano.computeInt64Size(22, this.f5388t) + CodedOutputByteBufferNano.computeInt64Size(21, this.f5387s) + computeBoolSize;
        boolean z3 = this.f5389u;
        if (z3) {
            computeInt64Size2 += CodedOutputByteBufferNano.computeBoolSize(23, z3);
        }
        C1432Ol c1432Ol = this.f5390v;
        if (c1432Ol != null) {
            computeInt64Size2 += CodedOutputByteBufferNano.computeMessageSize(24, c1432Ol);
        }
        int computeInt32Size = CodedOutputByteBufferNano.computeInt32Size(26, this.f5392x) + CodedOutputByteBufferNano.computeInt32Size(25, this.f5391w) + computeInt64Size2;
        C1307Jl c1307Jl = this.f5393y;
        if (c1307Jl != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(27, c1307Jl);
        }
        C1282Il c1282Il = this.f5394z;
        if (c1282Il != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(28, c1282Il);
        }
        C1257Hl c1257Hl = this.f5365A;
        if (c1257Hl != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(29, c1257Hl);
        }
        C1457Pl c1457Pl = this.f5366B;
        if (c1457Pl != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(30, c1457Pl);
        }
        C1407Nl[] c1407NlArr = this.f5367C;
        if (c1407NlArr != null && c1407NlArr.length > 0) {
            while (true) {
                C1407Nl[] c1407NlArr2 = this.f5367C;
                if (r3 >= c1407NlArr2.length) {
                    break;
                }
                C1407Nl c1407Nl = c1407NlArr2[r3];
                if (c1407Nl != null) {
                    computeInt32Size = CodedOutputByteBufferNano.computeMessageSize(31, c1407Nl) + computeInt32Size;
                }
                r3++;
            }
        }
        C1357Ll c1357Ll = this.f5368D;
        return c1357Ll != null ? computeInt32Size + CodedOutputByteBufferNano.computeMessageSize(32, c1357Ll) : computeInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f5369a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f5369a);
        }
        codedOutputByteBufferNano.writeInt64(2, this.f5370b);
        String[] strArr = this.f5371c;
        int r2 = 0;
        if (strArr != null && strArr.length > 0) {
            int r02 = 0;
            while (true) {
                String[] strArr2 = this.f5371c;
                if (r02 >= strArr2.length) {
                    break;
                }
                String str = strArr2[r02];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(3, str);
                }
                r02++;
            }
        }
        if (!this.f5372d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f5372d);
        }
        if (!this.f5373e.equals("")) {
            codedOutputByteBufferNano.writeString(5, this.f5373e);
        }
        String[] strArr3 = this.f5374f;
        if (strArr3 != null && strArr3.length > 0) {
            int r03 = 0;
            while (true) {
                String[] strArr4 = this.f5374f;
                if (r03 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[r03];
                if (str2 != null) {
                    codedOutputByteBufferNano.writeString(6, str2);
                }
                r03++;
            }
        }
        String[] strArr5 = this.f5375g;
        if (strArr5 != null && strArr5.length > 0) {
            int r04 = 0;
            while (true) {
                String[] strArr6 = this.f5375g;
                if (r04 >= strArr6.length) {
                    break;
                }
                String str3 = strArr6[r04];
                if (str3 != null) {
                    codedOutputByteBufferNano.writeString(7, str3);
                }
                r04++;
            }
        }
        C1332Kl[] c1332KlArr = this.f5376h;
        if (c1332KlArr != null && c1332KlArr.length > 0) {
            int r05 = 0;
            while (true) {
                C1332Kl[] c1332KlArr2 = this.f5376h;
                if (r05 >= c1332KlArr2.length) {
                    break;
                }
                C1332Kl c1332Kl = c1332KlArr2[r05];
                if (c1332Kl != null) {
                    codedOutputByteBufferNano.writeMessage(8, c1332Kl);
                }
                r05++;
            }
        }
        C1382Ml c1382Ml = this.f5377i;
        if (c1382Ml != null) {
            codedOutputByteBufferNano.writeMessage(9, c1382Ml);
        }
        if (!this.f5378j.equals("")) {
            codedOutputByteBufferNano.writeString(10, this.f5378j);
        }
        if (!this.f5379k.equals("")) {
            codedOutputByteBufferNano.writeString(11, this.f5379k);
        }
        if (!this.f5380l.equals("")) {
            codedOutputByteBufferNano.writeString(12, this.f5380l);
        }
        codedOutputByteBufferNano.writeBool(13, this.f5381m);
        if (!this.f5382n.equals("")) {
            codedOutputByteBufferNano.writeString(14, this.f5382n);
        }
        String[] strArr7 = this.f5383o;
        if (strArr7 != null && strArr7.length > 0) {
            int r06 = 0;
            while (true) {
                String[] strArr8 = this.f5383o;
                if (r06 >= strArr8.length) {
                    break;
                }
                String str4 = strArr8[r06];
                if (str4 != null) {
                    codedOutputByteBufferNano.writeString(15, str4);
                }
                r06++;
            }
        }
        C1482Ql c1482Ql = this.f5384p;
        if (c1482Ql != null) {
            codedOutputByteBufferNano.writeMessage(16, c1482Ql);
        }
        boolean z2 = this.f5385q;
        if (z2) {
            codedOutputByteBufferNano.writeBool(17, z2);
        }
        if (!this.f5386r.equals("")) {
            codedOutputByteBufferNano.writeString(20, this.f5386r);
        }
        codedOutputByteBufferNano.writeInt64(21, this.f5387s);
        codedOutputByteBufferNano.writeInt64(22, this.f5388t);
        boolean z3 = this.f5389u;
        if (z3) {
            codedOutputByteBufferNano.writeBool(23, z3);
        }
        C1432Ol c1432Ol = this.f5390v;
        if (c1432Ol != null) {
            codedOutputByteBufferNano.writeMessage(24, c1432Ol);
        }
        codedOutputByteBufferNano.writeInt32(25, this.f5391w);
        codedOutputByteBufferNano.writeInt32(26, this.f5392x);
        C1307Jl c1307Jl = this.f5393y;
        if (c1307Jl != null) {
            codedOutputByteBufferNano.writeMessage(27, c1307Jl);
        }
        C1282Il c1282Il = this.f5394z;
        if (c1282Il != null) {
            codedOutputByteBufferNano.writeMessage(28, c1282Il);
        }
        C1257Hl c1257Hl = this.f5365A;
        if (c1257Hl != null) {
            codedOutputByteBufferNano.writeMessage(29, c1257Hl);
        }
        C1457Pl c1457Pl = this.f5366B;
        if (c1457Pl != null) {
            codedOutputByteBufferNano.writeMessage(30, c1457Pl);
        }
        C1407Nl[] c1407NlArr = this.f5367C;
        if (c1407NlArr != null && c1407NlArr.length > 0) {
            while (true) {
                C1407Nl[] c1407NlArr2 = this.f5367C;
                if (r2 >= c1407NlArr2.length) {
                    break;
                }
                C1407Nl c1407Nl = c1407NlArr2[r2];
                if (c1407Nl != null) {
                    codedOutputByteBufferNano.writeMessage(31, c1407Nl);
                }
                r2++;
            }
        }
        C1357Ll c1357Ll = this.f5368D;
        if (c1357Ll != null) {
            codedOutputByteBufferNano.writeMessage(32, c1357Ll);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    /* renamed from: b */
    public static C1506Rl m3303b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1506Rl().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1506Rl mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    return this;
                case 10:
                    this.f5369a = codedInputByteBufferNano.readString();
                    break;
                case 16:
                    this.f5370b = codedInputByteBufferNano.readInt64();
                    break;
                case C1842f9.f6212I /* 26 */:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                    String[] strArr = this.f5371c;
                    int length = strArr == null ? 0 : strArr.length;
                    int r02 = repeatedFieldArrayLength + length;
                    String[] strArr2 = new String[r02];
                    if (length != 0) {
                        System.arraycopy(strArr, 0, strArr2, 0, length);
                    }
                    while (length < r02 - 1) {
                        strArr2[length] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    strArr2[length] = codedInputByteBufferNano.readString();
                    this.f5371c = strArr2;
                    break;
                case 34:
                    this.f5372d = codedInputByteBufferNano.readString();
                    break;
                case C1842f9.f6218O /* 42 */:
                    this.f5373e = codedInputByteBufferNano.readString();
                    break;
                case 50:
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 50);
                    String[] strArr3 = this.f5374f;
                    int length2 = strArr3 == null ? 0 : strArr3.length;
                    int r03 = repeatedFieldArrayLength2 + length2;
                    String[] strArr4 = new String[r03];
                    if (length2 != 0) {
                        System.arraycopy(strArr3, 0, strArr4, 0, length2);
                    }
                    while (length2 < r03 - 1) {
                        strArr4[length2] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length2++;
                    }
                    strArr4[length2] = codedInputByteBufferNano.readString();
                    this.f5374f = strArr4;
                    break;
                case 58:
                    int repeatedFieldArrayLength3 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                    String[] strArr5 = this.f5375g;
                    int length3 = strArr5 == null ? 0 : strArr5.length;
                    int r04 = repeatedFieldArrayLength3 + length3;
                    String[] strArr6 = new String[r04];
                    if (length3 != 0) {
                        System.arraycopy(strArr5, 0, strArr6, 0, length3);
                    }
                    while (length3 < r04 - 1) {
                        strArr6[length3] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length3++;
                    }
                    strArr6[length3] = codedInputByteBufferNano.readString();
                    this.f5375g = strArr6;
                    break;
                case 66:
                    int repeatedFieldArrayLength4 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 66);
                    C1332Kl[] c1332KlArr = this.f5376h;
                    int length4 = c1332KlArr == null ? 0 : c1332KlArr.length;
                    int r05 = repeatedFieldArrayLength4 + length4;
                    C1332Kl[] c1332KlArr2 = new C1332Kl[r05];
                    if (length4 != 0) {
                        System.arraycopy(c1332KlArr, 0, c1332KlArr2, 0, length4);
                    }
                    while (length4 < r05 - 1) {
                        C1332Kl c1332Kl = new C1332Kl();
                        c1332KlArr2[length4] = c1332Kl;
                        codedInputByteBufferNano.readMessage(c1332Kl);
                        codedInputByteBufferNano.readTag();
                        length4++;
                    }
                    C1332Kl c1332Kl2 = new C1332Kl();
                    c1332KlArr2[length4] = c1332Kl2;
                    codedInputByteBufferNano.readMessage(c1332Kl2);
                    this.f5376h = c1332KlArr2;
                    break;
                case 74:
                    if (this.f5377i == null) {
                        this.f5377i = new C1382Ml();
                    }
                    codedInputByteBufferNano.readMessage(this.f5377i);
                    break;
                case 82:
                    this.f5378j = codedInputByteBufferNano.readString();
                    break;
                case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                    this.f5379k = codedInputByteBufferNano.readString();
                    break;
                case 98:
                    this.f5380l = codedInputByteBufferNano.readString();
                    break;
                case 104:
                    this.f5381m = codedInputByteBufferNano.readBool();
                    break;
                case BuildConfig.API_LEVEL /* 114 */:
                    this.f5382n = codedInputByteBufferNano.readString();
                    break;
                case 122:
                    int repeatedFieldArrayLength5 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 122);
                    String[] strArr7 = this.f5383o;
                    int length5 = strArr7 == null ? 0 : strArr7.length;
                    int r06 = repeatedFieldArrayLength5 + length5;
                    String[] strArr8 = new String[r06];
                    if (length5 != 0) {
                        System.arraycopy(strArr7, 0, strArr8, 0, length5);
                    }
                    while (length5 < r06 - 1) {
                        strArr8[length5] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length5++;
                    }
                    strArr8[length5] = codedInputByteBufferNano.readString();
                    this.f5383o = strArr8;
                    break;
                case 130:
                    if (this.f5384p == null) {
                        this.f5384p = new C1482Ql();
                    }
                    codedInputByteBufferNano.readMessage(this.f5384p);
                    break;
                case 136:
                    this.f5385q = codedInputByteBufferNano.readBool();
                    break;
                case 162:
                    this.f5386r = codedInputByteBufferNano.readString();
                    break;
                case 168:
                    this.f5387s = codedInputByteBufferNano.readInt64();
                    break;
                case 176:
                    this.f5388t = codedInputByteBufferNano.readInt64();
                    break;
                case 184:
                    this.f5389u = codedInputByteBufferNano.readBool();
                    break;
                case 194:
                    if (this.f5390v == null) {
                        this.f5390v = new C1432Ol();
                    }
                    codedInputByteBufferNano.readMessage(this.f5390v);
                    break;
                case 200:
                    this.f5391w = codedInputByteBufferNano.readInt32();
                    break;
                case 208:
                    this.f5392x = codedInputByteBufferNano.readInt32();
                    break;
                case 218:
                    if (this.f5393y == null) {
                        this.f5393y = new C1307Jl();
                    }
                    codedInputByteBufferNano.readMessage(this.f5393y);
                    break;
                case 226:
                    if (this.f5394z == null) {
                        this.f5394z = new C1282Il();
                    }
                    codedInputByteBufferNano.readMessage(this.f5394z);
                    break;
                case 234:
                    if (this.f5365A == null) {
                        this.f5365A = new C1257Hl();
                    }
                    codedInputByteBufferNano.readMessage(this.f5365A);
                    break;
                case 242:
                    if (this.f5366B == null) {
                        this.f5366B = new C1457Pl();
                    }
                    codedInputByteBufferNano.readMessage(this.f5366B);
                    break;
                case 250:
                    int repeatedFieldArrayLength6 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 250);
                    C1407Nl[] c1407NlArr = this.f5367C;
                    int length6 = c1407NlArr == null ? 0 : c1407NlArr.length;
                    int r07 = repeatedFieldArrayLength6 + length6;
                    C1407Nl[] c1407NlArr2 = new C1407Nl[r07];
                    if (length6 != 0) {
                        System.arraycopy(c1407NlArr, 0, c1407NlArr2, 0, length6);
                    }
                    while (length6 < r07 - 1) {
                        C1407Nl c1407Nl = new C1407Nl();
                        c1407NlArr2[length6] = c1407Nl;
                        codedInputByteBufferNano.readMessage(c1407Nl);
                        codedInputByteBufferNano.readTag();
                        length6++;
                    }
                    C1407Nl c1407Nl2 = new C1407Nl();
                    c1407NlArr2[length6] = c1407Nl2;
                    codedInputByteBufferNano.readMessage(c1407Nl2);
                    this.f5367C = c1407NlArr2;
                    break;
                case 258:
                    if (this.f5368D == null) {
                        this.f5368D = new C1357Ll();
                    }
                    codedInputByteBufferNano.readMessage(this.f5368D);
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        return this;
                    }
                    break;
            }
        }
    }

    /* renamed from: a */
    public static C1506Rl m3302a(byte[] bArr) {
        return (C1506Rl) MessageNano.mergeFrom(new C1506Rl(), bArr);
    }
}
