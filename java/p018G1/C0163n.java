package p018G1;

import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC2492i;
import p006C.C0055g;
import p008C1.C0067B;
import p008C1.C0069a;
import p008C1.C0070b;
import p008C1.C0082n;
import p008C1.C0083o;
import p008C1.C0084p;
import p008C1.C0088t;
import p008C1.EnumC0089u;
import p011D1.AbstractC0122i;
import p016F1.C0135c;
import p016F1.C0136d;
import p021H1.InterfaceC0188d;
import p027J1.AbstractC0248h;
import p027J1.AbstractC0251k;
import p027J1.C0234B;
import p027J1.C0235C;
import p027J1.C0239G;
import p027J1.C0240H;
import p027J1.C0241a;
import p027J1.C0243c;
import p027J1.C0259s;
import p027J1.EnumC0242b;
import p051R1.C0480j;
import p051R1.C0493w;
import p051R1.C0494x;

/* renamed from: G1.n */
/* loaded from: classes.dex */
public final class C0163n extends AbstractC0251k implements InterfaceC0188d {

    /* renamed from: b */
    public final C0136d f485b;

    /* renamed from: c */
    public final C0164o f486c;

    /* renamed from: d */
    public final C0067B f487d;

    /* renamed from: e */
    public final Socket f488e;

    /* renamed from: f */
    public final Socket f489f;

    /* renamed from: g */
    public final C0082n f490g;

    /* renamed from: h */
    public final EnumC0089u f491h;

    /* renamed from: i */
    public final C0494x f492i;

    /* renamed from: j */
    public final C0493w f493j;

    /* renamed from: k */
    public final int f494k;

    /* renamed from: l */
    public final C0070b f495l;

    /* renamed from: m */
    public C0259s f496m;

    /* renamed from: n */
    public boolean f497n;

    /* renamed from: o */
    public boolean f498o;

    /* renamed from: p */
    public int f499p;

    /* renamed from: q */
    public int f500q;

    /* renamed from: r */
    public int f501r;

    /* renamed from: s */
    public int f502s;

    /* renamed from: t */
    public final ArrayList f503t;

    /* renamed from: u */
    public long f504u;

    public C0163n(C0136d taskRunner, C0164o connectionPool, C0067B route, Socket socket, Socket socket2, C0082n c0082n, EnumC0089u enumC0089u, C0494x c0494x, C0493w c0493w, int r11, C0070b c0070b) {
        AbstractC2492i.m4915e(taskRunner, "taskRunner");
        AbstractC2492i.m4915e(connectionPool, "connectionPool");
        AbstractC2492i.m4915e(route, "route");
        this.f485b = taskRunner;
        this.f486c = connectionPool;
        this.f487d = route;
        this.f488e = socket;
        this.f489f = socket2;
        this.f490g = c0082n;
        this.f491h = enumC0089u;
        this.f492i = c0494x;
        this.f493j = c0493w;
        this.f494k = r11;
        this.f495l = c0070b;
        this.f502s = 1;
        this.f503t = new ArrayList();
        this.f504u = Long.MAX_VALUE;
    }

    /* renamed from: e */
    public static void m516e(C0088t c0088t, C0067B failedRoute, IOException failure) {
        AbstractC2492i.m4915e(failedRoute, "failedRoute");
        AbstractC2492i.m4915e(failure, "failure");
        if (failedRoute.f130b.type() != Proxy.Type.DIRECT) {
            C0069a c0069a = failedRoute.f129a;
            c0069a.f146g.connectFailed(c0069a.f147h.m288g(), failedRoute.f130b.address(), failure);
        }
        C0055g c0055g = c0088t.f275y;
        synchronized (c0055g) {
            ((LinkedHashSet) c0055g.f107b).add(failedRoute);
        }
    }

    @Override // p027J1.AbstractC0251k
    /* renamed from: a */
    public final synchronized void mo517a(C0259s connection, C0239G settings) {
        try {
            AbstractC2492i.m4915e(connection, "connection");
            AbstractC2492i.m4915e(settings, "settings");
            int r3 = this.f502s;
            int r4 = (settings.f702a & 16) != 0 ? settings.f703b[4] : Integer.MAX_VALUE;
            this.f502s = r4;
            if (r4 < r3) {
                if (this.f486c.f508d.get(this.f487d.f129a) != null) {
                    throw new ClassCastException();
                }
            } else if (r4 > r3) {
                C0164o c0164o = this.f486c;
                c0164o.f509e.m430d(c0164o.f510f, 0L);
            }
        } finally {
        }
    }

