package io.appmetrica.analytics.impl;

import android.location.Location;
import android.os.Bundle;
import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.StartupParamsCallback;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.Ba */
/* loaded from: classes.dex */
public interface InterfaceC1096Ba extends InterfaceC2320yc, InterfaceC1167E6, InterfaceC1520Sa {
    @Override // io.appmetrica.analytics.impl.InterfaceC1520Sa
    /* renamed from: a */
    /* synthetic */ InterfaceC1495Ra mo2749a();

    @Override // io.appmetrica.analytics.impl.InterfaceC1167E6
    /* renamed from: a */
    /* synthetic */ void mo2750a(int r12, Bundle bundle);

    @Override // io.appmetrica.analytics.impl.InterfaceC2320yc
    /* renamed from: a */
    /* synthetic */ void mo2751a(Location location);

    /* renamed from: a */
    void mo2752a(AppMetricaConfig appMetricaConfig, AppMetricaConfig appMetricaConfig2);

    /* renamed from: a */
    void mo2753a(DeferredDeeplinkListener deferredDeeplinkListener);

    /* renamed from: a */
    void mo2754a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener);

    /* renamed from: a */
    void mo2755a(ReporterConfig reporterConfig);

    /* renamed from: a */
    void mo2756a(StartupParamsCallback startupParamsCallback, List<String> list);

    @Override // io.appmetrica.analytics.impl.InterfaceC2320yc
    /* renamed from: a */
    /* synthetic */ void mo2757a(String str, String str2);

    @Override // io.appmetrica.analytics.impl.InterfaceC2320yc
    /* renamed from: a */
    /* synthetic */ void mo2758a(boolean z2);

    /* renamed from: c */
    InterfaceC1471Qa mo2759c(ReporterConfig reporterConfig);

    @Override // io.appmetrica.analytics.impl.InterfaceC2320yc
    /* synthetic */ void clearAppEnvironment();

    /* renamed from: d */
    String mo2760d();

    /* renamed from: f */
    Map<String, String> mo2761f();

    /* renamed from: g */
    AdvIdentifiersResult mo2762g();

    C1644X9 getFeatures();

    /* renamed from: h */
    C1820ec mo2763h();

    @Override // io.appmetrica.analytics.impl.InterfaceC2320yc
    /* synthetic */ void putAppEnvironmentValue(String str, String str2);

    @Override // io.appmetrica.analytics.impl.InterfaceC2320yc
    /* synthetic */ void setDataSendingEnabled(boolean z2);

    @Override // io.appmetrica.analytics.impl.InterfaceC2320yc
    /* synthetic */ void setUserProfileID(String str);
}
