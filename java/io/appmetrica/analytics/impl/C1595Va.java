package io.appmetrica.analytics.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: io.appmetrica.analytics.impl.Va */
/* loaded from: classes.dex */
public final class C1595Va implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new C1620Wa(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int r12) {
        return new C1620Wa[r12];
    }
}
