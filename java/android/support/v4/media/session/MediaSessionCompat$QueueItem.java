package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class MediaSessionCompat$QueueItem implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$QueueItem> CREATOR = new C0579f(1);

    /* renamed from: a */
    public final MediaDescriptionCompat f1603a;

    /* renamed from: b */
    public final long f1604b;

    public MediaSessionCompat$QueueItem(Parcel parcel) {
        this.f1603a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        this.f1604b = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "MediaSession.QueueItem {Description=" + this.f1603a + ", Id=" + this.f1604b + " }";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r4) {
        this.f1603a.writeToParcel(parcel, r4);
        parcel.writeLong(this.f1604b);
    }
}
