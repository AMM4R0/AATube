package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.internal.CounterConfiguration;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.gn */
/* loaded from: classes.dex */
public final class C1881gn {

    /* renamed from: a */
    public final C1894hb f6337a;

    public C1881gn() {
        this(new C1894hb());
    }

    /* renamed from: a */
    public final C1775ch m3897a(C1831en c1831en, C2000lh c2000lh) {
        C1582Um c1582Um = c1831en.f6165a;
        String str = c1582Um != null ? (String) WrapUtils.getOrDefault(c1582Um.f5547a, "") : "";
        byte[] fromModel = this.f6337a.fromModel(c1831en);
        C2123qf m3315a = AbstractC1521Sb.m3315a(c2000lh.f6458b.getApiKey());
        Set set = AbstractC2242v9.f7279a;
        EnumC1670Ya enumC1670Ya = EnumC1670Ya.EVENT_TYPE_UNDEFINED;
        C1987l4 c1987l4 = new C1987l4(fromModel, str, 5891, m3315a);
        c1987l4.f5623c = c2000lh.m4109d();
        return new C1775ch(c1987l4, true, 1, c1987l4.f6615q, new C2000lh(new C1748bf(c2000lh.f6457a), new CounterConfiguration(c2000lh.f6458b), c2000lh.f6658f));
    }

    public C1881gn(C1894hb c1894hb) {
        this.f6337a = c1894hb;
    }
}
