package p142y0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import p001A0.C0007d;
import p133v0.AbstractC2863r;
import p133v0.ServiceConnectionC2871z;

/* renamed from: y0.a */
/* loaded from: classes.dex */
public final class C2895a {

    /* renamed from: b */
    public static final Object f9528b = new Object();

    /* renamed from: c */
    public static volatile C2895a f9529c;

    /* renamed from: a */
    public ConcurrentHashMap f9530a;

    /* renamed from: a */
    public static C2895a m5484a() {
        if (f9529c == null) {
            synchronized (f9528b) {
                try {
                    if (f9529c == null) {
                        C2895a c2895a = new C2895a();
                        c2895a.f9530a = new ConcurrentHashMap();
                        f9529c = c2895a;
                    }
                } finally {
                }
            }
        }
        C2895a c2895a2 = f9529c;
        AbstractC2863r.m5474c(c2895a2);
        return c2895a2;
    }

    /* renamed from: b */
    public final void m5485b(Context context, ServiceConnection serviceConnection) {
        if (!(serviceConnection instanceof ServiceConnectionC2871z)) {
            ConcurrentHashMap concurrentHashMap = this.f9530a;
            if (concurrentHashMap.containsKey(serviceConnection)) {
                try {
                    try {
                        context.unbindService((ServiceConnection) concurrentHashMap.get(serviceConnection));
                    } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
                    }
                    return;
                } finally {
                    concurrentHashMap.remove(serviceConnection);
                }
            }
        }
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
        }
    }

    /* renamed from: c */
    public final boolean m5486c(Context context, String str, Intent intent, ServiceConnection serviceConnection, int r11) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((C0007d.m96a(context).f3a.getPackageManager().getApplicationInfo(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (serviceConnection instanceof ServiceConnectionC2871z) {
            return context.bindService(intent, serviceConnection, r11);
        }
        ConcurrentHashMap concurrentHashMap = this.f9530a;
        ServiceConnection serviceConnection2 = (ServiceConnection) concurrentHashMap.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
        }
        try {
            boolean bindService = context.bindService(intent, serviceConnection, r11);
            if (bindService) {
                return bindService;
            }
            return false;
        } finally {
            concurrentHashMap.remove(serviceConnection, serviceConnection);
        }
    }
}
