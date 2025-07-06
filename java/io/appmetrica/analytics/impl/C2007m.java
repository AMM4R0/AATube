package io.appmetrica.analytics.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.m */
/* loaded from: classes.dex */
public final class C2007m implements InterfaceC2057o {

    /* renamed from: a */
    public final HashSet f6670a = new HashSet();

    /* renamed from: b */
    public final ICommonExecutor f6671b;

    public C2007m(C2107q c2107q, ICommonExecutor iCommonExecutor) {
        this.f6671b = iCommonExecutor;
        c2107q.m4310a(this, new EnumC2032n[0]);
    }

    /* renamed from: a */
    public final synchronized void m4118a(InterfaceC1982l interfaceC1982l) {
        this.f6670a.add(interfaceC1982l);
    }

    /* renamed from: a */
    public final void m4117a(Activity activity) {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f6670a);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((C1179Ei) ((InterfaceC1982l) it.next())).m2864a(activity);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2057o
    /* renamed from: a */
    public final void mo3040a(Activity activity, EnumC2032n enumC2032n) {
        this.f6671b.execute(new RunnableC1957k(this, activity));
    }
}