    @Override // p021H1.InterfaceC0188d
    /* renamed from: b */
    public final void mo483b(C0162m call, IOException iOException) {
        AbstractC2492i.m4915e(call, "call");
        synchronized (this) {
            try {
                if (!(iOException instanceof C0240H)) {
                    if (!(this.f496m != null) || (iOException instanceof C0241a)) {
                        this.f497n = true;
                        if (this.f500q == 0) {
                            if (iOException != null) {
                                m516e(call.f470a, this.f487d, iOException);
                            }
                            this.f499p++;
                        }
                    }
                } else if (((C0240H) iOException).f704a == EnumC0242b.REFUSED_STREAM) {
                    int r4 = this.f501r + 1;
                    this.f501r = r4;
                    if (r4 > 1) {
                        this.f497n = true;
                        this.f499p++;
                    }
                } else if (((C0240H) iOException).f704a != EnumC0242b.CANCEL || !call.f482m) {
                    this.f497n = true;
                    this.f499p++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p027J1.AbstractC0251k
    /* renamed from: c */
    public final void mo518c(C0234B c0234b) {
        c0234b.m632c(EnumC0242b.REFUSED_STREAM, null);
    }

    @Override // p021H1.InterfaceC0188d
    public final void cancel() {
        Socket socket = this.f488e;
        if (socket != null) {
            AbstractC0122i.m412b(socket);
        }
    }

    @Override // p021H1.InterfaceC0188d
    /* renamed from: d */
    public final C0067B mo485d() {
        return this.f487d;
    }

    /* renamed from: f */
    public final synchronized void m519f() {
        this.f500q++;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a9, code lost:
    
        if (p045P1.C0425c.m1160c(r1, (java.security.cert.X509Certificate) r10) != false) goto L49;
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m520g(p008C1.C0069a r9, java.util.List r10) {
        /*
            r8 = this;
            r0 = 0
            C1.o r1 = p011D1.AbstractC0122i.f368a
            java.util.ArrayList r1 = r8.f503t
            int r1 = r1.size()
            int r2 = r8.f502s
            if (r1 >= r2) goto Lca
            boolean r1 = r8.f497n
            if (r1 == 0) goto L13
            goto Lca
        L13:
            C1.B r1 = r8.f487d
            C1.a r2 = r1.f129a
            boolean r2 = r2.m251a(r9)
            if (r2 != 0) goto L1e
            return r0
        L1e:
            C1.q r2 = r9.f147h
            java.lang.String r3 = r2.f242d
            C1.a r4 = r1.f129a
            C1.q r5 = r4.f147h
            java.lang.String r5 = r5.f242d
            boolean r3 = kotlin.jvm.internal.AbstractC2492i.m4911a(r3, r5)
            r5 = 1
            if (r3 == 0) goto L30
            return r5
        L30:
            J1.s r3 = r8.f496m
            if (r3 != 0) goto L35
            return r0
        L35:
            if (r10 == 0) goto Lca
            boolean r3 = r10.isEmpty()
            if (r3 == 0) goto L3f
            goto Lca
        L3f:
            java.util.Iterator r10 = r10.iterator()
        L43:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto Lca
            java.lang.Object r3 = r10.next()
            C1.B r3 = (p008C1.C0067B) r3
            java.net.Proxy r6 = r3.f130b
            java.net.Proxy$Type r6 = r6.type()
            java.net.Proxy$Type r7 = java.net.Proxy.Type.DIRECT
            if (r6 != r7) goto L43
            java.net.Proxy r6 = r1.f130b
            java.net.Proxy$Type r6 = r6.type()
            if (r6 != r7) goto L43
            java.net.InetSocketAddress r3 = r3.f131c
            java.net.InetSocketAddress r6 = r1.f131c
            boolean r3 = kotlin.jvm.internal.AbstractC2492i.m4911a(r6, r3)
            if (r3 == 0) goto L43
            P1.c r10 = p045P1.C0425c.f1099a
            P1.c r1 = r9.f143d
            if (r1 == r10) goto L72
            return r0
        L72:
            C1.o r10 = p011D1.AbstractC0122i.f368a
            C1.q r10 = r4.f147h
            int r1 = r10.f243e
            int r3 = r2.f243e
            if (r3 == r1) goto L7d
            goto Lca
        L7d:
            java.lang.String r10 = r10.f242d
            java.lang.String r1 = r2.f242d
            boolean r10 = kotlin.jvm.internal.AbstractC2492i.m4911a(r1, r10)
            C1.n r2 = r8.f490g
            if (r10 == 0) goto L8a
            goto Lab
        L8a:
            boolean r10 = r8.f498o
            if (r10 != 0) goto Lca
            if (r2 == 0) goto Lca
            java.util.List r10 = r2.m273a()
            boolean r3 = r10.isEmpty()
            if (r3 != 0) goto Lca
            java.lang.Object r10 = r10.get(r0)
            java.lang.String r3 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            kotlin.jvm.internal.AbstractC2492i.m4913c(r10, r3)
            java.security.cert.X509Certificate r10 = (java.security.cert.X509Certificate) r10
            boolean r10 = p045P1.C0425c.m1160c(r1, r10)
            if (r10 == 0) goto Lca
        Lab:
            C1.e r9 = r9.f144e     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lca
            kotlin.jvm.internal.AbstractC2492i.m4912b(r9)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lca
            kotlin.jvm.internal.AbstractC2492i.m4912b(r2)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lca
            java.util.List r10 = r2.m273a()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lca
            java.lang.String r2 = "hostname"
            kotlin.jvm.internal.AbstractC2492i.m4915e(r1, r2)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lca
            java.lang.String r2 = "peerCertificates"
            kotlin.jvm.internal.AbstractC2492i.m4915e(r10, r2)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lca
            C1.d r2 = new C1.d     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lca
            r2.<init>(r9, r10, r1, r0)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lca
            r9.m256a(r1, r2)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lca
            return r5
        Lca:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p018G1.C0163n.m520g(C1.a, java.util.List):boolean");
    }

    @Override // p021H1.InterfaceC0188d
    /* renamed from: h */
    public final void mo489h() {
        synchronized (this) {
            this.f497n = true;
        }
        this.f495l.getClass();
    }

    /* renamed from: i */
    public final boolean m521i(boolean z2) {
        long j2;
        C0083o c0083o = AbstractC0122i.f368a;
        long nanoTime = System.nanoTime();
        Socket socket = this.f488e;
        AbstractC2492i.m4912b(socket);
        Socket socket2 = this.f489f;
        AbstractC2492i.m4912b(socket2);
        C0494x c0494x = this.f492i;
        AbstractC2492i.m4912b(c0494x);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        C0259s c0259s = this.f496m;
        if (c0259s != null) {
            return c0259s.m673i(nanoTime);
        }
        synchronized (this) {
            j2 = nanoTime - this.f504u;
        }
        if (j2 < 10000000000L || !z2) {
            return true;
        }
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                boolean z3 = !c0494x.m1290b();
                socket2.setSoTimeout(soTimeout);
                return z3;
            } catch (Throwable th) {
                socket2.setSoTimeout(soTimeout);
                throw th;
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    /* renamed from: j */
    public final void m522j() {
        this.f504u = System.nanoTime();
        EnumC0089u enumC0089u = this.f491h;
        if (enumC0089u == EnumC0089u.HTTP_2 || enumC0089u == EnumC0089u.H2_PRIOR_KNOWLEDGE) {
            Socket socket = this.f489f;
            AbstractC2492i.m4912b(socket);
            C0494x c0494x = this.f492i;
            AbstractC2492i.m4912b(c0494x);
            C0493w c0493w = this.f493j;
            AbstractC2492i.m4912b(c0493w);
            socket.setSoTimeout(0);
            C0243c c0243c = C0243c.f714a;
            C0084p c0084p = new C0084p(this.f485b);
            String peerName = this.f487d.f129a.f147h.f242d;
            AbstractC2492i.m4915e(peerName, "peerName");
            c0084p.f234e = socket;
            String str = AbstractC0122i.f370c + ' ' + peerName;
            AbstractC2492i.m4915e(str, "<set-?>");
            c0084p.f231b = str;
            c0084p.f235f = c0494x;
            c0084p.f236g = c0493w;
            c0084p.f237h = this;
            c0084p.f232c = this.f494k;
            c0084p.f238i = c0243c;
            C0259s c0259s = new C0259s(c0084p);
            this.f496m = c0259s;
            C0239G c0239g = C0259s.f770A;
            this.f502s = (c0239g.f702a & 16) != 0 ? c0239g.f703b[4] : Integer.MAX_VALUE;
            C0235C c0235c = c0259s.f794x;
            synchronized (c0235c) {
                try {
                    if (c0235c.f693d) {
                        throw new IOException("closed");
                    }
                    Logger logger = C0235C.f689f;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(AbstractC0122i.m414d(">> CONNECTION " + AbstractC0248h.f742a.mo1221c(), new Object[0]));
                    }
                    C0493w c0493w2 = c0235c.f690a;
                    C0480j byteString = AbstractC0248h.f742a;
                    c0493w2.getClass();
                    AbstractC2492i.m4915e(byteString, "byteString");
                    if (c0493w2.f1248c) {
                        throw new IllegalStateException("closed");
                    }
                    c0493w2.f1247b.m1271w(byteString);
                    c0493w2.m1287b();
                    c0235c.f690a.flush();
                } catch (Throwable th) {
                    throw th;
                }
            }
            c0259s.f794x.m649m(c0259s.f788r);
            if (c0259s.f788r.m651a() != 65535) {
                c0259s.f794x.m650n(0, r1 - 65535);
            }
            C0135c.m427c(c0259s.f777g.m437e(), c0259s.f773c, c0259s.f795y);
        }
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        C0067B c0067b = this.f487d;
        sb.append(c0067b.f129a.f147h.f242d);
        sb.append(':');
        sb.append(c0067b.f129a.f147h.f243e);
        sb.append(", proxy=");
        sb.append(c0067b.f130b);
        sb.append(" hostAddress=");
        sb.append(c0067b.f131c);
        sb.append(" cipherSuite=");
        C0082n c0082n = this.f490g;
        if (c0082n == null || (obj = c0082n.f226b) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f491h);
        sb.append('}');
        return sb.toString();
    }
}
