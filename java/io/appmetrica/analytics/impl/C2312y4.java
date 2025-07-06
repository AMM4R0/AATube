package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;

/* renamed from: io.appmetrica.analytics.impl.y4 */
/* loaded from: classes.dex */
public final class C2312y4 {

    /* renamed from: m */
    public static volatile C2312y4 f7475m;

    /* renamed from: a */
    public final C1671Yb f7476a;

    /* renamed from: b */
    public final C1218G7 f7477b;

    /* renamed from: c */
    public final C2112q4 f7478c;

    /* renamed from: d */
    public final C1312K1 f7479d;

    /* renamed from: e */
    public final C2107q f7480e;

    /* renamed from: f */
    public final C2128qk f7481f;

    /* renamed from: g */
    public final C1366M5 f7482g;

    /* renamed from: h */
    public final C2007m f7483h;

    /* renamed from: i */
    public final C2139r6 f7484i;

    /* renamed from: j */
    public C1796dd f7485j;

    /* renamed from: k */
    public volatile C2237v4 f7486k;

    /* renamed from: l */
    public final C1198Fc f7487l;

    public C2312y4(C1671Yb c1671Yb, C2107q c2107q, C2112q4 c2112q4) {
        this(c1671Yb, c2107q, c2112q4, new C2007m(c2107q, c2112q4.m4338a()));
    }

    /* renamed from: h */
    public static C2312y4 m4633h() {
        if (f7475m == null) {
            synchronized (C2312y4.class) {
                try {
                    if (f7475m == null) {
                        f7475m = new C2312y4(new C1671Yb(), new C2107q(), new C2112q4());
                    }
                } finally {
                }
            }
        }
        return f7475m;
    }

    /* renamed from: a */
    public final C2007m m4635a() {
        return this.f7483h;
    }

    /* renamed from: b */
    public final C2107q m4636b() {
        return this.f7480e;
    }

    /* renamed from: c */
    public final ICommonExecutor m4637c() {
        return this.f7478c.m4338a();
    }

    /* renamed from: d */
    public final C1312K1 m4638d() {
        return this.f7479d;
    }

    /* renamed from: e */
    public final C2112q4 m4639e() {
        return this.f7478c;
    }

    /* renamed from: f */
    public final C1366M5 m4640f() {
        return this.f7482g;
    }

    /* renamed from: g */
    public final C1218G7 m4641g() {
        return this.f7477b;
    }

    /* renamed from: i */
    public final C1671Yb m4642i() {
        return this.f7476a;
    }

    /* renamed from: j */
    public final C2237v4 m4643j() {
        C2237v4 c2237v4 = this.f7486k;
        if (c2237v4 == null) {
            synchronized (this) {
                try {
                    c2237v4 = this.f7486k;
                    if (c2237v4 == null) {
                        c2237v4 = new C2237v4();
                        this.f7486k = c2237v4;
                    }
                } finally {
                }
            }
        }
        return c2237v4;
    }

    /* renamed from: k */
    public final C1671Yb m4644k() {
        return this.f7476a;
    }

    /* renamed from: l */
    public final C2128qk m4645l() {
        return this.f7481f;
    }

    /* renamed from: a */
    public final synchronized C1796dd m4634a(Context context) {
        try {
            if (this.f7485j == null) {
                this.f7485j = new C1796dd(context, new C1084An());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f7485j;
    }

    public C2312y4(C1671Yb c1671Yb, C2107q c2107q, C2112q4 c2112q4, C2007m c2007m) {
        this(c1671Yb, new C1218G7(), c2112q4, c2007m, new C1312K1(), c2107q, new C2128qk(c2107q, c2112q4.m4338a(), c2007m), new C1366M5(c2107q), new C2139r6());
    }

    public C2312y4(C1671Yb c1671Yb, C1218G7 c1218g7, C2112q4 c2112q4, C2007m c2007m, C1312K1 c1312k1, C2107q c2107q, C2128qk c2128qk, C1366M5 c1366m5, C2139r6 c2139r6) {
        this.f7487l = new C1198Fc();
        this.f7476a = c1671Yb;
        this.f7477b = c1218g7;
        this.f7478c = c2112q4;
        this.f7483h = c2007m;
        this.f7479d = c1312k1;
        this.f7480e = c2107q;
        this.f7481f = c2128qk;
        this.f7482g = c1366m5;
        this.f7484i = c2139r6;
    }
}
