package p126t;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p000A.AbstractC0002c;
import p081e1.C0879e;
import p118q.C2712c;
import p123s.AbstractC2729j;
import p123s.C2723d;
import p123s.C2724e;

/* renamed from: t.n */
/* loaded from: classes.dex */
public final class C2762n {

    /* renamed from: f */
    public static int f9044f;

    /* renamed from: a */
    public ArrayList f9045a;

    /* renamed from: b */
    public int f9046b;

    /* renamed from: c */
    public int f9047c;

    /* renamed from: d */
    public ArrayList f9048d;

    /* renamed from: e */
    public int f9049e;

    /* renamed from: a */
    public final void m5377a(ArrayList arrayList) {
        int size = this.f9045a.size();
        if (this.f9049e != -1 && size > 0) {
            for (int r12 = 0; r12 < arrayList.size(); r12++) {
                C2762n c2762n = (C2762n) arrayList.get(r12);
                if (this.f9049e == c2762n.f9046b) {
                    m5379c(this.f9047c, c2762n);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    /* renamed from: b */
    public final int m5378b(C2712c c2712c, int r8) {
        int m5212n;
        int m5212n2;
        ArrayList arrayList = this.f9045a;
        if (arrayList.size() == 0) {
            return 0;
        }
        C2724e c2724e = (C2724e) ((C2723d) arrayList.get(0)).f8834T;
        c2712c.m5231t();
        c2724e.mo5245b(c2712c, false);
        for (int r3 = 0; r3 < arrayList.size(); r3++) {
            ((C2723d) arrayList.get(r3)).mo5245b(c2712c, false);
        }
        if (r8 == 0 && c2724e.f8904z0 > 0) {
            AbstractC2729j.m5317a(c2724e, c2712c, arrayList, 0);
        }
        if (r8 == 1 && c2724e.f8883A0 > 0) {
            AbstractC2729j.m5317a(c2724e, c2712c, arrayList, 1);
        }
        try {
            c2712c.m5227p();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.f9048d = new ArrayList();
        for (int r2 = 0; r2 < arrayList.size(); r2++) {
            C2723d c2723d = (C2723d) arrayList.get(r2);
            C0879e c0879e = new C0879e();
            new WeakReference(c2723d);
            C2712c.m5212n(c2723d.f8823I);
            C2712c.m5212n(c2723d.f8824J);
            C2712c.m5212n(c2723d.f8825K);
            C2712c.m5212n(c2723d.f8826L);
            C2712c.m5212n(c2723d.f8827M);
            this.f9048d.add(c0879e);
        }
        if (r8 == 0) {
            m5212n = C2712c.m5212n(c2724e.f8823I);
            m5212n2 = C2712c.m5212n(c2724e.f8825K);
            c2712c.m5231t();
        } else {
            m5212n = C2712c.m5212n(c2724e.f8824J);
            m5212n2 = C2712c.m5212n(c2724e.f8826L);
            c2712c.m5231t();
        }
        return m5212n2 - m5212n;
    }

    /* renamed from: c */
    public final void m5379c(int r5, C2762n c2762n) {
        Iterator it = this.f9045a.iterator();
        while (it.hasNext()) {
            C2723d c2723d = (C2723d) it.next();
            ArrayList arrayList = c2762n.f9045a;
            if (!arrayList.contains(c2723d)) {
                arrayList.add(c2723d);
            }
            int r2 = c2762n.f9046b;
            if (r5 == 0) {
                c2723d.f8868n0 = r2;
            } else {
                c2723d.f8870o0 = r2;
            }
        }
        this.f9049e = c2762n.f9046b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int r12 = this.f9047c;
        sb.append(r12 == 0 ? "Horizontal" : r12 == 1 ? "Vertical" : r12 == 2 ? "Both" : "Unknown");
        sb.append(" [");
        sb.append(this.f9046b);
        sb.append("] <");
        String sb2 = sb.toString();
        Iterator it = this.f9045a.iterator();
        while (it.hasNext()) {
            sb2 = sb2 + " " + ((C2723d) it.next()).f8856h0;
        }
        return AbstractC0002c.m15j(sb2, " >");
    }
}
