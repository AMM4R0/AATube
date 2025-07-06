package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.t5 */
/* loaded from: classes.dex */
public final class C2188t5 implements PermissionStrategy {

    /* renamed from: a */
    public final PermissionStrategy[] f7146a;

    public C2188t5(PermissionStrategy... permissionStrategyArr) {
        this.f7146a = permissionStrategyArr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy
    public final boolean forbidUsePermission(String str) {
        for (PermissionStrategy permissionStrategy : this.f7146a) {
            if (permissionStrategy.forbidUsePermission(str)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "CompositePermissionStrategy(strategies=" + Arrays.toString(this.f7146a) + ')';
    }
}
