package io.appmetrica.analytics.identifiers.impl;

import kotlin.jvm.internal.AbstractC2492i;

/* renamed from: io.appmetrica.analytics.identifiers.impl.a */
/* loaded from: classes.dex */
public final class C1039a {

    /* renamed from: a */
    public final String f4418a;

    /* renamed from: b */
    public final String f4419b;

    /* renamed from: c */
    public final Boolean f4420c;

    public C1039a(String str, String str2, Boolean bool) {
        this.f4418a = str;
        this.f4419b = str2;
        this.f4420c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1039a)) {
            return false;
        }
        C1039a c1039a = (C1039a) obj;
        return AbstractC2492i.m4911a(this.f4418a, c1039a.f4418a) && AbstractC2492i.m4911a(this.f4419b, c1039a.f4419b) && AbstractC2492i.m4911a(this.f4420c, c1039a.f4420c);
    }

    public final int hashCode() {
        int hashCode = this.f4418a.hashCode() * 31;
        String str = this.f4419b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f4420c;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "AdvIdInfo(provider=" + this.f4418a + ", advId=" + this.f4419b + ", limitedAdTracking=" + this.f4420c + ')';
    }
}
