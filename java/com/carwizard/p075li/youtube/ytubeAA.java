package com.carwizard.p075li.youtube;

import android.app.Application;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.AppMetricaConfig;
import kotlin.jvm.internal.AbstractC2492i;

/* loaded from: classes.dex */
public final class ytubeAA extends Application {
    @Override // android.app.Application
    public final void onCreate() {
        super.onCreate();
        AppMetricaConfig build = AppMetricaConfig.newConfigBuilder("8dc3f4be-bdf4-43f3-bd8c-92b9bed07357").withSessionTimeout(120).withLocationTracking(true).build();
        AbstractC2492i.m4914d(build, "build(...)");
        AppMetrica.activate(getApplicationContext(), build);
        AppMetrica.enableActivityAutoTracking(this);
    }
}
