package p126t;

import p118q.AbstractC2714e;
import p123s.AbstractC2728i;
import p123s.C2722c;
import p123s.C2723d;

/* renamed from: t.m */
/* loaded from: classes.dex */
public final class C2761m extends AbstractC2763o {

    /* renamed from: k */
    public C2754f f9042k;

    /* renamed from: l */
    public C2749a f9043l;

    @Override // p126t.InterfaceC2752d
    /* renamed from: a */
    public final void mo5343a(InterfaceC2752d interfaceC2752d) {
        float f;
        float f2;
        float f3;
        int r2;
        if (AbstractC2714e.m5234a(this.f9059j) == 3) {
            C2723d c2723d = this.f9051b;
            m5385l(c2723d.f8824J, c2723d.f8826L, 1);
            return;
        }
        C2755g c2755g = this.f9054e;
        if (c2755g.f9027c && !c2755g.f9034j && this.f9053d == 3) {
            C2723d c2723d2 = this.f9051b;
            int r5 = c2723d2.f8875s;
            if (r5 == 2) {
                C2723d c2723d3 = c2723d2.f8834T;
                if (c2723d3 != null) {
                    if (c2723d3.f8849e.f9054e.f9034j) {
                        c2755g.mo5360d((int) ((r5.f9031g * c2723d2.f8882z) + 0.5f));
                    }
                }
            } else if (r5 == 3) {
                C2755g c2755g2 = c2723d2.f8847d.f9054e;
                if (c2755g2.f9034j) {
                    int r6 = c2723d2.f8838X;
                    if (r6 == -1) {
                        f = c2755g2.f9031g;
                        f2 = c2723d2.f8837W;
                    } else if (r6 == 0) {
                        f3 = c2755g2.f9031g * c2723d2.f8837W;
                        r2 = (int) (f3 + 0.5f);
                        c2755g.mo5360d(r2);
                    } else if (r6 != 1) {
                        r2 = 0;
                        c2755g.mo5360d(r2);
                    } else {
                        f = c2755g2.f9031g;
                        f2 = c2723d2.f8837W;
                    }
                    f3 = f / f2;
                    r2 = (int) (f3 + 0.5f);
                    c2755g.mo5360d(r2);
                }
            }
        }
        C2754f c2754f = this.f9057h;
        if (c2754f.f9027c) {
            C2754f c2754f2 = this.f9058i;
            if (c2754f2.f9027c) {
                if (c2754f.f9034j && c2754f2.f9034j && c2755g.f9034j) {
                    return;
                }
                if (!c2755g.f9034j && this.f9053d == 3) {
                    C2723d c2723d4 = this.f9051b;
                    if (c2723d4.f8874r == 0 && !c2723d4.m5296y()) {
                        C2754f c2754f3 = (C2754f) c2754f.f9036l.get(0);
                        C2754f c2754f4 = (C2754f) c2754f2.f9036l.get(0);
                        int r02 = c2754f3.f9031g + c2754f.f9030f;
                        int r12 = c2754f4.f9031g + c2754f2.f9030f;
                        c2754f.mo5360d(r02);
                        c2754f2.mo5360d(r12);
                        c2755g.mo5360d(r12 - r02);
                        return;
                    }
                }
                if (!c2755g.f9034j && this.f9053d == 3 && this.f9050a == 1 && c2754f.f9036l.size() > 0 && c2754f2.f9036l.size() > 0) {
                    C2754f c2754f5 = (C2754f) c2754f.f9036l.get(0);
                    int r13 = (((C2754f) c2754f2.f9036l.get(0)).f9031g + c2754f2.f9030f) - (c2754f5.f9031g + c2754f.f9030f);
                    int r03 = c2755g.f9037m;
                    if (r13 < r03) {
                        c2755g.mo5360d(r13);
                    } else {
                        c2755g.mo5360d(r03);
                    }
                }
                if (c2755g.f9034j && c2754f.f9036l.size() > 0 && c2754f2.f9036l.size() > 0) {
                    C2754f c2754f6 = (C2754f) c2754f.f9036l.get(0);
                    C2754f c2754f7 = (C2754f) c2754f2.f9036l.get(0);
                    int r4 = c2754f6.f9031g;
                    int r62 = c2754f.f9030f + r4;
                    int r7 = c2754f7.f9031g;
                    int r8 = c2754f2.f9030f + r7;
                    float f4 = this.f9051b.f8850e0;
                    if (c2754f6 == c2754f7) {
                        f4 = 0.5f;
                    } else {
                        r4 = r62;
                        r7 = r8;
                    }
                    c2754f.mo5360d((int) ((((r7 - r4) - c2755g.f9031g) * f4) + r4 + 0.5f));
                    c2754f2.mo5360d(c2754f.f9031g + c2755g.f9031g);
                }
            }
        }
    }

