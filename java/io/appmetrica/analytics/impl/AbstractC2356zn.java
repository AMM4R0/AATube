package io.appmetrica.analytics.impl;

import android.database.Cursor;
import android.text.TextUtils;
import java.io.Closeable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.zn */
/* loaded from: classes.dex */
public abstract class AbstractC2356zn {
    /* renamed from: a */
    public static boolean m4700a(Object obj) {
        return obj != null;
    }

    /* renamed from: a */
    public static void m4699a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m4698a(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }

    /* renamed from: a */
    public static boolean m4701a(Object obj, Object obj2) {
        if (obj == null && obj2 == null) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    /* renamed from: a */
    public static boolean m4703a(Map map) {
        return map == null || map.size() == 0;
    }

    /* renamed from: a */
    public static boolean m4702a(Collection collection) {
        return collection == null || collection.size() == 0;
    }

    /* renamed from: a */
    public static String m4696a(String str) {
        if (TextUtils.isEmpty(str) || str.length() != 36) {
            return "";
        }
        StringBuilder sb = new StringBuilder(str);
        sb.replace(8, str.length() - 4, "-xxxx-xxxx-xxxx-xxxxxxxx");
        return sb.toString();
    }

    /* renamed from: a */
    public static BigDecimal m4697a(long j2) {
        return new BigDecimal(j2).divide(new BigDecimal(1000000), 6, 6);
    }

    /* renamed from: a */
    public static double m4695a(double d2) {
        if (Double.isNaN(d2) || Double.isInfinite(d2)) {
            return 0.0d;
        }
        return d2;
    }
}
