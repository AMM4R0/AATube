package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.h */
/* loaded from: classes.dex */
public abstract class AbstractC1882h {

    /* renamed from: a */
    public final C2013m5 f6338a;

    /* renamed from: b */
    public final C1878gk f6339b;

    /* renamed from: c */
    public final C1978kk f6340c;

    /* renamed from: d */
    public final C1853fk f6341d;

    /* renamed from: e */
    public final InterfaceC1471Qa f6342e;

    /* renamed from: f */
    public final SystemTimeProvider f6343f;

    public AbstractC1882h(C2013m5 c2013m5, C1878gk c1878gk, C1978kk c1978kk, C1853fk c1853fk, InterfaceC1471Qa interfaceC1471Qa, SystemTimeProvider systemTimeProvider) {
        this.f6338a = c2013m5;
        this.f6339b = c1878gk;
        this.f6340c = c1978kk;
        this.f6341d = c1853fk;
        this.f6342e = interfaceC1471Qa;
        this.f6343f = systemTimeProvider;
    }

    /* renamed from: a */
    public final /* bridge */ C1554Tj m3899a(Object obj) {
        return m3898a((C1579Uj) obj);
    }

    /* renamed from: b */
    public final C1554Tj m3901b() {
        if (this.f6340c.m4075h()) {
            return new C1554Tj(this.f6338a, this.f6340c, m3900a(), this.f6343f);
        }
        return null;
    }

    /* renamed from: a */
    public final C1554Tj m3898a(C1579Uj c1579Uj) {
        if (this.f6340c.m4075h()) {
            this.f6342e.reportEvent("create session with non-empty storage");
        }
        C2013m5 c2013m5 = this.f6338a;
        C1978kk c1978kk = this.f6340c;
        long m3896a = this.f6339b.m3896a();
        C1978kk c1978kk2 = this.f6340c;
        c1978kk2.m4064a(C1978kk.f6595f, Long.valueOf(m3896a));
        c1978kk2.m4064a(C1978kk.f6593d, Long.valueOf(c1579Uj.f5543a));
        c1978kk2.m4064a(C1978kk.f6597h, Long.valueOf(c1579Uj.f5543a));
        c1978kk2.m4064a(C1978kk.f6596g, 0L);
        c1978kk2.m4064a(C1978kk.f6598i, Boolean.TRUE);
        c1978kk2.m4066b();
        this.f6338a.f6691f.m3159a(m3896a, this.f6341d.f6277a, TimeUnit.MILLISECONDS.toSeconds(c1579Uj.f5544b));
        return new C1554Tj(c2013m5, c1978kk, m3900a(), new SystemTimeProvider());
    }

    /* renamed from: a */
    public final C1629Wj m3900a() {
        C1604Vj c1604Vj = new C1604Vj(this.f6341d);
        c1604Vj.f5607g = this.f6340c.m4076i();
        c1604Vj.f5606f = this.f6340c.f6601c.m3713a(C1978kk.f6596g);
        c1604Vj.f5604d = this.f6340c.f6601c.m3713a(C1978kk.f6597h);
        c1604Vj.f5603c = this.f6340c.f6601c.m3713a(C1978kk.f6595f);
        c1604Vj.f5608h = this.f6340c.f6601c.m3713a(C1978kk.f6593d);
        c1604Vj.f5601a = this.f6340c.f6601c.m3713a(C1978kk.f6594e);
        return new C1629Wj(c1604Vj);
    }
}
