package p104l;

import android.os.Parcel;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p000A.AbstractC0002c;
import p013E0.AbstractC0125b;
import p026J0.C0224e;
import p028K.AbstractC0283P;
import p028K.C0336v0;
import p028K.C0340x0;
import p028K.InterfaceC0325q;
import p102k.InterfaceC2464k;
import p102k.InterfaceC2478y;
import p102k.MenuC2466m;
import p102k.SubMenuC2453F;
import p130u0.InterfaceC2784h;
import p133v0.C2854i;
import p138x.C2882d;
import p139x0.C2886a;
import p139x0.C2888c;

/* renamed from: l.j */
/* loaded from: classes.dex */
public class C2579j implements InterfaceC2478y, InterfaceC2464k, InterfaceC2556b0, InterfaceC0325q, InterfaceC2784h {

    /* renamed from: a */
    public final /* synthetic */ Object f8381a;

    public /* synthetic */ C2579j(Object obj) {
        this.f8381a = obj;
    }

    @Override // p102k.InterfaceC2478y
    /* renamed from: a */
    public void mo2226a(MenuC2466m menuC2466m, boolean z2) {
        if (menuC2466m instanceof SubMenuC2453F) {
            ((SubMenuC2453F) menuC2466m).f7997z.mo4818k().m4836c(false);
        }
        InterfaceC2478y interfaceC2478y = ((C2582k) this.f8381a).f8387e;
        if (interfaceC2478y != null) {
            interfaceC2478y.mo2226a(menuC2466m, z2);
        }
    }

    @Override // p102k.InterfaceC2478y
    /* renamed from: b */
    public boolean mo2227b(MenuC2466m menuC2466m) {
        C2582k c2582k = (C2582k) this.f8381a;
        if (menuC2466m == c2582k.f8385c) {
            return false;
        }
        ((SubMenuC2453F) menuC2466m).f7996A.getClass();
        c2582k.getClass();
        InterfaceC2478y interfaceC2478y = c2582k.f8387e;
        if (interfaceC2478y != null) {
            return interfaceC2478y.mo2227b(menuC2466m);
        }
        return false;
    }

    @Override // p028K.InterfaceC0325q
    /* renamed from: c */
    public C0340x0 mo353c(View view, C0340x0 c0340x0) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f8381a;
        if (!Objects.equals(coordinatorLayout.f2004n, c0340x0)) {
            coordinatorLayout.f2004n = c0340x0;
            boolean z2 = c0340x0.m979d() > 0;
            coordinatorLayout.f2005o = z2;
            coordinatorLayout.setWillNotDraw(!z2 && coordinatorLayout.getBackground() == null);
            C0336v0 c0336v0 = c0340x0.f944a;
            if (!c0336v0.mo961m()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int r2 = 0; r2 < childCount; r2++) {
                    View childAt = coordinatorLayout.getChildAt(r2);
                    WeakHashMap weakHashMap = AbstractC0283P.f842a;
                    if (childAt.getFitsSystemWindows() && ((C2882d) childAt.getLayoutParams()).f9490a != null && c0336v0.mo961m()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return c0340x0;
    }

    @Override // p102k.InterfaceC2464k
    /* renamed from: d */
    public boolean mo2173d(MenuC2466m menuC2466m, MenuItem menuItem) {
        InterfaceC2591n interfaceC2591n = ((ActionMenuView) this.f8381a).f1814z;
        if (interfaceC2591n == null) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) ((C2590m1) interfaceC2591n).f8430a.f1923G.f339c).iterator();
        if (it.hasNext()) {
            throw AbstractC0002c.m10e(it);
        }
        return false;
    }

    @Override // p102k.InterfaceC2464k
    /* renamed from: g */
    public void mo2176g(MenuC2466m menuC2466m) {
        C2590m1 c2590m1 = ((ActionMenuView) this.f8381a).f1809u;
        if (c2590m1 != null) {
            c2590m1.mo2176g(menuC2466m);
        }
    }

    @Override // p130u0.InterfaceC2784h
    /* renamed from: h */
    public void mo5034h(Object obj, Object obj2) {
        C0224e c0224e = (C0224e) obj2;
        C2886a c2886a = (C2886a) ((C2888c) obj).m2040q();
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(c2886a.f372c);
        int r12 = AbstractC0125b.f373a;
        C2854i c2854i = (C2854i) this.f8381a;
        if (c2854i == null) {
            obtain.writeInt(0);
        } else {
            obtain.writeInt(1);
            c2854i.writeToParcel(obtain, 0);
        }
        try {
            c2886a.f371a.transact(1, obtain, null, 1);
            obtain.recycle();
            c0224e.f652a.m626f(null);
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    /* renamed from: e */
    public void mo5014e(int r12) {
    }

    /* renamed from: f */
    public void mo5015f(int r12) {
    }
}
