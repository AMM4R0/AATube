package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p000A.AbstractC0002c;
import p006C.C0055g;
import p017G.C0140d;
import p017G.InterfaceC0139c;
import p118q.AbstractC2714e;

/* renamed from: androidx.fragment.app.P */
/* loaded from: classes.dex */
public final class C0649P {

    /* renamed from: a */
    public int f2207a;

    /* renamed from: b */
    public int f2208b;

    /* renamed from: c */
    public final AbstractComponentCallbacksC0666p f2209c;

    /* renamed from: d */
    public final ArrayList f2210d;

    /* renamed from: e */
    public final HashSet f2211e;

    /* renamed from: f */
    public boolean f2212f;

    /* renamed from: g */
    public boolean f2213g;

    /* renamed from: h */
    public final C0644K f2214h;

    public C0649P(int r3, int r4, C0644K c0644k, C0140d c0140d) {
        AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p = c0644k.f2188c;
        this.f2210d = new ArrayList();
        this.f2211e = new HashSet();
        this.f2212f = false;
        this.f2213g = false;
        this.f2207a = r3;
        this.f2208b = r4;
        this.f2209c = abstractComponentCallbacksC0666p;
        c0140d.m440a(new C0055g(20, this));
        this.f2214h = c0644k;
    }

    /* renamed from: a */
    public final void m1727a() {
        if (this.f2212f) {
            return;
        }
        this.f2212f = true;
        HashSet hashSet = this.f2211e;
        if (hashSet.isEmpty()) {
            m1728b();
            return;
        }
        Iterator it = new ArrayList(hashSet).iterator();
        while (it.hasNext()) {
            C0140d c0140d = (C0140d) it.next();
            synchronized (c0140d) {
                try {
                    if (!c0140d.f406a) {
                        c0140d.f406a = true;
                        c0140d.f408c = true;
                        InterfaceC0139c interfaceC0139c = c0140d.f407b;
                        if (interfaceC0139c != null) {
                            try {
                                interfaceC0139c.mo119n();
                            } catch (Throwable th) {
                                synchronized (c0140d) {
                                    c0140d.f408c = false;
                                    c0140d.notifyAll();
                                    throw th;
                                }
                            }
                        }
                        synchronized (c0140d) {
                            c0140d.f408c = false;
                            c0140d.notifyAll();
                        }
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: b */
    public final void m1728b() {
        if (!this.f2213g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f2213g = true;
            Iterator it = this.f2210d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.f2214h.m1717k();
    }

    /* renamed from: c */
    public final void m1729c(int r7, int r8) {
        int m5234a = AbstractC2714e.m5234a(r8);
        AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p = this.f2209c;
        if (m5234a == 0) {
            if (this.f2207a != 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0666p + " mFinalState = " + AbstractC0002c.m20o(this.f2207a) + " -> " + AbstractC0002c.m20o(r7) + ". ");
                }
                this.f2207a = r7;
                return;
            }
            return;
        }
        if (m5234a == 1) {
            if (this.f2207a == 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0666p + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + AbstractC0002c.m19n(this.f2208b) + " to ADDING.");
                }
                this.f2207a = 2;
                this.f2208b = 2;
                return;
            }
            return;
        }
        if (m5234a != 2) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0666p + " mFinalState = " + AbstractC0002c.m20o(this.f2207a) + " -> REMOVED. mLifecycleImpact  = " + AbstractC0002c.m19n(this.f2208b) + " to REMOVING.");
        }
        this.f2207a = 1;
        this.f2208b = 3;
    }

    /* renamed from: d */
    public final void m1730d() {
        if (this.f2208b == 2) {
            C0644K c0644k = this.f2214h;
            AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p = c0644k.f2188c;
            View findFocus = abstractComponentCallbacksC0666p.f2300E.findFocus();
            if (findFocus != null) {
                abstractComponentCallbacksC0666p.m1763f().f2294k = findFocus;
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + abstractComponentCallbacksC0666p);
                }
            }
            View m1771x = this.f2209c.m1771x();
            if (m1771x.getParent() == null) {
                c0644k.m1708b();
                m1771x.setAlpha(0.0f);
            }
            if (m1771x.getAlpha() == 0.0f && m1771x.getVisibility() == 0) {
                m1771x.setVisibility(4);
            }
            C0664n c0664n = abstractComponentCallbacksC0666p.f2303H;
            m1771x.setAlpha(c0664n == null ? 1.0f : c0664n.f2293j);
        }
    }

    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + AbstractC0002c.m20o(this.f2207a) + "} {mLifecycleImpact = " + AbstractC0002c.m19n(this.f2208b) + "} {mFragment = " + this.f2209c + "}";
    }
}
