package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.C0688L;
import androidx.lifecycle.C0710t;
import androidx.lifecycle.EnumC0702l;
import androidx.lifecycle.EnumC0703m;
import androidx.lifecycle.InterfaceC0689M;
import androidx.lifecycle.InterfaceC0706p;
import androidx.lifecycle.InterfaceC0708r;
import com.carwizard.p075li.youtube.R;
import io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import java.util.WeakHashMap;
import p000A.AbstractC0002c;
import p002A1.C0015h;
import p010D0.C0109g;
import p010D0.C0113k;
import p026J0.C0229j;
import p028K.AbstractC0270C;
import p028K.AbstractC0283P;
import p066Z.C0559a;
import p079e.AbstractActivityC0798g;
import p112o.C2692l;

/* renamed from: androidx.fragment.app.K */
/* loaded from: classes.dex */
public final class C0644K {

    /* renamed from: a */
    public final C0109g f2186a;

    /* renamed from: b */
    public final C0015h f2187b;

    /* renamed from: c */
    public final AbstractComponentCallbacksC0666p f2188c;

    /* renamed from: d */
    public boolean f2189d = false;

    /* renamed from: e */
    public int f2190e = -1;

    public C0644K(C0109g c0109g, C0015h c0015h, AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p) {
        this.f2186a = c0109g;
        this.f2187b = c0015h;
        this.f2188c = abstractComponentCallbacksC0666p;
    }

