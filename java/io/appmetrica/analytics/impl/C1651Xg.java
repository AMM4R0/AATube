package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.Xg */
/* loaded from: classes.dex */
public final class C1651Xg extends AbstractC2249vg {
    public C1651Xg(C2013m5 c2013m5) {
        super(c2013m5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC2249vg
    /* renamed from: a */
    public final boolean mo2734a(C1615W5 c1615w5) {
        this.f7308a.f6702q.m4398b();
        C1903hk c1903hk = this.f7308a.f6696k;
        synchronized (c1903hk) {
            try {
                C1554Tj m3950b = c1903hk.m3950b(c1615w5);
                if (m3950b.f5492g) {
                    m3950b.f5492g = false;
                    C1978kk c1978kk = m3950b.f5487b;
                    c1978kk.m4064a(C1978kk.f6598i, Boolean.FALSE);
                    c1978kk.m4066b();
                }
                if (c1903hk.f6435h != 1) {
                    c1903hk.m3949a(c1903hk.f6434g, c1615w5);
                }
                c1903hk.f6435h = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
        return false;
    }
}
