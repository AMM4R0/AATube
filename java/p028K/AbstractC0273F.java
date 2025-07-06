package p028K;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: K.F */
/* loaded from: classes.dex */
public abstract class AbstractC0273F {
    /* renamed from: a */
    public static C0340x0 m723a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        C0340x0 m975g = C0340x0.m975g(null, rootWindowInsets);
        C0336v0 c0336v0 = m975g.f944a;
        c0336v0.mo955p(m975g);
        c0336v0.mo949d(view.getRootView());
        return m975g;
    }

    /* renamed from: b */
    public static int m724b(View view) {
        return view.getScrollIndicators();
    }

    /* renamed from: c */
    public static void m725c(View view, int r12) {
        view.setScrollIndicators(r12);
    }

    /* renamed from: d */
    public static void m726d(View view, int r12, int r2) {
        view.setScrollIndicators(r12, r2);
    }
}
