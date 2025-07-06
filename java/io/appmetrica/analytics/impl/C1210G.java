package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;

/* renamed from: io.appmetrica.analytics.impl.G */
/* loaded from: classes.dex */
public final class C1210G implements Provider {

    /* renamed from: a */
    public final /* synthetic */ Context f4746a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC1951ji f4747b;

    /* renamed from: c */
    public final /* synthetic */ C1235H f4748c;

    public C1210G(C1235H c1235h, Context context, InterfaceC1951ji interfaceC1951ji) {
        this.f4748c = c1235h;
        this.f4746a = context;
        this.f4747b = interfaceC1951ji;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Provider
    public final Object get() {
        return this.f4748c.f4807a.mo2849a(this.f4746a, this.f4747b);
    }
}
