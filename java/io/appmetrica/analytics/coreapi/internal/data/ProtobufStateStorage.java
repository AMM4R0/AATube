package io.appmetrica.analytics.coreapi.internal.data;

/* loaded from: classes.dex */
public interface ProtobufStateStorage<T> {
    void delete();

    T read();

    void save(T t2);
}
