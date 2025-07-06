package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource;
import kotlin.jvm.internal.AbstractC2492i;
import p000A.AbstractC0002c;

/* renamed from: io.appmetrica.analytics.impl.v0 */
/* loaded from: classes.dex */
public final class C2233v0 {

    /* renamed from: a */
    public final NativeCrashSource f7246a;

    /* renamed from: b */
    public final String f7247b;

    /* renamed from: c */
    public final String f7248c;

    /* renamed from: d */
    public final String f7249d;

    /* renamed from: e */
    public final long f7250e;

    /* renamed from: f */
    public final C2258w0 f7251f;

    public C2233v0(NativeCrashSource nativeCrashSource, String str, String str2, String str3, long j2, C2258w0 c2258w0) {
        this.f7246a = nativeCrashSource;
        this.f7247b = str;
        this.f7248c = str2;
        this.f7249d = str3;
        this.f7250e = j2;
        this.f7251f = c2258w0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2233v0)) {
            return false;
        }
        C2233v0 c2233v0 = (C2233v0) obj;
        return this.f7246a == c2233v0.f7246a && AbstractC2492i.m4911a(this.f7247b, c2233v0.f7247b) && AbstractC2492i.m4911a(this.f7248c, c2233v0.f7248c) && AbstractC2492i.m4911a(this.f7249d, c2233v0.f7249d) && this.f7250e == c2233v0.f7250e && AbstractC2492i.m4911a(this.f7251f, c2233v0.f7251f);
    }

    public final int hashCode() {
        int m9d = AbstractC0002c.m9d(this.f7249d, AbstractC0002c.m9d(this.f7248c, AbstractC0002c.m9d(this.f7247b, this.f7246a.hashCode() * 31, 31), 31), 31);
        long j2 = this.f7250e;
        return this.f7251f.hashCode() + ((m9d + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }

    public final String toString() {
        return "AppMetricaNativeCrash(source=" + this.f7246a + ", handlerVersion=" + this.f7247b + ", uuid=" + this.f7248c + ", dumpFile=" + this.f7249d + ", creationTime=" + this.f7250e + ", metadata=" + this.f7251f + ')';
    }
}
