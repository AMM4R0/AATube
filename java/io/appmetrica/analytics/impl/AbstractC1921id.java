package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.id */
/* loaded from: classes.dex */
public abstract class AbstractC1921id implements InterfaceC2181sn, InterfaceC2085p2 {

    /* renamed from: a */
    public final String f6485a;

    /* renamed from: b */
    public final int f6486b;

    /* renamed from: c */
    public final InterfaceC1234Gn f6487c;

    /* renamed from: d */
    public final AbstractC1736b3 f6488d;

    /* renamed from: e */
    public C2123qf f6489e = AbstractC1521Sb.m3314a();

    public AbstractC1921id(int r12, String str, InterfaceC1234Gn interfaceC1234Gn, AbstractC1736b3 abstractC1736b3) {
        this.f6486b = r12;
        this.f6485a = str;
        this.f6487c = interfaceC1234Gn;
        this.f6488d = abstractC1736b3;
    }

    /* renamed from: a */
    public final C2206tn m4006a() {
        C2206tn c2206tn = new C2206tn();
        c2206tn.f7185b = this.f6486b;
        c2206tn.f7184a = this.f6485a.getBytes();
        c2206tn.f7187d = new C2256vn();
        c2206tn.f7186c = new C2231un();
        return c2206tn;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2181sn
    /* renamed from: a */
    public abstract /* synthetic */ void mo3106a(C2156rn c2156rn);

    /* renamed from: b */
    public final AbstractC1736b3 m4008b() {
        return this.f6488d;
    }

    /* renamed from: c */
    public final String m4009c() {
        return this.f6485a;
    }

    /* renamed from: d */
    public final InterfaceC1234Gn m4010d() {
        return this.f6487c;
    }

    /* renamed from: e */
    public final int m4011e() {
        return this.f6486b;
    }

    /* renamed from: f */
    public final boolean m4012f() {
        C1184En mo2706a = this.f6487c.mo2706a(this.f6485a);
        if (mo2706a.f4714a) {
            return true;
        }
        if (!this.f6489e.f5471b) {
            return false;
        }
        this.f6489e.m3358a(5, "Attribute " + this.f6485a + " of type " + ((String) AbstractC1781cn.f6061a.get(this.f6486b)) + " is skipped because " + mo2706a.f4715b);
        return false;
    }

    /* renamed from: a */
    public final void m4007a(C2123qf c2123qf) {
        this.f6489e = c2123qf;
    }
}
