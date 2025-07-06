package p123s;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p000A.AbstractC0002c;
import p118q.AbstractC2714e;
import p118q.C2715f;
import p126t.AbstractC2756h;
import p126t.C2762n;

/* renamed from: s.c */
/* loaded from: classes.dex */
public final class C2722c {

    /* renamed from: b */
    public int f8807b;

    /* renamed from: c */
    public boolean f8808c;

    /* renamed from: d */
    public final C2723d f8809d;

    /* renamed from: e */
    public final int f8810e;

    /* renamed from: f */
    public C2722c f8811f;

    /* renamed from: i */
    public C2715f f8814i;

    /* renamed from: a */
    public HashSet f8806a = null;

    /* renamed from: g */
    public int f8812g = 0;

    /* renamed from: h */
    public int f8813h = Integer.MIN_VALUE;

    public C2722c(C2723d c2723d, int r3) {
        this.f8809d = c2723d;
        this.f8810e = r3;
    }

    /* renamed from: a */
    public final void m5247a(C2722c c2722c, int r4) {
        m5248b(c2722c, r4, Integer.MIN_VALUE, false);
    }

    /* renamed from: b */
    public final boolean m5248b(C2722c c2722c, int r3, int r4, boolean z2) {
        if (c2722c == null) {
            m5256j();
            return true;
        }
        if (!z2 && !m5255i(c2722c)) {
            return false;
        }
        this.f8811f = c2722c;
        if (c2722c.f8806a == null) {
            c2722c.f8806a = new HashSet();
        }
        HashSet hashSet = this.f8811f.f8806a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f8812g = r3;
        this.f8813h = r4;
        return true;
    }

    /* renamed from: c */
    public final void m5249c(int r3, ArrayList arrayList, C2762n c2762n) {
        HashSet hashSet = this.f8806a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AbstractC2756h.m5362b(((C2722c) it.next()).f8809d, r3, arrayList, c2762n);
            }
        }
    }

    /* renamed from: d */
    public final int m5250d() {
        if (this.f8808c) {
            return this.f8807b;
        }
        return 0;
    }

    /* renamed from: e */
    public final int m5251e() {
        C2722c c2722c;
        if (this.f8809d.f8854g0 == 8) {
            return 0;
        }
        int r02 = this.f8813h;
        return (r02 == Integer.MIN_VALUE || (c2722c = this.f8811f) == null || c2722c.f8809d.f8854g0 != 8) ? this.f8812g : r02;
    }

    /* renamed from: f */
    public final C2722c m5252f() {
        int r02 = this.f8810e;
        int m5234a = AbstractC2714e.m5234a(r02);
        C2723d c2723d = this.f8809d;
        switch (m5234a) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return c2723d.f8825K;
            case 2:
                return c2723d.f8826L;
            case 3:
                return c2723d.f8823I;
            case 4:
                return c2723d.f8824J;
            default:
                throw new AssertionError(AbstractC0002c.m18m(r02));
        }
    }

    /* renamed from: g */
    public final boolean m5253g() {
        HashSet hashSet = this.f8806a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((C2722c) it.next()).m5252f().m5254h()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public final boolean m5254h() {
        return this.f8811f != null;
    }

    /* renamed from: i */
    public final boolean m5255i(C2722c c2722c) {
        if (c2722c == null) {
            return false;
        }
        int r2 = this.f8810e;
        C2723d c2723d = c2722c.f8809d;
        int r11 = c2722c.f8810e;
        if (r11 == r2) {
            return r2 != 6 || (c2723d.f8819E && this.f8809d.f8819E);
        }
        switch (AbstractC2714e.m5234a(r2)) {
            case 0:
            case 7:
            case 8:
                return false;
            case 1:
            case 3:
                boolean z2 = r11 == 2 || r11 == 4;
                if (c2723d instanceof C2727h) {
                    return z2 || r11 == 8;
                }
                return z2;
            case 2:
            case 4:
                boolean z3 = r11 == 3 || r11 == 5;
                if (c2723d instanceof C2727h) {
                    return z3 || r11 == 9;
                }
                return z3;
            case 5:
                return (r11 == 2 || r11 == 4) ? false : true;
            case 6:
                return (r11 == 6 || r11 == 8 || r11 == 9) ? false : true;
            default:
                throw new AssertionError(AbstractC0002c.m18m(r2));
        }
    }

    /* renamed from: j */
    public final void m5256j() {
        HashSet hashSet;
        C2722c c2722c = this.f8811f;
        if (c2722c != null && (hashSet = c2722c.f8806a) != null) {
            hashSet.remove(this);
            if (this.f8811f.f8806a.size() == 0) {
                this.f8811f.f8806a = null;
            }
        }
        this.f8806a = null;
        this.f8811f = null;
        this.f8812g = 0;
        this.f8813h = Integer.MIN_VALUE;
        this.f8808c = false;
        this.f8807b = 0;
    }

    /* renamed from: k */
    public final void m5257k() {
        C2715f c2715f = this.f8814i;
        if (c2715f == null) {
            this.f8814i = new C2715f(1);
        } else {
            c2715f.m5237c();
        }
    }

    /* renamed from: l */
    public final void m5258l(int r12) {
        this.f8807b = r12;
        this.f8808c = true;
    }

    public final String toString() {
        return this.f8809d.f8856h0 + StringUtils.PROCESS_POSTFIX_DELIMITER + AbstractC0002c.m18m(this.f8810e);
    }
}
