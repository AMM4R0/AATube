package p015F0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p010D0.RunnableC0106d;
import p013E0.AbstractC0125b;
import p023I0.C0208f;
import p130u0.BinderC2796t;

/* renamed from: F0.a */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0130a extends Binder implements IInterface {

    /* renamed from: a */
    public final /* synthetic */ int f378a = 1;

    public /* synthetic */ AbstractBinderC0130a() {
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int r02 = this.f378a;
        return this;
    }

    /* renamed from: d */
    public boolean mo424d(int r12, Parcel parcel, Parcel parcel2) {
        return false;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int r4, Parcel parcel, Parcel parcel2, int r7) {
        switch (this.f378a) {
            case 0:
                if (r4 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(r4, parcel, parcel2, r7)) {
                    return true;
                }
                return mo424d(r4, parcel, parcel2);
            default:
                if (r4 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(r4, parcel, parcel2, r7)) {
                    return true;
                }
                switch (r4) {
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                    default:
                        return false;
                    case 6:
                        break;
                    case 7:
                        break;
                    case 8:
                        C0208f c0208f = (C0208f) AbstractC0125b.m423a(parcel, C0208f.CREATOR);
                        BinderC2796t binderC2796t = (BinderC2796t) this;
                        binderC2796t.f9140d.post(new RunnableC0106d(binderC2796t, c0208f, 9, false));
                        break;
                    case 9:
                        break;
                }
                parcel2.writeNoException();
                return true;
        }
    }

    public AbstractBinderC0130a(String str) {
        attachInterface(this, str);
    }
}
