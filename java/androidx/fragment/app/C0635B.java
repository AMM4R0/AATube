package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import p023I0.C0205c;

/* renamed from: androidx.fragment.app.B */
/* loaded from: classes.dex */
public final class C0635B implements Parcelable {
    public static final Parcelable.Creator<C0635B> CREATOR = new C0205c(12);

    /* renamed from: a */
    public String f2115a;

    /* renamed from: b */
    public int f2116b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r2) {
        parcel.writeString(this.f2115a);
        parcel.writeInt(this.f2116b);
    }
}
