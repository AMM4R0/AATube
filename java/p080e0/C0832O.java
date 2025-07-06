package p080e0;

import android.os.Parcel;
import android.os.Parcelable;
import p044P0.C0420d;
import p052S.AbstractC0498b;

/* renamed from: e0.O */
/* loaded from: classes.dex */
public final class C0832O extends AbstractC0498b {
    public static final Parcelable.Creator<C0832O> CREATOR = new C0420d(4);

    /* renamed from: c */
    public Parcelable f3394c;

    public C0832O(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f3394c = parcel.readParcelable(classLoader == null ? AbstractC0824G.class.getClassLoader() : classLoader);
    }

    @Override // p052S.AbstractC0498b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r3) {
        super.writeToParcel(parcel, r3);
        parcel.writeParcelable(this.f3394c, 0);
    }
}
