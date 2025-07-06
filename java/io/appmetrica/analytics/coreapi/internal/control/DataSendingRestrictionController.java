package io.appmetrica.analytics.coreapi.internal.control;

/* loaded from: classes.dex */
public interface DataSendingRestrictionController {
    boolean isRestrictedForBackgroundDataCollection();

    boolean isRestrictedForReporter();

    boolean isRestrictedForSdk();
}
