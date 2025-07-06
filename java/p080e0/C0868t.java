package p080e0;

import android.os.Parcel;
import android.os.Parcelable;
import p023I0.C0205c;

/* renamed from: e0.t */
/* loaded from: classes.dex */
public final class C0868t implements Parcelable {
    public static final Parcelable.Creator<C0868t> CREATOR = new C0205c(18);

    /* renamed from: a */
    public int f3611a;

    /* renamed from: b */
    public int f3612b;

    /* renamed from: c */
    public boolean f3613c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r2) {
        parcel.writeInt(this.f3611a);
        parcel.writeInt(this.f3612b);
        parcel.writeInt(this.f3613c ? 1 : 0);
    }
}
