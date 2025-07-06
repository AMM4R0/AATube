package io.appmetrica.analytics.location.impl;

import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.permission.SinglePermissionStrategy;

/* renamed from: io.appmetrica.analytics.location.impl.f */
/* loaded from: classes.dex */
public final class C2366f implements InterfaceC2381u {
    @Override // io.appmetrica.analytics.location.impl.InterfaceC2381u
    /* renamed from: a */
    public final PermissionResolutionStrategy mo4722a(PermissionExtractor permissionExtractor) {
        return new SinglePermissionStrategy(permissionExtractor, "android.permission.ACCESS_COARSE_LOCATION");
    }
}
