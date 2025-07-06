package p126t;

import p123s.AbstractC2728i;
import p123s.C2722c;
import p123s.C2723d;

/* renamed from: t.k */
/* loaded from: classes.dex */
public final class C2759k extends AbstractC2763o {

    /* renamed from: k */
    public static final int[] f9039k = new int[2];

    /* renamed from: m */
    public static void m5372m(int[] r2, int r3, int r4, int r5, int r6, float f, int r8) {
        int r42 = r4 - r3;
        int r62 = r6 - r5;
        if (r8 != -1) {
            if (r8 == 0) {
                r2[0] = (int) ((r62 * f) + 0.5f);
                r2[1] = r62;
                return;
            } else {
                if (r8 != 1) {
                    return;
                }
                r2[0] = r42;
                r2[1] = (int) ((r42 * f) + 0.5f);
                return;
            }
        }
        int r32 = (int) ((r62 * f) + 0.5f);
        int r7 = (int) ((r42 / f) + 0.5f);
        if (r32 <= r42) {
            r2[0] = r32;
            r2[1] = r62;
        } else if (r7 <= r62) {
            r2[0] = r42;
            r2[1] = r7;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0244, code lost:
    
        if (r3 != 1) goto L128;
     */
    @Override // p126t.InterfaceC2752d
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo5343a(p126t.InterfaceC2752d r24) {
        /*
            Method dump skipped, instructions count: 907
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p126t.C2759k.mo5343a(t.d):void");
    }

    @Override // p126t.AbstractC2763o
    /* renamed from: d */
    public final void mo5344d() {
        C2723d c2723d;
        C2723d c2723d2;
        int r9;
        C2723d c2723d3;
        C2723d c2723d4;
        int r10;
        C2723d c2723d5 = this.f9051b;
        boolean z2 = c2723d5.f8841a;
        C2755g c2755g = this.f9054e;
        if (z2) {
            c2755g.mo5360d(c2723d5.m5288q());
        }
        boolean z3 = c2755g.f9034j;
        C2754f c2754f = this.f9058i;
        C2754f c2754f2 = this.f9057h;
        if (!z3) {
            C2723d c2723d6 = this.f9051b;
            int r8 = c2723d6.f8872p0[0];
            this.f9053d = r8;
            if (r8 != 3) {
                if (r8 == 4 && (c2723d4 = c2723d6.f8834T) != null && ((r10 = c2723d4.f8872p0[0]) == 1 || r10 == 4)) {
                    int m5288q = (c2723d4.m5288q() - this.f9051b.f8823I.m5251e()) - this.f9051b.f8825K.m5251e();
                    AbstractC2763o.m5380b(c2754f2, c2723d4.f8847d.f9057h, this.f9051b.f8823I.m5251e());
                    AbstractC2763o.m5380b(c2754f, c2723d4.f8847d.f9058i, -this.f9051b.f8825K.m5251e());
                    c2755g.mo5360d(m5288q);
                    return;
                }
                if (r8 == 1) {
                    c2755g.mo5360d(c2723d6.m5288q());
                }
            }
        } else if (this.f9053d == 4 && (c2723d2 = (c2723d = this.f9051b).f8834T) != null && ((r9 = c2723d2.f8872p0[0]) == 1 || r9 == 4)) {
            AbstractC2763o.m5380b(c2754f2, c2723d2.f8847d.f9057h, c2723d.f8823I.m5251e());
            AbstractC2763o.m5380b(c2754f, c2723d2.f8847d.f9058i, -this.f9051b.f8825K.m5251e());
            return;
        }
        if (c2755g.f9034j) {
            C2723d c2723d7 = this.f9051b;
            if (c2723d7.f8841a) {
                C2722c[] c2722cArr = c2723d7.f8831Q;
                C2722c c2722c = c2722cArr[0];
                C2722c c2722c2 = c2722c.f8811f;
                if (c2722c2 != null && c2722cArr[1].f8811f != null) {
                    if (c2723d7.m5295x()) {
                        c2754f2.f9030f = this.f9051b.f8831Q[0].m5251e();
                        c2754f.f9030f = -this.f9051b.f8831Q[1].m5251e();
                        return;
                    }
                    C2754f m5381h = AbstractC2763o.m5381h(this.f9051b.f8831Q[0]);
                    if (m5381h != null) {
                        AbstractC2763o.m5380b(c2754f2, m5381h, this.f9051b.f8831Q[0].m5251e());
                    }
                    C2754f m5381h2 = AbstractC2763o.m5381h(this.f9051b.f8831Q[1]);
                    if (m5381h2 != null) {
                        AbstractC2763o.m5380b(c2754f, m5381h2, -this.f9051b.f8831Q[1].m5251e());
                    }
                    c2754f2.f9026b = true;
                    c2754f.f9026b = true;
                    return;
                }
                if (c2722c2 != null) {
                    C2754f m5381h3 = AbstractC2763o.m5381h(c2722c);
                    if (m5381h3 != null) {
                        AbstractC2763o.m5380b(c2754f2, m5381h3, this.f9051b.f8831Q[0].m5251e());
                        AbstractC2763o.m5380b(c2754f, c2754f2, c2755g.f9031g);
                        return;
                    }
                    return;
                }
                C2722c c2722c3 = c2722cArr[1];
                if (c2722c3.f8811f != null) {
                    C2754f m5381h4 = AbstractC2763o.m5381h(c2722c3);
                    if (m5381h4 != null) {
                        AbstractC2763o.m5380b(c2754f, m5381h4, -this.f9051b.f8831Q[1].m5251e());
                        AbstractC2763o.m5380b(c2754f2, c2754f, -c2755g.f9031g);
                        return;
                    }
                    return;
                }
                if ((c2723d7 instanceof AbstractC2728i) || c2723d7.f8834T == null || c2723d7.mo5282i(7).f8811f != null) {
                    return;
                }
                C2723d c2723d8 = this.f9051b;
                AbstractC2763o.m5380b(c2754f2, c2723d8.f8834T.f8847d.f9057h, c2723d8.m5289r());
                AbstractC2763o.m5380b(c2754f, c2754f2, c2755g.f9031g);
                return;
            }
        }
        if (this.f9053d == 3) {
            C2723d c2723d9 = this.f9051b;
            int r82 = c2723d9.f8874r;
            if (r82 == 2) {
                C2723d c2723d10 = c2723d9.f8834T;
                if (c2723d10 != null) {
                    C2755g c2755g2 = c2723d10.f8849e.f9054e;
                    c2755g.f9036l.add(c2755g2);
                    c2755g2.f9035k.add(c2755g);
                    c2755g.f9026b = true;
                    c2755g.f9035k.add(c2754f2);
                    c2755g.f9035k.add(c2754f);
                }
            } else if (r82 == 3) {
                if (c2723d9.f8875s == 3) {
                    c2754f2.f9025a = this;
                    c2754f.f9025a = this;
                    C2761m c2761m = c2723d9.f8849e;
                    c2761m.f9057h.f9025a = this;
                    c2761m.f9058i.f9025a = this;
                    c2755g.f9025a = this;
                    if (c2723d9.m5296y()) {
                        c2755g.f9036l.add(this.f9051b.f8849e.f9054e);
                        this.f9051b.f8849e.f9054e.f9035k.add(c2755g);
                        C2761m c2761m2 = this.f9051b.f8849e;
                        c2761m2.f9054e.f9025a = this;
                        c2755g.f9036l.add(c2761m2.f9057h);
                        c2755g.f9036l.add(this.f9051b.f8849e.f9058i);
                        this.f9051b.f8849e.f9057h.f9035k.add(c2755g);
                        this.f9051b.f8849e.f9058i.f9035k.add(c2755g);
                    } else if (this.f9051b.m5295x()) {
                        this.f9051b.f8849e.f9054e.f9036l.add(c2755g);
                        c2755g.f9035k.add(this.f9051b.f8849e.f9054e);
                    } else {
                        this.f9051b.f8849e.f9054e.f9036l.add(c2755g);
                    }
                } else {
                    C2755g c2755g3 = c2723d9.f8849e.f9054e;
                    c2755g.f9036l.add(c2755g3);
                    c2755g3.f9035k.add(c2755g);
                    this.f9051b.f8849e.f9057h.f9035k.add(c2755g);
                    this.f9051b.f8849e.f9058i.f9035k.add(c2755g);
                    c2755g.f9026b = true;
                    c2755g.f9035k.add(c2754f2);
                    c2755g.f9035k.add(c2754f);
                    c2754f2.f9036l.add(c2755g);
                    c2754f.f9036l.add(c2755g);
                }
            }
        }
        C2723d c2723d11 = this.f9051b;
        C2722c[] c2722cArr2 = c2723d11.f8831Q;
        C2722c c2722c4 = c2722cArr2[0];
        C2722c c2722c5 = c2722c4.f8811f;
        if (c2722c5 != null && c2722cArr2[1].f8811f != null) {
            if (c2723d11.m5295x()) {
                c2754f2.f9030f = this.f9051b.f8831Q[0].m5251e();
                c2754f.f9030f = -this.f9051b.f8831Q[1].m5251e();
                return;
            }
            C2754f m5381h5 = AbstractC2763o.m5381h(this.f9051b.f8831Q[0]);
            C2754f m5381h6 = AbstractC2763o.m5381h(this.f9051b.f8831Q[1]);
            if (m5381h5 != null) {
                m5381h5.m5358b(this);
            }
            if (m5381h6 != null) {
                m5381h6.m5358b(this);
            }
            this.f9059j = 4;
            return;
        }
        if (c2722c5 != null) {
            C2754f m5381h7 = AbstractC2763o.m5381h(c2722c4);
            if (m5381h7 != null) {
                AbstractC2763o.m5380b(c2754f2, m5381h7, this.f9051b.f8831Q[0].m5251e());
                m5383c(c2754f, c2754f2, 1, c2755g);
                return;
            }
            return;
        }
        C2722c c2722c6 = c2722cArr2[1];
        if (c2722c6.f8811f != null) {
            C2754f m5381h8 = AbstractC2763o.m5381h(c2722c6);
            if (m5381h8 != null) {
                AbstractC2763o.m5380b(c2754f, m5381h8, -this.f9051b.f8831Q[1].m5251e());
                m5383c(c2754f2, c2754f, -1, c2755g);
                return;
            }
            return;
        }
        if ((c2723d11 instanceof AbstractC2728i) || (c2723d3 = c2723d11.f8834T) == null) {
            return;
        }
        AbstractC2763o.m5380b(c2754f2, c2723d3.f8847d.f9057h, c2723d11.m5289r());
        m5383c(c2754f, c2754f2, 1, c2755g);
    }

    @Override // p126t.AbstractC2763o
    /* renamed from: e */
    public final void mo5345e() {
        C2754f c2754f = this.f9057h;
        if (c2754f.f9034j) {
            this.f9051b.f8839Y = c2754f.f9031g;
        }
    }

    @Override // p126t.AbstractC2763o
    /* renamed from: f */
    public final void mo5346f() {
        this.f9052c = null;
        this.f9057h.m5359c();
        this.f9058i.m5359c();
        this.f9054e.m5359c();
        this.f9056g = false;
    }

    @Override // p126t.AbstractC2763o
    /* renamed from: k */
    public final boolean mo5348k() {
        return this.f9053d != 3 || this.f9051b.f8874r == 0;
    }

    /* renamed from: n */
    public final void m5373n() {
        this.f9056g = false;
        C2754f c2754f = this.f9057h;
        c2754f.m5359c();
        c2754f.f9034j = false;
        C2754f c2754f2 = this.f9058i;
        c2754f2.m5359c();
        c2754f2.f9034j = false;
        this.f9054e.f9034j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f9051b.f8856h0;
    }
}
