package p126t;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p123s.AbstractC2728i;
import p123s.C2723d;
import p123s.C2724e;
import p123s.C2727h;
import p132v.C2826f;

/* renamed from: t.e */
/* loaded from: classes.dex */
public final class C2753e {

    /* renamed from: a */
    public C2724e f9017a;

    /* renamed from: b */
    public boolean f9018b;

    /* renamed from: c */
    public boolean f9019c;

    /* renamed from: d */
    public C2724e f9020d;

    /* renamed from: e */
    public ArrayList f9021e;

    /* renamed from: f */
    public C2826f f9022f;

    /* renamed from: g */
    public C2750b f9023g;

    /* renamed from: h */
    public ArrayList f9024h;

    /* renamed from: a */
    public final void m5351a(C2754f c2754f, int r8, ArrayList arrayList, C2760l c2760l) {
        AbstractC2763o abstractC2763o = c2754f.f9028d;
        if (abstractC2763o.f9052c == null) {
            C2724e c2724e = this.f9017a;
            if (abstractC2763o == c2724e.f8847d || abstractC2763o == c2724e.f8849e) {
                return;
            }
            if (c2760l == null) {
                c2760l = new C2760l();
                c2760l.f9040a = null;
                c2760l.f9041b = new ArrayList();
                c2760l.f9040a = abstractC2763o;
                arrayList.add(c2760l);
            }
            abstractC2763o.f9052c = c2760l;
            c2760l.f9041b.add(abstractC2763o);
            C2754f c2754f2 = abstractC2763o.f9057h;
            Iterator it = c2754f2.f9035k.iterator();
            while (it.hasNext()) {
                InterfaceC2752d interfaceC2752d = (InterfaceC2752d) it.next();
                if (interfaceC2752d instanceof C2754f) {
                    m5351a((C2754f) interfaceC2752d, r8, arrayList, c2760l);
                }
            }
            C2754f c2754f3 = abstractC2763o.f9058i;
            Iterator it2 = c2754f3.f9035k.iterator();
            while (it2.hasNext()) {
                InterfaceC2752d interfaceC2752d2 = (InterfaceC2752d) it2.next();
                if (interfaceC2752d2 instanceof C2754f) {
                    m5351a((C2754f) interfaceC2752d2, r8, arrayList, c2760l);
                }
            }
            if (r8 == 1 && (abstractC2763o instanceof C2761m)) {
                Iterator it3 = ((C2761m) abstractC2763o).f9042k.f9035k.iterator();
                while (it3.hasNext()) {
                    InterfaceC2752d interfaceC2752d3 = (InterfaceC2752d) it3.next();
                    if (interfaceC2752d3 instanceof C2754f) {
                        m5351a((C2754f) interfaceC2752d3, r8, arrayList, c2760l);
                    }
                }
            }
            Iterator it4 = c2754f2.f9036l.iterator();
            while (it4.hasNext()) {
                m5351a((C2754f) it4.next(), r8, arrayList, c2760l);
            }
            Iterator it5 = c2754f3.f9036l.iterator();
            while (it5.hasNext()) {
                m5351a((C2754f) it5.next(), r8, arrayList, c2760l);
            }
            if (r8 == 1 && (abstractC2763o instanceof C2761m)) {
                Iterator it6 = ((C2761m) abstractC2763o).f9042k.f9036l.iterator();
                while (it6.hasNext()) {
                    m5351a((C2754f) it6.next(), r8, arrayList, c2760l);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0260 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0008 A[ADDED_TO_REGION, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m5352b(p123s.C2724e r17) {
        /*
            Method dump skipped, instructions count: 791
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p126t.C2753e.m5352b(s.e):void");
    }

    /* renamed from: c */
    public final void m5353c() {
        ArrayList arrayList = this.f9021e;
        arrayList.clear();
        C2724e c2724e = this.f9020d;
        c2724e.f8847d.mo5346f();
        c2724e.f8849e.mo5346f();
        arrayList.add(c2724e.f8847d);
        arrayList.add(c2724e.f8849e);
        Iterator it = c2724e.f8895q0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            C2723d c2723d = (C2723d) it.next();
            if (c2723d instanceof C2727h) {
                C2757i c2757i = new C2757i(c2723d);
                c2723d.f8847d.mo5346f();
                c2723d.f8849e.mo5346f();
                c2757i.f9055f = ((C2727h) c2723d).f8963u0;
                arrayList.add(c2757i);
            } else {
                if (c2723d.m5295x()) {
                    if (c2723d.f8843b == null) {
                        c2723d.f8843b = new C2751c(c2723d, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c2723d.f8843b);
                } else {
                    arrayList.add(c2723d.f8847d);
                }
                if (c2723d.m5296y()) {
                    if (c2723d.f8845c == null) {
                        c2723d.f8845c = new C2751c(c2723d, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c2723d.f8845c);
                } else {
                    arrayList.add(c2723d.f8849e);
                }
                if (c2723d instanceof AbstractC2728i) {
                    arrayList.add(new C2758j(c2723d));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((AbstractC2763o) it2.next()).mo5346f();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            AbstractC2763o abstractC2763o = (AbstractC2763o) it3.next();
            if (abstractC2763o.f9051b != c2724e) {
                abstractC2763o.mo5344d();
            }
        }
        ArrayList arrayList2 = this.f9024h;
        arrayList2.clear();
        C2724e c2724e2 = this.f9017a;
        m5355e(c2724e2.f8847d, 0, arrayList2);
        m5355e(c2724e2.f8849e, 1, arrayList2);
        this.f9018b = false;
    }

    /* renamed from: d */
    public final int m5354d(C2724e c2724e, int r21) {
        ArrayList arrayList;
        int r16;
        int r17;
        long max;
        float f;
        C2724e c2724e2 = c2724e;
        ArrayList arrayList2 = this.f9024h;
        int size = arrayList2.size();
        int r7 = 0;
        long j2 = 0;
        while (r7 < size) {
            AbstractC2763o abstractC2763o = ((C2760l) arrayList2.get(r7)).f9040a;
            if (!(abstractC2763o instanceof C2751c) ? !(r21 != 0 ? (abstractC2763o instanceof C2761m) : (abstractC2763o instanceof C2759k)) : ((C2751c) abstractC2763o).f9055f != r21) {
                C2754f c2754f = (r21 == 0 ? c2724e2.f8847d : c2724e2.f8849e).f9057h;
                C2754f c2754f2 = (r21 == 0 ? c2724e2.f8847d : c2724e2.f8849e).f9058i;
                boolean contains = abstractC2763o.f9057h.f9036l.contains(c2754f);
                C2754f c2754f3 = abstractC2763o.f9058i;
                boolean contains2 = c2754f3.f9036l.contains(c2754f2);
                long mo5347j = abstractC2763o.mo5347j();
                C2754f c2754f4 = abstractC2763o.f9057h;
                if (contains && contains2) {
                    long m5375b = C2760l.m5375b(c2754f4, 0L);
                    ArrayList arrayList3 = arrayList2;
                    r16 = size;
                    long m5374a = C2760l.m5374a(c2754f3, 0L);
                    long j3 = m5375b - mo5347j;
                    int r02 = c2754f3.f9030f;
                    arrayList = arrayList3;
                    r17 = r7;
                    if (j3 >= (-r02)) {
                        j3 += r02;
                    }
                    long j4 = (-m5374a) - mo5347j;
                    long j5 = c2754f4.f9030f;
                    long j6 = j4 - j5;
                    if (j6 >= j5) {
                        j6 -= j5;
                    }
                    C2723d c2723d = abstractC2763o.f9051b;
                    if (r21 == 0) {
                        f = c2723d.f8848d0;
                    } else if (r21 == 1) {
                        f = c2723d.f8850e0;
                    } else {
                        c2723d.getClass();
                        f = -1.0f;
                    }
                    float f2 = f > 0.0f ? (long) ((j3 / (1.0f - f)) + (j6 / f)) : 0L;
                    max = (c2754f4.f9030f + ((((long) ((f2 * f) + 0.5f)) + mo5347j) + ((long) (((1.0f - f) * f2) + 0.5f)))) - c2754f3.f9030f;
                } else {
                    arrayList = arrayList2;
                    r16 = size;
                    r17 = r7;
                    max = contains ? Math.max(C2760l.m5375b(c2754f4, c2754f4.f9030f), c2754f4.f9030f + mo5347j) : contains2 ? Math.max(-C2760l.m5374a(c2754f3, c2754f3.f9030f), (-c2754f3.f9030f) + mo5347j) : (abstractC2763o.mo5347j() + c2754f4.f9030f) - c2754f3.f9030f;
                }
            } else {
                arrayList = arrayList2;
                r16 = size;
                r17 = r7;
                max = 0;
            }
            j2 = Math.max(j2, max);
            r7 = r17 + 1;
            c2724e2 = c2724e;
            size = r16;
            arrayList2 = arrayList;
        }
        return (int) j2;
    }

    /* renamed from: e */
    public final void m5355e(AbstractC2763o abstractC2763o, int r6, ArrayList arrayList) {
        C2754f c2754f;
        Iterator it = abstractC2763o.f9057h.f9035k.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            c2754f = abstractC2763o.f9058i;
            if (!hasNext) {
                break;
            }
            InterfaceC2752d interfaceC2752d = (InterfaceC2752d) it.next();
            if (interfaceC2752d instanceof C2754f) {
                m5351a((C2754f) interfaceC2752d, r6, arrayList, null);
            } else if (interfaceC2752d instanceof AbstractC2763o) {
                m5351a(((AbstractC2763o) interfaceC2752d).f9057h, r6, arrayList, null);
            }
        }
        Iterator it2 = c2754f.f9035k.iterator();
        while (it2.hasNext()) {
            InterfaceC2752d interfaceC2752d2 = (InterfaceC2752d) it2.next();
            if (interfaceC2752d2 instanceof C2754f) {
                m5351a((C2754f) interfaceC2752d2, r6, arrayList, null);
            } else if (interfaceC2752d2 instanceof AbstractC2763o) {
                m5351a(((AbstractC2763o) interfaceC2752d2).f9058i, r6, arrayList, null);
            }
        }
        if (r6 == 1) {
            Iterator it3 = ((C2761m) abstractC2763o).f9042k.f9035k.iterator();
            while (it3.hasNext()) {
                InterfaceC2752d interfaceC2752d3 = (InterfaceC2752d) it3.next();
                if (interfaceC2752d3 instanceof C2754f) {
                    m5351a((C2754f) interfaceC2752d3, r6, arrayList, null);
                }
            }
        }
    }

    /* renamed from: f */
    public final void m5356f(int r2, int r3, int r4, int r5, C2723d c2723d) {
        C2750b c2750b = this.f9023g;
        c2750b.f9005a = r2;
        c2750b.f9006b = r4;
        c2750b.f9007c = r3;
        c2750b.f9008d = r5;
        this.f9022f.m5437b(c2723d, c2750b);
        c2723d.m5273O(c2750b.f9009e);
        c2723d.m5270L(c2750b.f9010f);
        c2723d.f8819E = c2750b.f9012h;
        c2723d.m5267I(c2750b.f9011g);
    }

    /* renamed from: g */
    public final void m5357g() {
        C2749a c2749a;
        Iterator it = this.f9017a.f8895q0.iterator();
        while (it.hasNext()) {
            C2723d c2723d = (C2723d) it.next();
            if (!c2723d.f8841a) {
                int[] r2 = c2723d.f8872p0;
                boolean z2 = false;
                int r8 = r2[0];
                int r10 = r2[1];
                int r22 = c2723d.f8874r;
                int r4 = c2723d.f8875s;
                boolean z3 = r8 == 2 || (r8 == 3 && r22 == 1);
                if (r10 == 2 || (r10 == 3 && r4 == 1)) {
                    z2 = true;
                }
                C2755g c2755g = c2723d.f8847d.f9054e;
                boolean z4 = c2755g.f9034j;
                C2755g c2755g2 = c2723d.f8849e.f9054e;
                boolean z5 = c2755g2.f9034j;
                if (z4 && z5) {
                    m5356f(1, c2755g.f9031g, 1, c2755g2.f9031g, c2723d);
                    c2723d.f8841a = true;
                } else if (z4 && z2) {
                    m5356f(1, c2755g.f9031g, 2, c2755g2.f9031g, c2723d);
                    if (r10 == 3) {
                        c2723d.f8849e.f9054e.f9037m = c2723d.m5284k();
                    } else {
                        c2723d.f8849e.f9054e.mo5360d(c2723d.m5284k());
                        c2723d.f8841a = true;
                    }
                } else if (z5 && z3) {
                    m5356f(2, c2755g.f9031g, 1, c2755g2.f9031g, c2723d);
                    if (r8 == 3) {
                        c2723d.f8847d.f9054e.f9037m = c2723d.m5288q();
                    } else {
                        c2723d.f8847d.f9054e.mo5360d(c2723d.m5288q());
                        c2723d.f8841a = true;
                    }
                }
                if (c2723d.f8841a && (c2749a = c2723d.f8849e.f9043l) != null) {
                    c2749a.mo5360d(c2723d.f8842a0);
                }
            }
        }
    }
}
