package io.appmetrica.analytics.impl;

import android.location.Location;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.Collection;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.Rg */
/* loaded from: classes.dex */
public final class C1501Rg extends C1540T5 {

    /* renamed from: d */
    public boolean f5334d;

    /* renamed from: e */
    public Location f5335e;

    /* renamed from: f */
    public boolean f5336f;

    /* renamed from: g */
    public int f5337g;

    /* renamed from: h */
    public int f5338h;

    /* renamed from: i */
    public boolean f5339i;

    /* renamed from: j */
    public int f5340j;

    /* renamed from: k */
    public Boolean f5341k;

    /* renamed from: l */
    public InterfaceC1427Og f5342l;

    /* renamed from: m */
    public final InterfaceC1477Qg f5343m;

    /* renamed from: n */
    public String f5344n;

    /* renamed from: o */
    public boolean f5345o;

    /* renamed from: p */
    public boolean f5346p;

    /* renamed from: q */
    public String f5347q;

    /* renamed from: r */
    public List f5348r;

    /* renamed from: s */
    public int f5349s;

    /* renamed from: t */
    public long f5350t;

    /* renamed from: u */
    public long f5351u;

    /* renamed from: v */
    public boolean f5352v;

    /* renamed from: w */
    public long f5353w;

    /* renamed from: x */
    public List f5354x;

    public C1501Rg(C2013m5 c2013m5) {
        this.f5343m = c2013m5;
    }

    /* renamed from: a */
    public final void m3266a(Location location) {
        this.f5335e = location;
    }

    /* renamed from: b */
    public final void m3272b(List<String> list) {
        this.f5348r = list;
    }

    /* renamed from: c */
    public final String m3274c() {
        return this.f5344n;
    }

    /* renamed from: d */
    public final void m3280d(boolean z2) {
        this.f5334d = z2;
    }

    /* renamed from: e */
    public final void m3282e(boolean z2) {
        this.f5339i = z2;
    }

    /* renamed from: f */
    public final void m3283f(boolean z2) {
        this.f5345o = z2;
    }

    /* renamed from: g */
    public final String m3285g() {
        return (String) WrapUtils.getOrDefault(this.f5347q, "");
    }

    /* renamed from: h */
    public final boolean m3286h() {
        return this.f5342l.mo3122a(this.f5341k);
    }

    /* renamed from: i */
    public final int m3287i() {
        return this.f5338h;
    }

    /* renamed from: j */
    public final Location m3288j() {
        return this.f5335e;
    }

    /* renamed from: k */
    public final long m3289k() {
        return this.f5353w;
    }

    /* renamed from: l */
    public final int m3290l() {
        return this.f5340j;
    }

    /* renamed from: m */
    public final long m3291m() {
        return this.f5350t;
    }

    /* renamed from: n */
    public final long m3292n() {
        return this.f5351u;
    }

    /* renamed from: o */
    public final List<String> m3293o() {
        return this.f5348r;
    }

    /* renamed from: p */
    public final int m3294p() {
        return this.f5337g;
    }

    /* renamed from: q */
    public final boolean m3295q() {
        return this.f5346p;
    }

    /* renamed from: r */
    public final boolean m3296r() {
        return this.f5336f;
    }

    /* renamed from: s */
    public final boolean m3297s() {
        return this.f5334d;
    }

    /* renamed from: t */
    public final boolean m3298t() {
        return this.f5345o;
    }

    @Override // io.appmetrica.analytics.impl.C1540T5, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig
    public final String toString() {
        return "ReportRequestConfig{mLocationTracking=" + this.f5334d + ", mManualLocation=" + this.f5335e + ", mFirstActivationAsUpdate=" + this.f5336f + ", mSessionTimeout=" + this.f5337g + ", mDispatchPeriod=" + this.f5338h + ", mLogEnabled=" + this.f5339i + ", mMaxReportsCount=" + this.f5340j + ", dataSendingEnabledFromArguments=" + this.f5341k + ", dataSendingStrategy=" + this.f5342l + ", mPreloadInfoSendingStrategy=" + this.f5343m + ", mApiKey='" + this.f5344n + "', mPermissionsCollectingEnabled=" + this.f5345o + ", mFeaturesCollectingEnabled=" + this.f5346p + ", mClidsFromStartupResponse='" + this.f5347q + "', mReportHosts=" + this.f5348r + ", mAttributionId=" + this.f5349s + ", mPermissionsCollectingIntervalSeconds=" + this.f5350t + ", mPermissionsForceSendIntervalSeconds=" + this.f5351u + ", mClidsFromClientMatchClidsFromStartupRequest=" + this.f5352v + ", mMaxReportsInDbCount=" + this.f5353w + ", mCertificates=" + this.f5354x + "} " + super.toString();
    }

    /* renamed from: u */
    public final boolean m3299u() {
        return isIdentifiersValid() && !AbstractC2356zn.m4702a((Collection) this.f5348r) && this.f5352v;
    }

    /* renamed from: v */
    public final boolean m3300v() {
        return ((C2013m5) this.f5343m).m4160B();
    }

    /* renamed from: a */
    public final void m3264a(int r12) {
        this.f5349s = r12;
    }

    /* renamed from: b */
    public final void m3271b(long j2) {
        this.f5350t = j2;
    }

    /* renamed from: c */
    public final void m3276c(long j2) {
        this.f5351u = j2;
    }

    /* renamed from: d */
    public final void m3279d(int r12) {
        this.f5337g = r12;
    }

    /* renamed from: e */
    public final List<String> m3281e() {
        return this.f5354x;
    }

    /* renamed from: f */
    public final boolean m3284f() {
        return this.f5352v;
    }

    /* renamed from: a */
    public final void m3265a(long j2) {
        this.f5353w = j2;
    }

    /* renamed from: b */
    public final void m3273b(boolean z2) {
        this.f5346p = z2;
    }

    /* renamed from: c */
    public final void m3277c(boolean z2) {
        this.f5336f = z2;
    }

    /* renamed from: d */
    public final int m3278d() {
        return this.f5349s;
    }

    /* renamed from: a */
    public final void m3268a(List<String> list) {
        this.f5354x = list;
    }

    /* renamed from: b */
    public final void m3270b(int r12) {
        this.f5338h = r12;
    }

    /* renamed from: c */
    public final void m3275c(int r12) {
        this.f5340j = r12;
    }

    /* renamed from: a */
    public final void m3267a(Boolean bool, InterfaceC1427Og interfaceC1427Og) {
        this.f5341k = bool;
        this.f5342l = interfaceC1427Og;
    }

    /* renamed from: a */
    public final void m3269a(boolean z2) {
        this.f5352v = z2;
    }
}
