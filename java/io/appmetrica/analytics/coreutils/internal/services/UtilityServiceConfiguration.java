package io.appmetrica.analytics.coreutils.internal.services;

import kotlin.jvm.internal.AbstractC2489f;

/* loaded from: classes.dex */
public final class UtilityServiceConfiguration {

    /* renamed from: a */
    private final long f4346a;

    /* renamed from: b */
    private final long f4347b;

    public UtilityServiceConfiguration() {
        this(0L, 0L, 3, null);
    }

    public static /* synthetic */ UtilityServiceConfiguration copy$default(UtilityServiceConfiguration utilityServiceConfiguration, long j2, long j3, int r5, Object obj) {
        if ((r5 & 1) != 0) {
            j2 = utilityServiceConfiguration.f4346a;
        }
        if ((r5 & 2) != 0) {
            j3 = utilityServiceConfiguration.f4347b;
        }
        return utilityServiceConfiguration.copy(j2, j3);
    }

    public final long component1() {
        return this.f4346a;
    }

    public final long component2() {
        return this.f4347b;
    }

    public final UtilityServiceConfiguration copy(long j2, long j3) {
        return new UtilityServiceConfiguration(j2, j3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UtilityServiceConfiguration)) {
            return false;
        }
        UtilityServiceConfiguration utilityServiceConfiguration = (UtilityServiceConfiguration) obj;
        return this.f4346a == utilityServiceConfiguration.f4346a && this.f4347b == utilityServiceConfiguration.f4347b;
    }

    public final long getInitialConfigTime() {
        return this.f4346a;
    }

    public final long getLastUpdateConfigTime() {
        return this.f4347b;
    }

    public int hashCode() {
        long j2 = this.f4346a;
        int r02 = ((int) (j2 ^ (j2 >>> 32))) * 31;
        long j3 = this.f4347b;
        return r02 + ((int) ((j3 >>> 32) ^ j3));
    }

    public String toString() {
        return "UtilityServiceConfiguration(initialConfigTime=" + this.f4346a + ", lastUpdateConfigTime=" + this.f4347b + ')';
    }

    public UtilityServiceConfiguration(long j2, long j3) {
        this.f4346a = j2;
        this.f4347b = j3;
    }

    public /* synthetic */ UtilityServiceConfiguration(long j2, long j3, int r7, AbstractC2489f abstractC2489f) {
        this((r7 & 1) != 0 ? 0L : j2, (r7 & 2) != 0 ? 0L : j3);
    }
}
