package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.d0 */
/* loaded from: classes.dex */
public final class C1783d0 {

    /* renamed from: a */
    public final HashMap f6062a = new HashMap();

    /* renamed from: a */
    public final synchronized C1758c0 m3719a(C1838f5 c1838f5, C2123qf c2123qf, C2297xe c2297xe) {
        C1758c0 c1758c0;
        c1758c0 = (C1758c0) this.f6062a.get(c1838f5.toString());
        if (c1758c0 == null) {
            C1733b0 m4616d = c2297xe.m4616d();
            c1758c0 = new C1758c0(m4616d.f5898a, m4616d.f5899b, new C1331Kk(c2123qf, "[App Environment]"));
            this.f6062a.put(c1838f5.toString(), c1758c0);
        }
        return c1758c0;
    }

    /* renamed from: a */
    public final synchronized void m3720a(C1733b0 c1733b0, C2297xe c2297xe) {
        c2297xe.m4613a(c1733b0).m4658b();
    }
}
