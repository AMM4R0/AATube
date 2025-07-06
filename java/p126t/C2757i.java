package p126t;

import p123s.C2723d;
import p123s.C2727h;

/* renamed from: t.i */
/* loaded from: classes.dex */
public final class C2757i extends AbstractC2763o {
    @Override // p126t.InterfaceC2752d
    /* renamed from: a */
    public final void mo5343a(InterfaceC2752d interfaceC2752d) {
        C2754f c2754f = this.f9057h;
        if (c2754f.f9027c && !c2754f.f9034j) {
            c2754f.mo5360d((int) ((((C2754f) c2754f.f9036l.get(0)).f9031g * ((C2727h) this.f9051b).f8959q0) + 0.5f));
        }
    }

    @Override // p126t.AbstractC2763o
    /* renamed from: d */
    public final void mo5344d() {
        C2723d c2723d = this.f9051b;
        C2727h c2727h = (C2727h) c2723d;
        int r2 = c2727h.f8960r0;
        int r3 = c2727h.f8961s0;
        int r12 = c2727h.f8963u0;
        C2754f c2754f = this.f9057h;
        if (r12 == 1) {
            if (r2 != -1) {
                c2754f.f9036l.add(c2723d.f8834T.f8847d.f9057h);
                this.f9051b.f8834T.f8847d.f9057h.f9035k.add(c2754f);
                c2754f.f9030f = r2;
            } else if (r3 != -1) {
                c2754f.f9036l.add(c2723d.f8834T.f8847d.f9058i);
                this.f9051b.f8834T.f8847d.f9058i.f9035k.add(c2754f);
                c2754f.f9030f = -r3;
            } else {
                c2754f.f9026b = true;
                c2754f.f9036l.add(c2723d.f8834T.f8847d.f9058i);
                this.f9051b.f8834T.f8847d.f9058i.f9035k.add(c2754f);
            }
            m5370m(this.f9051b.f8847d.f9057h);
            m5370m(this.f9051b.f8847d.f9058i);
            return;
        }
        if (r2 != -1) {
            c2754f.f9036l.add(c2723d.f8834T.f8849e.f9057h);
            this.f9051b.f8834T.f8849e.f9057h.f9035k.add(c2754f);
            c2754f.f9030f = r2;
        } else if (r3 != -1) {
            c2754f.f9036l.add(c2723d.f8834T.f8849e.f9058i);
            this.f9051b.f8834T.f8849e.f9058i.f9035k.add(c2754f);
            c2754f.f9030f = -r3;
        } else {
            c2754f.f9026b = true;
            c2754f.f9036l.add(c2723d.f8834T.f8849e.f9058i);
            this.f9051b.f8834T.f8849e.f9058i.f9035k.add(c2754f);
        }
        m5370m(this.f9051b.f8849e.f9057h);
        m5370m(this.f9051b.f8849e.f9058i);
    }

    @Override // p126t.AbstractC2763o
    /* renamed from: e */
    public final void mo5345e() {
        C2723d c2723d = this.f9051b;
        int r12 = ((C2727h) c2723d).f8963u0;
        C2754f c2754f = this.f9057h;
        if (r12 == 1) {
            c2723d.f8839Y = c2754f.f9031g;
        } else {
            c2723d.f8840Z = c2754f.f9031g;
        }
    }

    @Override // p126t.AbstractC2763o
    /* renamed from: f */
    public final void mo5346f() {
        this.f9057h.m5359c();
    }

    @Override // p126t.AbstractC2763o
    /* renamed from: k */
    public final boolean mo5348k() {
        return false;
    }

    /* renamed from: m */
    public final void m5370m(C2754f c2754f) {
        C2754f c2754f2 = this.f9057h;
        c2754f2.f9035k.add(c2754f);
        c2754f.f9036l.add(c2754f2);
    }
}
