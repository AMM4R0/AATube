package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.fg */
/* loaded from: classes.dex */
public final class C1849fg implements InterfaceC1954jl, InterfaceC1196Fa {

    /* renamed from: a */
    public final Context f6268a;

    /* renamed from: b */
    public final C1838f5 f6269b;

    /* renamed from: c */
    public final C1863g5 f6270c;

    /* renamed from: d */
    public final C1606Vl f6271d;

    /* renamed from: e */
    public final InterfaceC1421Oa f6272e;

    public C1849fg(Context context, C1838f5 c1838f5, C1290J4 c1290j4, InterfaceC2038n5 interfaceC2038n5, C1863g5 c1863g5, C1729al c1729al) {
        this.f6268a = context;
        this.f6269b = c1838f5;
        this.f6270c = c1863g5;
        C1606Vl m3626a = c1729al.m3626a(context, c1838f5, c1290j4.f4896a);
        this.f6271d = m3626a;
        this.f6272e = interfaceC2038n5.mo3881a(context, c1838f5, c1290j4.f4897b, m3626a);
        c1729al.m3627a(c1838f5, this);
    }

    /* renamed from: a */
    public final C1838f5 m3827a() {
        return this.f6269b;
    }

    /* renamed from: b */
    public final Context m3830b() {
        return this.f6268a;
    }

    /* renamed from: a */
    public final void m3828a(InterfaceC1065A4 interfaceC1065A4) {
        this.f6270c.f6294a.add(interfaceC1065A4);
    }

    /* renamed from: b */
    public final void m3831b(InterfaceC1065A4 interfaceC1065A4) {
        this.f6270c.f6294a.remove(interfaceC1065A4);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1954jl
    /* renamed from: a */
    public final void mo3171a(C2354zl c2354zl) {
        this.f6272e.mo3171a(c2354zl);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1954jl
    /* renamed from: a */
    public final void mo3170a(EnumC1779cl enumC1779cl, C2354zl c2354zl) {
        ((C2013m5) this.f6272e).getClass();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1196Fa
    /* renamed from: a */
    public final void mo2873a(C1290J4 c1290j4) {
        this.f6271d.m3434a(c1290j4.f4896a);
        this.f6272e.mo2828a(c1290j4.f4897b);
    }

    public C1849fg(Context context, C1838f5 c1838f5, C1290J4 c1290j4, InterfaceC2038n5 interfaceC2038n5) {
        this(context, c1838f5, c1290j4, interfaceC2038n5, new C1863g5(), C1729al.m3625a());
    }

    /* renamed from: a */
    public final void m3829a(C1615W5 c1615w5, C1290J4 c1290j4) {
        if (!AbstractC2242v9.f7281c.contains(EnumC1670Ya.m3538a(c1615w5.f5624d))) {
            this.f6272e.mo2828a(c1290j4.f4897b);
        }
        ((C2013m5) this.f6272e).mo3169a(c1615w5);
    }
}
