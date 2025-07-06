package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import kotlin.jvm.internal.AbstractC2492i;

/* renamed from: io.appmetrica.analytics.impl.D0 */
/* loaded from: classes.dex */
public final class C1136D0 {

    /* renamed from: a */
    public final ICommonExecutor f4616a;

    /* renamed from: b */
    public final C2133r0 f4617b;

    /* renamed from: c */
    public final C2097pe f4618c;

    /* renamed from: d */
    public final C2172se f4619d;

    public C1136D0(ICommonExecutor iCommonExecutor, C2133r0 c2133r0, C2097pe c2097pe, C2172se c2172se) {
        this.f4616a = iCommonExecutor;
        this.f4617b = c2133r0;
        this.f4618c = c2097pe;
        this.f4619d = c2172se;
    }

    /* renamed from: a */
    public static final InterfaceC1246Ha m2810a(C1136D0 c1136d0) {
        c1136d0.f4617b.getClass();
        C2108q0 c2108q0 = C2108q0.f6954f;
        AbstractC2492i.m4912b(c2108q0);
        C1820ec mo2763h = c2108q0.m4334e().mo2763h();
        AbstractC2492i.m4912b(mo2763h);
        return mo2763h.f6146a;
    }

    public C1136D0(ICommonExecutor iCommonExecutor) {
        this(iCommonExecutor, new C2133r0());
    }

    public C1136D0(ICommonExecutor iCommonExecutor, C2133r0 c2133r0) {
        this(iCommonExecutor, c2133r0, new C2097pe(c2133r0), new C2172se());
    }
}
