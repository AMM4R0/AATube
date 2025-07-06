package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.ef */
/* loaded from: classes.dex */
public final class C1823ef implements Converter {

    /* renamed from: a */
    public final C1548Td f6149a;

    /* renamed from: b */
    public final C1649Xe f6150b;

    /* renamed from: c */
    public final C1364M3 f6151c;

    /* renamed from: d */
    public final C1923if f6152d;

    /* renamed from: e */
    public final C2143ra f6153e;

    /* renamed from: f */
    public final C2143ra f6154f;

    public C1823ef() {
        this(new C1548Td(), new C1649Xe(), new C1364M3(), new C1923if(), new C2143ra(100), new C2143ra(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1876gi fromModel(C1898hf c1898hf) {
        C1876gi c1876gi;
        C1876gi c1876gi2;
        C1876gi c1876gi3;
        C1876gi c1876gi4;
        C2066o8 c2066o8 = new C2066o8();
        C1731an mo3342a = this.f6153e.mo3342a(c1898hf.f6406a);
        c2066o8.f6845a = StringUtils.getUTF8Bytes((String) mo3342a.f5895a);
        C1731an mo3342a2 = this.f6154f.mo3342a(c1898hf.f6407b);
        c2066o8.f6846b = StringUtils.getUTF8Bytes((String) mo3342a2.f5895a);
        List<String> list = c1898hf.f6408c;
        C1876gi c1876gi5 = null;
        if (list != null) {
            c1876gi = this.f6151c.fromModel(list);
            c2066o8.f6847c = (C1866g8) c1876gi.f6330a;
        } else {
            c1876gi = null;
        }
        Map<String, String> map = c1898hf.f6409d;
        if (map != null) {
            c1876gi2 = this.f6149a.fromModel(map);
            c2066o8.f6848d = (C2016m8) c1876gi2.f6330a;
        } else {
            c1876gi2 = null;
        }
        C1698Ze c1698Ze = c1898hf.f6410e;
        if (c1698Ze != null) {
            c1876gi3 = this.f6150b.fromModel(c1698Ze);
            c2066o8.f6849e = (C2041n8) c1876gi3.f6330a;
        } else {
            c1876gi3 = null;
        }
        C1698Ze c1698Ze2 = c1898hf.f6411f;
        if (c1698Ze2 != null) {
            c1876gi4 = this.f6150b.fromModel(c1698Ze2);
            c2066o8.f6850f = (C2041n8) c1876gi4.f6330a;
        } else {
            c1876gi4 = null;
        }
        List<String> list2 = c1898hf.f6412g;
        if (list2 != null) {
            c1876gi5 = this.f6152d.fromModel(list2);
            c2066o8.f6851g = (C2091p8[]) c1876gi5.f6330a;
        }
        return new C1876gi(c2066o8, new C1089B3(C1089B3.m2745b(mo3342a, mo3342a2, c1876gi, c1876gi2, c1876gi3, c1876gi4, c1876gi5)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C1823ef(C1548Td c1548Td, C1649Xe c1649Xe, C1364M3 c1364m3, C1923if c1923if, C2143ra c2143ra, C2143ra c2143ra2) {
        this.f6149a = c1548Td;
        this.f6150b = c1649Xe;
        this.f6151c = c1364m3;
        this.f6152d = c1923if;
        this.f6153e = c2143ra;
        this.f6154f = c2143ra2;
    }

    /* renamed from: a */
    public final C1898hf m3789a(C1876gi c1876gi) {
        throw new UnsupportedOperationException();
    }
}
