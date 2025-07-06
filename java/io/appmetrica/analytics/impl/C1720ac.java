package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;

/* renamed from: io.appmetrica.analytics.impl.ac */
/* loaded from: classes.dex */
public final class C1720ac implements InterfaceC1782d {

    /* renamed from: a */
    public final /* synthetic */ ICommonExecutor f5863a;

    /* renamed from: b */
    public final /* synthetic */ C2269wb f5864b;

    /* renamed from: c */
    public final /* synthetic */ C1981kn f5865c;

    /* renamed from: d */
    public final /* synthetic */ C1981kn f5866d;

    /* renamed from: e */
    public final /* synthetic */ C1795dc f5867e;

    public C1720ac(C1795dc c1795dc, ICommonExecutor iCommonExecutor, C2269wb c2269wb, C1981kn c1981kn, C1981kn c1981kn2) {
        this.f5867e = c1795dc;
        this.f5863a = iCommonExecutor;
        this.f5864b = c2269wb;
        this.f5865c = c1981kn;
        this.f5866d = c1981kn2;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1782d
    public final void onAppNotResponding() {
        StackTraceElement[] stackTraceElementArr;
        C1507Rm c1507Rm = this.f5867e.f6096s;
        Thread m3191a = ((C1433Om) c1507Rm.f5395a).m3191a();
        try {
            stackTraceElementArr = m3191a.getStackTrace();
        } catch (SecurityException unused) {
            stackTraceElementArr = null;
        }
        this.f5863a.execute(new RunnableC1695Zb(this, new C1559U((C1383Mm) c1507Rm.f5396b.apply(m3191a, stackTraceElementArr), c1507Rm.m3307a(m3191a, null), ((C1671Yb) c1507Rm.f5397c).m3543c())));
    }
}
