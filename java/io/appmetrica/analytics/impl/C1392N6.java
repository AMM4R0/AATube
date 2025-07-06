package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.N6 */
/* loaded from: classes.dex */
public final class C1392N6 extends InterruptionSafeThread {

    /* renamed from: a */
    public final C2013m5 f5113a;

    /* renamed from: b */
    public final /* synthetic */ C1417O6 f5114b;

    public C1392N6(C1417O6 c1417o6, C2013m5 c2013m5) {
        this.f5114b = c1417o6;
        this.f5113a = c2013m5;
    }

    /* renamed from: a */
    public final synchronized void m3109a(ArrayList arrayList) {
        try {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ContentValues contentValues = (ContentValues) it.next();
                this.f5114b.getClass();
                Integer asInteger = contentValues.getAsInteger("type");
                asInteger.intValue();
                arrayList2.add(asInteger);
            }
            Iterator it2 = this.f5114b.f5162j.iterator();
            while (it2.hasNext()) {
                ((InterfaceC1493R8) it2.next()).mo2890a(arrayList2);
            }
            this.f5113a.f6702q.m4398b();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        while (isRunning()) {
            try {
                synchronized (this) {
                    try {
                        if (C1417O6.m3152a(this.f5114b)) {
                            wait();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable unused) {
                stopRunning();
            }
            synchronized (this.f5114b.f5157e) {
                arrayList = new ArrayList(this.f5114b.f5158f);
                this.f5114b.f5158f.clear();
            }
            C1417O6 c1417o6 = this.f5114b;
            c1417o6.getClass();
            if (!arrayList.isEmpty()) {
                c1417o6.f5154b.lock();
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    SQLiteDatabase writableDatabase = c1417o6.f5155c.getWritableDatabase();
                    if (writableDatabase != null) {
                        try {
                            writableDatabase.beginTransaction();
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ContentValues contentValues = (ContentValues) it.next();
                                writableDatabase.insertOrThrow("events", null, contentValues);
                                c1417o6.f5161i.incrementAndGet();
                                c1417o6.m3161a(contentValues, "Event saved to db");
                            }
                            writableDatabase.setTransactionSuccessful();
                            c1417o6.f5161i.get();
                        } catch (Throwable unused2) {
                            sQLiteDatabase = writableDatabase;
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.endTransaction();
                            }
                            c1417o6.f5154b.unlock();
                            m3109a(arrayList);
                        }
                    }
                    if (writableDatabase != null) {
                        try {
                            writableDatabase.endTransaction();
                        } catch (Throwable unused3) {
                        }
                    }
                } catch (Throwable unused4) {
                }
                c1417o6.f5154b.unlock();
            }
            m3109a(arrayList);
        }
    }
}
