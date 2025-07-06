package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.xk */
/* loaded from: classes.dex */
public final class C2303xk extends ECommerceEvent {

    /* renamed from: a */
    public final C1204Fi f7462a;

    /* renamed from: b */
    public final InterfaceC1766c8 f7463b;

    public C2303xk(ECommerceScreen eCommerceScreen) {
        this(new C1204Fi(eCommerceScreen), new C2328yk());
    }

    /* renamed from: a */
    public final InterfaceC1766c8 m4632a() {
        return this.f7463b;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    public final String getPublicDescription() {
        return "shown screen info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.InterfaceC1973kf
    public final List<C1876gi> toProto() {
        return (List) this.f7463b.fromModel(this);
    }

    public final String toString() {
        return "ShownScreenInfoEvent{screen=" + this.f7462a + ", converter=" + this.f7463b + '}';
    }

    public C2303xk(C1204Fi c1204Fi, InterfaceC1766c8 interfaceC1766c8) {
        this.f7462a = c1204Fi;
        this.f7463b = interfaceC1766c8;
    }
}
