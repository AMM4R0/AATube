package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.zi */
/* loaded from: classes.dex */
public final class C2351zi extends AbstractC2249vg {

    /* renamed from: b */
    public final C1574Ue f7531b;

    public C2351zi(C2013m5 c2013m5) {
        this(c2013m5, C2018ma.m4192h().m4210q());
    }

    @Override // io.appmetrica.analytics.impl.AbstractC2249vg
    /* renamed from: a */
    public final boolean mo2734a(C1615W5 c1615w5) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(c1615w5.getValue()).optJSONObject("preloadInfo");
        } catch (Throwable unused) {
            jSONObject = null;
        }
        this.f7531b.m3198b(C1499Re.m3258a(jSONObject));
        return false;
    }

    public C2351zi(C2013m5 c2013m5, C1574Ue c1574Ue) {
        super(c2013m5);
        this.f7531b = c1574Ue;
    }
}
