package p018G1;

import java.io.IOException;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.AbstractC2492i;
import p000A.AbstractC0002c;
import p002A1.C0016i;
import p006C.C0055g;
import p008C1.C0067B;
import p008C1.C0069a;
import p008C1.C0078j;
import p008C1.C0085q;
import p008C1.C0090v;
import p008C1.C0091w;
import p008C1.EnumC0089u;
import p010D0.C0109g;
import p011D1.AbstractC0115b;
import p011D1.AbstractC0119f;
import p011D1.AbstractC0122i;
import p011D1.C0118e;
import p016F1.C0136d;
import p036M1.C0389o;
import p103k0.AbstractC2480a;
import p108m1.AbstractC2658h;
import p108m1.AbstractC2665o;
import p108m1.C2657g;
import p111n1.C2680b;

/* renamed from: G1.p */
/* loaded from: classes.dex */
public final class C0165p {

    /* renamed from: a */
    public final C0136d f512a;

    /* renamed from: b */
    public final C0164o f513b;

    /* renamed from: c */
    public final int f514c;

    /* renamed from: d */
    public final int f515d;

    /* renamed from: e */
    public final int f516e;

    /* renamed from: f */
    public final int f517f;

    /* renamed from: g */
    public final int f518g;

    /* renamed from: h */
    public final boolean f519h;

    /* renamed from: i */
    public final boolean f520i;

    /* renamed from: j */
    public final C0069a f521j;

    /* renamed from: k */
    public final C0055g f522k;

    /* renamed from: l */
    public final C0109g f523l;

    /* renamed from: m */
    public C0169t f524m;

    /* renamed from: n */
    public C0170u f525n;

    /* renamed from: o */
    public C0067B f526o;

    /* renamed from: p */
    public final C2657g f527p;

    public C0165p(C0136d taskRunner, C0164o connectionPool, int r4, int r5, int r6, int r7, int r8, boolean z2, boolean z3, C0069a c0069a, C0055g routeDatabase, C0109g c0109g) {
        AbstractC2492i.m4915e(taskRunner, "taskRunner");
        AbstractC2492i.m4915e(connectionPool, "connectionPool");
        AbstractC2492i.m4915e(routeDatabase, "routeDatabase");
        this.f512a = taskRunner;
        this.f513b = connectionPool;
        this.f514c = r4;
        this.f515d = r5;
        this.f516e = r6;
        this.f517f = r7;
        this.f518g = r8;
        this.f519h = z2;
        this.f520i = z3;
        this.f521j = c0069a;
        this.f522k = routeDatabase;
        this.f523l = c0109g;
        this.f527p = new C2657g();
    }

    /* renamed from: a */
    public final C0069a m524a() {
        return this.f521j;
    }

    /* renamed from: b */
    public final C2657g m525b() {
        return this.f527p;
    }

    /* renamed from: c */
    public final boolean m526c(C0163n c0163n) {
        C0170u c0170u;
        C0067B c0067b;
        if (!this.f527p.isEmpty() || this.f526o != null) {
            return true;
        }
        if (c0163n != null) {
            synchronized (c0163n) {
                c0067b = null;
                if (c0163n.f499p == 0 && c0163n.f497n && AbstractC0122i.m411a(c0163n.f487d.f129a.f147h, this.f521j.f147h)) {
                    c0067b = c0163n.f487d;
                }
            }
            if (c0067b != null) {
                this.f526o = c0067b;
                return true;
            }
        }
        C0169t c0169t = this.f524m;
        if ((c0169t == null || c0169t.f532a >= ((ArrayList) c0169t.f533b).size()) && (c0170u = this.f525n) != null) {
            return c0170u.m534a();
        }
        return true;
    }

