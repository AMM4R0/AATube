package io.appmetrica.analytics.impl;

import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;

/* renamed from: io.appmetrica.analytics.impl.U9 */
/* loaded from: classes.dex */
public final class C1569U9 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Object readValue = parcel.readValue(Boolean.TYPE.getClassLoader());
        return new C1594V9(readValue instanceof Boolean ? (Boolean) readValue : null, IdentifierStatus.Companion.from(parcel.readString()), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int r12) {
        return new C1594V9[r12];
    }
}
