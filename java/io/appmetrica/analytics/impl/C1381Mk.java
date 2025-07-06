package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;

/* renamed from: io.appmetrica.analytics.impl.Mk */
/* loaded from: classes.dex */
public final class C1381Mk implements PermissionExtractor {

    /* renamed from: b */
    public static final String f5083b = "[SimplePermissionExtractor]";

    /* renamed from: a */
    public final PermissionStrategy f5084a;

    public C1381Mk(PermissionStrategy permissionStrategy) {
        this.f5084a = permissionStrategy;
    }

    /* renamed from: a */
    public final PermissionStrategy m3099a() {
        return this.f5084a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor
    public final boolean hasPermission(Context context, String str) {
        if (this.f5084a.forbidUsePermission(str)) {
            return false;
        }
        try {
            return context.checkCallingOrSelfPermission(str) == 0;
        } catch (Throwable unused) {
            return false;
        }
    }
}
