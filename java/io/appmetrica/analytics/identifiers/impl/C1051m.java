package io.appmetrica.analytics.identifiers.impl;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: io.appmetrica.analytics.identifiers.impl.m */
/* loaded from: classes.dex */
public final class C1051m implements InterfaceC1053o {

    /* renamed from: a */
    public final IBinder f4435a;

    public C1051m(IBinder iBinder) {
        this.f4435a = iBinder;
    }

    /* renamed from: a */
    public final String m2678a() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
            this.f4435a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f4435a;
    }

    /* renamed from: b */
    public final boolean m2679b() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
            this.f4435a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
