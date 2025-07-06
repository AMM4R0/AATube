package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import java.util.ArrayList;
import java.util.Iterator;
import p103k0.AbstractC2480a;

/* renamed from: io.appmetrica.analytics.impl.m5 */
/* loaded from: classes.dex */
public class C2013m5 implements InterfaceC1421Oa, InterfaceC1146Da, InterfaceC2217u9, InterfaceC1477Qg {

    /* renamed from: a */
    public final Context f6686a;

    /* renamed from: b */
    public final C1838f5 f6687b;

    /* renamed from: c */
    public final C2297xe f6688c;

    /* renamed from: d */
    public final C1075Ae f6689d;

    /* renamed from: e */
    public final C1701Zh f6690e;

    /* renamed from: f */
    public final C1417O6 f6691f;

    /* renamed from: g */
    public final C1652Xh f6692g;

    /* renamed from: h */
    public final C1668Y8 f6693h;

    /* renamed from: i */
    public final C1758c0 f6694i;

    /* renamed from: j */
    public final C1783d0 f6695j;

    /* renamed from: k */
    public final C1903hk f6696k;

    /* renamed from: l */
    public final C2224ug f6697l;

    /* renamed from: m */
    public final C1344L8 f6698m;

    /* renamed from: n */
    public final C2123qf f6699n;

    /* renamed from: o */
    public final C1992l9 f6700o;

    /* renamed from: p */
    public final C1888h5 f6701p;

    /* renamed from: q */
    public final C2142r9 f6702q;

    /* renamed from: r */
    public final C1216G5 f6703r;

    /* renamed from: s */
    public final C1389N3 f6704s;

    /* renamed from: t */
    public final TimePassedChecker f6705t;

    /* renamed from: u */
    public final C1574Ue f6706u;

    /* renamed from: v */
    public final C1409Nn f6707v;

    /* renamed from: w */
    public final C1703Zj f6708w;

    public C2013m5(Context context, C2354zl c2354zl, C1838f5 c1838f5, C1265I4 r20, InterfaceC1427Og interfaceC1427Og, AbstractC1963k5 abstractC1963k5) {
        this(context, c1838f5, new C1783d0(), new TimePassedChecker(), new C2138r5(context, c1838f5, r20, abstractC1963k5, c2354zl, interfaceC1427Og, C2018ma.m4192h().m4214u().m2965d(), PackageManagerUtils.getAppVersionCodeInt(context), C2018ma.m4192h().m4202i()));
    }

    /* renamed from: A */
    public final boolean m4159A() {
        C1501Rg c1501Rg = (C1501Rg) this.f6697l.m4598a();
        return c1501Rg.f5345o && this.f6705t.didTimePassSeconds(this.f6700o.f6647l, c1501Rg.f5351u, "should force send permissions");
    }

    /* renamed from: B */
    public final boolean m4160B() {
        C2354zl c2354zl;
        C1574Ue c1574Ue = this.f6706u;
        c1574Ue.f5210h.mo2827a(c1574Ue.f5203a);
        boolean z2 = ((C1499Re) c1574Ue.m3199c()).f5328d;
        C2224ug c2224ug = this.f6697l;
        synchronized (c2224ug) {
            c2354zl = c2224ug.f7418c.f5309a;
        }
        return !(z2 && c2354zl.f7555q);
    }

