package p079e;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import androidx.fragment.app.AbstractC0656f;
import java.util.Calendar;
import p002A1.C0015h;
import p030K1.C0346a;
import p036M1.AbstractC0379e;

/* renamed from: e.t */
/* loaded from: classes.dex */
public final class C0811t extends AbstractC0656f {

    /* renamed from: c */
    public final /* synthetic */ int f3269c = 1;

    /* renamed from: d */
    public final /* synthetic */ LayoutInflaterFactory2C0815x f3270d;

    /* renamed from: e */
    public final Object f3271e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0811t(LayoutInflaterFactory2C0815x layoutInflaterFactory2C0815x, C0015h c0015h) {
        super(layoutInflaterFactory2C0815x);
        this.f3270d = layoutInflaterFactory2C0815x;
        this.f3271e = c0015h;
    }

    @Override // androidx.fragment.app.AbstractC0656f
    /* renamed from: e */
    public final IntentFilter mo1739e() {
        switch (this.f3269c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    @Override // androidx.fragment.app.AbstractC0656f
    /* renamed from: f */
    public final int mo1740f() {
        Location location;
        boolean z2;
        long j2;
        Location location2;
        switch (this.f3269c) {
            case 0:
                return ((PowerManager) this.f3271e).isPowerSaveMode() ? 2 : 1;
            default:
                C0015h c0015h = (C0015h) this.f3271e;
                C0788F c0788f = (C0788F) c0015h.f27d;
                if (c0788f.f3167b > System.currentTimeMillis()) {
                    z2 = c0788f.f3166a;
                } else {
                    Context context = (Context) c0015h.f25b;
                    int m1075f = AbstractC0379e.m1075f(context, "android.permission.ACCESS_COARSE_LOCATION");
                    Location location3 = null;
                    LocationManager locationManager = (LocationManager) c0015h.f26c;
                    if (m1075f == 0) {
                        try {
                        } catch (Exception e2) {
                            Log.d("TwilightManager", "Failed to get last known location", e2);
                        }
                        if (locationManager.isProviderEnabled("network")) {
                            location2 = locationManager.getLastKnownLocation("network");
                            location = location2;
                        }
                        location2 = null;
                        location = location2;
                    } else {
                        location = null;
                    }
                    if (AbstractC0379e.m1075f(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                location3 = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e3) {
                            Log.d("TwilightManager", "Failed to get last known location", e3);
                        }
                    }
                    if (location3 == null || location == null ? location3 != null : location3.getTime() > location.getTime()) {
                        location = location3;
                    }
                    if (location != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (C0346a.f975e == null) {
                            C0346a.f975e = new C0346a();
                        }
                        C0346a c0346a = C0346a.f975e;
                        c0346a.m983a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
                        c0346a.m983a(currentTimeMillis, location.getLatitude(), location.getLongitude());
                        z2 = c0346a.f979d == 1;
                        long j3 = c0346a.f978c;
                        long j4 = c0346a.f977b;
                        c0346a.m983a(currentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
                        long j5 = c0346a.f978c;
                        if (j3 == -1 || j4 == -1) {
                            j2 = currentTimeMillis + 43200000;
                        } else {
                            if (currentTimeMillis <= j4) {
                                j5 = currentTimeMillis > j3 ? j4 : j3;
                            }
                            j2 = j5 + 60000;
                        }
                        c0788f.f3166a = z2;
                        c0788f.f3167b = j2;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int r2 = Calendar.getInstance().get(11);
                        if (r2 < 6 || r2 >= 22) {
                            z2 = true;
                        }
                    }
                }
                return z2 ? 2 : 1;
        }
    }

    @Override // androidx.fragment.app.AbstractC0656f
    /* renamed from: h */
    public final void mo1742h() {
        switch (this.f3269c) {
            case 0:
                this.f3270d.m2255n(true, true);
                break;
            default:
                this.f3270d.m2255n(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0811t(LayoutInflaterFactory2C0815x layoutInflaterFactory2C0815x, Context context) {
        super(layoutInflaterFactory2C0815x);
        this.f3270d = layoutInflaterFactory2C0815x;
        this.f3271e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
