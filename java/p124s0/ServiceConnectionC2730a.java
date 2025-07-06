package p124s0;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p133v0.AbstractC2863r;

/* renamed from: s0.a */
/* loaded from: classes.dex */
public final class ServiceConnectionC2730a implements ServiceConnection {

    /* renamed from: a */
    public boolean f8968a = false;

    /* renamed from: b */
    public final LinkedBlockingQueue f8969b = new LinkedBlockingQueue();

    /* renamed from: a */
    public final IBinder m5320a(TimeUnit timeUnit) {
        AbstractC2863r.m5473b("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f8968a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f8968a = true;
        IBinder iBinder = (IBinder) this.f8969b.poll(10000L, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f8969b.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
