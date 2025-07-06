package io.appmetrica.analytics.impl;

import java.util.UUID;

/* renamed from: io.appmetrica.analytics.impl.Dn */
/* loaded from: classes.dex */
public final class C1159Dn {
    /* renamed from: a */
    public static boolean m2846a(String str) {
        UUID r3;
        if (str == null || str.length() != 32) {
            return false;
        }
        try {
            r3 = UUID.fromString(m2847b(str));
        } catch (Throwable unused) {
            r3 = null;
        }
        return r3 != null;
    }

    /* renamed from: b */
    public static String m2847b(String str) {
        return str.substring(0, 8) + "-" + str.substring(8, 12) + "-" + str.substring(12, 16) + "-" + str.substring(16, 20) + "-" + str.substring(20, 32);
    }
}
