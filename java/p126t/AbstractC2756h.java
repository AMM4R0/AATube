package p126t;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p123s.AbstractC2728i;
import p123s.C2722c;
import p123s.C2723d;
import p123s.C2724e;
import p123s.C2727h;
import p132v.C2826f;

/* renamed from: t.h */
/* loaded from: classes.dex */
public abstract class AbstractC2756h {

    /* renamed from: a */
    public static final C2750b f9038a = new C2750b();

    /* renamed from: a */
    public static boolean m5361a(C2723d c2723d) {
        int[] r02 = c2723d.f8872p0;
        int r2 = r02[0];
        int r03 = r02[1];
        C2723d c2723d2 = c2723d.f8834T;
        C2724e c2724e = c2723d2 != null ? (C2724e) c2723d2 : null;
        if (c2724e != null) {
            int r5 = c2724e.f8872p0[0];
        }
        if (c2724e != null) {
            int r4 = c2724e.f8872p0[1];
        }
        boolean z2 = r2 == 1 || c2723d.mo5241A() || r2 == 2 || (r2 == 3 && c2723d.f8874r == 0 && c2723d.f8837W == 0.0f && c2723d.m5291t(0)) || (r2 == 3 && c2723d.f8874r == 1 && c2723d.m5292u(0, c2723d.m5288q()));
        boolean z3 = r03 == 1 || c2723d.mo5242B() || r03 == 2 || (r03 == 3 && c2723d.f8875s == 0 && c2723d.f8837W == 0.0f && c2723d.m5291t(1)) || (r03 == 3 && c2723d.f8875s == 1 && c2723d.m5292u(1, c2723d.m5284k()));
        if (c2723d.f8837W <= 0.0f || !(z2 || z3)) {
            return z2 && z3;
        }
        return true;
    }

    /* renamed from: b */
    public static C2762n m5362b(C2723d c2723d, int r8, ArrayList arrayList, C2762n c2762n) {
        int r6;
        int r02 = r8 == 0 ? c2723d.f8868n0 : c2723d.f8870o0;
        if (r02 != -1 && (c2762n == null || r02 != c2762n.f9046b)) {
            int r3 = 0;
            while (true) {
                if (r3 >= arrayList.size()) {
                    break;
                }
                C2762n c2762n2 = (C2762n) arrayList.get(r3);
                if (c2762n2.f9046b == r02) {
                    if (c2762n != null) {
                        c2762n.m5379c(r8, c2762n2);
                        arrayList.remove(c2762n);
                    }
                    c2762n = c2762n2;
                } else {
                    r3++;
                }
            }
        } else if (r02 != -1) {
            return c2762n;
        }
        if (c2762n == null) {
            if (c2723d instanceof AbstractC2728i) {
                AbstractC2728i abstractC2728i = (AbstractC2728i) c2723d;
                int r4 = 0;
                while (true) {
                    if (r4 >= abstractC2728i.f8966r0) {
                        r6 = -1;
                        break;
                    }
                    C2723d c2723d2 = abstractC2728i.f8965q0[r4];
                    if ((r8 == 0 && (r6 = c2723d2.f8868n0) != -1) || (r8 == 1 && (r6 = c2723d2.f8870o0) != -1)) {
                        break;
                    }
                    r4++;
                }
                if (r6 != -1) {
                    int r32 = 0;
                    while (true) {
                        if (r32 >= arrayList.size()) {
                            break;
                        }
                        C2762n c2762n3 = (C2762n) arrayList.get(r32);
                        if (c2762n3.f9046b == r6) {
                            c2762n = c2762n3;
                            break;
                        }
                        r32++;
                    }
                }
            }
            if (c2762n == null) {
                c2762n = new C2762n();
                c2762n.f9045a = new ArrayList();
                c2762n.f9048d = null;
                c2762n.f9049e = -1;
                int r2 = C2762n.f9044f;
                C2762n.f9044f = r2 + 1;
                c2762n.f9046b = r2;
                c2762n.f9047c = r8;
            }
            arrayList.add(c2762n);
        }
        ArrayList arrayList2 = c2762n.f9045a;
        if (!arrayList2.contains(c2723d)) {
            arrayList2.add(c2723d);
            if (c2723d instanceof C2727h) {
                C2727h c2727h = (C2727h) c2723d;
                c2727h.f8962t0.m5249c(c2727h.f8963u0 == 0 ? 1 : 0, arrayList, c2762n);
            }
            int r03 = c2762n.f9046b;
            if (r8 == 0) {
                c2723d.f8868n0 = r03;
                c2723d.f8823I.m5249c(r8, arrayList, c2762n);
                c2723d.f8825K.m5249c(r8, arrayList, c2762n);
            } else {
                c2723d.f8870o0 = r03;
                c2723d.f8824J.m5249c(r8, arrayList, c2762n);
                c2723d.f8827M.m5249c(r8, arrayList, c2762n);
                c2723d.f8826L.m5249c(r8, arrayList, c2762n);
            }
            c2723d.f8830P.m5249c(r8, arrayList, c2762n);
        }
        return c2762n;
    }

