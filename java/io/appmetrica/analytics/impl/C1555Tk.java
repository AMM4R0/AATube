package io.appmetrica.analytics.impl;

import android.content.Context;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: io.appmetrica.analytics.impl.Tk */
/* loaded from: classes.dex */
public final class C1555Tk implements InterfaceC1761c3 {

    /* renamed from: a */
    public final Context f5497a;

    public C1555Tk(Context context) {
        this.f5497a = context;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1761c3, io.appmetrica.analytics.impl.InterfaceC1182El
    /* renamed from: a */
    public final void mo2780a(C2354zl c2354zl) {
    }

    @Override // io.appmetrica.analytics.coreapi.internal.p095io.SslSocketFactoryProvider
    public final SSLSocketFactory getSslSocketFactory() {
        return null;
    }

    /* renamed from: a */
    public final Context m3381a() {
        return this.f5497a;
    }
}
