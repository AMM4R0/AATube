package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;

/* renamed from: io.appmetrica.analytics.impl.la */
/* loaded from: classes.dex */
public final class C1993la implements InterfaceC1305Jj {
    @Override // io.appmetrica.analytics.impl.InterfaceC1305Jj
    public final void onCreate() {
        NetworkServiceLocator.getInstance().onCreate();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1305Jj
    public final void onDestroy() {
        NetworkServiceLocator.getInstance().onDestroy();
    }
}
