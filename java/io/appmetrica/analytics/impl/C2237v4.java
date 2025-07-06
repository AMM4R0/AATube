package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import p001A0.AbstractC0005b;
import p105l1.C2632c;
import p108m1.AbstractC2671u;

/* renamed from: io.appmetrica.analytics.impl.v4 */
/* loaded from: classes.dex */
public final class C2237v4 {

    /* renamed from: a */
    public final CopyOnWriteArrayList f7256a = new CopyOnWriteArrayList();

    /* renamed from: a */
    public final void m4510a(ModuleClientEntryPoint<Object> moduleClientEntryPoint) {
        this.f7256a.add(moduleClientEntryPoint);
    }

    /* renamed from: a */
    public final void m4509a(ClientContext clientContext) {
        HashSet hashSet = new HashSet();
        Iterator it = this.f7256a.iterator();
        while (it.hasNext()) {
            ModuleClientEntryPoint moduleClientEntryPoint = (ModuleClientEntryPoint) it.next();
            try {
                moduleClientEntryPoint.initClientSide(clientContext);
            } catch (Throwable th) {
                String identifier = moduleClientEntryPoint.getIdentifier();
                C2202tj c2202tj = AbstractC1553Ti.f5485a;
                Map m5126c0 = AbstractC2671u.m5126c0(new C2632c(identifier, AbstractC2671u.m5126c0(new C2632c("initClientSide", AbstractC0005b.m50M(th)))));
                c2202tj.getClass();
                c2202tj.m4458a(new C2152rj("client_module_errors", m5126c0));
                hashSet.add(moduleClientEntryPoint);
            }
        }
        this.f7256a.removeAll(hashSet);
    }

    /* renamed from: a */
    public final void m4508a() {
        Iterator it = this.f7256a.iterator();
        while (it.hasNext()) {
            ModuleClientEntryPoint moduleClientEntryPoint = (ModuleClientEntryPoint) it.next();
            try {
                moduleClientEntryPoint.onActivated();
            } catch (Throwable th) {
                String identifier = moduleClientEntryPoint.getIdentifier();
                C2202tj c2202tj = AbstractC1553Ti.f5485a;
                Map m5126c0 = AbstractC2671u.m5126c0(new C2632c(identifier, AbstractC2671u.m5126c0(new C2632c("onActivated", AbstractC0005b.m50M(th)))));
                c2202tj.getClass();
                c2202tj.m4458a(new C2152rj("client_module_errors", m5126c0));
            }
        }
    }
}
