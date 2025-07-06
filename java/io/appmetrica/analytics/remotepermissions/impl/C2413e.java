package io.appmetrica.analytics.remotepermissions.impl;

import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import java.util.Set;
import p108m1.C2670t;

/* renamed from: io.appmetrica.analytics.remotepermissions.impl.e */
/* loaded from: classes.dex */
public final class C2413e implements PermissionStrategy {

    /* renamed from: a */
    public Set f7809a = C2670t.f8609a;

    /* renamed from: a */
    public final synchronized void m4769a(Set<String> set) {
        this.f7809a = set;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy
    public final synchronized boolean forbidUsePermission(String str) {
        return !this.f7809a.contains(str);
    }
}
