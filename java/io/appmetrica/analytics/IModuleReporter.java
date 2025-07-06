package io.appmetrica.analytics;

/* loaded from: classes.dex */
public interface IModuleReporter {
    void reportAdRevenue(AdRevenue adRevenue, boolean z2);

    void reportEvent(ModuleEvent moduleEvent);

    void setSessionExtra(String str, byte[] bArr);
}
