package io.appmetrica.analytics.impl;

import android.content.res.Configuration;
import android.os.LocaleList;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: io.appmetrica.analytics.impl.Ab */
/* loaded from: classes.dex */
public abstract class AbstractC1072Ab {
    /* renamed from: a */
    public static final ArrayList m2705a(Configuration configuration) {
        LocaleList locales;
        int size;
        Locale locale;
        ArrayList arrayList = new ArrayList();
        locales = configuration.getLocales();
        if (locales == null) {
            return arrayList;
        }
        size = locales.size();
        for (int r2 = 0; r2 < size; r2++) {
            locale = locales.get(r2);
            if (locale != null) {
                arrayList.add(AbstractC1872ge.m3893a(locale));
            }
        }
        return arrayList;
    }
}
