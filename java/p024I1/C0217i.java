package p024I1;

import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import kotlin.jvm.internal.AbstractC2492i;
import p001A0.AbstractC0005b;
import p003B.C0030d;
import p008C1.C0083o;
import p008C1.C0085q;
import p008C1.C0088t;
import p008C1.C0091w;
import p008C1.C0093y;
import p008C1.C0094z;
import p008C1.EnumC0089u;
import p011D1.AbstractC0122i;
import p021H1.AbstractC0190f;
import p021H1.InterfaceC0188d;
import p021H1.InterfaceC0189e;
import p051R1.C0493w;
import p051R1.C0494x;
import p051R1.InterfaceC0465B;
import p051R1.InterfaceC0467D;

/* renamed from: I1.i */
/* loaded from: classes.dex */
public final class C0217i implements InterfaceC0189e {

    /* renamed from: a */
    public final C0088t f641a;

    /* renamed from: b */
    public final InterfaceC0188d f642b;

    /* renamed from: c */
    public final C0494x f643c;

    /* renamed from: d */
    public final C0493w f644d;

    /* renamed from: e */
    public int f645e;

    /* renamed from: f */
    public final C0209a f646f;

    /* renamed from: g */
    public C0083o f647g;

    public C0217i(C0088t c0088t, InterfaceC0188d interfaceC0188d, C0494x source, C0493w sink) {
        AbstractC2492i.m4915e(source, "source");
        AbstractC2492i.m4915e(sink, "sink");
        this.f641a = c0088t;
        this.f642b = interfaceC0188d;
        this.f643c = source;
        this.f644d = sink;
        this.f646f = new C0209a(source);
    }

    @Override // p021H1.InterfaceC0189e
    /* renamed from: a */
    public final InterfaceC0465B mo542a(C0091w c0091w, long j2) {
        if ("chunked".equalsIgnoreCase(((C0083o) c0091w.f296d).m274a("Transfer-Encoding"))) {
            if (this.f645e == 1) {
                this.f645e = 2;
                return new C0211c(this);
            }
            throw new IllegalStateException(("state: " + this.f645e).toString());
        }
        if (j2 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f645e == 1) {
            this.f645e = 2;
            return new C0214f(this);
        }
        throw new IllegalStateException(("state: " + this.f645e).toString());
    }

    @Override // p021H1.InterfaceC0189e
    /* renamed from: b */
    public final InterfaceC0467D mo543b(C0094z c0094z) {
        if (!AbstractC0190f.m551a(c0094z)) {
            return m606j(0L);
        }
        String m274a = c0094z.f320f.m274a("Transfer-Encoding");
        if (m274a == null) {
            m274a = null;
        }
        if ("chunked".equalsIgnoreCase(m274a)) {
            C0085q c0085q = (C0085q) c0094z.f315a.f294b;
            if (this.f645e == 4) {
                this.f645e = 5;
                return new C0212d(this, c0085q);
            }
            throw new IllegalStateException(("state: " + this.f645e).toString());
        }
        long m415e = AbstractC0122i.m415e(c0094z);
        if (m415e != -1) {
            return m606j(m415e);
        }
        if (this.f645e == 4) {
            this.f645e = 5;
            this.f642b.mo489h();
            return new C0215g(this);
        }
        throw new IllegalStateException(("state: " + this.f645e).toString());
    }

    @Override // p021H1.InterfaceC0189e
    /* renamed from: c */
    public final C0083o mo544c() {
        if (this.f645e != 6) {
            throw new IllegalStateException("too early; can't read the trailers yet");
        }
        C0083o c0083o = this.f647g;
        return c0083o == null ? AbstractC0122i.f368a : c0083o;
    }

    @Override // p021H1.InterfaceC0189e
    public final void cancel() {
        this.f642b.cancel();
    }

