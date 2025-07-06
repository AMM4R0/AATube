package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import kotlin.jvm.internal.AbstractC2492i;

/* renamed from: io.appmetrica.analytics.impl.Wc */
/* loaded from: classes.dex */
public final class C1622Wc {

    /* renamed from: a */
    public final ICommonExecutor f5642a;

    /* renamed from: b */
    public final C2133r0 f5643b;

    /* renamed from: c */
    public final C1473Qc f5644c;

    /* renamed from: d */
    public final C1771cd f5645d;

    public C1622Wc(ICommonExecutor iCommonExecutor, C2133r0 c2133r0, C1473Qc c1473Qc, C1771cd c1771cd) {
        this.f5642a = iCommonExecutor;
        this.f5643b = c2133r0;
        this.f5644c = c1473Qc;
        this.f5645d = c1771cd;
    }

    /* renamed from: a */
    public static final InterfaceC1246Ha m3497a(C1622Wc c1622Wc) {
        c1622Wc.f5643b.getClass();
        C2108q0 c2108q0 = C2108q0.f6954f;
        AbstractC2492i.m4912b(c2108q0);
        C1820ec mo2763h = c2108q0.m4334e().mo2763h();
        AbstractC2492i.m4912b(mo2763h);
        return mo2763h.f6146a;
    }

    public C1622Wc(ICommonExecutor iCommonExecutor, C2133r0 c2133r0) {
        this(iCommonExecutor, c2133r0, new C1473Qc(c2133r0), new C1771cd());
    }
}
