package io.appmetrica.analytics.impl;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;

/* renamed from: io.appmetrica.analytics.impl.Mf */
/* loaded from: classes.dex */
public final class C1376Mf implements InterfaceC1396Na {

    /* renamed from: a */
    public final InstallReferrerClient f5065a;

    /* renamed from: b */
    public final ICommonExecutor f5066b;

    public C1376Mf(Context context, ICommonExecutor iCommonExecutor) {
        this(InstallReferrerClient.newBuilder(context).build(), iCommonExecutor);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1396Na
    /* renamed from: a */
    public final void mo3090a(InterfaceC1625Wf interfaceC1625Wf) {
        this.f5065a.startConnection(new C1326Kf(this, interfaceC1625Wf));
    }

    public C1376Mf(InstallReferrerClient installReferrerClient, ICommonExecutor iCommonExecutor) {
        this.f5065a = installReferrerClient;
        this.f5066b = iCommonExecutor;
    }
}
