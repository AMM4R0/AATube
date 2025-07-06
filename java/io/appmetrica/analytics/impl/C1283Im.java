package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC2492i;

/* renamed from: io.appmetrica.analytics.impl.Im */
/* loaded from: classes.dex */
public final class C1283Im implements TempCacheStorage {

    /* renamed from: a */
    public final InterfaceC1117C6 f4885a;

    /* renamed from: b */
    public final String f4886b;

    /* renamed from: c */
    public final SystemTimeProvider f4887c = new SystemTimeProvider();

    public C1283Im(InterfaceC1117C6 interfaceC1117C6, String str) {
        this.f4885a = interfaceC1117C6;
        this.f4886b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<TempCacheStorage.Entry> get(String str, int r15) {
        Cursor cursor;
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2;
        C1333Km c1333Km;
        ArrayList arrayList = new ArrayList();
        Cursor cursor2 = null;
        try {
            sQLiteDatabase = this.f4885a.mo2790a();
            sQLiteDatabase2 = sQLiteDatabase;
        } catch (Throwable unused) {
            cursor = null;
        }
        if (sQLiteDatabase != 0) {
            try {
                cursor = sQLiteDatabase.query(false, this.f4886b, null, "scope=?", new String[]{str}, null, null, "id", String.valueOf(r15));
                if (cursor != null) {
                    while (cursor.moveToNext()) {
                        try {
                            try {
                                c1333Km = new C1333Km(cursor.getLong(cursor.getColumnIndexOrThrow("id")), cursor.getString(cursor.getColumnIndexOrThrow("scope")), cursor.getLong(cursor.getColumnIndexOrThrow("timestamp")), cursor.getBlob(cursor.getColumnIndexOrThrow("data")));
                            } catch (Throwable unused2) {
                                c1333Km = null;
                            }
                            if (c1333Km != null) {
                                arrayList.add(c1333Km);
                            }
                        } catch (Throwable unused3) {
                            cursor2 = sQLiteDatabase;
                            sQLiteDatabase = cursor2;
                            cursor2 = cursor;
                            sQLiteDatabase2 = sQLiteDatabase;
                            AbstractC2356zn.m4698a(cursor2);
                            this.f4885a.mo2791a(sQLiteDatabase2);
                            return arrayList;
                        }
                    }
                }
            } catch (Throwable unused4) {
                cursor = null;
            }
            cursor2 = cursor;
            sQLiteDatabase2 = sQLiteDatabase;
        }
        AbstractC2356zn.m4698a(cursor2);
        this.f4885a.mo2791a(sQLiteDatabase2);
        return arrayList;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final long put(String str, long j2, byte[] bArr) {
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2 = null;
        try {
            sQLiteDatabase = this.f4885a.mo2790a();
            if (sQLiteDatabase != null) {
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("scope", str);
                    contentValues.put("timestamp", Long.valueOf(j2));
                    contentValues.put("data", bArr);
                    long insertOrThrow = sQLiteDatabase.insertOrThrow(this.f4886b, null, contentValues);
                    this.f4885a.mo2791a(sQLiteDatabase);
                    return insertOrThrow;
                } catch (Throwable unused) {
                    sQLiteDatabase2 = sQLiteDatabase;
                    sQLiteDatabase = sQLiteDatabase2;
                    this.f4885a.mo2791a(sQLiteDatabase);
                    return -1L;
                }
            }
        } catch (Throwable unused2) {
        }
        this.f4885a.mo2791a(sQLiteDatabase);
        return -1L;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final void remove(long j2) {
        m2976a("id=?", new String[]{String.valueOf(j2)});
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final void removeOlderThan(String str, long j2) {
        m2976a("scope=? AND timestamp<?", new String[]{str, String.valueOf(this.f4887c.currentTimeMillis() - j2)});
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final TempCacheStorage.Entry get(String str) {
        List<TempCacheStorage.Entry> list = get(str, 1);
        AbstractC2492i.m4915e(list, "<this>");
        return list.isEmpty() ? null : list.get(0);
    }

    /* renamed from: a */
    public final void m2976a(String str, String[] strArr) {
        SQLiteDatabase sQLiteDatabase;
        try {
            sQLiteDatabase = this.f4885a.mo2790a();
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.delete(this.f4886b, str, strArr);
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
            sQLiteDatabase = null;
        }
        this.f4885a.mo2791a(sQLiteDatabase);
    }
}
