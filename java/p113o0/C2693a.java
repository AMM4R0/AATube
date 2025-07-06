package p113o0;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import p110n0.AbstractC2678a;

/* renamed from: o0.a */
/* loaded from: classes.dex */
public final class C2693a implements InterfaceC2695c, IInterface {

    /* renamed from: a */
    public final IBinder f8688a;

    public C2693a(IBinder iBinder) {
        this.f8688a = iBinder;
    }

    /* renamed from: a */
    public final Bundle m5186a(Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        int r12 = AbstractC2678a.f8625a;
        obtain.writeInt(1);
        bundle.writeToParcel(obtain, 0);
        obtain = Parcel.obtain();
        try {
            this.f8688a.transact(1, obtain, obtain, 0);
            obtain.readException();
            obtain.recycle();
            return (Bundle) (obtain.readInt() == 0 ? null : (Parcelable) Bundle.CREATOR.createFromParcel(obtain));
        } catch (RuntimeException e2) {
            throw e2;
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f8688a;
    }
}
