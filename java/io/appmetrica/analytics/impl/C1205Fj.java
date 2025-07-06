package io.appmetrica.analytics.impl;

import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.p094db.DatabaseScript;

/* renamed from: io.appmetrica.analytics.impl.Fj */
/* loaded from: classes.dex */
public final class C1205Fj extends DatabaseScript {
    @Override // io.appmetrica.analytics.coreapi.internal.p094db.DatabaseScript
    public final void runScript(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS temp_cache (id INTEGER PRIMARY KEY,scope TEXT,data BLOB,timestamp INTEGER)");
    }
}
