package io.appmetrica.analytics.impl;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import io.appmetrica.analytics.internal.IAppMetricaService;

/* renamed from: io.appmetrica.analytics.impl.g0 */
/* loaded from: classes.dex */
public final class ServiceConnectionC1858g0 implements ServiceConnection {

    /* renamed from: a */
    public final /* synthetic */ C1883h0 f6287a;

    public ServiceConnectionC1858g0(C1883h0 c1883h0) {
        this.f6287a = c1883h0;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f6287a) {
            this.f6287a.f6348d = IAppMetricaService.Stub.asInterface(iBinder);
            this.f6287a.f6349e.countDown();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f6287a) {
            this.f6287a.f6348d = null;
        }
    }
}
