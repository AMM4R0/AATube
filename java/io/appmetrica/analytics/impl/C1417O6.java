package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.p096db.DBUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.O6 */
/* loaded from: classes.dex */
public final class C1417O6 {

    /* renamed from: a */
    public final ReentrantReadWriteLock.ReadLock f5153a;

    /* renamed from: b */
    public final ReentrantReadWriteLock.WriteLock f5154b;

    /* renamed from: c */
    public final C1740b7 f5155c;

    /* renamed from: d */
    public final C1392N6 f5156d;

    /* renamed from: e */
    public final Object f5157e;

    /* renamed from: f */
    public final ArrayList f5158f;

    /* renamed from: g */
    public final Context f5159g;

    /* renamed from: h */
    public final C2013m5 f5160h;

    /* renamed from: i */
    public final AtomicLong f5161i;

    /* renamed from: j */
    public final ArrayList f5162j;

    /* renamed from: k */
    public final C1342L6 f5163k;

    /* renamed from: l */
    public final C1940j7 f5164l;

    static {
        HashSet hashSet = new HashSet();
        EnumC1670Ya enumC1670Ya = EnumC1670Ya.EVENT_TYPE_UNDEFINED;
        hashSet.add(0);
        hashSet.add(6400);
    }

    public C1417O6(C2013m5 c2013m5, C1740b7 c1740b7, C1342L6 c1342l6, C1940j7 c1940j7) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f5153a = reentrantReadWriteLock.readLock();
        this.f5154b = reentrantReadWriteLock.writeLock();
        this.f5157e = new Object();
        this.f5158f = new ArrayList(3);
        AtomicLong atomicLong = new AtomicLong();
        this.f5161i = atomicLong;
        this.f5162j = new ArrayList();
        this.f5155c = c1740b7;
        this.f5159g = c2013m5.getContext();
        this.f5160h = c2013m5;
        this.f5163k = c1342l6;
        this.f5164l = c1940j7;
        atomicLong.set(m3163b());
        C1392N6 c1392n6 = new C1392N6(this, c2013m5);
        this.f5156d = c1392n6;
        c1392n6.setName(m3150a(c2013m5));
    }

    /* renamed from: a */
    public final long m3155a() {
        this.f5153a.lock();
        try {
            return this.f5161i.get();
        } finally {
            this.f5153a.unlock();
        }
    }

    /* renamed from: b */
    public final long m3163b() {
        long j2;
        SQLiteDatabase readableDatabase;
        this.f5153a.lock();
        try {
            readableDatabase = this.f5155c.getReadableDatabase();
        } catch (Throwable unused) {
        }
        if (readableDatabase != null) {
            j2 = DBUtils.queryRowsCount(readableDatabase, "events");
            this.f5153a.unlock();
            return j2;
        }
        j2 = 0;
        this.f5153a.unlock();
        return j2;
    }

    /* renamed from: c */
    public final void m3164c() {
        Cursor cursor;
        Cursor cursor2;
        this.f5153a.lock();
        Cursor cursor3 = null;
        try {
            SQLiteDatabase readableDatabase = this.f5155c.getReadableDatabase();
            if (readableDatabase != null) {
                cursor2 = readableDatabase.rawQuery(" SELECT DISTINCT id From sessions order by id asc ", new String[0]);
                try {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("All sessions in db: ");
                    while (cursor2.moveToNext()) {
                        stringBuffer.append(cursor2.getString(0));
                        stringBuffer.append(", ");
                    }
                    cursor3 = readableDatabase.rawQuery(" SELECT DISTINCT session_id From events order by session_id asc ", new String[0]);
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("All sessions in reports db: ");
                    while (cursor3.moveToNext()) {
                        stringBuffer2.append(cursor3.getString(0));
                        stringBuffer2.append(", ");
                    }
                } catch (Throwable unused) {
                    cursor = cursor3;
                    cursor3 = cursor2;
                    cursor2 = cursor3;
                    cursor3 = cursor;
                    this.f5153a.unlock();
                    AbstractC2356zn.m4698a(cursor2);
                    AbstractC2356zn.m4698a(cursor3);
                }
            } else {
                cursor2 = null;
            }
        } catch (Throwable unused2) {
            cursor = null;
        }
        this.f5153a.unlock();
        AbstractC2356zn.m4698a(cursor2);
        AbstractC2356zn.m4698a(cursor3);
    }

    /* renamed from: d */
    public final void m3165d() {
        this.f5156d.start();
    }

    /* renamed from: a */
    public final long m3156a(HashSet hashSet) {
        this.f5153a.lock();
        Cursor cursor = null;
        long j2 = 0;
        try {
            SQLiteDatabase readableDatabase = this.f5155c.getReadableDatabase();
            if (readableDatabase != null) {
                StringBuilder sb = new StringBuilder("SELECT count() FROM events");
                if (!hashSet.isEmpty()) {
                    sb.append(" WHERE ");
                }
                Iterator it = hashSet.iterator();
                int r6 = 0;
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    if (r6 > 0) {
                        sb.append(" OR ");
                    }
                    sb.append("type == " + num);
                    r6++;
                }
                cursor = readableDatabase.rawQuery(sb.toString(), null);
                if (cursor.moveToFirst()) {
                    j2 = cursor.getLong(0);
                }
            }
        } catch (Throwable unused) {
        }
        AbstractC2356zn.m4698a(cursor);
        this.f5153a.unlock();
        return j2;
    }

    /* renamed from: a */
    public final void m3162a(InterfaceC1493R8 interfaceC1493R8) {
        this.f5162j.add(interfaceC1493R8);
    }

    /* renamed from: a */
    public static String m3150a(InterfaceC1146Da interfaceC1146Da) {
        return "DatabaseWorker [" + interfaceC1146Da.mo2829b().mo3808d() + "]";
    }

    /* renamed from: a */
    public final void m3159a(long j2, EnumC2003lk enumC2003lk, long j3) {
        JSONObject jSONObject;
        boolean m2714a;
        C2290x7 c2290x7 = new C2290x7(null, 1, null);
        C1501Rg c1501Rg = (C1501Rg) this.f5160h.f6697l.m4598a();
        Long valueOf = Long.valueOf(j2);
        Long valueOf2 = Long.valueOf(j3);
        try {
            jSONObject = new JSONObject().put("dId", c1501Rg.getDeviceId()).put("uId", c1501Rg.getUuid()).put("appVer", c1501Rg.getAppVersion()).put("appBuild", c1501Rg.getAppBuildNumber()).put("kitBuildType", c1501Rg.getAnalyticsSdkBuildType()).put("osVer", c1501Rg.getOsVersion()).put("osApiLev", c1501Rg.getOsApiLevel()).put("lang", c1501Rg.getLocale()).put("root", c1501Rg.getDeviceRootStatus()).put("app_debuggable", ((C1540T5) c1501Rg).f5463a).put(CommonUrlParts.APP_FRAMEWORK, c1501Rg.getAppFramework()).put("attribution_id", c1501Rg.f5349s).put("analyticsSdkVersionName", c1501Rg.getAnalyticsSdkVersionName()).put("kitBuildNumber", c1501Rg.getAnalyticsSdkBuildNumber());
        } catch (Throwable unused) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        Long valueOf3 = Long.valueOf(AbstractC1632Wm.m3499a());
        C2327yj c2327yj = AbstractC2302xj.f7461a;
        synchronized (c2327yj) {
            m2714a = c2327yj.f7503b.m2714a(true);
        }
        ContentValues fromModel = c2290x7.fromModel(new C2265w7(valueOf, enumC2003lk, jSONObject2, new C2240v7(valueOf2, valueOf3, Boolean.valueOf(m2714a))));
        if (fromModel == null) {
            return;
        }
        this.f5154b.lock();
        try {
            SQLiteDatabase writableDatabase = this.f5155c.getWritableDatabase();
            if (writableDatabase != null) {
                writableDatabase.insertOrThrow("sessions", null, fromModel);
            }
        } catch (Throwable unused2) {
        }
        this.f5154b.unlock();
    }

    /* renamed from: a */
    public final void m3160a(ContentValues contentValues) {
        synchronized (this.f5157e) {
            this.f5158f.add(contentValues);
        }
        synchronized (this.f5156d) {
            this.f5156d.notifyAll();
        }
    }

    /* renamed from: a */
    public final int m3154a(SQLiteDatabase sQLiteDatabase) {
        try {
            return this.f5163k.m3041a(sQLiteDatabase, String.format("id IN (SELECT id FROM events ORDER BY CASE WHEN type IN (%1$s) THEN 2 WHEN type IN (%2$s) THEN 1 ELSE 0 END, id LIMIT (SELECT count() FROM events) / %3$s)", TextUtils.join(", ", AbstractC2242v9.f7286h), TextUtils.join(", ", AbstractC2242v9.f7287i), 10), 2, this.f5160h.f6687b.f6193b, true).f4902b;
        } catch (Throwable th) {
            C2202tj c2202tj = AbstractC1553Ti.f5485a;
            c2202tj.getClass();
            c2202tj.m4458a(new C2177sj("deleteExcessiveReports exception", th));
            return 0;
        }
    }

    /* renamed from: a */
    public final void m3158a(long j2, int r13, int r14, boolean z2) {
        List list;
        if (r14 <= 0) {
            return;
        }
        this.f5154b.lock();
        try {
            String format = String.format(Locale.US, "%1$s = %2$s AND %3$s = %4$s AND %5$s <= (SELECT %5$s FROM %6$s WHERE %1$s = %2$s AND %3$s = %4$s ORDER BY %5$s ASC LIMIT %7$s, 1)", "session_id", Long.toString(j2), "session_type", Integer.toString(r13), "id", "events", Integer.toString(r14 - 1));
            SQLiteDatabase writableDatabase = this.f5155c.getWritableDatabase();
            if (writableDatabase != null) {
                C1292J6 m3041a = this.f5163k.m3041a(writableDatabase, format, 1, this.f5160h.f6687b.f6193b, z2);
                if (m3041a.f4901a != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = m3041a.f4901a.iterator();
                    while (it.hasNext()) {
                        Integer asInteger = ((ContentValues) it.next()).getAsInteger("type");
                        asInteger.intValue();
                        arrayList.add(asInteger);
                    }
                    Iterator it2 = this.f5162j.iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC1493R8) it2.next()).mo2891b(arrayList);
                    }
                }
                if (this.f5160h.f6699n.f5471b && (list = m3041a.f4901a) != null) {
                    for (int r02 = 0; r02 < list.size(); r02++) {
                        m3161a((ContentValues) list.get(r02), "Event removed from db");
                    }
                }
                this.f5161i.addAndGet(-m3041a.f4902b);
            }
        } catch (Throwable unused) {
        }
        this.f5154b.unlock();
    }

    /* renamed from: a */
    public final ContentValues m3157a(long j2, EnumC2003lk enumC2003lk) {
        ContentValues contentValues = new ContentValues();
        this.f5153a.lock();
        Cursor cursor = null;
        try {
            SQLiteDatabase readableDatabase = this.f5155c.getReadableDatabase();
            if (readableDatabase != null) {
                Locale locale = Locale.US;
                cursor = readableDatabase.rawQuery("SELECT report_request_parameters FROM sessions WHERE id = " + j2 + " AND type = " + enumC2003lk.f6668a + " ORDER BY id DESC LIMIT 1", null);
                if (cursor.moveToNext()) {
                    ContentValues contentValues2 = new ContentValues();
                    DatabaseUtils.cursorRowToContentValues(cursor, contentValues2);
                    contentValues = contentValues2;
                }
            }
        } catch (Throwable unused) {
        }
        AbstractC2356zn.m4698a(cursor);
        this.f5153a.unlock();
        return contentValues;
    }

    /* renamed from: a */
    public static String m3151a(LinkedHashMap linkedHashMap) {
        StringBuilder sb = new StringBuilder("id >= ?");
        for (String str : linkedHashMap.keySet()) {
            sb.append(sb.length() > 0 ? " AND " : "");
            sb.append(str + " = ? ");
        }
        if (TextUtils.isEmpty(sb.toString())) {
            return null;
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String[] m3153a(String[] strArr, LinkedHashMap linkedHashMap) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(strArr));
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(((Map.Entry) it.next()).getValue());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: a */
    public final void m3161a(ContentValues contentValues, String str) {
        Integer asInteger = contentValues.getAsInteger("type");
        if (AbstractC2242v9.f7282d.contains(EnumC1670Ya.m3538a(asInteger != null ? asInteger.intValue() : -1))) {
            C1915i7 model = new C1940j7(null, 1, 0 == true ? 1 : 0).toModel(contentValues);
            StringBuilder sb = new StringBuilder(str);
            sb.append(": ");
            sb.append(model.f6473g.f6366b);
            String str2 = model.f6473g.f6367c;
            if (AbstractC2242v9.f7283e.contains(EnumC1670Ya.m3538a(contentValues.getAsInteger("type").intValue())) && !TextUtils.isEmpty(str2)) {
                sb.append(" with value ");
                sb.append(str2);
            }
            this.f5160h.f6699n.m3358a(4, sb.toString());
        }
    }

    /* renamed from: a */
    public static boolean m3152a(C1417O6 c1417o6) {
        boolean isEmpty;
        synchronized (c1417o6.f5157e) {
            isEmpty = c1417o6.f5158f.isEmpty();
        }
        return isEmpty;
    }
}
