package io.appmetrica.analytics.coreutils.internal;

import android.location.Location;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class LocationUtils {
    public static final LocationUtils INSTANCE = new LocationUtils();

    private LocationUtils() {
    }

    public static final Location bytesToLocation(byte[] bArr) {
        if (bArr != null) {
            Parcel obtain = Parcel.obtain();
            try {
                obtain.unmarshall(bArr, 0, bArr.length);
                obtain.setDataPosition(0);
                Location location = (Location) obtain.readValue(Location.class.getClassLoader());
                obtain.recycle();
                return location;
            } catch (Throwable unused) {
                obtain.recycle();
            }
        }
        return null;
    }

    public static final byte[] locationToBytes(Location location) {
        if (location != null) {
            Parcel obtain = Parcel.obtain();
            try {
                obtain.writeValue(location);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                return marshall;
            } catch (Throwable unused) {
                obtain.recycle();
            }
        }
        return null;
    }
}
