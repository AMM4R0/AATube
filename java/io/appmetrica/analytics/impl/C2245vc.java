package io.appmetrica.analytics.impl;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: io.appmetrica.analytics.impl.vc */
/* loaded from: classes.dex */
public final class C2245vc implements InterfaceC1169E8, InterfaceC1493R8 {

    /* renamed from: a */
    public final C2224ug f7296a;

    /* renamed from: b */
    public final AtomicLong f7297b;

    public C2245vc(C1417O6 c1417o6, C2224ug c2224ug) {
        this.f7296a = c2224ug;
        this.f7297b = new AtomicLong(c1417o6.m3155a());
        c1417o6.m3162a(this);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1169E8
    /* renamed from: a */
    public final boolean mo2852a() {
        return this.f7297b.get() >= ((long) ((C1501Rg) this.f7296a.m4598a()).f5340j);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1493R8
    /* renamed from: b */
    public final void mo2891b(List<Integer> list) {
        this.f7297b.addAndGet(-list.size());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1493R8
    /* renamed from: a */
    public final void mo2890a(List<Integer> list) {
        this.f7297b.addAndGet(list.size());
    }
}
