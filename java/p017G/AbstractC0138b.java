package p017G;

import android.os.Build;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC2492i;

/* renamed from: G.b */
/* loaded from: classes.dex */
public abstract class AbstractC0138b {
    static {
        int r02 = Build.VERSION.SDK_INT;
        C0137a c0137a = C0137a.f405a;
        if (r02 >= 30) {
            c0137a.m438a(30);
        }
        if (r02 >= 30) {
            c0137a.m438a(31);
        }
        if (r02 >= 30) {
            c0137a.m438a(33);
        }
        if (r02 >= 30) {
            c0137a.m438a(1000000);
        }
    }

    /* renamed from: a */
    public static final boolean m439a() {
        int r02 = Build.VERSION.SDK_INT;
        if (r02 < 33) {
            if (r02 >= 32) {
                String CODENAME = Build.VERSION.CODENAME;
                AbstractC2492i.m4914d(CODENAME, "CODENAME");
                if (!"REL".equals(CODENAME)) {
                    Locale locale = Locale.ROOT;
                    String upperCase = CODENAME.toUpperCase(locale);
                    AbstractC2492i.m4914d(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    String upperCase2 = "Tiramisu".toUpperCase(locale);
                    AbstractC2492i.m4914d(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    if (upperCase.compareTo(upperCase2) >= 0) {
                    }
                }
            }
            return false;
        }
        return true;
    }
}
