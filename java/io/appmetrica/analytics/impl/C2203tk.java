package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.tk */
/* loaded from: classes.dex */
public final class C2203tk extends ECommerceEvent {

    /* renamed from: a */
    public final C1898hf f7175a;

    /* renamed from: b */
    public final C1204Fi f7176b;

    /* renamed from: c */
    public final InterfaceC1766c8 f7177c;

    public C2203tk(ECommerceProduct eCommerceProduct, ECommerceScreen eCommerceScreen) {
        this(new C1898hf(eCommerceProduct), new C1204Fi(eCommerceScreen), new C2228uk());
    }

    /* renamed from: a */
    public final InterfaceC1766c8 m4459a() {
        return this.f7177c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    public final String getPublicDescription() {
        return "shown product card info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.InterfaceC1973kf
    public final List<C1876gi> toProto() {
        return (List) this.f7177c.fromModel(this);
    }

    public final String toString() {
        return "ShownProductCardInfoEvent{product=" + this.f7175a + ", screen=" + this.f7176b + ", converter=" + this.f7177c + '}';
    }

    public C2203tk(C1898hf c1898hf, C1204Fi c1204Fi, InterfaceC1766c8 interfaceC1766c8) {
        this.f7175a = c1898hf;
        this.f7176b = c1204Fi;
        this.f7177c = interfaceC1766c8;
    }
}
