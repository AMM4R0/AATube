package p079e;

import android.content.res.Configuration;
import android.os.LocaleList;
import p017G.C0144h;

/* renamed from: e.q */
/* loaded from: classes.dex */
public abstract class AbstractC0808q {
    /* renamed from: a */
    public static void m2231a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales;
        LocaleList locales2;
        boolean equals;
        locales = configuration.getLocales();
        locales2 = configuration2.getLocales();
        equals = locales.equals(locales2);
        if (equals) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    /* renamed from: b */
    public static C0144h m2232b(Configuration configuration) {
        LocaleList locales;
        String languageTags;
        locales = configuration.getLocales();
        languageTags = locales.toLanguageTags();
        return C0144h.m449b(languageTags);
    }

    /* renamed from: c */
    public static void m2233c(C0144h c0144h) {
        LocaleList forLanguageTags;
        forLanguageTags = LocaleList.forLanguageTags(c0144h.f411a.mo451b());
        LocaleList.setDefault(forLanguageTags);
    }

    /* renamed from: d */
    public static void m2234d(Configuration configuration, C0144h c0144h) {
        LocaleList forLanguageTags;
        forLanguageTags = LocaleList.forLanguageTags(c0144h.f411a.mo451b());
        configuration.setLocales(forLanguageTags);
    }
}
