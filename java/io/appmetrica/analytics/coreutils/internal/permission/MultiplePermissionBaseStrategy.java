package io.appmetrica.analytics.coreutils.internal.permission;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import java.util.List;

/* loaded from: classes.dex */
public abstract class MultiplePermissionBaseStrategy implements PermissionResolutionStrategy {

    /* renamed from: a */
    private final PermissionExtractor f4328a;

    /* renamed from: b */
    private final List f4329b;

    public MultiplePermissionBaseStrategy(PermissionExtractor permissionExtractor, List<String> list) {
        this.f4328a = permissionExtractor;
        this.f4329b = list;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy
    public boolean hasNecessaryPermissions(Context context) {
        return this.f4329b.isEmpty() || hasNecessaryPermissions(context, this.f4328a, this.f4329b);
    }

    public abstract boolean hasNecessaryPermissions(Context context, PermissionExtractor permissionExtractor, List<String> list);
}
