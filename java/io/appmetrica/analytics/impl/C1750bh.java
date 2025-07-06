package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.p097io.GZIPCompressor;
import io.appmetrica.analytics.networktasks.internal.DefaultNetworkResponseHandler;
import io.appmetrica.analytics.networktasks.internal.FullUrlFormer;
import io.appmetrica.analytics.networktasks.internal.RequestBodyEncrypter;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import io.appmetrica.analytics.networktasks.internal.SendingDataTaskHelper;
import io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import javax.net.ssl.SSLSocketFactory;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.bh */
/* loaded from: classes.dex */
public final class C1750bh implements UnderlyingNetworkTask {

    /* renamed from: a */
    public final C2013m5 f5926a;

    /* renamed from: b */
    public final LinkedHashMap f5927b;

    /* renamed from: c */
    public C2090p7 f5928c;

    /* renamed from: d */
    public C1967k9 f5929d;

    /* renamed from: e */
    public final C1417O6 f5930e;

    /* renamed from: f */
    public List f5931f;

    /* renamed from: g */
    public int f5932g;

    /* renamed from: h */
    public int f5933h;

    /* renamed from: i */
    public C1725ah f5934i;

    /* renamed from: j */
    public final C1064A3 f5935j;

    /* renamed from: k */
    public final C2123qf f5936k;

    /* renamed from: l */
    public final C1409Nn f5937l;

    /* renamed from: m */
    public final InterfaceC1471Qa f5938m;

    /* renamed from: n */
    public final C1227Gg f5939n;

    /* renamed from: o */
    public final FullUrlFormer f5940o;

    /* renamed from: p */
    public final C2194tb f5941p;

    /* renamed from: q */
    public final RequestDataHolder f5942q;

    /* renamed from: r */
    public final ResponseDataHolder f5943r;

    /* renamed from: s */
    public final SendingDataTaskHelper f5944s;

    /* renamed from: t */
    public int f5945t;

    public C1750bh(C2013m5 c2013m5, C1227Gg c1227Gg, C2194tb c2194tb, FullUrlFormer<C1501Rg> fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, RequestBodyEncrypter requestBodyEncrypter) {
        this(c2013m5, c1227Gg, c2194tb, fullUrlFormer, requestDataHolder, responseDataHolder, c2013m5.m4167h(), c2013m5.m4174o(), c2013m5.m4180u(), requestBodyEncrypter);
    }

