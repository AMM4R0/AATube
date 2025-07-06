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

/* renamed from: io.appmetrica.analytics.impl.u0 */
/* loaded from: classes.dex */
public final class C2208u0 implements InterfaceC1096Ba {
    @Override // io.appmetrica.analytics.impl.InterfaceC1096Ba, io.appmetrica.analytics.impl.InterfaceC1167E6
    /* renamed from: a */
    public final void mo2750a(int r12, Bundle bundle) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1096Ba
    /* renamed from: c */
    public final InterfaceC1471Qa mo2759c(ReporterConfig reporterConfig) {
        return new C1378Mh();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1096Ba, io.appmetrica.analytics.impl.InterfaceC2320yc
    public final void clearAppEnvironment() {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1096Ba
    /* renamed from: d */
    public final String mo2760d() {
        return null;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1096Ba
    /* renamed from: f */
    public final Map<String, String> mo2761f() {
        return null;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1096Ba
    /* renamed from: g */
    public final AdvIdentifiersResult mo2762g() {
        AdvIdentifiersResult.Details details = AdvIdentifiersResult.Details.INTERNAL_ERROR;
        return new AdvIdentifiersResult(new AdvIdentifiersResult.AdvId(null, details, "Device user is in locked state"), new AdvIdentifiersResult.AdvId(null, details, "Device user is in locked state"), new AdvIdentifiersResult.AdvId(null, details, "Device user is in locked state"));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1096Ba
    public final C1644X9 getFeatures() {
        return new C1644X9();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1096Ba
    /* renamed from: h */
    public final C1820ec mo2763h() {
        C2020mc c2020mc = new C2020mc();
        return new C1820ec(c2020mc, new C1118C7(c2020mc));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1096Ba, io.appmetrica.analytics.impl.InterfaceC2320yc
    public final void putAppEnvironmentValue(String str, String str2) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1096Ba, io.appmetrica.analytics.impl.InterfaceC2320yc
    public final void setDataSendingEnabled(boolean z2) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1096Ba, io.appmetrica.analytics.impl.InterfaceC2320yc
    public final void setUserProfileID(String str) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1096Ba, io.appmetrica.analytics.impl.InterfaceC2320yc
    /* renamed from: a */
    public final void mo2751a(Location location) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1096Ba
    /* renamed from: a */
    public final void mo2752a(AppMetricaConfig appMetricaConfig, AppMetricaConfig appMetricaConfig2) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1096Ba
    /* renamed from: a */
    public final void mo2753a(DeferredDeeplinkListener deferredDeeplinkListener) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1096Ba
    /* renamed from: a */
    public final void mo2754a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1096Ba
    /* renamed from: a */
    public final void mo2755a(ReporterConfig reporterConfig) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1096Ba, io.appmetrica.analytics.impl.InterfaceC2320yc
    /* renamed from: a */
    public final void mo2757a(String str, String str2) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1096Ba, io.appmetrica.analytics.impl.InterfaceC2320yc
    /* renamed from: a */
    public final void mo2758a(boolean z2) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1096Ba
    /* renamed from: a */
    public final void mo2756a(StartupParamsCallback startupParamsCallback, List<String> list) {
        startupParamsCallback.onRequestError(StartupParamsCallback.Reason.UNKNOWN, null);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1096Ba, io.appmetrica.analytics.impl.InterfaceC1520Sa
    /* renamed from: a */
    public final InterfaceC1495Ra mo2749a() {
        return new C1453Ph();
    }
}
