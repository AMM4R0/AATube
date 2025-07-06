package io.appmetrica.analytics.ndkcrashesapi.internal;

import kotlin.jvm.internal.AbstractC2489f;

/* loaded from: classes.dex */
public final class NativeCrash {

    /* renamed from: a */
    private final NativeCrashSource f7656a;

    /* renamed from: b */
    private final String f7657b;

    /* renamed from: c */
    private final String f7658c;

    /* renamed from: d */
    private final String f7659d;

    /* renamed from: e */
    private final long f7660e;

    /* renamed from: f */
    private final String f7661f;

    public static final class Builder {

        /* renamed from: a */
        private final NativeCrashSource f7662a;

        /* renamed from: b */
        private final String f7663b;

        /* renamed from: c */
        private final String f7664c;

        /* renamed from: d */
        private final String f7665d;

        /* renamed from: e */
        private final long f7666e;

        /* renamed from: f */
        private final String f7667f;

        public Builder(NativeCrashSource nativeCrashSource, String str, String str2, String str3, long j2, String str4) {
            this.f7662a = nativeCrashSource;
            this.f7663b = str;
            this.f7664c = str2;
            this.f7665d = str3;
            this.f7666e = j2;
            this.f7667f = str4;
        }

        public final NativeCrash build() {
            return new NativeCrash(this.f7662a, this.f7663b, this.f7664c, this.f7665d, this.f7666e, this.f7667f, null);
        }
    }

    public /* synthetic */ NativeCrash(NativeCrashSource nativeCrashSource, String str, String str2, String str3, long j2, String str4, AbstractC2489f abstractC2489f) {
        this(nativeCrashSource, str, str2, str3, j2, str4);
    }

    public final long getCreationTime() {
        return this.f7660e;
    }

    public final String getDumpFile() {
        return this.f7659d;
    }

    public final String getHandlerVersion() {
        return this.f7657b;
    }

    public final String getMetadata() {
        return this.f7661f;
    }

    public final NativeCrashSource getSource() {
        return this.f7656a;
    }

    public final String getUuid() {
        return this.f7658c;
    }

    private NativeCrash(NativeCrashSource nativeCrashSource, String str, String str2, String str3, long j2, String str4) {
        this.f7656a = nativeCrashSource;
        this.f7657b = str;
        this.f7658c = str2;
        this.f7659d = str3;
        this.f7660e = j2;
        this.f7661f = str4;
    }
}
