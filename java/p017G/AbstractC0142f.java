package p017G;

import java.util.Locale;
import p022I.AbstractC0196e;

/* renamed from: G.f */
/* loaded from: classes.dex */
public abstract class AbstractC0142f {

    /* renamed from: a */
    public static final Locale[] f409a = {new Locale("en", "XA"), new Locale("ar", "XB")};

    /* renamed from: a */
    public static Locale m443a(String str) {
        return Locale.forLanguageTag(str);
    }

    /* renamed from: b */
    public static boolean m444b(Locale locale, Locale locale2) {
        if (locale.equals(locale2)) {
            return true;
        }
        if (!locale.getLanguage().equals(locale2.getLanguage())) {
            return false;
        }
        Locale[] localeArr = f409a;
        int length = localeArr.length;
        int r4 = 0;
        while (true) {
            if (r4 >= length) {
                for (Locale locale3 : localeArr) {
                    if (!locale3.equals(locale2)) {
                    }
                }
                String m563a = AbstractC0196e.m563a(locale);
                if (!m563a.isEmpty()) {
                    return m563a.equals(AbstractC0196e.m563a(locale2));
                }
                String country = locale.getCountry();
                return country.isEmpty() || country.equals(locale2.getCountry());
            }
            if (localeArr[r4].equals(locale)) {
                break;
            }
            r4++;
        }
        return false;
    }
}
