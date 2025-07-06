package io.appmetrica.analytics.impl;

import android.content.Context;
import android.net.ConnectivityManager;
import io.appmetrica.analytics.coreapi.internal.p095io.IExecutionPolicy;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.EnumSet;

/* renamed from: io.appmetrica.analytics.impl.x9 */
/* loaded from: classes.dex */
public final class C2292x9 implements IExecutionPolicy {

    /* renamed from: c */
    public static final EnumSet f7423c = EnumSet.of(EnumC1847fe.OFFLINE);

    /* renamed from: a */
    public final C2313y5 f7424a = new C2313y5();

    /* renamed from: b */
    public final Context f7425b;

    public C2292x9(Context context) {
        this.f7425b = context;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.p095io.IExecutionPolicy
    public final boolean canBeExecuted() {
        C2313y5 c2313y5 = this.f7424a;
        Context context = this.f7425b;
        c2313y5.getClass();
        SafePackageManager safePackageManager = AbstractC1872ge.f6323a;
        return !f7423c.contains((EnumC1847fe) SystemServiceUtils.accessSystemServiceSafelyOrDefault((ConnectivityManager) context.getSystemService("connectivity"), "getting connection type", "ConnectivityManager", EnumC1847fe.UNDEFINED, new C1822ee()));
    }
}
