package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.Closeable;

/* renamed from: io.appmetrica.analytics.impl.b7 */
/* loaded from: classes.dex */
public final class C1740b7 extends SQLiteOpenHelper implements Closeable {

    /* renamed from: a */
    public final String f5910a;

    /* renamed from: b */
    public final C2123qf f5911b;

    /* renamed from: c */
    public final C1108Bm f5912c;

    public C1740b7(Context context, String str, C1108Bm c1108Bm, C2123qf c2123qf) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, AbstractC1191F5.f4729b);
        this.f5912c = c1108Bm;
        this.f5910a = str;
        this.f5911b = c2123qf;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getReadableDatabase() {
        try {
            return super.getReadableDatabase();
        } catch (Throwable th) {
            this.f5911b.m3363a(th, "Could not get readable database %s due to an exception. AppMetrica SDK may behave unexpectedly.", this.f5910a);
            C2202tj c2202tj = AbstractC1553Ti.f5485a;
            c2202tj.getClass();
            c2202tj.m4458a(new C2177sj("db_read_error", th));
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (Throwable th) {
            this.f5911b.m3363a(th, "Could not get writable database %s due to an exception. AppMetrica SDK may behave unexpectedly.", this.f5910a);
            C2202tj c2202tj = AbstractC1553Ti.f5485a;
            c2202tj.getClass();
            c2202tj.m4458a(new C2177sj("db_write_error", th));
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f5912c.f4549a.runScript(sQLiteDatabase);
        } catch (Throwable unused) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int r3, int r4) {
        C1108Bm c1108Bm = this.f5912c;
        if (r3 <= r4) {
            c1108Bm.getClass();
            return;
        }
        try {
            c1108Bm.f4550b.runScript(sQLiteDatabase);
        } catch (Throwable unused) {
        }
        try {
            c1108Bm.f4549a.runScript(sQLiteDatabase);
        } catch (Throwable unused2) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        C1108Bm c1108Bm = this.f5912c;
        c1108Bm.getClass();
        try {
            C1133Cm c1133Cm = c1108Bm.f4552d;
            if (c1133Cm == null || c1133Cm.m2809a(sQLiteDatabase)) {
                return;
            }
            try {
                c1108Bm.f4550b.runScript(sQLiteDatabase);
            } catch (Throwable unused) {
            }
            c1108Bm.f4549a.runScript(sQLiteDatabase);
        } catch (Throwable unused2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onUpgrade(android.database.sqlite.SQLiteDatabase r5, int r6, int r7) {
        /*
            r4 = this;
            io.appmetrica.analytics.impl.Bm r0 = r4.f5912c
            r0.getClass()
            r1 = 1
            if (r7 <= r6) goto L32
            int r6 = r6 + r1
        L9:
            if (r6 > r7) goto L34
            io.appmetrica.analytics.impl.oa r2 = r0.f4551c     // Catch: java.lang.Throwable -> L32
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L32
            java.util.HashMap r2 = r2.f6854a     // Catch: java.lang.Throwable -> L32
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L32
            java.util.Collection r2 = (java.util.Collection) r2     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L2f
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L32
        L1f:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L2f
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L32
            io.appmetrica.analytics.coreapi.internal.db.DatabaseScript r3 = (io.appmetrica.analytics.coreapi.internal.p094db.DatabaseScript) r3     // Catch: java.lang.Throwable -> L32
            r3.runScript(r5)     // Catch: java.lang.Throwable -> L32
            goto L1f
        L2f:
            int r6 = r6 + 1
            goto L9
        L32:
            r6 = r1
            goto L35
        L34:
            r6 = 0
        L35:
            io.appmetrica.analytics.impl.Cm r7 = r0.f4552d
            boolean r7 = r7.m2809a(r5)
            r7 = r7 ^ r1
            r6 = r6 | r7
            if (r6 == 0) goto L49
            io.appmetrica.analytics.coreapi.internal.db.DatabaseScript r6 = r0.f4550b
            r6.runScript(r5)     // Catch: java.lang.Throwable -> L44
        L44:
            io.appmetrica.analytics.coreapi.internal.db.DatabaseScript r6 = r0.f4549a
            r6.runScript(r5)     // Catch: java.lang.Throwable -> L49
        L49:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C1740b7.onUpgrade(android.database.sqlite.SQLiteDatabase, int, int):void");
    }
}
