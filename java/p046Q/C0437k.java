package p046Q;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import p023I0.C0205c;

/* renamed from: Q.k */
/* loaded from: classes.dex */
public final class C0437k extends View.BaseSavedState {
    public static final Parcelable.Creator<C0437k> CREATOR = new C0205c(3);

    /* renamed from: a */
    public int f1128a;

    public final String toString() {
        return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f1128a + "}";
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r2) {
        super.writeToParcel(parcel, r2);
        parcel.writeInt(this.f1128a);
    }
}
