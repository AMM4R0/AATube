package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceCartItem;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.I3 */
/* loaded from: classes.dex */
public final class C1264I3 extends ECommerceEvent {

    /* renamed from: d */
    public static final int f4833d = 4;

    /* renamed from: e */
    public static final int f4834e = 5;

    /* renamed from: a */
    public final int f4835a;

    /* renamed from: b */
    public final C1339L3 f4836b;

    /* renamed from: c */
    public final InterfaceC1766c8 f4837c;

    public C1264I3(int r2, ECommerceCartItem eCommerceCartItem) {
        this(r2, new C1339L3(eCommerceCartItem), new C1289J3());
    }

    /* renamed from: a */
    public final InterfaceC1766c8 m2948a() {
        return this.f4837c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    public final String getPublicDescription() {
        int r02 = this.f4835a;
        return r02 != 4 ? r02 != 5 ? "unknown cart action info" : "remove cart item info" : "add cart item info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.InterfaceC1973kf
    public final List<C1876gi> toProto() {
        return (List) this.f4837c.fromModel(this);
    }

    public final String toString() {
        return "CartActionInfoEvent{eventType=" + this.f4835a + ", cartItem=" + this.f4836b + ", converter=" + this.f4837c + '}';
    }

    public C1264I3(int r12, C1339L3 c1339l3, InterfaceC1766c8 interfaceC1766c8) {
        this.f4835a = r12;
        this.f4836b = c1339l3;
        this.f4837c = interfaceC1766c8;
    }
}
