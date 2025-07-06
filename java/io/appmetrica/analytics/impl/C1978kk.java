package io.appmetrica.analytics.impl;

import android.text.TextUtils;

/* renamed from: io.appmetrica.analytics.impl.kk */
/* loaded from: classes.dex */
public final class C1978kk {

    /* renamed from: d */
    public static final String f6593d = "SESSION_SLEEP_START";

    /* renamed from: e */
    public static final String f6594e = "SESSION_LAST_EVENT_OFFSET";

    /* renamed from: f */
    public static final String f6595f = "SESSION_ID";

    /* renamed from: g */
    public static final String f6596g = "SESSION_COUNTER_ID";

    /* renamed from: h */
    public static final String f6597h = "SESSION_INIT_TIME";

    /* renamed from: i */
    public static final String f6598i = "SESSION_IS_ALIVE_REPORT_NEEDED";

    /* renamed from: a */
    public final String f6599a;

    /* renamed from: b */
    protected final C2297xe f6600b;

    /* renamed from: c */
    public C1769cb f6601c;

    public C1978kk(C2297xe c2297xe, String str) {
        this.f6600b = c2297xe;
        this.f6599a = str;
        C1769cb c1769cb = new C1769cb();
        try {
            String m4622h = c2297xe.m4622h(str);
            if (!TextUtils.isEmpty(m4622h)) {
                c1769cb = new C1769cb(m4622h);
            }
        } catch (Throwable unused) {
        }
        this.f6601c = c1769cb;
    }

    /* renamed from: a */
    public final C1978kk m4061a(long j2) {
        m4064a(f6597h, Long.valueOf(j2));
        return this;
    }

    /* renamed from: b */
    public final C1978kk m4065b(long j2) {
        m4064a(f6594e, Long.valueOf(j2));
        return this;
    }

    /* renamed from: c */
    public final Long m4068c() {
        return this.f6601c.m3713a(f6597h);
    }

    /* renamed from: d */
    public final C1978kk m4069d(long j2) {
        m4064a(f6595f, Long.valueOf(j2));
        return this;
    }

    /* renamed from: e */
    public final Long m4072e() {
        return this.f6601c.m3713a(f6596g);
    }

    /* renamed from: f */
    public final Long m4073f() {
        return this.f6601c.m3713a(f6595f);
    }

    /* renamed from: g */
    public final Long m4074g() {
        return this.f6601c.m3713a(f6593d);
    }

    /* renamed from: h */
    public final boolean m4075h() {
        return this.f6601c.length() > 0;
    }

    /* renamed from: i */
    public final Boolean m4076i() {
        C1769cb c1769cb = this.f6601c;
        c1769cb.getClass();
        try {
            return Boolean.valueOf(c1769cb.getBoolean(f6598i));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final C1978kk m4062a(boolean z2) {
        m4064a(f6598i, Boolean.valueOf(z2));
        return this;
    }

    /* renamed from: b */
    public final void m4066b() {
        this.f6600b.m4617e(this.f6599a, this.f6601c.toString());
        this.f6600b.m4658b();
    }

    /* renamed from: c */
    public final C1978kk m4067c(long j2) {
        m4064a(f6596g, Long.valueOf(j2));
        return this;
    }

    /* renamed from: d */
    public final Long m4070d() {
        return this.f6601c.m3713a(f6594e);
    }

    /* renamed from: e */
    public final C1978kk m4071e(long j2) {
        m4064a(f6593d, Long.valueOf(j2));
        return this;
    }

    /* renamed from: a */
    public final void m4064a(String str, Object obj) {
        try {
            this.f6601c.put(str, obj);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final void m4063a() {
        this.f6601c = new C1769cb();
        m4066b();
    }
}
