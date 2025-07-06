package p080e0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import p028K.C0323p;

/* renamed from: e0.x */
/* loaded from: classes.dex */
public final class C0872x {

    /* renamed from: a */
    public final /* synthetic */ RecyclerView f3635a;

    public /* synthetic */ C0872x(RecyclerView recyclerView) {
        this.f3635a = recyclerView;
    }

    /* renamed from: a */
    public void m2383a(C0843a c0843a) {
        int r02 = c0843a.f3455a;
        RecyclerView recyclerView = this.f3635a;
        if (r02 == 1) {
            recyclerView.f2531l.mo1819W(c0843a.f3456b, c0843a.f3457c);
            return;
        }
        if (r02 == 2) {
            recyclerView.f2531l.mo1822Z(c0843a.f3456b, c0843a.f3457c);
        } else if (r02 == 4) {
            recyclerView.f2531l.mo1823a0(c0843a.f3456b, c0843a.f3457c);
        } else {
            if (r02 != 8) {
                return;
            }
            recyclerView.f2531l.mo1821Y(c0843a.f3456b, c0843a.f3457c);
        }
    }

    /* renamed from: b */
    public AbstractC0838V m2384b(int r8) {
        RecyclerView recyclerView = this.f3635a;
        int m127v = recyclerView.f2517e.m127v();
        int r3 = 0;
        AbstractC0838V abstractC0838V = null;
        while (true) {
            if (r3 >= m127v) {
                break;
            }
            AbstractC0838V m1892I = RecyclerView.m1892I(recyclerView.f2517e.m126u(r3));
            if (m1892I != null && !m1892I.m2332i() && m1892I.f3426c == r8) {
                if (!((ArrayList) recyclerView.f2517e.f27d).contains(m1892I.f3424a)) {
                    abstractC0838V = m1892I;
                    break;
                }
                abstractC0838V = m1892I;
            }
            r3++;
        }
        if (abstractC0838V == null || ((ArrayList) recyclerView.f2517e.f27d).contains(abstractC0838V.f3424a)) {
            return null;
        }
        return abstractC0838V;
    }

