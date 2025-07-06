package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.C1365M4;
import io.appmetrica.analytics.impl.C1505Rk;
import io.appmetrica.analytics.impl.C1716a8;
import io.appmetrica.analytics.impl.C1741b8;
import io.appmetrica.analytics.impl.C1826ei;
import io.appmetrica.analytics.impl.C2153rk;
import io.appmetrica.analytics.impl.C2180sm;
import io.appmetrica.analytics.impl.C2289x6;
import io.appmetrica.analytics.impl.InterfaceC2181sn;

/* loaded from: classes.dex */
public class GenderAttribute {

    /* renamed from: a */
    private final C2289x6 f7794a = new C2289x6("appmetrica_gender", new C1741b8(), new C1505Rk());

    public enum Gender {
        MALE("M"),
        FEMALE("F"),
        OTHER("O");


        /* renamed from: a */
        private final String f7796a;

        Gender(String str) {
            this.f7796a = str;
        }

        public String getStringValue() {
            return this.f7796a;
        }
    }

    public UserProfileUpdate<? extends InterfaceC2181sn> withValue(Gender gender) {
        String str = this.f7794a.f7421c;
        String stringValue = gender.getStringValue();
        C1716a8 c1716a8 = new C1716a8();
        C2289x6 c2289x6 = this.f7794a;
        return new UserProfileUpdate<>(new C2180sm(str, stringValue, c1716a8, c2289x6.f7419a, new C1365M4(c2289x6.f7420b)));
    }

    public UserProfileUpdate<? extends InterfaceC2181sn> withValueIfUndefined(Gender gender) {
        String str = this.f7794a.f7421c;
        String stringValue = gender.getStringValue();
        C1716a8 c1716a8 = new C1716a8();
        C2289x6 c2289x6 = this.f7794a;
        return new UserProfileUpdate<>(new C2180sm(str, stringValue, c1716a8, c2289x6.f7419a, new C2153rk(c2289x6.f7420b)));
    }

    public UserProfileUpdate<? extends InterfaceC2181sn> withValueReset() {
        C2289x6 c2289x6 = this.f7794a;
        return new UserProfileUpdate<>(new C1826ei(0, c2289x6.f7421c, c2289x6.f7419a, c2289x6.f7420b));
    }
}
