package io.appmetrica.analytics.coreapi.internal.data;

/* loaded from: classes.dex */
public interface StateSerializer<T> {
    T defaultValue();

    byte[] toByteArray(T t2);

    T toState(byte[] bArr);
}
