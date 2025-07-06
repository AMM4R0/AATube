package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.Ke */
/* loaded from: classes.dex */
public final class C1325Ke implements InterfaceC2301xi {

    /* renamed from: a */
    public final Context f4959a;

    /* renamed from: b */
    public final String f4960b = "content://" + m3022a() + "/preload_info";

    /* renamed from: c */
    public final String f4961c = "tracking_id";

    /* renamed from: d */
    public final String f4962d = "additional_parameters";

    public C1325Ke(Context context) {
        this.f4959a = context;
    }

    /* renamed from: a */
    public final String m3022a() {
        return "com.yandex.preinstallsatellite.appmetrica.provider";
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2301xi, p131u1.InterfaceC2799a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C1499Re invoke() {
        Cursor cursor;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if (!PackageManagerUtils.hasContentProvider(this.f4959a, "com.yandex.preinstallsatellite.appmetrica.provider")) {
            Pattern pattern = AbstractC1329Ki.f4968a;
            Log.i("AppMetrica-Attribution", "Satellite content provider with preload info was not found.");
            return null;
        }
        try {
            cursor = this.f4959a.getContentResolver().query(Uri.parse(this.f4960b), null, null, null, null);
            try {
                if (cursor == null) {
                    Pattern pattern2 = AbstractC1329Ki.f4968a;
                    Log.i("AppMetrica-Attribution", "No Satellite content provider found");
                } else {
                    if (cursor.moveToFirst()) {
                        String string = cursor.getString(cursor.getColumnIndexOrThrow(this.f4961c));
                        String string2 = cursor.getString(cursor.getColumnIndexOrThrow(this.f4962d));
                        if (string2 != null) {
                            try {
                            } catch (Throwable unused) {
                                jSONObject = new JSONObject();
                            }
                            if (string2.length() != 0) {
                                jSONObject2 = new JSONObject(string2);
                                if (!TextUtils.isEmpty(string) && ParseUtils.parseLong(string) == null) {
                                    Pattern pattern3 = AbstractC1329Ki.f4968a;
                                    Log.w("AppMetrica-Attribution", "Tracking id from Satellite is not a number.");
                                }
                                Pattern pattern4 = AbstractC1329Ki.f4968a;
                                Log.i("AppMetrica-Attribution", String.format("Preload info from Satellite: {tracking id = %s, additional parameters = %s}", string, jSONObject2));
                                C1499Re c1499Re = new C1499Re(string, jSONObject2, !TextUtils.isEmpty(string), false, EnumC1517S7.f5406d);
                                AbstractC2356zn.m4698a(cursor);
                                return c1499Re;
                            }
                        }
                        jSONObject = new JSONObject();
                        jSONObject2 = jSONObject;
                        if (!TextUtils.isEmpty(string)) {
                            Pattern pattern32 = AbstractC1329Ki.f4968a;
                            Log.w("AppMetrica-Attribution", "Tracking id from Satellite is not a number.");
                        }
                        Pattern pattern42 = AbstractC1329Ki.f4968a;
                        Log.i("AppMetrica-Attribution", String.format("Preload info from Satellite: {tracking id = %s, additional parameters = %s}", string, jSONObject2));
                        C1499Re c1499Re2 = new C1499Re(string, jSONObject2, !TextUtils.isEmpty(string), false, EnumC1517S7.f5406d);
                        AbstractC2356zn.m4698a(cursor);
                        return c1499Re2;
                    }
                    Pattern pattern5 = AbstractC1329Ki.f4968a;
                    Log.i("AppMetrica-Attribution", "No Preload Info data in Satellite content provider");
                }
            } catch (Throwable unused2) {
            }
        } catch (Throwable unused3) {
            cursor = null;
        }
        AbstractC2356zn.m4698a(cursor);
        return null;
    }
}
