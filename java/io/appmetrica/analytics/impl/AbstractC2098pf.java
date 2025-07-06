package io.appmetrica.analytics.impl;

import android.util.SparseArray;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.pf */
/* loaded from: classes.dex */
public abstract class AbstractC2098pf {

    /* renamed from: a */
    public static final Map f6912a;

    /* renamed from: b */
    public static final SparseArray f6913b;

    /* renamed from: c */
    public static final Map f6914c;

    /* renamed from: d */
    public static final Map f6915d;

    static {
        HashMap hashMap = new HashMap();
        EnumC2003lk enumC2003lk = EnumC2003lk.FOREGROUND;
        hashMap.put(enumC2003lk, 0);
        EnumC2003lk enumC2003lk2 = EnumC2003lk.BACKGROUND;
        hashMap.put(enumC2003lk2, 1);
        f6912a = Collections.unmodifiableMap(hashMap);
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, enumC2003lk);
        sparseArray.put(1, enumC2003lk2);
        f6913b = sparseArray;
        HashMap hashMap2 = new HashMap();
        EnumC1670Ya enumC1670Ya = EnumC1670Ya.EVENT_TYPE_INIT;
        hashMap2.put(enumC1670Ya, 1);
        EnumC1670Ya enumC1670Ya2 = EnumC1670Ya.EVENT_TYPE_REGULAR;
        hashMap2.put(enumC1670Ya2, 4);
        EnumC1670Ya enumC1670Ya3 = EnumC1670Ya.EVENT_TYPE_SEND_REFERRER;
        hashMap2.put(enumC1670Ya3, 5);
        EnumC1670Ya enumC1670Ya4 = EnumC1670Ya.EVENT_TYPE_ALIVE;
        hashMap2.put(enumC1670Ya4, 7);
        EnumC1670Ya enumC1670Ya5 = EnumC1670Ya.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF;
        hashMap2.put(enumC1670Ya5, 26);
        EnumC1670Ya enumC1670Ya6 = EnumC1670Ya.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_INTENT;
        hashMap2.put(enumC1670Ya6, 26);
        EnumC1670Ya enumC1670Ya7 = EnumC1670Ya.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE;
        hashMap2.put(enumC1670Ya7, 26);
        EnumC1670Ya enumC1670Ya8 = EnumC1670Ya.EVENT_TYPE_ANR;
        hashMap2.put(enumC1670Ya8, 25);
        EnumC1670Ya enumC1670Ya9 = EnumC1670Ya.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF;
        hashMap2.put(enumC1670Ya9, 26);
        EnumC1670Ya enumC1670Ya10 = EnumC1670Ya.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF;
        hashMap2.put(enumC1670Ya10, 26);
        EnumC1670Ya enumC1670Ya11 = EnumC1670Ya.EVENT_TYPE_EXCEPTION_USER_PROTOBUF;
        hashMap2.put(enumC1670Ya11, 27);
        EnumC1670Ya enumC1670Ya12 = EnumC1670Ya.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF;
        hashMap2.put(enumC1670Ya12, 27);
        EnumC1670Ya enumC1670Ya13 = EnumC1670Ya.EVENT_TYPE_FIRST_ACTIVATION;
        hashMap2.put(enumC1670Ya13, 13);
        EnumC1670Ya enumC1670Ya14 = EnumC1670Ya.EVENT_TYPE_START;
        hashMap2.put(enumC1670Ya14, 2);
        EnumC1670Ya enumC1670Ya15 = EnumC1670Ya.EVENT_TYPE_APP_OPEN;
        hashMap2.put(enumC1670Ya15, 16);
        EnumC1670Ya enumC1670Ya16 = EnumC1670Ya.EVENT_TYPE_APP_UPDATE;
        hashMap2.put(enumC1670Ya16, 17);
        EnumC1670Ya enumC1670Ya17 = EnumC1670Ya.EVENT_TYPE_PERMISSIONS;
        hashMap2.put(enumC1670Ya17, 18);
        EnumC1670Ya enumC1670Ya18 = EnumC1670Ya.EVENT_TYPE_APP_FEATURES;
        hashMap2.put(enumC1670Ya18, 19);
        EnumC1670Ya enumC1670Ya19 = EnumC1670Ya.EVENT_TYPE_SEND_USER_PROFILE;
        hashMap2.put(enumC1670Ya19, 20);
        EnumC1670Ya enumC1670Ya20 = EnumC1670Ya.EVENT_TYPE_SEND_REVENUE_EVENT;
        hashMap2.put(enumC1670Ya20, 21);
        EnumC1670Ya enumC1670Ya21 = EnumC1670Ya.EVENT_TYPE_SEND_AD_REVENUE_EVENT;
        hashMap2.put(enumC1670Ya21, 40);
        EnumC1670Ya enumC1670Ya22 = EnumC1670Ya.EVENT_TYPE_SEND_ECOMMERCE_EVENT;
        hashMap2.put(enumC1670Ya22, 35);
        hashMap2.put(EnumC1670Ya.EVENT_TYPE_CLEANUP, 29);
        EnumC1670Ya enumC1670Ya23 = EnumC1670Ya.EVENT_TYPE_WEBVIEW_SYNC;
        hashMap2.put(enumC1670Ya23, 38);
        EnumC1670Ya enumC1670Ya24 = EnumC1670Ya.EVENT_CLIENT_EXTERNAL_ATTRIBUTION;
        hashMap2.put(enumC1670Ya24, 42);
        f6914c = Collections.unmodifiableMap(hashMap2);
        HashMap hashMap3 = new HashMap();
        C2266w8 c2266w8 = new C2266w8();
        C1119C8 c1119c8 = new C1119C8(new C1219G8());
        C2291x8 c2291x8 = new C2291x8();
        C1139D3 c1139d3 = new C1139D3(new C1219G8());
        C1806dn c1806dn = new C1806dn(new C1219G8());
        C1998lf c1998lf = new C1998lf();
        C1568U8 m3408a = C1593V8.m3408a();
        m3408a.f5527b = c1998lf;
        m3408a.f5528c = c1998lf;
        C1593V8 c1593v8 = new C1593V8(m3408a);
        C1568U8 m3408a2 = C1593V8.m3408a();
        m3408a2.f5527b = c1119c8;
        C1593V8 c1593v82 = new C1593V8(m3408a2);
        C1568U8 m3408a3 = C1593V8.m3408a();
        m3408a3.f5527b = c1139d3;
        C1593V8 c1593v83 = new C1593V8(m3408a3);
        C1568U8 m3408a4 = C1593V8.m3408a();
        m3408a4.f5527b = c1806dn;
        C1593V8 c1593v84 = new C1593V8(m3408a4);
        C1568U8 m3408a5 = C1593V8.m3408a();
        m3408a5.f5526a = c2266w8;
        C1593V8 c1593v85 = new C1593V8(m3408a5);
        C1568U8 m3408a6 = C1593V8.m3408a();
        m3408a6.f5527b = new C1284In(new C1119C8());
        C1593V8 c1593v86 = new C1593V8(m3408a6);
        hashMap3.put(enumC1670Ya2, c1593v82);
        C1568U8 m3408a7 = C1593V8.m3408a();
        m3408a7.f5527b = new C2048nf();
        hashMap3.put(enumC1670Ya3, new C1593V8(m3408a7));
        C1568U8 m3408a8 = C1593V8.m3408a();
        m3408a8.f5526a = c2266w8;
        m3408a8.f5527b = c2291x8;
        m3408a8.f5530e = new C1642X7();
        m3408a8.f5531f = new C1667Y7();
        hashMap3.put(enumC1670Ya4, new C1593V8(m3408a8));
        hashMap3.put(enumC1670Ya9, c1593v8);
        hashMap3.put(enumC1670Ya10, c1593v8);
        hashMap3.put(enumC1670Ya11, c1593v83);
        hashMap3.put(enumC1670Ya12, c1593v83);
        hashMap3.put(enumC1670Ya5, c1593v83);
        hashMap3.put(enumC1670Ya6, c1593v83);
        hashMap3.put(enumC1670Ya7, c1593v83);
        hashMap3.put(enumC1670Ya8, c1593v83);
        C1568U8 m3408a9 = C1593V8.m3408a();
        m3408a9.f5526a = new C2266w8();
        m3408a9.f5527b = c1139d3;
        hashMap3.put(enumC1670Ya14, new C1593V8(m3408a9));
        EnumC1670Ya enumC1670Ya25 = EnumC1670Ya.EVENT_TYPE_CUSTOM_EVENT;
        C1568U8 m3408a10 = C1593V8.m3408a();
        m3408a10.f5529d = new C2073of();
        hashMap3.put(enumC1670Ya25, new C1593V8(m3408a10));
        hashMap3.put(enumC1670Ya15, c1593v82);
        hashMap3.put(enumC1670Ya17, c1593v85);
        hashMap3.put(enumC1670Ya18, c1593v85);
        hashMap3.put(enumC1670Ya19, c1593v83);
        hashMap3.put(enumC1670Ya20, c1593v83);
        hashMap3.put(enumC1670Ya21, c1593v83);
        hashMap3.put(enumC1670Ya22, c1593v84);
        hashMap3.put(enumC1670Ya, c1593v86);
        hashMap3.put(enumC1670Ya16, c1593v86);
        hashMap3.put(enumC1670Ya13, c1593v82);
        hashMap3.put(enumC1670Ya23, c1593v82);
        hashMap3.put(enumC1670Ya24, c1593v83);
        f6915d = Collections.unmodifiableMap(hashMap3);
    }

    /* renamed from: a */
    public static C1942j9 m4287a(Long l2, Long l3, Boolean bool) {
        C1942j9 c1942j9 = new C1942j9();
        if (l2 != null) {
            c1942j9.f6532a = l2.longValue();
            c1942j9.f6533b = ((GregorianCalendar) Calendar.getInstance()).getTimeZone().getOffset(l2.longValue() * 1000) / AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT;
        }
        if (l3 != null) {
            c1942j9.f6534c = l3.longValue();
        }
        if (bool != null) {
            c1942j9.f6535d = bool.booleanValue();
        }
        return c1942j9;
    }
}
