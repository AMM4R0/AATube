package p028K;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.carwizard.p075li.youtube.R;
import java.util.List;
import p010D0.C0113k;
import p062X.C0539a;

/* renamed from: K.e0 */
/* loaded from: classes.dex */
public final class C0302e0 extends AbstractC0310i0 {

    /* renamed from: e */
    public static final PathInterpolator f874e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* renamed from: f */
    public static final C0539a f875f = new C0539a();

    /* renamed from: g */
    public static final DecelerateInterpolator f876g = new DecelerateInterpolator();

    /* renamed from: e */
    public static void m830e(View view) {
        C0301e m835j = m835j(view);
        if (m835j != null) {
            ((View) m835j.f872e).setTranslationY(0.0f);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int r02 = 0; r02 < viewGroup.getChildCount(); r02++) {
                m830e(viewGroup.getChildAt(r02));
            }
        }
    }

    /* renamed from: f */
    public static void m831f(View view, WindowInsets windowInsets, boolean z2) {
        C0301e m835j = m835j(view);
        if (m835j != null) {
            m835j.f869b = windowInsets;
            if (!z2) {
                View view2 = (View) m835j.f872e;
                int[] r12 = (int[]) m835j.f873f;
                view2.getLocationOnScreen(r12);
                z2 = true;
                m835j.f870c = r12[1];
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int r02 = 0; r02 < viewGroup.getChildCount(); r02++) {
                m831f(viewGroup.getChildAt(r02), windowInsets, z2);
            }
        }
    }

    /* renamed from: g */
    public static void m832g(View view, C0340x0 c0340x0, List list) {
        C0301e m835j = m835j(view);
        if (m835j != null) {
            m835j.m829b(c0340x0, list);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int r02 = 0; r02 < viewGroup.getChildCount(); r02++) {
                m832g(viewGroup.getChildAt(r02), c0340x0, list);
            }
        }
    }

    /* renamed from: h */
    public static void m833h(View view, C0113k c0113k) {
        C0301e m835j = m835j(view);
        if (m835j != null) {
            View view2 = (View) m835j.f872e;
            int[] r3 = (int[]) m835j.f873f;
            view2.getLocationOnScreen(r3);
            int r12 = m835j.f870c - r3[1];
            m835j.f871d = r12;
            view2.setTranslationY(r12);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int r02 = 0; r02 < viewGroup.getChildCount(); r02++) {
                m833h(viewGroup.getChildAt(r02), c0113k);
            }
        }
    }

    /* renamed from: i */
    public static WindowInsets m834i(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    /* renamed from: j */
    public static C0301e m835j(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof ViewOnApplyWindowInsetsListenerC0300d0) {
            return ((ViewOnApplyWindowInsetsListenerC0300d0) tag).f866a;
        }
        return null;
    }
}
