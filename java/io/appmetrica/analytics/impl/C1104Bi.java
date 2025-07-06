package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.Bi */
/* loaded from: classes.dex */
public final class C1104Bi implements Converter {

    /* renamed from: a */
    public final C1548Td f4536a;

    /* renamed from: b */
    public final C1364M3 f4537b;

    /* renamed from: c */
    public final C2143ra f4538c;

    /* renamed from: d */
    public final C2143ra f4539d;

    public C1104Bi() {
        this(new C1548Td(), new C1364M3(), new C2143ra(100), new C2143ra(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1876gi fromModel(C1204Fi c1204Fi) {
        C1876gi c1876gi;
        C2141r8 c2141r8 = new C2141r8();
        C1731an mo3342a = this.f4538c.mo3342a(c1204Fi.f4736a);
        c2141r8.f7055a = StringUtils.getUTF8Bytes((String) mo3342a.f5895a);
        List<String> list = c1204Fi.f4737b;
        C1876gi c1876gi2 = null;
        if (list != null) {
            c1876gi = this.f4537b.fromModel(list);
            c2141r8.f7056b = (C1866g8) c1876gi.f6330a;
        } else {
            c1876gi = null;
        }
        C1731an mo3342a2 = this.f4539d.mo3342a(c1204Fi.f4738c);
        c2141r8.f7057c = StringUtils.getUTF8Bytes((String) mo3342a2.f5895a);
        Map<String, String> map = c1204Fi.f4739d;
        if (map != null) {
            c1876gi2 = this.f4536a.fromModel(map);
            c2141r8.f7058d = (C2016m8) c1876gi2.f6330a;
        }
        return new C1876gi(c2141r8, new C1089B3(C1089B3.m2745b(mo3342a, c1876gi, mo3342a2, c1876gi2)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C1104Bi(C1548Td c1548Td, C1364M3 c1364m3, C2143ra c2143ra, C2143ra c2143ra2) {
        this.f4536a = c1548Td;
        this.f4537b = c1364m3;
        this.f4538c = c2143ra;
        this.f4539d = c2143ra2;
    }

    /* renamed from: a */
    public final C1204Fi m2772a(C1876gi c1876gi) {
        throw new UnsupportedOperationException();
    }
}
