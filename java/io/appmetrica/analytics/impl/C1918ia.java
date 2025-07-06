package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.ia */
/* loaded from: classes.dex */
public final class C1918ia implements InterfaceC1397Nb {
    @Override // io.appmetrica.analytics.impl.InterfaceC1397Nb
    /* renamed from: a */
    public final C1717a9 mo3111a(C2015m7 c2015m7) {
        C1717a9 c1717a9 = null;
        if ((c2015m7 != null ? c2015m7.f6710b : null) != null && c2015m7.f6711c != null) {
            c1717a9 = new C1717a9();
            c1717a9.f5855b = c2015m7.f6710b.doubleValue();
            c1717a9.f5854a = c2015m7.f6711c.doubleValue();
            Integer num = c2015m7.f6712d;
            if (num != null) {
                c1717a9.f5860g = num.intValue();
            }
            Integer num2 = c2015m7.f6713e;
            if (num2 != null) {
                c1717a9.f5858e = num2.intValue();
            }
            Integer num3 = c2015m7.f6714f;
            if (num3 != null) {
                c1717a9.f5857d = num3.intValue();
            }
            Integer num4 = c2015m7.f6715g;
            if (num4 != null) {
                c1717a9.f5859f = num4.intValue();
            }
            Long l2 = c2015m7.f6716h;
            if (l2 != null) {
                c1717a9.f5856c = TimeUnit.MILLISECONDS.toSeconds(l2.longValue());
            }
            String str = c2015m7.f6717i;
            if (str != null) {
                if (str.equals("gps")) {
                    c1717a9.f5861h = 1;
                } else if (str.equals("network")) {
                    c1717a9.f5861h = 2;
                }
            }
            String str2 = c2015m7.f6718j;
            if (str2 != null) {
                c1717a9.f5862i = str2;
            }
        }
        return c1717a9;
    }
}
