package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new C0579f(4);

    /* renamed from: a */
    public final int f1615a;

    /* renamed from: b */
    public final long f1616b;

    /* renamed from: c */
    public final long f1617c;

    /* renamed from: d */
    public final float f1618d;

    /* renamed from: e */
    public final long f1619e;

    /* renamed from: f */
    public final int f1620f;

    /* renamed from: g */
    public final CharSequence f1621g;

    /* renamed from: h */
    public final long f1622h;

    /* renamed from: i */
    public final ArrayList f1623i;

    /* renamed from: j */
    public final long f1624j;

    /* renamed from: k */
    public final Bundle f1625k;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new C0581h();

        /* renamed from: a */
        public final String f1626a;

        /* renamed from: b */
        public final CharSequence f1627b;

        /* renamed from: c */
        public final int f1628c;

        /* renamed from: d */
        public final Bundle f1629d;

        public CustomAction(Parcel parcel) {
            this.f1626a = parcel.readString();
            this.f1627b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f1628c = parcel.readInt();
            this.f1629d = parcel.readBundle(AbstractC0580g.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.f1627b) + ", mIcon=" + this.f1628c + ", mExtras=" + this.f1629d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int r3) {
            parcel.writeString(this.f1626a);
            TextUtils.writeToParcel(this.f1627b, parcel, r3);
            parcel.writeInt(this.f1628c);
            parcel.writeBundle(this.f1629d);
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f1615a = parcel.readInt();
        this.f1616b = parcel.readLong();
        this.f1618d = parcel.readFloat();
        this.f1622h = parcel.readLong();
        this.f1617c = parcel.readLong();
        this.f1619e = parcel.readLong();
        this.f1621g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1623i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f1624j = parcel.readLong();
        this.f1625k = parcel.readBundle(AbstractC0580g.class.getClassLoader());
        this.f1620f = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "PlaybackState {state=" + this.f1615a + ", position=" + this.f1616b + ", buffered position=" + this.f1617c + ", speed=" + this.f1618d + ", updated=" + this.f1622h + ", actions=" + this.f1619e + ", error code=" + this.f1620f + ", error message=" + this.f1621g + ", custom actions=" + this.f1623i + ", active item id=" + this.f1624j + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r4) {
        parcel.writeInt(this.f1615a);
        parcel.writeLong(this.f1616b);
        parcel.writeFloat(this.f1618d);
        parcel.writeLong(this.f1622h);
        parcel.writeLong(this.f1617c);
        parcel.writeLong(this.f1619e);
        TextUtils.writeToParcel(this.f1621g, parcel, r4);
        parcel.writeTypedList(this.f1623i);
        parcel.writeLong(this.f1624j);
        parcel.writeBundle(this.f1625k);
        parcel.writeInt(this.f1620f);
    }
}
