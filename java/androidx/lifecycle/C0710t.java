package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC2492i;
import p000A.AbstractC0002c;
import p106m.C2637a;
import p109n.C2672a;
import p109n.C2674c;

/* renamed from: androidx.lifecycle.t */
/* loaded from: classes.dex */
public final class C0710t {

    /* renamed from: a */
    public final boolean f2414a;

    /* renamed from: b */
    public C2672a f2415b;

    /* renamed from: c */
    public EnumC0703m f2416c;

    /* renamed from: d */
    public final WeakReference f2417d;

    /* renamed from: e */
    public int f2418e;

    /* renamed from: f */
    public boolean f2419f;

    /* renamed from: g */
    public boolean f2420g;

    /* renamed from: h */
    public final ArrayList f2421h;

    public C0710t(InterfaceC0708r interfaceC0708r) {
        new AtomicReference();
        this.f2414a = true;
        this.f2415b = new C2672a();
        this.f2416c = EnumC0703m.f2406b;
        this.f2421h = new ArrayList();
        this.f2417d = new WeakReference(interfaceC0708r);
    }

    /* renamed from: a */
    public final void m1791a(InterfaceC0707q interfaceC0707q) {
        InterfaceC0706p reflectiveGenericLifecycleObserver;
        InterfaceC0708r interfaceC0708r;
        ArrayList arrayList = this.f2421h;
        Object obj = null;
        m1793c("addObserver");
        EnumC0703m enumC0703m = this.f2416c;
        EnumC0703m enumC0703m2 = EnumC0703m.f2405a;
        if (enumC0703m != enumC0703m2) {
            enumC0703m2 = EnumC0703m.f2406b;
        }
        C0709s c0709s = new C0709s();
        HashMap hashMap = AbstractC0711u.f2422a;
        boolean z2 = interfaceC0707q instanceof InterfaceC0706p;
        boolean z3 = interfaceC0707q instanceof InterfaceC0694d;
        if (z2 && z3) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((InterfaceC0694d) interfaceC0707q, (InterfaceC0706p) interfaceC0707q);
        } else if (z3) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((InterfaceC0694d) interfaceC0707q, null);
        } else if (z2) {
            reflectiveGenericLifecycleObserver = (InterfaceC0706p) interfaceC0707q;
        } else {
            Class<?> cls = interfaceC0707q.getClass();
            if (AbstractC0711u.m1800b(cls) == 2) {
                Object obj2 = AbstractC0711u.f2423b.get(cls);
                AbstractC2492i.m4912b(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    AbstractC0711u.m1799a((Constructor) list.get(0), interfaceC0707q);
                    throw null;
                }
                int size = list.size();
                InterfaceC0697g[] interfaceC0697gArr = new InterfaceC0697g[size];
                if (size > 0) {
                    AbstractC0711u.m1799a((Constructor) list.get(0), interfaceC0707q);
                    throw null;
                }
                reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(interfaceC0697gArr);
            } else {
                reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(interfaceC0707q);
            }
        }
        c0709s.f2413b = reflectiveGenericLifecycleObserver;
        c0709s.f2412a = enumC0703m2;
        C2672a c2672a = this.f2415b;
        C2674c mo5131a = c2672a.mo5131a(interfaceC0707q);
        if (mo5131a != null) {
            obj = mo5131a.f8615b;
        } else {
            HashMap hashMap2 = c2672a.f8610e;
            C2674c c2674c = new C2674c(interfaceC0707q, c0709s);
            c2672a.f8624d++;
            C2674c c2674c2 = c2672a.f8622b;
            if (c2674c2 == null) {
                c2672a.f8621a = c2674c;
                c2672a.f8622b = c2674c;
            } else {
                c2674c2.f8616c = c2674c;
                c2674c.f8617d = c2674c2;
                c2672a.f8622b = c2674c;
            }
            hashMap2.put(interfaceC0707q, c2674c);
        }
        if (((C0709s) obj) == null && (interfaceC0708r = (InterfaceC0708r) this.f2417d.get()) != null) {
            boolean z4 = this.f2418e != 0 || this.f2419f;
            EnumC0703m m1792b = m1792b(interfaceC0707q);
            this.f2418e++;
            while (c0709s.f2412a.compareTo(m1792b) < 0 && this.f2415b.f8610e.containsKey(interfaceC0707q)) {
                arrayList.add(c0709s.f2412a);
                C0700j c0700j = EnumC0702l.Companion;
                EnumC0703m enumC0703m3 = c0709s.f2412a;
                c0700j.getClass();
                EnumC0702l m1788a = C0700j.m1788a(enumC0703m3);
                if (m1788a == null) {
                    throw new IllegalStateException("no event up from " + c0709s.f2412a);
                }
                c0709s.m1790a(interfaceC0708r, m1788a);
                arrayList.remove(arrayList.size() - 1);
                m1792b = m1792b(interfaceC0707q);
            }
            if (!z4) {
                m1798h();
            }
            this.f2418e--;
        }
    }

    /* renamed from: b */
    public final EnumC0703m m1792b(InterfaceC0707q interfaceC0707q) {
        HashMap hashMap = this.f2415b.f8610e;
        C2674c c2674c = hashMap.containsKey(interfaceC0707q) ? ((C2674c) hashMap.get(interfaceC0707q)).f8617d : null;
        EnumC0703m enumC0703m = c2674c != null ? ((C0709s) c2674c.f8615b).f2412a : null;
        ArrayList arrayList = this.f2421h;
        EnumC0703m enumC0703m2 = arrayList.isEmpty() ? null : (EnumC0703m) arrayList.get(arrayList.size() - 1);
        EnumC0703m state1 = this.f2416c;
        AbstractC2492i.m4915e(state1, "state1");
        if (enumC0703m == null || enumC0703m.compareTo(state1) >= 0) {
            enumC0703m = state1;
        }
        return (enumC0703m2 == null || enumC0703m2.compareTo(enumC0703m) >= 0) ? enumC0703m : enumC0703m2;
    }

    /* renamed from: c */
    public final void m1793c(String str) {
        if (this.f2414a) {
            ((C2637a) C2637a.m5094F().f8559f).getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(AbstractC0002c.m16k("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    /* renamed from: d */
    public final void m1794d(EnumC0702l event) {
        AbstractC2492i.m4915e(event, "event");
        m1793c("handleLifecycleEvent");
        m1795e(event.m1789a());
    }

    /* renamed from: e */
    public final void m1795e(EnumC0703m enumC0703m) {
        EnumC0703m enumC0703m2 = this.f2416c;
        if (enumC0703m2 == enumC0703m) {
            return;
        }
        EnumC0703m enumC0703m3 = EnumC0703m.f2406b;
        EnumC0703m enumC0703m4 = EnumC0703m.f2405a;
        if (enumC0703m2 == enumC0703m3 && enumC0703m == enumC0703m4) {
            throw new IllegalStateException(("no event down from " + this.f2416c + " in component " + this.f2417d.get()).toString());
        }
        this.f2416c = enumC0703m;
        if (this.f2419f || this.f2418e != 0) {
            this.f2420g = true;
            return;
        }
        this.f2419f = true;
        m1798h();
        this.f2419f = false;
        if (this.f2416c == enumC0703m4) {
            this.f2415b = new C2672a();
        }
    }

    /* renamed from: f */
    public final void m1796f(InterfaceC0707q interfaceC0707q) {
        m1793c("removeObserver");
        this.f2415b.mo5132b(interfaceC0707q);
    }

    /* renamed from: g */
    public final void m1797g() {
        EnumC0703m enumC0703m = EnumC0703m.f2407c;
        m1793c("setCurrentState");
        m1795e(enumC0703m);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r7.f2420g = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        return;
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1798h() {
        /*
            Method dump skipped, instructions count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C0710t.m1798h():void");
    }
}
