package io.appmetrica.analytics.remotepermissions.internal;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import io.appmetrica.analytics.modulesapi.internal.common.AskForPermissionStrategyModuleProvider;
import io.appmetrica.analytics.modulesapi.internal.service.LocationServiceExtension;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServicesDatabase;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigUpdateListener;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerFactory;
import io.appmetrica.analytics.remotepermissions.impl.C2409a;
import io.appmetrica.analytics.remotepermissions.impl.C2410b;
import io.appmetrica.analytics.remotepermissions.impl.C2412d;
import io.appmetrica.analytics.remotepermissions.impl.C2413e;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p105l1.C2632c;
import p108m1.AbstractC2671u;
import p108m1.C2668r;
import p108m1.C2670t;

/* loaded from: classes.dex */
public final class RemotePermissionsModuleEntryPoint implements ModuleServiceEntryPoint<C2409a>, AskForPermissionStrategyModuleProvider, RemoteConfigUpdateListener<C2409a> {

    /* renamed from: a */
    private final C2412d f7812a = new C2412d();

    /* renamed from: b */
    private final C2410b f7813b = new C2410b();

    /* renamed from: c */
    private final RemotePermissionsModuleEntryPoint f7814c = this;

    /* renamed from: d */
    private final C2413e f7815d = new C2413e();

    /* renamed from: e */
    private final String f7816e = "rp";

    /* renamed from: f */
    private final C2415xf567e408 f7817f = new RemoteConfigExtensionConfiguration<C2409a>() { // from class: io.appmetrica.analytics.remotepermissions.internal.RemotePermissionsModuleEntryPoint$remoteConfigExtensionConfiguration$1
        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        public Map<String, Integer> getBlocks() {
            return AbstractC2671u.m5126c0(new C2632c("permissions", 1));
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        public List<String> getFeatures() {
            return C2668r.f8607a;
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        public JsonParser<C2409a> getJsonParser() {
            JsonParser<C2409a> jsonParser;
            jsonParser = RemotePermissionsModuleEntryPoint.this.f7812a;
            return jsonParser;
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        public Converter<C2409a, byte[]> getProtobufConverter() {
            Converter<C2409a, byte[]> converter;
            converter = RemotePermissionsModuleEntryPoint.this.f7813b;
            return converter;
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        public RemoteConfigUpdateListener<C2409a> getRemoteConfigUpdateListener() {
            RemoteConfigUpdateListener<C2409a> remoteConfigUpdateListener;
            remoteConfigUpdateListener = RemotePermissionsModuleEntryPoint.this.f7814c;
            return remoteConfigUpdateListener;
        }
    };

    @Override // io.appmetrica.analytics.modulesapi.internal.common.AskForPermissionStrategyModuleProvider
    public PermissionStrategy getAskForPermissionStrategy() {
        return this.f7815d;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public String getIdentifier() {
        return this.f7816e;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public LocationServiceExtension getLocationServiceExtension() {
        return null;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public ModuleEventServiceHandlerFactory getModuleEventServiceHandlerFactory() {
        return null;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public ModuleServicesDatabase getModuleServicesDatabase() {
        return null;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public RemoteConfigExtensionConfiguration<C2409a> getRemoteConfigExtensionConfiguration() {
        return this.f7817f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public void initServiceSide(ServiceContext serviceContext, ModuleRemoteConfig<C2409a> moduleRemoteConfig) {
        Set set;
        C2413e c2413e = this.f7815d;
        C2409a featuresConfig = moduleRemoteConfig.getFeaturesConfig();
        if (featuresConfig == null || (set = featuresConfig.f7803a) == null) {
            set = C2670t.f8609a;
        }
        synchronized (c2413e) {
            c2413e.f7809a = set;
        }
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigUpdateListener
    public void onRemoteConfigUpdated(ModuleRemoteConfig<C2409a> moduleRemoteConfig) {
        Set set;
        C2413e c2413e = this.f7815d;
        C2409a featuresConfig = moduleRemoteConfig.getFeaturesConfig();
        if (featuresConfig == null || (set = featuresConfig.f7803a) == null) {
            set = C2670t.f8609a;
        }
        synchronized (c2413e) {
            c2413e.f7809a = set;
        }
    }
}
