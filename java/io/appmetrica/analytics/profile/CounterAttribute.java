package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.C1640X5;
import io.appmetrica.analytics.impl.C1994lb;
import io.appmetrica.analytics.impl.C2289x6;
import io.appmetrica.analytics.impl.C2319yb;
import io.appmetrica.analytics.impl.InterfaceC2181sn;

/* loaded from: classes.dex */
public final class CounterAttribute {

    /* renamed from: a */
    private final C2289x6 f7793a;

    public CounterAttribute(String str, C1994lb c1994lb, C2319yb c2319yb) {
        this.f7793a = new C2289x6(str, c1994lb, c2319yb);
    }

    public UserProfileUpdate<? extends InterfaceC2181sn> withDelta(double d2) {
        return new UserProfileUpdate<>(new C1640X5(this.f7793a.f7421c, d2));
    }
}
