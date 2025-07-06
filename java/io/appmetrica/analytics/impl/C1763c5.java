package io.appmetrica.analytics.impl;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.p094db.DatabaseScript;

/* renamed from: io.appmetrica.analytics.impl.c5 */
/* loaded from: classes.dex */
public final class C1763c5 extends DatabaseScript {

    /* renamed from: a */
    public final int f5970a = 2000;

    /* renamed from: b */
    public final String f5971b = "number";

    /* renamed from: c */
    public final String f5972c = "global_number";

    /* renamed from: d */
    public final String f5973d = "number_of_type";

    /* renamed from: e */
    public final String f5974e = "name";

    /* renamed from: f */
    public final String f5975f = "value";

    /* renamed from: g */
    public final String f5976g = "type";

    /* renamed from: h */
    public final String f5977h = "time";

    /* renamed from: i */
    public final String f5978i = "session_id";

    /* renamed from: j */
    public final String f5979j = "error_environment";

    /* renamed from: k */
    public final String f5980k = "session_type";

    /* renamed from: l */
    public final String f5981l = "app_environment";

    /* renamed from: m */
    public final String f5982m = "app_environment_revision";

    /* renamed from: n */
    public final String f5983n = "truncated";

    /* renamed from: o */
    public final String f5984o = "custom_type";

    /* renamed from: p */
    public final String f5985p = "encrypting_mode";

    /* renamed from: q */
    public final String f5986q = "profile_id";

    /* renamed from: r */
    public final String f5987r = "first_occurrence_status";

    /* renamed from: s */
    public final String f5988s = "source";

    /* renamed from: t */
    public final String f5989t = "attribution_id_changed";

    /* renamed from: u */
    public final String f5990u = "open_id";

    /* renamed from: v */
    public final String f5991v = "extras";

    /* renamed from: w */
    public final String f5992w = "reports";

    /* renamed from: x */
    public final C1940j7 f5993x = new C1940j7(null, 1, 0 == true ? 1 : 0);

    /* renamed from: a */
    public static boolean m3688a(C1915i7 c1915i7) {
        Long l2;
        EnumC1670Ya enumC1670Ya;
        Long l3;
        Long l4;
        Long l5;
        Integer num;
        Long l6 = c1915i7.f6467a;
        return (l6 == null || l6.longValue() < 10000000000L || c1915i7.f6468b == null || (l2 = c1915i7.f6469c) == null || l2.longValue() < 0 || (enumC1670Ya = c1915i7.f6470d) == null || enumC1670Ya == EnumC1670Ya.EVENT_TYPE_UNDEFINED || (l3 = c1915i7.f6471e) == null || l3.longValue() < 0 || (l4 = c1915i7.f6472f) == null || l4.longValue() < 0 || ((l5 = c1915i7.f6473g.f6368d) != null && l5.longValue() < 0) || ((num = c1915i7.f6473g.f6373i) != null && num.intValue() < 0)) ? false : true;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.p094db.DatabaseScript
    public final void runScript(SQLiteDatabase sQLiteDatabase) {
        Cursor cursor;
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS events (id INTEGER PRIMARY KEY,session_id INTEGER,session_type INTEGER,number_in_session INTEGER,type INTEGER,global_number INTEGER,time INTEGER,event_description BLOB )");
        Cursor cursor2 = null;
        try {
            cursor = sQLiteDatabase.query(this.f5992w, null, null, null, null, null, null, String.valueOf(this.f5970a));
            while (cursor.moveToNext()) {
                try {
                    C1915i7 m3689a = m3689a(cursor);
                    if (m3689a != null && m3688a(m3689a)) {
                        try {
                            sQLiteDatabase.insertOrThrow("events", null, this.f5993x.fromModel(m3689a));
                        } catch (Throwable unused) {
                        }
                    }
                } catch (Throwable unused2) {
                    cursor2 = cursor;
                    if (cursor2 != null) {
                        cursor = cursor2;
                        cursor.close();
                    }
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + this.f5992w);
                }
            }
        } catch (Throwable unused3) {
        }
        cursor.close();
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + this.f5992w);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:2|3|(3:(2:58|(1:60)(15:61|6|(2:51|(1:53)(2:54|(1:56)(12:57|9|10|11|(2:44|(1:46)(8:47|48|14|15|(2:38|(3:40|18|19))|17|18|19))|13|14|15|(0)|17|18|19)))|8|9|10|11|(0)|13|14|15|(0)|17|18|19))|18|19)|5|6|(0)|8|9|10|11|(0)|13|14|15|(0)|17|(3:(0)|(9:21|22|23|24|25|(1:27)(1:33)|28|29|30)|(5:25|(0)(0)|28|29|30))) */
    /* JADX WARN: Can't wrap try/catch for region: R(21:0|1|2|3|(2:58|(1:60)(15:61|6|(2:51|(1:53)(2:54|(1:56)(12:57|9|10|11|(2:44|(1:46)(8:47|48|14|15|(2:38|(3:40|18|19))|17|18|19))|13|14|15|(0)|17|18|19)))|8|9|10|11|(0)|13|14|15|(0)|17|18|19))|5|6|(0)|8|9|10|11|(0)|13|14|15|(0)|17|18|19|(3:(0)|(9:21|22|23|24|25|(1:27)(1:33)|28|29|30)|(5:25|(0)(0)|28|29|30))) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x012e, code lost:
    
        if (r32.getInt(r32.getColumnIndexOrThrow(r31.f5989t)) == 1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0122, code lost:
    
        r27 = io.appmetrica.analytics.impl.EnumC2042n9.NATIVE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0103, code lost:
    
        r3 = io.appmetrica.analytics.impl.EnumC1768ca.UNKNOWN;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0151 A[Catch: all -> 0x016b, TryCatch #4 {all -> 0x016b, blocks: (B:3:0x0005, B:6:0x002a, B:9:0x00e0, B:22:0x0132, B:25:0x0142, B:28:0x0157, B:33:0x0151, B:42:0x0120, B:50:0x0103, B:51:0x00d4, B:54:0x00d9, B:58:0x0024, B:15:0x0107, B:38:0x0118, B:11:0x00ea, B:44:0x00fb, B:47:0x0100), top: B:2:0x0005, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0118 A[Catch: all -> 0x0120, TRY_LEAVE, TryCatch #0 {all -> 0x0120, blocks: (B:15:0x0107, B:38:0x0118), top: B:14:0x0107, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fb A[Catch: all -> 0x0103, TryCatch #3 {all -> 0x0103, blocks: (B:11:0x00ea, B:44:0x00fb, B:47:0x0100), top: B:10:0x00ea, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d4 A[Catch: all -> 0x016b, TryCatch #4 {all -> 0x016b, blocks: (B:3:0x0005, B:6:0x002a, B:9:0x00e0, B:22:0x0132, B:25:0x0142, B:28:0x0157, B:33:0x0151, B:42:0x0120, B:50:0x0103, B:51:0x00d4, B:54:0x00d9, B:58:0x0024, B:15:0x0107, B:38:0x0118, B:11:0x00ea, B:44:0x00fb, B:47:0x0100), top: B:2:0x0005, inners: #0, #3 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.appmetrica.analytics.impl.C1915i7 m3689a(android.database.Cursor r32) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C1763c5.m3689a(android.database.Cursor):io.appmetrica.analytics.impl.i7");
    }
}
