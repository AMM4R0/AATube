package p079e;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import com.carwizard.p075li.youtube.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p000A.AbstractC0001b;
import p006C.C0051c;
import p028K.AbstractC0270C;
import p028K.AbstractC0273F;
import p028K.AbstractC0283P;
import p028K.AbstractC0324p0;
import p028K.C0316l0;
import p028K.C0320n0;
import p028K.C0322o0;
import p028K.C0340x0;
import p028K.InterfaceC0325q;
import p102k.InterfaceC2478y;
import p102k.MenuC2466m;
import p104l.AbstractC2502A1;
import p104l.InterfaceC2589m0;

/* renamed from: e.m */
/* loaded from: classes.dex */
public final class C0804m implements InterfaceC0325q, InterfaceC2589m0, InterfaceC2478y {

    /* renamed from: a */
    public final /* synthetic */ int f3260a;

    /* renamed from: b */
    public final /* synthetic */ LayoutInflaterFactory2C0815x f3261b;

    public /* synthetic */ C0804m(LayoutInflaterFactory2C0815x layoutInflaterFactory2C0815x, int r2) {
        this.f3260a = r2;
        this.f3261b = layoutInflaterFactory2C0815x;
    }

    @Override // p102k.InterfaceC2478y
    /* renamed from: a */
    public void mo2226a(MenuC2466m menuC2466m, boolean z2) {
        C0814w c0814w;
        switch (this.f3260a) {
            case 2:
                this.f3261b.m2258r(menuC2466m);
                break;
            default:
                MenuC2466m mo4818k = menuC2466m.mo4818k();
                int r12 = 0;
                boolean z3 = mo4818k != menuC2466m;
                if (z3) {
                    menuC2466m = mo4818k;
                }
                LayoutInflaterFactory2C0815x layoutInflaterFactory2C0815x = this.f3261b;
                C0814w[] c0814wArr = layoutInflaterFactory2C0815x.f3305L;
                int length = c0814wArr != null ? c0814wArr.length : 0;
                while (true) {
                    if (r12 >= length) {
                        c0814w = null;
                    } else {
                        c0814w = c0814wArr[r12];
                        if (c0814w == null || c0814w.f3281h != menuC2466m) {
                            r12++;
                        }
                    }
                }
                if (c0814w != null) {
                    if (!z3) {
                        layoutInflaterFactory2C0815x.m2259s(c0814w, z2);
                        break;
                    } else {
                        layoutInflaterFactory2C0815x.m2257q(c0814w.f3274a, c0814w, mo4818k);
                        layoutInflaterFactory2C0815x.m2259s(c0814w, true);
                        break;
                    }
                }
                break;
        }
    }

