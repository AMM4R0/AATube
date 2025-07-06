package p080e0;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;
import p028K.C0323p;

/* renamed from: e0.h */
/* loaded from: classes.dex */
public final class C0856h extends AbstractC0820C {

    /* renamed from: s */
    public static TimeInterpolator f3518s;

    /* renamed from: g */
    public boolean f3519g;

    /* renamed from: h */
    public ArrayList f3520h;

    /* renamed from: i */
    public ArrayList f3521i;

    /* renamed from: j */
    public ArrayList f3522j;

    /* renamed from: k */
    public ArrayList f3523k;

    /* renamed from: l */
    public ArrayList f3524l;

    /* renamed from: m */
    public ArrayList f3525m;

    /* renamed from: n */
    public ArrayList f3526n;

    /* renamed from: o */
    public ArrayList f3527o;

    /* renamed from: p */
    public ArrayList f3528p;

    /* renamed from: q */
    public ArrayList f3529q;

    /* renamed from: r */
    public ArrayList f3530r;

    /* renamed from: h */
    public static void m2352h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((AbstractC0838V) arrayList.get(size)).f3424a.animate().cancel();
        }
    }

    @Override // p080e0.AbstractC0820C
    /* renamed from: a */
    public final boolean mo2266a(AbstractC0838V abstractC0838V, AbstractC0838V abstractC0838V2, C0323p c0323p, C0323p c0323p2) {
        int r4;
        int r5;
        int r2 = c0323p.f913a;
        int r3 = c0323p.f914b;
        if (abstractC0838V2.m2339p()) {
            int r12 = c0323p.f913a;
            r5 = c0323p.f914b;
            r4 = r12;
        } else {
            r4 = c0323p2.f913a;
            r5 = c0323p2.f914b;
        }
        if (abstractC0838V == abstractC0838V2) {
            return m2353g(abstractC0838V, r2, r3, r4, r5);
        }
        View view = abstractC0838V.f3424a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        m2357l(abstractC0838V);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        m2357l(abstractC0838V2);
        float f = -((int) ((r4 - r2) - translationX));
        View view2 = abstractC0838V2.f3424a;
        view2.setTranslationX(f);
        view2.setTranslationY(-((int) ((r5 - r3) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.f3523k;
        C0853f c0853f = new C0853f();
        c0853f.f3503a = abstractC0838V;
        c0853f.f3504b = abstractC0838V2;
        c0853f.f3505c = r2;
        c0853f.f3506d = r3;
        c0853f.f3507e = r4;
        c0853f.f3508f = r5;
        arrayList.add(c0853f);
        return true;
    }

    @Override // p080e0.AbstractC0820C
    /* renamed from: d */
    public final void mo2268d(AbstractC0838V abstractC0838V) {
        View view = abstractC0838V.f3424a;
        view.animate().cancel();
        ArrayList arrayList = this.f3522j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((C0855g) arrayList.get(size)).f3513a == abstractC0838V) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                m2267c(abstractC0838V);
                arrayList.remove(size);
            }
        }
        m2355j(this.f3523k, abstractC0838V);
        if (this.f3520h.remove(abstractC0838V)) {
            view.setAlpha(1.0f);
            m2267c(abstractC0838V);
        }
        if (this.f3521i.remove(abstractC0838V)) {
            view.setAlpha(1.0f);
            m2267c(abstractC0838V);
        }
        ArrayList arrayList2 = this.f3526n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            m2355j(arrayList3, abstractC0838V);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f3525m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((C0855g) arrayList5.get(size4)).f3513a == abstractC0838V) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    m2267c(abstractC0838V);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.f3524l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(abstractC0838V)) {
                view.setAlpha(1.0f);
                m2267c(abstractC0838V);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f3529q.remove(abstractC0838V);
        this.f3527o.remove(abstractC0838V);
        this.f3530r.remove(abstractC0838V);
        this.f3528p.remove(abstractC0838V);
        m2354i();
    }

    @Override // p080e0.AbstractC0820C
    /* renamed from: e */
    public final void mo2269e() {
        ArrayList arrayList = this.f3522j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C0855g c0855g = (C0855g) arrayList.get(size);
            View view = c0855g.f3513a.f3424a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            m2267c(c0855g.f3513a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f3520h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            m2267c((AbstractC0838V) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f3521i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            AbstractC0838V abstractC0838V = (AbstractC0838V) arrayList3.get(size3);
            abstractC0838V.f3424a.setAlpha(1.0f);
            m2267c(abstractC0838V);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f3523k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            C0853f c0853f = (C0853f) arrayList4.get(size4);
            AbstractC0838V abstractC0838V2 = c0853f.f3503a;
            if (abstractC0838V2 != null) {
                m2356k(c0853f, abstractC0838V2);
            }
            AbstractC0838V abstractC0838V3 = c0853f.f3504b;
            if (abstractC0838V3 != null) {
                m2356k(c0853f, abstractC0838V3);
            }
        }
        arrayList4.clear();
        if (mo2270f()) {
            ArrayList arrayList5 = this.f3525m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    C0855g c0855g2 = (C0855g) arrayList6.get(size6);
                    View view2 = c0855g2.f3513a.f3424a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    m2267c(c0855g2.f3513a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList arrayList7 = this.f3524l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    AbstractC0838V abstractC0838V4 = (AbstractC0838V) arrayList8.get(size8);
                    abstractC0838V4.f3424a.setAlpha(1.0f);
                    m2267c(abstractC0838V4);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList arrayList9 = this.f3526n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    C0853f c0853f2 = (C0853f) arrayList10.get(size10);
                    AbstractC0838V abstractC0838V5 = c0853f2.f3503a;
                    if (abstractC0838V5 != null) {
                        m2356k(c0853f2, abstractC0838V5);
                    }
                    AbstractC0838V abstractC0838V6 = c0853f2.f3504b;
                    if (abstractC0838V6 != null) {
                        m2356k(c0853f2, abstractC0838V6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            m2352h(this.f3529q);
            m2352h(this.f3528p);
            m2352h(this.f3527o);
            m2352h(this.f3530r);
            ArrayList arrayList11 = this.f3350b;
            if (arrayList11.size() > 0) {
                arrayList11.get(0).getClass();
                throw new ClassCastException();
            }
            arrayList11.clear();
        }
    }

    @Override // p080e0.AbstractC0820C
    /* renamed from: f */
    public final boolean mo2270f() {
        return (this.f3521i.isEmpty() && this.f3523k.isEmpty() && this.f3522j.isEmpty() && this.f3520h.isEmpty() && this.f3528p.isEmpty() && this.f3529q.isEmpty() && this.f3527o.isEmpty() && this.f3530r.isEmpty() && this.f3525m.isEmpty() && this.f3524l.isEmpty() && this.f3526n.isEmpty()) ? false : true;
    }

    /* renamed from: g */
    public final boolean m2353g(AbstractC0838V abstractC0838V, int r5, int r6, int r7, int r8) {
        View view = abstractC0838V.f3424a;
        int translationX = r5 + ((int) view.getTranslationX());
        int translationY = r6 + ((int) abstractC0838V.f3424a.getTranslationY());
        m2357l(abstractC0838V);
        int r12 = r7 - translationX;
        int r2 = r8 - translationY;
        if (r12 == 0 && r2 == 0) {
            m2267c(abstractC0838V);
            return false;
        }
        if (r12 != 0) {
            view.setTranslationX(-r12);
        }
        if (r2 != 0) {
            view.setTranslationY(-r2);
        }
        ArrayList arrayList = this.f3522j;
        C0855g c0855g = new C0855g();
        c0855g.f3513a = abstractC0838V;
        c0855g.f3514b = translationX;
        c0855g.f3515c = translationY;
        c0855g.f3516d = r7;
        c0855g.f3517e = r8;
        arrayList.add(c0855g);
        return true;
    }

    /* renamed from: i */
    public final void m2354i() {
        if (mo2270f()) {
            return;
        }
        ArrayList arrayList = this.f3350b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    /* renamed from: j */
    public final void m2355j(ArrayList arrayList, AbstractC0838V abstractC0838V) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0853f c0853f = (C0853f) arrayList.get(size);
            if (m2356k(c0853f, abstractC0838V) && c0853f.f3503a == null && c0853f.f3504b == null) {
                arrayList.remove(c0853f);
            }
        }
    }

    /* renamed from: k */
    public final boolean m2356k(C0853f c0853f, AbstractC0838V abstractC0838V) {
        if (c0853f.f3504b == abstractC0838V) {
            c0853f.f3504b = null;
        } else {
            if (c0853f.f3503a != abstractC0838V) {
                return false;
            }
            c0853f.f3503a = null;
        }
        abstractC0838V.f3424a.setAlpha(1.0f);
        View view = abstractC0838V.f3424a;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        m2267c(abstractC0838V);
        return true;
    }

    /* renamed from: l */
    public final void m2357l(AbstractC0838V abstractC0838V) {
        if (f3518s == null) {
            f3518s = new ValueAnimator().getInterpolator();
        }
        abstractC0838V.f3424a.animate().setInterpolator(f3518s);
        mo2268d(abstractC0838V);
    }
}
