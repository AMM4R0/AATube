package io.appmetrica.analytics.impl;

import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.ul */
/* loaded from: classes.dex */
public final class C2229ul extends C1540T5 {

    /* renamed from: d */
    public List f7229d;

    /* renamed from: e */
    public List f7230e;

    /* renamed from: f */
    public String f7231f;

    /* renamed from: g */
    public String f7232g;

    /* renamed from: h */
    public Map f7233h;

    /* renamed from: i */
    public C1513S3 f7234i;

    /* renamed from: j */
    public List f7235j;

    /* renamed from: k */
    public boolean f7236k;

    /* renamed from: l */
    public boolean f7237l;

    /* renamed from: m */
    public String f7238m;

    /* renamed from: n */
    public long f7239n;

    /* renamed from: o */
    public final C1451Pf f7240o;

    /* renamed from: p */
    public final C1268I7 f7241p;

    public C2229ul() {
        this(C2018ma.m4192h().m4211r(), new C1268I7());
    }

    /* renamed from: a */
    public final long m4486a(long j2) {
        if (this.f7239n == 0) {
            this.f7239n = j2;
        }
        return this.f7239n;
    }

    /* renamed from: c */
    public final C1513S3 m4490c() {
        return this.f7234i;
    }

    /* renamed from: d */
    public final Map<String, String> m4491d() {
        return this.f7233h;
    }

    /* renamed from: e */
    public final String m4492e() {
        return this.f7238m;
    }

    /* renamed from: f */
    public final String m4493f() {
        return this.f7231f;
    }

    /* renamed from: g */
    public final long m4494g() {
        return this.f7239n;
    }

    /* renamed from: h */
    public final String m4495h() {
        return this.f7232g;
    }

    /* renamed from: i */
    public final List<String> m4496i() {
        return this.f7235j;
    }

    /* renamed from: j */
    public final C1451Pf m4497j() {
        return this.f7240o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
    
        if (r4 != null) goto L38;
     */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<java.lang.String> m4498k() {
        /*
            r9 = this;
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.List r1 = r9.f7229d
            boolean r1 = io.appmetrica.analytics.impl.AbstractC2356zn.m4702a(r1)
            if (r1 != 0) goto L12
            java.util.List r1 = r9.f7229d
            r0.addAll(r1)
        L12:
            java.util.List r1 = r9.f7230e
            boolean r1 = io.appmetrica.analytics.impl.AbstractC2356zn.m4702a(r1)
            if (r1 != 0) goto L1f
            java.util.List r1 = r9.f7230e
            r0.addAll(r1)
        L1f:
            io.appmetrica.analytics.impl.I7 r1 = r9.f7241p
            io.appmetrica.analytics.impl.om r1 = r1.f4855a
            java.lang.Object r1 = r1.m3832a()
            java.lang.String[] r1 = (java.lang.String[]) r1
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L55
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r5 = r1.length
            r6 = r2
        L34:
            if (r6 >= r5) goto L4a
            r7 = r1[r6]
            if (r7 == 0) goto L41
            boolean r8 = p002A1.AbstractC0025r.m152E(r7)
            if (r8 != 0) goto L41
            goto L42
        L41:
            r7 = r3
        L42:
            if (r7 == 0) goto L47
            r4.add(r7)
        L47:
            int r6 = r6 + 1
            goto L34
        L4a:
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L51
            goto L52
        L51:
            r4 = r3
        L52:
            if (r4 == 0) goto L55
            goto L73
        L55:
            java.lang.String[] r1 = io.appmetrica.analytics.BuildConfig.DEFAULT_HOSTS
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r5 = r1.length
        L5d:
            if (r2 >= r5) goto L73
            r6 = r1[r2]
            if (r6 == 0) goto L6a
            boolean r7 = p002A1.AbstractC0025r.m152E(r6)
            if (r7 != 0) goto L6a
            goto L6b
        L6a:
            r6 = r3
        L6b:
            if (r6 == 0) goto L70
            r4.add(r6)
        L70:
            int r2 = r2 + 1
            goto L5d
        L73:
            r0.addAll(r4)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C2229ul.m4498k():java.util.List");
    }

    /* renamed from: l */
    public final List<String> m4499l() {
        return this.f7230e;
    }

    /* renamed from: m */
    public final List<String> m4500m() {
        return this.f7229d;
    }

    /* renamed from: n */
    public final boolean m4501n() {
        return this.f7236k;
    }

    /* renamed from: o */
    public final boolean m4502o() {
        return this.f7237l;
    }

    @Override // io.appmetrica.analytics.impl.C1540T5, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig
    public final String toString() {
        return "StartupRequestConfig{mStartupHostsFromStartup=" + this.f7229d + ", mStartupHostsFromClient=" + this.f7230e + ", mDistributionReferrer='" + this.f7231f + "', mInstallReferrerSource='" + this.f7232g + "', mClidsFromClient=" + this.f7233h + ", mNewCustomHosts=" + this.f7235j + ", mHasNewCustomHosts=" + this.f7236k + ", mSuccessfulStartup=" + this.f7237l + ", mCountryInit='" + this.f7238m + "', mFirstStartupTime=" + this.f7239n + "} " + super.toString();
    }

    public C2229ul(C1451Pf c1451Pf, C1268I7 r5) {
        this.f7234i = new C1513S3(null, EnumC1517S7.f5405c);
        this.f7239n = 0L;
        this.f7240o = c1451Pf;
        this.f7241p = r5;
    }

    /* renamed from: a */
    public final void m4488a(List<String> list) {
        this.f7235j = list;
    }

    /* renamed from: a */
    public final void m4489a(boolean z2) {
        this.f7236k = z2;
    }

    /* renamed from: a */
    public final void m4487a(String str) {
        this.f7238m = str;
    }
}
