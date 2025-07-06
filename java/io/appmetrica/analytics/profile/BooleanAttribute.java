package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.C1365M4;
import io.appmetrica.analytics.impl.C1826ei;
import io.appmetrica.analytics.impl.C2153rk;
import io.appmetrica.analytics.impl.C2289x6;
import io.appmetrica.analytics.impl.C2311y3;
import io.appmetrica.analytics.impl.InterfaceC1234Gn;
import io.appmetrica.analytics.impl.InterfaceC2110q2;
import io.appmetrica.analytics.impl.InterfaceC2181sn;

/* loaded from: classes.dex */
public class BooleanAttribute {

    /* renamed from: a */
    private final C2289x6 f7792a;

    public BooleanAttribute(String str, InterfaceC1234Gn interfaceC1234Gn, InterfaceC2110q2 interfaceC2110q2) {
        this.f7792a = new C2289x6(str, interfaceC1234Gn, interfaceC2110q2);
    }

    public UserProfileUpdate<? extends InterfaceC2181sn> withValue(boolean z2) {
        C2289x6 c2289x6 = this.f7792a;
        return new UserProfileUpdate<>(new C2311y3(c2289x6.f7421c, z2, c2289x6.f7419a, new C1365M4(c2289x6.f7420b)));
    }

    public UserProfileUpdate<? extends InterfaceC2181sn> withValueIfUndefined(boolean z2) {
        C2289x6 c2289x6 = this.f7792a;
        return new UserProfileUpdate<>(new C2311y3(c2289x6.f7421c, z2, c2289x6.f7419a, new C2153rk(c2289x6.f7420b)));
    }

    public UserProfileUpdate<? extends InterfaceC2181sn> withValueReset() {
        C2289x6 c2289x6 = this.f7792a;
        return new UserProfileUpdate<>(new C1826ei(3, c2289x6.f7421c, c2289x6.f7419a, c2289x6.f7420b));
    }
}
