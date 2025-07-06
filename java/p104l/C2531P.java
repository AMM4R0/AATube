package p104l;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import p023I0.C0205c;

/* renamed from: l.P */
/* loaded from: classes.dex */
public final class C2531P extends View.BaseSavedState {
    public static final Parcelable.Creator<C2531P> CREATOR = new C0205c(22);

    /* renamed from: a */
    public boolean f8272a;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r2) {
        super.writeToParcel(parcel, r2);
        parcel.writeByte(this.f8272a ? (byte) 1 : (byte) 0);
    }
}
