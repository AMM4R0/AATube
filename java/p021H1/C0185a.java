package p021H1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.AbstractC2492i;
import p001A0.AbstractC0005b;
import p006C.C0055g;
import p008C1.AbstractC0066A;
import p008C1.C0067B;
import p008C1.C0069a;
import p008C1.C0070b;
import p008C1.C0073e;
import p008C1.C0083o;
import p008C1.C0084p;
import p008C1.C0085q;
import p008C1.C0087s;
import p008C1.C0088t;
import p008C1.C0090v;
import p008C1.C0091w;
import p008C1.C0093y;
import p008C1.C0094z;
import p008C1.InterfaceC0086r;
import p010D0.C0109g;
import p011D1.AbstractC0119f;
import p011D1.AbstractC0122i;
import p011D1.C0117d;
import p011D1.C0118e;
import p016F1.C0136d;
import p018G1.C0155f;
import p018G1.C0159j;
import p018G1.C0162m;
import p018G1.C0163n;
import p018G1.C0164o;
import p018G1.C0165p;
import p018G1.InterfaceC0156g;
import p027J1.C0241a;
import p045P1.C0425c;
import p051R1.C0485o;
import p051R1.C0494x;
import p103k0.AbstractC2480a;
import p108m1.AbstractC2659i;
import p108m1.C2668r;

/* renamed from: H1.a */
/* loaded from: classes.dex */
public final class C0185a implements InterfaceC0086r {

    /* renamed from: a */
    public final /* synthetic */ int f573a = 0;

    /* renamed from: b */
    public final Object f574b;

    public C0185a(C0070b cookieJar) {
        AbstractC2492i.m4915e(cookieJar, "cookieJar");
        this.f574b = cookieJar;
    }

