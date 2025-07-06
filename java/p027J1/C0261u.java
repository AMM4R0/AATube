package p027J1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC2492i;
import p008C1.C0083o;
import p008C1.C0085q;
import p008C1.C0088t;
import p008C1.C0091w;
import p008C1.C0094z;
import p008C1.EnumC0089u;
import p011D1.AbstractC0122i;
import p011D1.C0117d;
import p018G1.C0163n;
import p021H1.AbstractC0190f;
import p021H1.C0191g;
import p021H1.InterfaceC0188d;
import p021H1.InterfaceC0189e;
import p051R1.C0480j;
import p051R1.InterfaceC0465B;
import p051R1.InterfaceC0467D;

/* renamed from: J1.u */
/* loaded from: classes.dex */
public final class C0261u implements InterfaceC0189e {

    /* renamed from: g */
    public static final List f798g = AbstractC0122i.m416f("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: h */
    public static final List f799h = AbstractC0122i.m416f("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a */
    public final C0163n f800a;

    /* renamed from: b */
    public final C0191g f801b;

    /* renamed from: c */
    public final C0259s f802c;

    /* renamed from: d */
    public volatile C0234B f803d;

    /* renamed from: e */
    public final EnumC0089u f804e;

    /* renamed from: f */
    public volatile boolean f805f;

    public C0261u(C0088t c0088t, C0163n c0163n, C0191g c0191g, C0259s http2Connection) {
        AbstractC2492i.m4915e(http2Connection, "http2Connection");
        this.f800a = c0163n;
        this.f801b = c0191g;
        this.f802c = http2Connection;
        EnumC0089u enumC0089u = EnumC0089u.H2_PRIOR_KNOWLEDGE;
        this.f804e = c0088t.f268r.contains(enumC0089u) ? enumC0089u : EnumC0089u.HTTP_2;
    }

    @Override // p021H1.InterfaceC0189e
    /* renamed from: a */
    public final InterfaceC0465B mo542a(C0091w c0091w, long j2) {
        C0234B c0234b = this.f803d;
        AbstractC2492i.m4912b(c0234b);
        return c0234b.m636g();
    }

    @Override // p021H1.InterfaceC0189e
    /* renamed from: b */
    public final InterfaceC0467D mo543b(C0094z c0094z) {
        C0234B c0234b = this.f803d;
        AbstractC2492i.m4912b(c0234b);
        return c0234b.f683h;
    }

    @Override // p021H1.InterfaceC0189e
    /* renamed from: c */
    public final C0083o mo544c() {
        C0083o c0083o;
        C0234B c0234b = this.f803d;
        AbstractC2492i.m4912b(c0234b);
        synchronized (c0234b) {
            C0266z c0266z = c0234b.f683h;
            if (!c0266z.f821b || !c0266z.f822c.m1252b() || !c0234b.f683h.f823d.m1252b()) {
                if (c0234b.f687l == null) {
                    throw new IllegalStateException("too early; can't read the trailers yet");
                }
                IOException iOException = c0234b.f688m;
                if (iOException != null) {
                    throw iOException;
                }
                EnumC0242b enumC0242b = c0234b.f687l;
                AbstractC2492i.m4912b(enumC0242b);
                throw new C0240H(enumC0242b);
            }
            c0083o = c0234b.f683h.f824e;
            if (c0083o == null) {
                c0083o = AbstractC0122i.f368a;
            }
        }
        return c0083o;
    }

    @Override // p021H1.InterfaceC0189e
    public final void cancel() {
        this.f805f = true;
        C0234B c0234b = this.f803d;
        if (c0234b != null) {
            c0234b.m634e(EnumC0242b.CANCEL);
        }
    }

    @Override // p021H1.InterfaceC0189e
    /* renamed from: d */
    public final void mo545d(C0091w c0091w) {
        int r12;
        C0234B c0234b;
        if (this.f803d != null) {
            return;
        }
        boolean z2 = true;
        boolean z3 = ((C0117d) c0091w.f297e) != null;
        C0083o c0083o = (C0083o) c0091w.f296d;
        ArrayList arrayList = new ArrayList(c0083o.size() + 4);
        arrayList.add(new C0244d(C0244d.f717f, (String) c0091w.f295c));
        C0480j c0480j = C0244d.f718g;
        C0085q url = (C0085q) c0091w.f294b;
        AbstractC2492i.m4915e(url, "url");
        String m283b = url.m283b();
        String m285d = url.m285d();
        if (m285d != null) {
            m283b = m283b + '?' + m285d;
        }
        arrayList.add(new C0244d(c0480j, m283b));
        String m274a = ((C0083o) c0091w.f296d).m274a("Host");
        if (m274a != null) {
            arrayList.add(new C0244d(C0244d.f720i, m274a));
        }
        arrayList.add(new C0244d(C0244d.f719h, url.f239a));
        int size = c0083o.size();
        for (int r5 = 0; r5 < size; r5++) {
            String m275b = c0083o.m275b(r5);
            Locale US = Locale.US;
            AbstractC2492i.m4914d(US, "US");
            String lowerCase = m275b.toLowerCase(US);
            AbstractC2492i.m4914d(lowerCase, "toLowerCase(...)");
            if (!f798g.contains(lowerCase) || (lowerCase.equals("te") && c0083o.m277d(r5).equals("trailers"))) {
                arrayList.add(new C0244d(lowerCase, c0083o.m277d(r5)));
            }
        }
        C0259s c0259s = this.f802c;
        c0259s.getClass();
        boolean z4 = !z3;
        synchronized (c0259s.f794x) {
            synchronized (c0259s) {
                try {
                    if (c0259s.f775e > 1073741823) {
                        c0259s.m675k(EnumC0242b.REFUSED_STREAM);
                    }
                    if (c0259s.f776f) {
                        throw new C0241a();
                    }
                    r12 = c0259s.f775e;
                    c0259s.f775e = r12 + 2;
                    c0234b = new C0234B(r12, c0259s, z4, false, null);
                    if (z3 && c0259s.f791u < c0259s.f792v && c0234b.f679d < c0234b.f680e) {
                        z2 = false;
                    }
                    if (c0234b.m638i()) {
                        c0259s.f772b.put(Integer.valueOf(r12), c0234b);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c0259s.f794x.m646j(z4, r12, arrayList);
        }
        if (z2) {
            c0259s.f794x.flush();
        }
        this.f803d = c0234b;
        if (this.f805f) {
            C0234B c0234b2 = this.f803d;
            AbstractC2492i.m4912b(c0234b2);
            c0234b2.m634e(EnumC0242b.CANCEL);
            throw new IOException("Canceled");
        }
        C0234B c0234b3 = this.f803d;
        AbstractC2492i.m4912b(c0234b3);
        C0233A c0233a = c0234b3.f685j;
        long j2 = this.f801b.f583g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c0233a.mo1236g(j2, timeUnit);
        C0234B c0234b4 = this.f803d;
        AbstractC2492i.m4912b(c0234b4);
        c0234b4.f686k.mo1236g(this.f801b.f584h, timeUnit);
    }

    @Override // p021H1.InterfaceC0189e
    /* renamed from: e */
    public final void mo546e() {
        C0234B c0234b = this.f803d;
        AbstractC2492i.m4912b(c0234b);
        c0234b.m636g().close();
    }

    @Override // p021H1.InterfaceC0189e
    /* renamed from: f */
    public final void mo547f() {
        this.f802c.flush();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0028, code lost:
    
        if (r3 == false) goto L20;
     */
    @Override // p021H1.InterfaceC0189e
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p008C1.C0093y mo548g(boolean r11) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p027J1.C0261u.mo548g(boolean):C1.y");
    }

    @Override // p021H1.InterfaceC0189e
    /* renamed from: h */
    public final long mo549h(C0094z c0094z) {
        if (AbstractC0190f.m551a(c0094z)) {
            return AbstractC0122i.m415e(c0094z);
        }
        return 0L;
    }

    @Override // p021H1.InterfaceC0189e
    /* renamed from: i */
    public final InterfaceC0188d mo550i() {
        return this.f800a;
    }
}
