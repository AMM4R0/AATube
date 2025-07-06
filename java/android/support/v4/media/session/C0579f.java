package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;

/* renamed from: android.support.v4.media.session.f */
/* loaded from: classes.dex */
public final class C0579f implements Parcelable.Creator {

    /* renamed from: a */
    public final /* synthetic */ int f1637a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f1637a) {
            case 0:
                MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper = new MediaSessionCompat$ResultReceiverWrapper();
                mediaSessionCompat$ResultReceiverWrapper.f1605a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
                return mediaSessionCompat$ResultReceiverWrapper;
            case 1:
                return new MediaSessionCompat$QueueItem(parcel);
            case 2:
                return new MediaSessionCompat$Token(parcel.readParcelable(null), null);
            case 3:
                ParcelableVolumeInfo parcelableVolumeInfo = new ParcelableVolumeInfo();
                parcelableVolumeInfo.f1610a = parcel.readInt();
                parcelableVolumeInfo.f1612c = parcel.readInt();
                parcelableVolumeInfo.f1613d = parcel.readInt();
                parcelableVolumeInfo.f1614e = parcel.readInt();
                parcelableVolumeInfo.f1611b = parcel.readInt();
                return parcelableVolumeInfo;
            default:
                return new PlaybackStateCompat(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int r2) {
        switch (this.f1637a) {
            case 0:
                return new MediaSessionCompat$ResultReceiverWrapper[r2];
            case 1:
                return new MediaSessionCompat$QueueItem[r2];
            case 2:
                return new MediaSessionCompat$Token[r2];
            case 3:
                return new ParcelableVolumeInfo[r2];
            default:
                return new PlaybackStateCompat[r2];
        }
    }
}
