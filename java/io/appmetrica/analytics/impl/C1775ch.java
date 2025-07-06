package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.ch */
/* loaded from: classes.dex */
public final class C1775ch {

    /* renamed from: a */
    public final C1615W5 f6050a;

    /* renamed from: b */
    public final boolean f6051b;

    /* renamed from: c */
    public final int f6052c;

    /* renamed from: d */
    public final HashMap f6053d;

    /* renamed from: e */
    public final C2000lh f6054e;

    public C1775ch(C1615W5 c1615w5, boolean z2, int r3, HashMap hashMap, C2000lh c2000lh) {
        this.f6050a = c1615w5;
        this.f6051b = z2;
        this.f6052c = r3;
        this.f6053d = hashMap;
        this.f6054e = c2000lh;
    }

    public final String toString() {
        return "ReportToSend(report=" + this.f6050a + ", serviceDataReporterType=" + this.f6052c + ", environment=" + this.f6054e + ", isCrashReport=" + this.f6051b + ", trimmedFields=" + this.f6053d + ')';
    }
}
