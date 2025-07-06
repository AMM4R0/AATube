package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.network.NetworkClientWithCacheControl;
import io.appmetrica.analytics.modulesapi.internal.network.SimpleNetworkApi;
import io.appmetrica.analytics.networktasks.internal.CacheControlHttpsConnectionPerformer;

/* renamed from: io.appmetrica.analytics.impl.Lk */
/* loaded from: classes.dex */
public final class C1356Lk implements SimpleNetworkApi {

    /* renamed from: a */
    public final CacheControlHttpsConnectionPerformer f5014a = new CacheControlHttpsConnectionPerformer(((C1555Tk) C2018ma.m4192h().m4217x()).getSslSocketFactory());

    @Override // io.appmetrica.analytics.modulesapi.internal.network.SimpleNetworkApi
    public final void performRequestWithCacheControl(String str, NetworkClientWithCacheControl networkClientWithCacheControl) {
        this.f5014a.performConnection(str, new C1189F3(networkClientWithCacheControl));
    }
}
