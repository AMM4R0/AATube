package io.appmetrica.analytics.gpllibrary.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.LocationListener;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class GplLibraryWrapper implements IGplLibraryWrapper {
    public static final String FUSED_PROVIDER = "fused";

    /* renamed from: a */
    private final FusedLocationProviderClient f4407a;

    /* renamed from: b */
    private final LocationListener f4408b;

    /* renamed from: c */
    private final LocationCallback f4409c;

    /* renamed from: d */
    private final Looper f4410d;

    /* renamed from: e */
    private final Executor f4411e;

    /* renamed from: f */
    private final long f4412f;

    /* renamed from: io.appmetrica.analytics.gpllibrary.internal.GplLibraryWrapper$1 */
    public static /* synthetic */ class C10371 {

        /* renamed from: a */
        static final /* synthetic */ int[] f4413a;

        static {
            int[] r02 = new int[Priority.values().length];
            f4413a = r02;
            try {
                r02[Priority.PRIORITY_LOW_POWER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4413a[Priority.PRIORITY_BALANCED_POWER_ACCURACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4413a[Priority.PRIORITY_HIGH_ACCURACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class ClientProvider {

        /* renamed from: a */
        private final Context f4414a;

        public ClientProvider(Context context) {
            this.f4414a = context;
        }

        /* renamed from: a */
        public final FusedLocationProviderClient m2672a() {
            return new FusedLocationProviderClient(this.f4414a);
        }
    }

    public enum Priority {
        PRIORITY_NO_POWER,
        PRIORITY_LOW_POWER,
        PRIORITY_BALANCED_POWER_ACCURACY,
        PRIORITY_HIGH_ACCURACY
    }

    public GplLibraryWrapper(Context context, LocationListener locationListener, Looper looper, Executor executor, long j2) {
        this(new ClientProvider(context), locationListener, looper, executor, j2);
    }

    @Override // io.appmetrica.analytics.gpllibrary.internal.IGplLibraryWrapper
    @SuppressLint({"MissingPermission"})
    public void startLocationUpdates(Priority priority) {
        Log.d("[GplLibraryWrapper]", "startLocationUpdates");
        FusedLocationProviderClient fusedLocationProviderClient = this.f4407a;
        LocationRequest interval = LocationRequest.create().setInterval(this.f4412f);
        int r5 = C10371.f4413a[priority.ordinal()];
        fusedLocationProviderClient.requestLocationUpdates(interval.setPriority(r5 != 1 ? r5 != 2 ? r5 != 3 ? 105 : 100 : 102 : 104), this.f4409c, this.f4410d);
    }

    @Override // io.appmetrica.analytics.gpllibrary.internal.IGplLibraryWrapper
    public void stopLocationUpdates() {
        Log.d("[GplLibraryWrapper]", "stopLocationUpdates");
        this.f4407a.removeLocationUpdates(this.f4409c);
    }

    @Override // io.appmetrica.analytics.gpllibrary.internal.IGplLibraryWrapper
    @SuppressLint({"MissingPermission"})
    public void updateLastKnownLocation() {
        Log.d("[GplLibraryWrapper]", "updateLastKnownLocation");
        this.f4407a.getLastLocation().mo621a(this.f4411e, new GplOnSuccessListener(this.f4408b));
    }

    public GplLibraryWrapper(ClientProvider clientProvider, LocationListener locationListener, Looper looper, Executor executor, long j2) {
        this.f4407a = clientProvider.m2672a();
        this.f4408b = locationListener;
        this.f4410d = looper;
        this.f4411e = executor;
        this.f4412f = j2;
        this.f4409c = new GplLocationCallback(locationListener);
    }
}
