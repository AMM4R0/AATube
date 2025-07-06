package p028K;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import com.carwizard.p075li.youtube.R;
import p006C.C0051c;

/* renamed from: K.E */
/* loaded from: classes.dex */
public abstract class AbstractC0272E {
    /* renamed from: a */
    public static void m697a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    /* renamed from: b */
    public static C0340x0 m698b(View view, C0340x0 c0340x0, Rect rect) {
        WindowInsets m980f = c0340x0.m980f();
        if (m980f != null) {
            return C0340x0.m975g(view, view.computeSystemWindowInsets(m980f, rect));
        }
        rect.setEmpty();
        return c0340x0;
    }

    /* renamed from: c */
    public static boolean m699c(View view, float f, float f2, boolean z2) {
        return view.dispatchNestedFling(f, f2, z2);
    }

    /* renamed from: d */
    public static boolean m700d(View view, float f, float f2) {
        return view.dispatchNestedPreFling(f, f2);
    }

    /* renamed from: e */
    public static boolean m701e(View view, int r12, int r2, int[] r3, int[] r4) {
        return view.dispatchNestedPreScroll(r12, r2, r3, r4);
    }

    /* renamed from: f */
    public static boolean m702f(View view, int r12, int r2, int r3, int r4, int[] r5) {
        return view.dispatchNestedScroll(r12, r2, r3, r4, r5);
    }

    /* renamed from: g */
    public static ColorStateList m703g(View view) {
        return view.getBackgroundTintList();
    }

    /* renamed from: h */
    public static PorterDuff.Mode m704h(View view) {
        return view.getBackgroundTintMode();
    }

    /* renamed from: i */
    public static float m705i(View view) {
        return view.getElevation();
    }

    /* renamed from: j */
    public static C0340x0 m706j(View view) {
        if (!AbstractC0314k0.f900d || !view.isAttachedToWindow()) {
            return null;
        }
        try {
            Object obj = AbstractC0314k0.f897a.get(view.getRootView());
            if (obj == null) {
                return null;
            }
            Rect rect = (Rect) AbstractC0314k0.f898b.get(obj);
            Rect rect2 = (Rect) AbstractC0314k0.f899c.get(obj);
            if (rect == null || rect2 == null) {
                return null;
            }
            int r3 = Build.VERSION.SDK_INT;
            AbstractC0324p0 c0322o0 = r3 >= 30 ? new C0322o0() : r3 >= 29 ? new C0320n0() : new C0316l0();
            c0322o0.mo893e(C0051c.m197b(rect.left, rect.top, rect.right, rect.bottom));
            c0322o0.mo894g(C0051c.m197b(rect2.left, rect2.top, rect2.right, rect2.bottom));
            C0340x0 mo892b = c0322o0.mo892b();
            mo892b.f944a.mo955p(mo892b);
            mo892b.f944a.mo949d(view.getRootView());
            return mo892b;
        } catch (IllegalAccessException e2) {
            Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e2.getMessage(), e2);
            return null;
        }
    }

    /* renamed from: k */
    public static String m707k(View view) {
        return view.getTransitionName();
    }

    /* renamed from: l */
    public static float m708l(View view) {
        return view.getTranslationZ();
    }

    /* renamed from: m */
    public static float m709m(View view) {
        return view.getZ();
    }

    /* renamed from: n */
    public static boolean m710n(View view) {
        return view.hasNestedScrollingParent();
    }

    /* renamed from: o */
    public static boolean m711o(View view) {
        return view.isImportantForAccessibility();
    }

    /* renamed from: p */
    public static boolean m712p(View view) {
        return view.isNestedScrollingEnabled();
    }

    /* renamed from: q */
    public static void m713q(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    /* renamed from: r */
    public static void m714r(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    /* renamed from: s */
    public static void m715s(View view, float f) {
        view.setElevation(f);
    }

    /* renamed from: t */
    public static void m716t(View view, boolean z2) {
        view.setNestedScrollingEnabled(z2);
    }

    /* renamed from: u */
    public static void m717u(View view, InterfaceC0325q interfaceC0325q) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, interfaceC0325q);
        }
        if (interfaceC0325q == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        } else {
            view.setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC0271D(view, interfaceC0325q));
        }
    }

    /* renamed from: v */
    public static void m718v(View view, String str) {
        view.setTransitionName(str);
    }

    /* renamed from: w */
    public static void m719w(View view, float f) {
        view.setTranslationZ(f);
    }

    /* renamed from: x */
    public static void m720x(View view, float f) {
        view.setZ(f);
    }

    /* renamed from: y */
    public static boolean m721y(View view, int r12) {
        return view.startNestedScroll(r12);
    }

    /* renamed from: z */
    public static void m722z(View view) {
        view.stopNestedScroll();
    }
}
