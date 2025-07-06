package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.Lc */
/* loaded from: classes.dex */
public final class C1348Lc implements JsonParser, Converter {

    /* renamed from: a */
    public final RemoteConfigExtensionConfiguration f4999a;

    /* renamed from: b */
    public final /* synthetic */ JsonParser f5000b;

    /* renamed from: c */
    public final /* synthetic */ Converter f5001c;

    public C1348Lc(RemoteConfigExtensionConfiguration<Object> remoteConfigExtensionConfiguration) {
        this.f4999a = remoteConfigExtensionConfiguration;
        this.f5000b = remoteConfigExtensionConfiguration.getJsonParser();
        this.f5001c = remoteConfigExtensionConfiguration.getProtobufConverter();
    }

    /* renamed from: a */
    public final byte[] m3048a(Object obj) {
        return (byte[]) this.f5001c.fromModel(obj);
    }

    /* renamed from: b */
    public final Object m3049b(JSONObject jSONObject) {
        return this.f5000b.parseOrNull(jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return (byte[]) this.f5001c.fromModel(obj);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parse(JSONObject jSONObject) {
        return this.f5000b.parse(jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return this.f5000b.parseOrNull(jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return this.f5001c.toModel((byte[]) obj);
    }

    /* renamed from: a */
    public final Object m3046a(JSONObject jSONObject) {
        return this.f5000b.parse(jSONObject);
    }

    /* renamed from: a */
    public final Object m3047a(byte[] bArr) {
        return this.f5001c.toModel(bArr);
    }

    /* renamed from: a */
    public final RemoteConfigExtensionConfiguration<Object> m3045a() {
        return this.f4999a;
    }
}
