package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceConfiguration;
import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceProvider;

/* renamed from: io.appmetrica.analytics.impl.xn */
/* loaded from: classes.dex */
public final class C2306xn implements InterfaceC1182El {

    /* renamed from: a */
    public final UtilityServiceProvider f7469a;

    public C2306xn(UtilityServiceProvider utilityServiceProvider) {
        this.f7469a = utilityServiceProvider;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1182El
    /* renamed from: a */
    public final void mo2780a(C2354zl c2354zl) {
        this.f7469a.updateConfiguration(new UtilityServiceConfiguration(c2354zl.f7560v, c2354zl.f7559u));
    }
}
