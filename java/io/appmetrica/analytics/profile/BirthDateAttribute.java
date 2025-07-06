package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.AbstractC1736b3;
import io.appmetrica.analytics.impl.C1365M4;
import io.appmetrica.analytics.impl.C1505Rk;
import io.appmetrica.analytics.impl.C1716a8;
import io.appmetrica.analytics.impl.C1741b8;
import io.appmetrica.analytics.impl.C1826ei;
import io.appmetrica.analytics.impl.C2153rk;
import io.appmetrica.analytics.impl.C2180sm;
import io.appmetrica.analytics.impl.C2289x6;
import io.appmetrica.analytics.impl.InterfaceC2181sn;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/* loaded from: classes.dex */
public class BirthDateAttribute {

    /* renamed from: a */
    private final C2289x6 f7791a = new C2289x6("appmetrica_birth_date", new C1741b8(), new C1505Rk());

    /* renamed from: a */
    public final UserProfileUpdate m4761a(Calendar calendar, String str, AbstractC1736b3 abstractC1736b3) {
        return new UserProfileUpdate(new C2180sm(this.f7791a.f7421c, new SimpleDateFormat(str).format(calendar.getTime()), new C1716a8(), new C1741b8(), abstractC1736b3));
    }

    public UserProfileUpdate<? extends InterfaceC2181sn> withAge(int r3) {
        int r02 = Calendar.getInstance(Locale.US).get(1) - r3;
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, r02);
        return m4761a(gregorianCalendar, "yyyy", new C1365M4(this.f7791a.f7420b));
    }

    public UserProfileUpdate<? extends InterfaceC2181sn> withAgeIfUndefined(int r3) {
        int r02 = Calendar.getInstance(Locale.US).get(1) - r3;
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, r02);
        return m4761a(gregorianCalendar, "yyyy", new C2153rk(this.f7791a.f7420b));
    }

    public UserProfileUpdate<? extends InterfaceC2181sn> withBirthDate(Calendar calendar) {
        return m4761a(calendar, "yyyy-MM-dd", new C1365M4(this.f7791a.f7420b));
    }

    public UserProfileUpdate<? extends InterfaceC2181sn> withBirthDateIfUndefined(Calendar calendar) {
        return m4761a(calendar, "yyyy-MM-dd", new C2153rk(this.f7791a.f7420b));
    }

    public UserProfileUpdate<? extends InterfaceC2181sn> withValueReset() {
        return new UserProfileUpdate<>(new C1826ei(0, this.f7791a.f7421c, new C1741b8(), new C1505Rk()));
    }

    public UserProfileUpdate<? extends InterfaceC2181sn> withBirthDate(int r3) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, r3);
        return m4761a(gregorianCalendar, "yyyy", new C1365M4(this.f7791a.f7420b));
    }

    public UserProfileUpdate<? extends InterfaceC2181sn> withBirthDateIfUndefined(int r3) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, r3);
        return m4761a(gregorianCalendar, "yyyy", new C2153rk(this.f7791a.f7420b));
    }

    public UserProfileUpdate<? extends InterfaceC2181sn> withBirthDate(int r3, int r4) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, r3);
        gregorianCalendar.set(2, r4 - 1);
        gregorianCalendar.set(5, 1);
        return m4761a(gregorianCalendar, "yyyy-MM", new C1365M4(this.f7791a.f7420b));
    }

    public UserProfileUpdate<? extends InterfaceC2181sn> withBirthDateIfUndefined(int r3, int r4) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, r3);
        gregorianCalendar.set(2, r4 - 1);
        gregorianCalendar.set(5, 1);
        return m4761a(gregorianCalendar, "yyyy-MM", new C2153rk(this.f7791a.f7420b));
    }

    public UserProfileUpdate<? extends InterfaceC2181sn> withBirthDate(int r3, int r4, int r5) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, r3);
        gregorianCalendar.set(2, r4 - 1);
        gregorianCalendar.set(5, r5);
        return m4761a(gregorianCalendar, "yyyy-MM-dd", new C1365M4(this.f7791a.f7420b));
    }

    public UserProfileUpdate<? extends InterfaceC2181sn> withBirthDateIfUndefined(int r3, int r4, int r5) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, r3);
        gregorianCalendar.set(2, r4 - 1);
        gregorianCalendar.set(5, r5);
        return m4761a(gregorianCalendar, "yyyy-MM-dd", new C2153rk(this.f7791a.f7420b));
    }
}
