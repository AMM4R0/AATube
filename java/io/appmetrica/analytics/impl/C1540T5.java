package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* renamed from: io.appmetrica.analytics.impl.T5 */
/* loaded from: classes.dex */
public class C1540T5 extends BaseRequestConfig {

    /* renamed from: a */
    public String f5463a;

    /* renamed from: b */
    public String f5464b;

    /* renamed from: c */
    public C2354zl f5465c;

    /* renamed from: b */
    public final String m3352b() {
        return this.f5464b;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig
    public String toString() {
        return "CoreRequestConfig{mAppDebuggable='" + this.f5463a + "', mAppSystem='" + this.f5464b + "', startupState=" + this.f5465c + '}';
    }

    /* renamed from: a */
    public final String m3351a() {
        return this.f5463a;
    }
}