    @Override // p102k.InterfaceC2478y
    /* renamed from: b */
    public boolean mo2227b(MenuC2466m menuC2466m) {
        Window.Callback callback;
        switch (this.f3260a) {
            case 2:
                Window.Callback callback2 = this.f3261b.f3329l.getCallback();
                if (callback2 != null) {
                    callback2.onMenuOpened(108, menuC2466m);
                    break;
                }
                break;
            default:
                if (menuC2466m == menuC2466m.mo4818k()) {
                    LayoutInflaterFactory2C0815x layoutInflaterFactory2C0815x = this.f3261b;
                    if (layoutInflaterFactory2C0815x.f3299F && (callback = layoutInflaterFactory2C0815x.f3329l.getCallback()) != null && !layoutInflaterFactory2C0815x.f3310Q) {
                        callback.onMenuOpened(108, menuC2466m);
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // p028K.InterfaceC0325q
    /* renamed from: c */
    public C0340x0 mo353c(View view, C0340x0 c0340x0) {
        boolean z2;
        C0340x0 c0340x02;
        boolean z3;
        boolean z4;
        int m979d = c0340x0.m979d();
        LayoutInflaterFactory2C0815x layoutInflaterFactory2C0815x = this.f3261b;
        layoutInflaterFactory2C0815x.getClass();
        int m979d2 = c0340x0.m979d();
        ActionBarContextView actionBarContextView = layoutInflaterFactory2C0815x.f3339v;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z2 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutInflaterFactory2C0815x.f3339v.getLayoutParams();
            if (layoutInflaterFactory2C0815x.f3339v.isShown()) {
                if (layoutInflaterFactory2C0815x.f3322c0 == null) {
                    layoutInflaterFactory2C0815x.f3322c0 = new Rect();
                    layoutInflaterFactory2C0815x.f3323d0 = new Rect();
                }
                Rect rect = layoutInflaterFactory2C0815x.f3322c0;
                Rect rect2 = layoutInflaterFactory2C0815x.f3323d0;
                rect.set(c0340x0.m977b(), c0340x0.m979d(), c0340x0.m978c(), c0340x0.m976a());
                ViewGroup viewGroup = layoutInflaterFactory2C0815x.f3294A;
                Method method = AbstractC2502A1.f8185a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect, rect2);
                    } catch (Exception e2) {
                        Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e2);
                    }
                }
                int r02 = rect.top;
                int r12 = rect.left;
                int r11 = rect.right;
                ViewGroup viewGroup2 = layoutInflaterFactory2C0815x.f3294A;
                WeakHashMap weakHashMap = AbstractC0283P.f842a;
                C0340x0 m723a = AbstractC0273F.m723a(viewGroup2);
                int m977b = m723a == null ? 0 : m723a.m977b();
                int m978c = m723a == null ? 0 : m723a.m978c();
                if (marginLayoutParams.topMargin == r02 && marginLayoutParams.leftMargin == r12 && marginLayoutParams.rightMargin == r11) {
                    z4 = false;
                } else {
                    marginLayoutParams.topMargin = r02;
                    marginLayoutParams.leftMargin = r12;
                    marginLayoutParams.rightMargin = r11;
                    z4 = true;
                }
                Context context = layoutInflaterFactory2C0815x.f3328k;
                if (r02 <= 0 || layoutInflaterFactory2C0815x.f3296C != null) {
                    View view2 = layoutInflaterFactory2C0815x.f3296C;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int r3 = marginLayoutParams2.height;
                        int r9 = marginLayoutParams.topMargin;
                        if (r3 != r9 || marginLayoutParams2.leftMargin != m977b || marginLayoutParams2.rightMargin != m978c) {
                            marginLayoutParams2.height = r9;
                            marginLayoutParams2.leftMargin = m977b;
                            marginLayoutParams2.rightMargin = m978c;
                            layoutInflaterFactory2C0815x.f3296C.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    layoutInflaterFactory2C0815x.f3296C = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = m977b;
                    layoutParams.rightMargin = m978c;
                    layoutInflaterFactory2C0815x.f3294A.addView(layoutInflaterFactory2C0815x.f3296C, -1, layoutParams);
                }
                View view4 = layoutInflaterFactory2C0815x.f3296C;
                boolean z5 = view4 != null;
                if (z5 && view4.getVisibility() != 0) {
                    View view5 = layoutInflaterFactory2C0815x.f3296C;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? AbstractC0001b.m3a(context, R.color.abc_decor_view_status_guard_light) : AbstractC0001b.m3a(context, R.color.abc_decor_view_status_guard));
                }
                if (!layoutInflaterFactory2C0815x.f3301H && z5) {
                    m979d2 = 0;
                }
                z2 = z5;
                z3 = z4;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z2 = false;
                z3 = true;
            } else {
                z2 = false;
                z3 = false;
            }
            if (z3) {
                layoutInflaterFactory2C0815x.f3339v.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = layoutInflaterFactory2C0815x.f3296C;
        if (view6 != null) {
            view6.setVisibility(z2 ? 0 : 8);
        }
        if (m979d != m979d2) {
            int m977b2 = c0340x0.m977b();
            int m978c2 = c0340x0.m978c();
            int m976a = c0340x0.m976a();
            int r5 = Build.VERSION.SDK_INT;
            AbstractC0324p0 c0322o0 = r5 >= 30 ? new C0322o0(c0340x0) : r5 >= 29 ? new C0320n0(c0340x0) : new C0316l0(c0340x0);
            c0322o0.mo894g(C0051c.m197b(m977b2, m979d2, m978c2, m976a));
            c0340x02 = c0322o0.mo892b();
        } else {
            c0340x02 = c0340x0;
        }
        WeakHashMap weakHashMap2 = AbstractC0283P.f842a;
        WindowInsets m980f = c0340x02.m980f();
        if (m980f == null) {
            return c0340x02;
        }
        WindowInsets m695b = AbstractC0270C.m695b(view, m980f);
        return !m695b.equals(m980f) ? C0340x0.m975g(view, m695b) : c0340x02;
    }
}
