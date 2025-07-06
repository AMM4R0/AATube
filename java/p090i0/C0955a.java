package p090i0;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import p008C1.C0080l;
import p103k0.AbstractC2480a;
import p124s0.C2738i;

/* renamed from: i0.a */
/* loaded from: classes.dex */
public final class C0955a extends AbstractC0967m {

    /* renamed from: A */
    public ArrayList f3991A;

    /* renamed from: B */
    public boolean f3992B;

    /* renamed from: C */
    public int f3993C;

    /* renamed from: D */
    public boolean f3994D;

    /* renamed from: E */
    public int f3995E;

    @Override // p090i0.AbstractC0967m
    /* renamed from: A */
    public final void mo2540A(long j2) {
        ArrayList arrayList;
        this.f4033c = j2;
        if (j2 < 0 || (arrayList = this.f3991A) == null) {
            return;
        }
        int size = arrayList.size();
        for (int r12 = 0; r12 < size; r12++) {
            ((AbstractC0967m) this.f3991A.get(r12)).mo2540A(j2);
        }
    }

    @Override // p090i0.AbstractC0967m
    /* renamed from: B */
    public final void mo2541B(AbstractC2480a abstractC2480a) {
        this.f3995E |= 8;
        int size = this.f3991A.size();
        for (int r12 = 0; r12 < size; r12++) {
            ((AbstractC0967m) this.f3991A.get(r12)).mo2541B(abstractC2480a);
        }
    }

