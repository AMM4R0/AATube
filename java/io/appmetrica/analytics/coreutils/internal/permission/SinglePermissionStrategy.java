package io.appmetrica.analytics.coreutils.internal.permission;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;

/* loaded from: classes.dex */
public final class SinglePermissionStrategy implements PermissionResolutionStrategy {

    /* renamed from: a */
    private final PermissionExtractor f4330a;

    /* renamed from: b */
    private final String f4331b;

    public SinglePermissionStrategy(PermissionExtractor permissionExtractor, String str) {
        this.f4330a = permissionExtractor;
        this.f4331b = str;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy
    public boolean hasNecessaryPermissions(Context context) {
        return this.f4330a.hasPermission(context, this.f4331b);
    }
}
