package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.Cf */
/* loaded from: classes.dex */
public final class C1126Cf implements InterfaceC2323yf {

    /* renamed from: a */
    public final /* synthetic */ C1226Gf f4580a;

    public C1126Cf(C1226Gf c1226Gf) {
        this.f4580a = c1226Gf;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2323yf
    /* renamed from: a */
    public final void mo2732a() {
        C1226Gf c1226Gf = this.f4580a;
        ArrayList arrayList = c1226Gf.f4793g;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            C1500Rf c1500Rf = (C1500Rf) next;
            c1226Gf.f4789c.getClass();
            String str = c1500Rf != null ? c1500Rf.f5330a : null;
            if (!(str == null || str.length() == 0)) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            if (next2 != null) {
                arrayList3.add(next2);
            }
        }
        c1226Gf.m2911a(c1226Gf.f4789c.m3611a(arrayList3));
    }
}
