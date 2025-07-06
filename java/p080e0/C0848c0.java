package p080e0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p023I0.C0205c;

/* renamed from: e0.c0 */
/* loaded from: classes.dex */
public final class C0848c0 implements Parcelable {
    public static final Parcelable.Creator<C0848c0> CREATOR = new C0205c(20);

    /* renamed from: a */
    public int f3471a;

    /* renamed from: b */
    public int f3472b;

    /* renamed from: c */
    public int f3473c;

    /* renamed from: d */
    public int[] f3474d;

    /* renamed from: e */
    public int f3475e;

    /* renamed from: f */
    public int[] f3476f;

    /* renamed from: g */
    public ArrayList f3477g;

    /* renamed from: h */
    public boolean f3478h;

    /* renamed from: i */
    public boolean f3479i;

    /* renamed from: j */
    public boolean f3480j;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r2) {
        parcel.writeInt(this.f3471a);
        parcel.writeInt(this.f3472b);
        parcel.writeInt(this.f3473c);
        if (this.f3473c > 0) {
            parcel.writeIntArray(this.f3474d);
        }
        parcel.writeInt(this.f3475e);
        if (this.f3475e > 0) {
            parcel.writeIntArray(this.f3476f);
        }
        parcel.writeInt(this.f3478h ? 1 : 0);
        parcel.writeInt(this.f3479i ? 1 : 0);
        parcel.writeInt(this.f3480j ? 1 : 0);
        parcel.writeList(this.f3477g);
    }
}
