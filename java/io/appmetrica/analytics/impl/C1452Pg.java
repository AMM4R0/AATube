package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.Pg */
/* loaded from: classes.dex */
public final class C1452Pg extends AbstractC1515S5 {

    /* renamed from: b */
    public final C2013m5 f5225b;

    /* renamed from: c */
    public final InterfaceC1427Og f5226c;

    /* renamed from: d */
    public final C1787d4 f5227d;

    public C1452Pg(C2013m5 c2013m5, InterfaceC1427Og interfaceC1427Og) {
        this(c2013m5, interfaceC1427Og, new C1787d4());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.impl.AbstractC1515S5, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C1501Rg load(C1490R5 c1490r5) {
        C1501Rg c1501Rg = (C1501Rg) super.load(c1490r5);
        c1501Rg.f5344n = ((C1377Mg) c1490r5.componentArguments).f5067a;
        c1501Rg.f5349s = this.f5225b.f6707v.m3134a();
        c1501Rg.f5354x = this.f5225b.f6704s.m3105a();
        C1377Mg c1377Mg = (C1377Mg) c1490r5.componentArguments;
        c1501Rg.f5334d = c1377Mg.f5069c;
        c1501Rg.f5335e = c1377Mg.f5068b;
        c1501Rg.f5336f = c1377Mg.f5070d;
        c1501Rg.f5337g = c1377Mg.f5071e;
        c1501Rg.f5340j = c1377Mg.f5072f;
        c1501Rg.f5338h = c1377Mg.f5073g;
        c1501Rg.f5339i = c1377Mg.f5074h;
        Boolean valueOf = Boolean.valueOf(c1377Mg.f5075i);
        InterfaceC1427Og interfaceC1427Og = this.f5226c;
        c1501Rg.f5341k = valueOf;
        c1501Rg.f5342l = interfaceC1427Og;
        C1377Mg c1377Mg2 = (C1377Mg) c1490r5.componentArguments;
        c1501Rg.f5353w = c1377Mg2.f5077k;
        C2354zl c2354zl = c1490r5.f5309a;
        C1190F4 c1190f4 = c2354zl.f7552n;
        c1501Rg.f5345o = c1190f4.f4722a;
        C1648Xd c1648Xd = c2354zl.f7557s;
        if (c1648Xd != null) {
            c1501Rg.f5350t = c1648Xd.f5691a;
            c1501Rg.f5351u = c1648Xd.f5692b;
        }
        c1501Rg.f5346p = c1190f4.f4723b;
        c1501Rg.f5348r = c2354zl.f7543e;
        c1501Rg.f5347q = c2354zl.f7549k;
        C1787d4 c1787d4 = this.f5227d;
        Map<String, String> map = c1377Mg2.f5076j;
        C1712a4 m4198d = C2018ma.f6725C.m4198d();
        c1787d4.getClass();
        c1501Rg.f5352v = C1787d4.m3723a(map, c2354zl, m4198d);
        return c1501Rg;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader
    public final BaseRequestConfig createBlankConfig() {
        return new C1501Rg(this.f5225b);
    }

    public C1452Pg(C2013m5 c2013m5, InterfaceC1427Og interfaceC1427Og, C1787d4 c1787d4) {
        super(c2013m5.getContext(), c2013m5.mo2829b().m3806b());
        this.f5225b = c2013m5;
        this.f5226c = interfaceC1427Og;
        this.f5227d = c1787d4;
    }

    /* renamed from: a */
    public final C1501Rg m3209a() {
        return new C1501Rg(this.f5225b);
    }
}