    @Override // p021H1.InterfaceC0189e
    /* renamed from: d */
    public final void mo545d(C0091w c0091w) {
        Proxy.Type type = this.f642b.mo485d().f130b.type();
        AbstractC2492i.m4914d(type, "type(...)");
        StringBuilder sb = new StringBuilder();
        sb.append((String) c0091w.f295c);
        sb.append(' ');
        C0085q c0085q = (C0085q) c0091w.f294b;
        if (AbstractC2492i.m4911a(c0085q.f239a, "https") || type != Proxy.Type.HTTP) {
            String m283b = c0085q.m283b();
            String m285d = c0085q.m285d();
            if (m285d != null) {
                m283b = m283b + '?' + m285d;
            }
            sb.append(m283b);
        } else {
            sb.append(c0085q);
        }
        sb.append(" HTTP/1.1");
        String sb2 = sb.toString();
        AbstractC2492i.m4914d(sb2, "toString(...)");
        m607k((C0083o) c0091w.f296d, sb2);
    }

    @Override // p021H1.InterfaceC0189e
    /* renamed from: e */
    public final void mo546e() {
        this.f644d.flush();
    }

    @Override // p021H1.InterfaceC0189e
    /* renamed from: f */
    public final void mo547f() {
        this.f644d.flush();
    }

    @Override // p021H1.InterfaceC0189e
    /* renamed from: g */
    public final C0093y mo548g(boolean z2) {
        C0209a c0209a = this.f646f;
        int r12 = this.f645e;
        if (r12 != 1 && r12 != 2 && r12 != 3) {
            throw new IllegalStateException(("state: " + this.f645e).toString());
        }
        try {
            String m1300p = ((C0494x) c0209a.f623c).m1300p(c0209a.f622b);
            c0209a.f622b -= m1300p.length();
            C0030d m46E = AbstractC0005b.m46E(m1300p);
            int r2 = m46E.f47b;
            C0093y c0093y = new C0093y();
            c0093y.f302b = (EnumC0089u) m46E.f48c;
            c0093y.f303c = r2;
            c0093y.f304d = (String) m46E.f49d;
            c0093y.f306f = c0209a.m601f().m276c();
            c0093y.f314n = C0216h.f640e;
            if (z2 && r2 == 100) {
                return null;
            }
            if (r2 == 100) {
                this.f645e = 3;
                return c0093y;
            }
            if (102 > r2 || r2 >= 200) {
                this.f645e = 4;
                return c0093y;
            }
            this.f645e = 3;
            return c0093y;
        } catch (EOFException e2) {
            throw new IOException("unexpected end of stream on ".concat(this.f642b.mo485d().f129a.f147h.m287f()), e2);
        }
    }

    @Override // p021H1.InterfaceC0189e
    /* renamed from: h */
    public final long mo549h(C0094z c0094z) {
        if (!AbstractC0190f.m551a(c0094z)) {
            return 0L;
        }
        String m274a = c0094z.f320f.m274a("Transfer-Encoding");
        if (m274a == null) {
            m274a = null;
        }
        if ("chunked".equalsIgnoreCase(m274a)) {
            return -1L;
        }
        return AbstractC0122i.m415e(c0094z);
    }

    @Override // p021H1.InterfaceC0189e
    /* renamed from: i */
    public final InterfaceC0188d mo550i() {
        return this.f642b;
    }

    /* renamed from: j */
    public final C0213e m606j(long j2) {
        if (this.f645e == 4) {
            this.f645e = 5;
            return new C0213e(this, j2);
        }
        throw new IllegalStateException(("state: " + this.f645e).toString());
    }

    /* renamed from: k */
    public final void m607k(C0083o headers, String requestLine) {
        AbstractC2492i.m4915e(headers, "headers");
        AbstractC2492i.m4915e(requestLine, "requestLine");
        if (this.f645e != 0) {
            throw new IllegalStateException(("state: " + this.f645e).toString());
        }
        C0493w c0493w = this.f644d;
        c0493w.mo1253c(requestLine);
        c0493w.mo1253c("\r\n");
        int size = headers.size();
        for (int r2 = 0; r2 < size; r2++) {
            c0493w.mo1253c(headers.m275b(r2));
            c0493w.mo1253c(": ");
            c0493w.mo1253c(headers.m277d(r2));
            c0493w.mo1253c("\r\n");
        }
        c0493w.mo1253c("\r\n");
        this.f645e = 1;
    }
}
