package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import kotlin.jvm.internal.AbstractC2493j;
import p105l1.C2636g;
import p131u1.InterfaceC2810l;

/* renamed from: io.appmetrica.analytics.impl.Gb */
/* loaded from: classes.dex */
public final class C1222Gb extends AbstractC2493j implements InterfaceC2810l {

    /* renamed from: a */
    public static final C1222Gb f4780a = new C1222Gb();

    public C1222Gb() {
        super(1);
    }

    @Override // p131u1.InterfaceC2810l
    public final Object invoke(Object obj) {
        ((LocationControllerObserver) obj).startLocationTracking();
        return C2636g.f8557a;
    }
}
