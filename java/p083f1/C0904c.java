package p083f1;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;
import p044P0.C0420d;
import p052S.AbstractC0498b;

/* renamed from: f1.c */
/* loaded from: classes.dex */
public final class C0904c extends AbstractC0498b {
    public static final Parcelable.Creator<C0904c> CREATOR = new C0420d(5);

    /* renamed from: c */
    public final int f3755c;

    public C0904c(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f3755c = parcel.readInt();
    }

    @Override // p052S.AbstractC0498b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r2) {
        super.writeToParcel(parcel, r2);
        parcel.writeInt(this.f3755c);
    }

    public C0904c(AbsSavedState absSavedState, SideSheetBehavior sideSheetBehavior) {
        super(absSavedState);
        this.f3755c = sideSheetBehavior.f2971h;
    }
}
