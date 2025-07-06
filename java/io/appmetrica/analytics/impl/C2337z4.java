package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* renamed from: io.appmetrica.analytics.impl.z4 */
/* loaded from: classes.dex */
public final class C2337z4 {

    /* renamed from: a */
    public final SystemTimeProvider f7515a;

    public C2337z4() {
        this(new SystemTimeProvider());
    }

    /* renamed from: a */
    public final void m4673a() {
        this.f7515a.elapsedRealtime();
    }

    public C2337z4(SystemTimeProvider systemTimeProvider) {
        this.f7515a = systemTimeProvider;
    }
}
