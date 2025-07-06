package io.appmetrica.analytics.networktasks.internal;

/* loaded from: classes.dex */
public interface NetworkResponseHandler<T> {
    T handle(ResponseDataHolder responseDataHolder);
}
