package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;
import java.util.Arrays;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.qi */
/* loaded from: classes.dex */
public final class C2126qi implements InterfaceC1234Gn {

    /* renamed from: a */
    public final C1209Fn f6999a = new C1209Fn();

    @Override // io.appmetrica.analytics.impl.InterfaceC1234Gn
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1184En mo2706a(Revenue revenue) {
        C1184En c1184En;
        C1209Fn c1209Fn = this.f6999a;
        C2223uf c2223uf = new C2223uf();
        Integer num = revenue.quantity;
        if (num == null || num.intValue() > 0) {
            c1184En = new C1184En(c2223uf, true, "");
        } else {
            c1184En = new C1184En(c2223uf, false, "Invalid quantity value " + num);
        }
        List<C1184En> asList = Arrays.asList(c1184En);
        c1209Fn.getClass();
        return c1209Fn.mo2706a(asList);
    }
}
