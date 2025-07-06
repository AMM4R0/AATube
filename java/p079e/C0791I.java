package p079e;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p006C.C0055g;
import p010D0.C0113k;
import p028K.AbstractC0270C;
import p028K.AbstractC0272E;
import p028K.AbstractC0283P;
import p028K.C0289W;
import p028K.C0291Y;
import p036M1.AbstractC0379e;
import p076d.AbstractC0780a;
import p099j.C2425j;
import p099j.C2426k;
import p104l.C2611t1;
import p104l.InterfaceC2561d;
import p104l.InterfaceC2595o0;

/* renamed from: e.I */
/* loaded from: classes.dex */
public final class C0791I extends AbstractC0379e implements InterfaceC2561d {

    /* renamed from: D */
    public static final AccelerateInterpolator f3175D = new AccelerateInterpolator();

    /* renamed from: E */
    public static final DecelerateInterpolator f3176E = new DecelerateInterpolator();

    /* renamed from: A */
    public final C0789G f3177A;

    /* renamed from: B */
    public final C0789G f3178B;

    /* renamed from: C */
    public final C0055g f3179C;

    /* renamed from: f */
    public Context f3180f;

    /* renamed from: g */
    public Context f3181g;

    /* renamed from: h */
    public ActionBarOverlayLayout f3182h;

    /* renamed from: i */
    public ActionBarContainer f3183i;

    /* renamed from: j */
    public InterfaceC2595o0 f3184j;

    /* renamed from: k */
    public ActionBarContextView f3185k;

    /* renamed from: l */
    public final View f3186l;

    /* renamed from: m */
    public boolean f3187m;

    /* renamed from: n */
    public C0790H f3188n;

    /* renamed from: o */
    public C0790H f3189o;

    /* renamed from: p */
    public C0113k f3190p;

    /* renamed from: q */
    public boolean f3191q;

    /* renamed from: r */
    public final ArrayList f3192r;

    /* renamed from: s */
    public int f3193s;

    /* renamed from: t */
    public boolean f3194t;

    /* renamed from: u */
    public boolean f3195u;

    /* renamed from: v */
    public boolean f3196v;

    /* renamed from: w */
    public boolean f3197w;

    /* renamed from: x */
    public C2426k f3198x;

    /* renamed from: y */
    public boolean f3199y;

    /* renamed from: z */
    public boolean f3200z;

    public C0791I(Activity activity, boolean z2) {
        new ArrayList();
        this.f3192r = new ArrayList();
        this.f3193s = 0;
        this.f3194t = true;
        this.f3197w = true;
        this.f3177A = new C0789G(this, 0);
        this.f3178B = new C0789G(this, 1);
        this.f3179C = new C0055g(24, this);
        View decorView = activity.getWindow().getDecorView();
        m2188H(decorView);
        if (z2) {
            return;
        }
        this.f3186l = decorView.findViewById(R.id.content);
    }

