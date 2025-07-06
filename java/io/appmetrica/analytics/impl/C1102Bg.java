package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.IReporter;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.Bg */
/* loaded from: classes.dex */
public final class C1102Bg extends AbstractC2249vg {

    /* renamed from: b */
    public final IReporter f4532b;

    public C1102Bg(C2013m5 c2013m5, IReporter iReporter) {
        super(c2013m5);
        this.f4532b = iReporter;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC2249vg
    /* renamed from: a */
    public final boolean mo2734a(C1615W5 c1615w5) {
        C2295xc c2295xc = (C2295xc) C2295xc.f7430c.get(c1615w5.f5624d);
        HashMap hashMap = new HashMap();
        hashMap.put("type", c2295xc.f7431a);
        hashMap.put("delivery_method", c2295xc.f7432b);
        this.f4532b.reportEvent("crash_saved", hashMap);
        return false;
    }
}
