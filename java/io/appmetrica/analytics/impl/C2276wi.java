package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import java.util.LinkedHashMap;
import java.util.regex.Pattern;

/* renamed from: io.appmetrica.analytics.impl.wi */
/* loaded from: classes.dex */
public final class C2276wi implements InterfaceC2301xi {

    /* renamed from: a */
    public final Context f7376a;

    /* renamed from: b */
    public final String f7377b = "content://" + m4582a() + "/clids";

    /* renamed from: c */
    public final String f7378c = "clid_key";

    /* renamed from: d */
    public final String f7379d = "clid_value";

    public C2276wi(Context context) {
        this.f7376a = context;
    }

    /* renamed from: a */
    public final String m4582a() {
        return "com.yandex.preinstallsatellite.appmetrica.provider";
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2301xi, p131u1.InterfaceC2799a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C1513S3 invoke() {
        Cursor cursor;
        if (!PackageManagerUtils.hasContentProvider(this.f7376a, "com.yandex.preinstallsatellite.appmetrica.provider")) {
            Pattern pattern = AbstractC1329Ki.f4968a;
            Log.i("AppMetrica-Attribution", "Satellite content provider with clids was not found.");
            return null;
        }
        try {
            cursor = this.f7376a.getContentResolver().query(Uri.parse(this.f7377b), null, null, null, null);
            try {
            } catch (Throwable th) {
                th = th;
                try {
                    Pattern pattern2 = AbstractC1329Ki.f4968a;
                    Log.e("AppMetrica-Attribution", "Error while getting satellite clids", th);
                    return null;
                } finally {
                    AbstractC2356zn.m4698a(cursor);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
        }
        if (cursor == null) {
            Pattern pattern3 = AbstractC1329Ki.f4968a;
            Log.i("AppMetrica-Attribution", "No Satellite content provider found");
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (cursor.moveToNext()) {
            try {
                String string = cursor.getString(cursor.getColumnIndexOrThrow(this.f7378c));
                String string2 = cursor.getString(cursor.getColumnIndexOrThrow(this.f7379d));
                if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
                    Pattern pattern4 = AbstractC1329Ki.f4968a;
                    Log.i("AppMetrica-Attribution", "Invalid clid {" + string + " : " + string2 + "}");
                } else {
                    linkedHashMap.put(string, string2);
                }
            } catch (Throwable unused) {
            }
        }
        Pattern pattern5 = AbstractC1329Ki.f4968a;
        Log.i("AppMetrica-Attribution", String.format("Clids from satellite: %s", linkedHashMap));
        return new C1513S3(linkedHashMap, EnumC1517S7.f5406d);
    }
}
