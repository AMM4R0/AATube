package p008C1;

import java.io.IOException;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC2492i;
import p002A1.AbstractC0025r;

/* renamed from: C1.b */
/* loaded from: classes.dex */
public final class C0070b {

    /* renamed from: a */
    public static final C0070b f150a = new C0070b();

    /* renamed from: b */
    public static final C0070b f151b = new C0070b();

    /* renamed from: c */
    public static final C0070b f152c = new C0070b();

    /* renamed from: d */
    public static final C0070b f153d = new C0070b();

    /* renamed from: a */
    public static final C0075g m252a(C0070b c0070b, String str) {
        C0075g c0075g = new C0075g(str);
        C0075g.f177d.put(str, c0075g);
        return c0075g;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* renamed from: c */
    public static EnumC0068C m253c(String javaName) {
        AbstractC2492i.m4915e(javaName, "javaName");
        int hashCode = javaName.hashCode();
        if (hashCode != 79201641) {
            if (hashCode != 79923350) {
                switch (hashCode) {
                    case -503070503:
                        if (javaName.equals("TLSv1.1")) {
                            return EnumC0068C.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (javaName.equals("TLSv1.2")) {
                            return EnumC0068C.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (javaName.equals("TLSv1.3")) {
                            return EnumC0068C.TLS_1_3;
                        }
                        break;
                }
            } else if (javaName.equals("TLSv1")) {
                return EnumC0068C.TLS_1_0;
            }
        } else if (javaName.equals("SSLv3")) {
            return EnumC0068C.SSL_3_0;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(javaName));
    }

    /* renamed from: d */
    public static EnumC0089u m254d(String str) {
        EnumC0089u enumC0089u = EnumC0089u.HTTP_1_0;
        if (!str.equals("http/1.0")) {
            enumC0089u = EnumC0089u.HTTP_1_1;
            if (!str.equals("http/1.1")) {
                enumC0089u = EnumC0089u.H2_PRIOR_KNOWLEDGE;
                if (!str.equals("h2_prior_knowledge")) {
                    enumC0089u = EnumC0089u.HTTP_2;
                    if (!str.equals("h2")) {
                        enumC0089u = EnumC0089u.SPDY_3;
                        if (!str.equals("spdy/3.1")) {
                            enumC0089u = EnumC0089u.QUIC;
                            if (!str.equals("quic")) {
                                enumC0089u = EnumC0089u.HTTP_3;
                                if (!AbstractC0025r.m156I(str, "h3", false)) {
                                    throw new IOException("Unexpected protocol: ".concat(str));
                                }
                            }
                        }
                    }
                }
            }
        }
        return enumC0089u;
    }

    /* renamed from: b */
    public synchronized C0075g m255b(String javaName) {
        C0075g c0075g;
        String str;
        try {
            AbstractC2492i.m4915e(javaName, "javaName");
            LinkedHashMap linkedHashMap = C0075g.f177d;
            c0075g = (C0075g) linkedHashMap.get(javaName);
            if (c0075g == null) {
                if (AbstractC0025r.m156I(javaName, "TLS_", false)) {
                    String substring = javaName.substring(4);
                    AbstractC2492i.m4914d(substring, "substring(...)");
                    str = "SSL_".concat(substring);
                } else if (AbstractC0025r.m156I(javaName, "SSL_", false)) {
                    String substring2 = javaName.substring(4);
                    AbstractC2492i.m4914d(substring2, "substring(...)");
                    str = "TLS_".concat(substring2);
                } else {
                    str = javaName;
                }
                c0075g = (C0075g) linkedHashMap.get(str);
                if (c0075g == null) {
                    c0075g = new C0075g(javaName);
                }
                linkedHashMap.put(javaName, c0075g);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c0075g;
    }
}
