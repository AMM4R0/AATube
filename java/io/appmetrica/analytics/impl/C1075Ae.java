package io.appmetrica.analytics.impl;

import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.Ae */
/* loaded from: classes.dex */
public final class C1075Ae extends AbstractC1871gd implements InterfaceC1508Rn {

    /* renamed from: d */
    public static final C2347ze f4465d = new C2347ze("LOCATION_TRACKING_ENABLED", null);

    /* renamed from: e */
    public static final C2347ze f4466e = new C2347ze("PREF_KEY_OFFSET", null);

    /* renamed from: f */
    public static final C2347ze f4467f = new C2347ze("UNCHECKED_TIME", null);

    /* renamed from: g */
    public static final C2347ze f4468g = new C2347ze("STATISTICS_RESTRICTED_IN_MAIN", null);

    /* renamed from: h */
    public static final C2347ze f4469h = new C2347ze("LAST_IDENTITY_LIGHT_SEND_TIME", null);

    /* renamed from: i */
    public static final C2347ze f4470i = new C2347ze("NEXT_REPORT_SEND_ATTEMPT_NUMBER", null);

    /* renamed from: j */
    public static final C2347ze f4471j = new C2347ze("NEXT_LOCATION_SEND_ATTEMPT_NUMBER", null);

    /* renamed from: k */
    public static final C2347ze f4472k = new C2347ze("NEXT_STARTUP_SEND_ATTEMPT_NUMBER", null);

    /* renamed from: l */
    public static final C2347ze f4473l = new C2347ze("LAST_REPORT_SEND_ATTEMPT_TIME", null);

    /* renamed from: m */
    public static final C2347ze f4474m = new C2347ze("LAST_LOCATION_SEND_ATTEMPT_TIME", null);

    /* renamed from: n */
    public static final C2347ze f4475n = new C2347ze("LAST_STARTUP_SEND_ATTEMPT_TIME", null);

    /* renamed from: o */
    public static final C2347ze f4476o = new C2347ze("SATELLITE_PRELOAD_INFO_CHECKED", null);

    /* renamed from: p */
    public static final C2347ze f4477p = new C2347ze("SATELLITE_CLIDS_CHECKED", null);

    /* renamed from: q */
    public static final C2347ze f4478q = new C2347ze("VITAL_DATA", null);

    /* renamed from: r */
    public static final C2347ze f4479r = new C2347ze("LAST_KOTLIN_VERSION_SEND_TIME", null);

    public C1075Ae(InterfaceC1221Ga interfaceC1221Ga) {
        super(interfaceC1221Ga);
    }

    /* renamed from: a */
    public final long m2709a(int r4) {
        return this.f7497a.getLong(f4466e.f7524b, r4);
    }

    /* renamed from: b */
    public final C1075Ae m2718b(boolean z2) {
        return (C1075Ae) m4657b(f4468g.f7524b, z2);
    }

    /* renamed from: c */
    public final C1075Ae m2720c(boolean z2) {
        return (C1075Ae) m4657b(f4467f.f7524b, z2);
    }

    /* renamed from: d */
    public final void m2724d(boolean z2) {
        m4657b(f4465d.f7524b, z2).m4658b();
    }

    /* renamed from: e */
    public final boolean m2725e() {
        return this.f7497a.getBoolean(f4465d.f7524b, false);
    }

    /* renamed from: f */
    public final long m2726f() {
        return this.f7497a.getLong(f4479r.f7524b, 0L);
    }

    /* renamed from: g */
    public final C1075Ae m2728g() {
        return (C1075Ae) m4657b(f4477p.f7524b, true);
    }

    /* renamed from: h */
    public final C1075Ae m2729h() {
        return (C1075Ae) m4657b(f4476o.f7524b, true);
    }

    /* renamed from: i */
    public final boolean m2730i() {
        return this.f7497a.getBoolean(f4476o.f7524b, false);
    }

