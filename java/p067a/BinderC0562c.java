package p067a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: a.c */
/* loaded from: classes.dex */
public final class BinderC0562c extends Binder implements InterfaceC0561b {

    /* renamed from: c */
    public static final /* synthetic */ int f1569c = 0;

    /* renamed from: a */
    public final /* synthetic */ C0563d f1570a;

    public BinderC0562c(C0563d c0563d) {
        this.f1570a = c0563d;
        attachInterface(this, InterfaceC0561b.f1568b);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int r4, Parcel parcel, Parcel parcel2, int r7) {
        String str = InterfaceC0561b.f1568b;
        if (r4 >= 1 && r4 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (r4 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (r4 != 1) {
            return super.onTransact(r4, parcel, parcel2, r7);
        }
        int readInt = parcel.readInt();
        Object createFromParcel = parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null;
        C0563d c0563d = this.f1570a;
        c0563d.getClass();
        c0563d.mo1415a(readInt, (Bundle) createFromParcel);
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
