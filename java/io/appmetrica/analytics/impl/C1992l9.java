package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.l9 */
/* loaded from: classes.dex */
public final class C1992l9 {

    /* renamed from: a */
    public final C2297xe f6636a;

    /* renamed from: b */
    public final C1409Nn f6637b;

    /* renamed from: c */
    public final C1903hk f6638c;

    /* renamed from: d */
    public final C1417O6 f6639d;

    /* renamed from: e */
    public final C1219G8 f6640e;

    /* renamed from: f */
    public final C1703Zj f6641f;

    /* renamed from: g */
    public final C1758c0 f6642g;

    /* renamed from: h */
    public final C1518S8 f6643h;

    /* renamed from: i */
    public final C2063o5 f6644i;

    /* renamed from: j */
    public final TimeProvider f6645j;

    /* renamed from: k */
    public final int f6646k;

    /* renamed from: l */
    public long f6647l;

    /* renamed from: m */
    public int f6648m;

    public C1992l9(C2297xe c2297xe, C1409Nn c1409Nn, C1903hk c1903hk, C1417O6 c1417o6, C1758c0 c1758c0, C1219G8 c1219g8, C1703Zj c1703Zj, int r8, C2063o5 c2063o5, C1518S8 c1518s8, SystemTimeProvider systemTimeProvider) {
        this.f6636a = c2297xe;
        this.f6637b = c1409Nn;
        this.f6638c = c1903hk;
        this.f6639d = c1417o6;
        this.f6642g = c1758c0;
        this.f6640e = c1219g8;
        this.f6641f = c1703Zj;
        this.f6646k = r8;
        this.f6643h = c1518s8;
        this.f6645j = systemTimeProvider;
        this.f6644i = c2063o5;
        this.f6647l = c2297xe.m4621h();
        this.f6648m = c2297xe.m4620g();
    }

    /* renamed from: a */
    public final void m4100a(C1615W5 c1615w5, C1953jk c1953jk) {
        Map map = c1615w5.f5636p;
        C1703Zj c1703Zj = this.f6641f;
        c1703Zj.getClass();
        map.putAll(new HashMap(c1703Zj.f5814b));
        c1615w5.mo3481c(this.f6636a.m4624i());
        c1615w5.f5635o = Integer.valueOf(this.f6637b.m3138b());
        C1733b0 m3681a = this.f6642g.m3681a();
        C1219G8 c1219g8 = this.f6640e;
        c1219g8.getClass();
        InterfaceC1194F8 interfaceC1194F8 = (InterfaceC1194F8) c1219g8.f4779b.m4482a(EnumC1670Ya.m3538a(c1615w5.f5624d));
        C1417O6 c1417o6 = this.f6639d;
        C2341z8 mo2871a = interfaceC1194F8.mo2871a(c1615w5);
        int r02 = c1615w5.f5624d;
        C1518S8 c1518s8 = this.f6643h;
        C1990l7 c1990l7 = new C1990l7(c1417o6.f5159g, c1953jk, r02, c1518s8, mo2871a, (C1501Rg) c1417o6.f5160h.f6697l.m4598a(), m3681a);
        Long valueOf = Long.valueOf(c1953jk.f6547a);
        EnumC2003lk enumC2003lk = c1953jk.f6550d;
        Long valueOf2 = Long.valueOf(c1953jk.f6548b);
        EnumC1670Ya m3538a = EnumC1670Ya.m3538a(c1990l7.f6632h.f5624d);
        long j2 = 0;
        if (!AbstractC2242v9.f7284f.contains(EnumC1670Ya.m3538a(r02))) {
            C1409Nn c1409Nn = c1518s8.f5411b;
            synchronized (c1409Nn) {
                j2 = c1409Nn.f5142a.m3193a().optLong("global_number", 0L);
            }
            c1518s8.f5411b.m3140b(1 + j2);
        }
        c1417o6.m3160a(c1417o6.f5164l.fromModel(new C1915i7(valueOf, enumC2003lk, valueOf2, m3538a, Long.valueOf(j2), Long.valueOf(c1953jk.f6549c), c1990l7.m4094a())));
        this.f6644i.f6842a.m3577g();
    }
}
