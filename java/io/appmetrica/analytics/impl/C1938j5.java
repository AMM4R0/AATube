package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.j5 */
/* loaded from: classes.dex */
public final class C1938j5 extends AbstractC1913i5 {
    public C1938j5(C2013m5 c2013m5) {
        super(c2013m5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC1913i5
    /* renamed from: b */
    public final boolean mo3982b(int r2) {
        return r2 < 113;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC1913i5
    /* renamed from: c */
    public final void mo3983c() {
        C2297xe c2297xe = this.f6459a.f6688c;
        try {
            C1978kk c1978kk = new C1978kk(c2297xe, C1463Q2.f5240g);
            Long m3713a = c1978kk.f6601c.m3713a(C1978kk.f6593d);
            if (m3713a != null) {
                c1978kk.m4064a(C1978kk.f6593d, Long.valueOf(TimeUnit.SECONDS.toMillis(m3713a.longValue())));
            }
            Long m3713a2 = c1978kk.f6601c.m3713a(C1978kk.f6594e);
            if (m3713a2 != null) {
                c1978kk.m4064a(C1978kk.f6594e, Long.valueOf(TimeUnit.SECONDS.toMillis(m3713a2.longValue())));
            }
        } catch (Throwable unused) {
        }
        try {
            C1978kk c1978kk2 = new C1978kk(c2297xe, C1868ga.f6312g);
            Long m3713a3 = c1978kk2.f6601c.m3713a(C1978kk.f6593d);
            if (m3713a3 != null) {
                c1978kk2.m4064a(C1978kk.f6593d, Long.valueOf(TimeUnit.SECONDS.toMillis(m3713a3.longValue())));
            }
            Long m3713a4 = c1978kk2.f6601c.m3713a(C1978kk.f6594e);
            if (m3713a4 != null) {
                c1978kk2.m4064a(C1978kk.f6594e, Long.valueOf(TimeUnit.SECONDS.toMillis(m3713a4.longValue())));
            }
        } catch (Throwable unused2) {
        }
    }
}
