package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.Wa */
/* loaded from: classes.dex */
public final class C1620Wa implements Parcelable {
    public static final Parcelable.Creator<C1620Wa> CREATOR = new C1595Va();

    /* renamed from: a */
    public final ResultReceiver f5638a;

    /* renamed from: b */
    public final List f5639b;

    /* renamed from: c */
    public final HashMap f5640c;

    public C1620Wa(ResultReceiverC1192F6 resultReceiverC1192F6, List list, Map map) {
        this.f5639b = list;
        this.f5638a = resultReceiverC1192F6;
        this.f5640c = map == null ? new HashMap() : new HashMap(map);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r4) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("io.appmetrica.analytics.internal.CounterConfiguration.receiver", this.f5638a);
        if (this.f5639b != null) {
            bundle.putStringArrayList("io.appmetrica.analytics.internal.CounterConfiguration.identifiersList", new ArrayList<>(this.f5639b));
        }
        HashMap hashMap = this.f5640c;
        if (hashMap != null) {
            bundle.putString("io.appmetrica.analytics.internal.CounterConfiguration.clidsForVerification", AbstractC1730am.m3628a((Map) hashMap));
        }
        parcel.writeBundle(bundle);
    }

    public C1620Wa(Parcel parcel) {
        Bundle readBundle = parcel.readBundle(ResultReceiverC1192F6.class.getClassLoader());
        if (readBundle != null) {
            this.f5638a = (ResultReceiver) readBundle.getParcelable("io.appmetrica.analytics.internal.CounterConfiguration.receiver");
            this.f5639b = readBundle.getStringArrayList("io.appmetrica.analytics.internal.CounterConfiguration.identifiersList");
            this.f5640c = AbstractC1730am.m3629a(readBundle.getString("io.appmetrica.analytics.internal.CounterConfiguration.clidsForVerification"));
            return;
        }
        this.f5640c = new HashMap();
    }
}
