package io.appmetrica.analytics.impl;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: io.appmetrica.analytics.impl.Jk */
/* loaded from: classes.dex */
public final class C1306Jk implements InterfaceC1117C6 {

    /* renamed from: a */
    public final C1740b7 f4930a;

    public C1306Jk(C1740b7 c1740b7) {
        this.f4930a = c1740b7;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1117C6
    /* renamed from: a */
    public final void mo2791a(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1117C6
    /* renamed from: a */
    public final SQLiteDatabase mo2790a() {
        try {
            return this.f4930a.getWritableDatabase();
        } catch (Throwable unused) {
            return null;
        }
    }
}
