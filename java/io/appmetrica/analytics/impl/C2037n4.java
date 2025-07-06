package io.appmetrica.analytics.impl;

import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.p094db.DatabaseScript;

/* renamed from: io.appmetrica.analytics.impl.n4 */
/* loaded from: classes.dex */
public final class C2037n4 extends DatabaseScript {
    @Override // io.appmetrica.analytics.coreapi.internal.p094db.DatabaseScript
    public final void runScript(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.delete("preferences", "key = ?", new String[]{"NEXT_STARTUP_TIME"});
    }
}
