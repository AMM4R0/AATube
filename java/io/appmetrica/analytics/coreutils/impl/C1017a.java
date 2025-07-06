package io.appmetrica.analytics.coreutils.impl;

import io.appmetrica.analytics.coreutils.internal.system.RootChecker;
import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.coreutils.impl.a */
/* loaded from: classes.dex */
public final class C1017a extends ArrayList {
    public C1017a() {
        if (RootChecker.isSuperuserApkExists()) {
            add("Superuser.apk");
        }
        if (RootChecker.isSuperuserNativeLibExists()) {
            add("su.so");
        }
    }
}
