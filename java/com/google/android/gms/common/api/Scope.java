package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p001A0.AbstractC0005b;
import p023I0.C0205c;
import p136w0.AbstractC2877a;

/* loaded from: classes.dex */
public final class Scope extends AbstractC2877a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new C0205c(27);

    /* renamed from: a */
    public final int f2691a;

    /* renamed from: b */
    public final String f2692b;

    public Scope(int r2, String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("scopeUri must not be null or empty");
        }
        this.f2691a = r2;
        this.f2692b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f2692b.equals(((Scope) obj).f2692b);
    }

    public final int hashCode() {
        return this.f2692b.hashCode();
    }

    public final String toString() {
        return this.f2692b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r4) {
        int m59Y = AbstractC0005b.m59Y(parcel, 20293);
        AbstractC0005b.m61a0(parcel, 1, 4);
        parcel.writeInt(this.f2691a);
        AbstractC0005b.m56V(parcel, 2, this.f2692b);
        AbstractC0005b.m60Z(parcel, m59Y);
    }
}
