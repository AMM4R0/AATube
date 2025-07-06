package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import p103k0.InterfaceC2483d;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class MediaSessionCompat$Token implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$Token> CREATOR = new C0579f(2);

    /* renamed from: a */
    public final Object f1606a = new Object();

    /* renamed from: b */
    public final Parcelable f1607b;

    /* renamed from: c */
    public InterfaceC0576c f1608c;

    /* renamed from: d */
    public InterfaceC2483d f1609d;

    public MediaSessionCompat$Token(Parcelable parcelable, InterfaceC0576c interfaceC0576c) {
        this.f1607b = parcelable;
        this.f1608c = interfaceC0576c;
    }

    /* renamed from: a */
    public final void m1436a(InterfaceC0576c interfaceC0576c) {
        synchronized (this.f1606a) {
            this.f1608c = interfaceC0576c;
        }
    }

    /* renamed from: b */
    public final void m1437b(InterfaceC2483d interfaceC2483d) {
        synchronized (this.f1606a) {
            this.f1609d = interfaceC2483d;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaSessionCompat$Token)) {
            return false;
        }
        MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) obj;
        Parcelable parcelable = this.f1607b;
        if (parcelable == null) {
            return mediaSessionCompat$Token.f1607b == null;
        }
        Parcelable parcelable2 = mediaSessionCompat$Token.f1607b;
        if (parcelable2 == null) {
            return false;
        }
        return parcelable.equals(parcelable2);
    }

    public final int hashCode() {
        Parcelable parcelable = this.f1607b;
        if (parcelable == null) {
            return 0;
        }
        return parcelable.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r3) {
        parcel.writeParcelable(this.f1607b, r3);
    }
}
