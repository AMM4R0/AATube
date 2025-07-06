package p044P0;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p052S.AbstractC0498b;

/* renamed from: P0.e */
/* loaded from: classes.dex */
public final class C0421e extends AbstractC0498b {
    public static final Parcelable.Creator<C0421e> CREATOR = new C0420d(0);

    /* renamed from: c */
    public final int f1087c;

    /* renamed from: d */
    public final int f1088d;

    /* renamed from: e */
    public final boolean f1089e;

    /* renamed from: f */
    public final boolean f1090f;

    /* renamed from: g */
    public final boolean f1091g;

    public C0421e(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f1087c = parcel.readInt();
        this.f1088d = parcel.readInt();
        this.f1089e = parcel.readInt() == 1;
        this.f1090f = parcel.readInt() == 1;
        this.f1091g = parcel.readInt() == 1;
    }

    @Override // p052S.AbstractC0498b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r2) {
        super.writeToParcel(parcel, r2);
        parcel.writeInt(this.f1087c);
        parcel.writeInt(this.f1088d);
        parcel.writeInt(this.f1089e ? 1 : 0);
        parcel.writeInt(this.f1090f ? 1 : 0);
        parcel.writeInt(this.f1091g ? 1 : 0);
    }

    public C0421e(AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
        super(absSavedState);
        this.f1087c = bottomSheetBehavior.f2760L;
        this.f1088d = bottomSheetBehavior.f2783e;
        this.f1089e = bottomSheetBehavior.f2777b;
        this.f1090f = bottomSheetBehavior.f2757I;
        this.f1091g = bottomSheetBehavior.f2758J;
    }
}