    @Override // p126t.AbstractC2763o
    /* renamed from: d */
    public final void mo5344d() {
        C2723d c2723d;
        C2723d c2723d2;
        C2723d c2723d3;
        C2723d c2723d4;
        C2723d c2723d5 = this.f9051b;
        boolean z2 = c2723d5.f8841a;
        C2755g c2755g = this.f9054e;
        if (z2) {
            c2755g.mo5360d(c2723d5.m5284k());
        }
        boolean z3 = c2755g.f9034j;
        C2754f c2754f = this.f9058i;
        C2754f c2754f2 = this.f9057h;
        if (!z3) {
            C2723d c2723d6 = this.f9051b;
            this.f9053d = c2723d6.f8872p0[1];
            if (c2723d6.f8819E) {
                this.f9043l = new C2749a(this);
            }
            int r02 = this.f9053d;
            if (r02 != 3) {
                if (r02 == 4 && (c2723d4 = this.f9051b.f8834T) != null && c2723d4.f8872p0[1] == 1) {
                    int m5284k = (c2723d4.m5284k() - this.f9051b.f8824J.m5251e()) - this.f9051b.f8826L.m5251e();
                    AbstractC2763o.m5380b(c2754f2, c2723d4.f8849e.f9057h, this.f9051b.f8824J.m5251e());
                    AbstractC2763o.m5380b(c2754f, c2723d4.f8849e.f9058i, -this.f9051b.f8826L.m5251e());
                    c2755g.mo5360d(m5284k);
                    return;
                }
                if (r02 == 1) {
                    c2755g.mo5360d(this.f9051b.m5284k());
                }
            }
        } else if (this.f9053d == 4 && (c2723d2 = (c2723d = this.f9051b).f8834T) != null && c2723d2.f8872p0[1] == 1) {
            AbstractC2763o.m5380b(c2754f2, c2723d2.f8849e.f9057h, c2723d.f8824J.m5251e());
            AbstractC2763o.m5380b(c2754f, c2723d2.f8849e.f9058i, -this.f9051b.f8826L.m5251e());
            return;
        }
        boolean z4 = c2755g.f9034j;
        C2754f c2754f3 = this.f9042k;
        if (z4) {
            C2723d c2723d7 = this.f9051b;
            if (c2723d7.f8841a) {
                C2722c[] c2722cArr = c2723d7.f8831Q;
                C2722c c2722c = c2722cArr[2];
                C2722c c2722c2 = c2722c.f8811f;
                if (c2722c2 != null && c2722cArr[3].f8811f != null) {
                    if (c2723d7.m5296y()) {
                        c2754f2.f9030f = this.f9051b.f8831Q[2].m5251e();
                        c2754f.f9030f = -this.f9051b.f8831Q[3].m5251e();
                    } else {
                        C2754f m5381h = AbstractC2763o.m5381h(this.f9051b.f8831Q[2]);
                        if (m5381h != null) {
                            AbstractC2763o.m5380b(c2754f2, m5381h, this.f9051b.f8831Q[2].m5251e());
                        }
                        C2754f m5381h2 = AbstractC2763o.m5381h(this.f9051b.f8831Q[3]);
                        if (m5381h2 != null) {
                            AbstractC2763o.m5380b(c2754f, m5381h2, -this.f9051b.f8831Q[3].m5251e());
                        }
                        c2754f2.f9026b = true;
                        c2754f.f9026b = true;
                    }
                    C2723d c2723d8 = this.f9051b;
                    if (c2723d8.f8819E) {
                        AbstractC2763o.m5380b(c2754f3, c2754f2, c2723d8.f8842a0);
                        return;
                    }
                    return;
                }
                if (c2722c2 != null) {
                    C2754f m5381h3 = AbstractC2763o.m5381h(c2722c);
                    if (m5381h3 != null) {
                        AbstractC2763o.m5380b(c2754f2, m5381h3, this.f9051b.f8831Q[2].m5251e());
                        AbstractC2763o.m5380b(c2754f, c2754f2, c2755g.f9031g);
                        C2723d c2723d9 = this.f9051b;
                        if (c2723d9.f8819E) {
                            AbstractC2763o.m5380b(c2754f3, c2754f2, c2723d9.f8842a0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                C2722c c2722c3 = c2722cArr[3];
                if (c2722c3.f8811f != null) {
                    C2754f m5381h4 = AbstractC2763o.m5381h(c2722c3);
                    if (m5381h4 != null) {
                        AbstractC2763o.m5380b(c2754f, m5381h4, -this.f9051b.f8831Q[3].m5251e());
                        AbstractC2763o.m5380b(c2754f2, c2754f, -c2755g.f9031g);
                    }
                    C2723d c2723d10 = this.f9051b;
                    if (c2723d10.f8819E) {
                        AbstractC2763o.m5380b(c2754f3, c2754f2, c2723d10.f8842a0);
                        return;
                    }
                    return;
                }
                C2722c c2722c4 = c2722cArr[4];
                if (c2722c4.f8811f != null) {
                    C2754f m5381h5 = AbstractC2763o.m5381h(c2722c4);
                    if (m5381h5 != null) {
                        AbstractC2763o.m5380b(c2754f3, m5381h5, 0);
                        AbstractC2763o.m5380b(c2754f2, c2754f3, -this.f9051b.f8842a0);
                        AbstractC2763o.m5380b(c2754f, c2754f2, c2755g.f9031g);
                        return;
                    }
                    return;
                }
                if ((c2723d7 instanceof AbstractC2728i) || c2723d7.f8834T == null || c2723d7.mo5282i(7).f8811f != null) {
                    return;
                }
                C2723d c2723d11 = this.f9051b;
                AbstractC2763o.m5380b(c2754f2, c2723d11.f8834T.f8849e.f9057h, c2723d11.m5290s());
                AbstractC2763o.m5380b(c2754f, c2754f2, c2755g.f9031g);
                C2723d c2723d12 = this.f9051b;
                if (c2723d12.f8819E) {
                    AbstractC2763o.m5380b(c2754f3, c2754f2, c2723d12.f8842a0);
                    return;
                }
                return;
            }
        }
        if (z4 || this.f9053d != 3) {
            c2755g.m5358b(this);
        } else {
            C2723d c2723d13 = this.f9051b;
            int r10 = c2723d13.f8875s;
            if (r10 == 2) {
                C2723d c2723d14 = c2723d13.f8834T;
                if (c2723d14 != null) {
                    C2755g c2755g2 = c2723d14.f8849e.f9054e;
                    c2755g.f9036l.add(c2755g2);
                    c2755g2.f9035k.add(c2755g);
                    c2755g.f9026b = true;
                    c2755g.f9035k.add(c2754f2);
                    c2755g.f9035k.add(c2754f);
                }
            } else if (r10 == 3 && !c2723d13.m5296y()) {
                C2723d c2723d15 = this.f9051b;
                if (c2723d15.f8874r != 3) {
                    C2755g c2755g3 = c2723d15.f8847d.f9054e;
                    c2755g.f9036l.add(c2755g3);
                    c2755g3.f9035k.add(c2755g);
                    c2755g.f9026b = true;
                    c2755g.f9035k.add(c2754f2);
                    c2755g.f9035k.add(c2754f);
                }
            }
        }
        C2723d c2723d16 = this.f9051b;
        C2722c[] c2722cArr2 = c2723d16.f8831Q;
        C2722c c2722c5 = c2722cArr2[2];
        C2722c c2722c6 = c2722c5.f8811f;
        if (c2722c6 != null && c2722cArr2[3].f8811f != null) {
            if (c2723d16.m5296y()) {
                c2754f2.f9030f = this.f9051b.f8831Q[2].m5251e();
                c2754f.f9030f = -this.f9051b.f8831Q[3].m5251e();
            } else {
                C2754f m5381h6 = AbstractC2763o.m5381h(this.f9051b.f8831Q[2]);
                C2754f m5381h7 = AbstractC2763o.m5381h(this.f9051b.f8831Q[3]);
                if (m5381h6 != null) {
                    m5381h6.m5358b(this);
                }
                if (m5381h7 != null) {
                    m5381h7.m5358b(this);
                }
                this.f9059j = 4;
            }
            if (this.f9051b.f8819E) {
                m5383c(c2754f3, c2754f2, 1, this.f9043l);
            }
        } else if (c2722c6 != null) {
            C2754f m5381h8 = AbstractC2763o.m5381h(c2722c5);
            if (m5381h8 != null) {
                AbstractC2763o.m5380b(c2754f2, m5381h8, this.f9051b.f8831Q[2].m5251e());
                m5383c(c2754f, c2754f2, 1, c2755g);
                if (this.f9051b.f8819E) {
                    m5383c(c2754f3, c2754f2, 1, this.f9043l);
                }
                if (this.f9053d == 3) {
                    C2723d c2723d17 = this.f9051b;
                    if (c2723d17.f8837W > 0.0f) {
                        C2759k c2759k = c2723d17.f8847d;
                        if (c2759k.f9053d == 3) {
                            c2759k.f9054e.f9035k.add(c2755g);
                            c2755g.f9036l.add(this.f9051b.f8847d.f9054e);
                            c2755g.f9025a = this;
                        }
                    }
                }
            }
        } else {
            C2722c c2722c7 = c2722cArr2[3];
            if (c2722c7.f8811f != null) {
                C2754f m5381h9 = AbstractC2763o.m5381h(c2722c7);
                if (m5381h9 != null) {
                    AbstractC2763o.m5380b(c2754f, m5381h9, -this.f9051b.f8831Q[3].m5251e());
                    m5383c(c2754f2, c2754f, -1, c2755g);
                    if (this.f9051b.f8819E) {
                        m5383c(c2754f3, c2754f2, 1, this.f9043l);
                    }
                }
            } else {
                C2722c c2722c8 = c2722cArr2[4];
                if (c2722c8.f8811f != null) {
                    C2754f m5381h10 = AbstractC2763o.m5381h(c2722c8);
                    if (m5381h10 != null) {
                        AbstractC2763o.m5380b(c2754f3, m5381h10, 0);
                        m5383c(c2754f2, c2754f3, -1, this.f9043l);
                        m5383c(c2754f, c2754f2, 1, c2755g);
                    }
                } else if (!(c2723d16 instanceof AbstractC2728i) && (c2723d3 = c2723d16.f8834T) != null) {
                    AbstractC2763o.m5380b(c2754f2, c2723d3.f8849e.f9057h, c2723d16.m5290s());
                    m5383c(c2754f, c2754f2, 1, c2755g);
                    if (this.f9051b.f8819E) {
                        m5383c(c2754f3, c2754f2, 1, this.f9043l);
                    }
                    if (this.f9053d == 3) {
                        C2723d c2723d18 = this.f9051b;
                        if (c2723d18.f8837W > 0.0f) {
                            C2759k c2759k2 = c2723d18.f8847d;
                            if (c2759k2.f9053d == 3) {
                                c2759k2.f9054e.f9035k.add(c2755g);
                                c2755g.f9036l.add(this.f9051b.f8847d.f9054e);
                                c2755g.f9025a = this;
                            }
                        }
                    }
                }
            }
        }
        if (c2755g.f9036l.size() == 0) {
            c2755g.f9027c = true;
        }
    }

    @Override // p126t.AbstractC2763o
    /* renamed from: e */
    public final void mo5345e() {
        C2754f c2754f = this.f9057h;
        if (c2754f.f9034j) {
            this.f9051b.f8840Z = c2754f.f9031g;
        }
    }

    @Override // p126t.AbstractC2763o
    /* renamed from: f */
    public final void mo5346f() {
        this.f9052c = null;
        this.f9057h.m5359c();
        this.f9058i.m5359c();
        this.f9042k.m5359c();
        this.f9054e.m5359c();
        this.f9056g = false;
    }

    @Override // p126t.AbstractC2763o
    /* renamed from: k */
    public final boolean mo5348k() {
        return this.f9053d != 3 || this.f9051b.f8875s == 0;
    }

    /* renamed from: m */
    public final void m5376m() {
        this.f9056g = false;
        C2754f c2754f = this.f9057h;
        c2754f.m5359c();
        c2754f.f9034j = false;
        C2754f c2754f2 = this.f9058i;
        c2754f2.m5359c();
        c2754f2.f9034j = false;
        C2754f c2754f3 = this.f9042k;
        c2754f3.m5359c();
        c2754f3.f9034j = false;
        this.f9054e.f9034j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f9051b.f8856h0;
    }
}
