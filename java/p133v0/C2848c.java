package p133v0;

import android.os.Parcel;
import android.os.Parcelable;
import p001A0.AbstractC0005b;
import p136w0.AbstractC2877a;

/* renamed from: v0.c */
/* loaded from: classes.dex */
public final class C2848c extends AbstractC2877a {
    public static final Parcelable.Creator<C2848c> CREATOR = new C2858m(5);

    /* renamed from: a */
    public final C2853h f9395a;

    /* renamed from: b */
    public final boolean f9396b;

    /* renamed from: c */
    public final boolean f9397c;

    /* renamed from: d */
    public final int[] f9398d;

    /* renamed from: e */
    public final int f9399e;

    /* renamed from: f */
    public final int[] f9400f;

    public C2848c(C2853h c2853h, boolean z2, boolean z3, int[] r4, int r5, int[] r6) {
        this.f9395a = c2853h;
        this.f9396b = z2;
        this.f9397c = z3;
        this.f9398d = r4;
        this.f9399e = r5;
        this.f9400f = r6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int m59Y = AbstractC0005b.m59Y(parcel, 20293);
        AbstractC0005b.m55U(parcel, 1, this.f9395a, r5);
        AbstractC0005b.m61a0(parcel, 2, 4);
        parcel.writeInt(this.f9396b ? 1 : 0);
        AbstractC0005b.m61a0(parcel, 3, 4);
        parcel.writeInt(this.f9397c ? 1 : 0);
        int[] r52 = this.f9398d;
        if (r52 != null) {
            int m59Y2 = AbstractC0005b.m59Y(parcel, 4);
            parcel.writeIntArray(r52);
            AbstractC0005b.m60Z(parcel, m59Y2);
        }
        AbstractC0005b.m61a0(parcel, 5, 4);
        parcel.writeInt(this.f9399e);
        int[] r53 = this.f9400f;
        if (r53 != null) {
            int m59Y3 = AbstractC0005b.m59Y(parcel, 6);
            parcel.writeIntArray(r53);
            AbstractC0005b.m60Z(parcel, m59Y3);
        }
        AbstractC0005b.m60Z(parcel, m59Y);
    }
}
