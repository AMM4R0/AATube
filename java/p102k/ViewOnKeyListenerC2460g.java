package p102k;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.fragment.app.ViewOnAttachStateChangeListenerC0643J;
import com.carwizard.p075li.youtube.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p006C.C0055g;
import p028K.AbstractC0283P;
import p104l.AbstractC2524L0;
import p104l.C2532P0;
import p104l.C2622x0;

/* renamed from: k.g */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC2460g extends AbstractC2474u implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: b */
    public final Context f8025b;

    /* renamed from: c */
    public final int f8026c;

    /* renamed from: d */
    public final int f8027d;

    /* renamed from: e */
    public final boolean f8028e;

    /* renamed from: f */
    public final Handler f8029f;

    /* renamed from: n */
    public View f8037n;

    /* renamed from: o */
    public View f8038o;

    /* renamed from: p */
    public int f8039p;

    /* renamed from: q */
    public boolean f8040q;

    /* renamed from: r */
    public boolean f8041r;

    /* renamed from: s */
    public int f8042s;

    /* renamed from: t */
    public int f8043t;

    /* renamed from: v */
    public boolean f8045v;

    /* renamed from: w */
    public InterfaceC2478y f8046w;

    /* renamed from: x */
    public ViewTreeObserver f8047x;

    /* renamed from: y */
    public C2475v f8048y;

    /* renamed from: z */
    public boolean f8049z;

    /* renamed from: g */
    public final ArrayList f8030g = new ArrayList();

    /* renamed from: h */
    public final ArrayList f8031h = new ArrayList();

    /* renamed from: i */
    public final ViewTreeObserverOnGlobalLayoutListenerC2457d f8032i = new ViewTreeObserverOnGlobalLayoutListenerC2457d(0, this);

    /* renamed from: j */
    public final ViewOnAttachStateChangeListenerC0643J f8033j = new ViewOnAttachStateChangeListenerC0643J(2, this);

    /* renamed from: k */
    public final C0055g f8034k = new C0055g(28, this);

    /* renamed from: l */
    public int f8035l = 0;

    /* renamed from: m */
    public int f8036m = 0;

    /* renamed from: u */
    public boolean f8044u = false;

    public ViewOnKeyListenerC2460g(Context context, View view, int r7, boolean z2) {
        this.f8025b = context;
        this.f8037n = view;
        this.f8027d = r7;
        this.f8028e = z2;
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        this.f8039p = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f8026c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f8029f = new Handler();
    }

    @Override // p102k.InterfaceC2479z
    /* renamed from: a */
    public final void mo4801a(MenuC2466m menuC2466m, boolean z2) {
        ArrayList arrayList = this.f8031h;
        int size = arrayList.size();
        int r4 = 0;
        while (true) {
            if (r4 >= size) {
                r4 = -1;
                break;
            } else if (menuC2466m == ((C2459f) arrayList.get(r4)).f8023b) {
                break;
            } else {
                r4++;
            }
        }
        if (r4 < 0) {
            return;
        }
        int r2 = r4 + 1;
        if (r2 < arrayList.size()) {
            ((C2459f) arrayList.get(r2)).f8023b.m4836c(false);
        }
        C2459f c2459f = (C2459f) arrayList.remove(r4);
        c2459f.f8023b.m4843r(this);
        boolean z3 = this.f8049z;
        C2532P0 c2532p0 = c2459f.f8022a;
        if (z3) {
            AbstractC2524L0.m4967b(c2532p0.f8254z, null);
            c2532p0.f8254z.setAnimationStyle(0);
        }
        c2532p0.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f8039p = ((C2459f) arrayList.get(size2 - 1)).f8024c;
        } else {
            View view = this.f8037n;
            WeakHashMap weakHashMap = AbstractC0283P.f842a;
            this.f8039p = view.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z2) {
                ((C2459f) arrayList.get(0)).f8023b.m4836c(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC2478y interfaceC2478y = this.f8046w;
        if (interfaceC2478y != null) {
            interfaceC2478y.mo2226a(menuC2466m, true);
        }
        ViewTreeObserver viewTreeObserver = this.f8047x;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f8047x.removeGlobalOnLayoutListener(this.f8032i);
            }
            this.f8047x = null;
        }
        this.f8038o.removeOnAttachStateChangeListener(this.f8033j);
        this.f8048y.onDismiss();
    }

    @Override // p102k.InterfaceC2451D
    /* renamed from: b */
    public final boolean mo4798b() {
        ArrayList arrayList = this.f8031h;
        return arrayList.size() > 0 && ((C2459f) arrayList.get(0)).f8022a.f8254z.isShowing();
    }

    @Override // p102k.InterfaceC2479z
    /* renamed from: d */
    public final boolean mo4802d(SubMenuC2453F subMenuC2453F) {
        Iterator it = this.f8031h.iterator();
        while (it.hasNext()) {
            C2459f c2459f = (C2459f) it.next();
            if (subMenuC2453F == c2459f.f8023b) {
                c2459f.f8022a.f8231c.requestFocus();
                return true;
            }
        }
        if (!subMenuC2453F.hasVisibleItems()) {
            return false;
        }
        mo4806l(subMenuC2453F);
        InterfaceC2478y interfaceC2478y = this.f8046w;
        if (interfaceC2478y != null) {
            interfaceC2478y.mo2227b(subMenuC2453F);
        }
        return true;
    }

    @Override // p102k.InterfaceC2451D
    public final void dismiss() {
        ArrayList arrayList = this.f8031h;
        int size = arrayList.size();
        if (size > 0) {
            C2459f[] c2459fArr = (C2459f[]) arrayList.toArray(new C2459f[size]);
            for (int r12 = size - 1; r12 >= 0; r12--) {
                C2459f c2459f = c2459fArr[r12];
                if (c2459f.f8022a.f8254z.isShowing()) {
                    c2459f.f8022a.dismiss();
                }
            }
        }
    }

    @Override // p102k.InterfaceC2451D
    /* renamed from: f */
    public final void mo4799f() {
        if (mo4798b()) {
            return;
        }
        ArrayList arrayList = this.f8030g;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m4826v((MenuC2466m) it.next());
        }
        arrayList.clear();
        View view = this.f8037n;
        this.f8038o = view;
        if (view != null) {
            boolean z2 = this.f8047x == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f8047x = viewTreeObserver;
            if (z2) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f8032i);
            }
            this.f8038o.addOnAttachStateChangeListener(this.f8033j);
        }
    }

    @Override // p102k.InterfaceC2479z
    /* renamed from: h */
    public final boolean mo4803h() {
        return false;
    }

    @Override // p102k.InterfaceC2479z
    /* renamed from: i */
    public final void mo4804i() {
        Iterator it = this.f8031h.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C2459f) it.next()).f8022a.f8231c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C2463j) adapter).notifyDataSetChanged();
        }
    }

    @Override // p102k.InterfaceC2451D
    /* renamed from: j */
    public final C2622x0 mo4800j() {
        ArrayList arrayList = this.f8031h;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C2459f) arrayList.get(arrayList.size() - 1)).f8022a.f8231c;
    }

    @Override // p102k.InterfaceC2479z
    /* renamed from: k */
    public final void mo4805k(InterfaceC2478y interfaceC2478y) {
        this.f8046w = interfaceC2478y;
    }

    @Override // p102k.AbstractC2474u
    /* renamed from: l */
    public final void mo4806l(MenuC2466m menuC2466m) {
        menuC2466m.m4835b(this, this.f8025b);
        if (mo4798b()) {
            m4826v(menuC2466m);
        } else {
            this.f8030g.add(menuC2466m);
        }
    }

    @Override // p102k.AbstractC2474u
    /* renamed from: n */
    public final void mo4807n(View view) {
        if (this.f8037n != view) {
            this.f8037n = view;
            int r02 = this.f8035l;
            WeakHashMap weakHashMap = AbstractC0283P.f842a;
            this.f8036m = Gravity.getAbsoluteGravity(r02, view.getLayoutDirection());
        }
    }

    @Override // p102k.AbstractC2474u
    /* renamed from: o */
    public final void mo4808o(boolean z2) {
        this.f8044u = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C2459f c2459f;
        ArrayList arrayList = this.f8031h;
        int size = arrayList.size();
        int r3 = 0;
        while (true) {
            if (r3 >= size) {
                c2459f = null;
                break;
            }
            c2459f = (C2459f) arrayList.get(r3);
            if (!c2459f.f8022a.f8254z.isShowing()) {
                break;
            } else {
                r3++;
            }
        }
        if (c2459f != null) {
            c2459f.f8023b.m4836c(false);
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
    public final void mo4809p(int r3) {
        if (this.f8035l != r3) {
            this.f8035l = r3;
            View view = this.f8037n;
            WeakHashMap weakHashMap = AbstractC0283P.f842a;
            this.f8036m = Gravity.getAbsoluteGravity(r3, view.getLayoutDirection());
        }
    }

    @Override // p102k.AbstractC2474u
    /* renamed from: q */
    public final void mo4810q(int r2) {
        this.f8040q = true;
        this.f8042s = r2;
    }

    @Override // p102k.AbstractC2474u
    /* renamed from: r */
    public final void mo4811r(PopupWindow.OnDismissListener onDismissListener) {
        this.f8048y = (C2475v) onDismissListener;
    }

    @Override // p102k.AbstractC2474u
    /* renamed from: s */
    public final void mo4812s(boolean z2) {
        this.f8045v = z2;
    }

    @Override // p102k.AbstractC2474u
    /* renamed from: t */
    public final void mo4813t(int r2) {
        this.f8041r = true;
        this.f8043t = r2;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014d  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m4826v(p102k.MenuC2466m r19) {
        /*
            Method dump skipped, instructions count: 528
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p102k.ViewOnKeyListenerC2460g.m4826v(k.m):void");
    }
}
