package p116p0;

import android.os.Parcel;
import android.os.Parcelable;
import p001A0.AbstractC0005b;
import p023I0.C0205c;
import p136w0.AbstractC2877a;

/* renamed from: p0.b */
/* loaded from: classes.dex */
public final class C2707b extends AbstractC2877a {
    public static final Parcelable.Creator<C2707b> CREATOR = new C0205c(23);

    /* renamed from: a */
    public final String f8725a;

    /* renamed from: b */
    public final int f8726b;

    public C2707b(String str, int r2) {
        this.f8725a = str;
        this.f8726b = r2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r4) {
        int m59Y = AbstractC0005b.m59Y(parcel, 20293);
        AbstractC0005b.m56V(parcel, 1, this.f8725a);
        AbstractC0005b.m61a0(parcel, 2, 4);
        parcel.writeInt(this.f8726b);
        AbstractC0005b.m60Z(parcel, m59Y);
    }
}
