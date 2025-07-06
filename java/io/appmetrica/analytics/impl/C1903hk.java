package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.hk */
/* loaded from: classes.dex */
public final class C1903hk {

    /* renamed from: a */
    public final C2013m5 f6428a;

    /* renamed from: b */
    public final C1878gk f6429b;

    /* renamed from: c */
    public final C1988l5 f6430c;

    /* renamed from: d */
    public final C1370M9 f6431d;

    /* renamed from: e */
    public final AbstractC1882h f6432e;

    /* renamed from: f */
    public final AbstractC1882h f6433f;

    /* renamed from: g */
    public C1554Tj f6434g;

    /* renamed from: h */
    public int f6435h = 0;

    public C1903hk(C2013m5 c2013m5, C1878gk c1878gk, C1988l5 c1988l5, C1868ga c1868ga, C1463Q2 c1463q2, C1370M9 c1370m9) {
        this.f6428a = c2013m5;
        this.f6430c = c1988l5;
        this.f6432e = c1868ga;
        this.f6433f = c1463q2;
        this.f6429b = c1878gk;
        this.f6431d = c1370m9;
    }

    /* renamed from: a */
    public final synchronized long m3947a() {
        C1554Tj c1554Tj;
        c1554Tj = this.f6434g;
        return c1554Tj == null ? 10000000000L : c1554Tj.f5489d - 1;
    }

