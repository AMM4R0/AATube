package io.appmetrica.analytics.coreapi.internal.identifiers;

import kotlin.jvm.internal.AbstractC2492i;

/* loaded from: classes.dex */
public final class AppSetId {

    /* renamed from: a */
    private final String f4247a;

    /* renamed from: b */
    private final AppSetIdScope f4248b;

    public AppSetId(String str, AppSetIdScope appSetIdScope) {
        this.f4247a = str;
        this.f4248b = appSetIdScope;
    }

    public static /* synthetic */ AppSetId copy$default(AppSetId appSetId, String str, AppSetIdScope appSetIdScope, int r3, Object obj) {
        if ((r3 & 1) != 0) {
            str = appSetId.f4247a;
        }
        if ((r3 & 2) != 0) {
            appSetIdScope = appSetId.f4248b;
        }
        return appSetId.copy(str, appSetIdScope);
    }

    public final String component1() {
        return this.f4247a;
    }

    public final AppSetIdScope component2() {
        return this.f4248b;
    }

    public final AppSetId copy(String str, AppSetIdScope appSetIdScope) {
        return new AppSetId(str, appSetIdScope);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppSetId)) {
            return false;
        }
        AppSetId appSetId = (AppSetId) obj;
        return AbstractC2492i.m4911a(this.f4247a, appSetId.f4247a) && this.f4248b == appSetId.f4248b;
    }

    public final String getId() {
        return this.f4247a;
    }

    public final AppSetIdScope getScope() {
        return this.f4248b;
    }

    public int hashCode() {
        String str = this.f4247a;
        return this.f4248b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public String toString() {
        return "AppSetId(id=" + this.f4247a + ", scope=" + this.f4248b + ')';
    }
}
