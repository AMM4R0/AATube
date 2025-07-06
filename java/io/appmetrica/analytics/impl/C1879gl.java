package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.StartupParamsCallback;

/* renamed from: io.appmetrica.analytics.impl.gl */
/* loaded from: classes.dex */
public final class C1879gl implements InterfaceC1167E6 {

    /* renamed from: a */
    public final /* synthetic */ StartupParamsCallback f6335a;

    /* renamed from: b */
    public final /* synthetic */ C1904hl f6336b;

    public C1879gl(C1904hl c1904hl, StartupParamsCallback startupParamsCallback) {
        this.f6336b = c1904hl;
        this.f6335a = startupParamsCallback;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1167E6
    /* renamed from: a */
    public final void mo2750a(int r2, Bundle bundle) {
        this.f6336b.m3964b(bundle, this.f6335a);
    }
}
