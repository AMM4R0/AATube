package io.appmetrica.analytics.coreapi.internal.data;

/* loaded from: classes.dex */
public interface IBinaryDataHelper {
    byte[] get(String str);

    void insert(String str, byte[] bArr);

    void remove(String str);
}
