package p023I0;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import p001A0.AbstractC0005b;
import p136w0.AbstractC2877a;

/* renamed from: I0.b */
/* loaded from: classes.dex */
public final class C0204b extends AbstractC2877a {
    public static final Parcelable.Creator<C0204b> CREATOR = new C0205c(0);

    /* renamed from: a */
    public final int f612a;

    /* renamed from: b */
    public final int f613b;

    /* renamed from: c */
    public final Intent f614c;

    public C0204b(int r12, int r2, Intent intent) {
        this.f612a = r12;
        this.f613b = r2;
        this.f614c = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int m59Y = AbstractC0005b.m59Y(parcel, 20293);
        AbstractC0005b.m61a0(parcel, 1, 4);
        parcel.writeInt(this.f612a);
        AbstractC0005b.m61a0(parcel, 2, 4);
        parcel.writeInt(this.f613b);
        AbstractC0005b.m55U(parcel, 3, this.f614c, r5);
        AbstractC0005b.m60Z(parcel, m59Y);
    }
}
