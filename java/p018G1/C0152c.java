package p018G1;

import java.io.IOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC2492i;
import p000A.AbstractC0002c;
import p002A1.AbstractC0018k;
import p008C1.C0067B;
import p008C1.C0069a;
import p008C1.C0070b;
import p008C1.C0072d;
import p008C1.C0073e;
import p008C1.C0075g;
import p008C1.C0078j;
import p008C1.C0081m;
import p008C1.C0082n;
import p008C1.C0083o;
import p008C1.C0091w;
import p008C1.C0093y;
import p008C1.C0094z;
import p008C1.EnumC0089u;
import p010D0.C0109g;
import p011D1.AbstractC0119f;
import p011D1.AbstractC0122i;
import p016F1.C0136d;
import p021H1.InterfaceC0188d;
import p024I1.C0213e;
import p024I1.C0217i;
import p036M1.AbstractC0379e;
import p036M1.AbstractC0387m;
import p036M1.C0389o;
import p045P1.C0425c;
import p051R1.C0469F;
import p051R1.C0493w;
import p051R1.C0494x;
import p103k0.AbstractC2480a;
import p108m1.AbstractC2659i;
import p114o1.C2696a;

/* renamed from: G1.c */
/* loaded from: classes.dex */
public final class C0152c implements InterfaceC0168s, InterfaceC0188d {

    /* renamed from: a */
    public final C0136d f419a;

    /* renamed from: b */
    public final C0164o f420b;

    /* renamed from: c */
    public final int f421c;

    /* renamed from: d */
    public final int f422d;

    /* renamed from: e */
    public final int f423e;

    /* renamed from: f */
    public final int f424f;

    /* renamed from: g */
    public final int f425g;

    /* renamed from: h */
    public final boolean f426h;

    /* renamed from: i */
    public final C0109g f427i;

    /* renamed from: j */
    public final C0165p f428j;

    /* renamed from: k */
    public final C0067B f429k;

    /* renamed from: l */
    public final List f430l;

    /* renamed from: m */
    public final int f431m;

    /* renamed from: n */
    public final C0091w f432n;

    /* renamed from: o */
    public final int f433o;

    /* renamed from: p */
    public final boolean f434p;

    /* renamed from: q */
    public volatile boolean f435q;

    /* renamed from: r */
    public Socket f436r;

    /* renamed from: s */
    public Socket f437s;

    /* renamed from: t */
    public C0082n f438t;

    /* renamed from: u */
    public EnumC0089u f439u;

    /* renamed from: v */
    public C0494x f440v;

    /* renamed from: w */
    public C0493w f441w;

    /* renamed from: x */
    public C0163n f442x;

    public C0152c(C0136d taskRunner, C0164o connectionPool, int r9, int r10, int r11, int r12, int r13, boolean z2, C0109g c0109g, C0165p routePlanner, C0067B route, List list, int r19, C0091w c0091w, int r21, boolean z3) {
        AbstractC2492i.m4915e(taskRunner, "taskRunner");
        AbstractC2492i.m4915e(connectionPool, "connectionPool");
        AbstractC2492i.m4915e(routePlanner, "routePlanner");
        AbstractC2492i.m4915e(route, "route");
        this.f419a = taskRunner;
        this.f420b = connectionPool;
        this.f421c = r9;
        this.f422d = r10;
        this.f423e = r11;
        this.f424f = r12;
        this.f425g = r13;
        this.f426h = z2;
        this.f427i = c0109g;
        this.f428j = routePlanner;
        this.f429k = route;
        this.f430l = list;
        this.f431m = r19;
        this.f432n = c0091w;
        this.f433o = r21;
        this.f434p = z3;
    }

    @Override // p018G1.InterfaceC0168s
    /* renamed from: a */
    public final InterfaceC0168s mo482a() {
        return new C0152c(this.f419a, this.f420b, this.f421c, this.f422d, this.f423e, this.f424f, this.f425g, this.f426h, this.f427i, this.f428j, this.f429k, this.f430l, this.f431m, this.f432n, this.f433o, this.f434p);
    }

