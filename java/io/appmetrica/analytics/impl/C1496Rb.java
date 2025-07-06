package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.io.Closeable;

/* renamed from: io.appmetrica.analytics.impl.Rb */
/* loaded from: classes.dex */
public final class C1496Rb implements InterfaceC1117C6 {

    /* renamed from: a */
    public final Context f5315a;

    /* renamed from: b */
    public final String f5316b;

    /* renamed from: c */
    public final C1108Bm f5317c;

    /* renamed from: d */
    public final C1669Y9 f5318d;

    /* renamed from: e */
    public C1740b7 f5319e;

    public C1496Rb(Context context, String str, C1108Bm c1108Bm) {
        this(context, str, new C1669Y9(str), c1108Bm);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1117C6
    /* renamed from: a */
    public final synchronized SQLiteDatabase mo2790a() {
        C1740b7 c1740b7;
        try {
            this.f5318d.m3536a();
            c1740b7 = new C1740b7(this.f5315a, this.f5316b, this.f5317c, AbstractC1521Sb.m3314a());
            this.f5319e = c1740b7;
        } catch (Throwable unused) {
            return null;
        }
        return c1740b7.getWritableDatabase();
    }

    public C1496Rb(Context context, String str, C1669Y9 c1669y9, C1108Bm c1108Bm) {
        this.f5315a = context;
        this.f5316b = str;
        this.f5318d = c1669y9;
        this.f5317c = c1108Bm;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1117C6
    /* renamed from: a */
    public final synchronized void mo2791a(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.close();
            } catch (Throwable unused) {
            }
        }
        AbstractC2356zn.m4699a((Closeable) this.f5319e);
        this.f5318d.m3537b();
        this.f5319e = null;
    }
}
