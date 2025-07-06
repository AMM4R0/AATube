package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;

/* renamed from: io.appmetrica.analytics.impl.mg */
/* loaded from: classes.dex */
public final class C2024mg implements InterfaceC1804dl {

    /* renamed from: a */
    public final C1606Vl f6765a;

    public C2024mg(C1606Vl c1606Vl) {
        this.f6765a = c1606Vl;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1804dl
    /* renamed from: a */
    public final void mo3767a() {
        NetworkTask m3440c = this.f6765a.m3440c();
        if (m3440c != null) {
            C2018ma.f6725C.getClass();
            NetworkServiceLocator.getInstance().getNetworkCore().startTask(m3440c);
        }
    }
}
