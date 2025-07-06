package p017G;

import android.os.Build;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Locale;

/* renamed from: G.h */
/* loaded from: classes.dex */
public final class C0144h {

    /* renamed from: b */
    public static final C0144h f410b = m448a(new Locale[0]);

    /* renamed from: a */
    public final InterfaceC0146j f411a;

    public C0144h(InterfaceC0146j interfaceC0146j) {
        this.f411a = interfaceC0146j;
    }

    /* renamed from: a */
    public static C0144h m448a(Locale... localeArr) {
        return Build.VERSION.SDK_INT >= 24 ? new C0144h(new C0148l(AbstractC0143g.m445a(localeArr))) : new C0144h(new C0145i(localeArr));
    }

    /* renamed from: b */
    public static C0144h m449b(String str) {
        if (str == null || str.isEmpty()) {
            return f410b;
        }
        String[] split = str.split(StringUtils.COMMA, -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int r2 = 0; r2 < length; r2++) {
            localeArr[r2] = AbstractC0142f.m443a(split[r2]);
        }
        return m448a(localeArr);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0144h) {
            if (this.f411a.equals(((C0144h) obj).f411a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f411a.hashCode();
    }

    public final String toString() {
        return this.f411a.toString();
    }
}
