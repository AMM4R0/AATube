package io.appmetrica.analytics.impl;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.Cm */
/* loaded from: classes.dex */
public final class C1133Cm {

    /* renamed from: a */
    public final HashMap f4614a;

    public C1133Cm(String str, HashMap<String, List<String>> hashMap) {
        this.f4614a = hashMap;
    }

    /* renamed from: a */
    public final HashMap<String, List<String>> m2808a() {
        return this.f4614a;
    }

    /* renamed from: a */
    public final boolean m2809a(SQLiteDatabase sQLiteDatabase) {
        try {
            boolean z2 = true;
            for (Map.Entry entry : this.f4614a.entrySet()) {
                try {
                    Cursor query = sQLiteDatabase.query((String) entry.getKey(), null, null, null, null, null, null);
                    if (query == null) {
                        AbstractC2356zn.m4698a(query);
                        return false;
                    }
                    List list = (List) entry.getValue();
                    List asList = Arrays.asList(query.getColumnNames());
                    Collections.sort(asList);
                    z2 &= list.equals(asList);
                    AbstractC2356zn.m4698a(query);
                } catch (Throwable th) {
                    AbstractC2356zn.m4698a((Cursor) null);
                    throw th;
                }
            }
            return z2;
        } catch (Throwable unused) {
            return false;
        }
    }
}
