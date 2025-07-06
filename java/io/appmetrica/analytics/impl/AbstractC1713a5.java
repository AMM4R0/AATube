package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* renamed from: io.appmetrica.analytics.impl.a5 */
/* loaded from: classes.dex */
public abstract class AbstractC1713a5 extends AbstractC2288x5 {
    public AbstractC1713a5(BaseRequestConfig.ComponentLoader<Object, Object, C1490R5> componentLoader, C2354zl c2354zl, BaseRequestConfig.BaseRequestArguments<C1265I4, Object> baseRequestArguments) {
        super(componentLoader, c2354zl, baseRequestArguments);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC2288x5
    /* renamed from: a */
    public final void mo3597a(Object obj) {
        C1265I4 r12 = (C1265I4) obj;
        synchronized (this) {
            super.mo3597a((Object) r12);
        }
    }

    /* renamed from: a */
    public final synchronized void m3596a(C1265I4 r12) {
        super.mo3597a((Object) r12);
    }
}
