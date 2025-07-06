package p022I;

import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* renamed from: I.e */
/* loaded from: classes.dex */
public abstract class AbstractC0196e {

    /* renamed from: a */
    public static final Method f596a;

    static {
        if (Build.VERSION.SDK_INT < 24) {
            try {
                f596a = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
            } catch (Exception e2) {
                throw new IllegalStateException(e2);
            }
        }
    }

    /* renamed from: a */
    public static String m563a(Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return AbstractC0195d.m562c(AbstractC0195d.m560a(AbstractC0195d.m561b(locale)));
        }
        try {
            return AbstractC0194c.m559a((Locale) f596a.invoke(null, locale));
        } catch (IllegalAccessException e2) {
            Log.w("ICUCompat", e2);
            return AbstractC0194c.m559a(locale);
        } catch (InvocationTargetException e3) {
            Log.w("ICUCompat", e3);
            return AbstractC0194c.m559a(locale);
        }
    }
}
