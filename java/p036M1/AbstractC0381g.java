package p036M1;

import org.conscrypt.Conscrypt;

/* renamed from: M1.g */
/* loaded from: classes.dex */
public abstract class AbstractC0381g {
    /* renamed from: a */
    public static boolean m1095a() {
        Conscrypt.Version version = Conscrypt.version();
        if (version == null) {
            return false;
        }
        return version.major() != 2 ? version.major() > 2 : version.minor() != 1 ? version.minor() > 1 : version.patch() >= 0;
    }

    /* renamed from: b */
    public static boolean m1096b() {
        return C0383i.f1032d;
    }
}
