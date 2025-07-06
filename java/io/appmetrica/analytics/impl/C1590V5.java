package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;

/* renamed from: io.appmetrica.analytics.impl.V5 */
/* loaded from: classes.dex */
public final class C1590V5 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        EnumC2042n9 enumC2042n9;
        Bundle readBundle = parcel.readBundle(ResultReceiverC1192F6.class.getClassLoader());
        if (readBundle.containsKey("CounterReport.Source")) {
            int r02 = readBundle.getInt("CounterReport.Source");
            EnumC2042n9[] values = EnumC2042n9.values();
            int length = values.length;
            int r5 = 0;
            while (true) {
                if (r5 >= length) {
                    enumC2042n9 = EnumC2042n9.NATIVE;
                    break;
                }
                enumC2042n9 = values[r5];
                if (enumC2042n9.f6804a == r02) {
                    break;
                }
                r5++;
            }
        } else {
            enumC2042n9 = null;
        }
        C1615W5 c1615w5 = new C1615W5("", "", 0);
        EnumC1670Ya enumC1670Ya = EnumC1670Ya.EVENT_TYPE_UNDEFINED;
        c1615w5.f5624d = readBundle.getInt("CounterReport.Type", -1);
        c1615w5.f5625e = readBundle.getInt("CounterReport.CustomType");
        c1615w5.f5622b = StringUtils.ifIsNullToDef(readBundle.getString("CounterReport.Value"), "");
        c1615w5.f5623c = readBundle.getString("CounterReport.Environment");
        c1615w5.f5621a = readBundle.getString("CounterReport.Event");
        c1615w5.f5626f = C1615W5.m3456a(readBundle);
        c1615w5.f5627g = readBundle.getInt("CounterReport.TRUNCATED");
        c1615w5.f5628h = readBundle.getString("CounterReport.ProfileID");
        c1615w5.f5629i = readBundle.getLong("CounterReport.CreationElapsedRealtime");
        c1615w5.f5630j = readBundle.getLong("CounterReport.CreationTimestamp");
        c1615w5.f5631k = EnumC1768ca.m3712a(Integer.valueOf(readBundle.getInt("CounterReport.UniquenessStatus")));
        c1615w5.f5632l = enumC2042n9;
        c1615w5.f5633m = readBundle.getBundle("CounterReport.Payload");
        c1615w5.f5634n = readBundle.containsKey("CounterReport.AttributionIdChanged") ? Boolean.valueOf(readBundle.getBoolean("CounterReport.AttributionIdChanged")) : null;
        c1615w5.f5635o = readBundle.containsKey("CounterReport.OpenId") ? Integer.valueOf(readBundle.getInt("CounterReport.OpenId")) : null;
        c1615w5.f5636p = CollectionUtils.bundleToMap(readBundle.getBundle("CounterReport.Extras"));
        return c1615w5;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int r12) {
        return new C1615W5[r12];
    }
}
