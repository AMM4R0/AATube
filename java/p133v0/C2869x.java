package p133v0;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p001A0.AbstractC0005b;
import p124s0.C2733d;
import p136w0.AbstractC2877a;

/* renamed from: v0.x */
/* loaded from: classes.dex */
public final class C2869x extends AbstractC2877a {
    public static final Parcelable.Creator<C2869x> CREATOR = new C2858m(4);

    /* renamed from: a */
    public Bundle f9468a;

    /* renamed from: b */
    public C2733d[] f9469b;

    /* renamed from: c */
    public int f9470c;

    /* renamed from: d */
    public C2848c f9471d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int m59Y = AbstractC0005b.m59Y(parcel, 20293);
        Bundle bundle = this.f9468a;
        if (bundle != null) {
            int m59Y2 = AbstractC0005b.m59Y(parcel, 1);
            parcel.writeBundle(bundle);
            AbstractC0005b.m60Z(parcel, m59Y2);
        }
        AbstractC0005b.m57W(parcel, 2, this.f9469b, r5);
        AbstractC0005b.m61a0(parcel, 3, 4);
        parcel.writeInt(this.f9470c);
        AbstractC0005b.m55U(parcel, 4, this.f9471d, r5);
        AbstractC0005b.m60Z(parcel, m59Y);
    }
}
