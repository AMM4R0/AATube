package p022I;

import android.icu.util.ULocale;
import java.util.Locale;

/* renamed from: I.d */
/* loaded from: classes.dex */
public abstract class AbstractC0195d {
    /* renamed from: a */
    public static ULocale m560a(Object obj) {
        return ULocale.addLikelySubtags((ULocale) obj);
    }

    /* renamed from: b */
    public static ULocale m561b(Locale locale) {
        return ULocale.forLocale(locale);
    }

    /* renamed from: c */
    public static String m562c(Object obj) {
        return ((ULocale) obj).getScript();
    }
}
