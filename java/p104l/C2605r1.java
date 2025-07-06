package p104l;

import android.os.Parcel;
import android.os.Parcelable;
import p044P0.C0420d;
import p052S.AbstractC0498b;

/* renamed from: l.r1 */
/* loaded from: classes.dex */
public final class C2605r1 extends AbstractC0498b {
    public static final Parcelable.Creator<C2605r1> CREATOR = new C0420d(8);

    /* renamed from: c */
    public int f8462c;

    /* renamed from: d */
    public boolean f8463d;

    public C2605r1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f8462c = parcel.readInt();
        this.f8463d = parcel.readInt() != 0;
    }

    @Override // p052S.AbstractC0498b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r2) {
        super.writeToParcel(parcel, r2);
        parcel.writeInt(this.f8462c);
        parcel.writeInt(this.f8463d ? 1 : 0);
    }
}
