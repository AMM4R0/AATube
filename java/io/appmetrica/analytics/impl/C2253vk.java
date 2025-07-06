package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import io.appmetrica.analytics.ecommerce.ECommerceReferrer;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.vk */
/* loaded from: classes.dex */
public final class C2253vk extends ECommerceEvent {

    /* renamed from: a */
    public final C1898hf f7311a;

    /* renamed from: b */
    public final C1749bg f7312b;

    /* renamed from: c */
    public final InterfaceC1766c8 f7313c;

    public C2253vk(ECommerceProduct eCommerceProduct, ECommerceReferrer eCommerceReferrer) {
        this(new C1898hf(eCommerceProduct), eCommerceReferrer == null ? null : new C1749bg(eCommerceReferrer), new C2278wk());
    }

    /* renamed from: a */
    public final InterfaceC1766c8 m4524a() {
        return this.f7313c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    public final String getPublicDescription() {
        return "shown product details info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.InterfaceC1973kf
    public final List<C1876gi> toProto() {
        return (List) this.f7313c.fromModel(this);
    }

    public final String toString() {
        return "ShownProductDetailInfoEvent{product=" + this.f7311a + ", referrer=" + this.f7312b + ", converter=" + this.f7313c + '}';
    }

    public C2253vk(C1898hf c1898hf, C1749bg c1749bg, InterfaceC1766c8 interfaceC1766c8) {
        this.f7311a = c1898hf;
        this.f7312b = c1749bg;
        this.f7313c = interfaceC1766c8;
    }
}
