package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p023I0.C0205c;

/* renamed from: androidx.fragment.app.F */
/* loaded from: classes.dex */
public final class C0639F implements Parcelable {
    public static final Parcelable.Creator<C0639F> CREATOR = new C0205c(13);

    /* renamed from: a */
    public ArrayList f2152a;

    /* renamed from: b */
    public ArrayList f2153b;

    /* renamed from: c */
    public C0652b[] f2154c;

    /* renamed from: d */
    public int f2155d;

    /* renamed from: e */
    public String f2156e;

    /* renamed from: f */
    public ArrayList f2157f;

    /* renamed from: g */
    public ArrayList f2158g;

    /* renamed from: h */
    public ArrayList f2159h;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r3) {
        parcel.writeTypedList(this.f2152a);
        parcel.writeStringList(this.f2153b);
        parcel.writeTypedArray(this.f2154c, r3);
        parcel.writeInt(this.f2155d);
        parcel.writeString(this.f2156e);
        parcel.writeStringList(this.f2157f);
        parcel.writeTypedList(this.f2158g);
        parcel.writeTypedList(this.f2159h);
    }
}
