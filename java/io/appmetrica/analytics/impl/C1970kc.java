package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;

/* renamed from: io.appmetrica.analytics.impl.kc */
/* loaded from: classes.dex */
public final class C1970kc extends C2013m5 implements InterfaceC1346La, InterfaceC1321Ka {

    /* renamed from: A */
    public final C2161s3 f6580A;

    /* renamed from: x */
    public final C1451Pf f6581x;

    /* renamed from: y */
    public final C1550Tf f6582y;

    /* renamed from: z */
    public final C1267I6 f6583z;

    public C1970kc(Context context, C2354zl c2354zl, C1838f5 c1838f5, C1265I4 r23, C1451Pf c1451Pf, C1267I6 r25, AbstractC1963k5 abstractC1963k5) {
        this(context, c1838f5, c2354zl, r23, new C1783d0(), new TimePassedChecker(), new C1995lc(context, c1838f5, r23, abstractC1963k5, c2354zl, new C1845fc(r25), C2018ma.m4192h().m4214u().m2965d(), PackageManagerUtils.getAppVersionCodeInt(context), C2018ma.m4192h().m4214u(), C2018ma.m4192h().m4202i()), c1451Pf, r25);
    }

    @Override // io.appmetrica.analytics.impl.C2013m5
    /* renamed from: C */
    public final void mo4054C() {
        this.f6581x.m3208a(this.f6582y);
    }

    /* renamed from: D */
    public final boolean m4055D() {
        boolean optBoolean;
        C1409Nn c1409Nn = this.f6707v;
        synchronized (c1409Nn) {
            optBoolean = c1409Nn.f5142a.m3193a().optBoolean("referrer_handled", false);
        }
        return optBoolean;
    }

    @Override // io.appmetrica.analytics.impl.C2013m5, io.appmetrica.analytics.impl.InterfaceC1421Oa, io.appmetrica.analytics.impl.InterfaceC1146Da
    /* renamed from: a */
    public final synchronized void mo2828a(C1265I4 r2) {
        super.mo2828a(r2);
        this.f6583z.m2951a(r2.f4846i);
    }

    @Override // io.appmetrica.analytics.impl.C2013m5, io.appmetrica.analytics.impl.InterfaceC1146Da
    /* renamed from: c */
    public final EnumC1565U5 mo2830c() {
        return EnumC1565U5.f5517b;
    }

    @Override // io.appmetrica.analytics.impl.C2013m5, io.appmetrica.analytics.impl.InterfaceC1421Oa, io.appmetrica.analytics.impl.InterfaceC1954jl
    /* renamed from: a */
    public final void mo3171a(C2354zl c2354zl) {
        synchronized (this) {
            this.f6697l.m4600a(c2354zl);
            this.f6702q.m4398b();
        }
        this.f6580A.mo2780a(c2354zl);
    }

    public C1970kc(Context context, C1838f5 c1838f5, C2354zl c2354zl, C1265I4 r10, C1783d0 c1783d0, TimePassedChecker timePassedChecker, C1995lc c1995lc, C1451Pf c1451Pf, C1267I6 r15) {
        super(context, c1838f5, c1783d0, timePassedChecker, c1995lc);
        this.f6581x = c1451Pf;
        C1668Y8 m4169j = m4169j();
        m4169j.m3533a(EnumC1670Ya.EVENT_TYPE_REGULAR, new C1999lg(m4169j.m3534b()));
        this.f6582y = c1995lc.m4103b(this);
        this.f6583z = r15;
        C2161s3 m4102a = c1995lc.m4102a(this);
        this.f6580A = m4102a;
        m4102a.m4409a(c2354zl, r10.f4850m);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1321Ka
    /* renamed from: a */
    public final void mo3012a() {
        C1409Nn c1409Nn = this.f6707v;
        synchronized (c1409Nn) {
            C1434On c1434On = c1409Nn.f5142a;
            c1434On.m3194a(c1434On.m3193a().put("referrer_handled", true));
        }
    }
}
