package p028K;

import p006C.C0051c;
import p103k0.AbstractC2480a;

/* renamed from: K.p0 */
/* loaded from: classes.dex */
public abstract class AbstractC0324p0 {

    /* renamed from: a */
    public final C0340x0 f915a;

    /* renamed from: b */
    public C0051c[] f916b;

    public AbstractC0324p0() {
        this(new C0340x0());
    }

    /* renamed from: a */
    public final void m944a() {
        C0051c[] c0051cArr = this.f916b;
        if (c0051cArr != null) {
            C0051c c0051c = c0051cArr[0];
            C0051c c0051c2 = c0051cArr[1];
            C0340x0 c0340x0 = this.f915a;
            if (c0051c2 == null) {
                c0051c2 = c0340x0.f944a.mo950f(2);
            }
            if (c0051c == null) {
                c0051c = c0340x0.f944a.mo950f(1);
            }
            mo894g(C0051c.m196a(c0051c, c0051c2));
            C0051c c0051c3 = this.f916b[AbstractC2480a.m4895x(16)];
            if (c0051c3 != null) {
                mo939f(c0051c3);
            }
            C0051c c0051c4 = this.f916b[AbstractC2480a.m4895x(32)];
            if (c0051c4 != null) {
                mo938d(c0051c4);
            }
            C0051c c0051c5 = this.f916b[AbstractC2480a.m4895x(64)];
            if (c0051c5 != null) {
                mo940h(c0051c5);
            }
        }
    }

    /* renamed from: b */
    public abstract C0340x0 mo892b();

    /* renamed from: c */
    public void mo942c(int r4, C0051c c0051c) {
        if (this.f916b == null) {
            this.f916b = new C0051c[9];
        }
        for (int r02 = 1; r02 <= 256; r02 <<= 1) {
            if ((r4 & r02) != 0) {
                this.f916b[AbstractC2480a.m4895x(r02)] = c0051c;
            }
        }
    }

    /* renamed from: e */
    public abstract void mo893e(C0051c c0051c);

    /* renamed from: g */
    public abstract void mo894g(C0051c c0051c);

    public AbstractC0324p0(C0340x0 c0340x0) {
        this.f915a = c0340x0;
    }

    /* renamed from: d */
    public void mo938d(C0051c c0051c) {
    }

    /* renamed from: f */
    public void mo939f(C0051c c0051c) {
    }

    /* renamed from: h */
    public void mo940h(C0051c c0051c) {
    }
}