    /* renamed from: c */
    public static void m5363c(int r17, C2723d c2723d, C2826f c2826f, boolean z2) {
        C2722c c2722c;
        C2722c c2722c2;
        C2722c c2722c3;
        C2722c c2722c4;
        if (c2723d.f8865m) {
            return;
        }
        if (!(c2723d instanceof C2724e) && c2723d.m5297z() && m5361a(c2723d)) {
            C2724e.m5298V(c2723d, c2826f, new C2750b());
        }
        C2722c mo5282i = c2723d.mo5282i(2);
        C2722c mo5282i2 = c2723d.mo5282i(4);
        int m5250d = mo5282i.m5250d();
        int m5250d2 = mo5282i2.m5250d();
        HashSet hashSet = mo5282i.f8806a;
        char c = 0;
        if (hashSet != null && mo5282i.f8808c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C2722c c2722c5 = (C2722c) it.next();
                C2723d c2723d2 = c2722c5.f8809d;
                int r14 = r17 + 1;
                boolean m5361a = m5361a(c2723d2);
                if (c2723d2.m5297z() && m5361a) {
                    C2724e.m5298V(c2723d2, c2826f, new C2750b());
                }
                C2722c c2722c6 = c2723d2.f8823I;
                C2722c c2722c7 = c2723d2.f8825K;
                char c2 = ((c2722c5 == c2722c6 && (c2722c4 = c2722c7.f8811f) != null && c2722c4.f8808c) || (c2722c5 == c2722c7 && (c2722c3 = c2722c6.f8811f) != null && c2722c3.f8808c)) ? (char) 1 : c;
                int r12 = c2723d2.f8872p0[c];
                if (r12 != 3 || m5361a) {
                    if (!c2723d2.m5297z()) {
                        if (c2722c5 == c2722c6 && c2722c7.f8811f == null) {
                            int m5251e = c2722c6.m5251e() + m5250d;
                            c2723d2.m5268J(m5251e, c2723d2.m5288q() + m5251e);
                            m5363c(r14, c2723d2, c2826f, z2);
                        } else if (c2722c5 == c2722c7 && c2722c6.f8811f == null) {
                            int m5251e2 = m5250d - c2722c7.m5251e();
                            c2723d2.m5268J(m5251e2 - c2723d2.m5288q(), m5251e2);
                            m5363c(r14, c2723d2, c2826f, z2);
                        } else if (c2 != 0 && !c2723d2.m5295x()) {
                            m5364d(r14, c2723d2, c2826f, z2);
                        }
                    }
                } else if (r12 == 3 && c2723d2.f8878v >= 0 && c2723d2.f8877u >= 0 && ((c2723d2.f8854g0 == 8 || (c2723d2.f8874r == 0 && c2723d2.f8837W == 0.0f)) && !c2723d2.m5295x() && !c2723d2.f8820F && c2 != 0 && !c2723d2.m5295x())) {
                    m5365e(r14, c2723d, c2826f, c2723d2, z2);
                }
                c = 0;
            }
        }
        if (c2723d instanceof C2727h) {
            return;
        }
        HashSet hashSet2 = mo5282i2.f8806a;
        if (hashSet2 != null && mo5282i2.f8808c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                C2722c c2722c8 = (C2722c) it2.next();
                C2723d c2723d3 = c2722c8.f8809d;
                int r8 = r17 + 1;
                boolean m5361a2 = m5361a(c2723d3);
                if (c2723d3.m5297z() && m5361a2) {
                    C2724e.m5298V(c2723d3, c2826f, new C2750b());
                }
                C2722c c2722c9 = c2723d3.f8823I;
                C2722c c2722c10 = c2723d3.f8825K;
                boolean z3 = (c2722c8 == c2722c9 && (c2722c2 = c2722c10.f8811f) != null && c2722c2.f8808c) || (c2722c8 == c2722c10 && (c2722c = c2722c9.f8811f) != null && c2722c.f8808c);
                int r122 = c2723d3.f8872p0[0];
                if (r122 != 3 || m5361a2) {
                    if (!c2723d3.m5297z()) {
                        if (c2722c8 == c2722c9 && c2722c10.f8811f == null) {
                            int m5251e3 = c2722c9.m5251e() + m5250d2;
                            c2723d3.m5268J(m5251e3, c2723d3.m5288q() + m5251e3);
                            m5363c(r8, c2723d3, c2826f, z2);
                        } else if (c2722c8 == c2722c10 && c2722c9.f8811f == null) {
                            int m5251e4 = m5250d2 - c2722c10.m5251e();
                            c2723d3.m5268J(m5251e4 - c2723d3.m5288q(), m5251e4);
                            m5363c(r8, c2723d3, c2826f, z2);
                        } else if (z3 && !c2723d3.m5295x()) {
                            m5364d(r8, c2723d3, c2826f, z2);
                        }
                    }
                } else if (r122 == 3 && c2723d3.f8878v >= 0 && c2723d3.f8877u >= 0) {
                    if (c2723d3.f8854g0 != 8) {
                        if (c2723d3.f8874r == 0) {
                            if (c2723d3.f8837W == 0.0f) {
                            }
                        }
                    }
                    if (!c2723d3.m5295x() && !c2723d3.f8820F && z3 && !c2723d3.m5295x()) {
                        m5365e(r8, c2723d, c2826f, c2723d3, z2);
                    }
                }
            }
        }
        c2723d.f8865m = true;
    }

    /* renamed from: d */
    public static void m5364d(int r6, C2723d c2723d, C2826f c2826f, boolean z2) {
        float f = c2723d.f8848d0;
        C2722c c2722c = c2723d.f8823I;
        int m5250d = c2722c.f8811f.m5250d();
        C2722c c2722c2 = c2723d.f8825K;
        int m5250d2 = c2722c2.f8811f.m5250d();
        int m5251e = c2722c.m5251e() + m5250d;
        int m5251e2 = m5250d2 - c2722c2.m5251e();
        if (m5250d == m5250d2) {
            f = 0.5f;
        } else {
            m5250d = m5251e;
            m5250d2 = m5251e2;
        }
        int m5288q = c2723d.m5288q();
        int r3 = (m5250d2 - m5250d) - m5288q;
        if (m5250d > m5250d2) {
            r3 = (m5250d - m5250d2) - m5288q;
        }
        int r02 = ((int) (r3 > 0 ? (f * r3) + 0.5f : f * r3)) + m5250d;
        int r32 = r02 + m5288q;
        if (m5250d > m5250d2) {
            r32 = r02 - m5288q;
        }
        c2723d.m5268J(r02, r32);
        m5363c(r6 + 1, c2723d, c2826f, z2);
    }

    /* renamed from: e */
    public static void m5365e(int r7, C2723d c2723d, C2826f c2826f, C2723d c2723d2, boolean z2) {
        float f = c2723d2.f8848d0;
        C2722c c2722c = c2723d2.f8823I;
        int m5251e = c2722c.m5251e() + c2722c.f8811f.m5250d();
        C2722c c2722c2 = c2723d2.f8825K;
        int m5250d = c2722c2.f8811f.m5250d() - c2722c2.m5251e();
        if (m5250d >= m5251e) {
            int m5288q = c2723d2.m5288q();
            if (c2723d2.f8854g0 != 8) {
                int r4 = c2723d2.f8874r;
                if (r4 == 2) {
                    m5288q = (int) (c2723d2.f8848d0 * 0.5f * (c2723d instanceof C2724e ? c2723d.m5288q() : c2723d.f8834T.m5288q()));
                } else if (r4 == 0) {
                    m5288q = m5250d - m5251e;
                }
                m5288q = Math.max(c2723d2.f8877u, m5288q);
                int r8 = c2723d2.f8878v;
                if (r8 > 0) {
                    m5288q = Math.min(r8, m5288q);
                }
            }
            int r12 = m5251e + ((int) ((f * ((m5250d - m5251e) - m5288q)) + 0.5f));
            c2723d2.m5268J(r12, m5288q + r12);
            m5363c(r7 + 1, c2723d2, c2826f, z2);
        }
    }

    /* renamed from: f */
    public static void m5366f(int r6, C2723d c2723d, C2826f c2826f) {
        float f = c2723d.f8850e0;
        C2722c c2722c = c2723d.f8824J;
        int m5250d = c2722c.f8811f.m5250d();
        C2722c c2722c2 = c2723d.f8826L;
        int m5250d2 = c2722c2.f8811f.m5250d();
        int m5251e = c2722c.m5251e() + m5250d;
        int m5251e2 = m5250d2 - c2722c2.m5251e();
        if (m5250d == m5250d2) {
            f = 0.5f;
        } else {
            m5250d = m5251e;
            m5250d2 = m5251e2;
        }
        int m5284k = c2723d.m5284k();
        int r3 = (m5250d2 - m5250d) - m5284k;
        if (m5250d > m5250d2) {
            r3 = (m5250d - m5250d2) - m5284k;
        }
        int r02 = (int) (r3 > 0 ? (f * r3) + 0.5f : f * r3);
        int r32 = m5250d + r02;
        int r5 = r32 + m5284k;
        if (m5250d > m5250d2) {
            r32 = m5250d - r02;
            r5 = r32 - m5284k;
        }
        c2723d.m5269K(r32, r5);
        m5369i(r6 + 1, c2723d, c2826f);
    }

    /* renamed from: g */
    public static void m5367g(int r7, C2723d c2723d, C2826f c2826f, C2723d c2723d2) {
        float f = c2723d2.f8850e0;
        C2722c c2722c = c2723d2.f8824J;
        int m5251e = c2722c.m5251e() + c2722c.f8811f.m5250d();
        C2722c c2722c2 = c2723d2.f8826L;
        int m5250d = c2722c2.f8811f.m5250d() - c2722c2.m5251e();
        if (m5250d >= m5251e) {
            int m5284k = c2723d2.m5284k();
            if (c2723d2.f8854g0 != 8) {
                int r4 = c2723d2.f8875s;
                if (r4 == 2) {
                    m5284k = (int) (f * 0.5f * (c2723d instanceof C2724e ? c2723d.m5284k() : c2723d.f8834T.m5284k()));
                } else if (r4 == 0) {
                    m5284k = m5250d - m5251e;
                }
                m5284k = Math.max(c2723d2.f8880x, m5284k);
                int r8 = c2723d2.f8881y;
                if (r8 > 0) {
                    m5284k = Math.min(r8, m5284k);
                }
            }
            int r12 = m5251e + ((int) ((f * ((m5250d - m5251e) - m5284k)) + 0.5f));
            c2723d2.m5269K(r12, m5284k + r12);
            m5369i(r7 + 1, c2723d2, c2826f);
        }
    }

    /* renamed from: h */
    public static boolean m5368h(int r4, int r5, int r6, int r7) {
        return (r6 == 1 || r6 == 2 || (r6 == 4 && r4 != 2)) || (r7 == 1 || r7 == 2 || (r7 == 4 && r5 != 2));
    }

    /* renamed from: i */
    public static void m5369i(int r16, C2723d c2723d, C2826f c2826f) {
        C2722c c2722c;
        C2722c c2722c2;
        C2722c c2722c3;
        C2722c c2722c4;
        C2722c c2722c5;
        if (c2723d.f8867n) {
            return;
        }
        if (!(c2723d instanceof C2724e) && c2723d.m5297z() && m5361a(c2723d)) {
            C2724e.m5298V(c2723d, c2826f, new C2750b());
        }
        C2722c mo5282i = c2723d.mo5282i(3);
        C2722c mo5282i2 = c2723d.mo5282i(5);
        int m5250d = mo5282i.m5250d();
        int m5250d2 = mo5282i2.m5250d();
        HashSet hashSet = mo5282i.f8806a;
        if (hashSet != null && mo5282i.f8808c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C2722c c2722c6 = (C2722c) it.next();
                C2723d c2723d2 = c2722c6.f8809d;
                int r13 = r16 + 1;
                boolean m5361a = m5361a(c2723d2);
                if (c2723d2.m5297z() && m5361a) {
                    C2724e.m5298V(c2723d2, c2826f, new C2750b());
                }
                C2722c c2722c7 = c2723d2.f8824J;
                C2722c c2722c8 = c2723d2.f8826L;
                boolean z2 = (c2722c6 == c2722c7 && (c2722c5 = c2722c8.f8811f) != null && c2722c5.f8808c) || (c2722c6 == c2722c8 && (c2722c4 = c2722c7.f8811f) != null && c2722c4.f8808c);
                int r11 = c2723d2.f8872p0[1];
                if (r11 != 3 || m5361a) {
                    if (!c2723d2.m5297z()) {
                        if (c2722c6 == c2722c7 && c2722c8.f8811f == null) {
                            int m5251e = c2722c7.m5251e() + m5250d;
                            c2723d2.m5269K(m5251e, c2723d2.m5284k() + m5251e);
                            m5369i(r13, c2723d2, c2826f);
                        } else if (c2722c6 == c2722c8 && c2722c7.f8811f == null) {
                            int m5251e2 = m5250d - c2722c8.m5251e();
                            c2723d2.m5269K(m5251e2 - c2723d2.m5284k(), m5251e2);
                            m5369i(r13, c2723d2, c2826f);
                        } else if (z2 && !c2723d2.m5296y()) {
                            m5366f(r13, c2723d2, c2826f);
                        }
                    }
                } else if (r11 == 3 && c2723d2.f8881y >= 0 && c2723d2.f8880x >= 0 && (c2723d2.f8854g0 == 8 || (c2723d2.f8875s == 0 && c2723d2.f8837W == 0.0f))) {
                    if (!c2723d2.m5296y() && !c2723d2.f8820F && z2 && !c2723d2.m5296y()) {
                        m5367g(r13, c2723d, c2826f, c2723d2);
                    }
                }
            }
        }
        if (c2723d instanceof C2727h) {
            return;
        }
        HashSet hashSet2 = mo5282i2.f8806a;
        if (hashSet2 != null && mo5282i2.f8808c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                C2722c c2722c9 = (C2722c) it2.next();
                C2723d c2723d3 = c2722c9.f8809d;
                int r7 = r16 + 1;
                boolean m5361a2 = m5361a(c2723d3);
                if (c2723d3.m5297z() && m5361a2) {
                    C2724e.m5298V(c2723d3, c2826f, new C2750b());
                }
                C2722c c2722c10 = c2723d3.f8824J;
                C2722c c2722c11 = c2723d3.f8826L;
                boolean z3 = (c2722c9 == c2722c10 && (c2722c3 = c2722c11.f8811f) != null && c2722c3.f8808c) || (c2722c9 == c2722c11 && (c2722c2 = c2722c10.f8811f) != null && c2722c2.f8808c);
                int r132 = c2723d3.f8872p0[1];
                if (r132 != 3 || m5361a2) {
                    if (!c2723d3.m5297z()) {
                        if (c2722c9 == c2722c10 && c2722c11.f8811f == null) {
                            int m5251e3 = c2722c10.m5251e() + m5250d2;
                            c2723d3.m5269K(m5251e3, c2723d3.m5284k() + m5251e3);
                            m5369i(r7, c2723d3, c2826f);
                        } else if (c2722c9 == c2722c11 && c2722c10.f8811f == null) {
                            int m5251e4 = m5250d2 - c2722c11.m5251e();
                            c2723d3.m5269K(m5251e4 - c2723d3.m5284k(), m5251e4);
                            m5369i(r7, c2723d3, c2826f);
                        } else if (z3 && !c2723d3.m5296y()) {
                            m5366f(r7, c2723d3, c2826f);
                        }
                    }
                } else if (r132 == 3 && c2723d3.f8881y >= 0 && c2723d3.f8880x >= 0) {
                    if (c2723d3.f8854g0 != 8) {
                        if (c2723d3.f8875s == 0) {
                            if (c2723d3.f8837W == 0.0f) {
                            }
                        }
                    }
                    if (!c2723d3.m5296y() && !c2723d3.f8820F && z3 && !c2723d3.m5296y()) {
                        m5367g(r7, c2723d, c2826f, c2723d3);
                    }
                }
            }
        }
        C2722c mo5282i3 = c2723d.mo5282i(6);
        if (mo5282i3.f8806a != null && mo5282i3.f8808c) {
            int m5250d3 = mo5282i3.m5250d();
            Iterator it3 = mo5282i3.f8806a.iterator();
            while (it3.hasNext()) {
                C2722c c2722c12 = (C2722c) it3.next();
                C2723d c2723d4 = c2722c12.f8809d;
                int r72 = r16 + 1;
                boolean m5361a3 = m5361a(c2723d4);
                if (c2723d4.m5297z() && m5361a3) {
                    C2724e.m5298V(c2723d4, c2826f, new C2750b());
                }
                if (c2723d4.f8872p0[1] != 3 || m5361a3) {
                    if (!c2723d4.m5297z() && c2722c12 == (c2722c = c2723d4.f8827M)) {
                        int m5251e5 = c2722c12.m5251e() + m5250d3;
                        if (c2723d4.f8819E) {
                            int r10 = m5251e5 - c2723d4.f8842a0;
                            int r112 = c2723d4.f8836V + r10;
                            c2723d4.f8840Z = r10;
                            c2723d4.f8824J.m5258l(r10);
                            c2723d4.f8826L.m5258l(r112);
                            c2722c.m5258l(m5251e5);
                            c2723d4.f8863l = true;
                        }
                        m5369i(r72, c2723d4, c2826f);
                    }
                }
            }
        }
        c2723d.f8867n = true;
    }
}
