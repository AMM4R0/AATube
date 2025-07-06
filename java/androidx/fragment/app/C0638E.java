package androidx.fragment.app;

import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C0588g;
import androidx.activity.C0604t;
import androidx.activity.InterfaceC0584c;
import androidx.activity.InterfaceC0605u;
import androidx.activity.result.InterfaceC0602c;
import androidx.lifecycle.AbstractC0686J;
import androidx.lifecycle.C0687K;
import androidx.lifecycle.C0688L;
import androidx.lifecycle.EnumC0703m;
import androidx.lifecycle.InterfaceC0689M;
import com.carwizard.p075li.youtube.MainActivity;
import com.carwizard.p075li.youtube.R;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AbstractC2492i;
import p000A.AbstractC0002c;
import p001A0.AbstractC0005b;
import p002A1.C0015h;
import p010D0.C0109g;
import p010D0.C0113k;
import p010D0.RunnableC0107e;
import p064Y.C0542a;
import p081e1.C0879e;
import p124s0.C2738i;

/* renamed from: androidx.fragment.app.E */
/* loaded from: classes.dex */
public final class C0638E {

    /* renamed from: A */
    public boolean f2119A;

    /* renamed from: B */
    public boolean f2120B;

    /* renamed from: C */
    public ArrayList f2121C;

    /* renamed from: D */
    public ArrayList f2122D;

    /* renamed from: E */
    public ArrayList f2123E;

    /* renamed from: F */
    public C0640G f2124F;

    /* renamed from: G */
    public final RunnableC0107e f2125G;

    /* renamed from: b */
    public boolean f2127b;

    /* renamed from: d */
    public ArrayList f2129d;

    /* renamed from: e */
    public ArrayList f2130e;

    /* renamed from: g */
    public C0604t f2132g;

    /* renamed from: k */
    public final C0109g f2136k;

    /* renamed from: l */
    public final CopyOnWriteArrayList f2137l;

    /* renamed from: m */
    public int f2138m;

    /* renamed from: n */
    public C0669s f2139n;

    /* renamed from: o */
    public AbstractC0005b f2140o;

    /* renamed from: p */
    public AbstractComponentCallbacksC0666p f2141p;

    /* renamed from: q */
    public AbstractComponentCallbacksC0666p f2142q;

    /* renamed from: r */
    public final C0675y f2143r;

    /* renamed from: s */
    public final C0879e f2144s;

    /* renamed from: t */
    public C0113k f2145t;

    /* renamed from: u */
    public C0113k f2146u;

    /* renamed from: v */
    public C0113k f2147v;

    /* renamed from: w */
    public ArrayDeque f2148w;

    /* renamed from: x */
    public boolean f2149x;

    /* renamed from: y */
    public boolean f2150y;

    /* renamed from: z */
    public boolean f2151z;

    /* renamed from: a */
    public final ArrayList f2126a = new ArrayList();

    /* renamed from: c */
    public final C0015h f2128c = new C0015h();

    /* renamed from: f */
    public final LayoutInflaterFactory2C0672v f2131f = new LayoutInflaterFactory2C0672v(this);

    /* renamed from: h */
    public final C0674x f2133h = new C0674x(this);

    /* renamed from: i */
    public final AtomicInteger f2134i = new AtomicInteger();

    /* renamed from: j */
    public final Map f2135j = Collections.synchronizedMap(new HashMap());

    public C0638E() {
        Collections.synchronizedMap(new HashMap());
        Collections.synchronizedMap(new HashMap());
        new C2738i(this);
        this.f2136k = new C0109g(this);
        this.f2137l = new CopyOnWriteArrayList();
        this.f2138m = -1;
        this.f2143r = new C0675y(this);
        this.f2144s = new C0879e();
        this.f2148w = new ArrayDeque();
        this.f2125G = new RunnableC0107e(9, this);
    }

    /* renamed from: D */
    public static boolean m1653D(AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p) {
        abstractComponentCallbacksC0666p.getClass();
        C0015h c0015h = abstractComponentCallbacksC0666p.f2331t.f2128c;
        c0015h.getClass();
        ArrayList arrayList = new ArrayList();
        for (C0644K c0644k : ((HashMap) c0015h.f26c).values()) {
            if (c0644k != null) {
                arrayList.add(c0644k.f2188c);
            } else {
                arrayList.add(null);
            }
        }
        Iterator it = arrayList.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p2 = (AbstractComponentCallbacksC0666p) it.next();
            if (abstractComponentCallbacksC0666p2 != null) {
                z2 = m1653D(abstractComponentCallbacksC0666p2);
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: E */
    public static boolean m1654E(AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p) {
        if (abstractComponentCallbacksC0666p == null) {
            return true;
        }
        return abstractComponentCallbacksC0666p.f2297B && (abstractComponentCallbacksC0666p.f2329r == null || m1654E(abstractComponentCallbacksC0666p.f2332u));
    }

    /* renamed from: F */
    public static boolean m1655F(AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p) {
        if (abstractComponentCallbacksC0666p == null) {
            return true;
        }
        C0638E c0638e = abstractComponentCallbacksC0666p.f2329r;
        return abstractComponentCallbacksC0666p.equals(c0638e.f2142q) && m1655F(c0638e.f2141p);
    }

    /* renamed from: T */
    public static void m1656T(AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "show: " + abstractComponentCallbacksC0666p);
        }
        if (abstractComponentCallbacksC0666p.f2336y) {
            abstractComponentCallbacksC0666p.f2336y = false;
            abstractComponentCallbacksC0666p.f2304I = !abstractComponentCallbacksC0666p.f2304I;
        }
    }

    /* renamed from: A */
    public final C0675y m1657A() {
        AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p = this.f2141p;
        return abstractComponentCallbacksC0666p != null ? abstractComponentCallbacksC0666p.f2329r.m1657A() : this.f2143r;
    }

    /* renamed from: B */
    public final C0879e m1658B() {
        AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p = this.f2141p;
        return abstractComponentCallbacksC0666p != null ? abstractComponentCallbacksC0666p.f2329r.m1658B() : this.f2144s;
    }

