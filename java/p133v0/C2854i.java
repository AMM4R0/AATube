package p133v0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import p001A0.AbstractC0005b;
import p023I0.C0205c;
import p136w0.AbstractC2877a;

/* renamed from: v0.i */
/* loaded from: classes.dex */
public final class C2854i extends AbstractC2877a {
    public static final Parcelable.Creator<C2854i> CREATOR = new C0205c(29);

    /* renamed from: a */
    public final int f9432a;

    /* renamed from: b */
    public List f9433b;

    public C2854i(int r12, List list) {
        this.f9432a = r12;
        this.f9433b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r4) {
        int m59Y = AbstractC0005b.m59Y(parcel, 20293);
        AbstractC0005b.m61a0(parcel, 1, 4);
        parcel.writeInt(this.f9432a);
        AbstractC0005b.m58X(parcel, 2, this.f9433b);
        AbstractC0005b.m60Z(parcel, m59Y);
    }
}
