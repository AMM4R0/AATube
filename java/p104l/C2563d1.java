package p104l;

import android.os.Parcel;
import android.os.Parcelable;
import p044P0.C0420d;
import p052S.AbstractC0498b;

/* renamed from: l.d1 */
/* loaded from: classes.dex */
public final class C2563d1 extends AbstractC0498b {
    public static final Parcelable.Creator<C2563d1> CREATOR = new C0420d(7);

    /* renamed from: c */
    public boolean f8339c;

    public C2563d1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f8339c = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f8339c + "}";
    }

    @Override // p052S.AbstractC0498b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r2) {
        super.writeToParcel(parcel, r2);
        parcel.writeValue(Boolean.valueOf(this.f8339c));
    }
}
