package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import kotlin.jvm.internal.AbstractC2493j;
import p105l1.C2636g;
import p131u1.InterfaceC2810l;

/* renamed from: io.appmetrica.analytics.impl.Hb */
/* loaded from: classes.dex */
public final class C1247Hb extends AbstractC2493j implements InterfaceC2810l {

    /* renamed from: a */
    public static final C1247Hb f4822a = new C1247Hb();

    public C1247Hb() {
        super(1);
    }

    @Override // p131u1.InterfaceC2810l
    public final Object invoke(Object obj) {
        ((LocationControllerObserver) obj).stopLocationTracking();
        return C2636g.f8557a;
    }
}
