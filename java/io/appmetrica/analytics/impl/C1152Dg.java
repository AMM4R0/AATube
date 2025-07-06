package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.Dg */
/* loaded from: classes.dex */
public final class C1152Dg extends AbstractC2249vg {

    /* renamed from: b */
    public final C1409Nn f4644b;

    public C1152Dg(C2013m5 c2013m5) {
        this(c2013m5, c2013m5.m4180u());
    }

    @Override // io.appmetrica.analytics.impl.AbstractC2249vg
    /* renamed from: a */
    public final boolean mo2734a(C1615W5 c1615w5) {
        C2013m5 c2013m5 = this.f7308a;
        if (this.f4644b.m3143c()) {
            return false;
        }
        if (!this.f4644b.m3144d()) {
            C1992l9 c1992l9 = c2013m5.f6700o;
            c1992l9.f6638c.m3950b(C1615W5.m3460a(c1615w5, EnumC1670Ya.EVENT_TYPE_FIRST_ACTIVATION));
        }
        C1409Nn c1409Nn = this.f4644b;
        synchronized (c1409Nn) {
            C1434On c1434On = c1409Nn.f5142a;
            c1434On.m3194a(c1434On.m3193a().put("first_event_done", true));
        }
        return false;
    }

    public C1152Dg(C2013m5 c2013m5, C1409Nn c1409Nn) {
        super(c2013m5);
        this.f4644b = c1409Nn;
    }
}
