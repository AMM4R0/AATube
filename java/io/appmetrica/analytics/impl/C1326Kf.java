package io.appmetrica.analytics.impl;

import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import p000A.AbstractC0002c;

/* renamed from: io.appmetrica.analytics.impl.Kf */
/* loaded from: classes.dex */
public final class C1326Kf implements InstallReferrerStateListener {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC1625Wf f4963a;

    /* renamed from: b */
    public final /* synthetic */ C1376Mf f4964b;

    public C1326Kf(C1376Mf c1376Mf, InterfaceC1625Wf interfaceC1625Wf) {
        this.f4964b = c1376Mf;
        this.f4963a = interfaceC1625Wf;
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerServiceDisconnected() {
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerSetupFinished(int r9) {
        if (r9 == 0) {
            try {
                ReferrerDetails installReferrer = this.f4964b.f5065a.getInstallReferrer();
                this.f4964b.f5066b.execute(new RunnableC1301Jf(this, new C1500Rf(installReferrer.getInstallReferrer(), installReferrer.getReferrerClickTimestampSeconds(), installReferrer.getInstallBeginTimestampSeconds(), EnumC1476Qf.f5257c)));
            } catch (Throwable th) {
                this.f4964b.f5066b.execute(new RunnableC1351Lf(this.f4963a, th));
            }
        } else {
            this.f4964b.f5066b.execute(new RunnableC1351Lf(this.f4963a, new IllegalStateException(AbstractC0002c.m11f(r9, "Referrer check failed with error "))));
        }
        try {
            this.f4964b.f5065a.endConnection();
        } catch (Throwable unused) {
        }
    }
}
