package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* renamed from: io.appmetrica.analytics.impl.fh */
/* loaded from: classes.dex */
public final class C1850fh extends AbstractC1402Ng {
    public C1850fh(C1267I6 r12) {
        super(r12);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC1402Ng, io.appmetrica.analytics.impl.InterfaceC1427Og
    /* renamed from: a */
    public final boolean mo3122a(Boolean bool) {
        return !this.f5133a.isRestrictedForReporter() && ((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue();
    }
}
