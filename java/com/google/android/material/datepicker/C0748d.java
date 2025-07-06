package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p023I0.C0205c;

/* renamed from: com.google.android.material.datepicker.d */
/* loaded from: classes.dex */
public final class C0748d implements Parcelable {
    public static final Parcelable.Creator<C0748d> CREATOR = new C0205c(16);

    /* renamed from: a */
    public final long f2868a;

    public C0748d(long j2) {
        this.f2868a = j2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0748d) && this.f2868a == ((C0748d) obj).f2868a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f2868a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r4) {
        parcel.writeLong(this.f2868a);
    }
}