    @Override // p090i0.AbstractC0967m
    /* renamed from: C */
    public final void mo2542C(TimeInterpolator timeInterpolator) {
        this.f3995E |= 1;
        ArrayList arrayList = this.f3991A;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int r12 = 0; r12 < size; r12++) {
                ((AbstractC0967m) this.f3991A.get(r12)).mo2542C(timeInterpolator);
            }
        }
        this.f4034d = timeInterpolator;
    }

    @Override // p090i0.AbstractC0967m
    /* renamed from: D */
    public final void mo2543D(C2738i c2738i) {
        super.mo2543D(c2738i);
        this.f3995E |= 4;
        if (this.f3991A != null) {
            for (int r02 = 0; r02 < this.f3991A.size(); r02++) {
                ((AbstractC0967m) this.f3991A.get(r02)).mo2543D(c2738i);
            }
        }
    }

    @Override // p090i0.AbstractC0967m
    /* renamed from: E */
    public final void mo2544E() {
        this.f3995E |= 2;
        int size = this.f3991A.size();
        for (int r12 = 0; r12 < size; r12++) {
            ((AbstractC0967m) this.f3991A.get(r12)).mo2544E();
        }
    }

    @Override // p090i0.AbstractC0967m
    /* renamed from: F */
    public final void mo2545F(long j2) {
        this.f4032b = j2;
    }

    @Override // p090i0.AbstractC0967m
    /* renamed from: H */
    public final String mo2546H(String str) {
        String mo2546H = super.mo2546H(str);
        for (int r12 = 0; r12 < this.f3991A.size(); r12++) {
            StringBuilder sb = new StringBuilder();
            sb.append(mo2546H);
            sb.append("\n");
            sb.append(((AbstractC0967m) this.f3991A.get(r12)).mo2546H(str + "  "));
            mo2546H = sb.toString();
        }
        return mo2546H;
    }

    /* renamed from: I */
    public final void m2547I(AbstractC0967m abstractC0967m) {
        this.f3991A.add(abstractC0967m);
        abstractC0967m.f4039i = this;
        long j2 = this.f4033c;
        if (j2 >= 0) {
            abstractC0967m.mo2540A(j2);
        }
        if ((this.f3995E & 1) != 0) {
            abstractC0967m.mo2542C(this.f4034d);
        }
        if ((this.f3995E & 2) != 0) {
            abstractC0967m.mo2544E();
        }
        if ((this.f3995E & 4) != 0) {
            abstractC0967m.mo2543D(this.f4052v);
        }
        if ((this.f3995E & 8) != 0) {
            abstractC0967m.mo2541B(null);
        }
    }

    @Override // p090i0.AbstractC0967m
    /* renamed from: c */
    public final void mo2548c() {
        super.mo2548c();
        int size = this.f3991A.size();
        for (int r12 = 0; r12 < size; r12++) {
            ((AbstractC0967m) this.f3991A.get(r12)).mo2548c();
        }
    }

    @Override // p090i0.AbstractC0967m
    /* renamed from: d */
    public final void mo2549d(C0975u c0975u) {
        if (m2579t(c0975u.f4064b)) {
            Iterator it = this.f3991A.iterator();
            while (it.hasNext()) {
                AbstractC0967m abstractC0967m = (AbstractC0967m) it.next();
                if (abstractC0967m.m2579t(c0975u.f4064b)) {
                    abstractC0967m.mo2549d(c0975u);
                    c0975u.f4065c.add(abstractC0967m);
                }
            }
        }
    }

    @Override // p090i0.AbstractC0967m
    /* renamed from: f */
    public final void mo2550f(C0975u c0975u) {
        int size = this.f3991A.size();
        for (int r12 = 0; r12 < size; r12++) {
            ((AbstractC0967m) this.f3991A.get(r12)).mo2550f(c0975u);
        }
    }

    @Override // p090i0.AbstractC0967m
    /* renamed from: g */
    public final void mo2551g(C0975u c0975u) {
        if (m2579t(c0975u.f4064b)) {
            Iterator it = this.f3991A.iterator();
            while (it.hasNext()) {
                AbstractC0967m abstractC0967m = (AbstractC0967m) it.next();
                if (abstractC0967m.m2579t(c0975u.f4064b)) {
                    abstractC0967m.mo2551g(c0975u);
                    c0975u.f4065c.add(abstractC0967m);
                }
            }
        }
    }

    @Override // p090i0.AbstractC0967m
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final AbstractC0967m clone() {
        C0955a c0955a = (C0955a) super.clone();
        c0955a.f3991A = new ArrayList();
        int size = this.f3991A.size();
        for (int r2 = 0; r2 < size; r2++) {
            AbstractC0967m clone = ((AbstractC0967m) this.f3991A.get(r2)).clone();
            c0955a.f3991A.add(clone);
            clone.f4039i = c0955a;
        }
        return c0955a;
    }

    @Override // p090i0.AbstractC0967m
    /* renamed from: l */
    public final void mo2553l(ViewGroup viewGroup, C0080l c0080l, C0080l c0080l2, ArrayList arrayList, ArrayList arrayList2) {
        long j2 = this.f4032b;
        int size = this.f3991A.size();
        for (int r4 = 0; r4 < size; r4++) {
            AbstractC0967m abstractC0967m = (AbstractC0967m) this.f3991A.get(r4);
            if (j2 > 0 && (this.f3992B || r4 == 0)) {
                long j3 = abstractC0967m.f4032b;
                if (j3 > 0) {
                    abstractC0967m.mo2545F(j3 + j2);
                } else {
                    abstractC0967m.mo2545F(j2);
                }
            }
            abstractC0967m.mo2553l(viewGroup, c0080l, c0080l2, arrayList, arrayList2);
        }
    }

    @Override // p090i0.AbstractC0967m
    /* renamed from: w */
    public final void mo2554w(ViewGroup viewGroup) {
        super.mo2554w(viewGroup);
        int size = this.f3991A.size();
        for (int r12 = 0; r12 < size; r12++) {
            ((AbstractC0967m) this.f3991A.get(r12)).mo2554w(viewGroup);
        }
    }

    @Override // p090i0.AbstractC0967m
    /* renamed from: x */
    public final AbstractC0967m mo2555x(InterfaceC0965k interfaceC0965k) {
        super.mo2555x(interfaceC0965k);
        return this;
    }

    @Override // p090i0.AbstractC0967m
    /* renamed from: y */
    public final void mo2556y(View view) {
        super.mo2556y(view);
        int size = this.f3991A.size();
        for (int r12 = 0; r12 < size; r12++) {
            ((AbstractC0967m) this.f3991A.get(r12)).mo2556y(view);
        }
    }

    @Override // p090i0.AbstractC0967m
    /* renamed from: z */
    public final void mo2557z() {
        if (this.f3991A.isEmpty()) {
            m2570G();
            m2575m();
            return;
        }
        C0972r c0972r = new C0972r();
        c0972r.f4061b = this;
        Iterator it = this.f3991A.iterator();
        while (it.hasNext()) {
            ((AbstractC0967m) it.next()).m2571a(c0972r);
        }
        this.f3993C = this.f3991A.size();
        if (this.f3992B) {
            Iterator it2 = this.f3991A.iterator();
            while (it2.hasNext()) {
                ((AbstractC0967m) it2.next()).mo2557z();
            }
            return;
        }
        for (int r02 = 1; r02 < this.f3991A.size(); r02++) {
            ((AbstractC0967m) this.f3991A.get(r02 - 1)).m2571a(new C0972r((AbstractC0967m) this.f3991A.get(r02)));
        }
        AbstractC0967m abstractC0967m = (AbstractC0967m) this.f3991A.get(0);
        if (abstractC0967m != null) {
            abstractC0967m.mo2557z();
        }
    }
}
