package io.appmetrica.analytics.ecommerce;

import io.appmetrica.analytics.impl.C1264I3;
import io.appmetrica.analytics.impl.C1449Pd;
import io.appmetrica.analytics.impl.C2203tk;
import io.appmetrica.analytics.impl.C2253vk;
import io.appmetrica.analytics.impl.C2303xk;
import io.appmetrica.analytics.impl.InterfaceC1973kf;
import java.util.List;

/* loaded from: classes.dex */
public abstract class ECommerceEvent implements InterfaceC1973kf {
    public static ECommerceEvent addCartItemEvent(ECommerceCartItem eCommerceCartItem) {
        return new C1264I3(4, eCommerceCartItem);
    }

    public static ECommerceEvent beginCheckoutEvent(ECommerceOrder eCommerceOrder) {
        return new C1449Pd(6, eCommerceOrder);
    }

    public static ECommerceEvent purchaseEvent(ECommerceOrder eCommerceOrder) {
        return new C1449Pd(7, eCommerceOrder);
    }

    public static ECommerceEvent removeCartItemEvent(ECommerceCartItem eCommerceCartItem) {
        return new C1264I3(5, eCommerceCartItem);
    }

    public static ECommerceEvent showProductCardEvent(ECommerceProduct eCommerceProduct, ECommerceScreen eCommerceScreen) {
        return new C2203tk(eCommerceProduct, eCommerceScreen);
    }

    public static ECommerceEvent showProductDetailsEvent(ECommerceProduct eCommerceProduct, ECommerceReferrer eCommerceReferrer) {
        return new C2253vk(eCommerceProduct, eCommerceReferrer);
    }

    public static ECommerceEvent showScreenEvent(ECommerceScreen eCommerceScreen) {
        return new C2303xk(eCommerceScreen);
    }

    public String getPublicDescription() {
        return "E-commerce base event";
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1973kf
    public abstract /* synthetic */ List toProto();
}