    /* renamed from: j */
    public final boolean m2731j() {
        return this.f7497a.getBoolean(f4477p.f7524b, false);
    }

    /* renamed from: a */
    public final boolean m2714a(boolean z2) {
        return this.f7497a.getBoolean(f4467f.f7524b, z2);
    }

    /* renamed from: b */
    public final C1075Ae m2715b(long j2) {
        return (C1075Ae) m4655b(f4469h.f7524b, j2);
    }

    /* renamed from: c */
    public final C1075Ae m2719c(long j2) {
        return (C1075Ae) m4655b(f4479r.f7524b, j2);
    }

    /* renamed from: d */
    public final C1075Ae m2722d(long j2) {
        return (C1075Ae) m4655b(f4466e.f7524b, j2);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC1871gd
    /* renamed from: f */
    public final String mo2727f(String str) {
        return new C2347ze(str, null).f7524b;
    }

    /* renamed from: a */
    public final long m2710a(long j2) {
        return this.f7497a.getLong(f4469h.f7524b, j2);
    }

    /* renamed from: b */
    public final C1075Ae m2716b(EnumC2246vd enumC2246vd, int r3) {
        C2347ze c2347ze;
        int ordinal = enumC2246vd.ordinal();
        if (ordinal == 0) {
            c2347ze = f4470i;
        } else if (ordinal != 1) {
            c2347ze = ordinal != 2 ? null : f4472k;
        } else {
            c2347ze = f4471j;
        }
        return c2347ze != null ? (C1075Ae) m4654b(c2347ze.f7524b, r3) : this;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC2322ye
    /* renamed from: c */
    public final Set<String> mo2721c() {
        return this.f7497a.mo2904a();
    }

    /* renamed from: d */
    public final Boolean m2723d() {
        C2347ze c2347ze = f4468g;
        if (!this.f7497a.mo2905a(c2347ze.f7524b)) {
            return null;
        }
        return Boolean.valueOf(this.f7497a.getBoolean(c2347ze.f7524b, true));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1508Rn
    /* renamed from: a */
    public final String mo2712a() {
        return this.f7497a.getString(f4478q.f7524b, null);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1508Rn
    /* renamed from: a */
    public final void mo2713a(String str) {
        m4656b(f4478q.f7524b, str).m4658b();
    }

    /* renamed from: b */
    public final C1075Ae m2717b(EnumC2246vd enumC2246vd, long j2) {
        C2347ze c2347ze;
        int ordinal = enumC2246vd.ordinal();
        if (ordinal == 0) {
            c2347ze = f4473l;
        } else if (ordinal != 1) {
            c2347ze = ordinal != 2 ? null : f4475n;
        } else {
            c2347ze = f4474m;
        }
        return c2347ze != null ? (C1075Ae) m4655b(c2347ze.f7524b, j2) : this;
    }

    /* renamed from: a */
    public final int m2708a(EnumC2246vd enumC2246vd, int r3) {
        C2347ze c2347ze;
        int ordinal = enumC2246vd.ordinal();
        if (ordinal == 0) {
            c2347ze = f4470i;
        } else if (ordinal != 1) {
            c2347ze = ordinal != 2 ? null : f4472k;
        } else {
            c2347ze = f4471j;
        }
        if (c2347ze == null) {
            return r3;
        }
        return this.f7497a.getInt(c2347ze.f7524b, r3);
    }

    /* renamed from: a */
    public final long m2711a(EnumC2246vd enumC2246vd, long j2) {
        C2347ze c2347ze;
        int ordinal = enumC2246vd.ordinal();
        if (ordinal == 0) {
            c2347ze = f4473l;
        } else if (ordinal != 1) {
            c2347ze = ordinal != 2 ? null : f4475n;
        } else {
            c2347ze = f4474m;
        }
        if (c2347ze == null) {
            return j2;
        }
        return this.f7497a.getLong(c2347ze.f7524b, j2);
    }
}
