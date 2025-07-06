package p123s;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import p002A1.C0015h;
import p118q.C2712c;
import p126t.AbstractC2763o;
import p126t.C2750b;
import p126t.C2751c;
import p126t.C2753e;
import p132v.C2826f;

/* renamed from: s.e */
/* loaded from: classes.dex */
public final class C2724e extends C2723d {

    /* renamed from: A0 */
    public int f8883A0;

    /* renamed from: B0 */
    public C2721b[] f8884B0;

    /* renamed from: C0 */
    public C2721b[] f8885C0;

    /* renamed from: D0 */
    public int f8886D0;

    /* renamed from: E0 */
    public boolean f8887E0;

    /* renamed from: F0 */
    public boolean f8888F0;

    /* renamed from: G0 */
    public WeakReference f8889G0;

    /* renamed from: H0 */
    public WeakReference f8890H0;

    /* renamed from: I0 */
    public WeakReference f8891I0;

    /* renamed from: J0 */
    public WeakReference f8892J0;

    /* renamed from: K0 */
    public final HashSet f8893K0;

    /* renamed from: L0 */
    public final C2750b f8894L0;

    /* renamed from: q0 */
    public ArrayList f8895q0 = new ArrayList();

    /* renamed from: r0 */
    public final C0015h f8896r0 = new C0015h(this);

    /* renamed from: s0 */
    public final C2753e f8897s0;

    /* renamed from: t0 */
    public int f8898t0;

    /* renamed from: u0 */
    public C2826f f8899u0;

    /* renamed from: v0 */
    public boolean f8900v0;

    /* renamed from: w0 */
    public final C2712c f8901w0;

    /* renamed from: x0 */
    public int f8902x0;

    /* renamed from: y0 */
    public int f8903y0;

    /* renamed from: z0 */
    public int f8904z0;

    public C2724e() {
        C2753e c2753e = new C2753e();
        c2753e.f9018b = true;
        c2753e.f9019c = true;
        c2753e.f9021e = new ArrayList();
        new ArrayList();
        c2753e.f9022f = null;
        c2753e.f9023g = new C2750b();
        c2753e.f9024h = new ArrayList();
        c2753e.f9017a = this;
        c2753e.f9020d = this;
        this.f8897s0 = c2753e;
        this.f8899u0 = null;
        this.f8900v0 = false;
        this.f8901w0 = new C2712c();
        this.f8904z0 = 0;
        this.f8883A0 = 0;
        this.f8884B0 = new C2721b[4];
        this.f8885C0 = new C2721b[4];
        this.f8886D0 = 257;
        this.f8887E0 = false;
        this.f8888F0 = false;
        this.f8889G0 = null;
        this.f8890H0 = null;
        this.f8891I0 = null;
        this.f8892J0 = null;
        this.f8893K0 = new HashSet();
        this.f8894L0 = new C2750b();
    }