    /* renamed from: d */
    public final boolean m527d() {
        return ((C0162m) this.f523l.f338b).f482m;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x007f  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p018G1.InterfaceC0168s m528e() {
        /*
            r4 = this;
            D0.g r0 = r4.f523l
            java.lang.Object r1 = r0.f338b
            G1.m r1 = (p018G1.C0162m) r1
            G1.n r1 = r1.f477h
            r2 = 0
            if (r1 != 0) goto Le
        Lb:
            r0 = r2
            goto L7c
        Le:
            boolean r0 = r0.m372w()
            boolean r0 = r1.m521i(r0)
            monitor-enter(r1)
            if (r0 != 0) goto L2a
            r0 = 1
            r1.f497n = r0     // Catch: java.lang.Throwable -> L27
            D0.g r0 = r4.f523l     // Catch: java.lang.Throwable -> L27
            java.lang.Object r0 = r0.f338b     // Catch: java.lang.Throwable -> L27
            G1.m r0 = (p018G1.C0162m) r0     // Catch: java.lang.Throwable -> L27
            java.net.Socket r0 = r0.m515g()     // Catch: java.lang.Throwable -> L27
            goto L47
        L27:
            r0 = move-exception
            goto La5
        L2a:
            boolean r0 = r1.f497n     // Catch: java.lang.Throwable -> L27
            if (r0 != 0) goto L3d
            C1.B r0 = r1.f487d     // Catch: java.lang.Throwable -> L27
            C1.a r0 = r0.f129a     // Catch: java.lang.Throwable -> L27
            C1.q r0 = r0.f147h     // Catch: java.lang.Throwable -> L27
            boolean r0 = r4.m532i(r0)     // Catch: java.lang.Throwable -> L27
            if (r0 != 0) goto L3b
            goto L3d
        L3b:
            r0 = r2
            goto L47
        L3d:
            D0.g r0 = r4.f523l     // Catch: java.lang.Throwable -> L27
            java.lang.Object r0 = r0.f338b     // Catch: java.lang.Throwable -> L27
            G1.m r0 = (p018G1.C0162m) r0     // Catch: java.lang.Throwable -> L27
            java.net.Socket r0 = r0.m515g()     // Catch: java.lang.Throwable -> L27
        L47:
            monitor-exit(r1)
            D0.g r3 = r4.f523l
            java.lang.Object r3 = r3.f338b
            G1.m r3 = (p018G1.C0162m) r3
            G1.n r3 = r3.f477h
            if (r3 == 0) goto L62
            if (r0 != 0) goto L5a
            G1.q r0 = new G1.q
            r0.<init>(r1)
            goto L7c
        L5a:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L62:
            if (r0 == 0) goto L67
            p011D1.AbstractC0122i.m412b(r0)
        L67:
            D0.g r0 = r4.f523l
            java.lang.Object r0 = r0.f338b
            G1.m r0 = (p018G1.C0162m) r0
            r0.getClass()
            D0.g r0 = r4.f523l
            java.lang.String r1 = "call"
            java.lang.Object r0 = r0.f338b
            G1.m r0 = (p018G1.C0162m) r0
            kotlin.jvm.internal.AbstractC2492i.m4915e(r0, r1)
            goto Lb
        L7c:
            if (r0 == 0) goto L7f
            return r0
        L7f:
            G1.q r0 = r4.m531h(r2, r2)
            if (r0 == 0) goto L86
            return r0
        L86:
            m1.g r0 = r4.f527p
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L97
            m1.g r0 = r4.f527p
            java.lang.Object r0 = r0.m5103i()
            G1.s r0 = (p018G1.InterfaceC0168s) r0
            return r0
        L97:
            G1.c r0 = r4.m529f()
            java.util.List r1 = r0.f430l
            G1.q r1 = r4.m531h(r0, r1)
            if (r1 == 0) goto La4
            return r1
        La4:
            return r0
        La5:
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p018G1.C0165p.m528e():G1.s");
    }

    /* JADX WARN: Type inference failed for: r4v26, types: [java.lang.Object, java.util.List] */
    /* renamed from: f */
    public final C0152c m529f() {
        String str;
        int r7;
        List list;
        boolean contains;
        C0067B c0067b = this.f526o;
        if (c0067b != null) {
            this.f526o = null;
            return m530g(c0067b, null);
        }
        C0169t c0169t = this.f524m;
        if (c0169t != null && c0169t.f532a < ((ArrayList) c0169t.f533b).size()) {
            int r3 = c0169t.f532a;
            ArrayList arrayList = (ArrayList) c0169t.f533b;
            if (r3 >= arrayList.size()) {
                throw new NoSuchElementException();
            }
            int r32 = c0169t.f532a;
            c0169t.f532a = 1 + r32;
            return m530g((C0067B) arrayList.get(r32), null);
        }
        C0170u c0170u = this.f525n;
        if (c0170u == null) {
            c0170u = new C0170u(this.f521j, this.f522k, this.f523l, this.f520i);
            this.f525n = c0170u;
        }
        if (!c0170u.m534a()) {
            throw new IOException("exhausted all routes");
        }
        if (!c0170u.m534a()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList2 = new ArrayList();
        while (c0170u.f539f < c0170u.f538e.size()) {
            boolean z2 = c0170u.f539f < c0170u.f538e.size();
            C0069a c0069a = c0170u.f534a;
            if (!z2) {
                throw new SocketException("No route to " + c0069a.f147h.f242d + "; exhausted proxy configurations: " + c0170u.f538e);
            }
            List list2 = c0170u.f538e;
            int r6 = c0170u.f539f;
            c0170u.f539f = r6 + 1;
            Proxy proxy = (Proxy) list2.get(r6);
            ArrayList arrayList3 = new ArrayList();
            c0170u.f540g = arrayList3;
            if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                C0085q c0085q = c0069a.f147h;
                str = c0085q.f242d;
                r7 = c0085q.f243e;
            } else {
                SocketAddress address = proxy.address();
                if (!(address instanceof InetSocketAddress)) {
                    throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + address.getClass()).toString());
                }
                AbstractC2492i.m4912b(address);
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                AbstractC2492i.m4915e(inetSocketAddress, "<this>");
                InetAddress address2 = inetSocketAddress.getAddress();
                if (address2 == null) {
                    str = inetSocketAddress.getHostName();
                    AbstractC2492i.m4914d(str, "getHostName(...)");
                } else {
                    str = address2.getHostAddress();
                    AbstractC2492i.m4914d(str, "getHostAddress(...)");
                }
                r7 = inetSocketAddress.getPort();
            }
            if (1 > r7 || r7 >= 65536) {
                throw new SocketException("No route to " + str + ':' + r7 + "; port is out of range");
            }
            if (proxy.type() == Proxy.Type.SOCKS) {
                arrayList3.add(InetSocketAddress.createUnresolved(str, r7));
            } else {
                C0016i c0016i = AbstractC0115b.f351a;
                AbstractC2492i.m4915e(str, "<this>");
                C0016i c0016i2 = AbstractC0115b.f351a;
                c0016i2.getClass();
                if (c0016i2.f28a.matcher(str).matches()) {
                    list = AbstractC2480a.m4863D(InetAddress.getByName(str));
                } else {
                    C0109g c0109g = c0170u.f536c;
                    ((C0162m) c0109g.f338b).getClass();
                    c0069a.f140a.getClass();
                    try {
                        InetAddress[] allByName = InetAddress.getAllByName(str);
                        AbstractC2492i.m4914d(allByName, "getAllByName(...)");
                        List m5112J = AbstractC2658h.m5112J(allByName);
                        if (m5112J.isEmpty()) {
                            throw new UnknownHostException(c0069a.f140a + " returned no addresses for " + str);
                        }
                        ((C0162m) c0109g.f338b).getClass();
                        list = m5112J;
                    } catch (NullPointerException e2) {
                        UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
                        unknownHostException.initCause(e2);
                        throw unknownHostException;
                    }
                }
                if (c0170u.f537d && list.size() >= 2) {
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj : list) {
                        if (((InetAddress) obj) instanceof Inet6Address) {
                            arrayList4.add(obj);
                        } else {
                            arrayList5.add(obj);
                        }
                    }
                    if (!arrayList4.isEmpty() && !arrayList5.isEmpty()) {
                        byte[] bArr = AbstractC0119f.f362a;
                        Iterator it = arrayList4.iterator();
                        Iterator it2 = arrayList5.iterator();
                        C2680b c2680b = new C2680b(10);
                        while (true) {
                            if (!it.hasNext() && !it2.hasNext()) {
                                break;
                            }
                            if (it.hasNext()) {
                                c2680b.add(it.next());
                            }
                            if (it2.hasNext()) {
                                c2680b.add(it2.next());
                            }
                        }
                        if (c2680b.f8635e != null) {
                            throw new IllegalStateException();
                        }
                        c2680b.m5140g();
                        c2680b.f8634d = true;
                        list = c2680b.f8633c > 0 ? c2680b : C2680b.f8630g;
                    }
                }
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(new InetSocketAddress((InetAddress) it3.next(), r7));
                }
            }
            Iterator it4 = c0170u.f540g.iterator();
            while (it4.hasNext()) {
                C0067B c0067b2 = new C0067B(c0170u.f534a, proxy, (InetSocketAddress) it4.next());
                C0055g c0055g = c0170u.f535b;
                synchronized (c0055g) {
                    contains = ((LinkedHashSet) c0055g.f107b).contains(c0067b2);
                }
                if (contains) {
                    c0170u.f541h.add(c0067b2);
                } else {
                    arrayList2.add(c0067b2);
                }
            }
            if (!arrayList2.isEmpty()) {
                break;
            }
        }
        if (arrayList2.isEmpty()) {
            AbstractC2665o.m5123a0(arrayList2, c0170u.f541h);
            c0170u.f541h.clear();
        }
        C0169t c0169t2 = new C0169t(arrayList2);
        this.f524m = c0169t2;
        if (((C0162m) this.f523l.f338b).f482m) {
            throw new IOException("Canceled");
        }
        if (c0169t2.f532a >= arrayList2.size()) {
            throw new NoSuchElementException();
        }
        int r33 = c0169t2.f532a;
        c0169t2.f532a = 1 + r33;
        return m530g((C0067B) arrayList2.get(r33), arrayList2);
    }

    /* renamed from: g */
    public final C0152c m530g(C0067B route, List list) {
        C0091w c0091w;
        AbstractC2492i.m4915e(route, "route");
        C0069a c0069a = route.f129a;
        SSLSocketFactory sSLSocketFactory = c0069a.f142c;
        EnumC0089u enumC0089u = EnumC0089u.H2_PRIOR_KNOWLEDGE;
        if (sSLSocketFactory == null) {
            if (!c0069a.f149j.contains(C0078j.f200f)) {
                throw new UnknownServiceException("CLEARTEXT communication not enabled for client");
            }
            String str = route.f129a.f147h.f242d;
            C0389o c0389o = C0389o.f1050a;
            if (!C0389o.f1050a.mo1062h(str)) {
                throw new UnknownServiceException(AbstractC0002c.m16k("CLEARTEXT communication to ", str, " not permitted by network security policy"));
            }
        } else if (c0069a.f148i.contains(enumC0089u)) {
            throw new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
        }
        if (route.f130b.type() == Proxy.Type.HTTP) {
            C0069a c0069a2 = route.f129a;
            if (c0069a2.f142c != null || c0069a2.f148i.contains(enumC0089u)) {
                C0090v c0090v = new C0090v();
                C0085q url = route.f129a.f147h;
                AbstractC2492i.m4915e(url, "url");
                c0090v.f289c = url;
                c0090v.m297h("CONNECT", null);
                C0069a c0069a3 = route.f129a;
                c0090v.m296g("Host", AbstractC0122i.m419i(c0069a3.f147h, true));
                c0090v.m296g("Proxy-Connection", "Keep-Alive");
                c0090v.m296g("User-Agent", "okhttp/5.0.0-alpha.14");
                C0091w c0091w2 = new C0091w(c0090v);
                C0118e body = AbstractC0119f.f364c;
                C0055g c0055g = new C0055g(2);
                AbstractC2480a.m4893v("Proxy-Authenticate");
                AbstractC2480a.m4894w("OkHttp-Preemptive", "Proxy-Authenticate");
                c0055g.m224w("Proxy-Authenticate");
                AbstractC2480a.m4883e(c0055g, "Proxy-Authenticate", "OkHttp-Preemptive");
                c0055g.m218q();
                AbstractC2492i.m4915e(body, "body");
                c0069a3.f145f.getClass();
                c0091w = c0091w2;
                return new C0152c(this.f512a, this.f513b, this.f514c, this.f515d, this.f516e, this.f517f, this.f518g, this.f519h, this.f523l, this, route, list, 0, c0091w, -1, false);
            }
        }
        c0091w = null;
        return new C0152c(this.f512a, this.f513b, this.f514c, this.f515d, this.f516e, this.f517f, this.f518g, this.f519h, this.f523l, this, route, list, 0, c0091w, -1, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x003c, code lost:
    
        if ((r7.f496m != null) == false) goto L19;
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p018G1.C0166q m531h(p018G1.C0152c r11, java.util.List r12) {
        /*
            r10 = this;
            G1.o r0 = r10.f513b
            D0.g r1 = r10.f523l
            boolean r1 = r1.m372w()
            C1.a r2 = r10.f521j
            D0.g r3 = r10.f523l
            r4 = 1
            r5 = 0
            if (r11 == 0) goto L18
            boolean r6 = r11.mo484c()
            if (r6 == 0) goto L18
            r6 = r4
            goto L19
        L18:
            r6 = r5
        L19:
            r0.getClass()
            java.util.concurrent.ConcurrentLinkedQueue r0 = r0.f511g
            java.util.Iterator r0 = r0.iterator()
        L22:
            boolean r7 = r0.hasNext()
            r8 = 0
            if (r7 == 0) goto L6d
            java.lang.Object r7 = r0.next()
            G1.n r7 = (p018G1.C0163n) r7
            kotlin.jvm.internal.AbstractC2492i.m4912b(r7)
            monitor-enter(r7)
            if (r6 == 0) goto L40
            J1.s r9 = r7.f496m     // Catch: java.lang.Throwable -> L6a
            if (r9 == 0) goto L3b
            r9 = r4
            goto L3c
        L3b:
            r9 = r5
        L3c:
            if (r9 != 0) goto L40
        L3e:
            r9 = r5
            goto L4b
        L40:
            boolean r9 = r7.m520g(r2, r12)     // Catch: java.lang.Throwable -> L6a
            if (r9 != 0) goto L47
            goto L3e
        L47:
            r3.m351a(r7)     // Catch: java.lang.Throwable -> L6a
            r9 = r4
        L4b:
            monitor-exit(r7)
            if (r9 == 0) goto L22
            boolean r9 = r7.m521i(r1)
            if (r9 == 0) goto L55
            goto L6e
        L55:
            monitor-enter(r7)
            r7.f497n = r4     // Catch: java.lang.Throwable -> L67
            java.lang.Object r8 = r3.f338b     // Catch: java.lang.Throwable -> L67
            G1.m r8 = (p018G1.C0162m) r8     // Catch: java.lang.Throwable -> L67
            java.net.Socket r8 = r8.m515g()     // Catch: java.lang.Throwable -> L67
            monitor-exit(r7)
            if (r8 == 0) goto L22
            p011D1.AbstractC0122i.m412b(r8)
            goto L22
        L67:
            r11 = move-exception
            monitor-exit(r7)
            throw r11
        L6a:
            r11 = move-exception
            monitor-exit(r7)
            throw r11
        L6d:
            r7 = r8
        L6e:
            if (r7 != 0) goto L71
            return r8
        L71:
            if (r11 == 0) goto L7e
            C1.B r12 = r11.f429k
            r10.f526o = r12
            java.net.Socket r11 = r11.f437s
            if (r11 == 0) goto L7e
            p011D1.AbstractC0122i.m412b(r11)
        L7e:
            D0.g r11 = r10.f523l
            r11.m356f(r7)
            D0.g r11 = r10.f523l
            r11.m357g(r7)
            G1.q r11 = new G1.q
            r11.<init>(r7)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p018G1.C0165p.m531h(G1.c, java.util.List):G1.q");
    }

    /* renamed from: i */
    public final boolean m532i(C0085q url) {
        AbstractC2492i.m4915e(url, "url");
        C0085q c0085q = this.f521j.f147h;
        return url.f243e == c0085q.f243e && AbstractC2492i.m4911a(url.f242d, c0085q.f242d);
    }
}
