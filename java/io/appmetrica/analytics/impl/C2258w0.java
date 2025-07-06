package io.appmetrica.analytics.impl;

import kotlin.jvm.internal.AbstractC2492i;
import p000A.AbstractC0002c;

/* renamed from: io.appmetrica.analytics.impl.w0 */
/* loaded from: classes.dex */
public final class C2258w0 {

    /* renamed from: a */
    public final String f7323a;

    /* renamed from: b */
    public final String f7324b;

    /* renamed from: c */
    public final EnumC1565U5 f7325c;

    /* renamed from: d */
    public final int f7326d;

    /* renamed from: e */
    public final String f7327e;

    /* renamed from: f */
    public final String f7328f;

    public C2258w0(String str, String str2, EnumC1565U5 enumC1565U5, int r4, String str3, String str4) {
        this.f7323a = str;
        this.f7324b = str2;
        this.f7325c = enumC1565U5;
        this.f7326d = r4;
        this.f7327e = str3;
        this.f7328f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2258w0)) {
            return false;
        }
        C2258w0 c2258w0 = (C2258w0) obj;
        return AbstractC2492i.m4911a(this.f7323a, c2258w0.f7323a) && AbstractC2492i.m4911a(this.f7324b, c2258w0.f7324b) && this.f7325c == c2258w0.f7325c && this.f7326d == c2258w0.f7326d && AbstractC2492i.m4911a(this.f7327e, c2258w0.f7327e) && AbstractC2492i.m4911a(this.f7328f, c2258w0.f7328f);
    }

    public final int hashCode() {
        int m9d = AbstractC0002c.m9d(this.f7327e, (((this.f7325c.hashCode() + AbstractC0002c.m9d(this.f7324b, this.f7323a.hashCode() * 31, 31)) * 31) + this.f7326d) * 31, 31);
        String str = this.f7328f;
        return m9d + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "AppMetricaNativeCrashMetadata(apiKey=" + this.f7323a + ", packageName=" + this.f7324b + ", reporterType=" + this.f7325c + ", processID=" + this.f7326d + ", processSessionID=" + this.f7327e + ", errorEnvironment=" + this.f7328f + ')';
    }
}
