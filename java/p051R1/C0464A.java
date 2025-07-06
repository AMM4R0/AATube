package p051R1;

import android.support.v4.media.session.AbstractC0580g;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC2492i;
import p000A.AbstractC0002c;
import p036M1.AbstractC0379e;
import p054S1.AbstractC0503b;
import p108m1.AbstractC2658h;

/* renamed from: R1.A */
/* loaded from: classes.dex */
public final class C0464A extends C0480j {

    /* renamed from: e */
    public final transient byte[][] f1188e;

    /* renamed from: f */
    public final transient int[] f1189f;

    public C0464A(byte[][] bArr, int[] r3) {
        super(C0480j.f1218d.f1219a);
        this.f1188e = bArr;
        this.f1189f = r3;
    }

    @Override // p051R1.C0480j
    /* renamed from: b */
    public final int mo1220b() {
        return this.f1189f[this.f1188e.length - 1];
    }

    @Override // p051R1.C0480j
    /* renamed from: c */
    public final String mo1221c() {
        return m1232r().mo1221c();
    }

    @Override // p051R1.C0480j
    /* renamed from: d */
    public final int mo1222d(int r2, byte[] other) {
        AbstractC2492i.m4915e(other, "other");
        return m1232r().mo1222d(r2, other);
    }

    @Override // p051R1.C0480j
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0480j) {
            C0480j c0480j = (C0480j) obj;
            if (c0480j.mo1220b() == mo1220b() && mo1226j(0, c0480j, mo1220b())) {
                return true;
            }
        }
        return false;
    }

    @Override // p051R1.C0480j
    /* renamed from: f */
    public final byte[] mo1223f() {
        return m1231q();
    }

    @Override // p051R1.C0480j
    /* renamed from: g */
    public final byte mo1224g(int r10) {
        byte[][] bArr = this.f1188e;
        int length = bArr.length - 1;
        int[] r2 = this.f1189f;
        AbstractC0379e.m1074e(r2[length], r10, 1L);
        int m1317f = AbstractC0503b.m1317f(this, r10);
        return bArr[m1317f][(r10 - (m1317f == 0 ? 0 : r2[m1317f - 1])) + r2[bArr.length + m1317f]];
    }

    @Override // p051R1.C0480j
    /* renamed from: h */
    public final int mo1225h(int r2, byte[] other) {
        AbstractC2492i.m4915e(other, "other");
        return m1232r().mo1225h(r2, other);
    }

    @Override // p051R1.C0480j
    public final int hashCode() {
        int r02 = this.f1220b;
        if (r02 != 0) {
            return r02;
        }
        byte[][] bArr = this.f1188e;
        int length = bArr.length;
        int r2 = 0;
        int r3 = 1;
        int r4 = 0;
        while (r2 < length) {
            int[] r6 = this.f1189f;
            int r5 = r6[length + r2];
            int r62 = r6[r2];
            byte[] bArr2 = bArr[r2];
            int r42 = (r62 - r4) + r5;
            while (r5 < r42) {
                r3 = (r3 * 31) + bArr2[r5];
                r5++;
            }
            r2++;
            r4 = r62;
        }
        this.f1220b = r3;
        return r3;
    }

    @Override // p051R1.C0480j
    /* renamed from: j */
    public final boolean mo1226j(int r9, C0480j other, int r11) {
        AbstractC2492i.m4915e(other, "other");
        if (r9 < 0 || r9 > mo1220b() - r11) {
            return false;
        }
        int r112 = r11 + r9;
        int m1317f = AbstractC0503b.m1317f(this, r9);
        int r2 = 0;
        while (r9 < r112) {
            int[] r3 = this.f1189f;
            int r4 = m1317f == 0 ? 0 : r3[m1317f - 1];
            int r5 = r3[m1317f] - r4;
            byte[][] bArr = this.f1188e;
            int r32 = r3[bArr.length + m1317f];
            int min = Math.min(r112, r5 + r4) - r9;
            if (!other.mo1227k(r2, bArr[m1317f], (r9 - r4) + r32, min)) {
                return false;
            }
            r2 += min;
            r9 += min;
            m1317f++;
        }
        return true;
    }

    @Override // p051R1.C0480j
    /* renamed from: k */
    public final boolean mo1227k(int r8, byte[] other, int r10, int r11) {
        AbstractC2492i.m4915e(other, "other");
        if (r8 < 0 || r8 > mo1220b() - r11 || r10 < 0 || r10 > other.length - r11) {
            return false;
        }
        int r112 = r11 + r8;
        int m1317f = AbstractC0503b.m1317f(this, r8);
        while (r8 < r112) {
            int[] r2 = this.f1189f;
            int r3 = m1317f == 0 ? 0 : r2[m1317f - 1];
            int r4 = r2[m1317f] - r3;
            byte[][] bArr = this.f1188e;
            int r22 = r2[bArr.length + m1317f];
            int min = Math.min(r112, r4 + r3) - r8;
            if (!AbstractC0379e.m1070a((r8 - r3) + r22, r10, min, bArr[m1317f], other)) {
                return false;
            }
            r10 += min;
            r8 += min;
            m1317f++;
        }
        return true;
    }

    @Override // p051R1.C0480j
    /* renamed from: l */
    public final C0480j mo1228l(int r12, int r13) {
        if (r13 == -1234567890) {
            r13 = mo1220b();
        }
        if (r12 < 0) {
            throw new IllegalArgumentException(AbstractC0002c.m13h("beginIndex=", r12, " < 0").toString());
        }
        if (r13 > mo1220b()) {
            throw new IllegalArgumentException(("endIndex=" + r13 + " > length(" + mo1220b() + ')').toString());
        }
        int r02 = r13 - r12;
        if (r02 < 0) {
            throw new IllegalArgumentException(AbstractC0002c.m12g("endIndex=", r13, r12, " < beginIndex=").toString());
        }
        if (r12 == 0 && r13 == mo1220b()) {
            return this;
        }
        if (r12 == r13) {
            return C0480j.f1218d;
        }
        int m1317f = AbstractC0503b.m1317f(this, r12);
        int m1317f2 = AbstractC0503b.m1317f(this, r13 - 1);
        int r2 = m1317f2 + 1;
        byte[][] bArr = this.f1188e;
        AbstractC2492i.m4915e(bArr, "<this>");
        AbstractC0580g.m1445j(r2, bArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(bArr, m1317f, r2);
        AbstractC2492i.m4914d(copyOfRange, "copyOfRange(...)");
        byte[][] bArr2 = (byte[][]) copyOfRange;
        int[] r3 = new int[bArr2.length * 2];
        int[] r6 = this.f1189f;
        if (m1317f <= m1317f2) {
            int r8 = m1317f;
            int r7 = 0;
            while (true) {
                r3[r7] = Math.min(r6[r8] - r12, r02);
                int r9 = r7 + 1;
                r3[r7 + bArr2.length] = r6[bArr.length + r8];
                if (r8 == m1317f2) {
                    break;
                }
                r8++;
                r7 = r9;
            }
        }
        int r5 = m1317f != 0 ? r6[m1317f - 1] : 0;
        int length = bArr2.length;
        r3[length] = (r12 - r5) + r3[length];
        return new C0464A(bArr2, r3);
    }

    @Override // p051R1.C0480j
    /* renamed from: n */
    public final C0480j mo1229n() {
        return m1232r().mo1229n();
    }

    @Override // p051R1.C0480j
    /* renamed from: p */
    public final void mo1230p(C0477g buffer, int r11) {
        AbstractC2492i.m4915e(buffer, "buffer");
        int m1317f = AbstractC0503b.m1317f(this, 0);
        int r2 = 0;
        while (r2 < r11) {
            int[] r3 = this.f1189f;
            int r4 = m1317f == 0 ? 0 : r3[m1317f - 1];
            int r5 = r3[m1317f] - r4;
            byte[][] bArr = this.f1188e;
            int r32 = r3[bArr.length + m1317f];
            int min = Math.min(r11, r5 + r4) - r2;
            int r42 = (r2 - r4) + r32;
            C0495y c0495y = new C0495y(bArr[m1317f], r42, r42 + min, true);
            C0495y c0495y2 = buffer.f1216a;
            if (c0495y2 == null) {
                c0495y.f1258g = c0495y;
                c0495y.f1257f = c0495y;
                buffer.f1216a = c0495y;
            } else {
                C0495y c0495y3 = c0495y2.f1258g;
                AbstractC2492i.m4912b(c0495y3);
                c0495y3.m1305b(c0495y);
            }
            r2 += min;
            m1317f++;
        }
        buffer.f1217b += r11;
    }

    /* renamed from: q */
    public final byte[] m1231q() {
        byte[] bArr = new byte[mo1220b()];
        byte[][] bArr2 = this.f1188e;
        int length = bArr2.length;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        while (r3 < length) {
            int[] r7 = this.f1189f;
            int r6 = r7[length + r3];
            int r72 = r7[r3];
            int r42 = r72 - r4;
            AbstractC2658h.m5105C(r5, r6, r6 + r42, bArr2[r3], bArr);
            r5 += r42;
            r3++;
            r4 = r72;
        }
        return bArr;
    }

    /* renamed from: r */
    public final C0480j m1232r() {
        return new C0480j(m1231q());
    }

    @Override // p051R1.C0480j
    public final String toString() {
        return m1232r().toString();
    }
}
