package p018G1;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC2492i;
import p008C1.C0081m;
import p008C1.C0093y;
import p008C1.C0094z;
import p011D1.C0118e;
import p021H1.InterfaceC0188d;
import p021H1.InterfaceC0189e;
import p051R1.C0494x;

/* renamed from: G1.f */
/* loaded from: classes.dex */
public final class C0155f {

    /* renamed from: a */
    public final C0162m f455a;

    /* renamed from: b */
    public final InterfaceC0156g f456b;

    /* renamed from: c */
    public final InterfaceC0189e f457c;

    /* renamed from: d */
    public boolean f458d;

    public C0155f(C0162m call, InterfaceC0156g finder, InterfaceC0189e interfaceC0189e) {
        AbstractC2492i.m4915e(call, "call");
        AbstractC2492i.m4915e(finder, "finder");
        this.f455a = call;
        this.f456b = finder;
        this.f457c = interfaceC0189e;
    }

    /* renamed from: a */
    public final IOException m501a(boolean z2, boolean z3, IOException iOException) {
        if (iOException != null) {
            m505e(iOException);
        }
        C0162m call = this.f455a;
        if (z3) {
            if (iOException != null) {
                AbstractC2492i.m4915e(call, "call");
            } else {
                AbstractC2492i.m4915e(call, "call");
            }
        }
        if (z2) {
            if (iOException != null) {
                AbstractC2492i.m4915e(call, "call");
            } else {
                AbstractC2492i.m4915e(call, "call");
            }
        }
        return call.m513e(this, z3, z2, iOException);
    }

    /* renamed from: b */
    public final C0163n m502b() {
        InterfaceC0188d mo550i = this.f457c.mo550i();
        C0163n c0163n = mo550i instanceof C0163n ? (C0163n) mo550i : null;
        if (c0163n != null) {
            return c0163n;
        }
        throw new IllegalStateException("no connection for CONNECT tunnels");
    }

    /* renamed from: c */
    public final C0118e m503c(C0094z c0094z) {
        InterfaceC0189e interfaceC0189e = this.f457c;
        try {
            String m274a = c0094z.f320f.m274a("Content-Type");
            if (m274a == null) {
                m274a = null;
            }
            long mo549h = interfaceC0189e.mo549h(c0094z);
            return new C0118e(m274a, mo549h, new C0494x(new C0154e(this, interfaceC0189e.mo543b(c0094z), mo549h)), 1);
        } catch (IOException e2) {
            C0162m call = this.f455a;
            AbstractC2492i.m4915e(call, "call");
            m505e(e2);
            throw e2;
        }
    }

    /* renamed from: d */
    public final C0093y m504d(boolean z2) {
        try {
            C0093y mo548g = this.f457c.mo548g(z2);
            if (mo548g != null) {
                mo548g.f313m = this;
                mo548g.f314n = new C0081m(2, this);
            }
            return mo548g;
        } catch (IOException e2) {
            C0162m call = this.f455a;
            AbstractC2492i.m4915e(call, "call");
            m505e(e2);
            throw e2;
        }
    }

    /* renamed from: e */
    public final void m505e(IOException iOException) {
        this.f458d = true;
        this.f457c.mo550i().mo483b(this.f455a, iOException);
    }
}
