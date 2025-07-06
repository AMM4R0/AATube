package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.Jg */
/* loaded from: classes.dex */
public final class C1302Jg extends AbstractC2249vg {
    public C1302Jg(C2013m5 c2013m5) {
        super(c2013m5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC2249vg
    /* renamed from: a */
    public final boolean mo2734a(C1615W5 c1615w5) {
        C1554Tj c1554Tj;
        C1953jk c1953jk;
        C1992l9 c1992l9 = this.f7308a.f6700o;
        C1903hk c1903hk = c1992l9.f6638c;
        if (c1903hk.f6435h == 0) {
            c1554Tj = c1903hk.f6432e.m3901b();
            if (c1554Tj != null && c1554Tj.m3380a(c1615w5.f5629i) && (c1554Tj = c1903hk.f6433f.m3901b()) != null && c1554Tj.m3380a(c1615w5.f5629i)) {
                c1554Tj = null;
            }
        } else {
            c1554Tj = c1903hk.f6434g;
        }
        if (c1554Tj != null) {
            c1953jk = new C1953jk();
            c1953jk.f6547a = c1554Tj.f5489d;
            long andIncrement = c1554Tj.f5491f.getAndIncrement();
            C1978kk c1978kk = c1554Tj.f5487b;
            c1978kk.m4064a(C1978kk.f6596g, Long.valueOf(c1554Tj.f5491f.get()));
            c1978kk.m4066b();
            c1953jk.f6548b = andIncrement;
            c1953jk.f6549c = TimeUnit.MILLISECONDS.toSeconds(c1554Tj.f5495j);
            c1953jk.f6550d = c1554Tj.f5488c.f5647a;
        } else {
            long j2 = c1615w5.f5630j;
            long m3896a = c1903hk.f6429b.m3896a();
            C1417O6 c1417o6 = c1903hk.f6428a.f6691f;
            EnumC2003lk enumC2003lk = EnumC2003lk.BACKGROUND;
            c1417o6.m3159a(m3896a, enumC2003lk, j2);
            C1953jk c1953jk2 = new C1953jk();
            c1953jk2.f6547a = m3896a;
            c1953jk2.f6550d = enumC2003lk;
            c1953jk2.f6548b = 0L;
            c1953jk2.f6549c = 0L;
            c1953jk = c1953jk2;
        }
        c1992l9.m4100a(c1615w5, c1953jk);
        return true;
    }
}
