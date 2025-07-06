package p023I0;

import android.os.Parcel;
import android.os.Parcelable;
import p001A0.AbstractC0005b;
import p124s0.C2731b;
import p133v0.C2860o;
import p136w0.AbstractC2877a;

/* renamed from: I0.f */
/* loaded from: classes.dex */
public final class C0208f extends AbstractC2877a {
    public static final Parcelable.Creator<C0208f> CREATOR = new C0205c(2);

    /* renamed from: a */
    public final int f618a;

    /* renamed from: b */
    public final C2731b f619b;

    /* renamed from: c */
    public final C2860o f620c;

    public C0208f(int r12, C2731b c2731b, C2860o c2860o) {
        this.f618a = r12;
        this.f619b = c2731b;
        this.f620c = c2860o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int m59Y = AbstractC0005b.m59Y(parcel, 20293);
        AbstractC0005b.m61a0(parcel, 1, 4);
        parcel.writeInt(this.f618a);
        AbstractC0005b.m55U(parcel, 2, this.f619b, r5);
        AbstractC0005b.m55U(parcel, 3, this.f620c, r5);
        AbstractC0005b.m60Z(parcel, m59Y);
    }
}
