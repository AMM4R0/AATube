package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import p007C0.AbstractBinderC0064c;
import p007C0.AbstractC0062a;
import p007C0.C0063b;
import p007C0.InterfaceC0065d;
import p124s0.C2735f;
import p124s0.C2736g;
import p124s0.ServiceConnectionC2730a;
import p133v0.AbstractC2863r;
import p142y0.C2895a;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public class AdvertisingIdClient {

    @GuardedBy("this")
    ServiceConnectionC2730a zza;

    @GuardedBy("this")
    InterfaceC0065d zzb;

    @GuardedBy("this")
    boolean zzc;
    final Object zzd;

    @GuardedBy("mAutoDisconnectTaskLock")
    C0743b zze;
    final long zzf;

    @GuardedBy("this")
    private final Context zzg;

    public static final class Info {
        private final String zza;
        private final boolean zzb;

        @Deprecated
        public Info(String str, boolean z2) {
            this.zza = str;
            this.zzb = z2;
        }

        public String getId() {
            return this.zza;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.zzb;
        }

        public String toString() {
            String str = this.zza;
            boolean z2 = this.zzb;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z2);
            return sb.toString();
        }
    }

    public AdvertisingIdClient(Context context) {
        this(context, 30000L, false, false);
    }

    public static Info getAdvertisingIdInfo(Context context) {
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, true, false);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            advertisingIdClient.zzb(false);
            Info zzd = advertisingIdClient.zzd(-1);
            advertisingIdClient.zzc(zzd, true, 0.0f, SystemClock.elapsedRealtime() - elapsedRealtime, "", null);
            return zzd;
        } finally {
        }
    }

    public static boolean getIsAdIdFakeForDebugLogging(Context context) {
        boolean z2;
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, false, false);
        try {
            advertisingIdClient.zzb(false);
            AbstractC2863r.m5473b("Calling this from your main thread can lead to deadlock");
            synchronized (advertisingIdClient) {
                try {
                    if (!advertisingIdClient.zzc) {
                        synchronized (advertisingIdClient.zzd) {
                            C0743b c0743b = advertisingIdClient.zze;
                            if (c0743b == null || !c0743b.f2675d) {
                                throw new IOException("AdvertisingIdClient is not connected.");
                            }
                        }
                        try {
                            advertisingIdClient.zzb(false);
                            if (!advertisingIdClient.zzc) {
                                throw new IOException("AdvertisingIdClient cannot reconnect.");
                            }
                        } catch (Exception e2) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.", e2);
                        }
                    }
                    AbstractC2863r.m5474c(advertisingIdClient.zza);
                    AbstractC2863r.m5474c(advertisingIdClient.zzb);
                    try {
                        C0063b c0063b = (C0063b) advertisingIdClient.zzb;
                        c0063b.getClass();
                        Parcel obtain = Parcel.obtain();
                        obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                        Parcel m247a = c0063b.m247a(obtain, 6);
                        int r12 = AbstractC0062a.f126a;
                        z2 = m247a.readInt() != 0;
                        m247a.recycle();
                    } catch (RemoteException e3) {
                        Log.i("AdvertisingIdClient", "GMS remote exception ", e3);
                        throw new IOException("Remote exception");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            advertisingIdClient.zze();
            return z2;
        } finally {
            advertisingIdClient.zza();
        }
    }

    public static void setShouldSkipGmsCoreVersionCheck(boolean z2) {
    }

    private final Info zzd(int r7) {
        Info info;
        AbstractC2863r.m5473b("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.zzc) {
                    synchronized (this.zzd) {
                        C0743b c0743b = this.zze;
                        if (c0743b == null || !c0743b.f2675d) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        zzb(false);
                        if (!this.zzc) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e2) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e2);
                    }
                }
                AbstractC2863r.m5474c(this.zza);
                AbstractC2863r.m5474c(this.zzb);
                try {
                    C0063b c0063b = (C0063b) this.zzb;
                    c0063b.getClass();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    Parcel m247a = c0063b.m247a(obtain, 1);
                    String readString = m247a.readString();
                    m247a.recycle();
                    C0063b c0063b2 = (C0063b) this.zzb;
                    c0063b2.getClass();
                    Parcel obtain2 = Parcel.obtain();
                    obtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    int r5 = AbstractC0062a.f126a;
                    obtain2.writeInt(1);
                    Parcel m247a2 = c0063b2.m247a(obtain2, 2);
                    boolean z2 = m247a2.readInt() != 0;
                    m247a2.recycle();
                    info = new Info(readString, z2);
                } catch (RemoteException e3) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e3);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zze();
        return info;
    }

    private final void zze() {
        synchronized (this.zzd) {
            C0743b c0743b = this.zze;
            if (c0743b != null) {
                c0743b.f2674c.countDown();
                try {
                    this.zze.join();
                } catch (InterruptedException unused) {
                }
            }
            long j2 = this.zzf;
            if (j2 > 0) {
                this.zze = new C0743b(this, j2);
            }
        }
    }

    public final void finalize() {
        zza();
        super.finalize();
    }

    public Info getInfo() {
        return zzd(-1);
    }

    public void start() {
        zzb(true);
    }

    public final void zza() {
        AbstractC2863r.m5473b("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.zzg == null || this.zza == null) {
                    return;
                }
                try {
                    if (this.zzc) {
                        C2895a.m5484a().m5485b(this.zzg, this.zza);
                    }
                } catch (Throwable th) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                }
                this.zzc = false;
                this.zzb = null;
                this.zza = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzb(boolean z2) {
        AbstractC2863r.m5473b("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.zzc) {
                    zza();
                }
                Context context = this.zzg;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int m5329b = C2735f.f8984b.m5329b(context, 12451000);
                    if (m5329b != 0 && m5329b != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    ServiceConnectionC2730a serviceConnectionC2730a = new ServiceConnectionC2730a();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!C2895a.m5484a().m5486c(context, context.getClass().getName(), intent, serviceConnectionC2730a, 1)) {
                            throw new IOException("Connection failure");
                        }
                        this.zza = serviceConnectionC2730a;
                        try {
                            IBinder m5320a = serviceConnectionC2730a.m5320a(TimeUnit.MILLISECONDS);
                            int r12 = AbstractBinderC0064c.f128a;
                            IInterface queryLocalInterface = m5320a.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                            this.zzb = queryLocalInterface instanceof InterfaceC0065d ? (InterfaceC0065d) queryLocalInterface : new C0063b(m5320a);
                            this.zzc = true;
                            if (z2) {
                                zze();
                            }
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th) {
                            throw new IOException(th);
                        }
                    } finally {
                        IOException iOException = new IOException(th);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new C2736g();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean zzc(Info info, boolean z2, float f, long j2, String str, Throwable th) {
        if (Math.random() > 0.0d) {
            return false;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("app_context", "1");
        if (info != null) {
            hashMap.put(CommonUrlParts.LIMIT_AD_TRACKING, true != info.isLimitAdTrackingEnabled() ? CommonUrlParts.Values.FALSE_INTEGER : "1");
            String id = info.getId();
            if (id != null) {
                hashMap.put("ad_id_size", Integer.toString(id.length()));
            }
        }
        if (th != null) {
            hashMap.put("error", th.getClass().getName());
        }
        hashMap.put("tag", "AdvertisingIdClient");
        hashMap.put("time_spent", Long.toString(j2));
        new C0742a(hashMap).start();
        return true;
    }

    public AdvertisingIdClient(Context context, long j2, boolean z2, boolean z3) {
        Context applicationContext;
        this.zzd = new Object();
        AbstractC2863r.m5474c(context);
        if (z2 && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.zzg = context;
        this.zzc = false;
        this.zzf = j2;
    }
}