    /* renamed from: d */
    public static int m539d(C0094z c0094z, int r2) {
        String m274a = c0094z.f320f.m274a("Retry-After");
        if (m274a == null) {
            m274a = null;
        }
        if (m274a == null) {
            return r2;
        }
        Pattern compile = Pattern.compile("\\d+");
        AbstractC2492i.m4914d(compile, "compile(...)");
        if (!compile.matcher(m274a).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(m274a);
        AbstractC2492i.m4914d(valueOf, "valueOf(...)");
        return valueOf.intValue();
    }

    @Override // p008C1.InterfaceC0086r
    /* renamed from: a */
    public final C0094z mo289a(C0191g c0191g) {
        AbstractC0066A abstractC0066A;
        C0091w c0091w;
        List list;
        C0094z c0094z;
        int r25;
        SSLSocketFactory sSLSocketFactory;
        C0425c c0425c;
        C0073e c0073e;
        C0185a c0185a = this;
        switch (c0185a.f573a) {
            case 0:
                C0091w c0091w2 = c0191g.f581e;
                C0090v m309f = c0091w2.m309f();
                long j2 = -1;
                C0117d c0117d = (C0117d) c0091w2.f297e;
                if (c0117d != null) {
                    C0087s c0087s = (C0087s) c0117d.f356c;
                    if (c0087s != null) {
                        m309f.m296g("Content-Type", c0087s.f247a);
                    }
                    long j3 = c0117d.f354a;
                    if (j3 != -1) {
                        m309f.m296g("Content-Length", String.valueOf(j3));
                        ((C0055g) m309f.f290d).m224w("Transfer-Encoding");
                    } else {
                        m309f.m296g("Transfer-Encoding", "chunked");
                        ((C0055g) m309f.f290d).m224w("Content-Length");
                    }
                }
                C0083o c0083o = (C0083o) c0091w2.f296d;
                String m274a = c0083o.m274a("Host");
                boolean z2 = false;
                C0085q url = (C0085q) c0091w2.f294b;
                if (m274a == null) {
                    m309f.m296g("Host", AbstractC0122i.m419i(url, false));
                }
                if (c0083o.m274a("Connection") == null) {
                    m309f.m296g("Connection", "Keep-Alive");
                }
                if (c0083o.m274a("Accept-Encoding") == null && c0083o.m274a("Range") == null) {
                    m309f.m296g("Accept-Encoding", "gzip");
                    z2 = true;
                }
                C0070b c0070b = (C0070b) c0185a.f574b;
                c0070b.getClass();
                AbstractC2492i.m4915e(url, "url");
                if (c0083o.m274a("User-Agent") == null) {
                    m309f.m296g("User-Agent", "okhttp/5.0.0-alpha.14");
                }
                C0091w c0091w3 = new C0091w(m309f);
                C0094z m554b = c0191g.m554b(c0091w3);
                C0083o c0083o2 = m554b.f320f;
                AbstractC0190f.m552b(c0070b, (C0085q) c0091w3.f294b, c0083o2);
                C0093y m311b = m554b.m311b();
                m311b.f301a = c0091w3;
                if (z2) {
                    String m274a2 = c0083o2.m274a("Content-Encoding");
                    if (m274a2 == null) {
                        m274a2 = null;
                    }
                    if ("gzip".equalsIgnoreCase(m274a2) && AbstractC0190f.m551a(m554b) && (abstractC0066A = m554b.f321g) != null) {
                        C0485o c0485o = new C0485o(abstractC0066A.mo250h());
                        C0055g m276c = c0083o2.m276c();
                        m276c.m224w("Content-Encoding");
                        m276c.m224w("Content-Length");
                        m311b.f306f = m276c.m218q().m276c();
                        String m274a3 = c0083o2.m274a("Content-Type");
                        if (m274a3 == null) {
                            m274a3 = null;
                        }
                        m311b.f307g = new C0118e(m274a3, j2, new C0494x(c0485o), 1);
                    }
                }
                return m311b.m310a();
            default:
                C0091w c0091w4 = c0191g.f581e;
                C0162m c0162m = c0191g.f577a;
                List list2 = C2668r.f8607a;
                C0094z c0094z2 = null;
                int r10 = 0;
                while (true) {
                    C0091w c0091w5 = c0091w4;
                    boolean z3 = true;
                    while (true) {
                        c0162m.getClass();
                        if (c0162m.f478i != null) {
                            throw new IllegalStateException("Check failed.");
                        }
                        synchronized (c0162m) {
                            try {
                            } catch (Throwable th) {
                                th = th;
                            }
                            try {
                                if (c0162m.f480k) {
                                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                                }
                                if (c0162m.f479j) {
                                    throw new IllegalStateException("Check failed.");
                                }
                                if (z3) {
                                    C0088t c0088t = c0162m.f470a;
                                    C0136d c0136d = c0088t.f276z;
                                    C0164o c0164o = c0162m.f472c;
                                    int r14 = c0088t.f273w;
                                    int r15 = c0088t.f274x;
                                    int r11 = c0191g.f582f;
                                    int r6 = c0191g.f583g;
                                    boolean z4 = c0088t.f255e;
                                    boolean z5 = c0088t.f256f;
                                    C0085q url2 = (C0085q) c0091w5.f294b;
                                    list = list2;
                                    AbstractC2492i.m4915e(url2, "url");
                                    r25 = r10;
                                    if (AbstractC2492i.m4911a(url2.f239a, "https")) {
                                        SSLSocketFactory sSLSocketFactory2 = c0088t.f265o;
                                        if (sSLSocketFactory2 == null) {
                                            throw new IllegalStateException("CLEARTEXT-only client");
                                        }
                                        C0425c c0425c2 = c0088t.f269s;
                                        c0073e = c0088t.f270t;
                                        c0425c = c0425c2;
                                        sSLSocketFactory = sSLSocketFactory2;
                                    } else {
                                        sSLSocketFactory = null;
                                        c0425c = null;
                                        c0073e = null;
                                    }
                                    c0094z = c0094z2;
                                    c0091w = c0091w5;
                                    C0165p c0165p = new C0165p(c0136d, c0164o, r14, r15, r11, r6, 0, z4, z5, new C0069a(url2.f242d, url2.f243e, c0088t.f261k, c0088t.f264n, sSLSocketFactory, c0425c, c0073e, c0088t.f263m, c0088t.f268r, c0088t.f267q, c0088t.f262l), c0162m.f470a.f275y, new C0109g(c0162m, c0162m.f472c.f506b, c0191g));
                                    C0088t c0088t2 = c0162m.f470a;
                                    c0162m.f476g = c0088t2.f256f ? new C0159j(c0165p, c0088t2.f276z) : new C0055g(6, c0165p);
                                } else {
                                    c0091w = c0091w5;
                                    list = list2;
                                    c0094z = c0094z2;
                                    r25 = r10;
                                }
                                try {
                                    if (c0162m.f482m) {
                                        throw new IOException("Canceled");
                                    }
                                    C0091w c0091w6 = c0091w;
                                    try {
                                        C0093y m311b2 = c0191g.m554b(c0091w6).m311b();
                                        m311b2.f301a = c0091w6;
                                        m311b2.f310j = c0094z != null ? AbstractC0005b.m51P(c0094z) : null;
                                        c0094z2 = m311b2.m310a();
                                        try {
                                            c0091w4 = m540b(c0094z2, c0162m.f478i);
                                            if (c0091w4 == null) {
                                                c0162m.m511c(false);
                                                return c0094z2;
                                            }
                                            AbstractC0119f.m396b(c0094z2.f321g);
                                            r10 = r25 + 1;
                                            if (r10 > 20) {
                                                throw new ProtocolException("Too many follow-up requests: " + r10);
                                            }
                                            c0162m.m511c(true);
                                            c0185a = this;
                                            list2 = list;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            c0162m.m511c(true);
                                            throw th;
                                        }
                                    } catch (IOException e2) {
                                        if (!m541c(e2, c0162m, c0091w6, !(e2 instanceof C0241a))) {
                                            List suppressed = list;
                                            AbstractC2492i.m4915e(suppressed, "suppressed");
                                            Iterator it = suppressed.iterator();
                                            while (it.hasNext()) {
                                                AbstractC0005b.m63f(e2, (Exception) it.next());
                                            }
                                            throw e2;
                                        }
                                        list2 = AbstractC2659i.m5116f0(list, e2);
                                        c0162m.m511c(true);
                                        z3 = false;
                                        r10 = r25;
                                        c0094z2 = c0094z;
                                        c0091w5 = c0091w6;
                                        c0185a = this;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                throw th;
                            }
                        }
                    }
                }
        }
    }

    /* renamed from: b */
    public C0091w m540b(C0094z c0094z, C0155f c0155f) {
        C0084p c0084p;
        C0067B c0067b = c0155f != null ? c0155f.m502b().f487d : null;
        int r2 = c0094z.f318d;
        String str = (String) c0094z.f315a.f295c;
        if (r2 != 307 && r2 != 308) {
            if (r2 == 401) {
                ((C0088t) this.f574b).f257g.getClass();
                return null;
            }
            if (r2 == 421) {
                if (c0155f == null || AbstractC2492i.m4911a(c0155f.f456b.mo215m().m524a().f147h.f242d, c0155f.f457c.mo550i().mo485d().f129a.f147h.f242d)) {
                    return null;
                }
                C0163n m502b = c0155f.m502b();
                synchronized (m502b) {
                    m502b.f498o = true;
                }
                return c0094z.f315a;
            }
            if (r2 == 503) {
                C0094z c0094z2 = c0094z.f324j;
                if ((c0094z2 == null || c0094z2.f318d != 503) && m539d(c0094z, Integer.MAX_VALUE) == 0) {
                    return c0094z.f315a;
                }
                return null;
            }
            if (r2 == 407) {
                AbstractC2492i.m4912b(c0067b);
                if (c0067b.f130b.type() != Proxy.Type.HTTP) {
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
                ((C0088t) this.f574b).f263m.getClass();
                return null;
            }
            if (r2 == 408) {
                if (!((C0088t) this.f574b).f255e) {
                    return null;
                }
                C0094z c0094z3 = c0094z.f324j;
                if ((c0094z3 == null || c0094z3.f318d != 408) && m539d(c0094z, 0) <= 0) {
                    return c0094z.f315a;
                }
                return null;
            }
            switch (r2) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        C0088t c0088t = (C0088t) this.f574b;
        if (!c0088t.f258h) {
            return null;
        }
        String m274a = c0094z.f320f.m274a("Location");
        if (m274a == null) {
            m274a = null;
        }
        if (m274a == null) {
            return null;
        }
        C0091w c0091w = c0094z.f315a;
        C0085q c0085q = (C0085q) c0091w.f294b;
        c0085q.getClass();
        try {
            c0084p = new C0084p();
            c0084p.m281c(c0085q, m274a);
        } catch (IllegalArgumentException unused) {
            c0084p = null;
        }
        C0085q m279a = c0084p != null ? c0084p.m279a() : null;
        if (m279a == null) {
            return null;
        }
        if (!AbstractC2492i.m4911a(m279a.f239a, ((C0085q) c0091w.f294b).f239a) && !c0088t.f259i) {
            return null;
        }
        C0090v m309f = c0091w.m309f();
        if (AbstractC2480a.m4870K(str)) {
            boolean equals = str.equals("PROPFIND");
            int r11 = c0094z.f318d;
            boolean z2 = equals || r11 == 308 || r11 == 307;
            if (str.equals("PROPFIND") || r11 == 308 || r11 == 307) {
                m309f.m297h(str, z2 ? (C0117d) c0091w.f297e : null);
            } else {
                m309f.m297h("GET", null);
            }
            if (!z2) {
                ((C0055g) m309f.f290d).m224w("Transfer-Encoding");
                ((C0055g) m309f.f290d).m224w("Content-Length");
                ((C0055g) m309f.f290d).m224w("Content-Type");
            }
        }
        if (!AbstractC0122i.m411a((C0085q) c0091w.f294b, m279a)) {
            ((C0055g) m309f.f290d).m224w("Authorization");
        }
        m309f.f289c = m279a;
        return new C0091w(m309f);
    }

    /* renamed from: c */
    public boolean m541c(IOException iOException, C0162m c0162m, C0091w c0091w, boolean z2) {
        C0155f c0155f;
        if (!((C0088t) this.f574b).f255e) {
            return false;
        }
        if ((!z2 || !(iOException instanceof FileNotFoundException)) && !(iOException instanceof ProtocolException) && (!(iOException instanceof InterruptedIOException) ? (!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException) : (iOException instanceof SocketTimeoutException) && !z2) && (c0155f = c0162m.f483n) != null && c0155f.f458d) {
            InterfaceC0156g interfaceC0156g = c0162m.f476g;
            AbstractC2492i.m4912b(interfaceC0156g);
            C0165p mo215m = interfaceC0156g.mo215m();
            C0155f c0155f2 = c0162m.f483n;
            if (mo215m.m526c(c0155f2 != null ? c0155f2.m502b() : null)) {
                return true;
            }
        }
        return false;
    }

    public C0185a(C0088t c0088t) {
        this.f574b = c0088t;
    }
}
