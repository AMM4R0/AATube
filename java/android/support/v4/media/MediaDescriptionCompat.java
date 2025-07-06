package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p023I0.C0205c;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new C0205c(7);

    /* renamed from: a */
    public final String f1577a;

    /* renamed from: b */
    public final CharSequence f1578b;

    /* renamed from: c */
    public final CharSequence f1579c;

    /* renamed from: d */
    public final CharSequence f1580d;

    /* renamed from: e */
    public final Bitmap f1581e;

    /* renamed from: f */
    public final Uri f1582f;

    /* renamed from: g */
    public final Bundle f1583g;

    /* renamed from: h */
    public final Uri f1584h;

    /* renamed from: i */
    public MediaDescription f1585i;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f1577a = str;
        this.f1578b = charSequence;
        this.f1579c = charSequence2;
        this.f1580d = charSequence3;
        this.f1581e = bitmap;
        this.f1582f = uri;
        this.f1583g = bundle;
        this.f1584h = uri2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f1578b) + ", " + ((Object) this.f1579c) + ", " + ((Object) this.f1580d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r4) {
        MediaDescription mediaDescription = this.f1585i;
        if (mediaDescription == null) {
            MediaDescription.Builder m1419b = AbstractC0571f.m1419b();
            AbstractC0571f.m1431n(m1419b, this.f1577a);
            AbstractC0571f.m1433p(m1419b, this.f1578b);
            AbstractC0571f.m1432o(m1419b, this.f1579c);
            AbstractC0571f.m1427j(m1419b, this.f1580d);
            AbstractC0571f.m1429l(m1419b, this.f1581e);
            AbstractC0571f.m1430m(m1419b, this.f1582f);
            AbstractC0571f.m1428k(m1419b, this.f1583g);
            AbstractC0572g.m1435b(m1419b, this.f1584h);
            mediaDescription = AbstractC0571f.m1418a(m1419b);
            this.f1585i = mediaDescription;
        }
        mediaDescription.writeToParcel(parcel, r4);
    }
}
