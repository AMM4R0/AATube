package io.appmetrica.analytics.networktasks.internal;

/* loaded from: classes.dex */
public final class DefaultResponseValidityChecker implements ResponseValidityChecker {
    @Override // io.appmetrica.analytics.networktasks.internal.ResponseValidityChecker
    public boolean isResponseValid(int r2) {
        return (r2 == 400 || r2 == 500) ? false : true;
    }
}
