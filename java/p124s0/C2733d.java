package p124s0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p001A0.AbstractC0005b;
import p010D0.C0109g;
import p023I0.C0205c;
import p136w0.AbstractC2877a;

/* renamed from: s0.d */
/* loaded from: classes.dex */
public final class C2733d extends AbstractC2877a {
    public static final Parcelable.Creator<C2733d> CREATOR = new C0205c(26);

    /* renamed from: a */
    public final String f8978a;

    /* renamed from: b */
    public final int f8979b;

    /* renamed from: c */
    public final long f8980c;

    public C2733d(String str) {
        this.f8978a = str;
        this.f8980c = 1L;
        this.f8979b = -1;
    }

    /* renamed from: a */
    public final long m5322a() {
        long j2 = this.f8980c;
        return j2 == -1 ? this.f8979b : j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2733d) {
            C2733d c2733d = (C2733d) obj;
            String str = this.f8978a;
            if (((str != null && str.equals(c2733d.f8978a)) || (str == null && c2733d.f8978a == null)) && m5322a() == c2733d.m5322a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8978a, Long.valueOf(m5322a())});
    }

    public final String toString() {
        C0109g c0109g = new C0109g(this);
        c0109g.m352b(this.f8978a, "name");
        c0109g.m352b(Long.valueOf(m5322a()), "version");
        return c0109g.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r6) {
        int m59Y = AbstractC0005b.m59Y(parcel, 20293);
        AbstractC0005b.m56V(parcel, 1, this.f8978a);
        AbstractC0005b.m61a0(parcel, 2, 4);
        parcel.writeInt(this.f8979b);
        long m5322a = m5322a();
        AbstractC0005b.m61a0(parcel, 3, 8);
        parcel.writeLong(m5322a);
        AbstractC0005b.m60Z(parcel, m59Y);
    }

    public C2733d(String str, int r2, long j2) {
        this.f8978a = str;
        this.f8979b = r2;
        this.f8980c = j2;
    }
}
