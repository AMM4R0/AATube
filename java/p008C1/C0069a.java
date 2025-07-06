package p008C1;

import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.AbstractC2492i;
import p000A.AbstractC0002c;
import p011D1.AbstractC0115b;
import p011D1.AbstractC0122i;
import p045P1.C0425c;
import p048Q1.AbstractC0452a;

/* renamed from: C1.a */
/* loaded from: classes.dex */
public final class C0069a {

    /* renamed from: a */
    public final C0070b f140a;

    /* renamed from: b */
    public final SocketFactory f141b;

    /* renamed from: c */
    public final SSLSocketFactory f142c;

    /* renamed from: d */
    public final C0425c f143d;

    /* renamed from: e */
    public final C0073e f144e;

    /* renamed from: f */
    public final C0070b f145f;

    /* renamed from: g */
    public final ProxySelector f146g;

    /* renamed from: h */
    public final C0085q f147h;

    /* renamed from: i */
    public final List f148i;

    /* renamed from: j */
    public final List f149j;

    public C0069a(String uriHost, int r3, C0070b dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, C0425c c0425c, C0073e c0073e, C0070b proxyAuthenticator, List protocols, List connectionSpecs, ProxySelector proxySelector) {
        AbstractC2492i.m4915e(uriHost, "uriHost");
        AbstractC2492i.m4915e(dns, "dns");
        AbstractC2492i.m4915e(socketFactory, "socketFactory");
        AbstractC2492i.m4915e(proxyAuthenticator, "proxyAuthenticator");
        AbstractC2492i.m4915e(protocols, "protocols");
        AbstractC2492i.m4915e(connectionSpecs, "connectionSpecs");
        AbstractC2492i.m4915e(proxySelector, "proxySelector");
        this.f140a = dns;
        this.f141b = socketFactory;
        this.f142c = sSLSocketFactory;
        this.f143d = c0425c;
        this.f144e = c0073e;
        this.f145f = proxyAuthenticator;
        this.f146g = proxySelector;
        C0084p c0084p = new C0084p();
        String str = sSLSocketFactory != null ? "https" : "http";
        if (str.equalsIgnoreCase("http")) {
            c0084p.f231b = "http";
        } else {
            if (!str.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str));
            }
            c0084p.f231b = "https";
        }
        String m393b = AbstractC0115b.m393b(AbstractC0452a.m1207c(uriHost, 0, 0, false, 7));
        if (m393b == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(uriHost));
        }
        c0084p.f235f = m393b;
        if (1 > r3 || r3 >= 65536) {
            throw new IllegalArgumentException(AbstractC0002c.m11f(r3, "unexpected port: ").toString());
        }
        c0084p.f232c = r3;
        this.f147h = c0084p.m279a();
        this.f148i = AbstractC0122i.m420j(protocols);
        this.f149j = AbstractC0122i.m420j(connectionSpecs);
    }

    /* renamed from: a */
    public final boolean m251a(C0069a that) {
        AbstractC2492i.m4915e(that, "that");
        return AbstractC2492i.m4911a(this.f140a, that.f140a) && AbstractC2492i.m4911a(this.f145f, that.f145f) && AbstractC2492i.m4911a(this.f148i, that.f148i) && AbstractC2492i.m4911a(this.f149j, that.f149j) && AbstractC2492i.m4911a(this.f146g, that.f146g) && AbstractC2492i.m4911a(null, null) && AbstractC2492i.m4911a(this.f142c, that.f142c) && AbstractC2492i.m4911a(this.f143d, that.f143d) && AbstractC2492i.m4911a(this.f144e, that.f144e) && this.f147h.f243e == that.f147h.f243e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0069a) {
            C0069a c0069a = (C0069a) obj;
            if (AbstractC2492i.m4911a(this.f147h, c0069a.f147h) && m251a(c0069a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f144e) + ((Objects.hashCode(this.f143d) + ((Objects.hashCode(this.f142c) + ((this.f146g.hashCode() + ((this.f149j.hashCode() + ((this.f148i.hashCode() + ((this.f145f.hashCode() + ((this.f140a.hashCode() + AbstractC0002c.m9d(this.f147h.f246h, 527, 31)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        C0085q c0085q = this.f147h;
        sb.append(c0085q.f242d);
        sb.append(':');
        sb.append(c0085q.f243e);
        sb.append(", ");
        sb.append("proxySelector=" + this.f146g);
        sb.append('}');
        return sb.toString();
    }
}
