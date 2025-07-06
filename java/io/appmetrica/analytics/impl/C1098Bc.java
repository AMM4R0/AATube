package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.cache.CachedDataProvider;
import io.appmetrica.analytics.coreutils.internal.permission.AlwaysAllowPermissionStrategy;
import io.appmetrica.analytics.coreutils.internal.permission.SinglePermissionStrategy;
import io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.Bc */
/* loaded from: classes.dex */
public final class C1098Bc implements InterfaceC1258Hm {

    /* renamed from: a */
    public final Context f4525a;

    /* renamed from: b */
    public final PermissionResolutionStrategy f4526b;

    /* renamed from: c */
    public final CellularNetworkTypeExtractor f4527c;

    /* renamed from: d */
    public final CachedDataProvider.CachedData f4528d;

    public C1098Bc(Context context) {
        this.f4525a = context;
        this.f4526b = AndroidUtils.isApiAchieved(29) ? new SinglePermissionStrategy(C2018ma.m4192h().m4201g(), "android.permission.READ_PHONE_STATE") : new AlwaysAllowPermissionStrategy();
        this.f4527c = new CellularNetworkTypeExtractor(context);
        long millis = TimeUnit.SECONDS.toMillis(20L);
        this.f4528d = new CachedDataProvider.CachedData(millis, millis * 2, "mobile-connection");
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1258Hm
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized C1073Ac mo2767a() {
        C1073Ac c1073Ac;
        try {
            c1073Ac = (C1073Ac) this.f4528d.getData();
            if (c1073Ac != null) {
                if (this.f4528d.shouldUpdateData()) {
                }
            }
            c1073Ac = new C1073Ac(this.f4526b.hasNecessaryPermissions(this.f4525a) ? this.f4527c.getNetworkType() : CellularNetworkTypeExtractor.UNKNOWN_NETWORK_TYPE_VALUE);
            this.f4528d.setData(c1073Ac);
        } catch (Throwable th) {
            throw th;
        }
        return c1073Ac;
    }
}
