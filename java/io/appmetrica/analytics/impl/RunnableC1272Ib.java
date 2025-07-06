package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import java.util.Iterator;
import p131u1.InterfaceC2810l;

/* renamed from: io.appmetrica.analytics.impl.Ib */
/* loaded from: classes.dex */
public final class RunnableC1272Ib implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1322Kb f4858a;

    /* renamed from: b */
    public final /* synthetic */ boolean f4859b;

    public RunnableC1272Ib(C1322Kb c1322Kb, boolean z2) {
        this.f4858a = c1322Kb;
        this.f4859b = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1322Kb c1322Kb = this.f4858a;
        boolean z2 = c1322Kb.f4956d;
        boolean z3 = this.f4859b;
        if (z2 != z3) {
            c1322Kb.f4956d = z3;
            InterfaceC2810l interfaceC2810l = z3 ? C1222Gb.f4780a : C1247Hb.f4822a;
            Iterator it = c1322Kb.f4953a.iterator();
            while (it.hasNext()) {
                interfaceC2810l.invoke((LocationControllerObserver) it.next());
            }
        }
    }
}