    /* renamed from: c */
    public void m2385c(int r9, int r10) {
        int r7;
        int r72;
        RecyclerView recyclerView = this.f3635a;
        int m127v = recyclerView.f2517e.m127v();
        int r102 = r10 + r9;
        for (int r2 = 0; r2 < m127v; r2++) {
            View m126u = recyclerView.f2517e.m126u(r2);
            AbstractC0838V m1892I = RecyclerView.m1892I(m126u);
            if (m1892I != null && !m1892I.m2339p() && (r72 = m1892I.f3426c) >= r9 && r72 < r102) {
                m1892I.m2324a(2);
                m1892I.m2324a(1024);
                ((C0825H) m126u.getLayoutParams()).f3378c = true;
            }
        }
        C0830M c0830m = recyclerView.f2511b;
        ArrayList arrayList = c0830m.f3388c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractC0838V abstractC0838V = (AbstractC0838V) arrayList.get(size);
            if (abstractC0838V != null && (r7 = abstractC0838V.f3426c) >= r9 && r7 < r102) {
                abstractC0838V.m2324a(2);
                c0830m.m2312e(size);
            }
        }
        recyclerView.f2522g0 = true;
    }

    /* renamed from: d */
    public void m2386d(int r8, int r9) {
        RecyclerView recyclerView = this.f3635a;
        int m127v = recyclerView.f2517e.m127v();
        for (int r3 = 0; r3 < m127v; r3++) {
            AbstractC0838V m1892I = RecyclerView.m1892I(recyclerView.f2517e.m126u(r3));
            if (m1892I != null && !m1892I.m2339p() && m1892I.f3426c >= r8) {
                m1892I.m2336m(r9, false);
                recyclerView.f2514c0.f3407f = true;
            }
        }
        ArrayList arrayList = recyclerView.f2511b.f3388c;
        int size = arrayList.size();
        for (int r2 = 0; r2 < size; r2++) {
            AbstractC0838V abstractC0838V = (AbstractC0838V) arrayList.get(r2);
            if (abstractC0838V != null && abstractC0838V.f3426c >= r8) {
                abstractC0838V.m2336m(r9, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f2520f0 = true;
    }

    /* renamed from: e */
    public void m2387e(int r12, int r13) {
        int r5;
        int r4;
        int r6;
        int r52;
        int r42;
        int r10;
        int r102;
        RecyclerView recyclerView = this.f3635a;
        int m127v = recyclerView.f2517e.m127v();
        int r3 = -1;
        if (r12 < r13) {
            r4 = r12;
            r5 = r13;
            r6 = -1;
        } else {
            r5 = r12;
            r4 = r13;
            r6 = 1;
        }
        for (int r8 = 0; r8 < m127v; r8++) {
            AbstractC0838V m1892I = RecyclerView.m1892I(recyclerView.f2517e.m126u(r8));
            if (m1892I != null && (r102 = m1892I.f3426c) >= r4 && r102 <= r5) {
                if (r102 == r12) {
                    m1892I.m2336m(r13 - r12, false);
                } else {
                    m1892I.m2336m(r6, false);
                }
                recyclerView.f2514c0.f3407f = true;
            }
        }
        C0830M c0830m = recyclerView.f2511b;
        c0830m.getClass();
        if (r12 < r13) {
            r42 = r12;
            r52 = r13;
        } else {
            r52 = r12;
            r42 = r13;
            r3 = 1;
        }
        ArrayList arrayList = c0830m.f3388c;
        int size = arrayList.size();
        for (int r82 = 0; r82 < size; r82++) {
            AbstractC0838V abstractC0838V = (AbstractC0838V) arrayList.get(r82);
            if (abstractC0838V != null && (r10 = abstractC0838V.f3426c) >= r42 && r10 <= r52) {
                if (r10 == r12) {
                    abstractC0838V.m2336m(r13 - r12, false);
                } else {
                    abstractC0838V.m2336m(r3, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.f2520f0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m2388f(p080e0.AbstractC0838V r9, p028K.C0323p r10, p028K.C0323p r11) {
        /*
            r8 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r8.f3635a
            r0.getClass()
            r1 = 0
            r9.m2338o(r1)
            e0.C r1 = r0.f2493H
            r2 = r1
            e0.h r2 = (p080e0.C0856h) r2
            if (r10 == 0) goto L29
            r2.getClass()
            int r4 = r10.f913a
            int r6 = r11.f913a
            if (r4 != r6) goto L1f
            int r1 = r10.f914b
            int r3 = r11.f914b
            if (r1 == r3) goto L29
        L1f:
            int r5 = r10.f914b
            int r7 = r11.f914b
            r3 = r9
            boolean r9 = r2.m2353g(r3, r4, r5, r6, r7)
            goto L38
        L29:
            r2.m2357l(r9)
            android.view.View r10 = r9.f3424a
            r11 = 0
            r10.setAlpha(r11)
            java.util.ArrayList r10 = r2.f3521i
            r10.add(r9)
            r9 = 1
        L38:
            if (r9 == 0) goto L3d
            r0.m1914S()
        L3d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p080e0.C0872x.m2388f(e0.V, K.p, K.p):void");
    }

    /* renamed from: g */
    public void m2389g(AbstractC0838V abstractC0838V, C0323p c0323p, C0323p c0323p2) {
        boolean z2;
        RecyclerView recyclerView = this.f3635a;
        recyclerView.f2511b.m2317j(abstractC0838V);
        recyclerView.m1925f(abstractC0838V);
        abstractC0838V.m2338o(false);
        C0856h c0856h = (C0856h) recyclerView.f2493H;
        c0856h.getClass();
        int r4 = c0323p.f913a;
        int r5 = c0323p.f914b;
        View view = abstractC0838V.f3424a;
        int left = c0323p2 == null ? view.getLeft() : c0323p2.f913a;
        int top = c0323p2 == null ? view.getTop() : c0323p2.f914b;
        if (abstractC0838V.m2332i() || (r4 == left && r5 == top)) {
            c0856h.m2357l(abstractC0838V);
            c0856h.f3520h.add(abstractC0838V);
            z2 = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            z2 = c0856h.m2353g(abstractC0838V, r4, r5, left, top);
        }
        if (z2) {
            recyclerView.m1914S();
        }
    }

    /* renamed from: h */
    public void m2390h(int r3) {
        RecyclerView recyclerView = this.f3635a;
        View childAt = recyclerView.getChildAt(r3);
        if (childAt != null) {
            RecyclerView.m1892I(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(r3);
    }
}