    /* renamed from: C */
    public final void m1659C(AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "hide: " + abstractComponentCallbacksC0666p);
        }
        if (abstractComponentCallbacksC0666p.f2336y) {
            return;
        }
        abstractComponentCallbacksC0666p.f2336y = true;
        abstractComponentCallbacksC0666p.f2304I = true ^ abstractComponentCallbacksC0666p.f2304I;
        m1672S(abstractComponentCallbacksC0666p);
    }

    /* renamed from: G */
    public final void m1660G(int r4, boolean z2) {
        HashMap hashMap;
        C0669s c0669s;
        if (this.f2139n == null && r4 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z2 || r4 != this.f2138m) {
            this.f2138m = r4;
            C0015h c0015h = this.f2128c;
            Iterator it = ((ArrayList) c0015h.f25b).iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                hashMap = (HashMap) c0015h.f26c;
                if (!hasNext) {
                    break;
                }
                C0644K c0644k = (C0644K) hashMap.get(((AbstractComponentCallbacksC0666p) it.next()).f2316e);
                if (c0644k != null) {
                    c0644k.m1717k();
                }
            }
            for (C0644K c0644k2 : hashMap.values()) {
                if (c0644k2 != null) {
                    c0644k2.m1717k();
                    AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p = c0644k2.f2188c;
                    if (abstractComponentCallbacksC0666p.f2323l && abstractComponentCallbacksC0666p.f2328q <= 0) {
                        c0015h.m130y(c0644k2);
                    }
                }
            }
            m1673U();
            if (this.f2149x && (c0669s = this.f2139n) != null && this.f2138m == 7) {
                c0669s.f2346h.m2203i().mo2218b();
                this.f2149x = false;
            }
        }
    }

    /* renamed from: H */
    public final void m1661H() {
        if (this.f2139n == null) {
            return;
        }
        this.f2150y = false;
        this.f2151z = false;
        this.f2124F.f2170h = false;
        for (AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p : this.f2128c.m124s()) {
            if (abstractComponentCallbacksC0666p != null) {
                abstractComponentCallbacksC0666p.f2331t.m1661H();
            }
        }
    }

    /* renamed from: I */
    public final boolean m1662I() {
        m1697w(false);
        m1696v(true);
        AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p = this.f2142q;
        if (abstractComponentCallbacksC0666p != null && abstractComponentCallbacksC0666p.m1764g().m1662I()) {
            return true;
        }
        boolean m1663J = m1663J(this.f2121C, this.f2122D, -1, 0);
        if (m1663J) {
            this.f2127b = true;
            try {
                m1665L(this.f2121C, this.f2122D);
            } finally {
                m1678d();
            }
        }
        m1674V();
        if (this.f2120B) {
            this.f2120B = false;
            m1673U();
        }
        ((HashMap) this.f2128c.f26c).values().removeAll(Collections.singleton(null));
        return m1663J;
    }

    /* renamed from: J */
    public final boolean m1663J(ArrayList arrayList, ArrayList arrayList2, int r7, int r8) {
        int r02;
        C0651a c0651a;
        ArrayList arrayList3 = this.f2129d;
        if (arrayList3 == null) {
            return false;
        }
        if (r7 >= 0 || (r8 & 1) != 0) {
            if (r7 >= 0) {
                r02 = arrayList3.size() - 1;
                while (r02 >= 0) {
                    C0651a c0651a2 = (C0651a) this.f2129d.get(r02);
                    if (r7 >= 0 && r7 == c0651a2.f2232r) {
                        break;
                    }
                    r02--;
                }
                if (r02 < 0) {
                    return false;
                }
                if ((r8 & 1) != 0) {
                    do {
                        r02--;
                        if (r02 < 0) {
                            break;
                        }
                        c0651a = (C0651a) this.f2129d.get(r02);
                        if (r7 < 0) {
                            break;
                        }
                    } while (r7 == c0651a.f2232r);
                }
            } else {
                r02 = -1;
            }
            if (r02 == this.f2129d.size() - 1) {
                return false;
            }
            for (int size = this.f2129d.size() - 1; size > r02; size--) {
                arrayList.add(this.f2129d.remove(size));
                arrayList2.add(Boolean.TRUE);
            }
        } else {
            int size2 = arrayList3.size() - 1;
            if (size2 < 0) {
                return false;
            }
            arrayList.add(this.f2129d.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    /* renamed from: K */
    public final void m1664K(AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "remove: " + abstractComponentCallbacksC0666p + " nesting=" + abstractComponentCallbacksC0666p.f2328q);
        }
        boolean z2 = abstractComponentCallbacksC0666p.f2328q > 0;
        if (abstractComponentCallbacksC0666p.f2337z && z2) {
            return;
        }
        C0015h c0015h = this.f2128c;
        synchronized (((ArrayList) c0015h.f25b)) {
            ((ArrayList) c0015h.f25b).remove(abstractComponentCallbacksC0666p);
        }
        abstractComponentCallbacksC0666p.f2322k = false;
        if (m1653D(abstractComponentCallbacksC0666p)) {
            this.f2149x = true;
        }
        abstractComponentCallbacksC0666p.f2323l = true;
        m1672S(abstractComponentCallbacksC0666p);
    }

    /* renamed from: L */
    public final void m1665L(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int r12 = 0;
        int r2 = 0;
        while (r12 < size) {
            if (!((C0651a) arrayList.get(r12)).f2229o) {
                if (r2 != r12) {
                    m1698x(arrayList, arrayList2, r2, r12);
                }
                r2 = r12 + 1;
                if (((Boolean) arrayList2.get(r12)).booleanValue()) {
                    while (r2 < size && ((Boolean) arrayList2.get(r2)).booleanValue() && !((C0651a) arrayList.get(r2)).f2229o) {
                        r2++;
                    }
                }
                m1698x(arrayList, arrayList2, r12, r2);
                r12 = r2 - 1;
            }
            r12++;
        }
        if (r2 != size) {
            m1698x(arrayList, arrayList2, r2, size);
        }
    }

    /* renamed from: M */
    public final void m1666M(Parcelable parcelable) {
        int r5;
        C0109g c0109g;
        int r9;
        C0644K c0644k;
        if (parcelable == null) {
            return;
        }
        C0639F c0639f = (C0639F) parcelable;
        if (c0639f.f2152a == null) {
            return;
        }
        C0015h c0015h = this.f2128c;
        ((HashMap) c0015h.f26c).clear();
        Iterator it = c0639f.f2152a.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            r5 = 2;
            c0109g = this.f2136k;
            if (!hasNext) {
                break;
            }
            C0642I r14 = (C0642I) it.next();
            if (r14 != null) {
                AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p = (AbstractComponentCallbacksC0666p) this.f2124F.f2165c.get(r14.f2172b);
                if (abstractComponentCallbacksC0666p != null) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + abstractComponentCallbacksC0666p);
                    }
                    c0644k = new C0644K(c0109g, c0015h, abstractComponentCallbacksC0666p, r14);
                } else {
                    c0644k = new C0644K(this.f2136k, this.f2128c, this.f2139n.f2343e.getClassLoader(), m1657A(), r14);
                }
                AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p2 = c0644k.f2188c;
                abstractComponentCallbacksC0666p2.f2329r = this;
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + abstractComponentCallbacksC0666p2.f2316e + "): " + abstractComponentCallbacksC0666p2);
                }
                c0644k.m1719m(this.f2139n.f2343e.getClassLoader());
                c0015h.m129x(c0644k);
                c0644k.f2190e = this.f2138m;
            }
        }
        C0640G c0640g = this.f2124F;
        c0640g.getClass();
        Iterator it2 = new ArrayList(c0640g.f2165c.values()).iterator();
        while (it2.hasNext()) {
            AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p3 = (AbstractComponentCallbacksC0666p) it2.next();
            if (!(((HashMap) c0015h.f26c).get(abstractComponentCallbacksC0666p3.f2316e) != null)) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + abstractComponentCallbacksC0666p3 + " that was not found in the set of active Fragments " + c0639f.f2152a);
                }
                this.f2124F.m1702b(abstractComponentCallbacksC0666p3);
                abstractComponentCallbacksC0666p3.f2329r = this;
                C0644K c0644k2 = new C0644K(c0109g, c0015h, abstractComponentCallbacksC0666p3);
                c0644k2.f2190e = 1;
                c0644k2.m1717k();
                abstractComponentCallbacksC0666p3.f2323l = true;
                c0644k2.m1717k();
            }
        }
        ArrayList<String> arrayList = c0639f.f2153b;
        ((ArrayList) c0015h.f25b).clear();
        if (arrayList != null) {
            for (String str : arrayList) {
                AbstractComponentCallbacksC0666p m114i = c0015h.m114i(str);
                if (m114i == null) {
                    throw new IllegalStateException(AbstractC0002c.m16k("No instantiated fragment for (", str, ")"));
                }
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + m114i);
                }
                c0015h.m110e(m114i);
            }
        }
        AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p4 = null;
        if (c0639f.f2154c != null) {
            this.f2129d = new ArrayList(c0639f.f2154c.length);
            int r3 = 0;
            while (true) {
                C0652b[] c0652bArr = c0639f.f2154c;
                if (r3 >= c0652bArr.length) {
                    break;
                }
                C0652b c0652b = c0652bArr[r3];
                c0652b.getClass();
                C0651a c0651a = new C0651a(this);
                int r12 = 0;
                int r13 = 0;
                while (true) {
                    int[] r142 = c0652b.f2233a;
                    if (r12 >= r142.length) {
                        break;
                    }
                    C0645L c0645l = new C0645L();
                    int r16 = r12 + 1;
                    c0645l.f2191a = r142[r12];
                    if (Log.isLoggable("FragmentManager", r5)) {
                        Log.v("FragmentManager", "Instantiate " + c0651a + " op #" + r13 + " base fragment #" + r142[r16]);
                    }
                    String str2 = (String) c0652b.f2234b.get(r13);
                    if (str2 != null) {
                        c0645l.f2192b = c0015h.m114i(str2);
                    } else {
                        c0645l.f2192b = abstractComponentCallbacksC0666p4;
                    }
                    c0645l.f2197g = EnumC0703m.values()[c0652b.f2235c[r13]];
                    c0645l.f2198h = EnumC0703m.values()[c0652b.f2236d[r13]];
                    int r92 = r142[r16];
                    c0645l.f2193c = r92;
                    int r52 = r142[r12 + 2];
                    c0645l.f2194d = r52;
                    int r17 = r12 + 4;
                    int r4 = r142[r12 + 3];
                    c0645l.f2195e = r4;
                    r12 += 5;
                    int r143 = r142[r17];
                    c0645l.f2196f = r143;
                    c0651a.f2216b = r92;
                    c0651a.f2217c = r52;
                    c0651a.f2218d = r4;
                    c0651a.f2219e = r143;
                    c0651a.m1731b(c0645l);
                    r13++;
                    abstractComponentCallbacksC0666p4 = null;
                    r5 = 2;
                }
                c0651a.f2220f = c0652b.f2237e;
                c0651a.f2222h = c0652b.f2238f;
                c0651a.f2232r = c0652b.f2239g;
                c0651a.f2221g = true;
                c0651a.f2223i = c0652b.f2240h;
                c0651a.f2224j = c0652b.f2241i;
                c0651a.f2225k = c0652b.f2242j;
                c0651a.f2226l = c0652b.f2243k;
                c0651a.f2227m = c0652b.f2244l;
                c0651a.f2228n = c0652b.f2245m;
                c0651a.f2229o = c0652b.f2246n;
                c0651a.m1732c(1);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + r3 + " (index " + c0651a.f2232r + "): " + c0651a);
                    PrintWriter printWriter = new PrintWriter(new C0647N());
                    c0651a.m1735f("  ", printWriter, false);
                    printWriter.close();
                }
                this.f2129d.add(c0651a);
                r3++;
                r5 = 2;
                abstractComponentCallbacksC0666p4 = null;
            }
            r9 = 0;
        } else {
            r9 = 0;
            this.f2129d = null;
        }
        this.f2134i.set(c0639f.f2155d);
        String str3 = c0639f.f2156e;
        if (str3 != null) {
            AbstractComponentCallbacksC0666p m114i2 = c0015h.m114i(str3);
            this.f2142q = m114i2;
            m1690p(m114i2);
        }
        ArrayList arrayList2 = c0639f.f2157f;
        if (arrayList2 != null) {
            while (r9 < arrayList2.size()) {
                Bundle bundle = (Bundle) c0639f.f2158g.get(r9);
                bundle.setClassLoader(this.f2139n.f2343e.getClassLoader());
                this.f2135j.put(arrayList2.get(r9), bundle);
                r9++;
            }
        }
        this.f2148w = new ArrayDeque(c0639f.f2159h);
    }

    /* renamed from: N */
    public final C0639F m1667N() {
        int r2;
        ArrayList arrayList;
        C0652b[] c0652bArr;
        int size;
        Iterator it = m1679e().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C0658h c0658h = (C0658h) it.next();
            if (c0658h.f2264e) {
                c0658h.f2264e = false;
                c0658h.m1747c();
            }
        }
        Iterator it2 = m1679e().iterator();
        while (it2.hasNext()) {
            ((C0658h) it2.next()).m1749e();
        }
        m1697w(true);
        this.f2150y = true;
        this.f2124F.f2170h = true;
        C0015h c0015h = this.f2128c;
        c0015h.getClass();
        HashMap hashMap = (HashMap) c0015h.f26c;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        Iterator it3 = hashMap.values().iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            C0644K c0644k = (C0644K) it3.next();
            if (c0644k != null) {
                AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p = c0644k.f2188c;
                C0642I r6 = new C0642I(abstractComponentCallbacksC0666p);
                if (abstractComponentCallbacksC0666p.f2312a <= -1 || r6.f2183m != null) {
                    r6.f2183m = abstractComponentCallbacksC0666p.f2313b;
                } else {
                    Bundle bundle = new Bundle();
                    abstractComponentCallbacksC0666p.mo1758r(bundle);
                    abstractComponentCallbacksC0666p.f2310O.m618c(bundle);
                    C0639F m1667N = abstractComponentCallbacksC0666p.f2331t.m1667N();
                    if (m1667N != null) {
                        bundle.putParcelable("android:support:fragments", m1667N);
                    }
                    c0644k.f2186a.m367r(false);
                    Bundle bundle2 = bundle.isEmpty() ? null : bundle;
                    if (abstractComponentCallbacksC0666p.f2300E != null) {
                        c0644k.m1721o();
                    }
                    if (abstractComponentCallbacksC0666p.f2314c != null) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putSparseParcelableArray("android:view_state", abstractComponentCallbacksC0666p.f2314c);
                    }
                    if (abstractComponentCallbacksC0666p.f2315d != null) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putBundle("android:view_registry_state", abstractComponentCallbacksC0666p.f2315d);
                    }
                    if (!abstractComponentCallbacksC0666p.f2302G) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putBoolean("android:user_visible_hint", abstractComponentCallbacksC0666p.f2302G);
                    }
                    r6.f2183m = bundle2;
                    if (abstractComponentCallbacksC0666p.f2319h != null) {
                        if (bundle2 == null) {
                            r6.f2183m = new Bundle();
                        }
                        r6.f2183m.putString("android:target_state", abstractComponentCallbacksC0666p.f2319h);
                        int r3 = abstractComponentCallbacksC0666p.f2320i;
                        if (r3 != 0) {
                            r6.f2183m.putInt("android:target_req_state", r3);
                        }
                    }
                }
                arrayList2.add(r6);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Saved state of " + abstractComponentCallbacksC0666p + ": " + r6.f2183m);
                }
            }
        }
        if (arrayList2.isEmpty()) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        C0015h c0015h2 = this.f2128c;
        synchronized (((ArrayList) c0015h2.f25b)) {
            try {
                if (((ArrayList) c0015h2.f25b).isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(((ArrayList) c0015h2.f25b).size());
                    Iterator it4 = ((ArrayList) c0015h2.f25b).iterator();
                    while (it4.hasNext()) {
                        AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p2 = (AbstractComponentCallbacksC0666p) it4.next();
                        arrayList.add(abstractComponentCallbacksC0666p2.f2316e);
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "saveAllState: adding fragment (" + abstractComponentCallbacksC0666p2.f2316e + "): " + abstractComponentCallbacksC0666p2);
                        }
                    }
                }
            } finally {
            }
        }
        ArrayList arrayList3 = this.f2129d;
        if (arrayList3 == null || (size = arrayList3.size()) <= 0) {
            c0652bArr = null;
        } else {
            c0652bArr = new C0652b[size];
            for (r2 = 0; r2 < size; r2++) {
                c0652bArr[r2] = new C0652b((C0651a) this.f2129d.get(r2));
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + r2 + ": " + this.f2129d.get(r2));
                }
            }
        }
        C0639F c0639f = new C0639F();
        c0639f.f2156e = null;
        ArrayList arrayList4 = new ArrayList();
        c0639f.f2157f = arrayList4;
        ArrayList arrayList5 = new ArrayList();
        c0639f.f2158g = arrayList5;
        c0639f.f2152a = arrayList2;
        c0639f.f2153b = arrayList;
        c0639f.f2154c = c0652bArr;
        c0639f.f2155d = this.f2134i.get();
        AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p3 = this.f2142q;
        if (abstractComponentCallbacksC0666p3 != null) {
            c0639f.f2156e = abstractComponentCallbacksC0666p3.f2316e;
        }
        arrayList4.addAll(this.f2135j.keySet());
        arrayList5.addAll(this.f2135j.values());
        c0639f.f2159h = new ArrayList(this.f2148w);
        return c0639f;
    }

    /* renamed from: O */
    public final void m1668O() {
        synchronized (this.f2126a) {
            try {
                if (this.f2126a.size() == 1) {
                    this.f2139n.f2344f.removeCallbacks(this.f2125G);
                    this.f2139n.f2344f.post(this.f2125G);
                    m1674V();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: P */
    public final void m1669P(AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p, boolean z2) {
        ViewGroup m1700z = m1700z(abstractComponentCallbacksC0666p);
        if (m1700z == null || !(m1700z instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) m1700z).setDrawDisappearingViewsLast(!z2);
    }

    /* renamed from: Q */
    public final void m1670Q(AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p, EnumC0703m enumC0703m) {
        if (abstractComponentCallbacksC0666p.equals(this.f2128c.m114i(abstractComponentCallbacksC0666p.f2316e)) && (abstractComponentCallbacksC0666p.f2330s == null || abstractComponentCallbacksC0666p.f2329r == this)) {
            abstractComponentCallbacksC0666p.f2306K = enumC0703m;
            return;
        }
        throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0666p + " is not an active fragment of FragmentManager " + this);
    }

    /* renamed from: R */
    public final void m1671R(AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p) {
        if (abstractComponentCallbacksC0666p != null) {
            if (!abstractComponentCallbacksC0666p.equals(this.f2128c.m114i(abstractComponentCallbacksC0666p.f2316e)) || (abstractComponentCallbacksC0666p.f2330s != null && abstractComponentCallbacksC0666p.f2329r != this)) {
                throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0666p + " is not an active fragment of FragmentManager " + this);
            }
        }
        AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p2 = this.f2142q;
        this.f2142q = abstractComponentCallbacksC0666p;
        m1690p(abstractComponentCallbacksC0666p2);
        m1690p(this.f2142q);
    }

    /* renamed from: S */
    public final void m1672S(AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p) {
        ViewGroup m1700z = m1700z(abstractComponentCallbacksC0666p);
        if (m1700z != null) {
            C0664n c0664n = abstractComponentCallbacksC0666p.f2303H;
            if ((c0664n == null ? 0 : c0664n.f2288e) + (c0664n == null ? 0 : c0664n.f2287d) + (c0664n == null ? 0 : c0664n.f2286c) + (c0664n == null ? 0 : c0664n.f2285b) > 0) {
                if (m1700z.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    m1700z.setTag(R.id.visible_removing_fragment_view_tag, abstractComponentCallbacksC0666p);
                }
                AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p2 = (AbstractComponentCallbacksC0666p) m1700z.getTag(R.id.visible_removing_fragment_view_tag);
                C0664n c0664n2 = abstractComponentCallbacksC0666p.f2303H;
                boolean z2 = c0664n2 != null ? c0664n2.f2284a : false;
                if (abstractComponentCallbacksC0666p2.f2303H == null) {
                    return;
                }
                abstractComponentCallbacksC0666p2.m1763f().f2284a = z2;
            }
        }
    }

    /* renamed from: U */
    public final void m1673U() {
        Iterator it = this.f2128c.m116k().iterator();
        while (it.hasNext()) {
            C0644K c0644k = (C0644K) it.next();
            AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p = c0644k.f2188c;
            if (abstractComponentCallbacksC0666p.f2301F) {
                if (this.f2127b) {
                    this.f2120B = true;
                } else {
                    abstractComponentCallbacksC0666p.f2301F = false;
                    c0644k.m1717k();
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.internal.h, u1.a] */
    /* JADX WARN: Type inference failed for: r1v10, types: [kotlin.jvm.internal.h, u1.a] */
    /* renamed from: V */
    public final void m1674V() {
        synchronized (this.f2126a) {
            try {
                if (!this.f2126a.isEmpty()) {
                    C0674x c0674x = this.f2133h;
                    c0674x.f2357a = true;
                    ?? r12 = c0674x.f2359c;
                    if (r12 != 0) {
                        r12.invoke();
                    }
                    return;
                }
                C0674x c0674x2 = this.f2133h;
                ArrayList arrayList = this.f2129d;
                c0674x2.f2357a = (arrayList != null ? arrayList.size() : 0) > 0 && m1655F(this.f2141p);
                ?? r02 = c0674x2.f2359c;
                if (r02 != 0) {
                    r02.invoke();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public final C0644K m1675a(AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "add: " + abstractComponentCallbacksC0666p);
        }
        C0644K m1680f = m1680f(abstractComponentCallbacksC0666p);
        abstractComponentCallbacksC0666p.f2329r = this;
        C0015h c0015h = this.f2128c;
        c0015h.m129x(m1680f);
        if (!abstractComponentCallbacksC0666p.f2337z) {
            c0015h.m110e(abstractComponentCallbacksC0666p);
            abstractComponentCallbacksC0666p.f2323l = false;
            if (abstractComponentCallbacksC0666p.f2300E == null) {
                abstractComponentCallbacksC0666p.f2304I = false;
            }
            if (m1653D(abstractComponentCallbacksC0666p)) {
                this.f2149x = true;
            }
        }
        return m1680f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final void m1676b(C0669s c0669s, AbstractC0005b abstractC0005b, AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p) {
        C0640G c0640g;
        if (this.f2139n != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f2139n = c0669s;
        this.f2140o = abstractC0005b;
        this.f2141p = abstractComponentCallbacksC0666p;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2137l;
        if (abstractComponentCallbacksC0666p != 0) {
            copyOnWriteArrayList.add(new C0676z(abstractComponentCallbacksC0666p));
        } else if (c0669s instanceof InterfaceC0641H) {
            copyOnWriteArrayList.add(c0669s);
        }
        if (this.f2141p != null) {
            m1674V();
        }
        if (c0669s instanceof InterfaceC0605u) {
            C0604t m1477h = c0669s.f2346h.m1477h();
            this.f2132g = m1477h;
            m1477h.m1482a(abstractComponentCallbacksC0666p != 0 ? abstractComponentCallbacksC0666p : c0669s, this.f2133h);
        }
        if (abstractComponentCallbacksC0666p != 0) {
            C0640G c0640g2 = abstractComponentCallbacksC0666p.f2329r.f2124F;
            HashMap hashMap = c0640g2.f2166d;
            C0640G c0640g3 = (C0640G) hashMap.get(abstractComponentCallbacksC0666p.f2316e);
            if (c0640g3 == null) {
                c0640g3 = new C0640G(c0640g2.f2168f);
                hashMap.put(abstractComponentCallbacksC0666p.f2316e, c0640g3);
            }
            this.f2124F = c0640g3;
        } else if (c0669s instanceof InterfaceC0689M) {
            C0688L store = c0669s.f2346h.mo1474d();
            AbstractC2492i.m4915e(store, "store");
            C0542a defaultCreationExtras = C0542a.f1473b;
            AbstractC2492i.m4915e(defaultCreationExtras, "defaultCreationExtras");
            String canonicalName = C0640G.class.getCanonicalName();
            if (canonicalName == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            String key = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName);
            AbstractC2492i.m4915e(key, "key");
            LinkedHashMap linkedHashMap = store.f2391a;
            AbstractC0686J abstractC0686J = (AbstractC0686J) linkedHashMap.get(key);
            if (C0640G.class.isInstance(abstractC0686J)) {
                AbstractC2492i.m4913c(abstractC0686J, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            } else {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.putAll(defaultCreationExtras.f1474a);
                linkedHashMap2.put(C0687K.f2390b, key);
                try {
                    c0640g = new C0640G(true);
                } catch (AbstractMethodError unused) {
                    c0640g = new C0640G(true);
                }
                abstractC0686J = c0640g;
                AbstractC0686J abstractC0686J2 = (AbstractC0686J) linkedHashMap.put(key, abstractC0686J);
                if (abstractC0686J2 != null) {
                    abstractC0686J2.mo1414a();
                }
            }
            this.f2124F = (C0640G) abstractC0686J;
        } else {
            this.f2124F = new C0640G(false);
        }
        C0640G c0640g4 = this.f2124F;
        c0640g4.f2170h = this.f2150y || this.f2151z;
        this.f2128c.f27d = c0640g4;
        C0669s c0669s2 = this.f2139n;
        if (c0669s2 instanceof InterfaceC0602c) {
            MainActivity mainActivity = c0669s2.f2346h;
            String str = "FragmentManager:" + (abstractComponentCallbacksC0666p != 0 ? AbstractC0002c.m17l(new StringBuilder(), abstractComponentCallbacksC0666p.f2316e, StringUtils.PROCESS_POSTFIX_DELIMITER) : "");
            String m15j = AbstractC0002c.m15j(str, "StartActivityForResult");
            C0634A c0634a = new C0634A(2);
            C0673w c0673w = new C0673w(this, 2);
            C0588g c0588g = mainActivity.f1683j;
            this.f2145t = c0588g.m1469b(m15j, c0634a, c0673w);
            this.f2146u = c0588g.m1469b(AbstractC0002c.m15j(str, "StartIntentSenderForResult"), new C0634A(0), new C0673w(this, 0));
            this.f2147v = c0588g.m1469b(AbstractC0002c.m15j(str, "RequestPermissions"), new C0634A(1), new C0673w(this, 1));
        }
    }

    /* renamed from: c */
    public final void m1677c(AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "attach: " + abstractComponentCallbacksC0666p);
        }
        if (abstractComponentCallbacksC0666p.f2337z) {
            abstractComponentCallbacksC0666p.f2337z = false;
            if (abstractComponentCallbacksC0666p.f2322k) {
                return;
            }
            this.f2128c.m110e(abstractComponentCallbacksC0666p);
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "add from attach: " + abstractComponentCallbacksC0666p);
            }
            if (m1653D(abstractComponentCallbacksC0666p)) {
                this.f2149x = true;
            }
        }
    }

    /* renamed from: d */
    public final void m1678d() {
        this.f2127b = false;
        this.f2122D.clear();
        this.f2121C.clear();
    }

    /* renamed from: e */
    public final HashSet m1679e() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f2128c.m116k().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((C0644K) it.next()).f2188c.f2299D;
            if (viewGroup != null) {
                hashSet.add(C0658h.m1744f(viewGroup, m1658B()));
            }
        }
        return hashSet;
    }

    /* renamed from: f */
    public final C0644K m1680f(AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p) {
        String str = abstractComponentCallbacksC0666p.f2316e;
        C0015h c0015h = this.f2128c;
        C0644K c0644k = (C0644K) ((HashMap) c0015h.f26c).get(str);
        if (c0644k != null) {
            return c0644k;
        }
        C0644K c0644k2 = new C0644K(this.f2136k, c0015h, abstractComponentCallbacksC0666p);
        c0644k2.m1719m(this.f2139n.f2343e.getClassLoader());
        c0644k2.f2190e = this.f2138m;
        return c0644k2;
    }

    /* renamed from: g */
    public final void m1681g(AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "detach: " + abstractComponentCallbacksC0666p);
        }
        if (abstractComponentCallbacksC0666p.f2337z) {
            return;
        }
        abstractComponentCallbacksC0666p.f2337z = true;
        if (abstractComponentCallbacksC0666p.f2322k) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "remove from detach: " + abstractComponentCallbacksC0666p);
            }
            C0015h c0015h = this.f2128c;
            synchronized (((ArrayList) c0015h.f25b)) {
                ((ArrayList) c0015h.f25b).remove(abstractComponentCallbacksC0666p);
            }
            abstractComponentCallbacksC0666p.f2322k = false;
            if (m1653D(abstractComponentCallbacksC0666p)) {
                this.f2149x = true;
            }
            m1672S(abstractComponentCallbacksC0666p);
        }
    }

    /* renamed from: h */
    public final void m1682h() {
        for (AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p : this.f2128c.m124s()) {
            if (abstractComponentCallbacksC0666p != null) {
                abstractComponentCallbacksC0666p.f2298C = true;
                abstractComponentCallbacksC0666p.f2331t.m1682h();
            }
        }
    }

    /* renamed from: i */
    public final boolean m1683i() {
        if (this.f2138m < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p : this.f2128c.m124s()) {
            if (abstractComponentCallbacksC0666p != null) {
                if (!abstractComponentCallbacksC0666p.f2336y ? abstractComponentCallbacksC0666p.f2331t.m1683i() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: j */
    public final boolean m1684j() {
        if (this.f2138m < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z2 = false;
        for (AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p : this.f2128c.m124s()) {
            if (abstractComponentCallbacksC0666p != null && m1654E(abstractComponentCallbacksC0666p)) {
                if (!abstractComponentCallbacksC0666p.f2336y ? abstractComponentCallbacksC0666p.f2331t.m1684j() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(abstractComponentCallbacksC0666p);
                    z2 = true;
                }
            }
        }
        if (this.f2130e != null) {
            for (int r12 = 0; r12 < this.f2130e.size(); r12++) {
                AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p2 = (AbstractComponentCallbacksC0666p) this.f2130e.get(r12);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC0666p2)) {
                    abstractComponentCallbacksC0666p2.getClass();
                }
            }
        }
        this.f2130e = arrayList;
        return z2;
    }

    /* renamed from: k */
    public final void m1685k() {
        Integer num;
        Integer num2;
        Integer num3;
        this.f2119A = true;
        m1697w(true);
        Iterator it = m1679e().iterator();
        while (it.hasNext()) {
            ((C0658h) it.next()).m1749e();
        }
        m1693s(-1);
        this.f2139n = null;
        this.f2140o = null;
        this.f2141p = null;
        if (this.f2132g != null) {
            Iterator it2 = this.f2133h.f2358b.iterator();
            while (it2.hasNext()) {
                ((InterfaceC0584c) it2.next()).cancel();
            }
            this.f2132g = null;
        }
        C0113k c0113k = this.f2145t;
        if (c0113k != null) {
            C0588g c0588g = (C0588g) c0113k.f348c;
            ArrayList arrayList = c0588g.f1666d;
            String str = (String) c0113k.f347b;
            if (!arrayList.contains(str) && (num3 = (Integer) c0588g.f1664b.remove(str)) != null) {
                c0588g.f1663a.remove(num3);
            }
            c0588g.f1667e.remove(str);
            HashMap hashMap = c0588g.f1668f;
            if (hashMap.containsKey(str)) {
                Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + hashMap.get(str));
                hashMap.remove(str);
            }
            Bundle bundle = c0588g.f1669g;
            if (bundle.containsKey(str)) {
                Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + bundle.getParcelable(str));
                bundle.remove(str);
            }
            if (c0588g.f1665c.get(str) != null) {
                throw new ClassCastException();
            }
            C0113k c0113k2 = this.f2146u;
            C0588g c0588g2 = (C0588g) c0113k2.f348c;
            ArrayList arrayList2 = c0588g2.f1666d;
            String str2 = (String) c0113k2.f347b;
            if (!arrayList2.contains(str2) && (num2 = (Integer) c0588g2.f1664b.remove(str2)) != null) {
                c0588g2.f1663a.remove(num2);
            }
            c0588g2.f1667e.remove(str2);
            HashMap hashMap2 = c0588g2.f1668f;
            if (hashMap2.containsKey(str2)) {
                Log.w("ActivityResultRegistry", "Dropping pending result for request " + str2 + ": " + hashMap2.get(str2));
                hashMap2.remove(str2);
            }
            Bundle bundle2 = c0588g2.f1669g;
            if (bundle2.containsKey(str2)) {
                Log.w("ActivityResultRegistry", "Dropping pending result for request " + str2 + ": " + bundle2.getParcelable(str2));
                bundle2.remove(str2);
            }
            if (c0588g2.f1665c.get(str2) != null) {
                throw new ClassCastException();
            }
            C0113k c0113k3 = this.f2147v;
            C0588g c0588g3 = (C0588g) c0113k3.f348c;
            ArrayList arrayList3 = c0588g3.f1666d;
            String str3 = (String) c0113k3.f347b;
            if (!arrayList3.contains(str3) && (num = (Integer) c0588g3.f1664b.remove(str3)) != null) {
                c0588g3.f1663a.remove(num);
            }
            c0588g3.f1667e.remove(str3);
            HashMap hashMap3 = c0588g3.f1668f;
            if (hashMap3.containsKey(str3)) {
                Log.w("ActivityResultRegistry", "Dropping pending result for request " + str3 + ": " + hashMap3.get(str3));
                hashMap3.remove(str3);
            }
            Bundle bundle3 = c0588g3.f1669g;
            if (bundle3.containsKey(str3)) {
                Log.w("ActivityResultRegistry", "Dropping pending result for request " + str3 + ": " + bundle3.getParcelable(str3));
                bundle3.remove(str3);
            }
            if (c0588g3.f1665c.get(str3) != null) {
                throw new ClassCastException();
            }
        }
    }

    /* renamed from: l */
    public final void m1686l() {
        for (AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p : this.f2128c.m124s()) {
            if (abstractComponentCallbacksC0666p != null) {
                abstractComponentCallbacksC0666p.f2298C = true;
                abstractComponentCallbacksC0666p.f2331t.m1686l();
            }
        }
    }

    /* renamed from: m */
    public final void m1687m(boolean z2) {
        for (AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p : this.f2128c.m124s()) {
            if (abstractComponentCallbacksC0666p != null) {
                abstractComponentCallbacksC0666p.f2331t.m1687m(z2);
            }
        }
    }

    /* renamed from: n */
    public final boolean m1688n() {
        if (this.f2138m < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p : this.f2128c.m124s()) {
            if (abstractComponentCallbacksC0666p != null) {
                if (!abstractComponentCallbacksC0666p.f2336y ? abstractComponentCallbacksC0666p.f2331t.m1688n() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: o */
    public final void m1689o() {
        if (this.f2138m < 1) {
            return;
        }
        for (AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p : this.f2128c.m124s()) {
            if (abstractComponentCallbacksC0666p != null && !abstractComponentCallbacksC0666p.f2336y) {
                abstractComponentCallbacksC0666p.f2331t.m1689o();
            }
        }
    }

    /* renamed from: p */
    public final void m1690p(AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p) {
        if (abstractComponentCallbacksC0666p != null) {
            if (abstractComponentCallbacksC0666p.equals(this.f2128c.m114i(abstractComponentCallbacksC0666p.f2316e))) {
                abstractComponentCallbacksC0666p.f2329r.getClass();
                boolean m1655F = m1655F(abstractComponentCallbacksC0666p);
                Boolean bool = abstractComponentCallbacksC0666p.f2321j;
                if (bool == null || bool.booleanValue() != m1655F) {
                    abstractComponentCallbacksC0666p.f2321j = Boolean.valueOf(m1655F);
                    C0638E c0638e = abstractComponentCallbacksC0666p.f2331t;
                    c0638e.m1674V();
                    c0638e.m1690p(c0638e.f2142q);
                }
            }
        }
    }

    /* renamed from: q */
    public final void m1691q(boolean z2) {
        for (AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p : this.f2128c.m124s()) {
            if (abstractComponentCallbacksC0666p != null) {
                abstractComponentCallbacksC0666p.f2331t.m1691q(z2);
            }
        }
    }

    /* renamed from: r */
    public final boolean m1692r() {
        if (this.f2138m < 1) {
            return false;
        }
        boolean z2 = false;
        for (AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p : this.f2128c.m124s()) {
            if (abstractComponentCallbacksC0666p != null && m1654E(abstractComponentCallbacksC0666p)) {
                if (!abstractComponentCallbacksC0666p.f2336y ? abstractComponentCallbacksC0666p.f2331t.m1692r() : false) {
                    z2 = true;
                }
            }
        }
        return z2;
    }

    /* renamed from: s */
    public final void m1693s(int r5) {
        try {
            this.f2127b = true;
            for (C0644K c0644k : ((HashMap) this.f2128c.f26c).values()) {
                if (c0644k != null) {
                    c0644k.f2190e = r5;
                }
            }
            m1660G(r5, false);
            Iterator it = m1679e().iterator();
            while (it.hasNext()) {
                ((C0658h) it.next()).m1749e();
            }
            this.f2127b = false;
            m1697w(true);
        } catch (Throwable th) {
            this.f2127b = false;
            throw th;
        }
    }

    /* renamed from: t */
    public final void m1694t(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2;
        String m15j = AbstractC0002c.m15j(str, "    ");
        C0015h c0015h = this.f2128c;
        c0015h.getClass();
        String str3 = str + "    ";
        HashMap hashMap = (HashMap) c0015h.f26c;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C0644K c0644k : hashMap.values()) {
                printWriter.print(str);
                if (c0644k != null) {
                    AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p = c0644k.f2188c;
                    printWriter.println(abstractComponentCallbacksC0666p);
                    abstractComponentCallbacksC0666p.getClass();
                    printWriter.print(str3);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0666p.f2333v));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0666p.f2334w));
                    printWriter.print(" mTag=");
                    printWriter.println(abstractComponentCallbacksC0666p.f2335x);
                    printWriter.print(str3);
                    printWriter.print("mState=");
                    printWriter.print(abstractComponentCallbacksC0666p.f2312a);
                    printWriter.print(" mWho=");
                    printWriter.print(abstractComponentCallbacksC0666p.f2316e);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(abstractComponentCallbacksC0666p.f2328q);
                    printWriter.print(str3);
                    printWriter.print("mAdded=");
                    printWriter.print(abstractComponentCallbacksC0666p.f2322k);
                    printWriter.print(" mRemoving=");
                    printWriter.print(abstractComponentCallbacksC0666p.f2323l);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(abstractComponentCallbacksC0666p.f2324m);
                    printWriter.print(" mInLayout=");
                    printWriter.println(abstractComponentCallbacksC0666p.f2325n);
                    printWriter.print(str3);
                    printWriter.print("mHidden=");
                    printWriter.print(abstractComponentCallbacksC0666p.f2336y);
                    printWriter.print(" mDetached=");
                    printWriter.print(abstractComponentCallbacksC0666p.f2337z);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(abstractComponentCallbacksC0666p.f2297B);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(str3);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(abstractComponentCallbacksC0666p.f2296A);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(abstractComponentCallbacksC0666p.f2302G);
                    if (abstractComponentCallbacksC0666p.f2329r != null) {
                        printWriter.print(str3);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(abstractComponentCallbacksC0666p.f2329r);
                    }
                    if (abstractComponentCallbacksC0666p.f2330s != null) {
                        printWriter.print(str3);
                        printWriter.print("mHost=");
                        printWriter.println(abstractComponentCallbacksC0666p.f2330s);
                    }
                    if (abstractComponentCallbacksC0666p.f2332u != null) {
                        printWriter.print(str3);
                        printWriter.print("mParentFragment=");
                        printWriter.println(abstractComponentCallbacksC0666p.f2332u);
                    }
                    if (abstractComponentCallbacksC0666p.f2317f != null) {
                        printWriter.print(str3);
                        printWriter.print("mArguments=");
                        printWriter.println(abstractComponentCallbacksC0666p.f2317f);
                    }
                    if (abstractComponentCallbacksC0666p.f2313b != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(abstractComponentCallbacksC0666p.f2313b);
                    }
                    if (abstractComponentCallbacksC0666p.f2314c != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(abstractComponentCallbacksC0666p.f2314c);
                    }
                    if (abstractComponentCallbacksC0666p.f2315d != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(abstractComponentCallbacksC0666p.f2315d);
                    }
                    Object obj = abstractComponentCallbacksC0666p.f2318g;
                    if (obj == null) {
                        C0638E c0638e = abstractComponentCallbacksC0666p.f2329r;
                        obj = (c0638e == null || (str2 = abstractComponentCallbacksC0666p.f2319h) == null) ? null : c0638e.f2128c.m114i(str2);
                    }
                    if (obj != null) {
                        printWriter.print(str3);
                        printWriter.print("mTarget=");
                        printWriter.print(obj);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(abstractComponentCallbacksC0666p.f2320i);
                    }
                    printWriter.print(str3);
                    printWriter.print("mPopDirection=");
                    C0664n c0664n = abstractComponentCallbacksC0666p.f2303H;
                    printWriter.println(c0664n == null ? false : c0664n.f2284a);
                    C0664n c0664n2 = abstractComponentCallbacksC0666p.f2303H;
                    if ((c0664n2 == null ? 0 : c0664n2.f2285b) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getEnterAnim=");
                        C0664n c0664n3 = abstractComponentCallbacksC0666p.f2303H;
                        printWriter.println(c0664n3 == null ? 0 : c0664n3.f2285b);
                    }
                    C0664n c0664n4 = abstractComponentCallbacksC0666p.f2303H;
                    if ((c0664n4 == null ? 0 : c0664n4.f2286c) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getExitAnim=");
                        C0664n c0664n5 = abstractComponentCallbacksC0666p.f2303H;
                        printWriter.println(c0664n5 == null ? 0 : c0664n5.f2286c);
                    }
                    C0664n c0664n6 = abstractComponentCallbacksC0666p.f2303H;
                    if ((c0664n6 == null ? 0 : c0664n6.f2287d) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopEnterAnim=");
                        C0664n c0664n7 = abstractComponentCallbacksC0666p.f2303H;
                        printWriter.println(c0664n7 == null ? 0 : c0664n7.f2287d);
                    }
                    C0664n c0664n8 = abstractComponentCallbacksC0666p.f2303H;
                    if ((c0664n8 == null ? 0 : c0664n8.f2288e) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopExitAnim=");
                        C0664n c0664n9 = abstractComponentCallbacksC0666p.f2303H;
                        printWriter.println(c0664n9 != null ? c0664n9.f2288e : 0);
                    }
                    if (abstractComponentCallbacksC0666p.f2299D != null) {
                        printWriter.print(str3);
                        printWriter.print("mContainer=");
                        printWriter.println(abstractComponentCallbacksC0666p.f2299D);
                    }
                    if (abstractComponentCallbacksC0666p.f2300E != null) {
                        printWriter.print(str3);
                        printWriter.print("mView=");
                        printWriter.println(abstractComponentCallbacksC0666p.f2300E);
                    }
                    if (abstractComponentCallbacksC0666p.m1765h() != null) {
                        new C0113k(abstractComponentCallbacksC0666p, abstractComponentCallbacksC0666p.mo1474d()).m378b(str3, printWriter);
                    }
                    printWriter.print(str3);
                    printWriter.println("Child " + abstractComponentCallbacksC0666p.f2331t + StringUtils.PROCESS_POSTFIX_DELIMITER);
                    abstractComponentCallbacksC0666p.f2331t.m1694t(AbstractC0002c.m15j(str3, "  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = (ArrayList) c0015h.f25b;
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int r2 = 0; r2 < size3; r2++) {
                AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p2 = (AbstractComponentCallbacksC0666p) arrayList.get(r2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(r2);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0666p2.toString());
            }
        }
        ArrayList arrayList2 = this.f2130e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int r13 = 0; r13 < size2; r13++) {
                AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p3 = (AbstractComponentCallbacksC0666p) this.f2130e.get(r13);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(r13);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0666p3.toString());
            }
        }
        ArrayList arrayList3 = this.f2129d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int r132 = 0; r132 < size; r132++) {
                C0651a c0651a = (C0651a) this.f2129d.get(r132);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(r132);
                printWriter.print(": ");
                printWriter.println(c0651a.toString());
                c0651a.m1735f(m15j, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f2134i.get());
        synchronized (this.f2126a) {
            try {
                int size4 = this.f2126a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int r12 = 0; r12 < size4; r12++) {
                        Object obj2 = (InterfaceC0636C) this.f2126a.get(r12);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(r12);
                        printWriter.print(": ");
                        printWriter.println(obj2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f2139n);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f2140o);
        if (this.f2141p != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f2141p);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f2138m);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f2150y);
        printWriter.print(" mStopped=");
        printWriter.print(this.f2151z);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f2119A);
        if (this.f2149x) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f2149x);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p = this.f2141p;
        if (abstractComponentCallbacksC0666p != null) {
            sb.append(abstractComponentCallbacksC0666p.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f2141p)));
            sb.append("}");
        } else {
            C0669s c0669s = this.f2139n;
            if (c0669s != null) {
                sb.append(c0669s.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f2139n)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    /* renamed from: u */
    public final void m1695u(InterfaceC0636C interfaceC0636C, boolean z2) {
        if (!z2) {
            if (this.f2139n == null) {
                if (!this.f2119A) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (this.f2150y || this.f2151z) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f2126a) {
            try {
                if (this.f2139n == null) {
                    if (!z2) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f2126a.add(interfaceC0636C);
                    m1668O();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: v */
    public final void m1696v(boolean z2) {
        if (this.f2127b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f2139n == null) {
            if (!this.f2119A) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f2139n.f2344f.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z2 && (this.f2150y || this.f2151z)) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f2121C == null) {
            this.f2121C = new ArrayList();
            this.f2122D = new ArrayList();
        }
        this.f2127b = false;
    }

    /* renamed from: w */
    public final boolean m1697w(boolean z2) {
        boolean z3;
        m1696v(z2);
        boolean z4 = false;
        while (true) {
            ArrayList arrayList = this.f2121C;
            ArrayList arrayList2 = this.f2122D;
            synchronized (this.f2126a) {
                try {
                    if (this.f2126a.isEmpty()) {
                        z3 = false;
                    } else {
                        int size = this.f2126a.size();
                        z3 = false;
                        for (int r5 = 0; r5 < size; r5++) {
                            z3 |= ((InterfaceC0636C) this.f2126a.get(r5)).mo1652a(arrayList, arrayList2);
                        }
                        this.f2126a.clear();
                        this.f2139n.f2344f.removeCallbacks(this.f2125G);
                    }
                } finally {
                }
            }
            if (!z3) {
                break;
            }
            z4 = true;
            this.f2127b = true;
            try {
                m1665L(this.f2121C, this.f2122D);
            } finally {
                m1678d();
            }
        }
        m1674V();
        if (this.f2120B) {
            this.f2120B = false;
            m1673U();
        }
        ((HashMap) this.f2128c.f26c).values().removeAll(Collections.singleton(null));
        return z4;
    }

    /* renamed from: x */
    public final void m1698x(ArrayList arrayList, ArrayList arrayList2, int r23, int r24) {
        ViewGroup viewGroup;
        C0015h c0015h;
        C0015h c0015h2;
        C0015h c0015h3;
        int r02;
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = arrayList2;
        boolean z2 = ((C0651a) arrayList3.get(r23)).f2229o;
        ArrayList arrayList5 = this.f2123E;
        if (arrayList5 == null) {
            this.f2123E = new ArrayList();
        } else {
            arrayList5.clear();
        }
        ArrayList arrayList6 = this.f2123E;
        C0015h c0015h4 = this.f2128c;
        arrayList6.addAll(c0015h4.m124s());
        AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p = this.f2142q;
        int r9 = r23;
        boolean z3 = false;
        while (true) {
            int r11 = 1;
            if (r9 >= r24) {
                C0015h c0015h5 = c0015h4;
                this.f2123E.clear();
                if (!z2 && this.f2138m >= 1) {
                    for (int r03 = r23; r03 < r24; r03++) {
                        Iterator it = ((C0651a) arrayList.get(r03)).f2215a.iterator();
                        while (it.hasNext()) {
                            AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p2 = ((C0645L) it.next()).f2192b;
                            if (abstractComponentCallbacksC0666p2 == null || abstractComponentCallbacksC0666p2.f2329r == null) {
                                c0015h = c0015h5;
                            } else {
                                c0015h = c0015h5;
                                c0015h.m129x(m1680f(abstractComponentCallbacksC0666p2));
                            }
                            c0015h5 = c0015h;
                        }
                    }
                }
                for (int r04 = r23; r04 < r24; r04++) {
                    C0651a c0651a = (C0651a) arrayList.get(r04);
                    if (((Boolean) arrayList2.get(r04)).booleanValue()) {
                        c0651a.m1732c(-1);
                        ArrayList arrayList7 = c0651a.f2215a;
                        for (int size = arrayList7.size() - 1; size >= 0; size--) {
                            C0645L c0645l = (C0645L) arrayList7.get(size);
                            AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p3 = c0645l.f2192b;
                            if (abstractComponentCallbacksC0666p3 != null) {
                                if (abstractComponentCallbacksC0666p3.f2303H != null) {
                                    abstractComponentCallbacksC0666p3.m1763f().f2284a = true;
                                }
                                int r112 = c0651a.f2220f;
                                int r12 = r112 != 4097 ? r112 != 4099 ? r112 != 8194 ? 0 : 4097 : 4099 : 8194;
                                if (abstractComponentCallbacksC0666p3.f2303H != null || r12 != 0) {
                                    abstractComponentCallbacksC0666p3.m1763f();
                                    abstractComponentCallbacksC0666p3.f2303H.f2289f = r12;
                                }
                                abstractComponentCallbacksC0666p3.m1763f();
                                abstractComponentCallbacksC0666p3.f2303H.getClass();
                            }
                            int r113 = c0645l.f2191a;
                            C0638E c0638e = c0651a.f2230p;
                            switch (r113) {
                                case 1:
                                    abstractComponentCallbacksC0666p3.m1772y(c0645l.f2193c, c0645l.f2194d, c0645l.f2195e, c0645l.f2196f);
                                    c0638e.m1669P(abstractComponentCallbacksC0666p3, true);
                                    c0638e.m1664K(abstractComponentCallbacksC0666p3);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + c0645l.f2191a);
                                case 3:
                                    abstractComponentCallbacksC0666p3.m1772y(c0645l.f2193c, c0645l.f2194d, c0645l.f2195e, c0645l.f2196f);
                                    c0638e.m1675a(abstractComponentCallbacksC0666p3);
                                    break;
                                case 4:
                                    abstractComponentCallbacksC0666p3.m1772y(c0645l.f2193c, c0645l.f2194d, c0645l.f2195e, c0645l.f2196f);
                                    c0638e.getClass();
                                    m1656T(abstractComponentCallbacksC0666p3);
                                    break;
                                case 5:
                                    abstractComponentCallbacksC0666p3.m1772y(c0645l.f2193c, c0645l.f2194d, c0645l.f2195e, c0645l.f2196f);
                                    c0638e.m1669P(abstractComponentCallbacksC0666p3, true);
                                    c0638e.m1659C(abstractComponentCallbacksC0666p3);
                                    break;
                                case 6:
                                    abstractComponentCallbacksC0666p3.m1772y(c0645l.f2193c, c0645l.f2194d, c0645l.f2195e, c0645l.f2196f);
                                    c0638e.m1677c(abstractComponentCallbacksC0666p3);
                                    break;
                                case 7:
                                    abstractComponentCallbacksC0666p3.m1772y(c0645l.f2193c, c0645l.f2194d, c0645l.f2195e, c0645l.f2196f);
                                    c0638e.m1669P(abstractComponentCallbacksC0666p3, true);
                                    c0638e.m1681g(abstractComponentCallbacksC0666p3);
                                    break;
                                case 8:
                                    c0638e.m1671R(null);
                                    break;
                                case 9:
                                    c0638e.m1671R(abstractComponentCallbacksC0666p3);
                                    break;
                                case 10:
                                    c0638e.m1670Q(abstractComponentCallbacksC0666p3, c0645l.f2197g);
                                    break;
                            }
                        }
                    } else {
                        c0651a.m1732c(1);
                        ArrayList arrayList8 = c0651a.f2215a;
                        int size2 = arrayList8.size();
                        for (int r92 = 0; r92 < size2; r92++) {
                            C0645L c0645l2 = (C0645L) arrayList8.get(r92);
                            AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p4 = c0645l2.f2192b;
                            if (abstractComponentCallbacksC0666p4 != null) {
                                if (abstractComponentCallbacksC0666p4.f2303H != null) {
                                    abstractComponentCallbacksC0666p4.m1763f().f2284a = false;
                                }
                                int r122 = c0651a.f2220f;
                                if (abstractComponentCallbacksC0666p4.f2303H != null || r122 != 0) {
                                    abstractComponentCallbacksC0666p4.m1763f();
                                    abstractComponentCallbacksC0666p4.f2303H.f2289f = r122;
                                }
                                abstractComponentCallbacksC0666p4.m1763f();
                                abstractComponentCallbacksC0666p4.f2303H.getClass();
                            }
                            int r123 = c0645l2.f2191a;
                            C0638E c0638e2 = c0651a.f2230p;
                            switch (r123) {
                                case 1:
                                    abstractComponentCallbacksC0666p4.m1772y(c0645l2.f2193c, c0645l2.f2194d, c0645l2.f2195e, c0645l2.f2196f);
                                    c0638e2.m1669P(abstractComponentCallbacksC0666p4, false);
                                    c0638e2.m1675a(abstractComponentCallbacksC0666p4);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + c0645l2.f2191a);
                                case 3:
                                    abstractComponentCallbacksC0666p4.m1772y(c0645l2.f2193c, c0645l2.f2194d, c0645l2.f2195e, c0645l2.f2196f);
                                    c0638e2.m1664K(abstractComponentCallbacksC0666p4);
                                    break;
                                case 4:
                                    abstractComponentCallbacksC0666p4.m1772y(c0645l2.f2193c, c0645l2.f2194d, c0645l2.f2195e, c0645l2.f2196f);
                                    c0638e2.m1659C(abstractComponentCallbacksC0666p4);
                                    break;
                                case 5:
                                    abstractComponentCallbacksC0666p4.m1772y(c0645l2.f2193c, c0645l2.f2194d, c0645l2.f2195e, c0645l2.f2196f);
                                    c0638e2.m1669P(abstractComponentCallbacksC0666p4, false);
                                    m1656T(abstractComponentCallbacksC0666p4);
                                    break;
                                case 6:
                                    abstractComponentCallbacksC0666p4.m1772y(c0645l2.f2193c, c0645l2.f2194d, c0645l2.f2195e, c0645l2.f2196f);
                                    c0638e2.m1681g(abstractComponentCallbacksC0666p4);
                                    break;
                                case 7:
                                    abstractComponentCallbacksC0666p4.m1772y(c0645l2.f2193c, c0645l2.f2194d, c0645l2.f2195e, c0645l2.f2196f);
                                    c0638e2.m1669P(abstractComponentCallbacksC0666p4, false);
                                    c0638e2.m1677c(abstractComponentCallbacksC0666p4);
                                    break;
                                case 8:
                                    c0638e2.m1671R(abstractComponentCallbacksC0666p4);
                                    break;
                                case 9:
                                    c0638e2.m1671R(null);
                                    break;
                                case 10:
                                    c0638e2.m1670Q(abstractComponentCallbacksC0666p4, c0645l2.f2198h);
                                    break;
                            }
                        }
                    }
                }
                boolean booleanValue = ((Boolean) arrayList2.get(r24 - 1)).booleanValue();
                for (int r5 = r23; r5 < r24; r5++) {
                    C0651a c0651a2 = (C0651a) arrayList.get(r5);
                    if (booleanValue) {
                        for (int size3 = c0651a2.f2215a.size() - 1; size3 >= 0; size3--) {
                            AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p5 = ((C0645L) c0651a2.f2215a.get(size3)).f2192b;
                            if (abstractComponentCallbacksC0666p5 != null) {
                                m1680f(abstractComponentCallbacksC0666p5).m1717k();
                            }
                        }
                    } else {
                        Iterator it2 = c0651a2.f2215a.iterator();
                        while (it2.hasNext()) {
                            AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p6 = ((C0645L) it2.next()).f2192b;
                            if (abstractComponentCallbacksC0666p6 != null) {
                                m1680f(abstractComponentCallbacksC0666p6).m1717k();
                            }
                        }
                    }
                }
                m1660G(this.f2138m, true);
                HashSet hashSet = new HashSet();
                for (int r7 = r23; r7 < r24; r7++) {
                    Iterator it3 = ((C0651a) arrayList.get(r7)).f2215a.iterator();
                    while (it3.hasNext()) {
                        AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p7 = ((C0645L) it3.next()).f2192b;
                        if (abstractComponentCallbacksC0666p7 != null && (viewGroup = abstractComponentCallbacksC0666p7.f2299D) != null) {
                            hashSet.add(C0658h.m1744f(viewGroup, m1658B()));
                        }
                    }
                }
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    C0658h c0658h = (C0658h) it4.next();
                    c0658h.f2263d = booleanValue;
                    synchronized (c0658h.f2261b) {
                        try {
                            c0658h.m1750g();
                            c0658h.f2264e = false;
                            int size4 = c0658h.f2261b.size() - 1;
                            while (true) {
                                if (size4 >= 0) {
                                    C0649P c0649p = (C0649P) c0658h.f2261b.get(size4);
                                    int m8c = AbstractC0002c.m8c(c0649p.f2209c.f2300E);
                                    if (c0649p.f2207a != 2 || m8c == 2) {
                                        size4--;
                                    } else {
                                        c0649p.f2209c.getClass();
                                        c0658h.f2264e = false;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    c0658h.m1747c();
                }
                for (int r05 = r23; r05 < r24; r05++) {
                    C0651a c0651a3 = (C0651a) arrayList.get(r05);
                    if (((Boolean) arrayList2.get(r05)).booleanValue() && c0651a3.f2232r >= 0) {
                        c0651a3.f2232r = -1;
                    }
                    c0651a3.getClass();
                }
                return;
            }
            C0651a c0651a4 = (C0651a) arrayList3.get(r9);
            if (((Boolean) arrayList4.get(r9)).booleanValue()) {
                c0015h2 = c0015h4;
                int r06 = 1;
                ArrayList arrayList9 = this.f2123E;
                ArrayList arrayList10 = c0651a4.f2215a;
                int size5 = arrayList10.size() - 1;
                while (size5 >= 0) {
                    C0645L c0645l3 = (C0645L) arrayList10.get(size5);
                    int r114 = c0645l3.f2191a;
                    if (r114 != r06) {
                        if (r114 != 3) {
                            switch (r114) {
                                case 8:
                                    abstractComponentCallbacksC0666p = null;
                                    break;
                                case 9:
                                    abstractComponentCallbacksC0666p = c0645l3.f2192b;
                                    break;
                                case 10:
                                    c0645l3.f2198h = c0645l3.f2197g;
                                    break;
                            }
                            size5--;
                            r06 = 1;
                        }
                        arrayList9.add(c0645l3.f2192b);
                        size5--;
                        r06 = 1;
                    }
                    arrayList9.remove(c0645l3.f2192b);
                    size5--;
                    r06 = 1;
                }
            } else {
                ArrayList arrayList11 = this.f2123E;
                int r8 = 0;
                while (true) {
                    ArrayList arrayList12 = c0651a4.f2215a;
                    if (r8 < arrayList12.size()) {
                        C0645L c0645l4 = (C0645L) arrayList12.get(r8);
                        int r3 = c0645l4.f2191a;
                        if (r3 != r11) {
                            if (r3 != 2) {
                                if (r3 == 3 || r3 == 6) {
                                    arrayList11.remove(c0645l4.f2192b);
                                    AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p8 = c0645l4.f2192b;
                                    if (abstractComponentCallbacksC0666p8 == abstractComponentCallbacksC0666p) {
                                        arrayList12.add(r8, new C0645L(9, abstractComponentCallbacksC0666p8));
                                        r8++;
                                        c0015h3 = c0015h4;
                                        r02 = 1;
                                        abstractComponentCallbacksC0666p = null;
                                    }
                                } else if (r3 == 7) {
                                    c0015h3 = c0015h4;
                                    r02 = 1;
                                } else if (r3 == 8) {
                                    arrayList12.add(r8, new C0645L(9, abstractComponentCallbacksC0666p));
                                    r8++;
                                    abstractComponentCallbacksC0666p = c0645l4.f2192b;
                                }
                                c0015h3 = c0015h4;
                                r02 = 1;
                            } else {
                                AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p9 = c0645l4.f2192b;
                                int r115 = abstractComponentCallbacksC0666p9.f2334w;
                                int size6 = arrayList11.size() - 1;
                                boolean z4 = false;
                                while (size6 >= 0) {
                                    C0015h c0015h6 = c0015h4;
                                    AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p10 = (AbstractComponentCallbacksC0666p) arrayList11.get(size6);
                                    if (abstractComponentCallbacksC0666p10.f2334w == r115) {
                                        if (abstractComponentCallbacksC0666p10 == abstractComponentCallbacksC0666p9) {
                                            z4 = true;
                                        } else {
                                            if (abstractComponentCallbacksC0666p10 == abstractComponentCallbacksC0666p) {
                                                arrayList12.add(r8, new C0645L(9, abstractComponentCallbacksC0666p10));
                                                r8++;
                                                abstractComponentCallbacksC0666p = null;
                                            }
                                            C0645L c0645l5 = new C0645L(3, abstractComponentCallbacksC0666p10);
                                            c0645l5.f2193c = c0645l4.f2193c;
                                            c0645l5.f2195e = c0645l4.f2195e;
                                            c0645l5.f2194d = c0645l4.f2194d;
                                            c0645l5.f2196f = c0645l4.f2196f;
                                            arrayList12.add(r8, c0645l5);
                                            arrayList11.remove(abstractComponentCallbacksC0666p10);
                                            r8++;
                                            abstractComponentCallbacksC0666p = abstractComponentCallbacksC0666p;
                                        }
                                    }
                                    size6--;
                                    c0015h4 = c0015h6;
                                }
                                c0015h3 = c0015h4;
                                r02 = 1;
                                if (z4) {
                                    arrayList12.remove(r8);
                                    r8--;
                                } else {
                                    c0645l4.f2191a = 1;
                                    arrayList11.add(abstractComponentCallbacksC0666p9);
                                }
                            }
                            r8 += r02;
                            r11 = r02;
                            c0015h4 = c0015h3;
                        } else {
                            c0015h3 = c0015h4;
                            r02 = r11;
                        }
                        arrayList11.add(c0645l4.f2192b);
                        r8 += r02;
                        r11 = r02;
                        c0015h4 = c0015h3;
                    } else {
                        c0015h2 = c0015h4;
                    }
                }
            }
            z3 = z3 || c0651a4.f2221g;
            r9++;
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
            c0015h4 = c0015h2;
        }
    }

    /* renamed from: y */
    public final AbstractComponentCallbacksC0666p m1699y(int r6) {
        C0015h c0015h = this.f2128c;
        ArrayList arrayList = (ArrayList) c0015h.f25b;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p = (AbstractComponentCallbacksC0666p) arrayList.get(size);
            if (abstractComponentCallbacksC0666p != null && abstractComponentCallbacksC0666p.f2333v == r6) {
                return abstractComponentCallbacksC0666p;
            }
        }
        for (C0644K c0644k : ((HashMap) c0015h.f26c).values()) {
            if (c0644k != null) {
                AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p2 = c0644k.f2188c;
                if (abstractComponentCallbacksC0666p2.f2333v == r6) {
                    return abstractComponentCallbacksC0666p2;
                }
            }
        }
        return null;
    }

    /* renamed from: z */
    public final ViewGroup m1700z(AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p) {
        ViewGroup viewGroup = abstractComponentCallbacksC0666p.f2299D;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (abstractComponentCallbacksC0666p.f2334w > 0 && this.f2140o.mo94z()) {
            View mo93y = this.f2140o.mo93y(abstractComponentCallbacksC0666p.f2334w);
            if (mo93y instanceof ViewGroup) {
                return (ViewGroup) mo93y;
            }
        }
        return null;
    }
}
