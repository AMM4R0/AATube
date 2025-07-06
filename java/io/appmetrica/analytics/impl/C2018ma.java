package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceProvider;
import io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier;
import io.appmetrica.analytics.locationapi.internal.LocationClient;

/* renamed from: io.appmetrica.analytics.impl.ma */
/* loaded from: classes.dex */
public final class C2018ma {

    /* renamed from: C */
    public static volatile C2018ma f6725C;

    /* renamed from: a */
    public final Context f6728a;

    /* renamed from: b */
    public volatile C1451Pf f6729b;

    /* renamed from: c */
    public volatile C1267I6 f6730c;

    /* renamed from: e */
    public volatile C1936j3 f6732e;

    /* renamed from: f */
    public volatile C1503Ri f6733f;

    /* renamed from: g */
    public volatile C1534T f6734g;

    /* renamed from: h */
    public volatile C1835f2 f6735h;

    /* renamed from: i */
    public volatile PlatformIdentifiers f6736i;

    /* renamed from: j */
    public volatile C1574Ue f6737j;

    /* renamed from: k */
    public volatile C1712a4 f6738k;

    /* renamed from: l */
    public volatile C1075Ae f6739l;

    /* renamed from: m */
    public volatile C1484Qn f6740m;

    /* renamed from: n */
    public volatile C1304Ji f6741n;

    /* renamed from: o */
    public volatile C2294xb f6742o;

    /* renamed from: p */
    public C1555Tk f6743p;

    /* renamed from: r */
    public volatile C1405Nj f6745r;

    /* renamed from: w */
    public volatile InterfaceC1097Bb f6750w;

    /* renamed from: x */
    public volatile C1183Em f6751x;

    /* renamed from: y */
    public volatile C1381Mk f6752y;

    /* renamed from: z */
    public volatile C1796dd f6753z;

    /* renamed from: q */
    public final C1993la f6744q = new C1993la();

    /* renamed from: s */
    public final C1198Fc f6746s = new C1198Fc();

    /* renamed from: t */
    public final C1248Hc f6747t = new C1248Hc();

    /* renamed from: u */
    public final C1107Bl f6748u = new C1107Bl();

    /* renamed from: v */
    public final C1155Dj f6749v = new C1155Dj();

    /* renamed from: A */
    public final C2196td f6726A = new C2196td();

    /* renamed from: B */
    public final UtilityServiceProvider f6727B = new UtilityServiceProvider();

    /* renamed from: d */
    public final C1280Ij f6731d = new C1280Ij();

    public C2018ma(Context context) {
        this.f6728a = context;
    }

