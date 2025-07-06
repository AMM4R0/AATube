package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.Tc */
/* loaded from: classes.dex */
public final class C1547Tc extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ C1622Wc f5472a;

    /* renamed from: b */
    public final /* synthetic */ ModuleEvent f5473b;

    public C1547Tc(C1622Wc c1622Wc, ModuleEvent moduleEvent) {
        this.f5472a = c1622Wc;
        this.f5473b = moduleEvent;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C1622Wc.m3497a(this.f5472a).reportEvent(this.f5473b);
    }
}
