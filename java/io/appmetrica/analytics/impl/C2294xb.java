package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.xb */
/* loaded from: classes.dex */
public final class C2294xb {

    /* renamed from: a */
    public final C1861g3 f7427a;

    /* renamed from: b */
    public final C2035n2 f7428b;

    /* renamed from: c */
    public final ArrayList f7429c;

    public C2294xb(C1861g3 c1861g3, C2035n2 c2035n2) {
        ArrayList arrayList = new ArrayList();
        this.f7429c = arrayList;
        this.f7427a = c1861g3;
        arrayList.add(c1861g3);
        this.f7428b = c2035n2;
        arrayList.add(c2035n2);
    }

    /* renamed from: a */
    public final synchronized void m4607a() {
        Iterator it = this.f7429c.iterator();
        while (it.hasNext()) {
            ((InterfaceC1305Jj) it.next()).onCreate();
        }
    }

    /* renamed from: a */
    public final synchronized void m4608a(C1993la c1993la) {
        this.f7429c.add(c1993la);
    }
}
