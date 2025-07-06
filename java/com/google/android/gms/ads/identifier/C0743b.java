package com.google.android.gms.ads.identifier;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.ads.identifier.b */
/* loaded from: classes.dex */
public final class C0743b extends Thread {

    /* renamed from: a */
    public final WeakReference f2672a;

    /* renamed from: b */
    public final long f2673b;

    /* renamed from: c */
    public final CountDownLatch f2674c = new CountDownLatch(1);

    /* renamed from: d */
    public boolean f2675d = false;

    public C0743b(AdvertisingIdClient advertisingIdClient, long j2) {
        this.f2672a = new WeakReference(advertisingIdClient);
        this.f2673b = j2;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        AdvertisingIdClient advertisingIdClient;
        WeakReference weakReference = this.f2672a;
        try {
            if (this.f2674c.await(this.f2673b, TimeUnit.MILLISECONDS) || (advertisingIdClient = (AdvertisingIdClient) weakReference.get()) == null) {
                return;
            }
            advertisingIdClient.zza();
            this.f2675d = true;
        } catch (InterruptedException unused) {
            AdvertisingIdClient advertisingIdClient2 = (AdvertisingIdClient) weakReference.get();
            if (advertisingIdClient2 != null) {
                advertisingIdClient2.zza();
                this.f2675d = true;
            }
        }
    }
}
