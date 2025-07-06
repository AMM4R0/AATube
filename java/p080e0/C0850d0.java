package p080e0;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

/* renamed from: e0.d0 */
/* loaded from: classes.dex */
public final class C0850d0 {

    /* renamed from: a */
    public final ArrayList f3487a = new ArrayList();

    /* renamed from: b */
    public int f3488b = Integer.MIN_VALUE;

    /* renamed from: c */
    public int f3489c = Integer.MIN_VALUE;

    /* renamed from: d */
    public int f3490d = 0;

    /* renamed from: e */
    public final int f3491e;

    /* renamed from: f */
    public final /* synthetic */ StaggeredGridLayoutManager f3492f;

    public C0850d0(StaggeredGridLayoutManager staggeredGridLayoutManager, int r2) {
        this.f3492f = staggeredGridLayoutManager;
        this.f3491e = r2;
    }

    /* renamed from: a */
    public final void m2342a() {
        View view = (View) this.f3487a.get(r0.size() - 1);
        C0844a0 c0844a0 = (C0844a0) view.getLayoutParams();
        this.f3489c = this.f3492f.f2566r.mo1614b(view);
        c0844a0.getClass();
    }

    /* renamed from: b */
    public final void m2343b() {
        this.f3487a.clear();
        this.f3488b = Integer.MIN_VALUE;
        this.f3489c = Integer.MIN_VALUE;
        this.f3490d = 0;
    }

    /* renamed from: c */
    public final int m2344c() {
        return this.f3492f.f2571w ? m2346e(r1.size() - 1, -1) : m2346e(0, this.f3487a.size());
    }

    /* renamed from: d */
    public final int m2345d() {
        return this.f3492f.f2571w ? m2346e(0, this.f3487a.size()) : m2346e(r1.size() - 1, -1);
    }

    /* renamed from: e */
    public final int m2346e(int r12, int r13) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f3492f;
        int mo1623k = staggeredGridLayoutManager.f2566r.mo1623k();
        int mo1619g = staggeredGridLayoutManager.f2566r.mo1619g();
        int r5 = r13 > r12 ? 1 : -1;
        while (r12 != r13) {
            View view = (View) this.f3487a.get(r12);
            int mo1617e = staggeredGridLayoutManager.f2566r.mo1617e(view);
            int mo1614b = staggeredGridLayoutManager.f2566r.mo1614b(view);
            boolean z2 = mo1617e <= mo1619g;
            boolean z3 = mo1614b >= mo1623k;
            if (z2 && z3 && (mo1617e < mo1623k || mo1614b > mo1619g)) {
                return AbstractC0824G.m2276H(view);
            }
            r12 += r5;
        }
        return -1;
    }

    /* renamed from: f */
    public final int m2347f(int r3) {
        int r02 = this.f3489c;
        if (r02 != Integer.MIN_VALUE) {
            return r02;
        }
        if (this.f3487a.size() == 0) {
            return r3;
        }
        m2342a();
        return this.f3489c;
    }

    /* renamed from: g */
    public final View m2348g(int r7, int r8) {
        ArrayList arrayList = this.f3487a;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f3492f;
        View view = null;
        if (r8 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f2571w && AbstractC0824G.m2276H(view2) >= r7) || ((!staggeredGridLayoutManager.f2571w && AbstractC0824G.m2276H(view2) <= r7) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
        } else {
            int size2 = arrayList.size();
            int r12 = 0;
            while (r12 < size2) {
                View view3 = (View) arrayList.get(r12);
                if ((staggeredGridLayoutManager.f2571w && AbstractC0824G.m2276H(view3) <= r7) || ((!staggeredGridLayoutManager.f2571w && AbstractC0824G.m2276H(view3) >= r7) || !view3.hasFocusable())) {
                    break;
                }
                r12++;
                view = view3;
            }
        }
        return view;
    }

    /* renamed from: h */
    public final int m2349h(int r3) {
        int r02 = this.f3488b;
        if (r02 != Integer.MIN_VALUE) {
            return r02;
        }
        if (this.f3487a.size() == 0) {
            return r3;
        }
        View view = (View) this.f3487a.get(0);
        C0844a0 c0844a0 = (C0844a0) view.getLayoutParams();
        this.f3488b = this.f3492f.f2566r.mo1617e(view);
        c0844a0.getClass();
        return this.f3488b;
    }
}
