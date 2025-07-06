package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import p000A.AbstractC0002c;

/* renamed from: io.appmetrica.analytics.impl.Q3 */
/* loaded from: classes.dex */
public final class C1464Q3 implements InterfaceC1241H5 {
    @Override // io.appmetrica.analytics.impl.InterfaceC1241H5, p131u1.InterfaceC2810l
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, String> invoke(ContentValues contentValues) {
        String asString = contentValues.getAsString("clids");
        HashMap m3756c = AbstractC1794db.m3756c(asString);
        if (AbstractC1730am.m3630a(m3756c)) {
            return m3756c;
        }
        Pattern pattern = AbstractC1329Ki.f4968a;
        Log.w("AppMetrica-Attribution", String.format(AbstractC0002c.m16k("Passed clids (", asString, ") are invalid."), new Object[0]));
        return null;
    }
}
