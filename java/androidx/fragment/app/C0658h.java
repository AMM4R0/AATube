package androidx.fragment.app;

import android.animation.Animator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.carwizard.p075li.youtube.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import p000A.AbstractC0002c;
import p002A1.C0015h;
import p006C.C0055g;
import p010D0.C0113k;
import p017G.C0140d;
import p019H.RunnableC0182l;
import p028K.AbstractC0283P;
import p081e1.C0879e;
import p118q.AbstractC2714e;

/* renamed from: androidx.fragment.app.h */
/* loaded from: classes.dex */
public final class C0658h {

    /* renamed from: a */
    public final ViewGroup f2260a;

    /* renamed from: b */
    public final ArrayList f2261b = new ArrayList();

    /* renamed from: c */
    public final ArrayList f2262c = new ArrayList();

    /* renamed from: d */
    public boolean f2263d = false;

    /* renamed from: e */
    public boolean f2264e = false;

    public C0658h(ViewGroup viewGroup) {
        this.f2260a = viewGroup;
    }

    /* renamed from: f */
    public static C0658h m1744f(ViewGroup viewGroup, C0879e c0879e) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof C0658h) {
            return (C0658h) tag;
        }
        c0879e.getClass();
        C0658h c0658h = new C0658h(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, c0658h);
        return c0658h;
    }

    /* renamed from: a */
    public final void m1745a(int r4, int r5, C0644K c0644k) {
        synchronized (this.f2261b) {
            try {
                C0140d c0140d = new C0140d();
                C0649P m1748d = m1748d(c0644k.f2188c);
                if (m1748d != null) {
                    m1748d.m1729c(r4, r5);
                    return;
                }
                C0649P c0649p = new C0649P(r4, r5, c0644k, c0140d);
                this.f2261b.add(c0649p);
                c0649p.f2210d.add(new RunnableC0648O(this, c0649p, 0));
                c0649p.f2210d.add(new RunnableC0648O(this, c0649p, 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final void m1746b(ArrayList arrayList, boolean z2) {
        Iterator it = arrayList.iterator();
        C0649P c0649p = null;
        C0649P c0649p2 = null;
        while (it.hasNext()) {
            C0649P c0649p3 = (C0649P) it.next();
            int m8c = AbstractC0002c.m8c(c0649p3.f2209c.f2300E);
            int m5234a = AbstractC2714e.m5234a(c0649p3.f2207a);
            if (m5234a != 0) {
                if (m5234a != 1) {
                    if (m5234a != 2 && m5234a != 3) {
                    }
                } else if (m8c != 2) {
                    c0649p2 = c0649p3;
                }
            }
            if (m8c == 2 && c0649p == null) {
                c0649p = c0649p3;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList(arrayList);
        Iterator it2 = arrayList.iterator();
        while (true) {
            boolean z3 = false;
            if (!it2.hasNext()) {
                break;
            }
            C0649P c0649p4 = (C0649P) it2.next();
            C0140d c0140d = new C0140d();
            c0649p4.m1730d();
            HashSet hashSet = c0649p4.f2211e;
            hashSet.add(c0140d);
            C0655e c0655e = new C0655e(c0649p4, c0140d);
            c0655e.f2256d = false;
            c0655e.f2255c = z2;
            arrayList2.add(c0655e);
            C0140d c0140d2 = new C0140d();
            c0649p4.m1730d();
            hashSet.add(c0140d2);
            if (!z2 ? c0649p4 == c0649p2 : c0649p4 == c0649p) {
                z3 = true;
            }
            C0657g c0657g = new C0657g(c0649p4, c0140d2);
            int r13 = c0649p4.f2207a;
            AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p = c0649p4.f2209c;
            if (r13 == 2) {
                if (z2) {
                    abstractComponentCallbacksC0666p.getClass();
                } else {
                    abstractComponentCallbacksC0666p.getClass();
                }
                if (z2) {
                    abstractComponentCallbacksC0666p.getClass();
                } else {
                    abstractComponentCallbacksC0666p.getClass();
                }
            } else if (z2) {
                abstractComponentCallbacksC0666p.getClass();
            } else {
                abstractComponentCallbacksC0666p.getClass();
            }
            if (z3) {
                if (z2) {
                    abstractComponentCallbacksC0666p.getClass();
                } else {
                    abstractComponentCallbacksC0666p.getClass();
                }
            }
            arrayList3.add(c0657g);
            c0649p4.f2210d.add(new RunnableC0182l(this, arrayList4, c0649p4));
        }
        HashMap hashMap = new HashMap();
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            C0649P c0649p5 = (C0649P) ((C0657g) it3.next()).f2258a;
            AbstractC0002c.m8c(c0649p5.f2209c.f2300E);
            int r4 = c0649p5.f2207a;
        }
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            C0657g c0657g2 = (C0657g) it4.next();
            hashMap.put((C0649P) c0657g2.f2258a, Boolean.FALSE);
            c0657g2.m1738d();
        }
        boolean containsValue = hashMap.containsValue(Boolean.TRUE);
        ViewGroup viewGroup = this.f2260a;
        Context context = viewGroup.getContext();
        ArrayList arrayList5 = new ArrayList();
        Iterator it5 = arrayList2.iterator();
        boolean z4 = false;
        while (it5.hasNext()) {
            C0655e c0655e2 = (C0655e) it5.next();
            C0649P c0649p6 = (C0649P) c0655e2.f2258a;
            int m8c2 = AbstractC0002c.m8c(c0649p6.f2209c.f2300E);
            int r132 = c0649p6.f2207a;
            if (m8c2 == r132 || !(m8c2 == 2 || r132 == 2)) {
                c0655e2.m1738d();
            } else {
                C0113k m1736j = c0655e2.m1736j(context);
                if (m1736j == null) {
                    c0655e2.m1738d();
                } else {
                    Animator animator = (Animator) m1736j.f348c;
                    if (animator == null) {
                        arrayList5.add(c0655e2);
                    } else {
                        C0649P c0649p7 = (C0649P) c0655e2.f2258a;
                        boolean equals = Boolean.TRUE.equals(hashMap.get(c0649p7));
                        AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p2 = c0649p7.f2209c;
                        if (equals) {
                            if (Log.isLoggable("FragmentManager", 2)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + abstractComponentCallbacksC0666p2 + " as this Fragment was involved in a Transition.");
                            }
                            c0655e2.m1738d();
                        } else {
                            boolean z5 = c0649p7.f2207a == 3;
                            if (z5) {
                                arrayList4.remove(c0649p7);
                            }
                            View view = abstractComponentCallbacksC0666p2.f2300E;
                            viewGroup.startViewTransition(view);
                            animator.addListener(new C0653c(viewGroup, view, z5, c0649p7, c0655e2));
                            animator.setTarget(view);
                            animator.start();
                            ((C0140d) c0655e2.f2259b).m440a(new C0055g(17, animator));
                            z4 = true;
                        }
                    }
                }
            }
        }
        Iterator it6 = arrayList5.iterator();
        while (it6.hasNext()) {
            C0655e c0655e3 = (C0655e) it6.next();
            C0649P c0649p8 = (C0649P) c0655e3.f2258a;
            AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p3 = c0649p8.f2209c;
            if (containsValue) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + abstractComponentCallbacksC0666p3 + " as Animations cannot run alongside Transitions.");
                }
                c0655e3.m1738d();
            } else if (z4) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + abstractComponentCallbacksC0666p3 + " as Animations cannot run alongside Animators.");
                }
                c0655e3.m1738d();
            } else {
                View view2 = abstractComponentCallbacksC0666p3.f2300E;
                C0113k m1736j2 = c0655e3.m1736j(context);
                m1736j2.getClass();
                Animation animation = (Animation) m1736j2.f347b;
                animation.getClass();
                if (c0649p8.f2207a != 1) {
                    view2.startAnimation(animation);
                    c0655e3.m1738d();
                } else {
                    viewGroup.startViewTransition(view2);
                    RunnableC0670t runnableC0670t = new RunnableC0670t(animation, viewGroup, view2);
                    runnableC0670t.setAnimationListener(new AnimationAnimationListenerC0654d(viewGroup, view2, c0655e3));
                    view2.startAnimation(runnableC0670t);
                }
                ((C0140d) c0655e3.f2259b).m440a(new C0015h(view2, viewGroup, c0655e3, 2));
            }
        }
        Iterator it7 = arrayList4.iterator();
        while (it7.hasNext()) {
            C0649P c0649p9 = (C0649P) it7.next();
            AbstractC0002c.m6a(c0649p9.f2209c.f2300E, c0649p9.f2207a);
        }
        arrayList4.clear();
    }

    /* renamed from: c */
    public final void m1747c() {
        if (this.f2264e) {
            return;
        }
        ViewGroup viewGroup = this.f2260a;
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        if (!viewGroup.isAttachedToWindow()) {
            m1749e();
            this.f2263d = false;
            return;
        }
        synchronized (this.f2261b) {
            try {
                if (!this.f2261b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.f2262c);
                    this.f2262c.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C0649P c0649p = (C0649P) it.next();
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + c0649p);
                        }
                        c0649p.m1727a();
                        if (!c0649p.f2213g) {
                            this.f2262c.add(c0649p);
                        }
                    }
                    m1750g();
                    ArrayList arrayList2 = new ArrayList(this.f2261b);
                    this.f2261b.clear();
                    this.f2262c.addAll(arrayList2);
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((C0649P) it2.next()).m1730d();
                    }
                    m1746b(arrayList2, this.f2263d);
                    this.f2263d = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: d */
    public final C0649P m1748d(AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p) {
        Iterator it = this.f2261b.iterator();
        while (it.hasNext()) {
            C0649P c0649p = (C0649P) it.next();
            if (c0649p.f2209c.equals(abstractComponentCallbacksC0666p) && !c0649p.f2212f) {
                return c0649p;
            }
        }
        return null;
    }

    /* renamed from: e */
    public final void m1749e() {
        String str;
        String str2;
        ViewGroup viewGroup = this.f2260a;
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        boolean isAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.f2261b) {
            try {
                m1750g();
                Iterator it = this.f2261b.iterator();
                while (it.hasNext()) {
                    ((C0649P) it.next()).m1730d();
                }
                Iterator it2 = new ArrayList(this.f2262c).iterator();
                while (it2.hasNext()) {
                    C0649P c0649p = (C0649P) it2.next();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: ");
                        if (isAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f2260a + " is not attached to window. ";
                        }
                        sb.append(str2);
                        sb.append("Cancelling running operation ");
                        sb.append(c0649p);
                        Log.v("FragmentManager", sb.toString());
                    }
                    c0649p.m1727a();
                }
                Iterator it3 = new ArrayList(this.f2261b).iterator();
                while (it3.hasNext()) {
                    C0649P c0649p2 = (C0649P) it3.next();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: ");
                        if (isAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.f2260a + " is not attached to window. ";
                        }
                        sb2.append(str);
                        sb2.append("Cancelling pending operation ");
                        sb2.append(c0649p2);
                        Log.v("FragmentManager", sb2.toString());
                    }
                    c0649p2.m1727a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: g */
    public final void m1750g() {
        Iterator it = this.f2261b.iterator();
        while (it.hasNext()) {
            C0649P c0649p = (C0649P) it.next();
            if (c0649p.f2208b == 2) {
                c0649p.m1729c(AbstractC0002c.m7b(c0649p.f2209c.m1771x().getVisibility()), 1);
            }
        }
    }
}