    /* renamed from: b */
    public final synchronized C1554Tj m3950b(C1615W5 c1615w5) {
        try {
            if (this.f6435h == 0) {
                C1554Tj m3901b = this.f6432e.m3901b();
                if (m3901b != null) {
                    if (m3901b.m3380a(c1615w5.f5629i)) {
                        this.f6434g = m3901b;
                        this.f6435h = 3;
                    } else {
                        m3949a(m3901b, c1615w5);
                    }
                }
                C1554Tj m3901b2 = this.f6433f.m3901b();
                if (m3901b2 != null) {
                    if (m3901b2.m3380a(c1615w5.f5629i)) {
                        this.f6434g = m3901b2;
                        this.f6435h = 2;
                    } else {
                        m3949a(m3901b2, c1615w5);
                    }
                }
                this.f6434g = null;
                this.f6435h = 1;
            }
            if (this.f6435h != 1) {
                C1554Tj c1554Tj = this.f6434g;
                if (c1554Tj != null) {
                    if (!c1554Tj.m3380a(c1615w5.f5629i)) {
                        m3949a(c1554Tj, c1615w5);
                    }
                }
                this.f6435h = 1;
                this.f6434g = null;
            }
            int m3042a = AbstractC1343L7.m3042a(this.f6435h);
            if (m3042a == 1) {
                C1554Tj c1554Tj2 = this.f6434g;
                long j2 = c1615w5.f5629i;
                c1554Tj2.f5494i = j2;
                C1978kk c1978kk = c1554Tj2.f5487b;
                c1978kk.m4064a(C1978kk.f6593d, Long.valueOf(j2));
                c1978kk.m4066b();
                return this.f6434g;
            }
            if (m3042a == 2) {
                return this.f6434g;
            }
            C2123qf c2123qf = this.f6428a.f6699n;
            if (c2123qf.f5471b) {
                c2123qf.m3358a(4, "Start background session");
            }
            this.f6435h = 2;
            long j3 = c1615w5.f5629i;
            AbstractC1882h abstractC1882h = this.f6433f;
            C1579Uj c1579Uj = new C1579Uj(j3, c1615w5.f5630j);
            abstractC1882h.getClass();
            C1554Tj m3898a = abstractC1882h.m3898a(c1579Uj);
            if (this.f6428a.f6707v.m3143c()) {
                C1988l5 c1988l5 = this.f6430c;
                c1988l5.f6621a.f6700o.m4100a(C1615W5.m3459a(c1615w5, this.f6431d), m3946a(m3898a, c1615w5.f5629i));
            } else {
                int r3 = c1615w5.f5624d;
                EnumC1670Ya enumC1670Ya = EnumC1670Ya.EVENT_TYPE_UNDEFINED;
                if (r3 == 6145) {
                    C1988l5 c1988l52 = this.f6430c;
                    c1988l52.f6621a.f6700o.m4100a(c1615w5, m3946a(m3898a, j3));
                    C1988l5 c1988l53 = this.f6430c;
                    c1988l53.f6621a.f6700o.m4100a(C1615W5.m3459a(c1615w5, this.f6431d), m3946a(m3898a, j3));
                }
            }
            this.f6434g = m3898a;
            return m3898a;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: c */
    public final synchronized void m3951c(C1615W5 c1615w5) {
        try {
            if (this.f6435h == 0) {
                C1554Tj m3901b = this.f6432e.m3901b();
                if (m3901b != null) {
                    if (m3901b.m3380a(c1615w5.f5629i)) {
                        this.f6434g = m3901b;
                        this.f6435h = 3;
                    } else {
                        m3949a(m3901b, c1615w5);
                    }
                }
                C1554Tj m3901b2 = this.f6433f.m3901b();
                if (m3901b2 != null) {
                    if (m3901b2.m3380a(c1615w5.f5629i)) {
                        this.f6434g = m3901b2;
                        this.f6435h = 2;
                    } else {
                        m3949a(m3901b2, c1615w5);
                    }
                }
                this.f6434g = null;
                this.f6435h = 1;
            }
            int m3042a = AbstractC1343L7.m3042a(this.f6435h);
            if (m3042a == 0) {
                this.f6434g = m3948a(c1615w5);
            } else if (m3042a == 1) {
                m3949a(this.f6434g, c1615w5);
                this.f6434g = m3948a(c1615w5);
            } else if (m3042a == 2) {
                C1554Tj c1554Tj = this.f6434g;
                if (c1554Tj != null) {
                    if (c1554Tj.m3380a(c1615w5.f5629i)) {
                        C1554Tj c1554Tj2 = this.f6434g;
                        long j2 = c1615w5.f5629i;
                        c1554Tj2.f5494i = j2;
                        C1978kk c1978kk = c1554Tj2.f5487b;
                        c1978kk.m4064a(C1978kk.f6593d, Long.valueOf(j2));
                        c1978kk.m4066b();
                    } else {
                        m3949a(c1554Tj, c1615w5);
                    }
                }
                this.f6434g = m3948a(c1615w5);
            }
        } finally {
        }
    }

    /* renamed from: a */
    public final C1554Tj m3948a(C1615W5 c1615w5) {
        C2123qf c2123qf = this.f6428a.f6699n;
        if (c2123qf.f5471b) {
            c2123qf.m3358a(4, "Start foreground session");
        }
        long j2 = c1615w5.f5629i;
        AbstractC1882h abstractC1882h = this.f6432e;
        C1579Uj c1579Uj = new C1579Uj(j2, c1615w5.f5630j);
        abstractC1882h.getClass();
        C1554Tj m3898a = abstractC1882h.m3898a(c1579Uj);
        this.f6435h = 3;
        this.f6428a.f6702q.m4398b();
        C1988l5 c1988l5 = this.f6430c;
        c1988l5.f6621a.f6700o.m4100a(C1615W5.m3459a(c1615w5, this.f6431d), m3946a(m3898a, j2));
        return m3898a;
    }

    /* renamed from: a */
    public final void m3949a(C1554Tj c1554Tj, C1615W5 c1615w5) {
        if (c1554Tj.f5492g && c1554Tj.f5489d > 0) {
            C1988l5 c1988l5 = this.f6430c;
            C1615W5 m3460a = C1615W5.m3460a(c1615w5, EnumC1670Ya.EVENT_TYPE_ALIVE);
            C1953jk c1953jk = new C1953jk();
            c1953jk.f6547a = c1554Tj.f5489d;
            c1953jk.f6550d = c1554Tj.f5488c.f5647a;
            long andIncrement = c1554Tj.f5491f.getAndIncrement();
            C1978kk c1978kk = c1554Tj.f5487b;
            c1978kk.m4064a(C1978kk.f6596g, Long.valueOf(c1554Tj.f5491f.get()));
            c1978kk.m4066b();
            c1953jk.f6548b = andIncrement;
            c1953jk.f6549c = TimeUnit.MILLISECONDS.toSeconds(Math.max(c1554Tj.f5494i - c1554Tj.f5490e, c1554Tj.f5495j));
            c1988l5.f6621a.f6700o.m4100a(m3460a, c1953jk);
            if (c1554Tj.f5492g) {
                c1554Tj.f5492g = false;
                C1978kk c1978kk2 = c1554Tj.f5487b;
                c1978kk2.m4064a(C1978kk.f6598i, Boolean.FALSE);
                c1978kk2.m4066b();
            }
        }
        C2123qf c2123qf = this.f6428a.f6699n;
        if (c2123qf.f5471b) {
            int ordinal = c1554Tj.f5488c.f5647a.ordinal();
            if (ordinal == 0) {
                c2123qf.m3358a(4, "Finish foreground session");
            } else if (ordinal == 1) {
                c2123qf.m3358a(4, "Finish background session");
            }
        }
        synchronized (c1554Tj) {
            C1978kk c1978kk3 = c1554Tj.f5487b;
            c1978kk3.getClass();
            c1978kk3.f6601c = new C1769cb();
            c1978kk3.m4066b();
            c1554Tj.f5493h = null;
        }
    }

    /* renamed from: a */
    public static C1953jk m3946a(C1554Tj c1554Tj, long j2) {
        C1953jk c1953jk = new C1953jk();
        c1953jk.f6547a = c1554Tj.f5489d;
        long andIncrement = c1554Tj.f5491f.getAndIncrement();
        C1978kk c1978kk = c1554Tj.f5487b;
        c1978kk.m4064a(C1978kk.f6596g, Long.valueOf(c1554Tj.f5491f.get()));
        c1978kk.m4066b();
        c1953jk.f6548b = andIncrement;
        C1978kk c1978kk2 = c1554Tj.f5487b;
        long j3 = j2 - c1554Tj.f5490e;
        c1554Tj.f5495j = j3;
        c1978kk2.m4064a(C1978kk.f6594e, Long.valueOf(j3));
        c1953jk.f6549c = TimeUnit.MILLISECONDS.toSeconds(c1554Tj.f5495j);
        c1953jk.f6550d = c1554Tj.f5488c.f5647a;
        return c1953jk;
    }
}
