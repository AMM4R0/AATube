package p051R1;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.AbstractC2492i;
import p000A.AbstractC0002c;
import p002A1.AbstractC0008a;
import p036M1.AbstractC0379e;
import p054S1.AbstractC0502a;
import p108m1.AbstractC2658h;

/* renamed from: R1.g */
/* loaded from: classes.dex */
public final class C0477g implements InterfaceC0479i, InterfaceC0478h, Cloneable, ByteChannel {

    /* renamed from: a */
    public C0495y f1216a;

    /* renamed from: b */
    public long f1217b;

    /* renamed from: A */
    public final void m1246A(long j2) {
        boolean z2;
        byte[] bArr;
        if (j2 == 0) {
            m1274z(48);
            return;
        }
        int r3 = 1;
        if (j2 < 0) {
            j2 = -j2;
            if (j2 < 0) {
                m1249D("-9223372036854775808");
                return;
            }
            z2 = true;
        } else {
            z2 = false;
        }
        if (j2 >= 100000000) {
            r3 = j2 < 1000000000000L ? j2 < 10000000000L ? j2 < 1000000000 ? 9 : 10 : j2 < 100000000000L ? 11 : 12 : j2 < 1000000000000000L ? j2 < 10000000000000L ? 13 : j2 < 100000000000000L ? 14 : 15 : j2 < 100000000000000000L ? j2 < 10000000000000000L ? 16 : 17 : j2 < 1000000000000000000L ? 18 : 19;
        } else if (j2 >= 10000) {
            r3 = j2 < 1000000 ? j2 < 100000 ? 5 : 6 : j2 < 10000000 ? 7 : 8;
        } else if (j2 >= 100) {
            r3 = j2 < 1000 ? 3 : 4;
        } else if (j2 >= 10) {
            r3 = 2;
        }
        if (z2) {
            r3++;
        }
        C0495y m1270v = m1270v(r3);
        int r6 = m1270v.f1254c + r3;
        while (true) {
            bArr = m1270v.f1252a;
            if (j2 == 0) {
                break;
            }
            long j3 = 10;
            r6--;
            bArr[r6] = AbstractC0502a.f1291a[(int) (j2 % j3)];
            j2 /= j3;
        }
        if (z2) {
            bArr[r6 - 1] = 45;
        }
        m1270v.f1254c += r3;
        this.f1217b += r3;
    }

    /* renamed from: B */
    public final void m1247B(long j2) {
        if (j2 == 0) {
            m1274z(48);
            return;
        }
        long j3 = (j2 >>> 1) | j2;
        long j4 = j3 | (j3 >>> 2);
        long j5 = j4 | (j4 >>> 4);
        long j6 = j5 | (j5 >>> 8);
        long j7 = j6 | (j6 >>> 16);
        long j8 = j7 | (j7 >>> 32);
        long j9 = j8 - ((j8 >>> 1) & 6148914691236517205L);
        long j10 = ((j9 >>> 2) & 3689348814741910323L) + (j9 & 3689348814741910323L);
        long j11 = ((j10 >>> 4) + j10) & 1085102592571150095L;
        long j12 = j11 + (j11 >>> 8);
        long j13 = j12 + (j12 >>> 16);
        int r12 = (int) ((((j13 & 63) + ((j13 >>> 32) & 63)) + 3) / 4);
        C0495y m1270v = m1270v(r12);
        int r3 = m1270v.f1254c;
        for (int r5 = (r3 + r12) - 1; r5 >= r3; r5--) {
            m1270v.f1252a[r5] = AbstractC0502a.f1291a[(int) (15 & j2)];
            j2 >>>= 4;
        }
        m1270v.f1254c += r12;
        this.f1217b += r12;
    }

