package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer;
import p108m1.AbstractC2665o;

/* renamed from: io.appmetrica.analytics.impl.H7 */
/* loaded from: classes.dex */
public final class C1243H7 implements ServiceComponentsInitializer {
    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer
    public final void onCreate(Context context) {
        C1198Fc c1198Fc = C2018ma.f6725C.f6746s;
        InterfaceC1173Ec[] interfaceC1173EcArr = {new C2338z5("io.appmetrica.analytics.remotepermissions.internal.RemotePermissionsModuleEntryPoint"), new C2247ve(context, "io.appmetrica.analytics.modules.ads", "lsm")};
        synchronized (c1198Fc) {
            AbstractC2665o.m5124b0(c1198Fc.f4733a, interfaceC1173EcArr);
        }
    }
}
