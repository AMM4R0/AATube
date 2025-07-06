package io.appmetrica.analytics.impl;

import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.Ee */
/* loaded from: classes.dex */
public final class C1175Ee implements InterfaceC1468Q7 {

    /* renamed from: a */
    public final C1499Re f4696a;

    /* renamed from: b */
    public final List<C1150De> f4697b;

    public C1175Ee(C1499Re c1499Re, List<C1150De> list) {
        this.f4696a = c1499Re;
        this.f4697b = list;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1468Q7
    /* renamed from: a */
    public final List<C1150De> mo2857a() {
        return this.f4697b;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1468Q7
    /* renamed from: b */
    public final Object mo2858b() {
        return this.f4696a;
    }

    /* renamed from: c */
    public final C1499Re m2859c() {
        return this.f4696a;
    }

    public final String toString() {
        return "PreloadInfoData{chosenPreloadInfo=" + this.f4696a + ", candidates=" + this.f4697b + '}';
    }
}
