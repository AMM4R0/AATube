package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.C1365M4;
import io.appmetrica.analytics.impl.C1826ei;
import io.appmetrica.analytics.impl.C2153rk;
import io.appmetrica.analytics.impl.C2155rm;
import io.appmetrica.analytics.impl.C2180sm;
import io.appmetrica.analytics.impl.C2289x6;
import io.appmetrica.analytics.impl.InterfaceC1234Gn;
import io.appmetrica.analytics.impl.InterfaceC1706Zm;
import io.appmetrica.analytics.impl.InterfaceC2110q2;
import io.appmetrica.analytics.impl.InterfaceC2181sn;

/* loaded from: classes.dex */
public class StringAttribute {

    /* renamed from: a */
    private final InterfaceC1706Zm f7798a;

    /* renamed from: b */
    private final C2289x6 f7799b;

    public StringAttribute(String str, C2155rm c2155rm, InterfaceC1234Gn interfaceC1234Gn, InterfaceC2110q2 interfaceC2110q2) {
        this.f7799b = new C2289x6(str, interfaceC1234Gn, interfaceC2110q2);
        this.f7798a = c2155rm;
    }

    public UserProfileUpdate<? extends InterfaceC2181sn> withValue(String str) {
        C2289x6 c2289x6 = this.f7799b;
        return new UserProfileUpdate<>(new C2180sm(c2289x6.f7421c, str, this.f7798a, c2289x6.f7419a, new C1365M4(c2289x6.f7420b)));
    }

    public UserProfileUpdate<? extends InterfaceC2181sn> withValueIfUndefined(String str) {
        C2289x6 c2289x6 = this.f7799b;
        return new UserProfileUpdate<>(new C2180sm(c2289x6.f7421c, str, this.f7798a, c2289x6.f7419a, new C2153rk(c2289x6.f7420b)));
    }

    public UserProfileUpdate<? extends InterfaceC2181sn> withValueReset() {
        C2289x6 c2289x6 = this.f7799b;
        return new UserProfileUpdate<>(new C1826ei(0, c2289x6.f7421c, c2289x6.f7419a, c2289x6.f7420b));
    }
}
