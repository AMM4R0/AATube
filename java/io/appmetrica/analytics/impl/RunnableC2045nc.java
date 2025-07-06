package io.appmetrica.analytics.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ServiceInfo;
import io.appmetrica.analytics.internal.AppMetricaService;

/* renamed from: io.appmetrica.analytics.impl.nc */
/* loaded from: classes.dex */
public final class RunnableC2045nc implements Runnable {

    /* renamed from: a */
    public final Context f6812a;

    public RunnableC2045nc(Context context) {
        this.f6812a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.f6812a;
        try {
            ServiceInfo[] serviceInfoArr = AbstractC2070oc.f6857a.getPackageInfo(context, context.getPackageName(), 516).services;
            if (serviceInfoArr != null) {
                for (ServiceInfo serviceInfo : serviceInfoArr) {
                    if (AppMetricaService.class.getName().equals(serviceInfo.name) && !serviceInfo.enabled) {
                        AbstractC2070oc.f6857a.setComponentEnabledSetting(context, new ComponentName(context, (Class<?>) AppMetricaService.class), 1, 1);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }
}
