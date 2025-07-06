package android.support.v4.media;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import p023I0.C0205c;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new C0205c(9);

    /* renamed from: a */
    public final int f1587a;

    /* renamed from: b */
    public final float f1588b;

    public RatingCompat(int r12, float f) {
        this.f1587a = r12;
        this.f1588b = f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f1587a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.f1587a);
        sb.append(" rating=");
        float f = this.f1588b;
        sb.append(f < 0.0f ? "unrated" : String.valueOf(f));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r2) {
        parcel.writeInt(this.f1587a);
        parcel.writeFloat(this.f1588b);
    }
}
