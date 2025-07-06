package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreapi.internal.control.ToggleObserver;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC2492i;

/* renamed from: io.appmetrica.analytics.impl.Kb */
/* loaded from: classes.dex */
public final class C1322Kb implements InterfaceC1197Fb, ToggleObserver {

    /* renamed from: a */
    public final ArrayList f4953a = new ArrayList();

    /* renamed from: b */
    public final IHandlerExecutor f4954b = C2018ma.m4192h().m4214u().m2964c();

    /* renamed from: c */
    public C1682Ym f4955c;

    /* renamed from: d */
    public boolean f4956d;

    @Override // io.appmetrica.analytics.coreapi.internal.control.ToggleObserver
    public final void onStateChanged(boolean z2) {
        this.f4954b.execute(new RunnableC1272Ib(this, z2));
    }

    /* renamed from: b */
    public final void m3020b(Object obj) {
        C1682Ym c1682Ym = this.f4955c;
        if (c1682Ym != null) {
            c1682Ym.f5776b.m3329b(obj);
        } else {
            AbstractC2492i.m4918h("togglesHolder");
            throw null;
        }
    }

    /* renamed from: a */
    public final void m3016a(Toggle toggle) {
        C1682Ym c1682Ym = new C1682Ym(toggle);
        this.f4955c = c1682Ym;
        c1682Ym.f5777c.registerObserver(this, true);
    }

    /* renamed from: a */
    public final void m3017a(LocationControllerObserver locationControllerObserver, boolean z2) {
        this.f4954b.execute(new RunnableC1297Jb(this, locationControllerObserver, z2));
    }

    /* renamed from: a */
    public final void m3018a(Object obj) {
        C1682Ym c1682Ym = this.f4955c;
        if (c1682Ym != null) {
            c1682Ym.f5776b.m3328a(obj);
        } else {
            AbstractC2492i.m4918h("togglesHolder");
            throw null;
        }
    }

    /* renamed from: a */
    public final void m3019a(boolean z2) {
        C1682Ym c1682Ym = this.f4955c;
        if (c1682Ym != null) {
            c1682Ym.f5775a.m3804a(z2);
        } else {
            AbstractC2492i.m4918h("togglesHolder");
            throw null;
        }
    }
}
