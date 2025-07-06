package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AnrListener;

/* renamed from: io.appmetrica.analytics.impl.cc */
/* loaded from: classes.dex */
public final class C1770cc implements InterfaceC1782d {

    /* renamed from: a */
    public final /* synthetic */ AnrListener f6048a;

    public C1770cc(AnrListener anrListener) {
        this.f6048a = anrListener;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1782d
    public final void onAppNotResponding() {
        this.f6048a.onAppNotResponding();
    }
}
