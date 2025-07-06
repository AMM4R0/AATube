package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.services.FrameworkDetector;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import p000A.AbstractC0002c;

/* renamed from: io.appmetrica.analytics.impl.p7 */
/* loaded from: classes.dex */
public final class C2090p7 {

    /* renamed from: a */
    public final String f6887a;

    /* renamed from: b */
    public final String f6888b;

    /* renamed from: c */
    public final String f6889c;

    /* renamed from: d */
    public final String f6890d;

    /* renamed from: e */
    public final String f6891e;

    /* renamed from: f */
    public final String f6892f;

    /* renamed from: g */
    public final String f6893g;

    /* renamed from: h */
    public final String f6894h;

    /* renamed from: i */
    public final String f6895i;

    /* renamed from: j */
    public final String f6896j;

    /* renamed from: k */
    public final String f6897k;

    /* renamed from: l */
    public final String f6898l;

    /* renamed from: m */
    public final String f6899m;

    /* renamed from: n */
    public final String f6900n;

    public C2090p7(C1769cb c1769cb) {
        this.f6887a = c1769cb.m3714b("dId");
        this.f6888b = c1769cb.m3714b("uId");
        this.f6889c = c1769cb.m3714b("analyticsSdkVersionName");
        this.f6890d = c1769cb.m3714b("kitBuildNumber");
        this.f6891e = c1769cb.m3714b("kitBuildType");
        this.f6892f = c1769cb.m3714b("appVer");
        this.f6893g = c1769cb.optString("app_debuggable", CommonUrlParts.Values.FALSE_INTEGER);
        this.f6894h = c1769cb.m3714b("appBuild");
        this.f6895i = c1769cb.m3714b("osVer");
        this.f6897k = c1769cb.m3714b("lang");
        this.f6898l = c1769cb.m3714b("root");
        this.f6899m = c1769cb.optString(CommonUrlParts.APP_FRAMEWORK, FrameworkDetector.framework());
        int optInt = c1769cb.optInt("osApiLev", -1);
        this.f6896j = optInt == -1 ? null : String.valueOf(optInt);
        int optInt2 = c1769cb.optInt("attribution_id", 0);
        this.f6900n = optInt2 > 0 ? String.valueOf(optInt2) : null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DbNetworkTaskConfig{deviceId='");
        sb.append(this.f6887a);
        sb.append("', uuid='");
        sb.append(this.f6888b);
        sb.append("', analyticsSdkVersionName='");
        sb.append(this.f6889c);
        sb.append("', kitBuildNumber='");
        sb.append(this.f6890d);
        sb.append("', kitBuildType='");
        sb.append(this.f6891e);
        sb.append("', appVersion='");
        sb.append(this.f6892f);
        sb.append("', appDebuggable='");
        sb.append(this.f6893g);
        sb.append("', appBuildNumber='");
        sb.append(this.f6894h);
        sb.append("', osVersion='");
        sb.append(this.f6895i);
        sb.append("', osApiLevel='");
        sb.append(this.f6896j);
        sb.append("', locale='");
        sb.append(this.f6897k);
        sb.append("', deviceRootStatus='");
        sb.append(this.f6898l);
        sb.append("', appFramework='");
        sb.append(this.f6899m);
        sb.append("', attributionId='");
        return AbstractC0002c.m17l(sb, this.f6900n, "'}");
    }

    public C2090p7() {
        this.f6887a = null;
        this.f6888b = null;
        this.f6889c = null;
        this.f6890d = null;
        this.f6891e = null;
        this.f6892f = null;
        this.f6893g = null;
        this.f6894h = null;
        this.f6895i = null;
        this.f6896j = null;
        this.f6897k = null;
        this.f6898l = null;
        this.f6899m = null;
        this.f6900n = null;
    }
}
