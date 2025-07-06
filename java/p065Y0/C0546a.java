package p065Y0;

import android.os.Parcel;
import android.os.Parcelable;
import p044P0.C0420d;
import p052S.AbstractC0498b;

/* renamed from: Y0.a */
/* loaded from: classes.dex */
public final class C0546a extends AbstractC0498b {
    public static final Parcelable.Creator<C0546a> CREATOR = new C0420d(3);

    /* renamed from: c */
    public boolean f1476c;

    public C0546a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f1476c = parcel.readInt() == 1;
    }

    @Override // p052S.AbstractC0498b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r2) {
        super.writeToParcel(parcel, r2);
        parcel.writeInt(this.f1476c ? 1 : 0);
    }
}
