package p047Q0;

import android.os.Parcel;
import android.os.Parcelable;
import p044P0.C0420d;
import p052S.AbstractC0498b;

/* renamed from: Q0.b */
/* loaded from: classes.dex */
public final class C0447b extends AbstractC0498b {
    public static final Parcelable.Creator<C0447b> CREATOR = new C0420d(1);

    /* renamed from: c */
    public boolean f1135c;

    public C0447b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            C0447b.class.getClassLoader();
        }
        this.f1135c = parcel.readInt() == 1;
    }

    @Override // p052S.AbstractC0498b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r2) {
        super.writeToParcel(parcel, r2);
        parcel.writeInt(this.f1135c ? 1 : 0);
    }
}