    /* renamed from: V */
    public static void m5298V(C2723d c2723d, C2826f c2826f, C2750b c2750b) {
        int r02;
        int r3;
        if (c2826f == null) {
            return;
        }
        if (c2723d.f8854g0 == 8 || (c2723d instanceof C2727h) || (c2723d instanceof C2720a)) {
            c2750b.f9009e = 0;
            c2750b.f9010f = 0;
            return;
        }
        int[] r03 = c2723d.f8872p0;
        c2750b.f9005a = r03[0];
        c2750b.f9006b = r03[1];
        c2750b.f9007c = c2723d.m5288q();
        c2750b.f9008d = c2723d.m5284k();
        c2750b.f9013i = false;
        c2750b.f9014j = 0;
        boolean z2 = c2750b.f9005a == 3;
        boolean z3 = c2750b.f9006b == 3;
        boolean z4 = z2 && c2723d.f8837W > 0.0f;
        boolean z5 = z3 && c2723d.f8837W > 0.0f;
        if (z2 && c2723d.m5291t(0) && c2723d.f8874r == 0 && !z4) {
            c2750b.f9005a = 2;
            if (z3 && c2723d.f8875s == 0) {
                c2750b.f9005a = 1;
            }
            z2 = false;
        }
        if (z3 && c2723d.m5291t(1) && c2723d.f8875s == 0 && !z5) {
            c2750b.f9006b = 2;
            if (z2 && c2723d.f8874r == 0) {
                c2750b.f9006b = 1;
            }
            z3 = false;
        }
        if (c2723d.mo5241A()) {
            c2750b.f9005a = 1;
            z2 = false;
        }
        if (c2723d.mo5242B()) {
            c2750b.f9006b = 1;
            z3 = false;
        }
        int[] r7 = c2723d.f8876t;
        if (z4) {
            if (r7[0] == 4) {
                c2750b.f9005a = 1;
            } else if (!z3) {
                if (c2750b.f9006b == 1) {
                    r3 = c2750b.f9008d;
                } else {
                    c2750b.f9005a = 2;
                    c2826f.m5437b(c2723d, c2750b);
                    r3 = c2750b.f9010f;
                }
                c2750b.f9005a = 1;
                c2750b.f9007c = (int) (c2723d.f8837W * r3);
            }
        }
        if (z5) {
            if (r7[1] == 4) {
                c2750b.f9006b = 1;
            } else if (!z2) {
                if (c2750b.f9005a == 1) {
                    r02 = c2750b.f9007c;
                } else {
                    c2750b.f9006b = 2;
                    c2826f.m5437b(c2723d, c2750b);
                    r02 = c2750b.f9009e;
                }
                c2750b.f9006b = 1;
                if (c2723d.f8838X == -1) {
                    c2750b.f9008d = (int) (r02 / c2723d.f8837W);
                } else {
                    c2750b.f9008d = (int) (c2723d.f8837W * r02);
                }
            }
        }
        c2826f.m5437b(c2723d, c2750b);
        c2723d.m5273O(c2750b.f9009e);
        c2723d.m5270L(c2750b.f9010f);
        c2723d.f8819E = c2750b.f9012h;
        c2723d.m5267I(c2750b.f9011g);
        c2750b.f9014j = 0;
    }

    @Override // p123s.C2723d
    /* renamed from: C */
    public final void mo5263C() {
        this.f8901w0.m5231t();
        this.f8902x0 = 0;
        this.f8903y0 = 0;
        this.f8895q0.clear();
        super.mo5263C();
    }

    @Override // p123s.C2723d
    /* renamed from: F */
    public final void mo5266F(C0015h c0015h) {
        super.mo5266F(c0015h);
        int size = this.f8895q0.size();
        for (int r12 = 0; r12 < size; r12++) {
            ((C2723d) this.f8895q0.get(r12)).mo5266F(c0015h);
        }
    }

    @Override // p123s.C2723d
    /* renamed from: P */
    public final void mo5274P(boolean z2, boolean z3) {
        super.mo5274P(z2, z3);
        int size = this.f8895q0.size();
        for (int r12 = 0; r12 < size; r12++) {
            ((C2723d) this.f8895q0.get(r12)).mo5274P(z2, z3);
        }
    }

    /* renamed from: R */
    public final void m5299R(C2723d c2723d, int r7) {
        if (r7 == 0) {
            int r72 = this.f8904z0 + 1;
            C2721b[] c2721bArr = this.f8885C0;
            if (r72 >= c2721bArr.length) {
                this.f8885C0 = (C2721b[]) Arrays.copyOf(c2721bArr, c2721bArr.length * 2);
            }
            C2721b[] c2721bArr2 = this.f8885C0;
            int r12 = this.f8904z0;
            c2721bArr2[r12] = new C2721b(c2723d, 0, this.f8900v0);
            this.f8904z0 = r12 + 1;
            return;
        }
        if (r7 == 1) {
            int r73 = this.f8883A0 + 1;
            C2721b[] c2721bArr3 = this.f8884B0;
            if (r73 >= c2721bArr3.length) {
                this.f8884B0 = (C2721b[]) Arrays.copyOf(c2721bArr3, c2721bArr3.length * 2);
            }
            C2721b[] c2721bArr4 = this.f8884B0;
            int r13 = this.f8883A0;
            c2721bArr4[r13] = new C2721b(c2723d, 1, this.f8900v0);
            this.f8883A0 = r13 + 1;
        }
    }

