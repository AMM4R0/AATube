package androidx.fragment.app;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C0688L;
import androidx.lifecycle.C0710t;
import androidx.lifecycle.C0714x;
import androidx.lifecycle.EnumC0703m;
import androidx.lifecycle.InterfaceC0689M;
import androidx.lifecycle.InterfaceC0698h;
import androidx.lifecycle.InterfaceC0708r;
import com.carwizard.p075li.youtube.MainActivity;
import com.carwizard.p075li.youtube.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AbstractC2492i;
import p001A0.AbstractC0005b;
import p026J0.C0229j;
import p064Y.AbstractC0543b;
import p064Y.C0542a;
import p079e.AbstractActivityC0798g;
import p082f0.C0900d;
import p082f0.InterfaceC0901e;

/* renamed from: androidx.fragment.app.p */
/* loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC0666p implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC0708r, InterfaceC0689M, InterfaceC0698h, InterfaceC0901e {

    /* renamed from: Q */
    public static final Object f2295Q = new Object();

    /* renamed from: A */
    public boolean f2296A;

    /* renamed from: C */
    public boolean f2298C;

    /* renamed from: D */
    public ViewGroup f2299D;

    /* renamed from: E */
    public View f2300E;

    /* renamed from: F */
    public boolean f2301F;

    /* renamed from: H */
    public C0664n f2303H;

    /* renamed from: I */
    public boolean f2304I;

    /* renamed from: J */
    public boolean f2305J;

    /* renamed from: L */
    public C0710t f2307L;

    /* renamed from: M */
    public C0646M f2308M;

    /* renamed from: O */
    public C0229j f2310O;

    /* renamed from: P */
    public final ArrayList f2311P;

    /* renamed from: b */
    public Bundle f2313b;

    /* renamed from: c */
    public SparseArray f2314c;

    /* renamed from: d */
    public Bundle f2315d;

    /* renamed from: f */
    public Bundle f2317f;

    /* renamed from: g */
    public AbstractComponentCallbacksC0666p f2318g;

    /* renamed from: i */
    public int f2320i;

    /* renamed from: k */
    public boolean f2322k;

    /* renamed from: l */
    public boolean f2323l;

    /* renamed from: m */
    public boolean f2324m;

    /* renamed from: n */
    public boolean f2325n;

    /* renamed from: o */
    public boolean f2326o;

    /* renamed from: p */
    public boolean f2327p;

    /* renamed from: q */
    public int f2328q;

    /* renamed from: r */
    public C0638E f2329r;

    /* renamed from: s */
    public C0669s f2330s;

    /* renamed from: u */
    public AbstractComponentCallbacksC0666p f2332u;

    /* renamed from: v */
    public int f2333v;

    /* renamed from: w */
    public int f2334w;

    /* renamed from: x */
    public String f2335x;

    /* renamed from: y */
    public boolean f2336y;

    /* renamed from: z */
    public boolean f2337z;

    /* renamed from: a */
    public int f2312a = -1;

    /* renamed from: e */
    public String f2316e = UUID.randomUUID().toString();

    /* renamed from: h */
    public String f2319h = null;

    /* renamed from: j */
    public Boolean f2321j = null;

    /* renamed from: t */
    public C0638E f2331t = new C0638E();

    /* renamed from: B */
    public final boolean f2297B = true;

    /* renamed from: G */
    public boolean f2302G = true;

    /* renamed from: K */
    public EnumC0703m f2306K = EnumC0703m.f2409e;

    /* renamed from: N */
    public final C0714x f2309N = new C0714x();

    public AbstractComponentCallbacksC0666p() {
        new AtomicInteger();
        this.f2311P = new ArrayList();
        this.f2307L = new C0710t(this);
        this.f2310O = new C0229j(this);
    }

    @Override // androidx.lifecycle.InterfaceC0698h
    /* renamed from: a */
    public final AbstractC0543b mo1472a() {
        return C0542a.f1473b;
    }

    @Override // p082f0.InterfaceC0901e
    /* renamed from: b */
    public final C0900d mo1473b() {
        return (C0900d) this.f2310O.f665c;
    }

    /* renamed from: c */
    public AbstractC0005b mo1752c() {
        return new C0663m(this);
    }

    @Override // androidx.lifecycle.InterfaceC0689M
    /* renamed from: d */
    public final C0688L mo1474d() {
        if (this.f2329r == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (m1766i() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap hashMap = this.f2329r.f2124F.f2167e;
        C0688L c0688l = (C0688L) hashMap.get(this.f2316e);
        if (c0688l != null) {
            return c0688l;
        }
        C0688L c0688l2 = new C0688L();
        hashMap.put(this.f2316e, c0688l2);
        return c0688l2;
    }

    @Override // androidx.lifecycle.InterfaceC0708r
    /* renamed from: e */
    public final C0710t mo1475e() {
        return this.f2307L;
    }

    /* renamed from: f */
    public final C0664n m1763f() {
        if (this.f2303H == null) {
            C0664n c0664n = new C0664n();
            Object obj = f2295Q;
            c0664n.f2290g = obj;
            c0664n.f2291h = obj;
            c0664n.f2292i = obj;
            c0664n.f2293j = 1.0f;
            c0664n.f2294k = null;
            this.f2303H = c0664n;
        }
        return this.f2303H;
    }

    /* renamed from: g */
    public final C0638E m1764g() {
        if (this.f2330s != null) {
            return this.f2331t;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    /* renamed from: h */
    public final Context m1765h() {
        C0669s c0669s = this.f2330s;
        if (c0669s == null) {
            return null;
        }
        return c0669s.f2343e;
    }

    /* renamed from: i */
    public final int m1766i() {
        EnumC0703m enumC0703m = this.f2306K;
        return (enumC0703m == EnumC0703m.f2406b || this.f2332u == null) ? enumC0703m.ordinal() : Math.min(enumC0703m.ordinal(), this.f2332u.m1766i());
    }

    /* renamed from: j */
    public final C0638E m1767j() {
        C0638E c0638e = this.f2329r;
        if (c0638e != null) {
            return c0638e;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    /* renamed from: k */
    public void m1768k(int r4, int r5, Intent intent) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + r4 + " resultCode: " + r5 + " data: " + intent);
        }
    }

    /* renamed from: l */
    public void mo1753l(AbstractActivityC0798g abstractActivityC0798g) {
        this.f2298C = true;
        C0669s c0669s = this.f2330s;
        if ((c0669s == null ? null : c0669s.f2342d) != null) {
            this.f2298C = true;
        }
    }

    /* renamed from: m */
    public void mo1754m(Bundle bundle) {
        Parcelable parcelable;
        this.f2298C = true;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.f2331t.m1666M(parcelable);
            C0638E c0638e = this.f2331t;
            c0638e.f2150y = false;
            c0638e.f2151z = false;
            c0638e.f2124F.f2170h = false;
            c0638e.m1693s(1);
        }
        C0638E c0638e2 = this.f2331t;
        if (c0638e2.f2138m >= 1) {
            return;
        }
        c0638e2.f2150y = false;
        c0638e2.f2151z = false;
        c0638e2.f2124F.f2170h = false;
        c0638e2.m1693s(1);
    }

    /* renamed from: n */
    public View mo1769n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* renamed from: o */
    public void mo1755o() {
        this.f2298C = true;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f2298C = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C0669s c0669s = this.f2330s;
        AbstractActivityC0798g abstractActivityC0798g = c0669s == null ? null : c0669s.f2342d;
        if (abstractActivityC0798g != null) {
            abstractActivityC0798g.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f2298C = true;
    }

    /* renamed from: p */
    public void mo1756p() {
        this.f2298C = true;
    }

    /* renamed from: q */
    public LayoutInflater mo1757q(Bundle bundle) {
        C0669s c0669s = this.f2330s;
        if (c0669s == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        MainActivity mainActivity = c0669s.f2346h;
        LayoutInflater cloneInContext = mainActivity.getLayoutInflater().cloneInContext(mainActivity);
        cloneInContext.setFactory2(this.f2331t.f2131f);
        return cloneInContext;
    }

    /* renamed from: r */
    public abstract void mo1758r(Bundle bundle);

    /* renamed from: s */
    public void mo1759s() {
        this.f2298C = true;
    }

    /* renamed from: t */
    public void mo1760t() {
        this.f2298C = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f2316e);
        if (this.f2333v != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f2333v));
        }
        if (this.f2335x != null) {
            sb.append(" tag=");
            sb.append(this.f2335x);
        }
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: u */
    public void mo1761u(Bundle bundle) {
        this.f2298C = true;
    }

    /* renamed from: v */
    public void mo1762v(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f2331t.m1661H();
        this.f2327p = true;
        this.f2308M = new C0646M(mo1474d());
        View mo1769n = mo1769n(layoutInflater, viewGroup);
        this.f2300E = mo1769n;
        if (mo1769n == null) {
            if (this.f2308M.f2200b != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f2308M = null;
            return;
        }
        this.f2308M.m1725f();
        View view = this.f2300E;
        C0646M c0646m = this.f2308M;
        AbstractC2492i.m4915e(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, c0646m);
        View view2 = this.f2300E;
        C0646M c0646m2 = this.f2308M;
        AbstractC2492i.m4915e(view2, "<this>");
        view2.setTag(R.id.view_tree_view_model_store_owner, c0646m2);
        View view3 = this.f2300E;
        C0646M c0646m3 = this.f2308M;
        AbstractC2492i.m4915e(view3, "<this>");
        view3.setTag(R.id.view_tree_saved_state_registry_owner, c0646m3);
        this.f2309N.m1806e(this.f2308M);
    }

    /* renamed from: w */
    public final Context m1770w() {
        Context m1765h = m1765h();
        if (m1765h != null) {
            return m1765h;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    /* renamed from: x */
    public final View m1771x() {
        View view = this.f2300E;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    /* renamed from: y */
    public final void m1772y(int r2, int r3, int r4, int r5) {
        if (this.f2303H == null && r2 == 0 && r3 == 0 && r4 == 0 && r5 == 0) {
            return;
        }
        m1763f().f2285b = r2;
        m1763f().f2286c = r3;
        m1763f().f2287d = r4;
        m1763f().f2288e = r5;
    }

    /* renamed from: z */
    public final void m1773z(Bundle bundle) {
        C0638E c0638e = this.f2329r;
        if (c0638e != null && (c0638e.f2150y || c0638e.f2151z)) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f2317f = bundle;
    }
}
