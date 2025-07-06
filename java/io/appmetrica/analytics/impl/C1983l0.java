package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;

/* renamed from: io.appmetrica.analytics.impl.l0 */
/* loaded from: classes.dex */
public final class C1983l0 implements InterfaceC1071Aa {

    /* renamed from: a */
    public final Handler f6607a;

    /* renamed from: b */
    public final ICommonExecutor f6608b;

    /* renamed from: c */
    public final ICommonExecutor f6609c;

    /* renamed from: d */
    public final C2337z4 f6610d;

    public C1983l0(C2112q4 c2112q4) {
        this(c2112q4.m4339b(), c2112q4.m4339b().getHandler(), c2112q4.m4338a(), new C2337z4());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1071Aa
    /* renamed from: a */
    public final void mo2701a(AppMetricaConfig appMetricaConfig, InterfaceC1520Sa interfaceC1520Sa) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1071Aa
    /* renamed from: b */
    public final C1636X1 mo2702b() {
        return new C1636X1(C2312y4.m4633h().m4636b(), this.f6609c);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1071Aa
    /* renamed from: c */
    public final ICommonExecutor mo2703c() {
        return this.f6608b;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1071Aa
    /* renamed from: d */
    public final Handler mo2704d() {
        return this.f6607a;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1071Aa
    /* renamed from: a */
    public final C2337z4 mo2700a() {
        return this.f6610d;
    }

    public C1983l0(ICommonExecutor iCommonExecutor, Handler handler, ICommonExecutor iCommonExecutor2, C2337z4 c2337z4) {
        this.f6608b = iCommonExecutor;
        this.f6607a = handler;
        this.f6609c = iCommonExecutor2;
        this.f6610d = c2337z4;
    }
}
