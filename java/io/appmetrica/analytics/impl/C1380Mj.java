package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo;
import kotlin.jvm.internal.AbstractC2492i;

/* renamed from: io.appmetrica.analytics.impl.Mj */
/* loaded from: classes.dex */
public final class C1380Mj implements ModuleRemoteConfig {

    /* renamed from: a */
    public final SdkIdentifiers f5080a;

    /* renamed from: b */
    public final RemoteConfigMetaInfo f5081b;

    /* renamed from: c */
    public final Object f5082c;

    public C1380Mj(SdkIdentifiers sdkIdentifiers, RemoteConfigMetaInfo remoteConfigMetaInfo, Object obj) {
        this.f5080a = sdkIdentifiers;
        this.f5081b = remoteConfigMetaInfo;
        this.f5082c = obj;
    }

    /* renamed from: a */
    public final C1380Mj m3096a(SdkIdentifiers sdkIdentifiers, RemoteConfigMetaInfo remoteConfigMetaInfo, Object obj) {
        return new C1380Mj(sdkIdentifiers, remoteConfigMetaInfo, obj);
    }

    /* renamed from: b */
    public final RemoteConfigMetaInfo m3097b() {
        return this.f5081b;
    }

    /* renamed from: c */
    public final Object m3098c() {
        return this.f5082c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1380Mj)) {
            return false;
        }
        C1380Mj c1380Mj = (C1380Mj) obj;
        return AbstractC2492i.m4911a(this.f5080a, c1380Mj.f5080a) && AbstractC2492i.m4911a(this.f5081b, c1380Mj.f5081b) && AbstractC2492i.m4911a(this.f5082c, c1380Mj.f5082c);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig
    public final Object getFeaturesConfig() {
        return this.f5082c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig
    public final SdkIdentifiers getIdentifiers() {
        return this.f5080a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig
    public final RemoteConfigMetaInfo getRemoteConfigMetaInfo() {
        return this.f5081b;
    }

    public final int hashCode() {
        int hashCode = (this.f5081b.hashCode() + (this.f5080a.hashCode() * 31)) * 31;
        Object obj = this.f5082c;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "ServiceModuleRemoteConfigModel(identifiers=" + this.f5080a + ", remoteConfigMetaInfo=" + this.f5081b + ", featuresConfig=" + this.f5082c + ')';
    }

    /* renamed from: a */
    public final SdkIdentifiers m3095a() {
        return this.f5080a;
    }

    /* renamed from: a */
    public static C1380Mj m3094a(C1380Mj c1380Mj, SdkIdentifiers sdkIdentifiers, RemoteConfigMetaInfo remoteConfigMetaInfo, Object obj, int r4, Object obj2) {
        if ((r4 & 1) != 0) {
            sdkIdentifiers = c1380Mj.f5080a;
        }
        if ((r4 & 2) != 0) {
            remoteConfigMetaInfo = c1380Mj.f5081b;
        }
        if ((r4 & 4) != 0) {
            obj = c1380Mj.f5082c;
        }
        c1380Mj.getClass();
        return new C1380Mj(sdkIdentifiers, remoteConfigMetaInfo, obj);
    }
}
