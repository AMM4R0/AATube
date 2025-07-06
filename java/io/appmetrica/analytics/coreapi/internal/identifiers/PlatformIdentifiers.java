package io.appmetrica.analytics.coreapi.internal.identifiers;

import kotlin.jvm.internal.AbstractC2492i;

/* loaded from: classes.dex */
public final class PlatformIdentifiers {

    /* renamed from: a */
    private final SimpleAdvertisingIdGetter f4254a;

    /* renamed from: b */
    private final AppSetIdProvider f4255b;

    public PlatformIdentifiers(SimpleAdvertisingIdGetter simpleAdvertisingIdGetter, AppSetIdProvider appSetIdProvider) {
        this.f4254a = simpleAdvertisingIdGetter;
        this.f4255b = appSetIdProvider;
    }

    public static /* synthetic */ PlatformIdentifiers copy$default(PlatformIdentifiers platformIdentifiers, SimpleAdvertisingIdGetter simpleAdvertisingIdGetter, AppSetIdProvider appSetIdProvider, int r3, Object obj) {
        if ((r3 & 1) != 0) {
            simpleAdvertisingIdGetter = platformIdentifiers.f4254a;
        }
        if ((r3 & 2) != 0) {
            appSetIdProvider = platformIdentifiers.f4255b;
        }
        return platformIdentifiers.copy(simpleAdvertisingIdGetter, appSetIdProvider);
    }

    public final SimpleAdvertisingIdGetter component1() {
        return this.f4254a;
    }

    public final AppSetIdProvider component2() {
        return this.f4255b;
    }

    public final PlatformIdentifiers copy(SimpleAdvertisingIdGetter simpleAdvertisingIdGetter, AppSetIdProvider appSetIdProvider) {
        return new PlatformIdentifiers(simpleAdvertisingIdGetter, appSetIdProvider);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlatformIdentifiers)) {
            return false;
        }
        PlatformIdentifiers platformIdentifiers = (PlatformIdentifiers) obj;
        return AbstractC2492i.m4911a(this.f4254a, platformIdentifiers.f4254a) && AbstractC2492i.m4911a(this.f4255b, platformIdentifiers.f4255b);
    }

    public final SimpleAdvertisingIdGetter getAdvIdentifiersProvider() {
        return this.f4254a;
    }

    public final AppSetIdProvider getAppSetIdProvider() {
        return this.f4255b;
    }

    public int hashCode() {
        return this.f4255b.hashCode() + (this.f4254a.hashCode() * 31);
    }

    public String toString() {
        return "PlatformIdentifiers(advIdentifiersProvider=" + this.f4254a + ", appSetIdProvider=" + this.f4255b + ')';
    }
}
