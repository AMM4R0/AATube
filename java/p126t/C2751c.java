package p126t;

import java.util.ArrayList;
import java.util.Iterator;
import p123s.C2722c;
import p123s.C2723d;
import p123s.C2724e;

/* renamed from: t.c */
/* loaded from: classes.dex */
public final class C2751c extends AbstractC2763o {

    /* renamed from: k */
    public final ArrayList f9015k;

    /* renamed from: l */
    public int f9016l;

    public C2751c(C2723d c2723d, int r6) {
        super(c2723d);
        C2723d c2723d2;
        this.f9015k = new ArrayList();
        this.f9055f = r6;
        C2723d c2723d3 = this.f9051b;
        C2723d m5286m = c2723d3.m5286m(r6);
        while (true) {
            C2723d c2723d4 = m5286m;
            c2723d2 = c2723d3;
            c2723d3 = c2723d4;
            if (c2723d3 == null) {
                break;
            } else {
                m5286m = c2723d3.m5286m(this.f9055f);
            }
        }
        this.f9051b = c2723d2;
        int r5 = this.f9055f;
        AbstractC2763o abstractC2763o = r5 == 0 ? c2723d2.f8847d : r5 == 1 ? c2723d2.f8849e : null;
        ArrayList arrayList = this.f9015k;
        arrayList.add(abstractC2763o);
        C2723d m5285l = c2723d2.m5285l(this.f9055f);
        while (m5285l != null) {
            int r62 = this.f9055f;
            arrayList.add(r62 == 0 ? m5285l.f8847d : r62 == 1 ? m5285l.f8849e : null);
            m5285l = m5285l.m5285l(this.f9055f);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC2763o abstractC2763o2 = (AbstractC2763o) it.next();
            int r02 = this.f9055f;
            if (r02 == 0) {
                abstractC2763o2.f9051b.f8843b = this;
            } else if (r02 == 1) {
                abstractC2763o2.f9051b.f8845c = this;
            }
        }
        if (this.f9055f == 0 && ((C2724e) this.f9051b.f8834T).f8900v0 && arrayList.size() > 1) {
            this.f9051b = ((AbstractC2763o) arrayList.get(arrayList.size() - 1)).f9051b;
        }
        this.f9016l = this.f9055f == 0 ? this.f9051b.f8858i0 : this.f9051b.f8860j0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:291:0x03aa, code lost:
    
        r2 = r2 - r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00da  */
    @Override // p126t.InterfaceC2752d
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo5343a(p126t.InterfaceC2752d r27) {
        /*
            Method dump skipped, instructions count: 969
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p126t.C2751c.mo5343a(t.d):void");
    }

    @Override // p126t.AbstractC2763o
    /* renamed from: d */
    public final void mo5344d() {
        ArrayList arrayList = this.f9015k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC2763o) it.next()).mo5344d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        C2723d c2723d = ((AbstractC2763o) arrayList.get(0)).f9051b;
        C2723d c2723d2 = ((AbstractC2763o) arrayList.get(size - 1)).f9051b;
        int r12 = this.f9055f;
        C2754f c2754f = this.f9058i;
        C2754f c2754f2 = this.f9057h;
        if (r12 == 0) {
            C2722c c2722c = c2723d.f8823I;
            C2722c c2722c2 = c2723d2.f8825K;
            C2754f m5382i = AbstractC2763o.m5382i(c2722c, 0);
            int m5251e = c2722c.m5251e();
            C2723d m5349m = m5349m();
            if (m5349m != null) {
                m5251e = m5349m.f8823I.m5251e();
            }
            if (m5382i != null) {
                AbstractC2763o.m5380b(c2754f2, m5382i, m5251e);
            }
            C2754f m5382i2 = AbstractC2763o.m5382i(c2722c2, 0);
            int m5251e2 = c2722c2.m5251e();
            C2723d m5350n = m5350n();
            if (m5350n != null) {
                m5251e2 = m5350n.f8825K.m5251e();
            }
            if (m5382i2 != null) {
                AbstractC2763o.m5380b(c2754f, m5382i2, -m5251e2);
            }
        } else {
            C2722c c2722c3 = c2723d.f8824J;
            C2722c c2722c4 = c2723d2.f8826L;
            C2754f m5382i3 = AbstractC2763o.m5382i(c2722c3, 1);
            int m5251e3 = c2722c3.m5251e();
            C2723d m5349m2 = m5349m();
            if (m5349m2 != null) {
                m5251e3 = m5349m2.f8824J.m5251e();
            }
            if (m5382i3 != null) {
                AbstractC2763o.m5380b(c2754f2, m5382i3, m5251e3);
            }
            C2754f m5382i4 = AbstractC2763o.m5382i(c2722c4, 1);
            int m5251e4 = c2722c4.m5251e();
            C2723d m5350n2 = m5350n();
            if (m5350n2 != null) {
                m5251e4 = m5350n2.f8826L.m5251e();
            }
            if (m5382i4 != null) {
                AbstractC2763o.m5380b(c2754f, m5382i4, -m5251e4);
            }
        }
        c2754f2.f9025a = this;
        c2754f.f9025a = this;
    }

    @Override // p126t.AbstractC2763o
    /* renamed from: e */
    public final void mo5345e() {
        int r02 = 0;
        while (true) {
            ArrayList arrayList = this.f9015k;
            if (r02 >= arrayList.size()) {
                return;
            }
            ((AbstractC2763o) arrayList.get(r02)).mo5345e();
            r02++;
        }
    }

    @Override // p126t.AbstractC2763o
    /* renamed from: f */
    public final void mo5346f() {
        this.f9052c = null;
        Iterator it = this.f9015k.iterator();
        while (it.hasNext()) {
            ((AbstractC2763o) it.next()).mo5346f();
        }
    }

    @Override // p126t.AbstractC2763o
    /* renamed from: j */
    public final long mo5347j() {
        ArrayList arrayList = this.f9015k;
        int size = arrayList.size();
        long j2 = 0;
        for (int r4 = 0; r4 < size; r4++) {
            j2 = r5.f9058i.f9030f + ((AbstractC2763o) arrayList.get(r4)).mo5347j() + j2 + r5.f9057h.f9030f;
        }
        return j2;
    }

    @Override // p126t.AbstractC2763o
    /* renamed from: k */
    public final boolean mo5348k() {
        ArrayList arrayList = this.f9015k;
        int size = arrayList.size();
        for (int r3 = 0; r3 < size; r3++) {
            if (!((AbstractC2763o) arrayList.get(r3)).mo5348k()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: m */
    public final C2723d m5349m() {
        int r02 = 0;
        while (true) {
            ArrayList arrayList = this.f9015k;
            if (r02 >= arrayList.size()) {
                return null;
            }
            C2723d c2723d = ((AbstractC2763o) arrayList.get(r02)).f9051b;
            if (c2723d.f8854g0 != 8) {
                return c2723d;
            }
            r02++;
        }
    }

    /* renamed from: n */
    public final C2723d m5350n() {
        ArrayList arrayList = this.f9015k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C2723d c2723d = ((AbstractC2763o) arrayList.get(size)).f9051b;
            if (c2723d.f8854g0 != 8) {
                return c2723d;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f9055f == 0 ? "horizontal : " : "vertical : ");
        Iterator it = this.f9015k.iterator();
        while (it.hasNext()) {
            AbstractC2763o abstractC2763o = (AbstractC2763o) it.next();
            sb.append("<");
            sb.append(abstractC2763o);
            sb.append("> ");
        }
        return sb.toString();
    }
}
