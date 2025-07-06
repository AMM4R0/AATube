package io.appmetrica.analytics.coreutils.internal.system;

import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import java.io.File;

/* loaded from: classes.dex */
public final class RootChecker {

    /* renamed from: a */
    private static final String[] f4369a = {"/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/"};

    public static final class RootStatus {
        public static final int NOT_ROOT = 0;
        public static final int ROOT = 1;
    }

    public static int isRootedPhone() {
        return (isSuperuserApkExists() || isSuperuserNativeLibExists()) ? 1 : 0;
    }

    public static boolean isSuperuserApkExists() {
        try {
            return (AndroidUtils.isApiAchieved(21) ? new File("/system/app/Superuser/Superuser.apk") : new File("/system/app/Superuser.apk")).exists();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean isSuperuserNativeLibExists() {
        String[] strArr = f4369a;
        for (int r2 = 0; r2 < 8; r2++) {
            String str = strArr[r2];
            try {
                if (AndroidUtils.isApiAchieved(31)) {
                    continue;
                } else {
                    if (new File(str + "su").exists()) {
                        return true;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }
}
