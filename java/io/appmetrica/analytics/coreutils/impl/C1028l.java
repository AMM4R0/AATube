package io.appmetrica.analytics.coreutils.impl;

import io.appmetrica.analytics.coreutils.internal.services.FirstExecutionConditionServiceImpl;
import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceProvider;
import kotlin.jvm.internal.AbstractC2493j;
import p131u1.InterfaceC2799a;

/* renamed from: io.appmetrica.analytics.coreutils.impl.l */
/* loaded from: classes.dex */
public final class C1028l extends AbstractC2493j implements InterfaceC2799a {

    /* renamed from: a */
    public final /* synthetic */ UtilityServiceProvider f4307a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1028l(UtilityServiceProvider utilityServiceProvider) {
        super(0);
        this.f4307a = utilityServiceProvider;
    }

    @Override // p131u1.InterfaceC2799a
    public final Object invoke() {
        return new FirstExecutionConditionServiceImpl(this.f4307a);
    }
}
