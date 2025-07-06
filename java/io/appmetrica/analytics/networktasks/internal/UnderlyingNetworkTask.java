package io.appmetrica.analytics.networktasks.internal;

import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public interface UnderlyingNetworkTask {
    String description();

    FullUrlFormer<?> getFullUrlFormer();

    RequestDataHolder getRequestDataHolder();

    ResponseDataHolder getResponseDataHolder();

    RetryPolicyConfig getRetryPolicyConfig();

    SSLSocketFactory getSslSocketFactory();

    boolean onCreateTask();

    void onPerformRequest();

    void onPostRequestComplete(boolean z2);

    boolean onRequestComplete();

    void onRequestError(Throwable th);

    void onShouldNotExecute();

    void onSuccessfulTaskFinished();

    void onTaskAdded();

    void onTaskFinished();

    void onTaskRemoved();

    void onUnsuccessfulTaskFinished();
}
