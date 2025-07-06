package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import io.appmetrica.analytics.internal.AppMetricaService;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.Sj */
/* loaded from: classes.dex */
public final class C1529Sj implements ServiceWakeLock {

    /* renamed from: a */
    public final Context f5432a;

    /* renamed from: b */
    public final C1504Rj f5433b;

    /* renamed from: c */
    public final HashMap f5434c = new HashMap();

    public C1529Sj(Context context, C1504Rj c1504Rj) {
        this.f5432a = context;
        this.f5433b = c1504Rj;
    }

    /* renamed from: a */
    public final String m3324a(String str) {
        return "io.appmetrica.analytics.ACTION_SERVICE_WAKELOCK." + str;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock
    public final synchronized boolean acquireWakeLock(String str) {
        try {
            if (this.f5434c.get(str) == null) {
                HashMap hashMap = this.f5434c;
                C1504Rj c1504Rj = this.f5433b;
                Context context = this.f5432a;
                String m3324a = m3324a(str);
                c1504Rj.f5360a.getClass();
                Intent intent = new Intent(context, (Class<?>) AppMetricaService.class);
                intent.setAction(m3324a);
                ServiceConnectionC1480Qj serviceConnectionC1480Qj = new ServiceConnectionC1480Qj();
                try {
                    context.bindService(intent, serviceConnectionC1480Qj, 1);
                } catch (Throwable unused) {
                    serviceConnectionC1480Qj = null;
                }
                hashMap.put(str, serviceConnectionC1480Qj);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f5434c.get(str) != null;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock
    public final synchronized void releaseWakeLock(String str) {
        ServiceConnection serviceConnection = (ServiceConnection) this.f5434c.get(str);
        if (serviceConnection != null) {
            C1504Rj c1504Rj = this.f5433b;
            m3324a(str);
            Context context = this.f5432a;
            c1504Rj.getClass();
            try {
                context.unbindService(serviceConnection);
            } catch (Throwable unused) {
            }
        }
    }
}
