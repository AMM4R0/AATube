package p027J1;

import p008C1.C0083o;
import p011D1.AbstractC0122i;
import p051R1.C0469F;
import p051R1.C0477g;
import p051R1.InterfaceC0465B;

/* renamed from: J1.y */
/* loaded from: classes.dex */
public final class C0265y implements InterfaceC0465B {

    /* renamed from: a */
    public final boolean f816a;

    /* renamed from: b */
    public final C0477g f817b = new C0477g();

    /* renamed from: c */
    public boolean f818c;

    /* renamed from: d */
    public final /* synthetic */ C0234B f819d;

    public C0265y(C0234B c0234b, boolean z2) {
        this.f819d = c0234b;
        this.f816a = z2;
    }

    /* renamed from: b */
    public final void m688b(boolean z2) {
        long min;
        boolean z3;
        C0234B c0234b = this.f819d;
        synchronized (c0234b) {
            c0234b.f686k.m1243h();
            while (c0234b.f679d >= c0234b.f680e && !this.f816a && !this.f818c && c0234b.m635f() == null) {
                try {
                    c0234b.m641l();
                } finally {
                    c0234b.f686k.m629k();
                }
            }
            c0234b.f686k.m629k();
            c0234b.m631b();
            min = Math.min(c0234b.f680e - c0234b.f679d, this.f817b.f1217b);
            c0234b.f679d += min;
            z3 = z2 && min == this.f817b.f1217b;
        }
        this.f819d.f686k.m1243h();
        try {
            C0234B c0234b2 = this.f819d;
            c0234b2.f677b.m677m(c0234b2.f676a, z3, this.f817b, min);
        } finally {
            c0234b = this.f819d;
        }
    }

    @Override // p051R1.InterfaceC0465B, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C0234B c0234b = this.f819d;
        C0083o c0083o = AbstractC0122i.f368a;
        synchronized (c0234b) {
            if (this.f818c) {
                return;
            }
            boolean z2 = c0234b.m635f() == null;
            C0234B c0234b2 = this.f819d;
            if (!c0234b2.f684i.f816a) {
                if (this.f817b.f1217b > 0) {
                    while (this.f817b.f1217b > 0) {
                        m688b(true);
                    }
                } else if (z2) {
                    c0234b2.f677b.m677m(c0234b2.f676a, true, null, 0L);
                }
            }
            C0234B c0234b3 = this.f819d;
            synchronized (c0234b3) {
                this.f818c = true;
                c0234b3.notifyAll();
            }
            this.f819d.f677b.flush();
            this.f819d.m630a();
        }
    }

    @Override // p051R1.InterfaceC0465B
    /* renamed from: d */
    public final C0469F mo496d() {
        return this.f819d.f686k;
    }

    @Override // p051R1.InterfaceC0465B
    /* renamed from: e */
    public final void mo497e(C0477g c0477g, long j2) {
        C0083o c0083o = AbstractC0122i.f368a;
        C0477g c0477g2 = this.f817b;
        c0477g2.mo497e(c0477g, j2);
        while (c0477g2.f1217b >= 16384) {
            m688b(false);
        }
    }

    @Override // p051R1.InterfaceC0465B, java.io.Flushable
    public final void flush() {
        C0234B c0234b = this.f819d;
        C0083o c0083o = AbstractC0122i.f368a;
        synchronized (c0234b) {
            c0234b.m631b();
        }
        while (this.f817b.f1217b > 0) {
            m688b(false);
            this.f819d.f677b.flush();
        }
    }
}
