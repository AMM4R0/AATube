package p133v0;

import android.os.Parcel;
import android.os.Parcelable;
import p001A0.AbstractC0005b;
import p136w0.AbstractC2877a;

/* renamed from: v0.h */
/* loaded from: classes.dex */
public final class C2853h extends AbstractC2877a {
    public static final Parcelable.Creator<C2853h> CREATOR = new C2858m(3);

    /* renamed from: a */
    public final int f9427a;

    /* renamed from: b */
    public final boolean f9428b;

    /* renamed from: c */
    public final boolean f9429c;

    /* renamed from: d */
    public final int f9430d;

    /* renamed from: e */
    public final int f9431e;

    public C2853h(int r12, boolean z2, boolean z3, int r4, int r5) {
        this.f9427a = r12;
        this.f9428b = z2;
        this.f9429c = z3;
        this.f9430d = r4;
        this.f9431e = r5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r4) {
        int m59Y = AbstractC0005b.m59Y(parcel, 20293);
        AbstractC0005b.m61a0(parcel, 1, 4);
        parcel.writeInt(this.f9427a);
        AbstractC0005b.m61a0(parcel, 2, 4);
        parcel.writeInt(this.f9428b ? 1 : 0);
        AbstractC0005b.m61a0(parcel, 3, 4);
        parcel.writeInt(this.f9429c ? 1 : 0);
        AbstractC0005b.m61a0(parcel, 4, 4);
        parcel.writeInt(this.f9430d);
        AbstractC0005b.m61a0(parcel, 5, 4);
        parcel.writeInt(this.f9431e);
        AbstractC0005b.m60Z(parcel, m59Y);
    }
}
