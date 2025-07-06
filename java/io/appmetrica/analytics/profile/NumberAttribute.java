package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.C1215G4;
import io.appmetrica.analytics.impl.C1249Hd;
import io.appmetrica.analytics.impl.C1365M4;
import io.appmetrica.analytics.impl.C1826ei;
import io.appmetrica.analytics.impl.C1994lb;
import io.appmetrica.analytics.impl.C2153rk;
import io.appmetrica.analytics.impl.C2289x6;
import io.appmetrica.analytics.impl.C2319yb;
import io.appmetrica.analytics.impl.InterfaceC2181sn;

/* loaded from: classes.dex */
public final class NumberAttribute {

    /* renamed from: a */
    private final C2289x6 f7797a;

    public NumberAttribute(String str, C1994lb c1994lb, C2319yb c2319yb) {
        this.f7797a = new C2289x6(str, c1994lb, c2319yb);
    }

    public UserProfileUpdate<? extends InterfaceC2181sn> withValue(double d2) {
        return new UserProfileUpdate<>(new C1249Hd(this.f7797a.f7421c, d2, new C1994lb(), new C1365M4(new C2319yb(new C1215G4(100)))));
    }

    public UserProfileUpdate<? extends InterfaceC2181sn> withValueIfUndefined(double d2) {
        return new UserProfileUpdate<>(new C1249Hd(this.f7797a.f7421c, d2, new C1994lb(), new C2153rk(new C2319yb(new C1215G4(100)))));
    }

    public UserProfileUpdate<? extends InterfaceC2181sn> withValueReset() {
        return new UserProfileUpdate<>(new C1826ei(1, this.f7797a.f7421c, new C1994lb(), new C2319yb(new C1215G4(100))));
    }
}
