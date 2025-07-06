package p023I0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p001A0.AbstractC0005b;
import p136w0.AbstractC2877a;

/* renamed from: I0.e */
/* loaded from: classes.dex */
public final class C0207e extends AbstractC2877a {
    public static final Parcelable.Creator<C0207e> CREATOR = new C0205c(1);

    /* renamed from: a */
    public final ArrayList f616a;

    /* renamed from: b */
    public final String f617b;

    public C0207e(ArrayList arrayList, String str) {
        this.f616a = arrayList;
        this.f617b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r4) {
        int m59Y = AbstractC0005b.m59Y(parcel, 20293);
        ArrayList arrayList = this.f616a;
        if (arrayList != null) {
            int m59Y2 = AbstractC0005b.m59Y(parcel, 1);
            parcel.writeStringList(arrayList);
            AbstractC0005b.m60Z(parcel, m59Y2);
        }
        AbstractC0005b.m56V(parcel, 2, this.f617b);
        AbstractC0005b.m60Z(parcel, m59Y);
    }
}
