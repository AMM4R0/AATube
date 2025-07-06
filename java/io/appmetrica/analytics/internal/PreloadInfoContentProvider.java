package io.appmetrica.analytics.internal;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import io.appmetrica.analytics.impl.AbstractC1291J5;
import io.appmetrica.analytics.impl.AbstractC1329Ki;
import io.appmetrica.analytics.impl.C1250He;
import io.appmetrica.analytics.impl.C1275Ie;
import io.appmetrica.analytics.impl.C1316K5;
import io.appmetrica.analytics.impl.C1464Q3;
import io.appmetrica.analytics.impl.C1488R3;
import io.appmetrica.analytics.impl.C1793da;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Pattern;
import p000A.AbstractC0002c;

/* loaded from: classes.dex */
public class PreloadInfoContentProvider extends ContentProvider {

    /* renamed from: a */
    private boolean f7575a = false;

    /* renamed from: b */
    private final UriMatcher f7576b = new UriMatcher(-1);

    /* renamed from: a */
    private void m4721a(C1316K5 c1316k5, ContentValues contentValues) {
        Context context = getContext();
        Context applicationContext = context == null ? null : context.getApplicationContext();
        if (applicationContext != null) {
            try {
                Object invoke = c1316k5.f4944a.invoke(contentValues);
                if (invoke != null) {
                    c1316k5.f4946c.m3743b(applicationContext);
                    if (((Boolean) c1316k5.f4945b.invoke(invoke)).booleanValue()) {
                        Pattern pattern = AbstractC1329Ki.f4968a;
                        Log.i("AppMetrica-Attribution", String.format("Successfully saved " + c1316k5.f4947d, new Object[0]));
                    } else {
                        Pattern pattern2 = AbstractC1329Ki.f4968a;
                        Log.w("AppMetrica-Attribution", String.format("Did not save " + c1316k5.f4947d + " because data is already present", new Object[0]));
                    }
                }
            } catch (Throwable th) {
                Pattern pattern3 = AbstractC1329Ki.f4968a;
                Log.e("AppMetrica-Attribution", "Unexpected error occurred", th);
            }
        }
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        Pattern pattern = AbstractC1329Ki.f4968a;
        Log.w("AppMetrica-Attribution", "Deleting is not supported");
        return -1;
    }

    public synchronized void disable() {
        this.f7575a = true;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        synchronized (this) {
            try {
                if (this.f7575a) {
                    return null;
                }
                if (contentValues != null) {
                    int match = this.f7576b.match(uri);
                    if (match == 1) {
                        m4721a(new C1316K5(new C1250He(), new C1275Ie(), C1793da.f6086d, "preload info"), contentValues);
                    } else if (match != 2) {
                        Pattern pattern = AbstractC1329Ki.f4968a;
                        Log.w("AppMetrica-Attribution", "Bad content provider uri.");
                    } else {
                        m4721a(new C1316K5(new C1464Q3(), new C1488R3(), C1793da.f6086d, "clids"), contentValues);
                    }
                }
                CountDownLatch countDownLatch = AbstractC1291J5.f4899a;
                if (countDownLatch != null) {
                    countDownLatch.countDown();
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        Context context = getContext();
        Context applicationContext = context == null ? null : context.getApplicationContext();
        String m15j = AbstractC0002c.m15j(applicationContext != null ? applicationContext.getPackageName() : "", ".appmetrica.preloadinfo.retail");
        this.f7576b.addURI(m15j, "preloadinfo", 1);
        this.f7576b.addURI(m15j, "clids", 2);
        AbstractC1291J5.f4899a = new CountDownLatch(1);
        AbstractC1291J5.f4900b = this;
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Pattern pattern = AbstractC1329Ki.f4968a;
        Log.w("AppMetrica-Attribution", "Query is not supported");
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        Pattern pattern = AbstractC1329Ki.f4968a;
        Log.w("AppMetrica-Attribution", "Updating is not supported");
        return -1;
    }
}