    /* renamed from: a */
    public static void m4191a(Context context) {
        if (f6725C == null) {
            synchronized (C2018ma.class) {
                try {
                    if (f6725C == null) {
                        f6725C = new C2018ma(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: h */
    public static C2018ma m4192h() {
        return f6725C;
    }

    /* renamed from: A */
    public final synchronized C1484Qn m4193A() {
        try {
            if (this.f6740m == null) {
                this.f6740m = new C1484Qn(this.f6728a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f6740m;
    }

    /* renamed from: B */
    public final void m4194B() {
        if (this.f6737j == null) {
            synchronized (this) {
                try {
                    if (this.f6737j == null) {
                        AbstractC2030mm m4116a = C2005lm.m4116a(C1175Ee.class);
                        Context context = this.f6728a;
                        ProtobufStateStorage<Object> mo3837a = m4116a.mo3837a(context, m4116a.mo3838c(context));
                        C1175Ee c1175Ee = (C1175Ee) mo3837a.read();
                        this.f6737j = new C1574Ue(this.f6728a, mo3837a, new C1350Le(), new C1125Ce(c1175Ee), new C1549Te(), new C1325Ke(this.f6728a), new C1450Pe(m4192h().m4216w()), new C1200Fe(), c1175Ee, "[PreloadInfoStorage]");
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: b */
    public final C1835f2 m4196b() {
        C1835f2 c1835f2 = this.f6735h;
        if (c1835f2 == null) {
            synchronized (this) {
                try {
                    c1835f2 = this.f6735h;
                    if (c1835f2 == null) {
                        c1835f2 = new C1835f2(this.f6728a, AbstractC1860g2.m3844a());
                        this.f6735h = c1835f2;
                    }
                } finally {
                }
            }
        }
        return c1835f2;
    }

    /* renamed from: c */
    public final C2035n2 m4197c() {
        return m4202i().f7428b;
    }

    /* renamed from: d */
    public final C1712a4 m4198d() {
        if (this.f6738k == null) {
            synchronized (this) {
                try {
                    if (this.f6738k == null) {
                        AbstractC2030mm m4116a = C2005lm.m4116a(C1538T3.class);
                        Context context = this.f6728a;
                        ProtobufStateStorage<Object> mo3837a = m4116a.mo3837a(context, m4116a.mo3838c(context));
                        this.f6738k = new C1712a4(this.f6728a, mo3837a, new C1737b4(), new C1414O3(), new C1812e4(), new C2276wi(this.f6728a), new C1762c4(m4216w()), new C1439P3(), (C1538T3) mo3837a.read(), "[ClidsInfoStorage]");
                    }
                } finally {
                }
            }
        }
        return this.f6738k;
    }

    /* renamed from: e */
    public final Context m4199e() {
        return this.f6728a;
    }

    /* renamed from: f */
    public final C1267I6 m4200f() {
        if (this.f6730c == null) {
            synchronized (this) {
                try {
                    if (this.f6730c == null) {
                        this.f6730c = new C1267I6(new C1242H6(m4216w()));
                    }
                } finally {
                }
            }
        }
        return this.f6730c;
    }

    /* renamed from: g */
    public final PermissionExtractor m4201g() {
        C1381Mk c1381Mk = this.f6752y;
        if (c1381Mk != null) {
            return c1381Mk;
        }
        synchronized (this) {
            try {
                C1381Mk c1381Mk2 = this.f6752y;
                if (c1381Mk2 != null) {
                    return c1381Mk2;
                }
                C1381Mk c1381Mk3 = new C1381Mk(m4206m().f5137c.getAskForPermissionStrategy());
                this.f6752y = c1381Mk3;
                return c1381Mk3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: i */
    public final C2294xb m4202i() {
        C2294xb c2294xb = this.f6742o;
        if (c2294xb == null) {
            synchronized (this) {
                try {
                    c2294xb = this.f6742o;
                    if (c2294xb == null) {
                        c2294xb = new C2294xb(new C1861g3(this.f6728a, this.f6731d.m2962a()), new C2035n2());
                        this.f6742o = c2294xb;
                    }
                } finally {
                }
            }
        }
        return c2294xb;
    }

    /* renamed from: j */
    public final InterfaceC1097Bb m4203j() {
        InterfaceC1097Bb interfaceC1097Bb = this.f6750w;
        if (interfaceC1097Bb == null) {
            synchronized (this) {
                try {
                    interfaceC1097Bb = this.f6750w;
                    if (interfaceC1097Bb == null) {
                        Context context = this.f6728a;
                        LocationClient locationClient = (LocationClient) ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor("io.appmetrica.analytics.location.internal.LocationClientImpl", LocationClient.class);
                        interfaceC1097Bb = locationClient == null ? new C1147Db() : new C1122Cb(context, new C1322Kb(), locationClient);
                        this.f6750w = interfaceC1097Bb;
                    }
                } finally {
                }
            }
        }
        return interfaceC1097Bb;
    }

    /* renamed from: k */
    public final InterfaceC1097Bb m4204k() {
        return m4203j();
    }

    /* renamed from: l */
    public final C1248Hc m4205l() {
        return this.f6747t;
    }

    /* renamed from: m */
    public final C1405Nj m4206m() {
        C1405Nj c1405Nj = this.f6745r;
        if (c1405Nj == null) {
            synchronized (this) {
                try {
                    c1405Nj = this.f6745r;
                    if (c1405Nj == null) {
                        c1405Nj = new C1405Nj();
                        this.f6745r = c1405Nj;
                    }
                } finally {
                }
            }
        }
        return c1405Nj;
    }

    /* renamed from: n */
    public final C1796dd m4207n() {
        C1796dd c1796dd = this.f6753z;
        if (c1796dd == null) {
            synchronized (this) {
                try {
                    c1796dd = this.f6753z;
                    if (c1796dd == null) {
                        c1796dd = new C1796dd(this.f6728a, new C1109Bn());
                        this.f6753z = c1796dd;
                    }
                } finally {
                }
            }
        }
        return c1796dd;
    }

    /* renamed from: o */
    public final C2196td m4208o() {
        return this.f6726A;
    }

    /* renamed from: p */
    public final PlatformIdentifiers m4209p() {
        PlatformIdentifiers platformIdentifiers = this.f6736i;
        if (platformIdentifiers == null) {
            synchronized (this) {
                try {
                    platformIdentifiers = this.f6736i;
                    if (platformIdentifiers == null) {
                        platformIdentifiers = new PlatformIdentifiers(m4215v(), m4196b());
                        this.f6736i = platformIdentifiers;
                    }
                } finally {
                }
            }
        }
        return platformIdentifiers;
    }

    /* renamed from: q */
    public final C1574Ue m4210q() {
        m4194B();
        return this.f6737j;
    }

    /* renamed from: r */
    public final C1451Pf m4211r() {
        if (this.f6729b == null) {
            synchronized (this) {
                try {
                    if (this.f6729b == null) {
                        this.f6729b = new C1451Pf(this.f6728a, f6725C.m4193A().f5266c);
                    }
                } finally {
                }
            }
        }
        return this.f6729b;
    }

    /* renamed from: s */
    public final C1304Ji m4212s() {
        C1304Ji c1304Ji = this.f6741n;
        if (c1304Ji == null) {
            synchronized (this) {
                try {
                    c1304Ji = this.f6741n;
                    if (c1304Ji == null) {
                        c1304Ji = new C1304Ji(this.f6728a);
                        this.f6741n = c1304Ji;
                    }
                } finally {
                }
            }
        }
        return c1304Ji;
    }

    /* renamed from: t */
    public final synchronized C1503Ri m4213t() {
        return this.f6733f;
    }

    /* renamed from: u */
    public final C1280Ij m4214u() {
        return this.f6731d;
    }

    /* renamed from: v */
    public final C1534T m4215v() {
        C1534T c1534t = this.f6734g;
        if (c1534t == null) {
            synchronized (this) {
                try {
                    c1534t = this.f6734g;
                    if (c1534t == null) {
                        c1534t = new C1534T(new C1460Q(), new C1385N(), new C1360M(), this.f6731d.m2962a(), "ServiceInternal");
                        this.f6748u.m2779a(c1534t);
                        this.f6734g = c1534t;
                    }
                } finally {
                }
            }
        }
        return c1534t;
    }

    /* renamed from: w */
    public final C1075Ae m4216w() {
        if (this.f6739l == null) {
            synchronized (this) {
                try {
                    if (this.f6739l == null) {
                        this.f6739l = new C1075Ae(C1765c7.m3695a(this.f6728a).m3700c());
                    }
                } finally {
                }
            }
        }
        return this.f6739l;
    }

    /* renamed from: x */
    public final synchronized InterfaceC1761c3 m4217x() {
        try {
            if (this.f6743p == null) {
                C1555Tk c1555Tk = new C1555Tk(this.f6728a);
                this.f6743p = c1555Tk;
                this.f6748u.m2779a(c1555Tk);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f6743p;
    }

    /* renamed from: y */
    public final C1107Bl m4218y() {
        return this.f6748u;
    }

    /* renamed from: z */
    public final C1183Em m4219z() {
        C1183Em c1183Em = this.f6751x;
        if (c1183Em == null) {
            synchronized (this) {
                try {
                    c1183Em = this.f6751x;
                    if (c1183Em == null) {
                        c1183Em = new C1183Em(this.f6728a);
                        this.f6751x = c1183Em;
                    }
                } finally {
                }
            }
        }
        return c1183Em;
    }

    /* renamed from: a */
    public final WaitForActivationDelayBarrier m4195a() {
        return this.f6727B.getActivationBarrier();
    }
}
