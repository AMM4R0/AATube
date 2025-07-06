package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.ConfigProvider;
import io.appmetrica.analytics.networktasks.internal.FullUrlFormer;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: io.appmetrica.analytics.impl.Tl */
/* loaded from: classes.dex */
public final class C1556Tl implements UnderlyingNetworkTask {

    /* renamed from: a */
    public final C1606Vl f5498a;

    /* renamed from: b */
    public C2279wl f5499b;

    /* renamed from: c */
    public EnumC1779cl f5500c;

    /* renamed from: d */
    public final RequestDataHolder f5501d;

    /* renamed from: e */
    public final ConfigProvider f5502e;

    /* renamed from: f */
    public final ResponseDataHolder f5503f;

    /* renamed from: g */
    public final FullUrlFormer f5504g;

    /* renamed from: h */
    public final C1979kl f5505h;

    public C1556Tl(C1606Vl c1606Vl, FullUrlFormer<C2229ul> fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, ConfigProvider<C2229ul> configProvider) {
        this(c1606Vl, new C1979kl(), fullUrlFormer, requestDataHolder, responseDataHolder, configProvider);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final String description() {
        return "Startup task for component: " + this.f5498a.f5609a.f5665e.toString();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final FullUrlFormer<?> getFullUrlFormer() {
        return this.f5504g;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final RequestDataHolder getRequestDataHolder() {
        return this.f5501d;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final ResponseDataHolder getResponseDataHolder() {
        return this.f5503f;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final RetryPolicyConfig getRetryPolicyConfig() {
        return ((C2229ul) this.f5502e.getConfig()).getRetryPolicyConfig();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final SSLSocketFactory getSslSocketFactory() {
        ((C1555Tk) C2018ma.f6725C.m4217x()).getClass();
        return null;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final boolean onCreateTask() {
        this.f5501d.setHeader("Accept-Encoding", "encrypted");
        return this.f5498a.m3444g();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPerformRequest() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPostRequestComplete(boolean z2) {
        if (z2) {
            return;
        }
        this.f5500c = EnumC1779cl.PARSE;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final boolean onRequestComplete() {
        C2279wl handle = this.f5505h.handle(this.f5503f);
        this.f5499b = handle;
        return handle != null;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onRequestError(Throwable th) {
        this.f5500c = EnumC1779cl.NETWORK;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onShouldNotExecute() {
        this.f5500c = EnumC1779cl.NETWORK;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onSuccessfulTaskFinished() {
        if (this.f5499b == null || this.f5503f.getResponseHeaders() == null) {
            return;
        }
        this.f5498a.m3435a(this.f5499b, (C2229ul) this.f5502e.getConfig(), this.f5503f.getResponseHeaders());
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskAdded() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskFinished() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskRemoved() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onUnsuccessfulTaskFinished() {
        if (this.f5500c == null) {
            this.f5500c = EnumC1779cl.UNKNOWN;
        }
        this.f5498a.m3433a(this.f5500c);
    }

    public C1556Tl(C1606Vl c1606Vl, C1979kl c1979kl, FullUrlFormer fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, ConfigProvider configProvider) {
        this.f5498a = c1606Vl;
        this.f5505h = c1979kl;
        this.f5501d = requestDataHolder;
        this.f5503f = responseDataHolder;
        this.f5502e = configProvider;
        this.f5504g = fullUrlFormer;
        fullUrlFormer.setHosts(((C2229ul) configProvider.getConfig()).m4498k());
    }
}
