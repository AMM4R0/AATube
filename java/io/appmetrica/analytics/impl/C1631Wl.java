package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* renamed from: io.appmetrica.analytics.impl.Wl */
/* loaded from: classes.dex */
public final class C1631Wl {

    /* renamed from: a */
    public final Context f5661a;

    /* renamed from: b */
    public final String f5662b;

    /* renamed from: c */
    public final C1680Yk f5663c;

    /* renamed from: d */
    public final C1107Bl f5664d;

    /* renamed from: e */
    public final C1440P4 f5665e;

    /* renamed from: f */
    public final C2329yl f5666f;

    /* renamed from: g */
    public final C1393N7 f5667g;

    /* renamed from: h */
    public final SystemTimeProvider f5668h;

    /* renamed from: i */
    public final C1712a4 f5669i;

    /* renamed from: j */
    public final C1787d4 f5670j;

    /* renamed from: k */
    public final C1754bl f5671k;

    /* renamed from: l */
    public final C1796dd f5672l;

    /* renamed from: m */
    public final C1159Dn f5673m;

    public C1631Wl(Context context, String str, C2179sl c2179sl, C1680Yk c1680Yk) {
        this.f5661a = context;
        this.f5662b = str;
        this.f5663c = c1680Yk;
        C1107Bl m4218y = C2018ma.m4192h().m4218y();
        this.f5664d = m4218y;
        C2354zl m2778a = m4218y.m2778a();
        this.f5665e = new C1440P4(str);
        this.f5666f = new C2329yl(context);
        this.f5667g = new C1393N7(context);
        this.f5668h = new SystemTimeProvider();
        this.f5669i = C2018ma.m4192h().m4198d();
        this.f5670j = new C1787d4();
        this.f5671k = new C1754bl(new C2204tl(context, str), m2778a, c2179sl);
        this.f5672l = C2018ma.m4192h().m4207n();
        this.f5673m = new C1159Dn();
    }
}
