package io.appmetrica.analytics.impl;

import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.p094db.DatabaseScript;

/* renamed from: io.appmetrica.analytics.impl.e5 */
/* loaded from: classes.dex */
public final class C1813e5 extends DatabaseScript {

    /* renamed from: a */
    public final C1788d5 f6120a = new C1788d5();

    /* renamed from: b */
    public final C1763c5 f6121b = new C1763c5();

    @Override // io.appmetrica.analytics.coreapi.internal.p094db.DatabaseScript
    public final void runScript(SQLiteDatabase sQLiteDatabase) {
        this.f6120a.runScript(sQLiteDatabase);
        this.f6121b.runScript(sQLiteDatabase);
    }
}
