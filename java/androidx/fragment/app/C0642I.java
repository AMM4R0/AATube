package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p023I0.C0205c;

/* renamed from: androidx.fragment.app.I */
/* loaded from: classes.dex */
public final class C0642I implements Parcelable {
    public static final Parcelable.Creator<C0642I> CREATOR = new C0205c(14);

    /* renamed from: a */
    public final String f2171a;

    /* renamed from: b */
    public final String f2172b;

    /* renamed from: c */
    public final boolean f2173c;

    /* renamed from: d */
    public final int f2174d;

    /* renamed from: e */
    public final int f2175e;

    /* renamed from: f */
    public final String f2176f;

    /* renamed from: g */
    public final boolean f2177g;

    /* renamed from: h */
    public final boolean f2178h;

    /* renamed from: i */
    public final boolean f2179i;

    /* renamed from: j */
    public final Bundle f2180j;

    /* renamed from: k */
    public final boolean f2181k;

    /* renamed from: l */
    public final int f2182l;

    /* renamed from: m */
    public Bundle f2183m;

    public C0642I(AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p) {
        this.f2171a = abstractComponentCallbacksC0666p.getClass().getName();
        this.f2172b = abstractComponentCallbacksC0666p.f2316e;
        this.f2173c = abstractComponentCallbacksC0666p.f2324m;
        this.f2174d = abstractComponentCallbacksC0666p.f2333v;
        this.f2175e = abstractComponentCallbacksC0666p.f2334w;
        this.f2176f = abstractComponentCallbacksC0666p.f2335x;
        this.f2177g = abstractComponentCallbacksC0666p.f2296A;
        this.f2178h = abstractComponentCallbacksC0666p.f2323l;
        this.f2179i = abstractComponentCallbacksC0666p.f2337z;
        this.f2180j = abstractComponentCallbacksC0666p.f2317f;
        this.f2181k = abstractComponentCallbacksC0666p.f2336y;
        this.f2182l = abstractComponentCallbacksC0666p.f2306K.ordinal();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f2171a);
        sb.append(" (");
        sb.append(this.f2172b);
        sb.append(")}:");
        if (this.f2173c) {
            sb.append(" fromLayout");
        }
        int r12 = this.f2175e;
        if (r12 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(r12));
        }
        String str = this.f2176f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f2177g) {
            sb.append(" retainInstance");
        }
        if (this.f2178h) {
            sb.append(" removing");
        }
        if (this.f2179i) {
            sb.append(" detached");
        }
        if (this.f2181k) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r2) {
        parcel.writeString(this.f2171a);
        parcel.writeString(this.f2172b);
        parcel.writeInt(this.f2173c ? 1 : 0);
        parcel.writeInt(this.f2174d);
        parcel.writeInt(this.f2175e);
        parcel.writeString(this.f2176f);
        parcel.writeInt(this.f2177g ? 1 : 0);
        parcel.writeInt(this.f2178h ? 1 : 0);
        parcel.writeInt(this.f2179i ? 1 : 0);
        parcel.writeBundle(this.f2180j);
        parcel.writeInt(this.f2181k ? 1 : 0);
        parcel.writeBundle(this.f2183m);
        parcel.writeInt(this.f2182l);
    }

    public C0642I(Parcel parcel) {
        this.f2171a = parcel.readString();
        this.f2172b = parcel.readString();
        this.f2173c = parcel.readInt() != 0;
        this.f2174d = parcel.readInt();
        this.f2175e = parcel.readInt();
        this.f2176f = parcel.readString();
        this.f2177g = parcel.readInt() != 0;
        this.f2178h = parcel.readInt() != 0;
        this.f2179i = parcel.readInt() != 0;
        this.f2180j = parcel.readBundle();
        this.f2181k = parcel.readInt() != 0;
        this.f2183m = parcel.readBundle();
        this.f2182l = parcel.readInt();
    }
}
