package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import p023I0.C0205c;

/* renamed from: androidx.fragment.app.b */
/* loaded from: classes.dex */
public final class C0652b implements Parcelable {
    public static final Parcelable.Creator<C0652b> CREATOR = new C0205c(11);

    /* renamed from: a */
    public final int[] f2233a;

    /* renamed from: b */
    public final ArrayList f2234b;

    /* renamed from: c */
    public final int[] f2235c;

    /* renamed from: d */
    public final int[] f2236d;

    /* renamed from: e */
    public final int f2237e;

    /* renamed from: f */
    public final String f2238f;

    /* renamed from: g */
    public final int f2239g;

    /* renamed from: h */
    public final int f2240h;

    /* renamed from: i */
    public final CharSequence f2241i;

    /* renamed from: j */
    public final int f2242j;

    /* renamed from: k */
    public final CharSequence f2243k;

    /* renamed from: l */
    public final ArrayList f2244l;

    /* renamed from: m */
    public final ArrayList f2245m;

    /* renamed from: n */
    public final boolean f2246n;

    public C0652b(C0651a c0651a) {
        int size = c0651a.f2215a.size();
        this.f2233a = new int[size * 5];
        if (!c0651a.f2221g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f2234b = new ArrayList(size);
        this.f2235c = new int[size];
        this.f2236d = new int[size];
        int r2 = 0;
        for (int r12 = 0; r12 < size; r12++) {
            C0645L c0645l = (C0645L) c0651a.f2215a.get(r12);
            int r5 = r2 + 1;
            this.f2233a[r2] = c0645l.f2191a;
            ArrayList arrayList = this.f2234b;
            AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p = c0645l.f2192b;
            arrayList.add(abstractComponentCallbacksC0666p != null ? abstractComponentCallbacksC0666p.f2316e : null);
            int[] r4 = this.f2233a;
            r4[r5] = c0645l.f2193c;
            r4[r2 + 2] = c0645l.f2194d;
            int r6 = r2 + 4;
            r4[r2 + 3] = c0645l.f2195e;
            r2 += 5;
            r4[r6] = c0645l.f2196f;
            this.f2235c[r12] = c0645l.f2197g.ordinal();
            this.f2236d[r12] = c0645l.f2198h.ordinal();
        }
        this.f2237e = c0651a.f2220f;
        this.f2238f = c0651a.f2222h;
        this.f2239g = c0651a.f2232r;
        this.f2240h = c0651a.f2223i;
        this.f2241i = c0651a.f2224j;
        this.f2242j = c0651a.f2225k;
        this.f2243k = c0651a.f2226l;
        this.f2244l = c0651a.f2227m;
        this.f2245m = c0651a.f2228n;
        this.f2246n = c0651a.f2229o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r3) {
        parcel.writeIntArray(this.f2233a);
        parcel.writeStringList(this.f2234b);
        parcel.writeIntArray(this.f2235c);
        parcel.writeIntArray(this.f2236d);
        parcel.writeInt(this.f2237e);
        parcel.writeString(this.f2238f);
        parcel.writeInt(this.f2239g);
        parcel.writeInt(this.f2240h);
        TextUtils.writeToParcel(this.f2241i, parcel, 0);
        parcel.writeInt(this.f2242j);
        TextUtils.writeToParcel(this.f2243k, parcel, 0);
        parcel.writeStringList(this.f2244l);
        parcel.writeStringList(this.f2245m);
        parcel.writeInt(this.f2246n ? 1 : 0);
    }

    public C0652b(Parcel parcel) {
        this.f2233a = parcel.createIntArray();
        this.f2234b = parcel.createStringArrayList();
        this.f2235c = parcel.createIntArray();
        this.f2236d = parcel.createIntArray();
        this.f2237e = parcel.readInt();
        this.f2238f = parcel.readString();
        this.f2239g = parcel.readInt();
        this.f2240h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f2241i = (CharSequence) creator.createFromParcel(parcel);
        this.f2242j = parcel.readInt();
        this.f2243k = (CharSequence) creator.createFromParcel(parcel);
        this.f2244l = parcel.createStringArrayList();
        this.f2245m = parcel.createStringArrayList();
        this.f2246n = parcel.readInt() != 0;
    }
}
