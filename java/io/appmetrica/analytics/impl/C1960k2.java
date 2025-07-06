package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.HashSet;

/* renamed from: io.appmetrica.analytics.impl.k2 */
/* loaded from: classes.dex */
public final class C1960k2 {

    /* renamed from: a */
    public final ICommonExecutor f6556a;

    /* renamed from: b */
    public final HashSet f6557b;

    public C1960k2(long j2) {
        this(C2312y4.m4633h().m4639e().m4339b());
    }

    /* renamed from: a */
    public final synchronized void m4041a(C1745bc c1745bc, long j2) {
        this.f6557b.add(new C1935j2(c1745bc, this.f6556a, j2));
    }

    public C1960k2(IHandlerExecutor iHandlerExecutor) {
        this.f6557b = new HashSet();
        this.f6556a = iHandlerExecutor;
    }
}
