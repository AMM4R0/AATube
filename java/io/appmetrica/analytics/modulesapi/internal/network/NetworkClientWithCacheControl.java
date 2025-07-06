package io.appmetrica.analytics.modulesapi.internal.network;

/* loaded from: classes.dex */
public interface NetworkClientWithCacheControl {
    String getETag();

    void onError();

    void onNotModified();

    void onResponse(String str, byte[] bArr);
}