    /* renamed from: C */
    public void mo4054C() {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1421Oa, io.appmetrica.analytics.impl.InterfaceC1954jl
    /* renamed from: a */
    public final void mo3170a(EnumC1779cl enumC1779cl, C2354zl c2354zl) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1146Da
    /* renamed from: b */
    public final C1838f5 mo2829b() {
        return this.f6687b;
    }

    /* renamed from: c */
    public EnumC1565U5 mo2830c() {
        return EnumC1565U5.f5518c;
    }

    /* renamed from: d */
    public final void m4163d() {
        C1758c0 c1758c0 = this.f6694i;
        synchronized (c1758c0) {
            c1758c0.f5957a = new C2270wc();
        }
        this.f6695j.m3720a(this.f6694i.m3681a(), this.f6688c);
    }

    /* renamed from: e */
    public final synchronized void m4164e() {
        this.f6690e.m2841b();
    }

    /* renamed from: f */
    public final C1389N3 m4165f() {
        return this.f6704s;
    }

    /* renamed from: g */
    public final C2297xe m4166g() {
        return this.f6688c;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1146Da
    public final Context getContext() {
        return this.f6686a;
    }

    /* renamed from: h */
    public final C1417O6 m4167h() {
        return this.f6691f;
    }

    /* renamed from: i */
    public final C1344L8 m4168i() {
        return this.f6698m;
    }

    /* renamed from: j */
    public final C1668Y8 m4169j() {
        return this.f6693h;
    }

    /* renamed from: k */
    public final C1992l9 m4170k() {
        return this.f6700o;
    }

    /* renamed from: l */
    public final C2142r9 m4171l() {
        return this.f6702q;
    }

    /* renamed from: m */
    public final C1501Rg m4172m() {
        return (C1501Rg) this.f6697l.m4598a();
    }

    /* renamed from: n */
    public final String m4173n() {
        return this.f6688c.m4624i();
    }

    /* renamed from: o */
    public final C2123qf m4174o() {
        return this.f6699n;
    }

    /* renamed from: p */
    public final InterfaceC1493R8 m4175p() {
        return this.f6703r;
    }

    /* renamed from: q */
    public final C1075Ae m4176q() {
        return this.f6689d;
    }

    /* renamed from: r */
    public final C1703Zj m4177r() {
        return this.f6708w;
    }

    /* renamed from: s */
    public final C1903hk m4178s() {
        return this.f6696k;
    }

    /* renamed from: t */
    public final C2354zl m4179t() {
        C2354zl c2354zl;
        C2224ug c2224ug = this.f6697l;
        synchronized (c2224ug) {
            c2354zl = c2224ug.f7418c.f5309a;
        }
        return c2354zl;
    }

    /* renamed from: u */
    public final C1409Nn m4180u() {
        return this.f6707v;
    }

    /* renamed from: v */
    public final void m4181v() {
        C1992l9 c1992l9 = this.f6700o;
        int r12 = c1992l9.f6646k;
        c1992l9.f6648m = r12;
        c1992l9.f6636a.m4611a(r12).m4658b();
    }

    /* renamed from: w */
    public final void m4182w() {
        int optInt;
        int libraryApiLevel = AppMetrica.getLibraryApiLevel();
        C1409Nn c1409Nn = this.f6707v;
        synchronized (c1409Nn) {
            optInt = c1409Nn.f5142a.m3193a().optInt("last_migration_api_level", 0);
        }
        if (optInt < libraryApiLevel) {
            this.f6701p.getClass();
            Iterator it = AbstractC2480a.m4863D(new C1938j5(this)).iterator();
            while (it.hasNext()) {
                ((AbstractC1913i5) it.next()).m3980a(optInt);
            }
            this.f6707v.m3139b(libraryApiLevel);
        }
    }

    /* renamed from: x */
    public final boolean m4183x() {
        C1501Rg c1501Rg = (C1501Rg) this.f6697l.m4598a();
        return c1501Rg.f5345o && c1501Rg.isIdentifiersValid() && this.f6705t.didTimePassSeconds(this.f6700o.f6647l, c1501Rg.f5350t, "need to check permissions");
    }

    /* renamed from: y */
    public final boolean m4184y() {
        C1992l9 c1992l9 = this.f6700o;
        return c1992l9.f6648m < c1992l9.f6646k && ((C1501Rg) this.f6697l.m4598a()).f5346p && ((C1501Rg) this.f6697l.m4598a()).isIdentifiersValid();
    }

    /* renamed from: z */
    public final void m4185z() {
        C2224ug c2224ug = this.f6697l;
        synchronized (c2224ug) {
            c2224ug.f7416a = null;
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1421Oa
    /* renamed from: a */
    public final void mo3169a(C1615W5 c1615w5) {
        if (this.f6699n.f5471b) {
            this.f6699n.m4357a(c1615w5, "Event received on service");
        }
        String str = this.f6687b.f6193b;
        if (TextUtils.isEmpty(str) || "-1".equals(str)) {
            return;
        }
        this.f6692g.m3505a(c1615w5, new C1627Wh());
    }

    /* renamed from: b */
    public final void m4162b(C1615W5 c1615w5) {
        this.f6694i.m3682a(c1615w5.f5626f);
        C1733b0 m3681a = this.f6694i.m3681a();
        C1783d0 c1783d0 = this.f6695j;
        C2297xe c2297xe = this.f6688c;
        synchronized (c1783d0) {
            if (m3681a.f5899b > c2297xe.m4616d().f5899b) {
                c2297xe.m4613a(m3681a).m4658b();
                if (this.f6699n.f5471b) {
                    this.f6699n.m3359a(4, "Save new app environment for %s. Value: %s", this.f6687b, m3681a.f5898a);
                }
            }
        }
    }

    public C2013m5(Context context, C1838f5 c1838f5, C1783d0 c1783d0, TimePassedChecker timePassedChecker, C2138r5 c2138r5) {
        this.f6686a = context.getApplicationContext();
        this.f6687b = c1838f5;
        this.f6695j = c1783d0;
        this.f6705t = timePassedChecker;
        C1409Nn m4386f = c2138r5.m4386f();
        this.f6707v = m4386f;
        this.f6706u = C2018ma.m4192h().m4210q();
        C2224ug m4380a = c2138r5.m4380a(this);
        this.f6697l = m4380a;
        C2123qf m4276a = c2138r5.m4384d().m4276a();
        this.f6699n = m4276a;
        C2297xe m4341a = c2138r5.m4385e().m4341a();
        this.f6688c = m4341a;
        this.f6689d = C2018ma.m4192h().m4216w();
        C1758c0 m3719a = c1783d0.m3719a(c1838f5, m4276a, m4341a);
        this.f6694i = m3719a;
        this.f6698m = c2138r5.m4377a();
        C1417O6 m4381b = c2138r5.m4381b(this);
        this.f6691f = m4381b;
        C1701Zh m4383d = c2138r5.m4383d(this);
        this.f6690e = m4383d;
        this.f6701p = C2138r5.m4375b();
        C2245vc m4374a = C2138r5.m4374a(m4381b, m4380a);
        C1216G5 m4370a = C2138r5.m4370a(m4381b);
        this.f6703r = m4370a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(m4374a);
        arrayList.add(m4370a);
        this.f6702q = C2138r5.m4373a(arrayList, this);
        m4182w();
        C1903hk m4372a = C2138r5.m4372a(this, m4386f, new C1988l5(this));
        this.f6696k = m4372a;
        if (m4276a.m3367b()) {
            m4276a.m3366b("Read app environment for component %s. Value: %s", c1838f5.toString(), m3719a.m3681a().f5898a);
        }
        C1703Zj m4382c = c2138r5.m4382c();
        this.f6708w = m4382c;
        this.f6700o = c2138r5.m4379a(m4341a, m4386f, m4372a, m4381b, m3719a, m4382c, m4383d);
        C1668Y8 m4376c = C2138r5.m4376c(this);
        this.f6693h = m4376c;
        this.f6692g = C2138r5.m4371a(this, m4376c);
        this.f6704s = c2138r5.m4378a(m4341a);
        m4381b.m3165d();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1421Oa, io.appmetrica.analytics.impl.InterfaceC1146Da
    /* renamed from: a */
    public synchronized void mo2828a(C1265I4 r3) {
        try {
            this.f6697l.m3596a(r3);
            if (Boolean.TRUE.equals(r3.f4845h)) {
                this.f6699n.f5471b = true;
            } else {
                if (Boolean.FALSE.equals(r3.f4845h)) {
                    this.f6699n.f5471b = false;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1421Oa, io.appmetrica.analytics.impl.InterfaceC1954jl
    /* renamed from: a */
    public synchronized void mo3171a(C2354zl c2354zl) {
        this.f6697l.m4600a(c2354zl);
        this.f6702q.m4398b();
    }

    /* renamed from: a */
    public final void m4161a(String str) {
        this.f6688c.m4625j(str).m4658b();
    }
}
