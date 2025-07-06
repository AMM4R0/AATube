package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import p023I0.C0205c;
import p103k0.C2482c;
import p103k0.InterfaceC2483d;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C0205c(21);

    /* renamed from: a */
    public final InterfaceC2483d f2576a;

    public ParcelImpl(Parcel parcel) {
        this.f2576a = new C2482c(parcel).m4904h();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r2) {
        new C2482c(parcel).m4908l(this.f2576a);
    }
}
