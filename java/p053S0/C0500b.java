package p053S0;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import p000A.AbstractC0002c;
import p023I0.C0205c;

/* renamed from: S0.b */
/* loaded from: classes.dex */
public final class C0500b extends View.BaseSavedState {
    public static final Parcelable.Creator<C0500b> CREATOR = new C0205c(4);

    /* renamed from: a */
    public int f1266a;

    public final String toString() {
        StringBuilder sb = new StringBuilder("MaterialCheckBox.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" CheckedState=");
        int r12 = this.f1266a;
        return AbstractC0002c.m17l(sb, r12 != 1 ? r12 != 2 ? "unchecked" : "indeterminate" : "checked", "}");
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r2) {
        super.writeToParcel(parcel, r2);
        parcel.writeValue(Integer.valueOf(this.f1266a));
    }
}
