package p079e;

import android.app.LocaleManager;
import android.os.LocaleList;

/* renamed from: e.j */
/* loaded from: classes.dex */
public abstract class AbstractC0801j {
    /* renamed from: a */
    public static LocaleList m2213a(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }

    /* renamed from: b */
    public static void m2214b(Object obj, LocaleList localeList) {
        ((LocaleManager) obj).setApplicationLocales(localeList);
    }
}
