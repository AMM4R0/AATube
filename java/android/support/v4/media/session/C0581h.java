package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.PlaybackStateCompat;

/* renamed from: android.support.v4.media.session.h */
/* loaded from: classes.dex */
public final class C0581h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new PlaybackStateCompat.CustomAction(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int r12) {
        return new PlaybackStateCompat.CustomAction[r12];
    }
}
