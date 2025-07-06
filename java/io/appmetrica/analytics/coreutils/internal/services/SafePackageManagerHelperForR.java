package io.appmetrica.analytics.coreutils.internal.services;

import android.annotation.TargetApi;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageManager;
import io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline;

@DoNotInline
@TargetApi(30)
/* loaded from: classes.dex */
public final class SafePackageManagerHelperForR {
    public static final SafePackageManagerHelperForR INSTANCE = new SafePackageManagerHelperForR();

    private SafePackageManagerHelperForR() {
    }

    public static final String extractPackageInstaller(PackageManager packageManager, String str) {
        InstallSourceInfo installSourceInfo;
        String installingPackageName;
        installSourceInfo = packageManager.getInstallSourceInfo(str);
        installingPackageName = installSourceInfo.getInstallingPackageName();
        return installingPackageName;
    }
}
