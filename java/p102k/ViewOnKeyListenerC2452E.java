package p102k;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.fragment.app.ViewOnAttachStateChangeListenerC0643J;
import com.carwizard.p075li.youtube.R;
import java.util.WeakHashMap;
import p028K.AbstractC0283P;
import p104l.C2532P0;
import p104l.C2622x0;

/* renamed from: k.E */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC2452E extends AbstractC2474u implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: b */
    public final Context f7977b;

    /* renamed from: c */
    public final MenuC2466m f7978c;

    /* renamed from: d */
    public final C2463j f7979d;

    /* renamed from: e */
    public final boolean f7980e;

    /* renamed from: f */
    public final int f7981f;

    /* renamed from: g */
    public final int f7982g;

    /* renamed from: h */
    public final C2532P0 f7983h;

    /* renamed from: k */
    public C2475v f7986k;

    /* renamed from: l */
    public View f7987l;

    /* renamed from: m */
    public View f7988m;

    /* renamed from: n */
    public InterfaceC2478y f7989n;

    /* renamed from: o */
    public ViewTreeObserver f7990o;

    /* renamed from: p */
    public boolean f7991p;

    /* renamed from: q */
    public boolean f7992q;

    /* renamed from: r */
    public int f7993r;

    /* renamed from: t */
    public boolean f7995t;

    /* renamed from: i */
    public final ViewTreeObserverOnGlobalLayoutListenerC2457d f7984i = new ViewTreeObserverOnGlobalLayoutListenerC2457d(1, this);

    /* renamed from: j */
    public final ViewOnAttachStateChangeListenerC0643J f7985j = new ViewOnAttachStateChangeListenerC0643J(3, this);

    /* renamed from: s */
    public int f7994s = 0;

    public ViewOnKeyListenerC2452E(int r4, Context context, View view, MenuC2466m menuC2466m, boolean z2) {
        this.f7977b = context;
        this.f7978c = menuC2466m;
        this.f7980e = z2;
        this.f7979d = new C2463j(menuC2466m, LayoutInflater.from(context), z2, R.layout.abc_popup_menu_item_layout);
        this.f7982g = r4;
        Resources resources = context.getResources();
        this.f7981f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f7987l = view;
        this.f7983h = new C2532P0(context, null, r4);
        menuC2466m.m4835b(this, context);
    }

    @Override // p102k.InterfaceC2479z
    /* renamed from: a */
    public final void mo4801a(MenuC2466m menuC2466m, boolean z2) {
        if (menuC2466m != this.f7978c) {
            return;
        }
        dismiss();
        InterfaceC2478y interfaceC2478y = this.f7989n;
        if (interfaceC2478y != null) {
            interfaceC2478y.mo2226a(menuC2466m, z2);
        }
    }

    @Override // p102k.InterfaceC2451D
    /* renamed from: b */
    public final boolean mo4798b() {
        return !this.f7991p && this.f7983h.f8254z.isShowing();
    }

    @Override // p102k.InterfaceC2479z
    /* renamed from: d */
    public final boolean mo4802d(SubMenuC2453F subMenuC2453F) {
        if (subMenuC2453F.hasVisibleItems()) {
            View view = this.f7988m;
            C2477x c2477x = new C2477x(this.f7982g, this.f7977b, view, subMenuC2453F, this.f7980e);
            InterfaceC2478y interfaceC2478y = this.f7989n;
            c2477x.f8140h = interfaceC2478y;
            AbstractC2474u abstractC2474u = c2477x.f8141i;
            if (abstractC2474u != null) {
                abstractC2474u.mo4805k(interfaceC2478y);
            }
            boolean m4856u = AbstractC2474u.m4856u(subMenuC2453F);
            c2477x.f8139g = m4856u;
            AbstractC2474u abstractC2474u2 = c2477x.f8141i;
            if (abstractC2474u2 != null) {
                abstractC2474u2.mo4808o(m4856u);
            }
            c2477x.f8142j = this.f7986k;
            this.f7986k = null;
            this.f7978c.m4836c(false);
            C2532P0 c2532p0 = this.f7983h;
            int r3 = c2532p0.f8234f;
            int m4947g = c2532p0.m4947g();
            int r4 = this.f7994s;
            View view2 = this.f7987l;
            WeakHashMap weakHashMap = AbstractC0283P.f842a;
            if ((Gravity.getAbsoluteGravity(r4, view2.getLayoutDirection()) & 7) == 5) {
                r3 += this.f7987l.getWidth();
            }
            if (!c2477x.m4859b()) {
                if (c2477x.f8137e != null) {
                    c2477x.m4861d(r3, m4947g, true, true);
                }
            }
            InterfaceC2478y interfaceC2478y2 = this.f7989n;
            if (interfaceC2478y2 != null) {
                interfaceC2478y2.mo2227b(subMenuC2453F);
            }
            return true;
        }
        return false;
    }

    @Override // p102k.InterfaceC2451D
    public final void dismiss() {
        if (mo4798b()) {
            this.f7983h.dismiss();
        }
    }

    @Override // p102k.InterfaceC2451D
    /* renamed from: f */
    public final void mo4799f() {
        View view;
        if (mo4798b()) {
            return;
        }
        if (this.f7991p || (view = this.f7987l) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f7988m = view;
        C2532P0 c2532p0 = this.f7983h;
        c2532p0.f8254z.setOnDismissListener(this);
        c2532p0.f8244p = this;
        c2532p0.f8253y = true;
        c2532p0.f8254z.setFocusable(true);
        View view2 = this.f7988m;
        boolean z2 = this.f7990o == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f7990o = viewTreeObserver;
        if (z2) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f7984i);
        }
        view2.addOnAttachStateChangeListener(this.f7985j);
        c2532p0.f8243o = view2;
        c2532p0.f8240l = this.f7994s;
        boolean z3 = this.f7992q;
        Context context = this.f7977b;
        C2463j c2463j = this.f7979d;
        if (!z3) {
            this.f7993r = AbstractC2474u.m4855m(c2463j, context, this.f7981f);
            this.f7992q = true;
        }
        c2532p0.m4953r(this.f7993r);
        c2532p0.f8254z.setInputMethodMode(2);
        Rect rect = this.f8131a;
        c2532p0.f8252x = rect != null ? new Rect(rect) : null;
        c2532p0.mo4799f();
        C2622x0 c2622x0 = c2532p0.f8231c;
        c2622x0.setOnKeyListener(this);
        if (this.f7995t) {
            MenuC2466m menuC2466m = this.f7978c;
            if (menuC2466m.f8077m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c2622x0, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(menuC2466m.f8077m);
                }
                frameLayout.setEnabled(false);
                c2622x0.addHeaderView(frameLayout, null, false);
            }
        }
        c2532p0.mo4951n(c2463j);
        c2532p0.mo4799f();
    }

    @Override // p102k.InterfaceC2479z
    /* renamed from: h */
    public final boolean mo4803h() {
        return false;
    }

    @Override // p102k.InterfaceC2479z
    /* renamed from: i */
    public final void mo4804i() {
        this.f7992q = false;
        C2463j c2463j = this.f7979d;
        if (c2463j != null) {
            c2463j.notifyDataSetChanged();
        }
    }

    @Override // p102k.InterfaceC2451D
    /* renamed from: j */
    public final C2622x0 mo4800j() {
        return this.f7983h.f8231c;
    }

    @Override // p102k.InterfaceC2479z
    /* renamed from: k */
    public final void mo4805k(InterfaceC2478y interfaceC2478y) {
        this.f7989n = interfaceC2478y;
    }

    @Override // p102k.AbstractC2474u
    /* renamed from: n */
    public final void mo4807n(View view) {
        this.f7987l = view;
    }

    @Override // p102k.AbstractC2474u
    /* renamed from: o */
    public final void mo4808o(boolean z2) {
        this.f7979d.f8060c = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f7991p = true;
        this.f7978c.m4836c(true);
        ViewTreeObserver viewTreeObserver = this.f7990o;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f7990o = this.f7988m.getViewTreeObserver();
            }
            this.f7990o.removeGlobalOnLayoutListener(this.f7984i);
            this.f7990o = null;
        }
        this.f7988m.removeOnAttachStateChangeListener(this.f7985j);
        C2475v c2475v = this.f7986k;
        if (c2475v != null) {
            c2475v.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int r2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || r2 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // p102k.AbstractC2474u
    /* renamed from: p */
    public final void mo4809p(int r12) {
        this.f7994s = r12;
    }

    @Override // p102k.AbstractC2474u
    /* renamed from: q */
    public final void mo4810q(int r2) {
        this.f7983h.f8234f = r2;
    }

    @Override // p102k.AbstractC2474u
    /* renamed from: r */
    public final void mo4811r(PopupWindow.OnDismissListener onDismissListener) {
        this.f7986k = (C2475v) onDismissListener;
    }

    @Override // p102k.AbstractC2474u
    /* renamed from: s */
    public final void mo4812s(boolean z2) {
        this.f7995t = z2;
    }

    @Override // p102k.AbstractC2474u
    /* renamed from: t */
    public final void mo4813t(int r2) {
        this.f7983h.m4950m(r2);
    }

    @Override // p102k.AbstractC2474u
    /* renamed from: l */
    public final void mo4806l(MenuC2466m menuC2466m) {
    }
}
