package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Handler;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p108m1.AbstractC2661k;

/* renamed from: io.appmetrica.analytics.impl.i0 */
/* loaded from: classes.dex */
public final class C1908i0 implements InterfaceC1071Aa {

    /* renamed from: a */
    public final Context f6446a;

    /* renamed from: b */
    public final Handler f6447b;

    /* renamed from: c */
    public final C2337z4 f6448c;

    /* renamed from: d */
    public final IHandlerExecutor f6449d;

    /* renamed from: e */
    public final C1636X1 f6450e;

    /* renamed from: f */
    public volatile C1536T1 f6451f;

    /* renamed from: g */
    public boolean f6452g;

    public C1908i0(Context context, IHandlerExecutor iHandlerExecutor, ICommonExecutor iCommonExecutor) {
        this(context, iHandlerExecutor, new C2337z4(), new C1636X1(iCommonExecutor));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1071Aa
    /* renamed from: a */
    public final synchronized void mo2701a(AppMetricaConfig appMetricaConfig, InterfaceC1520Sa interfaceC1520Sa) {
        try {
            if (!this.f6452g) {
                if (((Boolean) WrapUtils.getOrDefault(appMetricaConfig.crashReporting, Boolean.TRUE)).booleanValue() && this.f6451f == null) {
                    Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                    C2139r6 c2139r6 = C2312y4.m4633h().f7484i;
                    Context context = this.f6446a;
                    List list = c2139r6.f7042a;
                    ArrayList arrayList = new ArrayList(AbstractC2661k.m5122Z(list));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((InterfaceC2114q6) it.next()).mo2941a(context, appMetricaConfig, interfaceC1520Sa));
                    }
                    this.f6451f = new C1536T1(defaultUncaughtExceptionHandler, arrayList, C2312y4.m4633h().f7476a, new C2214u6(), new C1507Rm());
                    Thread.setDefaultUncaughtExceptionHandler(this.f6451f);
                }
                if (((Boolean) WrapUtils.getOrDefault(appMetricaConfig.appOpenTrackingEnabled, Boolean.TRUE)).booleanValue()) {
                    this.f6450e.m3503b();
                }
                this.f6452g = true;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1071Aa
    /* renamed from: b */
    public final C1636X1 mo2702b() {
        return this.f6450e;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1071Aa
    /* renamed from: c */
    public final ICommonExecutor mo2703c() {
        return this.f6449d;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1071Aa
    /* renamed from: d */
    public final Handler mo2704d() {
        return this.f6447b;
    }

    /* renamed from: e */
    public final void m3975e() {
        this.f6449d.execute(new RunnableC2045nc(this.f6446a));
    }

    public C1908i0(Context context, IHandlerExecutor iHandlerExecutor, C2337z4 c2337z4, C1636X1 c1636x1) {
        this.f6452g = false;
        this.f6446a = context;
        this.f6449d = iHandlerExecutor;
        this.f6450e = c1636x1;
        AbstractC1546Tb.m3356a(context);
        AbstractC1329Ki.m3025b();
        this.f6447b = iHandlerExecutor.getHandler();
        this.f6448c = c2337z4;
        c2337z4.m4673a();
        m3975e();
        AbstractC1862g4.m3848a().onCreate();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1071Aa
    /* renamed from: a */
    public final C2337z4 mo2700a() {
        return this.f6448c;
    }
}
