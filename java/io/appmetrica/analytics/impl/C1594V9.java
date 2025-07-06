package io.appmetrica.analytics.impl;

import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import kotlin.jvm.internal.AbstractC2492i;

/* renamed from: io.appmetrica.analytics.impl.V9 */
/* loaded from: classes.dex */
public final class C1594V9 implements Parcelable {
    public static final C1569U9 CREATOR = new C1569U9();

    /* renamed from: a */
    public final Boolean f5572a;

    /* renamed from: b */
    public final IdentifierStatus f5573b;

    /* renamed from: c */
    public final String f5574c;

    public C1594V9(Boolean bool, IdentifierStatus identifierStatus, String str) {
        this.f5572a = bool;
        this.f5573b = identifierStatus;
        this.f5574c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1594V9)) {
            return false;
        }
        C1594V9 c1594v9 = (C1594V9) obj;
        return AbstractC2492i.m4911a(this.f5572a, c1594v9.f5572a) && this.f5573b == c1594v9.f5573b && AbstractC2492i.m4911a(this.f5574c, c1594v9.f5574c);
    }

    public final int hashCode() {
        Boolean bool = this.f5572a;
        int hashCode = (this.f5573b.hashCode() + ((bool == null ? 0 : bool.hashCode()) * 31)) * 31;
        String str = this.f5574c;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "FeaturesInternal(sslPinning=" + this.f5572a + ", status=" + this.f5573b + ", errorExplanation=" + this.f5574c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r2) {
        parcel.writeValue(this.f5572a);
        parcel.writeString(this.f5573b.getValue());
        parcel.writeString(this.f5574c);
    }

    public C1594V9() {
        this(null, IdentifierStatus.UNKNOWN, null);
    }
}
