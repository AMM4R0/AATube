package io.appmetrica.analytics.impl;

import android.location.Location;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import io.appmetrica.analytics.modulesapi.internal.common.AskForPermissionStrategyModuleProvider;
import io.appmetrica.analytics.modulesapi.internal.service.LocationServiceExtension;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleLocationSourcesServiceController;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServicesDatabase;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerFactory;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AbstractC2492i;
import p001A0.AbstractC0005b;
import p103k0.AbstractC2480a;
import p105l1.C2632c;
import p105l1.C2636g;
import p108m1.AbstractC2665o;
import p108m1.AbstractC2671u;
import p108m1.C2668r;

/* renamed from: io.appmetrica.analytics.impl.Nj */
/* loaded from: classes.dex */
public final class C1405Nj implements InterfaceC1148Dc, InterfaceC1182El, AskForPermissionStrategyModuleProvider {

    /* renamed from: a */
    public final String f5135a = "rp";

    /* renamed from: b */
    public final CopyOnWriteArrayList f5136b = new CopyOnWriteArrayList();

    /* renamed from: c */
    public volatile AskForPermissionStrategyModuleProvider f5137c = new C1168E7();

    @Override // io.appmetrica.analytics.impl.InterfaceC1182El
    /* renamed from: a */
    public final void mo2780a(C2354zl c2354zl) {
        SdkIdentifiers sdkIdentifiers = new SdkIdentifiers(c2354zl.m4694f(), c2354zl.m4690b(), c2354zl.m4691c());
        C2074og c2074og = new C2074og(c2354zl.m4692d(), c2354zl.m4693e());
        for (ModuleServiceEntryPoint moduleServiceEntryPoint : this.f5136b) {
            RemoteConfigExtensionConfiguration remoteConfigExtensionConfiguration = moduleServiceEntryPoint.getRemoteConfigExtensionConfiguration();
            if (remoteConfigExtensionConfiguration != null) {
                remoteConfigExtensionConfiguration.getRemoteConfigUpdateListener().onRemoteConfigUpdated(new C1380Mj(sdkIdentifiers, c2074og, c2354zl.f7537B.get(moduleServiceEntryPoint.getIdentifier())));
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1148Dc
    /* renamed from: b */
    public final Map<String, C1348Lc> mo2832b() {
        CopyOnWriteArrayList<ModuleServiceEntryPoint> copyOnWriteArrayList = this.f5136b;
        ArrayList arrayList = new ArrayList();
        for (ModuleServiceEntryPoint moduleServiceEntryPoint : copyOnWriteArrayList) {
            RemoteConfigExtensionConfiguration remoteConfigExtensionConfiguration = moduleServiceEntryPoint.getRemoteConfigExtensionConfiguration();
            C2632c c2632c = remoteConfigExtensionConfiguration != null ? new C2632c(moduleServiceEntryPoint.getIdentifier(), new C1348Lc(remoteConfigExtensionConfiguration)) : null;
            if (c2632c != null) {
                arrayList.add(c2632c);
            }
        }
        return AbstractC2671u.m5129f0(arrayList);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1148Dc
    /* renamed from: c */
    public final Map<String, Integer> mo2833c() {
        Map<String, Integer> blocks;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f5136b;
        ArrayList arrayList = new ArrayList();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            RemoteConfigExtensionConfiguration remoteConfigExtensionConfiguration = ((ModuleServiceEntryPoint) it.next()).getRemoteConfigExtensionConfiguration();
            Iterable iterable = C2668r.f8607a;
            if (remoteConfigExtensionConfiguration != null && (blocks = remoteConfigExtensionConfiguration.getBlocks()) != null && blocks.size() != 0) {
                Iterator<Map.Entry<String, Integer>> it2 = blocks.entrySet().iterator();
                if (it2.hasNext()) {
                    Map.Entry<String, Integer> next = it2.next();
                    if (it2.hasNext()) {
                        ArrayList arrayList2 = new ArrayList(blocks.size());
                        arrayList2.add(new C2632c(next.getKey(), next.getValue()));
                        do {
                            Map.Entry<String, Integer> next2 = it2.next();
                            arrayList2.add(new C2632c(next2.getKey(), next2.getValue()));
                        } while (it2.hasNext());
                        iterable = arrayList2;
                    } else {
                        iterable = AbstractC2480a.m4863D(new C2632c(next.getKey(), next.getValue()));
                    }
                }
            }
            AbstractC2665o.m5123a0(arrayList, iterable);
        }
        return AbstractC2671u.m5129f0(arrayList);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1148Dc
    /* renamed from: d */
    public final List<Consumer<Location>> mo2834d() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f5136b;
        ArrayList arrayList = new ArrayList();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            LocationServiceExtension locationServiceExtension = ((ModuleServiceEntryPoint) it.next()).getLocationServiceExtension();
            Consumer<Location> locationConsumer = locationServiceExtension != null ? locationServiceExtension.getLocationConsumer() : null;
            if (locationConsumer != null) {
                arrayList.add(locationConsumer);
            }
        }
        return arrayList;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1148Dc
    /* renamed from: e */
    public final ModuleLocationSourcesServiceController mo2835e() {
        ModuleLocationSourcesServiceController moduleLocationSourcesServiceController;
        Iterator it = this.f5136b.iterator();
        do {
            moduleLocationSourcesServiceController = null;
            if (!it.hasNext()) {
                break;
            }
            LocationServiceExtension locationServiceExtension = ((ModuleServiceEntryPoint) it.next()).getLocationServiceExtension();
            if (locationServiceExtension != null) {
                moduleLocationSourcesServiceController = locationServiceExtension.getLocationSourcesController();
            }
        } while (moduleLocationSourcesServiceController == null);
        return moduleLocationSourcesServiceController;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1148Dc
    /* renamed from: f */
    public final Toggle mo2836f() {
        Toggle toggle;
        Iterator it = this.f5136b.iterator();
        do {
            toggle = null;
            if (!it.hasNext()) {
                break;
            }
            LocationServiceExtension locationServiceExtension = ((ModuleServiceEntryPoint) it.next()).getLocationServiceExtension();
            if (locationServiceExtension != null) {
                toggle = locationServiceExtension.getLocationControllerAppStateToggle();
            }
        } while (toggle == null);
        return toggle;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1148Dc
    /* renamed from: g */
    public final List<String> mo2837g() {
        List<String> list;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f5136b;
        ArrayList arrayList = new ArrayList();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            RemoteConfigExtensionConfiguration remoteConfigExtensionConfiguration = ((ModuleServiceEntryPoint) it.next()).getRemoteConfigExtensionConfiguration();
            if (remoteConfigExtensionConfiguration == null || (list = remoteConfigExtensionConfiguration.getFeatures()) == null) {
                list = C2668r.f8607a;
            }
            AbstractC2665o.m5123a0(arrayList, list);
        }
        return arrayList;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.AskForPermissionStrategyModuleProvider
    public final PermissionStrategy getAskForPermissionStrategy() {
        return this.f5137c.getAskForPermissionStrategy();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1148Dc
    /* renamed from: a */
    public final List<ModuleServicesDatabase> mo2831a() {
        Object obj;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        CopyOnWriteArrayList copyOnWriteArrayList = this.f5136b;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ModuleServiceEntryPoint moduleServiceEntryPoint = (ModuleServiceEntryPoint) it.next();
            try {
                ModuleServicesDatabase moduleServicesDatabase = moduleServiceEntryPoint.getModuleServicesDatabase();
                obj = moduleServicesDatabase != null ? Boolean.valueOf(arrayList.add(moduleServicesDatabase)) : null;
            } catch (Throwable th) {
                hashSet.add(moduleServiceEntryPoint);
                String identifier = moduleServiceEntryPoint.getIdentifier();
                C2202tj c2202tj = AbstractC1553Ti.f5485a;
                Map m5126c0 = AbstractC2671u.m5126c0(new C2632c(identifier, AbstractC2671u.m5126c0(new C2632c("db", AbstractC0005b.m50M(th)))));
                c2202tj.getClass();
                c2202tj.m4458a(new C2152rj("service_module_errors", m5126c0));
                obj = C2636g.f8557a;
            }
            if (obj != null) {
                arrayList2.add(obj);
            }
        }
        this.f5136b.removeAll(hashSet);
        return arrayList;
    }

    /* renamed from: a */
    public final void m3125a(ModuleServiceEntryPoint<Object> moduleServiceEntryPoint) {
        this.f5136b.add(moduleServiceEntryPoint);
        if (AbstractC2492i.m4911a(this.f5135a, moduleServiceEntryPoint.getIdentifier()) && (moduleServiceEntryPoint instanceof AskForPermissionStrategyModuleProvider)) {
            this.f5137c = (AskForPermissionStrategyModuleProvider) moduleServiceEntryPoint;
        }
    }

    /* renamed from: a */
    public final void m3126a(ServiceContext serviceContext, C2354zl c2354zl) {
        HashSet hashSet = new HashSet();
        Iterator it = this.f5136b.iterator();
        while (it.hasNext()) {
            ModuleServiceEntryPoint moduleServiceEntryPoint = (ModuleServiceEntryPoint) it.next();
            try {
                moduleServiceEntryPoint.initServiceSide(serviceContext, new C1380Mj(new SdkIdentifiers(c2354zl.f7542d, c2354zl.f7539a, c2354zl.f7540b), new C2074og(c2354zl.f7560v, c2354zl.f7559u), c2354zl.f7537B.get(moduleServiceEntryPoint.getIdentifier())));
                ModuleEventServiceHandlerFactory moduleEventServiceHandlerFactory = moduleServiceEntryPoint.getModuleEventServiceHandlerFactory();
                if (moduleEventServiceHandlerFactory != null) {
                    C1248Hc c1248Hc = C2018ma.f6725C.f6747t;
                    String identifier = moduleServiceEntryPoint.getIdentifier();
                    synchronized (c1248Hc) {
                        c1248Hc.f4823a.put(identifier, moduleEventServiceHandlerFactory);
                    }
                } else {
                    continue;
                }
            } catch (Throwable th) {
                String identifier2 = moduleServiceEntryPoint.getIdentifier();
                C2202tj c2202tj = AbstractC1553Ti.f5485a;
                Map m5126c0 = AbstractC2671u.m5126c0(new C2632c(identifier2, AbstractC2671u.m5126c0(new C2632c("init", AbstractC0005b.m50M(th)))));
                c2202tj.getClass();
                c2202tj.m4458a(new C2152rj("service_module_errors", m5126c0));
                hashSet.add(moduleServiceEntryPoint);
            }
        }
        this.f5136b.removeAll(hashSet);
    }
}
