package io.appmetrica.analytics.coreutils.internal.p097io;

import android.annotation.TargetApi;
import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline;
import java.io.File;

@DoNotInline
@TargetApi(24)
/* loaded from: classes.dex */
public final class AppDataDirProviderForN {
    public static final AppDataDirProviderForN INSTANCE = new AppDataDirProviderForN();

    private AppDataDirProviderForN() {
    }

    public final File dataDir(Context context) {
        File dataDir;
        dataDir = context.getDataDir();
        return dataDir;
    }
}