    /* renamed from: a */
    public final void m1707a() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p = this.f2188c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + abstractComponentCallbacksC0666p);
        }
        Bundle bundle = abstractComponentCallbacksC0666p.f2313b;
        abstractComponentCallbacksC0666p.f2331t.m1661H();
        abstractComponentCallbacksC0666p.f2312a = 3;
        abstractComponentCallbacksC0666p.f2298C = true;
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + abstractComponentCallbacksC0666p);
        }
        View view = abstractComponentCallbacksC0666p.f2300E;
        if (view != null) {
            Bundle bundle2 = abstractComponentCallbacksC0666p.f2313b;
            SparseArray<Parcelable> sparseArray = abstractComponentCallbacksC0666p.f2314c;
            if (sparseArray != null) {
                view.restoreHierarchyState(sparseArray);
                abstractComponentCallbacksC0666p.f2314c = null;
            }
            if (abstractComponentCallbacksC0666p.f2300E != null) {
                abstractComponentCallbacksC0666p.f2308M.f2201c.m617b(abstractComponentCallbacksC0666p.f2315d);
                abstractComponentCallbacksC0666p.f2315d = null;
            }
            abstractComponentCallbacksC0666p.f2298C = false;
            abstractComponentCallbacksC0666p.mo1761u(bundle2);
            if (!abstractComponentCallbacksC0666p.f2298C) {
                throw new C0650Q("Fragment " + abstractComponentCallbacksC0666p + " did not call through to super.onViewStateRestored()");
            }
            if (abstractComponentCallbacksC0666p.f2300E != null) {
                abstractComponentCallbacksC0666p.f2308M.m1724c(EnumC0702l.ON_CREATE);
            }
        }
        abstractComponentCallbacksC0666p.f2313b = null;
        C0638E c0638e = abstractComponentCallbacksC0666p.f2331t;
        c0638e.f2150y = false;
        c0638e.f2151z = false;
        c0638e.f2124F.f2170h = false;
        c0638e.m1693s(4);
        this.f2186a.m358i(false);
    }

    /* renamed from: b */
    public final void m1708b() {
        View view;
        View view2;
        C0015h c0015h = this.f2187b;
        c0015h.getClass();
        AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p = this.f2188c;
        ViewGroup viewGroup = abstractComponentCallbacksC0666p.f2299D;
        int r3 = -1;
        if (viewGroup != null) {
            ArrayList arrayList = (ArrayList) c0015h.f25b;
            int indexOf = arrayList.indexOf(abstractComponentCallbacksC0666p);
            int r5 = indexOf - 1;
            while (true) {
                if (r5 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p2 = (AbstractComponentCallbacksC0666p) arrayList.get(indexOf);
                        if (abstractComponentCallbacksC0666p2.f2299D == viewGroup && (view = abstractComponentCallbacksC0666p2.f2300E) != null) {
                            r3 = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p3 = (AbstractComponentCallbacksC0666p) arrayList.get(r5);
                    if (abstractComponentCallbacksC0666p3.f2299D == viewGroup && (view2 = abstractComponentCallbacksC0666p3.f2300E) != null) {
                        r3 = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    r5--;
                }
            }
        }
        abstractComponentCallbacksC0666p.f2299D.addView(abstractComponentCallbacksC0666p.f2300E, r3);
    }

    /* renamed from: c */
    public final void m1709c() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p = this.f2188c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto ATTACHED: " + abstractComponentCallbacksC0666p);
        }
        AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p2 = abstractComponentCallbacksC0666p.f2318g;
        C0015h c0015h = this.f2187b;
        C0644K c0644k = null;
        if (abstractComponentCallbacksC0666p2 != null) {
            C0644K c0644k2 = (C0644K) ((HashMap) c0015h.f26c).get(abstractComponentCallbacksC0666p2.f2316e);
            if (c0644k2 == null) {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0666p + " declared target fragment " + abstractComponentCallbacksC0666p.f2318g + " that does not belong to this FragmentManager!");
            }
            abstractComponentCallbacksC0666p.f2319h = abstractComponentCallbacksC0666p.f2318g.f2316e;
            abstractComponentCallbacksC0666p.f2318g = null;
            c0644k = c0644k2;
        } else {
            String str = abstractComponentCallbacksC0666p.f2319h;
            if (str != null && (c0644k = (C0644K) ((HashMap) c0015h.f26c).get(str)) == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(abstractComponentCallbacksC0666p);
                sb.append(" declared target fragment ");
                throw new IllegalStateException(AbstractC0002c.m17l(sb, abstractComponentCallbacksC0666p.f2319h, " that does not belong to this FragmentManager!"));
            }
        }
        if (c0644k != null) {
            c0644k.m1717k();
        }
        C0638E c0638e = abstractComponentCallbacksC0666p.f2329r;
        abstractComponentCallbacksC0666p.f2330s = c0638e.f2139n;
        abstractComponentCallbacksC0666p.f2332u = c0638e.f2141p;
        C0109g c0109g = this.f2186a;
        c0109g.m364o(false);
        ArrayList arrayList = abstractComponentCallbacksC0666p.f2311P;
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw AbstractC0002c.m10e(it);
        }
        arrayList.clear();
        abstractComponentCallbacksC0666p.f2331t.m1676b(abstractComponentCallbacksC0666p.f2330s, abstractComponentCallbacksC0666p.mo1752c(), abstractComponentCallbacksC0666p);
        abstractComponentCallbacksC0666p.f2312a = 0;
        abstractComponentCallbacksC0666p.f2298C = false;
        abstractComponentCallbacksC0666p.mo1753l(abstractComponentCallbacksC0666p.f2330s.f2343e);
        if (!abstractComponentCallbacksC0666p.f2298C) {
            throw new C0650Q("Fragment " + abstractComponentCallbacksC0666p + " did not call through to super.onAttach()");
        }
        Iterator it2 = abstractComponentCallbacksC0666p.f2329r.f2137l.iterator();
        while (it2.hasNext()) {
            ((InterfaceC0641H) it2.next()).mo1703a();
        }
        C0638E c0638e2 = abstractComponentCallbacksC0666p.f2331t;
        c0638e2.f2150y = false;
        c0638e2.f2151z = false;
        c0638e2.f2124F.f2170h = false;
        c0638e2.m1693s(0);
        c0109g.m359j(false);
    }

    /* renamed from: d */
    public final int m1710d() {
        C0649P c0649p;
        AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p = this.f2188c;
        if (abstractComponentCallbacksC0666p.f2329r == null) {
            return abstractComponentCallbacksC0666p.f2312a;
        }
        int r12 = this.f2190e;
        int ordinal = abstractComponentCallbacksC0666p.f2306K.ordinal();
        if (ordinal == 1) {
            r12 = Math.min(r12, 0);
        } else if (ordinal == 2) {
            r12 = Math.min(r12, 1);
        } else if (ordinal == 3) {
            r12 = Math.min(r12, 5);
        } else if (ordinal != 4) {
            r12 = Math.min(r12, -1);
        }
        if (abstractComponentCallbacksC0666p.f2324m) {
            if (abstractComponentCallbacksC0666p.f2325n) {
                r12 = Math.max(this.f2190e, 2);
                View view = abstractComponentCallbacksC0666p.f2300E;
                if (view != null && view.getParent() == null) {
                    r12 = Math.min(r12, 2);
                }
            } else {
                r12 = this.f2190e < 4 ? Math.min(r12, abstractComponentCallbacksC0666p.f2312a) : Math.min(r12, 1);
            }
        }
        if (!abstractComponentCallbacksC0666p.f2322k) {
            r12 = Math.min(r12, 1);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0666p.f2299D;
        if (viewGroup != null) {
            C0658h m1744f = C0658h.m1744f(viewGroup, abstractComponentCallbacksC0666p.m1767j().m1658B());
            m1744f.getClass();
            C0649P m1748d = m1744f.m1748d(abstractComponentCallbacksC0666p);
            r6 = m1748d != null ? m1748d.f2208b : 0;
            Iterator it = m1744f.f2262c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    c0649p = null;
                    break;
                }
                c0649p = (C0649P) it.next();
                if (c0649p.f2209c.equals(abstractComponentCallbacksC0666p) && !c0649p.f2212f) {
                    break;
                }
            }
            if (c0649p != null && (r6 == 0 || r6 == 1)) {
                r6 = c0649p.f2208b;
            }
        }
        if (r6 == 2) {
            r12 = Math.min(r12, 6);
        } else if (r6 == 3) {
            r12 = Math.max(r12, 3);
        } else if (abstractComponentCallbacksC0666p.f2323l) {
            r12 = abstractComponentCallbacksC0666p.f2328q > 0 ? Math.min(r12, 1) : Math.min(r12, -1);
        }
        if (abstractComponentCallbacksC0666p.f2301F && abstractComponentCallbacksC0666p.f2312a < 5) {
            r12 = Math.min(r12, 4);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + r12 + " for " + abstractComponentCallbacksC0666p);
        }
        return r12;
    }

    /* renamed from: e */
    public final void m1711e() {
        Parcelable parcelable;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        final AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p = this.f2188c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto CREATED: " + abstractComponentCallbacksC0666p);
        }
        if (abstractComponentCallbacksC0666p.f2305J) {
            Bundle bundle = abstractComponentCallbacksC0666p.f2313b;
            if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
                abstractComponentCallbacksC0666p.f2331t.m1666M(parcelable);
                C0638E c0638e = abstractComponentCallbacksC0666p.f2331t;
                c0638e.f2150y = false;
                c0638e.f2151z = false;
                c0638e.f2124F.f2170h = false;
                c0638e.m1693s(1);
            }
            abstractComponentCallbacksC0666p.f2312a = 1;
            return;
        }
        C0109g c0109g = this.f2186a;
        c0109g.m365p(false);
        Bundle bundle2 = abstractComponentCallbacksC0666p.f2313b;
        abstractComponentCallbacksC0666p.f2331t.m1661H();
        abstractComponentCallbacksC0666p.f2312a = 1;
        abstractComponentCallbacksC0666p.f2298C = false;
        abstractComponentCallbacksC0666p.f2307L.m1791a(new InterfaceC0706p() { // from class: androidx.fragment.app.Fragment$5
            @Override // androidx.lifecycle.InterfaceC0706p
            /* renamed from: b */
            public final void mo1460b(InterfaceC0708r interfaceC0708r, EnumC0702l enumC0702l) {
                View view;
                if (enumC0702l != EnumC0702l.ON_STOP || (view = AbstractComponentCallbacksC0666p.this.f2300E) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
            }
        });
        abstractComponentCallbacksC0666p.f2310O.m617b(bundle2);
        abstractComponentCallbacksC0666p.mo1754m(bundle2);
        abstractComponentCallbacksC0666p.f2305J = true;
        if (abstractComponentCallbacksC0666p.f2298C) {
            abstractComponentCallbacksC0666p.f2307L.m1794d(EnumC0702l.ON_CREATE);
            c0109g.m360k(false);
        } else {
            throw new C0650Q("Fragment " + abstractComponentCallbacksC0666p + " did not call through to super.onCreate()");
        }
    }

    /* renamed from: f */
    public final void m1712f() {
        String str;
        int r02 = 0;
        AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p = this.f2188c;
        if (abstractComponentCallbacksC0666p.f2324m) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0666p);
        }
        LayoutInflater mo1757q = abstractComponentCallbacksC0666p.mo1757q(abstractComponentCallbacksC0666p.f2313b);
        ViewGroup viewGroup = abstractComponentCallbacksC0666p.f2299D;
        if (viewGroup == null) {
            int r4 = abstractComponentCallbacksC0666p.f2334w;
            if (r4 == 0) {
                viewGroup = null;
            } else {
                if (r4 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + abstractComponentCallbacksC0666p + " for a container view with no id");
                }
                viewGroup = (ViewGroup) abstractComponentCallbacksC0666p.f2329r.f2140o.mo93y(r4);
                if (viewGroup == null && !abstractComponentCallbacksC0666p.f2326o) {
                    try {
                        str = abstractComponentCallbacksC0666p.m1770w().getResources().getResourceName(abstractComponentCallbacksC0666p.f2334w);
                    } catch (Resources.NotFoundException unused) {
                        str = CellularNetworkTypeExtractor.UNKNOWN_NETWORK_TYPE_VALUE;
                    }
                    throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(abstractComponentCallbacksC0666p.f2334w) + " (" + str + ") for fragment " + abstractComponentCallbacksC0666p);
                }
            }
        }
        abstractComponentCallbacksC0666p.f2299D = viewGroup;
        abstractComponentCallbacksC0666p.mo1762v(mo1757q, viewGroup, abstractComponentCallbacksC0666p.f2313b);
        View view = abstractComponentCallbacksC0666p.f2300E;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            abstractComponentCallbacksC0666p.f2300E.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC0666p);
            if (viewGroup != null) {
                m1708b();
            }
            if (abstractComponentCallbacksC0666p.f2336y) {
                abstractComponentCallbacksC0666p.f2300E.setVisibility(8);
            }
            View view2 = abstractComponentCallbacksC0666p.f2300E;
            WeakHashMap weakHashMap = AbstractC0283P.f842a;
            if (view2.isAttachedToWindow()) {
                AbstractC0270C.m696c(abstractComponentCallbacksC0666p.f2300E);
            } else {
                View view3 = abstractComponentCallbacksC0666p.f2300E;
                view3.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0643J(r02, view3));
            }
            abstractComponentCallbacksC0666p.f2331t.m1693s(2);
            this.f2186a.m370u(false);
            int visibility = abstractComponentCallbacksC0666p.f2300E.getVisibility();
            abstractComponentCallbacksC0666p.m1763f().f2293j = abstractComponentCallbacksC0666p.f2300E.getAlpha();
            if (abstractComponentCallbacksC0666p.f2299D != null && visibility == 0) {
                View findFocus = abstractComponentCallbacksC0666p.f2300E.findFocus();
                if (findFocus != null) {
                    abstractComponentCallbacksC0666p.m1763f().f2294k = findFocus;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + abstractComponentCallbacksC0666p);
                    }
                }
                abstractComponentCallbacksC0666p.f2300E.setAlpha(0.0f);
            }
        }
        abstractComponentCallbacksC0666p.f2312a = 2;
    }

    /* renamed from: g */
    public final void m1713g() {
        AbstractComponentCallbacksC0666p m114i;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p = this.f2188c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom CREATED: " + abstractComponentCallbacksC0666p);
        }
        boolean z2 = true;
        boolean z3 = abstractComponentCallbacksC0666p.f2323l && abstractComponentCallbacksC0666p.f2328q <= 0;
        C0015h c0015h = this.f2187b;
        if (!z3) {
            C0640G c0640g = (C0640G) c0015h.f27d;
            if (!((c0640g.f2165c.containsKey(abstractComponentCallbacksC0666p.f2316e) && c0640g.f2168f) ? c0640g.f2169g : true)) {
                String str = abstractComponentCallbacksC0666p.f2319h;
                if (str != null && (m114i = c0015h.m114i(str)) != null && m114i.f2296A) {
                    abstractComponentCallbacksC0666p.f2318g = m114i;
                }
                abstractComponentCallbacksC0666p.f2312a = 0;
                return;
            }
        }
        C0669s c0669s = abstractComponentCallbacksC0666p.f2330s;
        if (c0669s instanceof InterfaceC0689M) {
            z2 = ((C0640G) c0015h.f27d).f2169g;
        } else {
            AbstractActivityC0798g abstractActivityC0798g = c0669s.f2343e;
            if (abstractActivityC0798g instanceof Activity) {
                z2 = true ^ abstractActivityC0798g.isChangingConfigurations();
            }
        }
        if (z3 || z2) {
            C0640G c0640g2 = (C0640G) c0015h.f27d;
            c0640g2.getClass();
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "Clearing non-config state for " + abstractComponentCallbacksC0666p);
            }
            HashMap hashMap = c0640g2.f2166d;
            C0640G c0640g3 = (C0640G) hashMap.get(abstractComponentCallbacksC0666p.f2316e);
            if (c0640g3 != null) {
                c0640g3.mo1414a();
                hashMap.remove(abstractComponentCallbacksC0666p.f2316e);
            }
            HashMap hashMap2 = c0640g2.f2167e;
            C0688L c0688l = (C0688L) hashMap2.get(abstractComponentCallbacksC0666p.f2316e);
            if (c0688l != null) {
                c0688l.m1782a();
                hashMap2.remove(abstractComponentCallbacksC0666p.f2316e);
            }
        }
        abstractComponentCallbacksC0666p.f2331t.m1685k();
        abstractComponentCallbacksC0666p.f2307L.m1794d(EnumC0702l.ON_DESTROY);
        abstractComponentCallbacksC0666p.f2312a = 0;
        abstractComponentCallbacksC0666p.f2298C = false;
        abstractComponentCallbacksC0666p.f2305J = false;
        abstractComponentCallbacksC0666p.f2298C = true;
        if (!abstractComponentCallbacksC0666p.f2298C) {
            throw new C0650Q("Fragment " + abstractComponentCallbacksC0666p + " did not call through to super.onDestroy()");
        }
        this.f2186a.m361l(false);
        Iterator it = c0015h.m116k().iterator();
        while (it.hasNext()) {
            C0644K c0644k = (C0644K) it.next();
            if (c0644k != null) {
                String str2 = abstractComponentCallbacksC0666p.f2316e;
                AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p2 = c0644k.f2188c;
                if (str2.equals(abstractComponentCallbacksC0666p2.f2319h)) {
                    abstractComponentCallbacksC0666p2.f2318g = abstractComponentCallbacksC0666p;
                    abstractComponentCallbacksC0666p2.f2319h = null;
                }
            }
        }
        String str3 = abstractComponentCallbacksC0666p.f2319h;
        if (str3 != null) {
            abstractComponentCallbacksC0666p.f2318g = c0015h.m114i(str3);
        }
        c0015h.m130y(this);
    }

    /* renamed from: h */
    public final void m1714h() {
        View view;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p = this.f2188c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + abstractComponentCallbacksC0666p);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0666p.f2299D;
        if (viewGroup != null && (view = abstractComponentCallbacksC0666p.f2300E) != null) {
            viewGroup.removeView(view);
        }
        abstractComponentCallbacksC0666p.f2331t.m1693s(1);
        if (abstractComponentCallbacksC0666p.f2300E != null) {
            C0646M c0646m = abstractComponentCallbacksC0666p.f2308M;
            c0646m.m1725f();
            if (c0646m.f2200b.f2416c.compareTo(EnumC0703m.f2407c) >= 0) {
                abstractComponentCallbacksC0666p.f2308M.m1724c(EnumC0702l.ON_DESTROY);
            }
        }
        abstractComponentCallbacksC0666p.f2312a = 1;
        abstractComponentCallbacksC0666p.f2298C = false;
        abstractComponentCallbacksC0666p.mo1755o();
        if (!abstractComponentCallbacksC0666p.f2298C) {
            throw new C0650Q("Fragment " + abstractComponentCallbacksC0666p + " did not call through to super.onDestroyView()");
        }
        C2692l c2692l = ((C0559a) new C0113k(abstractComponentCallbacksC0666p, abstractComponentCallbacksC0666p.mo1474d()).f348c).f1566c;
        if (c2692l.f8687c > 0) {
            c2692l.f8686b[0].getClass();
            throw new ClassCastException();
        }
        abstractComponentCallbacksC0666p.f2327p = false;
        this.f2186a.m371v(false);
        abstractComponentCallbacksC0666p.f2299D = null;
        abstractComponentCallbacksC0666p.f2300E = null;
        abstractComponentCallbacksC0666p.f2308M = null;
        abstractComponentCallbacksC0666p.f2309N.m1806e(null);
        abstractComponentCallbacksC0666p.f2325n = false;
    }

    /* renamed from: i */
    public final void m1715i() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p = this.f2188c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + abstractComponentCallbacksC0666p);
        }
        abstractComponentCallbacksC0666p.f2312a = -1;
        abstractComponentCallbacksC0666p.f2298C = false;
        abstractComponentCallbacksC0666p.mo1756p();
        if (!abstractComponentCallbacksC0666p.f2298C) {
            throw new C0650Q("Fragment " + abstractComponentCallbacksC0666p + " did not call through to super.onDetach()");
        }
        C0638E c0638e = abstractComponentCallbacksC0666p.f2331t;
        if (!c0638e.f2119A) {
            c0638e.m1685k();
            abstractComponentCallbacksC0666p.f2331t = new C0638E();
        }
        this.f2186a.m362m(false);
        abstractComponentCallbacksC0666p.f2312a = -1;
        abstractComponentCallbacksC0666p.f2330s = null;
        abstractComponentCallbacksC0666p.f2332u = null;
        abstractComponentCallbacksC0666p.f2329r = null;
        if (!abstractComponentCallbacksC0666p.f2323l || abstractComponentCallbacksC0666p.f2328q > 0) {
            C0640G c0640g = (C0640G) this.f2187b.f27d;
            boolean z2 = true;
            if (c0640g.f2165c.containsKey(abstractComponentCallbacksC0666p.f2316e) && c0640g.f2168f) {
                z2 = c0640g.f2169g;
            }
            if (!z2) {
                return;
            }
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC0666p);
        }
        abstractComponentCallbacksC0666p.f2307L = new C0710t(abstractComponentCallbacksC0666p);
        abstractComponentCallbacksC0666p.f2310O = new C0229j(abstractComponentCallbacksC0666p);
        abstractComponentCallbacksC0666p.f2316e = UUID.randomUUID().toString();
        abstractComponentCallbacksC0666p.f2322k = false;
        abstractComponentCallbacksC0666p.f2323l = false;
        abstractComponentCallbacksC0666p.f2324m = false;
        abstractComponentCallbacksC0666p.f2325n = false;
        abstractComponentCallbacksC0666p.f2326o = false;
        abstractComponentCallbacksC0666p.f2328q = 0;
        abstractComponentCallbacksC0666p.f2329r = null;
        abstractComponentCallbacksC0666p.f2331t = new C0638E();
        abstractComponentCallbacksC0666p.f2330s = null;
        abstractComponentCallbacksC0666p.f2333v = 0;
        abstractComponentCallbacksC0666p.f2334w = 0;
        abstractComponentCallbacksC0666p.f2335x = null;
        abstractComponentCallbacksC0666p.f2336y = false;
        abstractComponentCallbacksC0666p.f2337z = false;
    }

    /* renamed from: j */
    public final void m1716j() {
        AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p = this.f2188c;
        if (abstractComponentCallbacksC0666p.f2324m && abstractComponentCallbacksC0666p.f2325n && !abstractComponentCallbacksC0666p.f2327p) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0666p);
            }
            abstractComponentCallbacksC0666p.mo1762v(abstractComponentCallbacksC0666p.mo1757q(abstractComponentCallbacksC0666p.f2313b), null, abstractComponentCallbacksC0666p.f2313b);
            View view = abstractComponentCallbacksC0666p.f2300E;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                abstractComponentCallbacksC0666p.f2300E.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC0666p);
                if (abstractComponentCallbacksC0666p.f2336y) {
                    abstractComponentCallbacksC0666p.f2300E.setVisibility(8);
                }
                abstractComponentCallbacksC0666p.f2331t.m1693s(2);
                this.f2186a.m370u(false);
                abstractComponentCallbacksC0666p.f2312a = 2;
            }
        }
    }

    /* renamed from: k */
    public final void m1717k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        boolean z2 = this.f2189d;
        AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p = this.f2188c;
        if (z2) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + abstractComponentCallbacksC0666p);
                return;
            }
            return;
        }
        try {
            this.f2189d = true;
            while (true) {
                int m1710d = m1710d();
                int r6 = abstractComponentCallbacksC0666p.f2312a;
                if (m1710d == r6) {
                    if (abstractComponentCallbacksC0666p.f2304I) {
                        if (abstractComponentCallbacksC0666p.f2300E != null && (viewGroup = abstractComponentCallbacksC0666p.f2299D) != null) {
                            C0658h m1744f = C0658h.m1744f(viewGroup, abstractComponentCallbacksC0666p.m1767j().m1658B());
                            if (abstractComponentCallbacksC0666p.f2336y) {
                                m1744f.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + abstractComponentCallbacksC0666p);
                                }
                                m1744f.m1745a(3, 1, this);
                            } else {
                                m1744f.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + abstractComponentCallbacksC0666p);
                                }
                                m1744f.m1745a(2, 1, this);
                            }
                        }
                        C0638E c0638e = abstractComponentCallbacksC0666p.f2329r;
                        if (c0638e != null && abstractComponentCallbacksC0666p.f2322k && C0638E.m1653D(abstractComponentCallbacksC0666p)) {
                            c0638e.f2149x = true;
                        }
                        abstractComponentCallbacksC0666p.f2304I = false;
                    }
                    this.f2189d = false;
                    return;
                }
                if (m1710d <= r6) {
                    switch (r6 - 1) {
                        case -1:
                            m1715i();
                            break;
                        case 0:
                            m1713g();
                            break;
                        case 1:
                            m1714h();
                            abstractComponentCallbacksC0666p.f2312a = 1;
                            break;
                        case 2:
                            abstractComponentCallbacksC0666p.f2325n = false;
                            abstractComponentCallbacksC0666p.f2312a = 2;
                            break;
                        case 3:
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + abstractComponentCallbacksC0666p);
                            }
                            if (abstractComponentCallbacksC0666p.f2300E != null && abstractComponentCallbacksC0666p.f2314c == null) {
                                m1721o();
                            }
                            if (abstractComponentCallbacksC0666p.f2300E != null && (viewGroup3 = abstractComponentCallbacksC0666p.f2299D) != null) {
                                C0658h m1744f2 = C0658h.m1744f(viewGroup3, abstractComponentCallbacksC0666p.m1767j().m1658B());
                                m1744f2.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + abstractComponentCallbacksC0666p);
                                }
                                m1744f2.m1745a(1, 3, this);
                            }
                            abstractComponentCallbacksC0666p.f2312a = 3;
                            break;
                        case 4:
                            m1723q();
                            break;
                        case 5:
                            abstractComponentCallbacksC0666p.f2312a = 5;
                            break;
                        case 6:
                            m1718l();
                            break;
                    }
                } else {
                    switch (r6 + 1) {
                        case 0:
                            m1709c();
                            break;
                        case 1:
                            m1711e();
                            break;
                        case 2:
                            m1716j();
                            m1712f();
                            break;
                        case 3:
                            m1707a();
                            break;
                        case 4:
                            if (abstractComponentCallbacksC0666p.f2300E != null && (viewGroup2 = abstractComponentCallbacksC0666p.f2299D) != null) {
                                C0658h m1744f3 = C0658h.m1744f(viewGroup2, abstractComponentCallbacksC0666p.m1767j().m1658B());
                                int m7b = AbstractC0002c.m7b(abstractComponentCallbacksC0666p.f2300E.getVisibility());
                                m1744f3.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + abstractComponentCallbacksC0666p);
                                }
                                m1744f3.m1745a(m7b, 2, this);
                            }
                            abstractComponentCallbacksC0666p.f2312a = 4;
                            break;
                        case 5:
                            m1722p();
                            break;
                        case 6:
                            abstractComponentCallbacksC0666p.f2312a = 6;
                            break;
                        case 7:
                            m1720n();
                            break;
                    }
                }
            }
        } catch (Throwable th) {
            this.f2189d = false;
            throw th;
        }
    }

    /* renamed from: l */
    public final void m1718l() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p = this.f2188c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom RESUMED: " + abstractComponentCallbacksC0666p);
        }
        abstractComponentCallbacksC0666p.f2331t.m1693s(5);
        if (abstractComponentCallbacksC0666p.f2300E != null) {
            abstractComponentCallbacksC0666p.f2308M.m1724c(EnumC0702l.ON_PAUSE);
        }
        abstractComponentCallbacksC0666p.f2307L.m1794d(EnumC0702l.ON_PAUSE);
        abstractComponentCallbacksC0666p.f2312a = 6;
        abstractComponentCallbacksC0666p.f2298C = true;
        this.f2186a.m363n(false);
    }

    /* renamed from: m */
    public final void m1719m(ClassLoader classLoader) {
        AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p = this.f2188c;
        Bundle bundle = abstractComponentCallbacksC0666p.f2313b;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        abstractComponentCallbacksC0666p.f2314c = abstractComponentCallbacksC0666p.f2313b.getSparseParcelableArray("android:view_state");
        abstractComponentCallbacksC0666p.f2315d = abstractComponentCallbacksC0666p.f2313b.getBundle("android:view_registry_state");
        String string = abstractComponentCallbacksC0666p.f2313b.getString("android:target_state");
        abstractComponentCallbacksC0666p.f2319h = string;
        if (string != null) {
            abstractComponentCallbacksC0666p.f2320i = abstractComponentCallbacksC0666p.f2313b.getInt("android:target_req_state", 0);
        }
        boolean z2 = abstractComponentCallbacksC0666p.f2313b.getBoolean("android:user_visible_hint", true);
        abstractComponentCallbacksC0666p.f2302G = z2;
        if (z2) {
            return;
        }
        abstractComponentCallbacksC0666p.f2301F = true;
    }

    /* renamed from: n */
    public final void m1720n() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p = this.f2188c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto RESUMED: " + abstractComponentCallbacksC0666p);
        }
        C0664n c0664n = abstractComponentCallbacksC0666p.f2303H;
        View view = c0664n == null ? null : c0664n.f2294k;
        if (view != null) {
            if (view != abstractComponentCallbacksC0666p.f2300E) {
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent != abstractComponentCallbacksC0666p.f2300E) {
                    }
                }
            }
            boolean requestFocus = view.requestFocus();
            if (Log.isLoggable("FragmentManager", 2)) {
                StringBuilder sb = new StringBuilder("requestFocus: Restoring focused view ");
                sb.append(view);
                sb.append(" ");
                sb.append(requestFocus ? "succeeded" : "failed");
                sb.append(" on Fragment ");
                sb.append(abstractComponentCallbacksC0666p);
                sb.append(" resulting in focused view ");
                sb.append(abstractComponentCallbacksC0666p.f2300E.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        abstractComponentCallbacksC0666p.m1763f().f2294k = null;
        abstractComponentCallbacksC0666p.f2331t.m1661H();
        abstractComponentCallbacksC0666p.f2331t.m1697w(true);
        abstractComponentCallbacksC0666p.f2312a = 7;
        abstractComponentCallbacksC0666p.f2298C = false;
        abstractComponentCallbacksC0666p.f2298C = true;
        if (!abstractComponentCallbacksC0666p.f2298C) {
            throw new C0650Q("Fragment " + abstractComponentCallbacksC0666p + " did not call through to super.onResume()");
        }
        C0710t c0710t = abstractComponentCallbacksC0666p.f2307L;
        EnumC0702l enumC0702l = EnumC0702l.ON_RESUME;
        c0710t.m1794d(enumC0702l);
        if (abstractComponentCallbacksC0666p.f2300E != null) {
            abstractComponentCallbacksC0666p.f2308M.f2200b.m1794d(enumC0702l);
        }
        C0638E c0638e = abstractComponentCallbacksC0666p.f2331t;
        c0638e.f2150y = false;
        c0638e.f2151z = false;
        c0638e.f2124F.f2170h = false;
        c0638e.m1693s(7);
        this.f2186a.m366q(false);
        abstractComponentCallbacksC0666p.f2313b = null;
        abstractComponentCallbacksC0666p.f2314c = null;
        abstractComponentCallbacksC0666p.f2315d = null;
    }

    /* renamed from: o */
    public final void m1721o() {
        AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p = this.f2188c;
        if (abstractComponentCallbacksC0666p.f2300E == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        abstractComponentCallbacksC0666p.f2300E.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            abstractComponentCallbacksC0666p.f2314c = sparseArray;
        }
        Bundle bundle = new Bundle();
        abstractComponentCallbacksC0666p.f2308M.f2201c.m618c(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        abstractComponentCallbacksC0666p.f2315d = bundle;
    }

    /* renamed from: p */
    public final void m1722p() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p = this.f2188c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto STARTED: " + abstractComponentCallbacksC0666p);
        }
        abstractComponentCallbacksC0666p.f2331t.m1661H();
        abstractComponentCallbacksC0666p.f2331t.m1697w(true);
        abstractComponentCallbacksC0666p.f2312a = 5;
        abstractComponentCallbacksC0666p.f2298C = false;
        abstractComponentCallbacksC0666p.mo1759s();
        if (!abstractComponentCallbacksC0666p.f2298C) {
            throw new C0650Q("Fragment " + abstractComponentCallbacksC0666p + " did not call through to super.onStart()");
        }
        C0710t c0710t = abstractComponentCallbacksC0666p.f2307L;
        EnumC0702l enumC0702l = EnumC0702l.ON_START;
        c0710t.m1794d(enumC0702l);
        if (abstractComponentCallbacksC0666p.f2300E != null) {
            abstractComponentCallbacksC0666p.f2308M.f2200b.m1794d(enumC0702l);
        }
        C0638E c0638e = abstractComponentCallbacksC0666p.f2331t;
        c0638e.f2150y = false;
        c0638e.f2151z = false;
        c0638e.f2124F.f2170h = false;
        c0638e.m1693s(5);
        this.f2186a.m368s(false);
    }

    /* renamed from: q */
    public final void m1723q() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p = this.f2188c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom STARTED: " + abstractComponentCallbacksC0666p);
        }
        C0638E c0638e = abstractComponentCallbacksC0666p.f2331t;
        c0638e.f2151z = true;
        c0638e.f2124F.f2170h = true;
        c0638e.m1693s(4);
        if (abstractComponentCallbacksC0666p.f2300E != null) {
            abstractComponentCallbacksC0666p.f2308M.m1724c(EnumC0702l.ON_STOP);
        }
        abstractComponentCallbacksC0666p.f2307L.m1794d(EnumC0702l.ON_STOP);
        abstractComponentCallbacksC0666p.f2312a = 4;
        abstractComponentCallbacksC0666p.f2298C = false;
        abstractComponentCallbacksC0666p.mo1760t();
        if (abstractComponentCallbacksC0666p.f2298C) {
            this.f2186a.m369t(false);
            return;
        }
        throw new C0650Q("Fragment " + abstractComponentCallbacksC0666p + " did not call through to super.onStop()");
    }

    public C0644K(C0109g c0109g, C0015h c0015h, ClassLoader classLoader, C0675y c0675y, C0642I r6) {
        this.f2186a = c0109g;
        this.f2187b = c0015h;
        AbstractComponentCallbacksC0666p m1777a = c0675y.m1777a(r6.f2171a);
        this.f2188c = m1777a;
        Bundle bundle = r6.f2180j;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        m1777a.m1773z(bundle);
        m1777a.f2316e = r6.f2172b;
        m1777a.f2324m = r6.f2173c;
        m1777a.f2326o = true;
        m1777a.f2333v = r6.f2174d;
        m1777a.f2334w = r6.f2175e;
        m1777a.f2335x = r6.f2176f;
        m1777a.f2296A = r6.f2177g;
        m1777a.f2323l = r6.f2178h;
        m1777a.f2337z = r6.f2179i;
        m1777a.f2336y = r6.f2181k;
        m1777a.f2306K = EnumC0703m.values()[r6.f2182l];
        Bundle bundle2 = r6.f2183m;
        if (bundle2 != null) {
            m1777a.f2313b = bundle2;
        } else {
            m1777a.f2313b = new Bundle();
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Instantiated fragment " + m1777a);
        }
    }

    public C0644K(C0109g c0109g, C0015h c0015h, AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p, C0642I r6) {
        this.f2186a = c0109g;
        this.f2187b = c0015h;
        this.f2188c = abstractComponentCallbacksC0666p;
        abstractComponentCallbacksC0666p.f2314c = null;
        abstractComponentCallbacksC0666p.f2315d = null;
        abstractComponentCallbacksC0666p.f2328q = 0;
        abstractComponentCallbacksC0666p.f2325n = false;
        abstractComponentCallbacksC0666p.f2322k = false;
        AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p2 = abstractComponentCallbacksC0666p.f2318g;
        abstractComponentCallbacksC0666p.f2319h = abstractComponentCallbacksC0666p2 != null ? abstractComponentCallbacksC0666p2.f2316e : null;
        abstractComponentCallbacksC0666p.f2318g = null;
        Bundle bundle = r6.f2183m;
        if (bundle != null) {
            abstractComponentCallbacksC0666p.f2313b = bundle;
        } else {
            abstractComponentCallbacksC0666p.f2313b = new Bundle();
        }
    }
}
