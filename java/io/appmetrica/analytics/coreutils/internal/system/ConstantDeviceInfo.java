package io.appmetrica.analytics.coreutils.internal.system;

import android.os.Build;
import io.appmetrica.analytics.coreutils.impl.C1017a;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class ConstantDeviceInfo {
    public static final String APP_PLATFORM = "android";

    /* renamed from: a */
    private static final Object f4367a = new Object();

    /* renamed from: b */
    private static volatile ConstantDeviceInfo f4368b;
    public final String appPlatform = APP_PLATFORM;
    public final String manufacturer = Build.MANUFACTURER;
    public final String model = Build.MODEL;
    public final String osVersion = Build.VERSION.RELEASE;
    public final int osApiLevel = Build.VERSION.SDK_INT;
    public final String deviceRootStatus = String.valueOf(RootChecker.isRootedPhone());
    public final List<String> deviceRootStatusMarkers = Collections.unmodifiableList(new C1017a());

    public static ConstantDeviceInfo getInstance() {
        if (f4368b == null) {
            synchronized (f4367a) {
                try {
                    if (f4368b == null) {
                        f4368b = new ConstantDeviceInfo();
                    }
                } finally {
                }
            }
        }
        return f4368b;
    }
}
