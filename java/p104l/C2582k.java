package p104l;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.carwizard.p075li.youtube.R;
import java.util.ArrayList;
import p102k.AbstractC2474u;
import p102k.ActionProviderVisibilityListenerC2469p;
import p102k.C2468o;
import p102k.InterfaceC2448A;
import p102k.InterfaceC2449B;
import p102k.InterfaceC2478y;
import p102k.InterfaceC2479z;
import p102k.MenuC2466m;
import p102k.SubMenuC2453F;

/* renamed from: l.k */
/* loaded from: classes.dex */
public final class C2582k implements InterfaceC2479z {

    /* renamed from: a */
    public final Context f8383a;

    /* renamed from: b */
    public Context f8384b;

    /* renamed from: c */
    public MenuC2466m f8385c;

    /* renamed from: d */
    public final LayoutInflater f8386d;

    /* renamed from: e */
    public InterfaceC2478y f8387e;

    /* renamed from: h */
    public InterfaceC2449B f8390h;

    /* renamed from: i */
    public C2576i f8391i;

    /* renamed from: j */
    public Drawable f8392j;

    /* renamed from: k */
    public boolean f8393k;

    /* renamed from: l */
    public boolean f8394l;

    /* renamed from: m */
    public boolean f8395m;

    /* renamed from: n */
    public int f8396n;

    /* renamed from: o */
    public int f8397o;

    /* renamed from: p */
    public int f8398p;

    /* renamed from: q */
    public boolean f8399q;

    /* renamed from: s */
    public C2567f f8401s;

    /* renamed from: t */
    public C2567f f8402t;

    /* renamed from: u */
    public RunnableC2573h f8403u;

    /* renamed from: v */
    public C2570g f8404v;

    /* renamed from: f */
    public final int f8388f = R.layout.abc_action_menu_layout;

    /* renamed from: g */
    public final int f8389g = R.layout.abc_action_menu_item_layout;

    /* renamed from: r */
    public final SparseBooleanArray f8400r = new SparseBooleanArray();

    /* renamed from: w */
    public final C2579j f8405w = new C2579j(this);

    public C2582k(Context context) {
        this.f8383a = context;
        this.f8386d = LayoutInflater.from(context);
    }

