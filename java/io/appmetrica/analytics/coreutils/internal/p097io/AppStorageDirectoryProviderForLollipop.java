package io.appmetrica.analytics.coreutils.internal.p097io;

import android.annotation.TargetApi;
import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline;
import io.appmetrica.analytics.impl.C1842f9;
import java.io.File;

@DoNotInline
@TargetApi(C1842f9.f6210G)
/* loaded from: classes.dex */
public final class AppStorageDirectoryProviderForLollipop {
    public static final AppStorageDirectoryProviderForLollipop INSTANCE = new AppStorageDirectoryProviderForLollipop();

    private AppStorageDirectoryProviderForLollipop() {
    }

    public final File getAppStorageDirectory(Context context) {
        return context.getNoBackupFilesDir();
    }
}
