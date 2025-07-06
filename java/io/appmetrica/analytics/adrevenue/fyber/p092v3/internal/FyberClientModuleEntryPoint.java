package io.appmetrica.analytics.adrevenue.fyber.p092v3.internal;

import com.fyber.fairbid.ads.Interstitial;
import io.appmetrica.analytics.adrevenue.fyber.p092v3.impl.C0987c;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint;

/* loaded from: classes.dex */
public class FyberClientModuleEntryPoint implements ModuleClientEntryPoint<Object> {

    /* renamed from: a */
    private ClientContext f4163a = null;

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public String getIdentifier() {
        return "ad-revenue-fyber-v3";
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public void initClientSide(ClientContext clientContext) {
        this.f4163a = clientContext;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public void onActivated() {
        ClientContext clientContext;
        if (!ReflectionUtils.detectClassExists("com.fyber.fairbid.ads.Interstitial") || (clientContext = this.f4163a) == null) {
            return;
        }
        Interstitial.setInterstitialListener(new C0987c(clientContext));
    }
}
