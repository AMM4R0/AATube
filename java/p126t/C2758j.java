package p126t;

import java.util.Iterator;
import p123s.C2720a;
import p123s.C2723d;

/* renamed from: t.j */
/* loaded from: classes.dex */
public final class C2758j extends AbstractC2763o {
    @Override // p126t.InterfaceC2752d
    /* renamed from: a */
    public final void mo5343a(InterfaceC2752d interfaceC2752d) {
        C2720a c2720a = (C2720a) this.f9051b;
        int r02 = c2720a.f8785s0;
        C2754f c2754f = this.f9057h;
        Iterator it = c2754f.f9036l.iterator();
        int r4 = 0;
        int r5 = -1;
        while (it.hasNext()) {
            int r6 = ((C2754f) it.next()).f9031g;
            if (r5 == -1 || r6 < r5) {
                r5 = r6;
            }
            if (r4 < r6) {
                r4 = r6;
            }
        }
        if (r02 == 0 || r02 == 2) {
            c2754f.mo5360d(r5 + c2720a.f8787u0);
        } else {
            c2754f.mo5360d(r4 + c2720a.f8787u0);
        }
    }

    @Override // p126t.AbstractC2763o
    /* renamed from: d */
    public final void mo5344d() {
        C2723d c2723d = this.f9051b;
        if (c2723d instanceof C2720a) {
            C2754f c2754f = this.f9057h;
            c2754f.f9026b = true;
            C2720a c2720a = (C2720a) c2723d;
            int r3 = c2720a.f8785s0;
            boolean z2 = c2720a.f8786t0;
            int r6 = 0;
            if (r3 == 0) {
                c2754f.f9029e = 4;
                while (r6 < c2720a.f8966r0) {
                    C2723d c2723d2 = c2720a.f8965q0[r6];
                    if (z2 || c2723d2.f8854g0 != 8) {
                        C2754f c2754f2 = c2723d2.f8847d.f9057h;
                        c2754f2.f9035k.add(c2754f);
                        c2754f.f9036l.add(c2754f2);
                    }
                    r6++;
                }
                m5371m(this.f9051b.f8847d.f9057h);
                m5371m(this.f9051b.f8847d.f9058i);
                return;
            }
            if (r3 == 1) {
                c2754f.f9029e = 5;
                while (r6 < c2720a.f8966r0) {
                    C2723d c2723d3 = c2720a.f8965q0[r6];
                    if (z2 || c2723d3.f8854g0 != 8) {
                        C2754f c2754f3 = c2723d3.f8847d.f9058i;
                        c2754f3.f9035k.add(c2754f);
                        c2754f.f9036l.add(c2754f3);
                    }
                    r6++;
                }
                m5371m(this.f9051b.f8847d.f9057h);
                m5371m(this.f9051b.f8847d.f9058i);
                return;
            }
            if (r3 == 2) {
                c2754f.f9029e = 6;
                while (r6 < c2720a.f8966r0) {
                    C2723d c2723d4 = c2720a.f8965q0[r6];
                    if (z2 || c2723d4.f8854g0 != 8) {
                        C2754f c2754f4 = c2723d4.f8849e.f9057h;
                        c2754f4.f9035k.add(c2754f);
                        c2754f.f9036l.add(c2754f4);
                    }
                    r6++;
                }
                m5371m(this.f9051b.f8849e.f9057h);
                m5371m(this.f9051b.f8849e.f9058i);
                return;
            }
            if (r3 != 3) {
                return;
            }
            c2754f.f9029e = 7;
            while (r6 < c2720a.f8966r0) {
                C2723d c2723d5 = c2720a.f8965q0[r6];
                if (z2 || c2723d5.f8854g0 != 8) {
                    C2754f c2754f5 = c2723d5.f8849e.f9058i;
                    c2754f5.f9035k.add(c2754f);
                    c2754f.f9036l.add(c2754f5);
                }
                r6++;
            }
            m5371m(this.f9051b.f8849e.f9057h);
            m5371m(this.f9051b.f8849e.f9058i);
        }
    }

    @Override // p126t.AbstractC2763o
    /* renamed from: e */
    public final void mo5345e() {
        C2723d c2723d = this.f9051b;
        if (c2723d instanceof C2720a) {
            int r12 = ((C2720a) c2723d).f8785s0;
            C2754f c2754f = this.f9057h;
            if (r12 == 0 || r12 == 1) {
                c2723d.f8839Y = c2754f.f9031g;
            } else {
                c2723d.f8840Z = c2754f.f9031g;
            }
        }
    }

    @Override // p126t.AbstractC2763o
    /* renamed from: f */
    public final void mo5346f() {
        this.f9052c = null;
        this.f9057h.m5359c();
    }

    @Override // p126t.AbstractC2763o
    /* renamed from: k */
    public final boolean mo5348k() {
        return false;
    }

    /* renamed from: m */
    public final void m5371m(C2754f c2754f) {
        C2754f c2754f2 = this.f9057h;
        c2754f2.f9035k.add(c2754f);
        c2754f.f9036l.add(c2754f2);
    }
}
