package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceOrder;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.Pd */
/* loaded from: classes.dex */
public final class C1449Pd extends ECommerceEvent {

    /* renamed from: d */
    public static final int f5214d = 6;

    /* renamed from: e */
    public static final int f5215e = 7;

    /* renamed from: a */
    public final int f5216a;

    /* renamed from: b */
    public final C1498Rd f5217b;

    /* renamed from: c */
    public final InterfaceC1766c8 f5218c;

    public C1449Pd(int r2, ECommerceOrder eCommerceOrder) {
        this(r2, new C1498Rd(eCommerceOrder), new C1474Qd());
    }

    /* renamed from: a */
    public final InterfaceC1766c8 m3203a() {
        return this.f5218c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    public final String getPublicDescription() {
        return "order info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.InterfaceC1973kf
    public final List<C1876gi> toProto() {
        return (List) this.f5218c.fromModel(this);
    }

    public final String toString() {
        return "OrderInfoEvent{eventType=" + this.f5216a + ", order=" + this.f5217b + ", converter=" + this.f5218c + '}';
    }

    public C1449Pd(int r12, C1498Rd c1498Rd, InterfaceC1766c8 interfaceC1766c8) {
        this.f5216a = r12;
        this.f5217b = c1498Rd;
        this.f5218c = interfaceC1766c8;
    }
}
