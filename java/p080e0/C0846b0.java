package p080e0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p023I0.C0205c;

/* renamed from: e0.b0 */
/* loaded from: classes.dex */
public final class C0846b0 implements Parcelable {
    public static final Parcelable.Creator<C0846b0> CREATOR = new C0205c(19);

    /* renamed from: a */
    public int f3462a;

    /* renamed from: b */
    public int f3463b;

    /* renamed from: c */
    public int[] f3464c;

    /* renamed from: d */
    public boolean f3465d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f3462a + ", mGapDir=" + this.f3463b + ", mHasUnwantedGapAfter=" + this.f3465d + ", mGapPerSpan=" + Arrays.toString(this.f3464c) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r3) {
        parcel.writeInt(this.f3462a);
        parcel.writeInt(this.f3463b);
        parcel.writeInt(this.f3465d ? 1 : 0);
        int[] r32 = this.f3464c;
        if (r32 == null || r32.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(r32.length);
            parcel.writeIntArray(this.f3464c);
        }
    }
}