    /* renamed from: F */
    public final void m2186F(boolean z2) {
        C0291Y m1501i;
        C0291Y c0291y;
        if (z2) {
            if (!this.f3196v) {
                this.f3196v = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f3182h;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                m2191K(false);
            }
        } else if (this.f3196v) {
            this.f3196v = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f3182h;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            m2191K(false);
        }
        ActionBarContainer actionBarContainer = this.f3183i;
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        if (!actionBarContainer.isLaidOut()) {
            if (z2) {
                ((C2611t1) this.f3184j).f8477a.setVisibility(4);
                this.f3185k.setVisibility(0);
                return;
            } else {
                ((C2611t1) this.f3184j).f8477a.setVisibility(0);
                this.f3185k.setVisibility(8);
                return;
            }
        }
        if (z2) {
            C2611t1 c2611t1 = (C2611t1) this.f3184j;
            m1501i = AbstractC0283P.m768a(c2611t1.f8477a);
            m1501i.m795a(0.0f);
            m1501i.m797c(100L);
            m1501i.m798d(new C2425j(c2611t1, 4));
            c0291y = this.f3185k.m1501i(0, 200L);
        } else {
            C2611t1 c2611t12 = (C2611t1) this.f3184j;
            C0291Y m768a = AbstractC0283P.m768a(c2611t12.f8477a);
            m768a.m795a(1.0f);
            m768a.m797c(200L);
            m768a.m798d(new C2425j(c2611t12, 0));
            m1501i = this.f3185k.m1501i(8, 100L);
            c0291y = m768a;
        }
        C2426k c2426k = new C2426k();
        ArrayList arrayList = c2426k.f7879a;
        arrayList.add(m1501i);
        View view = (View) m1501i.f853a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) c0291y.f853a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(c0291y);
        c2426k.m4783b();
    }

    /* renamed from: G */
    public final Context m2187G() {
        if (this.f3181g == null) {
            TypedValue typedValue = new TypedValue();
            this.f3180f.getTheme().resolveAttribute(com.carwizard.p075li.youtube.R.attr.actionBarWidgetTheme, typedValue, true);
            int r02 = typedValue.resourceId;
            if (r02 != 0) {
                this.f3181g = new ContextThemeWrapper(this.f3180f, r02);
            } else {
                this.f3181g = this.f3180f;
            }
        }
        return this.f3181g;
    }

    /* renamed from: H */
    public final void m2188H(View view) {
        InterfaceC2595o0 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.carwizard.p075li.youtube.R.id.decor_content_parent);
        this.f3182h = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(com.carwizard.p075li.youtube.R.id.action_bar);
        if (findViewById instanceof InterfaceC2595o0) {
            wrapper = (InterfaceC2595o0) findViewById;
        } else {
            if (!(findViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById != null ? findViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) findViewById).getWrapper();
        }
        this.f3184j = wrapper;
        this.f3185k = (ActionBarContextView) view.findViewById(com.carwizard.p075li.youtube.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.carwizard.p075li.youtube.R.id.action_bar_container);
        this.f3183i = actionBarContainer;
        InterfaceC2595o0 interfaceC2595o0 = this.f3184j;
        if (interfaceC2595o0 == null || this.f3185k == null || actionBarContainer == null) {
            throw new IllegalStateException(C0791I.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((C2611t1) interfaceC2595o0).f8477a.getContext();
        this.f3180f = context;
        if ((((C2611t1) this.f3184j).f8478b & 4) != 0) {
            this.f3187m = true;
        }
        int r3 = context.getApplicationInfo().targetSdkVersion;
        this.f3184j.getClass();
        m2190J(context.getResources().getBoolean(com.carwizard.p075li.youtube.R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.f3180f.obtainStyledAttributes(null, AbstractC0780a.f3114a, com.carwizard.p075li.youtube.R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f3182h;
            if (!actionBarOverlayLayout2.f1785h) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f3200z = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f3183i;
            WeakHashMap weakHashMap = AbstractC0283P.f842a;
            AbstractC0272E.m715s(actionBarContainer2, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: I */
    public final void m2189I(boolean z2) {
        if (this.f3187m) {
            return;
        }
        int r5 = z2 ? 4 : 0;
        C2611t1 c2611t1 = (C2611t1) this.f3184j;
        int r2 = c2611t1.f8478b;
        this.f3187m = true;
        c2611t1.m5074a((r5 & 4) | (r2 & (-5)));
    }

    /* renamed from: J */
    public final void m2190J(boolean z2) {
        if (z2) {
            this.f3183i.setTabContainer(null);
            ((C2611t1) this.f3184j).getClass();
        } else {
            ((C2611t1) this.f3184j).getClass();
            this.f3183i.setTabContainer(null);
        }
        this.f3184j.getClass();
        ((C2611t1) this.f3184j).f8477a.setCollapsible(false);
        this.f3182h.setHasNonEmbeddedTabs(false);
    }

    /* renamed from: K */
    public final void m2191K(boolean z2) {
        boolean z3 = this.f3196v || !this.f3195u;
        View view = this.f3186l;
        C0055g c0055g = this.f3179C;
        if (!z3) {
            if (this.f3197w) {
                this.f3197w = false;
                C2426k c2426k = this.f3198x;
                if (c2426k != null) {
                    c2426k.m4782a();
                }
                int r02 = this.f3193s;
                C0789G c0789g = this.f3177A;
                if (r02 != 0 || (!this.f3199y && !z2)) {
                    c0789g.mo800a();
                    return;
                }
                this.f3183i.setAlpha(1.0f);
                this.f3183i.setTransitioning(true);
                C2426k c2426k2 = new C2426k();
                float f = -this.f3183i.getHeight();
                if (z2) {
                    this.f3183i.getLocationInWindow(new int[]{0, 0});
                    f -= r12[1];
                }
                C0291Y m768a = AbstractC0283P.m768a(this.f3183i);
                m768a.m799e(f);
                View view2 = (View) m768a.f853a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(c0055g != null ? new C0289W(c0055g, view2) : null);
                }
                boolean z4 = c2426k2.f7883e;
                ArrayList arrayList = c2426k2.f7879a;
                if (!z4) {
                    arrayList.add(m768a);
                }
                if (this.f3194t && view != null) {
                    C0291Y m768a2 = AbstractC0283P.m768a(view);
                    m768a2.m799e(f);
                    if (!c2426k2.f7883e) {
                        arrayList.add(m768a2);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = f3175D;
                boolean z5 = c2426k2.f7883e;
                if (!z5) {
                    c2426k2.f7881c = accelerateInterpolator;
                }
                if (!z5) {
                    c2426k2.f7880b = 250L;
                }
                if (!z5) {
                    c2426k2.f7882d = c0789g;
                }
                this.f3198x = c2426k2;
                c2426k2.m4783b();
                return;
            }
            return;
        }
        if (this.f3197w) {
            return;
        }
        this.f3197w = true;
        C2426k c2426k3 = this.f3198x;
        if (c2426k3 != null) {
            c2426k3.m4782a();
        }
        this.f3183i.setVisibility(0);
        int r03 = this.f3193s;
        C0789G c0789g2 = this.f3178B;
        if (r03 == 0 && (this.f3199y || z2)) {
            this.f3183i.setTranslationY(0.0f);
            float f2 = -this.f3183i.getHeight();
            if (z2) {
                this.f3183i.getLocationInWindow(new int[]{0, 0});
                f2 -= r12[1];
            }
            this.f3183i.setTranslationY(f2);
            C2426k c2426k4 = new C2426k();
            C0291Y m768a3 = AbstractC0283P.m768a(this.f3183i);
            m768a3.m799e(0.0f);
            View view3 = (View) m768a3.f853a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(c0055g != null ? new C0289W(c0055g, view3) : null);
            }
            boolean z6 = c2426k4.f7883e;
            ArrayList arrayList2 = c2426k4.f7879a;
            if (!z6) {
                arrayList2.add(m768a3);
            }
            if (this.f3194t && view != null) {
                view.setTranslationY(f2);
                C0291Y m768a4 = AbstractC0283P.m768a(view);
                m768a4.m799e(0.0f);
                if (!c2426k4.f7883e) {
                    arrayList2.add(m768a4);
                }
            }
            DecelerateInterpolator decelerateInterpolator = f3176E;
            boolean z7 = c2426k4.f7883e;
            if (!z7) {
                c2426k4.f7881c = decelerateInterpolator;
            }
            if (!z7) {
                c2426k4.f7880b = 250L;
            }
            if (!z7) {
                c2426k4.f7882d = c0789g2;
            }
            this.f3198x = c2426k4;
            c2426k4.m4783b();
        } else {
            this.f3183i.setAlpha(1.0f);
            this.f3183i.setTranslationY(0.0f);
            if (this.f3194t && view != null) {
                view.setTranslationY(0.0f);
            }
            c0789g2.mo800a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f3182h;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = AbstractC0283P.f842a;
            AbstractC0270C.m696c(actionBarOverlayLayout);
        }
    }

    public C0791I(Dialog dialog) {
        new ArrayList();
        this.f3192r = new ArrayList();
        this.f3193s = 0;
        this.f3194t = true;
        this.f3197w = true;
        this.f3177A = new C0789G(this, 0);
        this.f3178B = new C0789G(this, 1);
        this.f3179C = new C0055g(24, this);
        m2188H(dialog.getWindow().getDecorView());
    }
}
