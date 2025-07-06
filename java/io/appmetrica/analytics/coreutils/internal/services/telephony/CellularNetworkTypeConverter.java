package io.appmetrica.analytics.coreutils.internal.services.telephony;

import android.util.SparseArray;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;

/* loaded from: classes.dex */
public final class CellularNetworkTypeConverter {
    public static final CellularNetworkTypeConverter INSTANCE = new CellularNetworkTypeConverter();

    /* renamed from: a */
    private static final SparseArray f4364a;

    static {
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, CellularNetworkTypeExtractor.UNKNOWN_NETWORK_TYPE_VALUE);
        sparseArray.put(7, "1xRTT");
        sparseArray.put(4, "CDMA");
        sparseArray.put(2, "EDGE");
        sparseArray.put(14, "eHRPD");
        sparseArray.put(5, "EVDO rev.0");
        sparseArray.put(6, "EVDO rev.A");
        sparseArray.put(1, "GPRS");
        sparseArray.put(8, "HSDPA");
        sparseArray.put(10, "HSPA");
        sparseArray.put(15, "HSPA+");
        sparseArray.put(9, "HSUPA");
        sparseArray.put(11, "iDen");
        sparseArray.put(3, "UMTS");
        sparseArray.put(13, "LTE");
        if (AndroidUtils.isApiAchieved(25)) {
            sparseArray.put(16, "GSM");
            sparseArray.put(17, "TD_SCDMA");
            sparseArray.put(18, "IWLAN");
        }
        if (AndroidUtils.isApiAchieved(29)) {
            sparseArray.put(20, "NR");
        }
        f4364a = sparseArray;
    }

    private CellularNetworkTypeConverter() {
    }

    public static final String convert(Integer num) {
        String str;
        return (num == null || (str = (String) f4364a.get(num.intValue())) == null) ? CellularNetworkTypeExtractor.UNKNOWN_NETWORK_TYPE_VALUE : str;
    }
}
