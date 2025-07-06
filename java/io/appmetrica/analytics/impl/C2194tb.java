package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.ConfigProvider;
import p105l1.C2634e;
import p105l1.InterfaceC2631b;

/* renamed from: io.appmetrica.analytics.impl.tb */
/* loaded from: classes.dex */
public final class C2194tb implements ConfigProvider {

    /* renamed from: a */
    public final C2013m5 f7160a;

    /* renamed from: b */
    public final InterfaceC2631b f7161b = new C2634e(new C2169sb(this));

    public C2194tb(C2013m5 c2013m5) {
        this.f7160a = c2013m5;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ConfigProvider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1501Rg getConfig() {
        return (C1501Rg) ((C2634e) this.f7161b).m5093a();
    }
}
