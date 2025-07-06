package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreutils.internal.toggle.ConjunctiveCompositeThreadSafeToggle;
import p108m1.AbstractC2660j;

/* renamed from: io.appmetrica.analytics.impl.Ym */
/* loaded from: classes.dex */
public final class C1682Ym {

    /* renamed from: a */
    public final C1837f4 f5775a;

    /* renamed from: b */
    public final C1533Sn f5776b;

    /* renamed from: c */
    public final ConjunctiveCompositeThreadSafeToggle f5777c;

    public C1682Ym(Toggle toggle) {
        C1837f4 c1837f4 = new C1837f4(C2018ma.m4192h().m4216w());
        this.f5775a = c1837f4;
        C1533Sn c1533Sn = new C1533Sn();
        this.f5776b = c1533Sn;
        this.f5777c = new ConjunctiveCompositeThreadSafeToggle(AbstractC2660j.m5120X(c1837f4, c1533Sn, toggle == null ? new C1309Jn() : toggle), "loc-def");
    }
}
