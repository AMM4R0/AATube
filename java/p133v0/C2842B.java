package p133v0;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;
import p013E0.HandlerC0128e;
import p142y0.C2895a;

/* renamed from: v0.B */
/* loaded from: classes.dex */
public final class C2842B {

    /* renamed from: g */
    public static final Object f9383g = new Object();

    /* renamed from: h */
    public static C2842B f9384h;

    /* renamed from: i */
    public static HandlerThread f9385i;

    /* renamed from: a */
    public final HashMap f9386a = new HashMap();

    /* renamed from: b */
    public final Context f9387b;

    /* renamed from: c */
    public volatile HandlerC0128e f9388c;

    /* renamed from: d */
    public final C2895a f9389d;

    /* renamed from: e */
    public final long f9390e;

    /* renamed from: f */
    public final long f9391f;

    public C2842B(Context context, Looper looper) {
        C2841A c2841a = new C2841A(this);
        this.f9387b = context.getApplicationContext();
        this.f9388c = new HandlerC0128e(looper, c2841a);
        this.f9389d = C2895a.m5484a();
        this.f9390e = 5000L;
        this.f9391f = 300000L;
    }

    /* renamed from: a */
    public static HandlerThread m5455a() {
        synchronized (f9383g) {
            try {
                HandlerThread handlerThread = f9385i;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                f9385i = handlerThread2;
                handlerThread2.start();
                return f9385i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final void m5456b(String str, ServiceConnection serviceConnection, boolean z2) {
        C2870y c2870y = new C2870y(str, z2);
        AbstractC2863r.m5475d(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f9386a) {
            try {
                ServiceConnectionC2871z serviceConnectionC2871z = (ServiceConnectionC2871z) this.f9386a.get(c2870y);
                if (serviceConnectionC2871z == null) {
                    String c2870y2 = c2870y.toString();
                    StringBuilder sb = new StringBuilder(c2870y2.length() + 50);
                    sb.append("Nonexistent connection status for service config: ");
                    sb.append(c2870y2);
                    throw new IllegalStateException(sb.toString());
                }
                if (!serviceConnectionC2871z.f9477a.containsKey(serviceConnection)) {
                    String c2870y3 = c2870y.toString();
                    StringBuilder sb2 = new StringBuilder(c2870y3.length() + 76);
                    sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb2.append(c2870y3);
                    throw new IllegalStateException(sb2.toString());
                }
                serviceConnectionC2871z.f9477a.remove(serviceConnection);
                if (serviceConnectionC2871z.f9477a.isEmpty()) {
                    this.f9388c.sendMessageDelayed(this.f9388c.obtainMessage(0, c2870y), this.f9390e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: c */
    public final boolean m5457c(C2870y c2870y, ServiceConnectionC2866u serviceConnectionC2866u, String str) {
        boolean z2;
        synchronized (this.f9386a) {
            try {
                ServiceConnectionC2871z serviceConnectionC2871z = (ServiceConnectionC2871z) this.f9386a.get(c2870y);
                if (serviceConnectionC2871z == null) {
                    serviceConnectionC2871z = new ServiceConnectionC2871z(this, c2870y);
                    serviceConnectionC2871z.f9477a.put(serviceConnectionC2866u, serviceConnectionC2866u);
                    serviceConnectionC2871z.m5477a(str);
                    this.f9386a.put(c2870y, serviceConnectionC2871z);
                } else {
                    this.f9388c.removeMessages(0, c2870y);
                    if (serviceConnectionC2871z.f9477a.containsKey(serviceConnectionC2866u)) {
                        String c2870y2 = c2870y.toString();
                        StringBuilder sb = new StringBuilder(c2870y2.length() + 81);
                        sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb.append(c2870y2);
                        throw new IllegalStateException(sb.toString());
                    }
                    serviceConnectionC2871z.f9477a.put(serviceConnectionC2866u, serviceConnectionC2866u);
                    int r5 = serviceConnectionC2871z.f9478b;
                    if (r5 == 1) {
                        serviceConnectionC2866u.onServiceConnected(serviceConnectionC2871z.f9482f, serviceConnectionC2871z.f9480d);
                    } else if (r5 == 2) {
                        serviceConnectionC2871z.m5477a(str);
                    }
                }
                z2 = serviceConnectionC2871z.f9479c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }
}
