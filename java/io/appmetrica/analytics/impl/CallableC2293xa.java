package io.appmetrica.analytics.impl;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.util.concurrent.Callable;

/* renamed from: io.appmetrica.analytics.impl.xa */
/* loaded from: classes.dex */
public final class CallableC2293xa implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C2318ya f7426a;

    public CallableC2293xa(C2318ya c2318ya) {
        this.f7426a = c2318ya;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Uri parse = Uri.parse("content://com.huawei.appmarket.commondata/item/5");
        ContentResolver contentResolver = this.f7426a.f7493a.getContentResolver();
        C2318ya c2318ya = this.f7426a;
        c2318ya.f7494b = contentResolver.query(parse, null, null, new String[]{c2318ya.f7493a.getPackageName()}, null);
        Cursor cursor = this.f7426a.f7494b;
        if (cursor != null && cursor.moveToFirst()) {
            String string = this.f7426a.f7494b.getString(0);
            if (!TextUtils.isEmpty(string)) {
                return new C1500Rf(string, this.f7426a.f7494b.getLong(1), this.f7426a.f7494b.getLong(2), EnumC1476Qf.f5258d);
            }
        }
        return null;
    }
}