    @Override // p102k.InterfaceC2479z
    /* renamed from: a */
    public final void mo4801a(MenuC2466m menuC2466m, boolean z2) {
        m5037f();
        C2567f c2567f = this.f8402t;
        if (c2567f != null && c2567f.m4859b()) {
            c2567f.f8141i.dismiss();
        }
        InterfaceC2478y interfaceC2478y = this.f8387e;
        if (interfaceC2478y != null) {
            interfaceC2478y.mo2226a(menuC2466m, z2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [k.A] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* renamed from: b */
    public final View m5036b(C2468o c2468o, View view, ViewGroup viewGroup) {
        View actionView = c2468o.getActionView();
        if (actionView == null || c2468o.m4851e()) {
            ActionMenuItemView actionMenuItemView = view instanceof InterfaceC2448A ? (InterfaceC2448A) view : (InterfaceC2448A) this.f8386d.inflate(this.f8389g, viewGroup, false);
            actionMenuItemView.mo1488c(c2468o);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.f8390h);
            if (this.f8404v == null) {
                this.f8404v = new C2570g(this);
            }
            actionMenuItemView2.setPopupCallback(this.f8404v);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(c2468o.f8094C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C2588m)) {
            actionView.setLayoutParams(ActionMenuView.m1509m(layoutParams));
        }
        return actionView;
    }

    @Override // p102k.InterfaceC2479z
    /* renamed from: c */
    public final boolean mo4829c(C2468o c2468o) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p102k.InterfaceC2479z
    /* renamed from: d */
    public final boolean mo4802d(SubMenuC2453F subMenuC2453F) {
        boolean z2;
        if (!subMenuC2453F.hasVisibleItems()) {
            return false;
        }
        SubMenuC2453F subMenuC2453F2 = subMenuC2453F;
        while (true) {
            MenuC2466m menuC2466m = subMenuC2453F2.f7997z;
            if (menuC2466m == this.f8385c) {
                break;
            }
            subMenuC2453F2 = (SubMenuC2453F) menuC2466m;
        }
        ViewGroup viewGroup = (ViewGroup) this.f8390h;
        View view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int r5 = 0;
            while (true) {
                if (r5 >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(r5);
                if ((childAt instanceof InterfaceC2448A) && ((InterfaceC2448A) childAt).getItemData() == subMenuC2453F2.f7996A) {
                    view = childAt;
                    break;
                }
                r5++;
            }
        }
        if (view == null) {
            return false;
        }
        subMenuC2453F.f7996A.getClass();
        int size = subMenuC2453F.f8070f.size();
        int r2 = 0;
        while (true) {
            if (r2 >= size) {
                z2 = false;
                break;
            }
            MenuItem item = subMenuC2453F.getItem(r2);
            if (item.isVisible() && item.getIcon() != null) {
                z2 = true;
                break;
            }
            r2++;
        }
        C2567f c2567f = new C2567f(this, this.f8384b, subMenuC2453F, view);
        this.f8402t = c2567f;
        c2567f.f8139g = z2;
        AbstractC2474u abstractC2474u = c2567f.f8141i;
        if (abstractC2474u != null) {
            abstractC2474u.mo4808o(z2);
        }
        C2567f c2567f2 = this.f8402t;
        if (!c2567f2.m4859b()) {
            if (c2567f2.f8137e == null) {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
            c2567f2.m4861d(0, 0, false, false);
        }
        InterfaceC2478y interfaceC2478y = this.f8387e;
        if (interfaceC2478y != null) {
            interfaceC2478y.mo2227b(subMenuC2453F);
        }
        return true;
    }

    @Override // p102k.InterfaceC2479z
    /* renamed from: e */
    public final boolean mo4830e(C2468o c2468o) {
        return false;
    }

    /* renamed from: f */
    public final boolean m5037f() {
        Object obj;
        RunnableC2573h runnableC2573h = this.f8403u;
        if (runnableC2573h != null && (obj = this.f8390h) != null) {
            ((View) obj).removeCallbacks(runnableC2573h);
            this.f8403u = null;
            return true;
        }
        C2567f c2567f = this.f8401s;
        if (c2567f == null) {
            return false;
        }
        if (c2567f.m4859b()) {
            c2567f.f8141i.dismiss();
        }
        return true;
    }

    @Override // p102k.InterfaceC2479z
    /* renamed from: g */
    public final void mo4831g(Context context, MenuC2466m menuC2466m) {
        this.f8384b = context;
        LayoutInflater.from(context);
        this.f8385c = menuC2466m;
        Resources resources = context.getResources();
        if (!this.f8395m) {
            this.f8394l = true;
        }
        int r12 = 2;
        this.f8396n = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int r02 = configuration.screenWidthDp;
        int r2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || r02 > 600 || ((r02 > 960 && r2 > 720) || (r02 > 720 && r2 > 960))) {
            r12 = 5;
        } else if (r02 >= 500 || ((r02 > 640 && r2 > 480) || (r02 > 480 && r2 > 640))) {
            r12 = 4;
        } else if (r02 >= 360) {
            r12 = 3;
        }
        this.f8398p = r12;
        int r5 = this.f8396n;
        if (this.f8394l) {
            if (this.f8391i == null) {
                C2576i c2576i = new C2576i(this, this.f8383a);
                this.f8391i = c2576i;
                if (this.f8393k) {
                    c2576i.setImageDrawable(this.f8392j);
                    this.f8392j = null;
                    this.f8393k = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f8391i.measure(makeMeasureSpec, makeMeasureSpec);
            }
            r5 -= this.f8391i.getMeasuredWidth();
        } else {
            this.f8391i = null;
        }
        this.f8397o = r5;
        float f = resources.getDisplayMetrics().density;
    }

    @Override // p102k.InterfaceC2479z
    /* renamed from: h */
    public final boolean mo4803h() {
        int r4;
        ArrayList arrayList;
        int r13;
        boolean z2;
        MenuC2466m menuC2466m = this.f8385c;
        if (menuC2466m != null) {
            arrayList = menuC2466m.m4840l();
            r4 = arrayList.size();
        } else {
            r4 = 0;
            arrayList = null;
        }
        int r5 = this.f8398p;
        int r6 = this.f8397o;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f8390h;
        int r9 = 0;
        boolean z3 = false;
        int r11 = 0;
        int r12 = 0;
        while (true) {
            r13 = 2;
            z2 = true;
            if (r9 >= r4) {
                break;
            }
            C2468o c2468o = (C2468o) arrayList.get(r9);
            int r3 = c2468o.f8119y;
            if ((r3 & 2) == 2) {
                r11++;
            } else if ((r3 & 1) == 1) {
                r12++;
            } else {
                z3 = true;
            }
            if (this.f8399q && c2468o.f8094C) {
                r5 = 0;
            }
            r9++;
        }
        if (this.f8394l && (z3 || r12 + r11 > r5)) {
            r5--;
        }
        int r52 = r5 - r11;
        SparseBooleanArray sparseBooleanArray = this.f8400r;
        sparseBooleanArray.clear();
        int r32 = 0;
        int r92 = 0;
        while (r32 < r4) {
            C2468o c2468o2 = (C2468o) arrayList.get(r32);
            int r112 = c2468o2.f8119y;
            boolean z4 = (r112 & 2) == r13 ? z2 : false;
            int r15 = c2468o2.f8096b;
            if (z4) {
                View m5036b = m5036b(c2468o2, null, viewGroup);
                m5036b.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = m5036b.getMeasuredWidth();
                r6 -= measuredWidth;
                if (r92 == 0) {
                    r92 = measuredWidth;
                }
                if (r15 != 0) {
                    sparseBooleanArray.put(r15, z2);
                }
                c2468o2.m4853g(z2);
            } else if ((r112 & 1) == z2) {
                boolean z5 = sparseBooleanArray.get(r15);
                boolean z6 = ((r52 > 0 || z5) && r6 > 0) ? z2 : false;
                if (z6) {
                    View m5036b2 = m5036b(c2468o2, null, viewGroup);
                    m5036b2.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = m5036b2.getMeasuredWidth();
                    r6 -= measuredWidth2;
                    if (r92 == 0) {
                        r92 = measuredWidth2;
                    }
                    z6 &= r6 + r92 > 0;
                }
                if (z6 && r15 != 0) {
                    sparseBooleanArray.put(r15, true);
                } else if (z5) {
                    sparseBooleanArray.put(r15, false);
                    for (int r113 = 0; r113 < r32; r113++) {
                        C2468o c2468o3 = (C2468o) arrayList.get(r113);
                        if (c2468o3.f8096b == r15) {
                            if (c2468o3.m4852f()) {
                                r52++;
                            }
                            c2468o3.m4853g(false);
                        }
                    }
                }
                if (z6) {
                    r52--;
                }
                c2468o2.m4853g(z6);
            } else {
                c2468o2.m4853g(false);
                r32++;
                r13 = 2;
                z2 = true;
            }
            r32++;
            r13 = 2;
            z2 = true;
        }
        return z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p102k.InterfaceC2479z
    /* renamed from: i */
    public final void mo4804i() {
        int r6;
        ViewGroup viewGroup = (ViewGroup) this.f8390h;
        ArrayList arrayList = null;
        boolean z2 = false;
        if (viewGroup != null) {
            MenuC2466m menuC2466m = this.f8385c;
            if (menuC2466m != null) {
                menuC2466m.m4839i();
                ArrayList m4840l = this.f8385c.m4840l();
                int size = m4840l.size();
                r6 = 0;
                for (int r5 = 0; r5 < size; r5++) {
                    C2468o c2468o = (C2468o) m4840l.get(r5);
                    if (c2468o.m4852f()) {
                        View childAt = viewGroup.getChildAt(r6);
                        C2468o itemData = childAt instanceof InterfaceC2448A ? ((InterfaceC2448A) childAt).getItemData() : null;
                        View m5036b = m5036b(c2468o, childAt, viewGroup);
                        if (c2468o != itemData) {
                            m5036b.setPressed(false);
                            m5036b.jumpDrawablesToCurrentState();
                        }
                        if (m5036b != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) m5036b.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(m5036b);
                            }
                            ((ViewGroup) this.f8390h).addView(m5036b, r6);
                        }
                        r6++;
                    }
                }
            } else {
                r6 = 0;
            }
            while (r6 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(r6) == this.f8391i) {
                    r6++;
                } else {
                    viewGroup.removeViewAt(r6);
                }
            }
        }
        ((View) this.f8390h).requestLayout();
        MenuC2466m menuC2466m2 = this.f8385c;
        if (menuC2466m2 != null) {
            menuC2466m2.m4839i();
            ArrayList arrayList2 = menuC2466m2.f8073i;
            int size2 = arrayList2.size();
            for (int r4 = 0; r4 < size2; r4++) {
                ActionProviderVisibilityListenerC2469p actionProviderVisibilityListenerC2469p = ((C2468o) arrayList2.get(r4)).f8092A;
            }
        }
        MenuC2466m menuC2466m3 = this.f8385c;
        if (menuC2466m3 != null) {
            menuC2466m3.m4839i();
            arrayList = menuC2466m3.f8074j;
        }
        if (this.f8394l && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z2 = !((C2468o) arrayList.get(0)).f8094C;
            } else if (size3 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.f8391i == null) {
                this.f8391i = new C2576i(this, this.f8383a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f8391i.getParent();
            if (viewGroup3 != this.f8390h) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f8391i);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f8390h;
                C2576i c2576i = this.f8391i;
                actionMenuView.getClass();
                C2588m m1508l = ActionMenuView.m1508l();
                m1508l.f8424a = true;
                actionMenuView.addView(c2576i, m1508l);
            }
        } else {
            C2576i c2576i2 = this.f8391i;
            if (c2576i2 != null) {
                Object parent = c2576i2.getParent();
                Object obj = this.f8390h;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f8391i);
                }
            }
        }
        ((ActionMenuView) this.f8390h).setOverflowReserved(this.f8394l);
    }

    /* renamed from: j */
    public final boolean m5038j() {
        C2567f c2567f = this.f8401s;
        return c2567f != null && c2567f.m4859b();
    }

    @Override // p102k.InterfaceC2479z
    /* renamed from: k */
    public final void mo4805k(InterfaceC2478y interfaceC2478y) {
        throw null;
    }

    /* renamed from: l */
    public final boolean m5039l() {
        MenuC2466m menuC2466m;
        if (!this.f8394l || m5038j() || (menuC2466m = this.f8385c) == null || this.f8390h == null || this.f8403u != null) {
            return false;
        }
        menuC2466m.m4839i();
        if (menuC2466m.f8074j.isEmpty()) {
            return false;
        }
        RunnableC2573h runnableC2573h = new RunnableC2573h(this, new C2567f(this, this.f8384b, this.f8385c, this.f8391i));
        this.f8403u = runnableC2573h;
        ((View) this.f8390h).post(runnableC2573h);
        return true;
    }
}
