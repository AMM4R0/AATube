package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Map;
import p002A1.AbstractC0008a;
import p105l1.C2632c;
import p108m1.AbstractC2660j;
import p131u1.InterfaceC2810l;

/* renamed from: io.appmetrica.analytics.impl.C */
/* loaded from: classes.dex */
public final class C1110C {

    /* renamed from: a */
    public final AdRevenue f4553a;

    /* renamed from: b */
    public final boolean f4554b;

    /* renamed from: c */
    public final C2155rm f4555c;

    /* renamed from: d */
    public final C2105pm f4556d;

    public C1110C(AdRevenue adRevenue, boolean z2, C2123qf c2123qf) {
        this.f4553a = adRevenue;
        this.f4554b = z2;
        this.f4555c = new C2155rm(100, "ad revenue strings", c2123qf);
        this.f4556d = new C2105pm(30720, "ad revenue payload", c2123qf);
    }

    /* renamed from: a */
    public final C2632c m2783a() {
        C2207u c2207u = new C2207u();
        int r4 = 0;
        for (C2632c c2632c : AbstractC2660j.m5120X(new C2632c(this.f4553a.adNetwork, new C2232v(c2207u)), new C2632c(this.f4553a.adPlacementId, new C2257w(c2207u)), new C2632c(this.f4553a.adPlacementName, new C2282x(c2207u)), new C2632c(this.f4553a.adUnitId, new C2307y(c2207u)), new C2632c(this.f4553a.adUnitName, new C2332z(c2207u)), new C2632c(this.f4553a.precision, new C1060A(c2207u)), new C2632c(this.f4553a.currency.getCurrencyCode(), new C1085B(c2207u)))) {
            String str = (String) c2632c.f8550a;
            InterfaceC2810l interfaceC2810l = (InterfaceC2810l) c2632c.f8551b;
            C2155rm c2155rm = this.f4555c;
            c2155rm.getClass();
            String mo2687a = c2155rm.mo2687a(str);
            byte[] stringToBytesForProtobuf = StringUtils.stringToBytesForProtobuf(str);
            byte[] stringToBytesForProtobuf2 = StringUtils.stringToBytesForProtobuf(mo2687a);
            interfaceC2810l.invoke(stringToBytesForProtobuf2);
            r4 += stringToBytesForProtobuf.length - stringToBytesForProtobuf2.length;
        }
        Integer num = (Integer) AbstractC1135D.f4615a.get(this.f4553a.adType);
        c2207u.f7201d = num != null ? num.intValue() : 0;
        C2182t c2182t = new C2182t();
        BigDecimal bigDecimal = this.f4553a.adRevenue;
        BigInteger bigInteger = AbstractC1093B7.f4520a;
        int r5 = -bigDecimal.scale();
        BigInteger unscaledValue = bigDecimal.unscaledValue();
        while (true) {
            if (unscaledValue.compareTo(AbstractC1093B7.f4520a) <= 0 && unscaledValue.compareTo(AbstractC1093B7.f4521b) >= 0) {
                break;
            }
            unscaledValue = unscaledValue.divide(BigInteger.TEN);
            r5++;
        }
        Long valueOf = Long.valueOf(unscaledValue.longValue());
        Integer valueOf2 = Integer.valueOf(r5);
        long longValue = valueOf.longValue();
        int intValue = valueOf2.intValue();
        c2182t.f7141a = longValue;
        c2182t.f7142b = intValue;
        c2207u.f7199b = c2182t;
        Map<String, String> map = this.f4553a.payload;
        if (map != null) {
            String m3754b = AbstractC1794db.m3754b(map);
            C2105pm c2105pm = this.f4556d;
            c2105pm.getClass();
            byte[] stringToBytesForProtobuf3 = StringUtils.stringToBytesForProtobuf(c2105pm.mo2687a(m3754b));
            c2207u.f7208k = stringToBytesForProtobuf3;
            r4 += StringUtils.stringToBytesForProtobuf(m3754b).length - stringToBytesForProtobuf3.length;
        }
        if (this.f4554b) {
            c2207u.f7198a = "autocollected".getBytes(AbstractC0008a.f6a);
        }
        return new C2632c(MessageNano.toByteArray(c2207u), Integer.valueOf(r4));
    }
}
