package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.p095io.IExecutionPolicy;
import io.appmetrica.analytics.coreapi.internal.p095io.SslSocketFactoryProvider;
import io.appmetrica.analytics.modulesapi.internal.network.SimpleNetworkApi;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext;

/* renamed from: io.appmetrica.analytics.impl.ud */
/* loaded from: classes.dex */
public final class C2221ud implements ServiceNetworkContext {

    /* renamed from: a */
    public final C2292x9 f7222a;

    /* renamed from: b */
    public final String f7223b = new C2131qn().m4364a();

    /* renamed from: c */
    public final C1356Lk f7224c = new C1356Lk();

    public C2221ud(Context context) {
        this.f7222a = new C2292x9(context);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext
    public final IExecutionPolicy getExecutionPolicy() {
        return this.f7222a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext
    public final SimpleNetworkApi getNetworkApi() {
        return this.f7224c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext
    public final SslSocketFactoryProvider getSslSocketFactoryProvider() {
        return C2018ma.f6725C.m4217x();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext
    public final String getUserAgent() {
        return this.f7223b;
    }
}
