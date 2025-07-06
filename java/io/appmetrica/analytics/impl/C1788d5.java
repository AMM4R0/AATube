package io.appmetrica.analytics.impl;

import android.database.Cursor;
import io.appmetrica.analytics.coreapi.internal.p094db.DatabaseScript;

/* renamed from: io.appmetrica.analytics.impl.d5 */
/* loaded from: classes.dex */
public final class C1788d5 extends DatabaseScript {

    /* renamed from: a */
    public final String f6066a = "sessions";

    /* renamed from: b */
    public final int f6067b = 200;

    /* renamed from: c */
    public final String f6068c = "id";

    /* renamed from: d */
    public final String f6069d = "start_time";

    /* renamed from: e */
    public final String f6070e = "report_request_parameters";

    /* renamed from: f */
    public final String f6071f = "server_time_offset";

    /* renamed from: g */
    public final String f6072g = "type";

    /* renamed from: h */
    public final String f6073h = "obtained_before_first_sync";

    /* renamed from: i */
    public final C2290x7 f6074i = new C2290x7(null, 1, 0 == true ? 1 : 0);

    /* renamed from: a */
    public final C2265w7 m3724a(Cursor cursor) {
        try {
            Long valueOf = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f6068c)));
            int r3 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f6072g));
            EnumC2003lk enumC2003lk = EnumC2003lk.FOREGROUND;
            boolean z2 = true;
            if (r3 != 0) {
                enumC2003lk = EnumC2003lk.BACKGROUND;
                if (r3 != 1) {
                    enumC2003lk = null;
                }
            }
            String string = cursor.getString(cursor.getColumnIndexOrThrow(this.f6070e));
            Long valueOf2 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f6069d)));
            Long valueOf3 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f6071f)));
            if (cursor.getInt(cursor.getColumnIndexOrThrow(this.f6073h)) != 1) {
                z2 = false;
            }
            return new C2265w7(valueOf, enumC2003lk, string, new C2240v7(valueOf2, valueOf3, Boolean.valueOf(z2)));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x005b, code lost:
    
        if (r2 == null) goto L28;
     */
    @Override // io.appmetrica.analytics.coreapi.internal.p094db.DatabaseScript
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void runScript(android.database.sqlite.SQLiteDatabase r12) {
        /*
            r11 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            java.lang.String r3 = r11.f6066a     // Catch: java.lang.Throwable -> L5a
            int r2 = r11.f6067b     // Catch: java.lang.Throwable -> L5a
            java.lang.String r10 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L5a
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r12
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L5a
        L19:
            boolean r3 = r2.moveToNext()     // Catch: java.lang.Throwable -> L5b
            if (r3 == 0) goto L5d
            io.appmetrica.analytics.impl.w7 r3 = r11.m3724a(r2)     // Catch: java.lang.Throwable -> L5b
            if (r3 == 0) goto L19
            java.lang.Long r4 = r3.f7339a     // Catch: java.lang.Throwable -> L5b
            if (r4 == 0) goto L19
            long r4 = r4.longValue()     // Catch: java.lang.Throwable -> L5b
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto L19
            io.appmetrica.analytics.impl.lk r4 = r3.f7340b     // Catch: java.lang.Throwable -> L5b
            if (r4 == 0) goto L19
            java.lang.String r4 = r3.f7341c     // Catch: java.lang.Throwable -> L5b
            if (r4 == 0) goto L19
            int r4 = r4.length()     // Catch: java.lang.Throwable -> L5b
            if (r4 != 0) goto L42
            goto L19
        L42:
            io.appmetrica.analytics.impl.v7 r4 = r3.f7342d     // Catch: java.lang.Throwable -> L5b
            java.lang.Long r4 = r4.f7261a     // Catch: java.lang.Throwable -> L5b
            if (r4 == 0) goto L19
            long r4 = r4.longValue()     // Catch: java.lang.Throwable -> L5b
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 <= 0) goto L19
            io.appmetrica.analytics.impl.x7 r4 = r11.f6074i     // Catch: java.lang.Throwable -> L5b
            android.content.ContentValues r3 = r4.fromModel(r3)     // Catch: java.lang.Throwable -> L5b
            r0.add(r3)     // Catch: java.lang.Throwable -> L5b
            goto L19
        L5a:
            r2 = r1
        L5b:
            if (r2 == 0) goto L60
        L5d:
            r2.close()
        L60:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "DROP TABLE IF EXISTS "
            r2.<init>(r3)
            java.lang.String r3 = r11.f6066a
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r12.execSQL(r2)
            java.lang.String r2 = "CREATE TABLE IF NOT EXISTS sessions (id INTEGER,type INTEGER,report_request_parameters TEXT,session_description BLOB )"
            r12.execSQL(r2)
            java.util.Iterator r0 = r0.iterator()
        L7c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L8e
            java.lang.Object r2 = r0.next()
            android.content.ContentValues r2 = (android.content.ContentValues) r2
            java.lang.String r3 = "sessions"
            r12.insertOrThrow(r3, r1, r2)     // Catch: java.lang.Throwable -> L7c
            goto L7c
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C1788d5.runScript(android.database.sqlite.SQLiteDatabase):void");
    }
}