    /* renamed from: S */
    public final void m5300S(C2712c c2712c) {
        boolean m5303W = m5303W(64);
        mo5245b(c2712c, m5303W);
        int size = this.f8895q0.size();
        boolean z2 = false;
        for (int r3 = 0; r3 < size; r3++) {
            C2723d c2723d = (C2723d) this.f8895q0.get(r3);
            boolean[] zArr = c2723d.f8833S;
            zArr[0] = false;
            zArr[1] = false;
            if (c2723d instanceof C2720a) {
                z2 = true;
            }
        }
        if (z2) {
            for (int r4 = 0; r4 < size; r4++) {
                C2723d c2723d2 = (C2723d) this.f8895q0.get(r4);
                if (c2723d2 instanceof C2720a) {
                    C2720a c2720a = (C2720a) c2723d2;
                    for (int r7 = 0; r7 < c2720a.f8966r0; r7++) {
                        C2723d c2723d3 = c2720a.f8965q0[r7];
                        if (c2720a.f8786t0 || c2723d3.mo5246c()) {
                            int r9 = c2720a.f8785s0;
                            if (r9 == 0 || r9 == 1) {
                                c2723d3.f8833S[0] = true;
                            } else if (r9 == 2 || r9 == 3) {
                                c2723d3.f8833S[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.f8893K0;
        hashSet.clear();
        for (int r6 = 0; r6 < size; r6++) {
            C2723d c2723d4 = (C2723d) this.f8895q0.get(r6);
            c2723d4.getClass();
            boolean z3 = c2723d4 instanceof C2726g;
            if (z3 || (c2723d4 instanceof C2727h)) {
                if (z3) {
                    hashSet.add(c2723d4);
                } else {
                    c2723d4.mo5245b(c2712c, m5303W);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C2726g c2726g = (C2726g) ((C2723d) it.next());
                for (int r92 = 0; r92 < c2726g.f8966r0; r92++) {
                    if (hashSet.contains(c2726g.f8965q0[r92])) {
                        c2726g.mo5245b(c2712c, m5303W);
                        hashSet.remove(c2726g);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((C2723d) it2.next()).mo5245b(c2712c, m5303W);
                }
                hashSet.clear();
            }
        }
        if (C2712c.f8745p) {
            HashSet hashSet2 = new HashSet();
            for (int r62 = 0; r62 < size; r62++) {
                C2723d c2723d5 = (C2723d) this.f8895q0.get(r62);
                c2723d5.getClass();
                if (!(c2723d5 instanceof C2726g) && !(c2723d5 instanceof C2727h)) {
                    hashSet2.add(c2723d5);
                }
            }
            m5276a(this, c2712c, hashSet2, this.f8872p0[0] == 2 ? 0 : 1, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                C2723d c2723d6 = (C2723d) it3.next();
                AbstractC2729j.m5318b(this, c2712c, c2723d6);
                c2723d6.mo5245b(c2712c, m5303W);
            }
        } else {
            for (int r42 = 0; r42 < size; r42++) {
                C2723d c2723d7 = (C2723d) this.f8895q0.get(r42);
                if (c2723d7 instanceof C2724e) {
                    int[] r72 = c2723d7.f8872p0;
                    int r8 = r72[0];
                    int r73 = r72[1];
                    if (r8 == 2) {
                        c2723d7.m5271M(1);
                    }
                    if (r73 == 2) {
                        c2723d7.m5272N(1);
                    }
                    c2723d7.mo5245b(c2712c, m5303W);
                    if (r8 == 2) {
                        c2723d7.m5271M(r8);
                    }
                    if (r73 == 2) {
                        c2723d7.m5272N(r73);
                    }
                } else {
                    AbstractC2729j.m5318b(this, c2712c, c2723d7);
                    if (!(c2723d7 instanceof C2726g) && !(c2723d7 instanceof C2727h)) {
                        c2723d7.mo5245b(c2712c, m5303W);
                    }
                }
            }
        }
        if (this.f8904z0 > 0) {
            AbstractC2729j.m5317a(this, c2712c, null, 0);
        }
        if (this.f8883A0 > 0) {
            AbstractC2729j.m5317a(this, c2712c, null, 1);
        }
    }

    /* renamed from: T */
    public final boolean m5301T(int r14, boolean z2) {
        boolean z3;
        C2753e c2753e = this.f8897s0;
        C2724e c2724e = c2753e.f9017a;
        boolean z4 = false;
        int m5283j = c2724e.m5283j(0);
        int m5283j2 = c2724e.m5283j(1);
        int m5289r = c2724e.m5289r();
        int m5290s = c2724e.m5290s();
        ArrayList arrayList = c2753e.f9021e;
        if (z2 && (m5283j == 2 || m5283j2 == 2)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC2763o abstractC2763o = (AbstractC2763o) it.next();
                if (abstractC2763o.f9055f == r14 && !abstractC2763o.mo5348k()) {
                    z2 = false;
                    break;
                }
            }
            if (r14 == 0) {
                if (z2 && m5283j == 2) {
                    c2724e.m5271M(1);
                    c2724e.m5273O(c2753e.m5354d(c2724e, 0));
                    c2724e.f8847d.f9054e.mo5360d(c2724e.m5288q());
                }
            } else if (z2 && m5283j2 == 2) {
                c2724e.m5272N(1);
                c2724e.m5270L(c2753e.m5354d(c2724e, 1));
                c2724e.f8849e.f9054e.mo5360d(c2724e.m5284k());
            }
        }
        int[] r15 = c2724e.f8872p0;
        if (r14 == 0) {
            int r152 = r15[0];
            if (r152 == 1 || r152 == 4) {
                int m5288q = c2724e.m5288q() + m5289r;
                c2724e.f8847d.f9058i.mo5360d(m5288q);
                c2724e.f8847d.f9054e.mo5360d(m5288q - m5289r);
                z3 = true;
            }
            z3 = false;
        } else {
            int r153 = r15[1];
            if (r153 == 1 || r153 == 4) {
                int m5284k = c2724e.m5284k() + m5290s;
                c2724e.f8849e.f9058i.mo5360d(m5284k);
                c2724e.f8849e.f9054e.mo5360d(m5284k - m5290s);
                z3 = true;
            }
            z3 = false;
        }
        c2753e.m5357g();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            AbstractC2763o abstractC2763o2 = (AbstractC2763o) it2.next();
            if (abstractC2763o2.f9055f == r14 && (abstractC2763o2.f9051b != c2724e || abstractC2763o2.f9056g)) {
                abstractC2763o2.mo5345e();
            }
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                z4 = true;
                break;
            }
            AbstractC2763o abstractC2763o3 = (AbstractC2763o) it3.next();
            if (abstractC2763o3.f9055f == r14 && (z3 || abstractC2763o3.f9051b != c2724e)) {
                if (!abstractC2763o3.f9057h.f9034j) {
                    break;
                }
                if (!abstractC2763o3.f9058i.f9034j) {
                    break;
                }
                if (!(abstractC2763o3 instanceof C2751c) && !abstractC2763o3.f9054e.f9034j) {
                    break;
                }
            }
        }
        c2724e.m5271M(m5283j);
        c2724e.m5272N(m5283j2);
        return z4;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(26:227|(7:228|229|(1:231)|232|233|234|235)|(3:353|354|(28:356|357|358|359|360|361|362|238|239|(1:243)|244|(6:248|249|250|251|252|253)|325|(1:350)(9:329|330|331|332|333|334|335|336|337)|338|339|260|(4:262|(3:264|(2:270|271)(1:268)|269)|272|273)(4:320|(1:322)|323|324)|274|(6:279|(1:281)|282|283|(1:287)|(1:291))|292|(1:294)(1:319)|295|(1:297)(1:318)|(1:317)(4:299|(1:304)|305|(3:310|(2:312|313)(1:315)|314))|316|(0)(0)|314))|237|238|239|(2:241|243)|244|(7:246|248|249|250|251|252|253)|325|(1:327)|350|338|339|260|(0)(0)|274|(7:277|279|(0)|282|283|(2:285|287)|(2:289|291))|292|(0)(0)|295|(0)(0)|(0)(0)|316|(0)(0)|314) */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x0797, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:204:0x065f  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0675 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0694  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x06b1  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x07c0  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0818 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0824 A[LOOP:14: B:280:0x0822->B:281:0x0824, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x088a  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x08a9  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x08b6  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x08f1  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x08f2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:317:0x08ed  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x08b2  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0896  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x07fd  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x08fe  */
    /* JADX WARN: Removed duplicated region for block: B:603:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:622:0x0609 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:625:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:632:0x0639  */
    /* JADX WARN: Removed duplicated region for block: B:639:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:641:0x0633  */
    /* JADX WARN: Type inference failed for: r6v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* renamed from: U */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m5302U() {
        /*
            Method dump skipped, instructions count: 2314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p123s.C2724e.m5302U():void");
    }

    /* renamed from: W */
    public final boolean m5303W(int r2) {
        return (this.f8886D0 & r2) == r2;
    }

    @Override // p123s.C2723d
    /* renamed from: n */
    public final void mo5287n(StringBuilder sb) {
        sb.append(this.f8859j + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.f8835U);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.f8836V);
        sb.append("\n");
        Iterator it = this.f8895q0.iterator();
        while (it.hasNext()) {
            ((C2723d) it.next()).mo5287n(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
