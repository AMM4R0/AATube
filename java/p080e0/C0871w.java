package p080e0;

import android.view.View;
import androidx.emoji2.text.AbstractC0617g;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: e0.w */
/* loaded from: classes.dex */
public final class C0871w extends AbstractC0826I {

    /* renamed from: a */
    public RecyclerView f3631a;

    /* renamed from: b */
    public final C0841Y f3632b = new C0841Y(this);

    /* renamed from: c */
    public C0870v f3633c;

    /* renamed from: d */
    public C0870v f3634d;

    /* renamed from: b */
    public static int m2377b(View view, AbstractC0617g abstractC0617g) {
        return ((abstractC0617g.mo1615c(view) / 2) + abstractC0617g.mo1617e(view)) - ((abstractC0617g.mo1624l() / 2) + abstractC0617g.mo1623k());
    }

    /* renamed from: c */
    public static View m2378c(AbstractC0824G abstractC0824G, AbstractC0617g abstractC0617g) {
        int m2304v = abstractC0824G.m2304v();
        View view = null;
        if (m2304v == 0) {
            return null;
        }
        int mo1624l = (abstractC0617g.mo1624l() / 2) + abstractC0617g.mo1623k();
        int r2 = Integer.MAX_VALUE;
        for (int r4 = 0; r4 < m2304v; r4++) {
            View m2302u = abstractC0824G.m2302u(r4);
            int abs = Math.abs(((abstractC0617g.mo1615c(m2302u) / 2) + abstractC0617g.mo1617e(m2302u)) - mo1624l);
            if (abs < r2) {
                view = m2302u;
                r2 = abs;
            }
        }
        return view;
    }

    /* renamed from: a */
    public final int[] m2379a(AbstractC0824G abstractC0824G, View view) {
        int[] r02 = new int[2];
        if (abstractC0824G.mo1878d()) {
            r02[0] = m2377b(view, m2380d(abstractC0824G));
        } else {
            r02[0] = 0;
        }
        if (abstractC0824G.mo1881e()) {
            r02[1] = m2377b(view, m2381e(abstractC0824G));
        } else {
            r02[1] = 0;
        }
        return r02;
    }

    /* renamed from: d */
    public final AbstractC0617g m2380d(AbstractC0824G abstractC0824G) {
        C0870v c0870v = this.f3634d;
        if (c0870v == null || ((AbstractC0824G) c0870v.f2067b) != abstractC0824G) {
            this.f3634d = new C0870v(abstractC0824G, 0);
        }
        return this.f3634d;
    }

    /* renamed from: e */
    public final AbstractC0617g m2381e(AbstractC0824G abstractC0824G) {
        C0870v c0870v = this.f3633c;
        if (c0870v == null || ((AbstractC0824G) c0870v.f2067b) != abstractC0824G) {
            this.f3633c = new C0870v(abstractC0824G, 1);
        }
        return this.f3633c;
    }

    /* renamed from: f */
    public final void m2382f() {
        AbstractC0824G layoutManager;
        RecyclerView recyclerView = this.f3631a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        View m2378c = layoutManager.mo1881e() ? m2378c(layoutManager, m2381e(layoutManager)) : layoutManager.mo1878d() ? m2378c(layoutManager, m2380d(layoutManager)) : null;
        if (m2378c == null) {
            return;
        }
        int[] m2379a = m2379a(layoutManager, m2378c);
        int r2 = m2379a[0];
        if (r2 == 0 && m2379a[1] == 0) {
            return;
        }
        this.f3631a.m1921Z(r2, m2379a[1], false);
    }
}
