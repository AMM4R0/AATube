package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;

/* renamed from: io.appmetrica.analytics.impl.mn */
/* loaded from: classes.dex */
public final class C2031mn {
    /* renamed from: a */
    public static boolean m4229a(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return ((Boolean) SystemServiceUtils.accessSystemServiceSafelyOrDefault((UserManager) context.getSystemService(UserManager.class), "detect unlocked user state", "User manager", Boolean.TRUE, new C2006ln())).booleanValue();
        }
        return true;
    }
}
