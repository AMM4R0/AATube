package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import p023I0.C0205c;

/* renamed from: com.google.android.material.datepicker.b */
/* loaded from: classes.dex */
public final class C0746b implements Parcelable {
    public static final Parcelable.Creator<C0746b> CREATOR = new C0205c(15);

    /* renamed from: a */
    public final C0759o f2859a;

    /* renamed from: b */
    public final C0759o f2860b;

    /* renamed from: c */
    public final C0748d f2861c;

    /* renamed from: d */
    public final C0759o f2862d;

    /* renamed from: e */
    public final int f2863e;

    /* renamed from: f */
    public final int f2864f;

    /* renamed from: g */
    public final int f2865g;

    public C0746b(C0759o c0759o, C0759o c0759o2, C0748d c0748d, C0759o c0759o3, int r6) {
        Objects.requireNonNull(c0759o, "start cannot be null");
        Objects.requireNonNull(c0759o2, "end cannot be null");
        Objects.requireNonNull(c0748d, "validator cannot be null");
        this.f2859a = c0759o;
        this.f2860b = c0759o2;
        this.f2862d = c0759o3;
        this.f2863e = r6;
        this.f2861c = c0748d;
        if (c0759o3 != null && c0759o.f2923a.compareTo(c0759o3.f2923a) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (c0759o3 != null && c0759o3.f2923a.compareTo(c0759o2.f2923a) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (r6 < 0 || r6 > AbstractC0767w.m2124c(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f2865g = c0759o.m2114d(c0759o2) + 1;
        this.f2864f = (c0759o2.f2925c - c0759o.f2925c) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0746b)) {
            return false;
        }
        C0746b c0746b = (C0746b) obj;
        return this.f2859a.equals(c0746b.f2859a) && this.f2860b.equals(c0746b.f2860b) && Objects.equals(this.f2862d, c0746b.f2862d) && this.f2863e == c0746b.f2863e && this.f2861c.equals(c0746b.f2861c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2859a, this.f2860b, this.f2862d, Integer.valueOf(this.f2863e), this.f2861c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r3) {
        parcel.writeParcelable(this.f2859a, 0);
        parcel.writeParcelable(this.f2860b, 0);
        parcel.writeParcelable(this.f2862d, 0);
        parcel.writeParcelable(this.f2861c, 0);
        parcel.writeInt(this.f2863e);
    }
}
