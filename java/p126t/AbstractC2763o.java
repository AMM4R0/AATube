package p126t;

import p118q.AbstractC2714e;
import p123s.C2722c;
import p123s.C2723d;

/* renamed from: t.o */
/* loaded from: classes.dex */
public abstract class AbstractC2763o implements InterfaceC2752d {

    /* renamed from: a */
    public int f9050a;

    /* renamed from: b */
    public C2723d f9051b;

    /* renamed from: c */
    public C2760l f9052c;

    /* renamed from: d */
    public int f9053d;

    /* renamed from: e */
    public final C2755g f9054e = new C2755g(this);

    /* renamed from: f */
    public int f9055f = 0;

    /* renamed from: g */
    public boolean f9056g = false;

    /* renamed from: h */
    public final C2754f f9057h = new C2754f(this);

    /* renamed from: i */
    public final C2754f f9058i = new C2754f(this);

    /* renamed from: j */
    public int f9059j = 1;

    public AbstractC2763o(C2723d c2723d) {
        this.f9051b = c2723d;
    }

    /* renamed from: b */
    public static void m5380b(C2754f c2754f, C2754f c2754f2, int r3) {
        c2754f.f9036l.add(c2754f2);
        c2754f.f9030f = r3;
        c2754f2.f9035k.add(c2754f);
    }

    /* renamed from: h */
    public static C2754f m5381h(C2722c c2722c) {
        C2722c c2722c2 = c2722c.f8811f;
        if (c2722c2 == null) {
            return null;
        }
        int m5234a = AbstractC2714e.m5234a(c2722c2.f8810e);
        C2723d c2723d = c2722c2.f8809d;
        if (m5234a == 1) {
            return c2723d.f8847d.f9057h;
        }
        if (m5234a == 2) {
            return c2723d.f8849e.f9057h;
        }
        if (m5234a == 3) {
            return c2723d.f8847d.f9058i;
        }
        if (m5234a == 4) {
            return c2723d.f8849e.f9058i;
        }
        if (m5234a != 5) {
            return null;
        }
        return c2723d.f8849e.f9042k;
    }

    /* renamed from: i */
    public static C2754f m5382i(C2722c c2722c, int r3) {
        C2722c c2722c2 = c2722c.f8811f;
        if (c2722c2 == null) {
            return null;
        }
        C2723d c2723d = c2722c2.f8809d;
        AbstractC2763o abstractC2763o = r3 == 0 ? c2723d.f8847d : c2723d.f8849e;
        int m5234a = AbstractC2714e.m5234a(c2722c2.f8810e);
        if (m5234a == 1 || m5234a == 2) {
            return abstractC2763o.f9057h;
        }
        if (m5234a == 3 || m5234a == 4) {
            return abstractC2763o.f9058i;
        }
        return null;
    }

    /* renamed from: c */
    public final void m5383c(C2754f c2754f, C2754f c2754f2, int r5, C2755g c2755g) {
        c2754f.f9036l.add(c2754f2);
        c2754f.f9036l.add(this.f9054e);
        c2754f.f9032h = r5;
        c2754f.f9033i = c2755g;
        c2754f2.f9035k.add(c2754f);
        c2755g.f9035k.add(c2754f);
    }

    /* renamed from: d */
    public abstract void mo5344d();

    /* renamed from: e */
    public abstract void mo5345e();

    /* renamed from: f */
    public abstract void mo5346f();

    /* renamed from: g */
    public final int m5384g(int r2, int r3) {
        int max;
        if (r3 == 0) {
            C2723d c2723d = this.f9051b;
            int r02 = c2723d.f8878v;
            max = Math.max(c2723d.f8877u, r2);
            if (r02 > 0) {
                max = Math.min(r02, r2);
            }
            if (max == r2) {
                return r2;
            }
        } else {
            C2723d c2723d2 = this.f9051b;
            int r03 = c2723d2.f8881y;
            max = Math.max(c2723d2.f8880x, r2);
            if (r03 > 0) {
                max = Math.min(r03, r2);
            }
            if (max == r2) {
                return r2;
            }
        }
        return max;
    }

    /* renamed from: j */
    public long mo5347j() {
        if (this.f9054e.f9034j) {
            return r0.f9031g;
        }
        return 0L;
    }

    /* renamed from: k */
    public abstract boolean mo5348k();

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r9.f9050a == 3) goto L50;
     */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m5385l(p123s.C2722c r12, p123s.C2722c r13, int r14) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p126t.AbstractC2763o.m5385l(s.c, s.c, int):void");
    }
}
