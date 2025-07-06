package io.appmetrica.analytics.impl;

import java.util.HashSet;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.Uf */
/* loaded from: classes.dex */
public final class C1575Uf implements InterfaceC1426Of {

    /* renamed from: a */
    public final HashSet f5537a;

    /* renamed from: b */
    public boolean f5538b;

    /* renamed from: c */
    public C1500Rf f5539c;

    public C1575Uf() {
        this(C2018ma.m4192h().m4211r());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1426Of
    /* renamed from: a */
    public final synchronized void mo3179a(C1500Rf c1500Rf) {
        try {
            this.f5539c = c1500Rf;
            this.f5538b = true;
            Iterator it = this.f5537a.iterator();
            while (it.hasNext()) {
                ((InterfaceC1251Hf) it.next()).mo2940a(this.f5539c);
            }
            this.f5537a.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public C1575Uf(C1451Pf c1451Pf) {
        this.f5537a = new HashSet();
        c1451Pf.m3208a(new C1481Qk(this));
        c1451Pf.m3206a();
    }

    /* renamed from: a */
    public final synchronized void m3397a(InterfaceC1251Hf interfaceC1251Hf) {
        this.f5537a.add(interfaceC1251Hf);
        if (this.f5538b) {
            interfaceC1251Hf.mo2940a(this.f5539c);
            this.f5537a.remove(interfaceC1251Hf);
        }
    }
}
