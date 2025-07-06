package io.appmetrica.analytics.coreutils.internal.services;

import android.annotation.TargetApi;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline;

@DoNotInline
@TargetApi(33)
/* loaded from: classes.dex */
public final class PackageManagerUtilsTiramisu {
    public static final PackageManagerUtilsTiramisu INSTANCE = new PackageManagerUtilsTiramisu();

    /* renamed from: a */
    private static final String f4345a = "[PackageManagerUtilsTiramisu]";

    private PackageManagerUtilsTiramisu() {
    }

    public final ProviderInfo resolveContentProvider(PackageManager packageManager, String str) {
        PackageManager.ComponentInfoFlags of;
        ProviderInfo resolveContentProvider;
        try {
            of = PackageManager.ComponentInfoFlags.of(8L);
            resolveContentProvider = packageManager.resolveContentProvider(str, of);
            return resolveContentProvider;
        } catch (Throwable unused) {
            return null;
        }
    }
}
