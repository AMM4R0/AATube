package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.text.TextUtils;
import android.util.Log;
import io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.He */
/* loaded from: classes.dex */
public final class C1250He implements InterfaceC1241H5 {
    @Override // io.appmetrica.analytics.impl.InterfaceC1241H5, p131u1.InterfaceC2810l
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1499Re invoke(ContentValues contentValues) {
        String asString = contentValues.getAsString("tracking_id");
        if (TextUtils.isEmpty(asString)) {
            Pattern pattern = AbstractC1329Ki.f4968a;
            Log.w("AppMetrica-Attribution", "Tracking id is empty");
            return null;
        }
        if (ParseUtils.parseLong(asString) == null) {
            Pattern pattern2 = AbstractC1329Ki.f4968a;
            Log.w("AppMetrica-Attribution", "Tracking id from preload info content provider is not a number");
            return null;
        }
        try {
            String asString2 = contentValues.getAsString("additional_params");
            if (TextUtils.isEmpty(asString2)) {
                Pattern pattern3 = AbstractC1329Ki.f4968a;
                Log.w("AppMetrica-Attribution", "No additional params");
                return null;
            }
            JSONObject jSONObject = new JSONObject(asString2);
            if (jSONObject.length() == 0) {
                Pattern pattern4 = AbstractC1329Ki.f4968a;
                Log.w("AppMetrica-Attribution", "Additional params are empty");
                return null;
            }
            Pattern pattern5 = AbstractC1329Ki.f4968a;
            Log.i("AppMetrica-Attribution", String.format("Successfully parsed preload info. Tracking id = %s, additionalParams = %s", asString, jSONObject));
            return new C1499Re(asString, jSONObject, true, false, EnumC1517S7.f5407e);
        } catch (Throwable th) {
            Pattern pattern6 = AbstractC1329Ki.f4968a;
            Log.e("AppMetrica-Attribution", "Could not parse additional parameters", th);
            return null;
        }
    }
}
