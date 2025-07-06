package io.appmetrica.analytics.impl;

import android.os.Bundle;

/* renamed from: io.appmetrica.analytics.impl.J1 */
/* loaded from: classes.dex */
public final class C1287J1 implements InterfaceC1130Cj {

    /* renamed from: b */
    public static final C1262I1 f4891b = new C1262I1();

    /* renamed from: c */
    public static final int f4892c = 1;

    /* renamed from: a */
    public final InterfaceC1958k0 f4893a;

    public C1287J1(InterfaceC1958k0 interfaceC1958k0) {
        this.f4893a = interfaceC1958k0;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1130Cj
    public final void reportData(int r12, Bundle bundle) {
        ((C1212G1) this.f4893a).m2885a(bundle);
    }
}
