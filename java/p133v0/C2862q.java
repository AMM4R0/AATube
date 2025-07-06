package p133v0;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: v0.q */
/* loaded from: classes.dex */
public final class C2862q implements IInterface {

    /* renamed from: a */
    public final IBinder f9456a;

    public C2862q(IBinder iBinder) {
        this.f9456a = iBinder;
    }

    /* renamed from: a */
    public final void m5471a(BinderC2865t binderC2865t, C2849d c2849d) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(binderC2865t);
            obtain.writeInt(1);
            C2858m.m5466a(c2849d, obtain, 0);
            this.f9456a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f9456a;
    }
}