    /* renamed from: a */
    public final C1967k9 m3669a(C1725ah c1725ah, List list, C1501Rg c1501Rg) {
        C1967k9 c1967k9 = new C1967k9();
        C1767c9 c1767c9 = new C1767c9();
        c1767c9.f6030a = WrapUtils.getOrDefaultIfEmpty(this.f5928c.f6888b, c1501Rg.getUuid());
        c1767c9.f6031b = WrapUtils.getOrDefaultIfEmpty(this.f5928c.f6887a, c1501Rg.getDeviceId());
        this.f5932g = CodedOutputByteBufferNano.computeMessageSize(4, c1767c9) + this.f5932g;
        c1967k9.f6574b = c1767c9;
        C1183Em m4219z = C2018ma.f6725C.m4219z();
        C1676Yg c1676Yg = new C1676Yg(this, c1967k9);
        synchronized (m4219z) {
            m4219z.f4712a.mo2922a(c1676Yg);
        }
        List list2 = c1725ah.f5879a;
        c1967k9.f6573a = (C1892h9[]) list2.toArray(new C1892h9[list2.size()]);
        c1967k9.f6575c = m3664a(c1725ah.f5881c);
        c1967k9.f6577e = (String[]) list.toArray(new String[list.size()]);
        this.f5932g = CodedOutputByteBufferNano.computeTagSize(8) + this.f5932g;
        return c1967k9;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final String description() {
        return "ReportTask_" + this.f5926a.f6687b.f6193b;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final FullUrlFormer<?> getFullUrlFormer() {
        return this.f5940o;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final RequestDataHolder getRequestDataHolder() {
        return this.f5942q;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final ResponseDataHolder getResponseDataHolder() {
        return this.f5943r;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final RetryPolicyConfig getRetryPolicyConfig() {
        return ((C1501Rg) this.f5926a.f6697l.m4598a()).getRetryPolicyConfig();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final SSLSocketFactory getSslSocketFactory() {
        ((C1555Tk) C2018ma.f6725C.m4217x()).getClass();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onCreateTask() {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C1750bh.onCreateTask():boolean");
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPerformRequest() {
        this.f5944s.onPerformRequest();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPostRequestComplete(boolean z2) {
        if (z2) {
            m3670a(false);
        } else if (this.f5943r.getResponseCode() == 400) {
            m3670a(true);
        }
        if (z2 && this.f5936k.f5471b) {
            for (int r02 = 0; r02 < this.f5934i.f5879a.size(); r02++) {
                this.f5936k.m4359a((C1892h9) this.f5934i.f5879a.get(r02), "Event sent");
            }
        }
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final boolean onRequestComplete() {
        return this.f5944s.isResponseValid();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onRequestError(Throwable th) {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onShouldNotExecute() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onSuccessfulTaskFinished() {
        this.f5926a.f6702q.m4398b();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskAdded() {
        this.f5926a.f6702q.f7061c.set(false);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskFinished() {
        SQLiteDatabase writableDatabase;
        C1417O6 c1417o6 = this.f5926a.f6691f;
        c1417o6.getClass();
        try {
            c1417o6.f5154b.lock();
            if (c1417o6.f5161i.get() > ((C1501Rg) c1417o6.f5160h.f6697l.m4598a()).f5353w && (writableDatabase = c1417o6.f5155c.getWritableDatabase()) != null) {
                c1417o6.f5161i.addAndGet(-c1417o6.m3154a(writableDatabase));
            }
        } catch (Throwable unused) {
        }
        c1417o6.f5154b.unlock();
        this.f5926a.f6702q.f7061c.set(true);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskRemoved() {
        this.f5926a.f6702q.f7061c.set(true);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onUnsuccessfulTaskFinished() {
    }

    public C1750bh(C2013m5 c2013m5, C1227Gg c1227Gg, C2194tb c2194tb, FullUrlFormer fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, C1417O6 c1417o6, C2123qf c2123qf, C1409Nn c1409Nn, RequestBodyEncrypter requestBodyEncrypter) {
        this(c2013m5, c2123qf, c1417o6, c1227Gg, c1409Nn, c2194tb, new C1064A3(1024000, "event value in ReportTask", c2123qf), AbstractC2059o1.m4252a(), fullUrlFormer, requestDataHolder, responseDataHolder, requestBodyEncrypter);
    }

    public C1750bh(C2013m5 c2013m5, C2123qf c2123qf, C1417O6 c1417o6, C1227Gg c1227Gg, C1409Nn c1409Nn, C2194tb c2194tb, C1064A3 c1064a3, C2202tj c2202tj, FullUrlFormer fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, RequestBodyEncrypter requestBodyEncrypter) {
        this.f5927b = new LinkedHashMap();
        this.f5932g = 0;
        this.f5933h = -1;
        this.f5944s = new SendingDataTaskHelper(requestBodyEncrypter, new GZIPCompressor(), requestDataHolder, responseDataHolder, new DefaultNetworkResponseHandler());
        this.f5939n = c1227Gg;
        this.f5926a = c2013m5;
        this.f5930e = c1417o6;
        this.f5936k = c2123qf;
        this.f5935j = c1064a3;
        this.f5937l = c1409Nn;
        this.f5941p = c2194tb;
        this.f5938m = c2202tj;
        this.f5942q = requestDataHolder;
        this.f5943r = responseDataHolder;
        this.f5940o = fullUrlFormer;
    }

    /* renamed from: a */
    public static C1692Z8[] m3664a(JSONObject jSONObject) {
        int length = jSONObject.length();
        if (length <= 0) {
            return null;
        }
        C1692Z8[] c1692z8Arr = new C1692Z8[length];
        Iterator<String> keys = jSONObject.keys();
        int r2 = 0;
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                C1692Z8 c1692z8 = new C1692Z8();
                c1692z8.f5796a = next;
                c1692z8.f5797b = jSONObject.getString(next);
                c1692z8Arr[r2] = c1692z8;
            } catch (Throwable unused) {
            }
            r2++;
        }
        return c1692z8Arr;
    }

    /* renamed from: a */
    public final void m3670a(boolean z2) {
        C1409Nn c1409Nn = this.f5937l;
        int r12 = this.f5945t;
        synchronized (c1409Nn) {
            C1434On c1434On = c1409Nn.f5142a;
            c1434On.m3194a(c1434On.m3193a().put("report_request_id", r12));
        }
        C1892h9[] c1892h9Arr = this.f5929d.f6573a;
        for (int r13 = 0; r13 < c1892h9Arr.length; r13++) {
            try {
                C1892h9 c1892h9 = c1892h9Arr[r13];
                long longValue = ((Long) this.f5931f.get(r13)).longValue();
                EnumC2003lk enumC2003lk = (EnumC2003lk) AbstractC2098pf.f6913b.get(c1892h9.f6401b.f6311c);
                if (enumC2003lk == null) {
                    enumC2003lk = EnumC2003lk.FOREGROUND;
                }
                this.f5930e.m3158a(longValue, enumC2003lk.f6668a, c1892h9.f6402c.length, z2);
            } catch (Throwable unused) {
            }
        }
        C1417O6 c1417o6 = this.f5930e;
        long m3947a = this.f5926a.f6696k.m3947a();
        c1417o6.f5154b.lock();
        try {
            if (AbstractC1191F5.f4728a.booleanValue()) {
                c1417o6.m3164c();
            }
            SQLiteDatabase writableDatabase = c1417o6.f5155c.getWritableDatabase();
            if (writableDatabase != null) {
                writableDatabase.delete("sessions", AbstractC1141D5.f4632c, new String[]{String.valueOf(m3947a)});
            }
        } catch (Throwable unused2) {
        }
        c1417o6.f5154b.unlock();
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00e4 A[LOOP:1: B:57:0x00de->B:59:0x00e4, LOOP_END] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.appmetrica.analytics.impl.C1725ah m3668a(io.appmetrica.analytics.impl.C1501Rg r17) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C1750bh.m3668a(io.appmetrica.analytics.impl.Rg):io.appmetrica.analytics.impl.ah");
    }

    /* renamed from: a */
    public static C1733b0 m3663a(ContentValues contentValues) {
        C1915i7 model = new C1940j7(null, 1, null).toModel(contentValues);
        return new C1733b0((String) WrapUtils.getOrDefault(model.f6473g.f6371g, ""), ((Long) WrapUtils.getOrDefault(model.f6473g.f6372h, 0L)).longValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0066 A[Catch: all -> 0x0095, TryCatch #1 {all -> 0x0095, blocks: (B:12:0x0026, B:13:0x002c, B:15:0x0033, B:26:0x0066, B:28:0x006c, B:68:0x008d, B:31:0x00a1, B:33:0x00b0, B:38:0x00bc, B:39:0x00bb, B:40:0x00b6, B:41:0x00c2, B:44:0x00d4, B:56:0x00db, B:72:0x009a, B:49:0x00e9, B:51:0x00ef, B:55:0x00e4, B:79:0x0060), top: B:11:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e4 A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.appmetrica.analytics.impl.C1700Zg m3667a(long r17, io.appmetrica.analytics.impl.C1867g9 r19, io.appmetrica.analytics.impl.C1501Rg r20, java.util.ArrayList r21, int r22) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C1750bh.m3667a(long, io.appmetrica.analytics.impl.g9, io.appmetrica.analytics.impl.Rg, java.util.ArrayList, int):io.appmetrica.analytics.impl.Zg");
    }

    /* renamed from: a */
    public final Cursor m3665a() {
        Cursor cursor;
        SQLiteDatabase readableDatabase;
        C1417O6 c1417o6 = this.f5930e;
        LinkedHashMap linkedHashMap = this.f5927b;
        c1417o6.f5153a.lock();
        try {
            readableDatabase = c1417o6.f5155c.getReadableDatabase();
        } catch (Throwable unused) {
        }
        if (readableDatabase != null) {
            cursor = readableDatabase.query("sessions", null, C1417O6.m3151a(linkedHashMap), C1417O6.m3153a(new String[]{Long.toString(0L)}, linkedHashMap), null, null, "id ASC", null);
            c1417o6.f5153a.unlock();
            return cursor;
        }
        cursor = null;
        c1417o6.f5153a.unlock();
        return cursor;
    }

    /* renamed from: a */
    public final Cursor m3666a(long j2, EnumC2003lk enumC2003lk) {
        Cursor cursor;
        SQLiteDatabase readableDatabase;
        C1417O6 c1417o6 = this.f5930e;
        c1417o6.f5153a.lock();
        try {
            readableDatabase = c1417o6.f5155c.getReadableDatabase();
        } catch (Throwable unused) {
        }
        if (readableDatabase != null) {
            cursor = readableDatabase.query("events", null, "session_id = ? AND session_type = ?", new String[]{Long.toString(j2), Integer.toString(enumC2003lk.f6668a)}, null, null, "number_in_session ASC", null);
            c1417o6.f5153a.unlock();
            return cursor;
        }
        cursor = null;
        c1417o6.f5153a.unlock();
        return cursor;
    }
}
