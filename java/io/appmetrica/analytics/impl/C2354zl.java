package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.zl */
/* loaded from: classes.dex */
public final class C2354zl {

    /* renamed from: A */
    public final C1656Xl f7536A;

    /* renamed from: B */
    public final Map f7537B;

    /* renamed from: C */
    public final C1095B9 f7538C;

    /* renamed from: a */
    public final String f7539a;

    /* renamed from: b */
    public final String f7540b;

    /* renamed from: c */
    public final C1157Dl f7541c;

    /* renamed from: d */
    public final String f7542d;

    /* renamed from: e */
    public final List f7543e;

    /* renamed from: f */
    public final List f7544f;

    /* renamed from: g */
    public final List f7545g;

    /* renamed from: h */
    public final Map f7546h;

    /* renamed from: i */
    public final String f7547i;

    /* renamed from: j */
    public final String f7548j;

    /* renamed from: k */
    public final String f7549k;

    /* renamed from: l */
    public final String f7550l;

    /* renamed from: m */
    public final String f7551m;

    /* renamed from: n */
    public final C1190F4 f7552n;

    /* renamed from: o */
    public final long f7553o;

    /* renamed from: p */
    public final boolean f7554p;

    /* renamed from: q */
    public final boolean f7555q;

    /* renamed from: r */
    public final String f7556r;

    /* renamed from: s */
    public final C1648Xd f7557s;

    /* renamed from: t */
    public final RetryPolicyConfig f7558t;

    /* renamed from: u */
    public final long f7559u;

    /* renamed from: v */
    public final long f7560v;

    /* renamed from: w */
    public final boolean f7561w;

    /* renamed from: x */
    public final BillingConfig f7562x;

    /* renamed from: y */
    public final C1164E3 f7563y;

    /* renamed from: z */
    public final C2160s2 f7564z;

    public C2354zl(String str, String str2, C1157Dl c1157Dl) {
        this.f7539a = str;
        this.f7540b = str2;
        this.f7541c = c1157Dl;
        this.f7542d = c1157Dl.f4651a;
        this.f7543e = c1157Dl.f4652b;
        this.f7544f = c1157Dl.f4656f;
        this.f7545g = c1157Dl.f4657g;
        this.f7546h = c1157Dl.f4659i;
        this.f7547i = c1157Dl.f4653c;
        this.f7548j = c1157Dl.f4654d;
        this.f7549k = c1157Dl.f4660j;
        this.f7550l = c1157Dl.f4661k;
        this.f7551m = c1157Dl.f4662l;
        this.f7552n = c1157Dl.f4663m;
        this.f7553o = c1157Dl.f4664n;
        this.f7554p = c1157Dl.f4665o;
        this.f7555q = c1157Dl.f4666p;
        this.f7556r = c1157Dl.f4667q;
        this.f7557s = c1157Dl.f4669s;
        this.f7558t = c1157Dl.f4670t;
        this.f7559u = c1157Dl.f4671u;
        this.f7560v = c1157Dl.f4672v;
        this.f7561w = c1157Dl.f4673w;
        this.f7562x = c1157Dl.f4674x;
        this.f7563y = c1157Dl.f4675y;
        this.f7564z = c1157Dl.f4676z;
        this.f7536A = c1157Dl.f4648A;
        this.f7537B = c1157Dl.f4649B;
        this.f7538C = c1157Dl.f4650C;
    }

    /* renamed from: a */
    public final C2304xl m4689a() {
        C1157Dl c1157Dl = this.f7541c;
        C1132Cl c1132Cl = new C1132Cl(c1157Dl.f4663m);
        c1132Cl.f4588a = c1157Dl.f4651a;
        c1132Cl.f4593f = c1157Dl.f4656f;
        c1132Cl.f4594g = c1157Dl.f4657g;
        c1132Cl.f4597j = c1157Dl.f4660j;
        c1132Cl.f4589b = c1157Dl.f4652b;
        c1132Cl.f4590c = c1157Dl.f4653c;
        c1132Cl.f4591d = c1157Dl.f4654d;
        c1132Cl.f4592e = c1157Dl.f4655e;
        c1132Cl.f4595h = c1157Dl.f4658h;
        c1132Cl.f4596i = c1157Dl.f4659i;
        c1132Cl.f4598k = c1157Dl.f4661k;
        c1132Cl.f4599l = c1157Dl.f4662l;
        c1132Cl.f4604q = c1157Dl.f4666p;
        c1132Cl.f4602o = c1157Dl.f4664n;
        c1132Cl.f4603p = c1157Dl.f4665o;
        c1132Cl.f4605r = c1157Dl.f4667q;
        c1132Cl.f4601n = c1157Dl.f4669s;
        c1132Cl.f4607t = c1157Dl.f4671u;
        c1132Cl.f4608u = c1157Dl.f4672v;
        c1132Cl.f4606s = c1157Dl.f4668r;
        c1132Cl.f4609v = c1157Dl.f4673w;
        c1132Cl.f4610w = c1157Dl.f4670t;
        c1132Cl.f4612y = c1157Dl.f4675y;
        c1132Cl.f4611x = c1157Dl.f4674x;
        c1132Cl.f4613z = c1157Dl.f4676z;
        c1132Cl.f4585A = c1157Dl.f4648A;
        c1132Cl.f4586B = c1157Dl.f4649B;
        c1132Cl.f4587C = c1157Dl.f4650C;
        C2304xl c2304xl = new C2304xl(c1132Cl);
        c2304xl.f7465b = this.f7539a;
        c2304xl.f7466c = this.f7540b;
        return c2304xl;
    }

    /* renamed from: b */
    public final String m4690b() {
        return this.f7539a;
    }

    /* renamed from: c */
    public final String m4691c() {
        return this.f7540b;
    }

    /* renamed from: d */
    public final long m4692d() {
        return this.f7560v;
    }

    /* renamed from: e */
    public final long m4693e() {
        return this.f7559u;
    }

    /* renamed from: f */
    public final String m4694f() {
        return this.f7542d;
    }

    public final String toString() {
        return "StartupState(deviceId=" + this.f7539a + ", deviceIdHash=" + this.f7540b + ", startupStateModel=" + this.f7541c + ')';
    }
}
