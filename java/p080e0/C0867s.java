package p080e0;

import android.view.View;
import java.util.List;

/* renamed from: e0.s */
/* loaded from: classes.dex */
public final class C0867s {

    /* renamed from: a */
    public boolean f3599a;

    /* renamed from: b */
    public int f3600b;

    /* renamed from: c */
    public int f3601c;

    /* renamed from: d */
    public int f3602d;

    /* renamed from: e */
    public int f3603e;

    /* renamed from: f */
    public int f3604f;

    /* renamed from: g */
    public int f3605g;

    /* renamed from: h */
    public int f3606h;

    /* renamed from: i */
    public int f3607i;

    /* renamed from: j */
    public int f3608j;

    /* renamed from: k */
    public List f3609k;

    /* renamed from: l */
    public boolean f3610l;

    /* renamed from: a */
    public final void m2372a(View view) {
        int m2325b;
        int size = this.f3609k.size();
        View view2 = null;
        int r2 = Integer.MAX_VALUE;
        for (int r3 = 0; r3 < size; r3++) {
            View view3 = ((AbstractC0838V) this.f3609k.get(r3)).f3424a;
            C0825H c0825h = (C0825H) view3.getLayoutParams();
            if (view3 != view && !c0825h.f3376a.m2332i() && (m2325b = (c0825h.f3376a.m2325b() - this.f3602d) * this.f3603e) >= 0 && m2325b < r2) {
                view2 = view3;
                if (m2325b == 0) {
                    break;
                } else {
                    r2 = m2325b;
                }
            }
        }
        if (view2 == null) {
            this.f3602d = -1;
        } else {
            this.f3602d = ((C0825H) view2.getLayoutParams()).f3376a.m2325b();
        }
    }

    /* renamed from: b */
    public final View m2373b(C0830M c0830m) {
        List list = this.f3609k;
        if (list == null) {
            View view = c0830m.m2316i(this.f3602d, Long.MAX_VALUE).f3424a;
            this.f3602d += this.f3603e;
            return view;
        }
        int size = list.size();
        for (int r02 = 0; r02 < size; r02++) {
            View view2 = ((AbstractC0838V) this.f3609k.get(r02)).f3424a;
            C0825H c0825h = (C0825H) view2.getLayoutParams();
            if (!c0825h.f3376a.m2332i() && this.f3602d == c0825h.f3376a.m2325b()) {
                m2372a(view2);
                return view2;
            }
        }
        return null;
    }
}
