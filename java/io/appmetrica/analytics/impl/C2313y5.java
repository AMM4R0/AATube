package io.appmetrica.analytics.impl;

import android.content.Context;
import android.net.ConnectivityManager;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;

/* renamed from: io.appmetrica.analytics.impl.y5 */
/* loaded from: classes.dex */
public final class C2313y5 {
    /* renamed from: a */
    public final EnumC1847fe m4646a(Context context) {
        SafePackageManager safePackageManager = AbstractC1872ge.f6323a;
        return (EnumC1847fe) SystemServiceUtils.accessSystemServiceSafelyOrDefault((ConnectivityManager) context.getSystemService("connectivity"), "getting connection type", "ConnectivityManager", EnumC1847fe.UNDEFINED, new C1822ee());
    }
}
