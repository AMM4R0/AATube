package p007C0;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: C0.b */
/* loaded from: classes.dex */
public final class C0063b implements InterfaceC0065d, IInterface {

    /* renamed from: a */
    public final IBinder f127a;

    public C0063b(IBinder iBinder) {
        this.f127a = iBinder;
    }

    /* renamed from: a */
    public final Parcel m247a(Parcel parcel, int r5) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f127a.transact(r5, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e2) {
                obtain.recycle();
                throw e2;
            }
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f127a;
    }
}
