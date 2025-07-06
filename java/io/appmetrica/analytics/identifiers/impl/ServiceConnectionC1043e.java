package io.appmetrica.analytics.identifiers.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: io.appmetrica.analytics.identifiers.impl.e */
/* loaded from: classes.dex */
public final class ServiceConnectionC1043e implements ServiceConnection {

    /* renamed from: a */
    public final Intent f4425a;

    /* renamed from: b */
    public IBinder f4426b;

    /* renamed from: c */
    public final Object f4427c = new Object();

    public ServiceConnectionC1043e(Intent intent, String str) {
        this.f4425a = intent;
    }

    /* renamed from: a */
    public final void m2674a(Context context) {
        synchronized (this.f4427c) {
            this.f4426b = null;
            this.f4427c.notifyAll();
        }
        context.unbindService(this);
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        synchronized (this.f4427c) {
            this.f4426b = null;
            this.f4427c.notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        synchronized (this.f4427c) {
            this.f4427c.notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f4427c) {
            this.f4426b = iBinder;
            this.f4427c.notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f4427c) {
            this.f4426b = null;
            this.f4427c.notifyAll();
        }
    }
}
