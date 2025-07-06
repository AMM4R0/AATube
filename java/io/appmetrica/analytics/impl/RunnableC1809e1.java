package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ExternalAttribution;

/* renamed from: io.appmetrica.analytics.impl.e1 */
/* loaded from: classes.dex */
public final class RunnableC1809e1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ExternalAttribution f6114a;

    /* renamed from: b */
    public final /* synthetic */ C2009m1 f6115b;

    public RunnableC1809e1(C2009m1 c2009m1, ExternalAttribution externalAttribution) {
        this.f6115b = c2009m1;
        this.f6114a = externalAttribution;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2009m1.m4119a(this.f6115b).mo2929a(this.f6114a);
    }
}