    @Override // p021H1.InterfaceC0188d
    /* renamed from: b */
    public final void mo483b(C0162m call, IOException iOException) {
        AbstractC2492i.m4915e(call, "call");
    }

    @Override // p018G1.InterfaceC0168s
    /* renamed from: c */
    public final boolean mo484c() {
        return this.f439u != null;
    }

    @Override // p018G1.InterfaceC0168s, p021H1.InterfaceC0188d
    public final void cancel() {
        this.f435q = true;
        Socket socket = this.f436r;
        if (socket != null) {
            AbstractC0122i.m412b(socket);
        }
    }

    @Override // p021H1.InterfaceC0188d
    /* renamed from: d */
    public final C0067B mo485d() {
        return this.f429k;
    }

    @Override // p018G1.InterfaceC0168s
    /* renamed from: e */
    public final C0167r mo486e() {
        Socket socket;
        Socket socket2;
        C0067B route = this.f429k;
        if (this.f436r != null) {
            throw new IllegalStateException("TCP already connected");
        }
        C0109g c0109g = this.f427i;
        c0109g.m354d(this);
        boolean z2 = false;
        try {
            try {
                AbstractC2492i.m4915e(route, "route");
                ((C0162m) c0109g.f338b).getClass();
                InetSocketAddress inetSocketAddress = route.f131c;
                AbstractC2492i.m4915e(inetSocketAddress, "inetSocketAddress");
                m490i();
                z2 = true;
                C0167r c0167r = new C0167r(this, (Throwable) null, 6);
                c0109g.m348C(this);
                return c0167r;
            } catch (IOException e2) {
                c0109g.m355e(route, e2);
                C0167r c0167r2 = new C0167r(this, e2, 2);
                c0109g.m348C(this);
                if (!z2 && (socket2 = this.f436r) != null) {
                    AbstractC0122i.m412b(socket2);
                }
                return c0167r2;
            }
        } catch (Throwable th) {
            c0109g.m348C(this);
            if (!z2 && (socket = this.f436r) != null) {
                AbstractC0122i.m412b(socket);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x012f A[Catch: all -> 0x016e, TryCatch #8 {all -> 0x016e, blocks: (B:49:0x0128, B:51:0x012f, B:54:0x0134, B:57:0x0139, B:59:0x013d, B:62:0x0146, B:65:0x014b, B:68:0x0155), top: B:48:0x0128 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0175  */
    @Override // p018G1.InterfaceC0168s
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p018G1.C0167r mo487f() {
        /*
            Method dump skipped, instructions count: 404
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p018G1.C0152c.mo487f():G1.r");
    }

    @Override // p018G1.InterfaceC0168s
    /* renamed from: g */
    public final C0163n mo488g() {
        this.f427i.m350E(this.f429k);
        C0163n c0163n = this.f442x;
        AbstractC2492i.m4912b(c0163n);
        C0109g c0109g = this.f427i;
        C0067B route = this.f429k;
        AbstractC2492i.m4915e(route, "route");
        C0162m call = (C0162m) c0109g.f338b;
        AbstractC2492i.m4915e(call, "call");
        C0166q m531h = this.f428j.m531h(this, this.f430l);
        if (m531h != null) {
            return m531h.f528a;
        }
        synchronized (c0163n) {
            C0164o c0164o = this.f420b;
            c0164o.getClass();
            C0083o c0083o = AbstractC0122i.f368a;
            c0164o.f511g.add(c0163n);
            c0164o.f509e.m430d(c0164o.f510f, 0L);
            this.f427i.m351a(c0163n);
        }
        this.f427i.m356f(c0163n);
        this.f427i.m357g(c0163n);
        return c0163n;
    }

    /* renamed from: i */
    public final void m490i() {
        Socket createSocket;
        Proxy.Type type = this.f429k.f130b.type();
        int r02 = type == null ? -1 : AbstractC0151b.f418a[type.ordinal()];
        if (r02 == 1 || r02 == 2) {
            createSocket = this.f429k.f129a.f141b.createSocket();
            AbstractC2492i.m4912b(createSocket);
        } else {
            createSocket = new Socket(this.f429k.f130b);
        }
        this.f436r = createSocket;
        if (this.f435q) {
            throw new IOException("canceled");
        }
        createSocket.setSoTimeout(this.f424f);
        try {
            C0389o c0389o = C0389o.f1050a;
            C0389o.f1050a.mo1066e(createSocket, this.f429k.f131c, this.f423e);
            try {
                this.f440v = new C0494x(AbstractC0387m.m1107P(createSocket));
                this.f441w = new C0493w(AbstractC0387m.m1106O(createSocket));
            } catch (NullPointerException e2) {
                if (AbstractC2492i.m4911a(e2.getMessage(), "throw with null exception")) {
                    throw new IOException(e2);
                }
            }
        } catch (ConnectException e3) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f429k.f131c);
            connectException.initCause(e3);
            throw connectException;
        }
    }

    /* renamed from: j */
    public final void m491j(SSLSocket sSLSocket, C0078j c0078j) {
        String str;
        EnumC0089u enumC0089u;
        C0069a c0069a = this.f429k.f129a;
        try {
            if (c0078j.f202b) {
                C0389o c0389o = C0389o.f1050a;
                C0389o.f1050a.mo1059d(sSLSocket, c0069a.f147h.f242d, c0069a.f148i);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            AbstractC2492i.m4912b(session);
            C0082n m1078n = AbstractC0379e.m1078n(session);
            C0425c c0425c = c0069a.f143d;
            AbstractC2492i.m4912b(c0425c);
            if (c0425c.verify(c0069a.f147h.f242d, session)) {
                C0073e c0073e = c0069a.f144e;
                AbstractC2492i.m4912b(c0073e);
                C0082n c0082n = new C0082n(m1078n.f225a, m1078n.f226b, m1078n.f227c, new C0072d(c0073e, m1078n, c0069a, 1));
                this.f438t = c0082n;
                c0073e.m256a(c0069a.f147h.f242d, new C0081m(3, c0082n));
                if (c0078j.f202b) {
                    C0389o c0389o2 = C0389o.f1050a;
                    str = C0389o.f1050a.mo1060f(sSLSocket);
                } else {
                    str = null;
                }
                this.f437s = sSLSocket;
                this.f440v = new C0494x(AbstractC0387m.m1107P(sSLSocket));
                this.f441w = new C0493w(AbstractC0387m.m1106O(sSLSocket));
                if (str != null) {
                    EnumC0089u.f277b.getClass();
                    enumC0089u = C0070b.m254d(str);
                } else {
                    enumC0089u = EnumC0089u.HTTP_1_1;
                }
                this.f439u = enumC0089u;
                C0389o c0389o3 = C0389o.f1050a;
                C0389o.f1050a.mo1098a(sSLSocket);
                return;
            }
            List m273a = m1078n.m273a();
            if (m273a.isEmpty()) {
                throw new SSLPeerUnverifiedException("Hostname " + c0069a.f147h.f242d + " not verified (no certificates)");
            }
            Object obj = m273a.get(0);
            AbstractC2492i.m4913c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) obj;
            StringBuilder sb = new StringBuilder("\n            |Hostname ");
            sb.append(c0069a.f147h.f242d);
            sb.append(" not verified:\n            |    certificate: ");
            C0073e c0073e2 = C0073e.f172c;
            sb.append(AbstractC2480a.m4871L(x509Certificate));
            sb.append("\n            |    DN: ");
            sb.append(x509Certificate.getSubjectDN().getName());
            sb.append("\n            |    subjectAltNames: ");
            sb.append(AbstractC2659i.m5115e0(C0425c.m1158a(x509Certificate, 7), C0425c.m1158a(x509Certificate, 2)));
            sb.append("\n            ");
            throw new SSLPeerUnverifiedException(AbstractC0018k.m149B(sb.toString()));
        } catch (Throwable th) {
            C0389o c0389o4 = C0389o.f1050a;
            C0389o.f1050a.mo1098a(sSLSocket);
            AbstractC0122i.m412b(sSLSocket);
            throw th;
        }
    }

    /* renamed from: k */
    public final C0167r m492k() {
        C0091w c0091w = this.f432n;
        AbstractC2492i.m4912b(c0091w);
        C0067B c0067b = this.f429k;
        String str = "CONNECT " + AbstractC0122i.m419i(c0067b.f129a.f147h, true) + " HTTP/1.1";
        C0494x c0494x = this.f440v;
        AbstractC2492i.m4912b(c0494x);
        C0493w c0493w = this.f441w;
        AbstractC2492i.m4912b(c0493w);
        C0217i c0217i = new C0217i(null, this, c0494x, c0493w);
        C0469F mo391d = c0494x.f1249a.mo391d();
        long j2 = this.f421c;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        mo391d.mo1236g(j2, timeUnit);
        c0493w.f1246a.mo496d().mo1236g(this.f422d, timeUnit);
        c0217i.m607k((C0083o) c0091w.f296d, str);
        c0217i.mo546e();
        C0093y mo548g = c0217i.mo548g(false);
        AbstractC2492i.m4912b(mo548g);
        mo548g.f301a = c0091w;
        C0094z m310a = mo548g.m310a();
        long m415e = AbstractC0122i.m415e(m310a);
        if (m415e != -1) {
            C0213e m606j = c0217i.m606j(m415e);
            AbstractC0122i.m417g(m606j, Integer.MAX_VALUE, timeUnit);
            m606j.close();
        }
        int r02 = m310a.f318d;
        if (r02 == 200) {
            return new C0167r(this, (Throwable) null, 6);
        }
        if (r02 != 407) {
            throw new IOException(AbstractC0002c.m11f(r02, "Unexpected response code for CONNECT: "));
        }
        c0067b.f129a.f145f.getClass();
        throw new IOException("Failed to authenticate with proxy");
    }

    /* renamed from: l */
    public final C0152c m493l(List connectionSpecs, SSLSocket sSLSocket) {
        String[] strArr;
        String[] strArr2;
        AbstractC2492i.m4915e(connectionSpecs, "connectionSpecs");
        int r2 = this.f433o;
        int size = connectionSpecs.size();
        for (int r3 = r2 + 1; r3 < size; r3++) {
            C0078j c0078j = (C0078j) connectionSpecs.get(r3);
            c0078j.getClass();
            if (c0078j.f201a && (((strArr = c0078j.f204d) == null || AbstractC0119f.m399e(strArr, sSLSocket.getEnabledProtocols(), C2696a.f8690b)) && ((strArr2 = c0078j.f203c) == null || AbstractC0119f.m399e(strArr2, sSLSocket.getEnabledCipherSuites(), C0075g.f176c)))) {
                return new C0152c(this.f419a, this.f420b, this.f421c, this.f422d, this.f423e, this.f424f, this.f425g, this.f426h, this.f427i, this.f428j, this.f429k, this.f430l, this.f431m, this.f432n, r3, r2 != -1);
            }
        }
        return null;
    }

    /* renamed from: m */
    public final C0152c m494m(List connectionSpecs, SSLSocket sSLSocket) {
        AbstractC2492i.m4915e(connectionSpecs, "connectionSpecs");
        if (this.f433o != -1) {
            return this;
        }
        C0152c m493l = m493l(connectionSpecs, sSLSocket);
        if (m493l != null) {
            return m493l;
        }
        StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb.append(this.f434p);
        sb.append(", modes=");
        sb.append(connectionSpecs);
        sb.append(", supported protocols=");
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        AbstractC2492i.m4912b(enabledProtocols);
        String arrays = Arrays.toString(enabledProtocols);
        AbstractC2492i.m4914d(arrays, "toString(...)");
        sb.append(arrays);
        throw new UnknownServiceException(sb.toString());
    }

    @Override // p021H1.InterfaceC0188d
    /* renamed from: h */
    public final void mo489h() {
    }
}
