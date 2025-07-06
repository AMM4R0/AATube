package io.appmetrica.analytics.impl;

import android.content.ContentValues;

/* renamed from: io.appmetrica.analytics.impl.M8 */
/* loaded from: classes.dex */
public final class C1369M8 {

    /* renamed from: a */
    public final String f5031a;

    /* renamed from: b */
    public String f5032b;

    /* renamed from: c */
    public final Long f5033c;

    /* renamed from: d */
    public final Long f5034d;

    /* renamed from: e */
    public final Long f5035e;

    /* renamed from: f */
    public final Long f5036f;

    /* renamed from: g */
    public final C2015m7 f5037g;

    /* renamed from: h */
    public final EnumC1670Ya f5038h;

    /* renamed from: i */
    public final Integer f5039i;

    /* renamed from: j */
    public final String f5040j;

    /* renamed from: k */
    public final Integer f5041k;

    /* renamed from: l */
    public final Integer f5042l;

    /* renamed from: m */
    public final String f5043m;

    /* renamed from: n */
    public final String f5044n;

    /* renamed from: o */
    public final EnumC1244H8 f5045o;

    /* renamed from: p */
    public final EnumC1768ca f5046p;

    /* renamed from: q */
    public final EnumC2042n9 f5047q;

    /* renamed from: r */
    public final Boolean f5048r;

    /* renamed from: s */
    public final Integer f5049s;

    /* renamed from: t */
    public final byte[] f5050t;

    public C1369M8(ContentValues contentValues) {
        C1915i7 model = new C1940j7(null, 1, 0 == true ? 1 : 0).toModel(contentValues);
        this.f5031a = model.m3989a().m3923j();
        this.f5032b = model.m3989a().m3929p();
        this.f5033c = model.m3991c();
        this.f5034d = model.m3990b();
        this.f5035e = model.m3989a().m3924k();
        this.f5036f = model.m3992d();
        this.f5037g = model.m3989a().m3922i();
        this.f5038h = model.m3993e();
        this.f5039i = model.m3989a().m3917d();
        this.f5040j = model.m3989a().m3919f();
        this.f5041k = model.m3989a().m3928o();
        this.f5042l = model.m3989a().m3916c();
        this.f5043m = model.m3989a().m3915b();
        this.f5044n = model.m3989a().m3926m();
        EnumC1244H8 m3918e = model.m3989a().m3918e();
        this.f5045o = m3918e == null ? EnumC1244H8.m2926a(null) : m3918e;
        EnumC1768ca m3921h = model.m3989a().m3921h();
        this.f5046p = m3921h == null ? EnumC1768ca.m3712a(null) : m3921h;
        this.f5047q = model.m3989a().m3927n();
        this.f5048r = model.m3989a().m3914a();
        this.f5049s = model.m3989a().m3925l();
        this.f5050t = model.m3989a().m3920g();
    }
}
