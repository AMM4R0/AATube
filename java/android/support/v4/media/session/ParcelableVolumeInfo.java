package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new C0579f(3);

    /* renamed from: a */
    public int f1610a;

    /* renamed from: b */
    public int f1611b;

    /* renamed from: c */
    public int f1612c;

    /* renamed from: d */
    public int f1613d;

    /* renamed from: e */
    public int f1614e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r2) {
        parcel.writeInt(this.f1610a);
        parcel.writeInt(this.f1612c);
        parcel.writeInt(this.f1613d);
        parcel.writeInt(this.f1614e);
        parcel.writeInt(this.f1611b);
    }
}
