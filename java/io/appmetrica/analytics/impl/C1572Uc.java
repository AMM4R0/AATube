package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.Uc */
/* loaded from: classes.dex */
public final class C1572Uc extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ C1622Wc f5534a;

    /* renamed from: b */
    public final /* synthetic */ int f5535b;

    /* renamed from: c */
    public final /* synthetic */ String f5536c;

    public C1572Uc(C1622Wc c1622Wc, int r2, String str) {
        this.f5534a = c1622Wc;
        this.f5535b = r2;
        this.f5536c = str;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C1622Wc.m3497a(this.f5534a).mo2929a(new C1195F9(this.f5535b, this.f5536c));
    }
}
