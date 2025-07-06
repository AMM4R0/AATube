package p133v0;

import android.os.Parcel;
import android.os.Parcelable;
import p001A0.AbstractC0005b;
import p136w0.AbstractC2877a;

/* renamed from: v0.f */
/* loaded from: classes.dex */
public final class C2851f extends AbstractC2877a {
    public static final Parcelable.Creator<C2851f> CREATOR = new C2858m(0);

    /* renamed from: a */
    public final int f9415a;

    /* renamed from: b */
    public final int f9416b;

    /* renamed from: c */
    public final int f9417c;

    /* renamed from: d */
    public final long f9418d;

    /* renamed from: e */
    public final long f9419e;

    /* renamed from: f */
    public final String f9420f;

    /* renamed from: g */
    public final String f9421g;

    /* renamed from: h */
    public final int f9422h;

    /* renamed from: i */
    public final int f9423i;

    public C2851f(int r12, int r2, int r3, long j2, long j3, String str, String str2, int r10, int r11) {
        this.f9415a = r12;
        this.f9416b = r2;
        this.f9417c = r3;
        this.f9418d = j2;
        this.f9419e = j3;
        this.f9420f = str;
        this.f9421g = str2;
        this.f9422h = r10;
        this.f9423i = r11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r6) {
        int m59Y = AbstractC0005b.m59Y(parcel, 20293);
        AbstractC0005b.m61a0(parcel, 1, 4);
        parcel.writeInt(this.f9415a);
        AbstractC0005b.m61a0(parcel, 2, 4);
        parcel.writeInt(this.f9416b);
        AbstractC0005b.m61a0(parcel, 3, 4);
        parcel.writeInt(this.f9417c);
        AbstractC0005b.m61a0(parcel, 4, 8);
        parcel.writeLong(this.f9418d);
        AbstractC0005b.m61a0(parcel, 5, 8);
        parcel.writeLong(this.f9419e);
        AbstractC0005b.m56V(parcel, 6, this.f9420f);
        AbstractC0005b.m56V(parcel, 7, this.f9421g);
        AbstractC0005b.m61a0(parcel, 8, 4);
        parcel.writeInt(this.f9422h);
        AbstractC0005b.m61a0(parcel, 9, 4);
        parcel.writeInt(this.f9423i);
        AbstractC0005b.m60Z(parcel, m59Y);
    }
}
