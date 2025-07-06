package io.appmetrica.analytics.impl;

import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.b5 */
/* loaded from: classes.dex */
public final class C1738b5 implements InterfaceC1715a7 {

    /* renamed from: a */
    public final String f5905a;

    /* renamed from: b */
    public final String f5906b;

    public C1738b5(C1838f5 c1838f5) {
        this.f5905a = String.format("component_%s.db", Arrays.copyOf(new Object[]{c1838f5.mo3807c() ? "main" : c1838f5.m3805a()}, 1));
        this.f5906b = "db_metrica_" + c1838f5;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1715a7
    /* renamed from: a */
    public final String mo2850a() {
        return this.f5906b;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1715a7
    /* renamed from: b */
    public final String mo2851b() {
        return this.f5905a;
    }
}