    /* renamed from: C */
    public final void m1248C(int r8) {
        C0495y m1270v = m1270v(4);
        int r2 = m1270v.f1254c;
        byte b2 = (byte) ((r8 >>> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
        byte[] bArr = m1270v.f1252a;
        bArr[r2] = b2;
        bArr[r2 + 1] = (byte) ((r8 >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[r2 + 2] = (byte) ((r8 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[r2 + 3] = (byte) (r8 & KotlinVersion.MAX_COMPONENT_VALUE);
        m1270v.f1254c = r2 + 4;
        this.f1217b += 4;
    }

    /* renamed from: D */
    public final void m1249D(String string) {
        AbstractC2492i.m4915e(string, "string");
        m1250E(string, 0, string.length());
    }

    /* renamed from: E */
    public final void m1250E(String string, int r11, int r12) {
        char charAt;
        AbstractC2492i.m4915e(string, "string");
        if (r11 < 0) {
            throw new IllegalArgumentException(AbstractC0002c.m11f(r11, "beginIndex < 0: ").toString());
        }
        if (r12 < r11) {
            throw new IllegalArgumentException(AbstractC0002c.m12g("endIndex < beginIndex: ", r12, r11, " < ").toString());
        }
        if (r12 > string.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + r12 + " > " + string.length()).toString());
        }
        while (r11 < r12) {
            char charAt2 = string.charAt(r11);
            if (charAt2 < 128) {
                C0495y m1270v = m1270v(1);
                int r3 = m1270v.f1254c - r11;
                int min = Math.min(r12, 8192 - r3);
                int r5 = r11 + 1;
                byte[] bArr = m1270v.f1252a;
                bArr[r11 + r3] = (byte) charAt2;
                while (true) {
                    r11 = r5;
                    if (r11 >= min || (charAt = string.charAt(r11)) >= 128) {
                        break;
                    }
                    r5 = r11 + 1;
                    bArr[r11 + r3] = (byte) charAt;
                }
                int r02 = m1270v.f1254c;
                int r32 = (r3 + r11) - r02;
                m1270v.f1254c = r02 + r32;
                this.f1217b += r32;
            } else {
                if (charAt2 < 2048) {
                    C0495y m1270v2 = m1270v(2);
                    int r4 = m1270v2.f1254c;
                    byte[] bArr2 = m1270v2.f1252a;
                    bArr2[r4] = (byte) ((charAt2 >> 6) | 192);
                    bArr2[r4 + 1] = (byte) ((charAt2 & '?') | 128);
                    m1270v2.f1254c = r4 + 2;
                    this.f1217b += 2;
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    C0495y m1270v3 = m1270v(3);
                    int r52 = m1270v3.f1254c;
                    byte[] bArr3 = m1270v3.f1252a;
                    bArr3[r52] = (byte) ((charAt2 >> '\f') | 224);
                    bArr3[r52 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                    bArr3[r52 + 2] = (byte) ((charAt2 & '?') | 128);
                    m1270v3.f1254c = r52 + 3;
                    this.f1217b += 3;
                } else {
                    int r2 = r11 + 1;
                    char charAt3 = r2 < r12 ? string.charAt(r2) : (char) 0;
                    if (charAt2 > 56319 || 56320 > charAt3 || charAt3 >= 57344) {
                        m1274z(63);
                        r11 = r2;
                    } else {
                        int r03 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        C0495y m1270v4 = m1270v(4);
                        int r53 = m1270v4.f1254c;
                        byte[] bArr4 = m1270v4.f1252a;
                        bArr4[r53] = (byte) ((r03 >> 18) | 240);
                        bArr4[r53 + 1] = (byte) (((r03 >> 12) & 63) | 128);
                        bArr4[r53 + 2] = (byte) (((r03 >> 6) & 63) | 128);
                        bArr4[r53 + 3] = (byte) ((r03 & 63) | 128);
                        m1270v4.f1254c = r53 + 4;
                        this.f1217b += 4;
                        r11 += 2;
                    }
                }
                r11++;
            }
        }
    }

    /* renamed from: F */
    public final void m1251F(int r9) {
        if (r9 < 128) {
            m1274z(r9);
            return;
        }
        if (r9 < 2048) {
            C0495y m1270v = m1270v(2);
            int r4 = m1270v.f1254c;
            byte[] bArr = m1270v.f1252a;
            bArr[r4] = (byte) ((r9 >> 6) | 192);
            bArr[r4 + 1] = (byte) ((r9 & 63) | 128);
            m1270v.f1254c = r4 + 2;
            this.f1217b += 2;
            return;
        }
        if (55296 <= r9 && r9 < 57344) {
            m1274z(63);
            return;
        }
        if (r9 < 65536) {
            C0495y m1270v2 = m1270v(3);
            int r42 = m1270v2.f1254c;
            byte[] bArr2 = m1270v2.f1252a;
            bArr2[r42] = (byte) ((r9 >> 12) | 224);
            bArr2[r42 + 1] = (byte) (((r9 >> 6) & 63) | 128);
            bArr2[r42 + 2] = (byte) ((r9 & 63) | 128);
            m1270v2.f1254c = r42 + 3;
            this.f1217b += 3;
            return;
        }
        if (r9 > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x".concat(AbstractC0379e.m1068D(r9)));
        }
        C0495y m1270v3 = m1270v(4);
        int r43 = m1270v3.f1254c;
        byte[] bArr3 = m1270v3.f1252a;
        bArr3[r43] = (byte) ((r9 >> 18) | 240);
        bArr3[r43 + 1] = (byte) (((r9 >> 12) & 63) | 128);
        bArr3[r43 + 2] = (byte) (((r9 >> 6) & 63) | 128);
        bArr3[r43 + 3] = (byte) ((r9 & 63) | 128);
        m1270v3.f1254c = r43 + 4;
        this.f1217b += 4;
    }

    @Override // p051R1.InterfaceC0467D
    /* renamed from: a */
    public final long mo390a(C0477g sink, long j2) {
        AbstractC2492i.m4915e(sink, "sink");
        if (j2 < 0) {
            throw new IllegalArgumentException(AbstractC0002c.m14i("byteCount < 0: ", j2).toString());
        }
        long j3 = this.f1217b;
        if (j3 == 0) {
            return -1L;
        }
        if (j2 > j3) {
            j2 = j3;
        }
        sink.mo497e(this, j2);
        return j2;
    }

    /* renamed from: b */
    public final boolean m1252b() {
        return this.f1217b == 0;
    }

    @Override // p051R1.InterfaceC0478h
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ InterfaceC0478h mo1253c(String str) {
        m1249D(str);
        return this;
    }

    public final Object clone() {
        C0477g c0477g = new C0477g();
        if (this.f1217b != 0) {
            C0495y c0495y = this.f1216a;
            AbstractC2492i.m4912b(c0495y);
            C0495y m1306c = c0495y.m1306c();
            c0477g.f1216a = m1306c;
            m1306c.f1258g = m1306c;
            m1306c.f1257f = m1306c;
            for (C0495y c0495y2 = c0495y.f1257f; c0495y2 != c0495y; c0495y2 = c0495y2.f1257f) {
                C0495y c0495y3 = m1306c.f1258g;
                AbstractC2492i.m4912b(c0495y3);
                AbstractC2492i.m4912b(c0495y2);
                c0495y3.m1305b(c0495y2.m1306c());
            }
            c0477g.f1217b = this.f1217b;
        }
        return c0477g;
    }

    @Override // p051R1.InterfaceC0467D
    /* renamed from: d */
    public final C0469F mo391d() {
        return C0469F.f1191d;
    }

    @Override // p051R1.InterfaceC0465B
    /* renamed from: e */
    public final void mo497e(C0477g source, long j2) {
        C0495y m1309b;
        AbstractC2492i.m4915e(source, "source");
        if (source == this) {
            throw new IllegalArgumentException("source == this");
        }
        AbstractC0379e.m1074e(source.f1217b, 0L, j2);
        while (j2 > 0) {
            C0495y c0495y = source.f1216a;
            AbstractC2492i.m4912b(c0495y);
            int r02 = c0495y.f1254c;
            C0495y c0495y2 = source.f1216a;
            AbstractC2492i.m4912b(c0495y2);
            long j3 = r02 - c0495y2.f1253b;
            int r12 = 0;
            if (j2 < j3) {
                C0495y c0495y3 = this.f1216a;
                C0495y c0495y4 = c0495y3 != null ? c0495y3.f1258g : null;
                if (c0495y4 != null && c0495y4.f1256e) {
                    if ((c0495y4.f1254c + j2) - (c0495y4.f1255d ? 0 : c0495y4.f1253b) <= 8192) {
                        C0495y c0495y5 = source.f1216a;
                        AbstractC2492i.m4912b(c0495y5);
                        c0495y5.m1307d(c0495y4, (int) j2);
                        source.f1217b -= j2;
                        this.f1217b += j2;
                        return;
                    }
                }
                C0495y c0495y6 = source.f1216a;
                AbstractC2492i.m4912b(c0495y6);
                int r2 = (int) j2;
                if (r2 <= 0 || r2 > c0495y6.f1254c - c0495y6.f1253b) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (r2 >= 1024) {
                    m1309b = c0495y6.m1306c();
                } else {
                    m1309b = AbstractC0496z.m1309b();
                    int r4 = c0495y6.f1253b;
                    AbstractC2658h.m5105C(0, r4, r4 + r2, c0495y6.f1252a, m1309b.f1252a);
                }
                m1309b.f1254c = m1309b.f1253b + r2;
                c0495y6.f1253b += r2;
                C0495y c0495y7 = c0495y6.f1258g;
                AbstractC2492i.m4912b(c0495y7);
                c0495y7.m1305b(m1309b);
                source.f1216a = m1309b;
            }
            C0495y c0495y8 = source.f1216a;
            AbstractC2492i.m4912b(c0495y8);
            long j4 = c0495y8.f1254c - c0495y8.f1253b;
            source.f1216a = c0495y8.m1304a();
            C0495y c0495y9 = this.f1216a;
            if (c0495y9 == null) {
                this.f1216a = c0495y8;
                c0495y8.f1258g = c0495y8;
                c0495y8.f1257f = c0495y8;
            } else {
                C0495y c0495y10 = c0495y9.f1258g;
                AbstractC2492i.m4912b(c0495y10);
                c0495y10.m1305b(c0495y8);
                C0495y c0495y11 = c0495y8.f1258g;
                if (c0495y11 == c0495y8) {
                    throw new IllegalStateException("cannot compact");
                }
                AbstractC2492i.m4912b(c0495y11);
                if (c0495y11.f1256e) {
                    int r42 = c0495y8.f1254c - c0495y8.f1253b;
                    C0495y c0495y12 = c0495y8.f1258g;
                    AbstractC2492i.m4912b(c0495y12);
                    int r5 = 8192 - c0495y12.f1254c;
                    C0495y c0495y13 = c0495y8.f1258g;
                    AbstractC2492i.m4912b(c0495y13);
                    if (!c0495y13.f1255d) {
                        C0495y c0495y14 = c0495y8.f1258g;
                        AbstractC2492i.m4912b(c0495y14);
                        r12 = c0495y14.f1253b;
                    }
                    if (r42 <= r5 + r12) {
                        C0495y c0495y15 = c0495y8.f1258g;
                        AbstractC2492i.m4912b(c0495y15);
                        c0495y8.m1307d(c0495y15, r42);
                        c0495y8.m1304a();
                        AbstractC0496z.m1308a(c0495y8);
                    }
                }
            }
            source.f1217b -= j4;
            this.f1217b += j4;
            j2 -= j4;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C0477g) {
                long j2 = this.f1217b;
                C0477g c0477g = (C0477g) obj;
                if (j2 == c0477g.f1217b) {
                    if (j2 != 0) {
                        C0495y c0495y = this.f1216a;
                        AbstractC2492i.m4912b(c0495y);
                        C0495y c0495y2 = c0477g.f1216a;
                        AbstractC2492i.m4912b(c0495y2);
                        int r5 = c0495y.f1253b;
                        int r6 = c0495y2.f1253b;
                        long j3 = 0;
                        while (j3 < this.f1217b) {
                            long min = Math.min(c0495y.f1254c - r5, c0495y2.f1254c - r6);
                            long j4 = 0;
                            while (j4 < min) {
                                int r15 = r5 + 1;
                                byte b2 = c0495y.f1252a[r5];
                                int r52 = r6 + 1;
                                if (b2 == c0495y2.f1252a[r6]) {
                                    j4++;
                                    r6 = r52;
                                    r5 = r15;
                                }
                            }
                            if (r5 == c0495y.f1254c) {
                                C0495y c0495y3 = c0495y.f1257f;
                                AbstractC2492i.m4912b(c0495y3);
                                r5 = c0495y3.f1253b;
                                c0495y = c0495y3;
                            }
                            if (r6 == c0495y2.f1254c) {
                                c0495y2 = c0495y2.f1257f;
                                AbstractC2492i.m4912b(c0495y2);
                                r6 = c0495y2.f1253b;
                            }
                            j3 += min;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // p051R1.InterfaceC0479i
    /* renamed from: f */
    public final InputStream mo1254f() {
        return new C0476f(this, 0);
    }

    /* renamed from: g */
    public final byte m1255g(long j2) {
        AbstractC0379e.m1074e(this.f1217b, j2, 1L);
        C0495y c0495y = this.f1216a;
        if (c0495y == null) {
            AbstractC2492i.m4912b(null);
            throw null;
        }
        long j3 = this.f1217b;
        if (j3 - j2 < j2) {
            while (j3 > j2) {
                c0495y = c0495y.f1258g;
                AbstractC2492i.m4912b(c0495y);
                j3 -= c0495y.f1254c - c0495y.f1253b;
            }
            return c0495y.f1252a[(int) ((c0495y.f1253b + j2) - j3)];
        }
        long j4 = 0;
        while (true) {
            int r3 = c0495y.f1254c;
            int r4 = c0495y.f1253b;
            long j5 = (r3 - r4) + j4;
            if (j5 > j2) {
                return c0495y.f1252a[(int) ((r4 + j2) - j4)];
            }
            c0495y = c0495y.f1257f;
            AbstractC2492i.m4912b(c0495y);
            j4 = j5;
        }
    }

    /* renamed from: h */
    public final long m1256h(C0480j targetBytes) {
        int r5;
        int r14;
        AbstractC2492i.m4915e(targetBytes, "targetBytes");
        C0495y c0495y = this.f1216a;
        if (c0495y == null) {
            return -1L;
        }
        long j2 = this.f1217b;
        long j3 = 0;
        byte[] bArr = targetBytes.f1219a;
        if (j2 < 0) {
            while (j2 > 0) {
                c0495y = c0495y.f1258g;
                AbstractC2492i.m4912b(c0495y);
                j2 -= c0495y.f1254c - c0495y.f1253b;
            }
            if (bArr.length == 2) {
                byte b2 = bArr[0];
                byte b3 = bArr[1];
                while (j2 < this.f1217b) {
                    r5 = (int) ((c0495y.f1253b + j3) - j2);
                    int r6 = c0495y.f1254c;
                    while (r5 < r6) {
                        byte b4 = c0495y.f1252a[r5];
                        if (b4 != b2 && b4 != b3) {
                            r5++;
                        }
                        r14 = c0495y.f1253b;
                    }
                    j3 = (c0495y.f1254c - c0495y.f1253b) + j2;
                    c0495y = c0495y.f1257f;
                    AbstractC2492i.m4912b(c0495y);
                    j2 = j3;
                }
                return -1L;
            }
            while (j2 < this.f1217b) {
                r5 = (int) ((c0495y.f1253b + j3) - j2);
                int r62 = c0495y.f1254c;
                while (r5 < r62) {
                    byte b5 = c0495y.f1252a[r5];
                    for (byte b6 : bArr) {
                        if (b5 == b6) {
                            r14 = c0495y.f1253b;
                        }
                    }
                    r5++;
                }
                j3 = (c0495y.f1254c - c0495y.f1253b) + j2;
                c0495y = c0495y.f1257f;
                AbstractC2492i.m4912b(c0495y);
                j2 = j3;
            }
            return -1L;
        }
        j2 = 0;
        while (true) {
            long j4 = (c0495y.f1254c - c0495y.f1253b) + j2;
            if (j4 > 0) {
                break;
            }
            c0495y = c0495y.f1257f;
            AbstractC2492i.m4912b(c0495y);
            j2 = j4;
        }
        if (bArr.length == 2) {
            byte b7 = bArr[0];
            byte b8 = bArr[1];
            while (j2 < this.f1217b) {
                r5 = (int) ((c0495y.f1253b + j3) - j2);
                int r63 = c0495y.f1254c;
                while (r5 < r63) {
                    byte b9 = c0495y.f1252a[r5];
                    if (b9 != b7 && b9 != b8) {
                        r5++;
                    }
                    r14 = c0495y.f1253b;
                }
                j3 = (c0495y.f1254c - c0495y.f1253b) + j2;
                c0495y = c0495y.f1257f;
                AbstractC2492i.m4912b(c0495y);
                j2 = j3;
            }
            return -1L;
        }
        while (j2 < this.f1217b) {
            r5 = (int) ((c0495y.f1253b + j3) - j2);
            int r64 = c0495y.f1254c;
            while (r5 < r64) {
                byte b10 = c0495y.f1252a[r5];
                for (byte b11 : bArr) {
                    if (b10 == b11) {
                        r14 = c0495y.f1253b;
                    }
                }
                r5++;
            }
            j3 = (c0495y.f1254c - c0495y.f1253b) + j2;
            c0495y = c0495y.f1257f;
            AbstractC2492i.m4912b(c0495y);
            j2 = j3;
        }
        return -1L;
        return (r5 - r14) + j2;
    }

    public final int hashCode() {
        C0495y c0495y = this.f1216a;
        if (c0495y == null) {
            return 0;
        }
        int r12 = 1;
        do {
            int r3 = c0495y.f1254c;
            for (int r2 = c0495y.f1253b; r2 < r3; r2++) {
                r12 = (r12 * 31) + c0495y.f1252a[r2];
            }
            c0495y = c0495y.f1257f;
            AbstractC2492i.m4912b(c0495y);
        } while (c0495y != this.f1216a);
        return r12;
    }

    /* renamed from: i */
    public final boolean m1257i(C0480j bytes) {
        AbstractC2492i.m4915e(bytes, "bytes");
        byte[] bArr = bytes.f1219a;
        int length = bArr.length;
        if (length < 0 || this.f1217b < length || bArr.length < length) {
            return false;
        }
        for (int r2 = 0; r2 < length; r2++) {
            if (m1255g(r2) != bArr[r2]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    /* renamed from: j */
    public final int m1258j(byte[] sink, int r9, int r10) {
        AbstractC2492i.m4915e(sink, "sink");
        AbstractC0379e.m1074e(sink.length, r9, r10);
        C0495y c0495y = this.f1216a;
        if (c0495y == null) {
            return -1;
        }
        int min = Math.min(r10, c0495y.f1254c - c0495y.f1253b);
        int r12 = c0495y.f1253b;
        AbstractC2658h.m5105C(r9, r12, r12 + min, c0495y.f1252a, sink);
        int r8 = c0495y.f1253b + min;
        c0495y.f1253b = r8;
        this.f1217b -= min;
        if (r8 == c0495y.f1254c) {
            this.f1216a = c0495y.m1304a();
            AbstractC0496z.m1308a(c0495y);
        }
        return min;
    }

    /* renamed from: k */
    public final byte m1259k() {
        if (this.f1217b == 0) {
            throw new EOFException();
        }
        C0495y c0495y = this.f1216a;
        AbstractC2492i.m4912b(c0495y);
        int r12 = c0495y.f1253b;
        int r2 = c0495y.f1254c;
        int r3 = r12 + 1;
        byte b2 = c0495y.f1252a[r12];
        this.f1217b--;
        if (r3 == r2) {
            this.f1216a = c0495y.m1304a();
            AbstractC0496z.m1308a(c0495y);
        } else {
            c0495y.f1253b = r3;
        }
        return b2;
    }

    /* renamed from: l */
    public final byte[] m1260l(long j2) {
        if (j2 < 0 || j2 > 2147483647L) {
            throw new IllegalArgumentException(AbstractC0002c.m14i("byteCount: ", j2).toString());
        }
        if (this.f1217b < j2) {
            throw new EOFException();
        }
        int r4 = (int) j2;
        byte[] bArr = new byte[r4];
        int r02 = 0;
        while (r02 < r4) {
            int m1258j = m1258j(bArr, r02, r4 - r02);
            if (m1258j == -1) {
                throw new EOFException();
            }
            r02 += m1258j;
        }
        return bArr;
    }

    /* renamed from: m */
    public final C0480j m1261m(long j2) {
        if (j2 < 0 || j2 > 2147483647L) {
            throw new IllegalArgumentException(AbstractC0002c.m14i("byteCount: ", j2).toString());
        }
        if (this.f1217b < j2) {
            throw new EOFException();
        }
        if (j2 < 4096) {
            return new C0480j(m1260l(j2));
        }
        C0480j m1269u = m1269u((int) j2);
        m1268t(j2);
        return m1269u;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a4 A[EDGE_INSN: B:40:0x00a4->B:37:0x00a4 BREAK  A[LOOP:0: B:4:0x0012->B:39:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009c  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long m1262n() {
        /*
            r18 = this;
            r0 = r18
            r1 = 4
            r2 = 48
            r3 = 0
            r4 = 1
            long r5 = r0.f1217b
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto Lab
            r9 = r3
            r10 = r9
            r5 = r7
        L12:
            R1.y r11 = r0.f1216a
            kotlin.jvm.internal.AbstractC2492i.m4912b(r11)
            int r12 = r11.f1253b
            int r13 = r11.f1254c
        L1b:
            if (r12 >= r13) goto L90
            byte[] r14 = r11.f1252a
            r14 = r14[r12]
            if (r14 < r2) goto L2a
            r15 = 57
            if (r14 > r15) goto L2a
            int r15 = r14 + (-48)
            goto L3f
        L2a:
            r15 = 97
            if (r14 < r15) goto L35
            r15 = 102(0x66, float:1.43E-43)
            if (r14 > r15) goto L35
            int r15 = r14 + (-87)
            goto L3f
        L35:
            r15 = 65
            if (r14 < r15) goto L68
            r15 = 70
            if (r14 > r15) goto L68
            int r15 = r14 + (-55)
        L3f:
            r16 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r16 = r5 & r16
            int r16 = (r16 > r7 ? 1 : (r16 == r7 ? 0 : -1))
            if (r16 != 0) goto L4d
            long r5 = r5 << r1
            long r14 = (long) r15
            long r5 = r5 | r14
            int r12 = r12 + r4
            int r9 = r9 + r4
            goto L1b
        L4d:
            R1.g r1 = new R1.g
            r1.<init>()
            r1.m1247B(r5)
            r1.m1274z(r14)
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.String r1 = r1.m1267s()
            java.lang.String r3 = "Number too large: "
            java.lang.String r1 = r3.concat(r1)
            r2.<init>(r1)
            throw r2
        L68:
            if (r9 == 0) goto L6c
            r10 = r4
            goto L90
        L6c:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            char[] r5 = p054S1.AbstractC0503b.f1292a
            int r1 = r14 >> 4
            r1 = r1 & 15
            char r1 = r5[r1]
            r6 = r14 & 15
            char r5 = r5[r6]
            r6 = 2
            char[] r6 = new char[r6]
            r6[r3] = r1
            r6[r4] = r5
            java.lang.String r1 = new java.lang.String
            r1.<init>(r6)
            java.lang.String r3 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r1 = r3.concat(r1)
            r2.<init>(r1)
            throw r2
        L90:
            if (r12 != r13) goto L9c
            R1.y r12 = r11.m1304a()
            r0.f1216a = r12
            p051R1.AbstractC0496z.m1308a(r11)
            goto L9e
        L9c:
            r11.f1253b = r12
        L9e:
            if (r10 != 0) goto La4
            R1.y r11 = r0.f1216a
            if (r11 != 0) goto L12
        La4:
            long r1 = r0.f1217b
            long r3 = (long) r9
            long r1 = r1 - r3
            r0.f1217b = r1
            return r5
        Lab:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p051R1.C0477g.m1262n():long");
    }

    /* renamed from: o */
    public final int m1263o() {
        if (this.f1217b < 4) {
            throw new EOFException();
        }
        C0495y c0495y = this.f1216a;
        AbstractC2492i.m4912b(c0495y);
        int r12 = c0495y.f1253b;
        int r4 = c0495y.f1254c;
        if (r4 - r12 < 4) {
            return ((m1259k() & 255) << 24) | ((m1259k() & 255) << 16) | ((m1259k() & 255) << 8) | (m1259k() & 255);
        }
        byte[] bArr = c0495y.f1252a;
        int r7 = r12 + 3;
        int r5 = ((bArr[r12 + 1] & 255) << 16) | ((bArr[r12] & 255) << 24) | ((bArr[r12 + 2] & 255) << 8);
        int r13 = r12 + 4;
        int r52 = r5 | (bArr[r7] & 255);
        this.f1217b -= 4;
        if (r13 == r4) {
            this.f1216a = c0495y.m1304a();
            AbstractC0496z.m1308a(c0495y);
        } else {
            c0495y.f1253b = r13;
        }
        return r52;
    }

    /* renamed from: p */
    public final short m1264p() {
        if (this.f1217b < 2) {
            throw new EOFException();
        }
        C0495y c0495y = this.f1216a;
        AbstractC2492i.m4912b(c0495y);
        int r12 = c0495y.f1253b;
        int r4 = c0495y.f1254c;
        if (r4 - r12 < 2) {
            return (short) (((m1259k() & 255) << 8) | (m1259k() & 255));
        }
        int r5 = r12 + 1;
        byte[] bArr = c0495y.f1252a;
        int r8 = (bArr[r12] & 255) << 8;
        int r13 = r12 + 2;
        int r52 = (bArr[r5] & 255) | r8;
        this.f1217b -= 2;
        if (r13 == r4) {
            this.f1216a = c0495y.m1304a();
            AbstractC0496z.m1308a(c0495y);
        } else {
            c0495y.f1253b = r13;
        }
        return (short) r52;
    }

    /* renamed from: q */
    public final short m1265q() {
        short m1264p = m1264p();
        return (short) (((m1264p & 255) << 8) | ((65280 & m1264p) >>> 8));
    }

    /* renamed from: r */
    public final String m1266r(long j2, Charset charset) {
        AbstractC2492i.m4915e(charset, "charset");
        if (j2 < 0 || j2 > 2147483647L) {
            throw new IllegalArgumentException(AbstractC0002c.m14i("byteCount: ", j2).toString());
        }
        if (this.f1217b < j2) {
            throw new EOFException();
        }
        if (j2 == 0) {
            return "";
        }
        C0495y c0495y = this.f1216a;
        AbstractC2492i.m4912b(c0495y);
        int r12 = c0495y.f1253b;
        if (r12 + j2 > c0495y.f1254c) {
            return new String(m1260l(j2), charset);
        }
        int r3 = (int) j2;
        String str = new String(c0495y.f1252a, r12, r3, charset);
        int r9 = c0495y.f1253b + r3;
        c0495y.f1253b = r9;
        this.f1217b -= j2;
        if (r9 == c0495y.f1254c) {
            this.f1216a = c0495y.m1304a();
            AbstractC0496z.m1308a(c0495y);
        }
        return str;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        AbstractC2492i.m4915e(sink, "sink");
        C0495y c0495y = this.f1216a;
        if (c0495y == null) {
            return -1;
        }
        int min = Math.min(sink.remaining(), c0495y.f1254c - c0495y.f1253b);
        sink.put(c0495y.f1252a, c0495y.f1253b, min);
        int r7 = c0495y.f1253b + min;
        c0495y.f1253b = r7;
        this.f1217b -= min;
        if (r7 == c0495y.f1254c) {
            this.f1216a = c0495y.m1304a();
            AbstractC0496z.m1308a(c0495y);
        }
        return min;
    }

    /* renamed from: s */
    public final String m1267s() {
        return m1266r(this.f1217b, AbstractC0008a.f6a);
    }

    /* renamed from: t */
    public final void m1268t(long j2) {
        while (j2 > 0) {
            C0495y c0495y = this.f1216a;
            if (c0495y == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j2, c0495y.f1254c - c0495y.f1253b);
            long j3 = min;
            this.f1217b -= j3;
            j2 -= j3;
            int r2 = c0495y.f1253b + min;
            c0495y.f1253b = r2;
            if (r2 == c0495y.f1254c) {
                this.f1216a = c0495y.m1304a();
                AbstractC0496z.m1308a(c0495y);
            }
        }
    }

    public final String toString() {
        long j2 = this.f1217b;
        if (j2 <= 2147483647L) {
            return m1269u((int) j2).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f1217b).toString());
    }

    /* renamed from: u */
    public final C0480j m1269u(int r9) {
        if (r9 == 0) {
            return C0480j.f1218d;
        }
        AbstractC0379e.m1074e(this.f1217b, 0L, r9);
        C0495y c0495y = this.f1216a;
        int r12 = 0;
        int r2 = 0;
        int r3 = 0;
        while (r2 < r9) {
            AbstractC2492i.m4912b(c0495y);
            int r4 = c0495y.f1254c;
            int r5 = c0495y.f1253b;
            if (r4 == r5) {
                throw new AssertionError("s.limit == s.pos");
            }
            r2 += r4 - r5;
            r3++;
            c0495y = c0495y.f1257f;
        }
        byte[][] bArr = new byte[r3][];
        int[] r22 = new int[r3 * 2];
        C0495y c0495y2 = this.f1216a;
        int r42 = 0;
        while (r12 < r9) {
            AbstractC2492i.m4912b(c0495y2);
            bArr[r42] = c0495y2.f1252a;
            r12 += c0495y2.f1254c - c0495y2.f1253b;
            r22[r42] = Math.min(r12, r9);
            r22[r42 + r3] = c0495y2.f1253b;
            c0495y2.f1255d = true;
            r42++;
            c0495y2 = c0495y2.f1257f;
        }
        return new C0464A(bArr, r22);
    }

    /* renamed from: v */
    public final C0495y m1270v(int r4) {
        if (r4 < 1 || r4 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        C0495y c0495y = this.f1216a;
        if (c0495y == null) {
            C0495y m1309b = AbstractC0496z.m1309b();
            this.f1216a = m1309b;
            m1309b.f1258g = m1309b;
            m1309b.f1257f = m1309b;
            return m1309b;
        }
        C0495y c0495y2 = c0495y.f1258g;
        AbstractC2492i.m4912b(c0495y2);
        if (c0495y2.f1254c + r4 <= 8192 && c0495y2.f1256e) {
            return c0495y2;
        }
        C0495y m1309b2 = AbstractC0496z.m1309b();
        c0495y2.m1305b(m1309b2);
        return m1309b2;
    }

    /* renamed from: w */
    public final void m1271w(C0480j byteString) {
        AbstractC2492i.m4915e(byteString, "byteString");
        byteString.mo1230p(this, byteString.mo1220b());
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        AbstractC2492i.m4915e(source, "source");
        int remaining = source.remaining();
        int r12 = remaining;
        while (r12 > 0) {
            C0495y m1270v = m1270v(1);
            int min = Math.min(r12, 8192 - m1270v.f1254c);
            source.get(m1270v.f1252a, m1270v.f1254c, min);
            r12 -= min;
            m1270v.f1254c += min;
        }
        this.f1217b += remaining;
        return remaining;
    }

    /* renamed from: x */
    public final void m1272x(byte[] source, int r11, int r12) {
        AbstractC2492i.m4915e(source, "source");
        long j2 = r12;
        AbstractC0379e.m1074e(source.length, r11, j2);
        int r122 = r12 + r11;
        while (r11 < r122) {
            C0495y m1270v = m1270v(1);
            int min = Math.min(r122 - r11, 8192 - m1270v.f1254c);
            int r3 = r11 + min;
            AbstractC2658h.m5105C(m1270v.f1254c, r11, r3, source, m1270v.f1252a);
            m1270v.f1254c += min;
            r11 = r3;
        }
        this.f1217b += j2;
    }

    /* renamed from: y */
    public final void m1273y(InterfaceC0467D source) {
        AbstractC2492i.m4915e(source, "source");
        while (source.mo390a(this, 8192L) != -1) {
        }
    }

    /* renamed from: z */
    public final void m1274z(int r5) {
        C0495y m1270v = m1270v(1);
        int r12 = m1270v.f1254c;
        m1270v.f1254c = r12 + 1;
        m1270v.f1252a[r12] = (byte) r5;
        this.f1217b++;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, p051R1.InterfaceC0465B
    public final void close() {
    }

    @Override // p051R1.InterfaceC0465B, java.io.Flushable
    public final void flush() {
    }
}
