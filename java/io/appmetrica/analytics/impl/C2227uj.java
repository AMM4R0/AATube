package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* renamed from: io.appmetrica.analytics.impl.uj */
/* loaded from: classes.dex */
public final class C2227uj extends AbstractC1402Ng {
    public C2227uj(C1267I6 r12) {
        super(r12);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC1402Ng, io.appmetrica.analytics.impl.InterfaceC1427Og
    /* renamed from: a */
    public final boolean mo3122a(Boolean bool) {
        return !this.f5133a.isRestrictedForSdk() && ((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue();
    }
}
