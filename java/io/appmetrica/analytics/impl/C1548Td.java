package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.Td */
/* loaded from: classes.dex */
public final class C1548Td implements Converter {

    /* renamed from: a */
    public final C2218ua f5474a;

    public C1548Td() {
        this(new C2218ua(20480, 100, AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1876gi fromModel(Map<String, String> map) {
        C1731an mo3342a = this.f5474a.mo3342a(map);
        C2016m8 c2016m8 = new C2016m8();
        c2016m8.f6721b = ((C1240H4) mo3342a.f5896b).f4814b;
        Map map2 = (Map) mo3342a.f5895a;
        if (map2 != null) {
            c2016m8.f6720a = new C1991l8[map2.size()];
            int r2 = 0;
            for (Map.Entry entry : map2.entrySet()) {
                c2016m8.f6720a[r2] = new C1991l8();
                c2016m8.f6720a[r2].f6634a = StringUtils.getUTF8Bytes((String) entry.getKey());
                c2016m8.f6720a[r2].f6635b = StringUtils.getUTF8Bytes((String) entry.getValue());
                r2++;
            }
        }
        return new C1876gi(c2016m8, mo3342a.f5896b);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C1548Td(C2218ua c2218ua) {
        this.f5474a = c2218ua;
    }

    /* renamed from: a */
    public final Map<String, String> m3371a(C1876gi c1876gi) {
        throw new UnsupportedOperationException();
    }
}
