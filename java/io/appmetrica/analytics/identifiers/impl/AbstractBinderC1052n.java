package io.appmetrica.analytics.identifiers.impl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: io.appmetrica.analytics.identifiers.impl.n */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1052n extends Binder implements InterfaceC1053o {
    public AbstractBinderC1052n() {
        attachInterface(this, "com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
    }

    /* renamed from: a */
    public static InterfaceC1053o m2680a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC1053o)) ? new C1051m(iBinder) : (InterfaceC1053o) queryLocalInterface;
    }

    /* renamed from: a */
    public abstract /* synthetic */ String m2681a();

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    /* renamed from: b */
    public abstract /* synthetic */ boolean m2682b();

    @Override // android.os.Binder
    public final boolean onTransact(int r4, Parcel parcel, Parcel parcel2, int r7) {
        if (r4 == 1) {
            parcel.enforceInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
            String m2681a = m2681a();
            parcel2.writeNoException();
            parcel2.writeString(m2681a);
            return true;
        }
        if (r4 != 2) {
            if (r4 != 1598968902) {
                return super.onTransact(r4, parcel, parcel2, r7);
            }
            parcel2.writeString("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
            return true;
        }
        parcel.enforceInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
        boolean m2682b = m2682b();
        parcel2.writeNoException();
        parcel2.writeInt(m2682b ? 1 : 0);
        return true;
    }
}
