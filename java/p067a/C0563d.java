package p067a;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p023I0.C0205c;

/* renamed from: a.d */
/* loaded from: classes.dex */
public class C0563d implements Parcelable {
    public static final Parcelable.Creator<C0563d> CREATOR = new C0205c(5);

    /* renamed from: a */
    public InterfaceC0561b f1571a;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r2) {
        synchronized (this) {
            try {
                if (this.f1571a == null) {
                    this.f1571a = new BinderC0562c(this);
                }
                parcel.writeStrongBinder(this.f1571a.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public void mo1415a(int r12, Bundle bundle) {
    }
}
