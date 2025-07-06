package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* renamed from: io.appmetrica.analytics.impl.Ng */
/* loaded from: classes.dex */
public abstract class AbstractC1402Ng implements InterfaceC1427Og {

    /* renamed from: a */
    protected final DataSendingRestrictionController f5133a;

    public AbstractC1402Ng(DataSendingRestrictionController dataSendingRestrictionController) {
        this.f5133a = dataSendingRestrictionController;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1427Og
    /* renamed from: a */
    public boolean mo3122a(Boolean bool) {
        return ((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue();
    }
}
