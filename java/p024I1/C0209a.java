package p024I1;

import kotlin.jvm.internal.AbstractC2492i;
import p002A1.AbstractC0017j;
import p006C.C0055g;
import p008C1.C0083o;
import p051R1.C0494x;
import p103k0.AbstractC2480a;

/* renamed from: I1.a */
/* loaded from: classes.dex */
public final class C0209a {

    /* renamed from: a */
    public final /* synthetic */ int f621a;

    /* renamed from: b */
    public long f622b;

    /* renamed from: c */
    public Object f623c;

    public C0209a(C0494x source) {
        this.f621a = 0;
        AbstractC2492i.m4915e(source, "source");
        this.f623c = source;
        this.f622b = 262144L;
    }

    /* renamed from: a */
    public void m596a(int r5) {
        if (r5 < 64) {
            this.f622b &= ~(1 << r5);
            return;
        }
        C0209a c0209a = (C0209a) this.f623c;
        if (c0209a != null) {
            c0209a.m596a(r5 - 64);
        }
    }

    /* renamed from: b */
    public int m597b(int r7) {
        C0209a c0209a = (C0209a) this.f623c;
        if (c0209a == null) {
            return r7 >= 64 ? Long.bitCount(this.f622b) : Long.bitCount(this.f622b & ((1 << r7) - 1));
        }
        if (r7 < 64) {
            return Long.bitCount(this.f622b & ((1 << r7) - 1));
        }
        return Long.bitCount(this.f622b) + c0209a.m597b(r7 - 64);
    }

    /* renamed from: c */
    public void m598c() {
        if (((C0209a) this.f623c) == null) {
            this.f623c = new C0209a();
        }
    }

    /* renamed from: d */
    public boolean m599d(int r5) {
        if (r5 < 64) {
            return (this.f622b & (1 << r5)) != 0;
        }
        m598c();
        return ((C0209a) this.f623c).m599d(r5 - 64);
    }

    /* renamed from: e */
    public void m600e(int r10, boolean z2) {
        if (r10 >= 64) {
            m598c();
            ((C0209a) this.f623c).m600e(r10 - 64, z2);
            return;
        }
        long j2 = this.f622b;
        boolean z3 = (Long.MIN_VALUE & j2) != 0;
        long j3 = (1 << r10) - 1;
        this.f622b = ((j2 & (~j3)) << 1) | (j2 & j3);
        if (z2) {
            m604i(r10);
        } else {
            m596a(r10);
        }
        if (z3 || ((C0209a) this.f623c) != null) {
            m598c();
            ((C0209a) this.f623c).m600e(0, z3);
        }
    }

    /* renamed from: f */
    public C0083o m601f() {
        C0055g c0055g = new C0055g(2);
        while (true) {
            String m1300p = ((C0494x) this.f623c).m1300p(this.f622b);
            this.f622b -= m1300p.length();
            if (m1300p.length() == 0) {
                return c0055g.m218q();
            }
            int m136N = AbstractC0017j.m136N(m1300p, ':', 1, false, 4);
            if (m136N != -1) {
                String substring = m1300p.substring(0, m136N);
                AbstractC2492i.m4914d(substring, "substring(...)");
                String substring2 = m1300p.substring(m136N + 1);
                AbstractC2492i.m4914d(substring2, "substring(...)");
                AbstractC2480a.m4883e(c0055g, substring, substring2);
            } else if (m1300p.charAt(0) == ':') {
                String substring3 = m1300p.substring(1);
                AbstractC2492i.m4914d(substring3, "substring(...)");
                AbstractC2480a.m4883e(c0055g, "", substring3);
            } else {
                AbstractC2480a.m4883e(c0055g, "", m1300p);
            }
        }
    }

    /* renamed from: g */
    public boolean m602g(int r11) {
        if (r11 >= 64) {
            m598c();
            return ((C0209a) this.f623c).m602g(r11 - 64);
        }
        long j2 = 1 << r11;
        long j3 = this.f622b;
        boolean z2 = (j3 & j2) != 0;
        long j4 = j3 & (~j2);
        this.f622b = j4;
        long j5 = j2 - 1;
        this.f622b = (j4 & j5) | Long.rotateRight((~j5) & j4, 1);
        C0209a c0209a = (C0209a) this.f623c;
        if (c0209a != null) {
            if (c0209a.m599d(0)) {
                m604i(63);
            }
            ((C0209a) this.f623c).m602g(0);
        }
        return z2;
    }

    /* renamed from: h */
    public void m603h() {
        this.f622b = 0L;
        C0209a c0209a = (C0209a) this.f623c;
        if (c0209a != null) {
            c0209a.m603h();
        }
    }

    /* renamed from: i */
    public void m604i(int r5) {
        if (r5 < 64) {
            this.f622b |= 1 << r5;
        } else {
            m598c();
            ((C0209a) this.f623c).m604i(r5 - 64);
        }
    }

    public String toString() {
        switch (this.f621a) {
            case 1:
                if (((C0209a) this.f623c) == null) {
                    return Long.toBinaryString(this.f622b);
                }
                return ((C0209a) this.f623c).toString() + "xx" + Long.toBinaryString(this.f622b);
            default:
                return super.toString();
        }
    }

    public C0209a() {
        this.f621a = 1;
        this.f622b = 0L;
    }
}
