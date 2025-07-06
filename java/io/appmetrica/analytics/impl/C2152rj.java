package io.appmetrica.analytics.impl;

import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.rj */
/* loaded from: classes.dex */
public final class C2152rj implements InterfaceC1446Pa {

    /* renamed from: a */
    public final /* synthetic */ String f7072a;

    /* renamed from: b */
    public final /* synthetic */ Map f7073b;

    public C2152rj(String str, Map map) {
        this.f7072a = str;
        this.f7073b = map;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1446Pa
    /* renamed from: a */
    public final void mo3202a(InterfaceC1471Qa interfaceC1471Qa) {
        interfaceC1471Qa.reportEvent(this.f7072a, this.f7073b);
    }
}
