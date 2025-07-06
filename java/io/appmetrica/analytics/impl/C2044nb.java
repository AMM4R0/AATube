package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import java.io.Closeable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import p000A.AbstractC0002c;

/* renamed from: io.appmetrica.analytics.impl.nb */
/* loaded from: classes.dex */
public final class C2044nb implements InterfaceC1221Ga, Closeable {

    /* renamed from: a */
    public final HashMap f6806a = new HashMap();

    /* renamed from: b */
    public final HashMap f6807b = new HashMap();

    /* renamed from: c */
    public final String f6808c = "preferences";

    /* renamed from: d */
    public final C2019mb f6809d;

    /* renamed from: e */
    public volatile boolean f6810e;

    /* renamed from: f */
    public final InterfaceC1117C6 f6811f;

    public C2044nb(InterfaceC1117C6 interfaceC1117C6) {
        this.f6811f = interfaceC1117C6;
        Locale locale = Locale.US;
        C2019mb c2019mb = new C2019mb(this, AbstractC0002c.m11f(ThreadFactoryC1896hd.m3943a(), "IAA-DW-"));
        this.f6809d = c2019mb;
        c2019mb.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0022 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Long] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m4242a(io.appmetrica.analytics.impl.C2044nb r13) {
        /*
            java.lang.String r0 = "type"
            java.lang.String r1 = "value"
            java.lang.String r2 = "key"
            r13.getClass()
            r3 = 0
            io.appmetrica.analytics.impl.C6 r4 = r13.f6811f     // Catch: java.lang.Throwable -> L85
            android.database.sqlite.SQLiteDatabase r4 = r4.mo2790a()     // Catch: java.lang.Throwable -> L85
            if (r4 == 0) goto L86
            java.lang.String r6 = r13.f6808c     // Catch: java.lang.Throwable -> L86
            java.lang.String[] r7 = new java.lang.String[]{r2, r1, r0}     // Catch: java.lang.Throwable -> L86
            r11 = 0
            r12 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r5 = r4
            android.database.Cursor r5 = r5.query(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L86
        L22:
            boolean r6 = r5.moveToNext()     // Catch: java.lang.Throwable -> L83
            if (r6 == 0) goto L83
            int r6 = r5.getColumnIndexOrThrow(r2)     // Catch: java.lang.Throwable -> L83
            java.lang.String r6 = r5.getString(r6)     // Catch: java.lang.Throwable -> L83
            int r7 = r5.getColumnIndexOrThrow(r1)     // Catch: java.lang.Throwable -> L83
            java.lang.String r7 = r5.getString(r7)     // Catch: java.lang.Throwable -> L83
            int r8 = r5.getColumnIndexOrThrow(r0)     // Catch: java.lang.Throwable -> L83
            int r8 = r5.getInt(r8)     // Catch: java.lang.Throwable -> L83
            boolean r9 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L83
            if (r9 != 0) goto L22
            r9 = 1
            if (r8 == r9) goto L66
            r9 = 2
            if (r8 == r9) goto L61
            r9 = 3
            if (r8 == r9) goto L5c
            r9 = 4
            if (r8 == r9) goto L7b
            r9 = 5
            if (r8 == r9) goto L57
        L55:
            r7 = r3
            goto L7b
        L57:
            java.lang.Float r7 = io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils.parseFloat(r7)     // Catch: java.lang.Throwable -> L83
            goto L7b
        L5c:
            java.lang.Long r7 = io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils.parseLong(r7)     // Catch: java.lang.Throwable -> L83
            goto L7b
        L61:
            java.lang.Integer r7 = io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils.parseInt(r7)     // Catch: java.lang.Throwable -> L83
            goto L7b
        L66:
            java.lang.String r8 = "true"
            boolean r8 = r8.equals(r7)     // Catch: java.lang.Throwable -> L83
            if (r8 == 0) goto L71
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L83
            goto L7b
        L71:
            java.lang.String r8 = "false"
            boolean r7 = r8.equals(r7)     // Catch: java.lang.Throwable -> L83
            if (r7 == 0) goto L55
            java.lang.Boolean r7 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L83
        L7b:
            if (r7 == 0) goto L22
            java.util.HashMap r8 = r13.f6806a     // Catch: java.lang.Throwable -> L83
            r8.put(r6, r7)     // Catch: java.lang.Throwable -> L83
            goto L22
        L83:
            r3 = r5
            goto L86
        L85:
            r4 = r3
        L86:
            io.appmetrica.analytics.impl.AbstractC2356zn.m4698a(r3)
            io.appmetrica.analytics.impl.C6 r13 = r13.f6811f
            r13.mo2791a(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C2044nb.m4242a(io.appmetrica.analytics.impl.nb):void");
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1221Ga
    /* renamed from: b */
    public final void mo2906b() {
        synchronized (this.f6809d) {
            this.f6809d.notifyAll();
        }
    }

    /* renamed from: c */
    public final void m4246c() {
        if (this.f6810e) {
            return;
        }
        try {
            this.f6806a.wait();
        } catch (InterruptedException unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f6809d.isRunning()) {
            this.f6809d.stopRunning();
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1221Ga
    public final boolean getBoolean(String str, boolean z2) {
        Object m4245b = m4245b(str);
        return m4245b instanceof Boolean ? ((Boolean) m4245b).booleanValue() : z2;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1221Ga
    public final int getInt(String str, int r3) {
        Object m4245b = m4245b(str);
        return m4245b instanceof Integer ? ((Integer) m4245b).intValue() : r3;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1221Ga
    public final long getLong(String str, long j2) {
        Object m4245b = m4245b(str);
        return m4245b instanceof Long ? ((Long) m4245b).longValue() : j2;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1221Ga
    public final String getString(String str, String str2) {
        Object m4245b = m4245b(str);
        return m4245b instanceof String ? (String) m4245b : str2;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1221Ga
    public final InterfaceC1221Ga remove(String str) {
        synchronized (this.f6806a) {
            m4246c();
            this.f6806a.remove(str);
        }
        synchronized (this.f6809d) {
            this.f6807b.put(str, this);
            this.f6809d.notifyAll();
        }
        return this;
    }

    /* renamed from: b */
    public final Object m4245b(String str) {
        Object obj;
        synchronized (this.f6806a) {
            m4246c();
            obj = this.f6806a.get(str);
        }
        return obj;
    }

    /* renamed from: a */
    public static void m4243a(C2044nb c2044nb, HashMap hashMap) {
        SQLiteDatabase sQLiteDatabase;
        c2044nb.getClass();
        int size = hashMap.size();
        ContentValues[] contentValuesArr = new ContentValues[size];
        int r3 = 0;
        for (Map.Entry entry : hashMap.entrySet()) {
            ContentValues contentValues = new ContentValues();
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            contentValues.put("key", str);
            if (value == c2044nb) {
                contentValues.putNull("value");
            } else if (value instanceof String) {
                contentValues.put("value", (String) value);
                contentValues.put("type", (Integer) 4);
            } else if (value instanceof Long) {
                contentValues.put("value", (Long) value);
                contentValues.put("type", (Integer) 3);
            } else if (value instanceof Integer) {
                contentValues.put("value", (Integer) value);
                contentValues.put("type", (Integer) 2);
            } else if (value instanceof Boolean) {
                contentValues.put("value", String.valueOf(((Boolean) value).booleanValue()));
                contentValues.put("type", (Integer) 1);
            } else if (value instanceof Float) {
                contentValues.put("value", (Float) value);
                contentValues.put("type", (Integer) 5);
            }
            contentValuesArr[r3] = contentValues;
            r3++;
        }
        SQLiteDatabase sQLiteDatabase2 = null;
        try {
            sQLiteDatabase = c2044nb.f6811f.mo2790a();
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.beginTransaction();
                    for (int r2 = 0; r2 < size; r2++) {
                        ContentValues contentValues2 = contentValuesArr[r2];
                        if (contentValues2.getAsString("value") == null) {
                            sQLiteDatabase.delete(c2044nb.f6808c, "key = ?", new String[]{contentValues2.getAsString("key")});
                        } else {
                            sQLiteDatabase.insertWithOnConflict(c2044nb.f6808c, null, contentValues2, 5);
                        }
                    }
                    sQLiteDatabase.setTransactionSuccessful();
                } catch (Throwable unused) {
                    sQLiteDatabase2 = sQLiteDatabase;
                    if (sQLiteDatabase2 != null) {
                        try {
                            sQLiteDatabase2.endTransaction();
                        } catch (Throwable unused2) {
                        }
                    }
                    sQLiteDatabase = sQLiteDatabase2;
                    c2044nb.f6811f.mo2791a(sQLiteDatabase);
                }
            }
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.endTransaction();
                } catch (Throwable unused3) {
                }
            }
        } catch (Throwable unused4) {
        }
        c2044nb.f6811f.mo2791a(sQLiteDatabase);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1221Ga
    /* renamed from: a */
    public final synchronized InterfaceC1221Ga mo2902a(String str, String str2) {
        m4244a(str, (Object) str2);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1221Ga
    /* renamed from: a */
    public final InterfaceC1221Ga mo2901a(String str, long j2) {
        m4244a(str, Long.valueOf(j2));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1221Ga
    /* renamed from: a */
    public final synchronized InterfaceC1221Ga mo2899a(int r12, String str) {
        m4244a(str, Integer.valueOf(r12));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1221Ga
    /* renamed from: a */
    public final InterfaceC1221Ga mo2903a(String str, boolean z2) {
        m4244a(str, Boolean.valueOf(z2));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1221Ga
    /* renamed from: a */
    public final InterfaceC1221Ga mo2900a(String str, float f) {
        m4244a(str, Float.valueOf(f));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1221Ga
    /* renamed from: a */
    public final boolean mo2905a(String str) {
        boolean containsKey;
        synchronized (this.f6806a) {
            m4246c();
            containsKey = this.f6806a.containsKey(str);
        }
        return containsKey;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1221Ga
    /* renamed from: a */
    public final Set mo2904a() {
        HashSet hashSet;
        synchronized (this.f6806a) {
            hashSet = new HashSet(this.f6806a.keySet());
        }
        return hashSet;
    }

    /* renamed from: a */
    public final void m4244a(String str, Object obj) {
        synchronized (this.f6806a) {
            m4246c();
            this.f6806a.put(str, obj);
        }
        synchronized (this.f6809d) {
            this.f6807b.put(str, obj);
            this.f6809d.notifyAll();
        }
    }
}
