package kotlin;

import kotlin.jvm.internal.AbstractC2492i;
import p105l1.C2630a;
import p140x1.C2893e;

/* loaded from: classes.dex */
public final class KotlinVersion implements Comparable<KotlinVersion> {
    public static final int MAX_COMPONENT_VALUE = 255;
    private final int major;
    private final int minor;
    private final int patch;
    private final int version;
    public static final C2630a Companion = new C2630a();
    public static final KotlinVersion CURRENT = new KotlinVersion(1, 9, 23);

    public KotlinVersion(int r12, int r2, int r3) {
        this.major = r12;
        this.minor = r2;
        this.patch = r3;
        this.version = versionOf(r12, r2, r3);
    }

    private final int versionOf(int r5, int r6, int r7) {
        if (new C2893e(0, MAX_COMPONENT_VALUE, 1).m5483b(r5) && new C2893e(0, MAX_COMPONENT_VALUE, 1).m5483b(r6) && new C2893e(0, MAX_COMPONENT_VALUE, 1).m5483b(r7)) {
            return (r5 << 16) + (r6 << 8) + r7;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + r5 + '.' + r6 + '.' + r7).toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        KotlinVersion kotlinVersion = obj instanceof KotlinVersion ? (KotlinVersion) obj : null;
        return kotlinVersion != null && this.version == kotlinVersion.version;
    }

    public final int getMajor() {
        return this.major;
    }

    public final int getMinor() {
        return this.minor;
    }

    public final int getPatch() {
        return this.patch;
    }

    public int hashCode() {
        return this.version;
    }

    public final boolean isAtLeast(int r2, int r3) {
        int r02 = this.major;
        return r02 > r2 || (r02 == r2 && this.minor >= r3);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.major);
        sb.append('.');
        sb.append(this.minor);
        sb.append('.');
        sb.append(this.patch);
        return sb.toString();
    }

    @Override // java.lang.Comparable
    public int compareTo(KotlinVersion other) {
        AbstractC2492i.m4915e(other, "other");
        return this.version - other.version;
    }

    public final boolean isAtLeast(int r2, int r3, int r4) {
        int r22;
        int r02 = this.major;
        return r02 > r2 || (r02 == r2 && ((r22 = this.minor) > r3 || (r22 == r3 && this.patch >= r4)));
    }

    public KotlinVersion(int r2, int r3) {
        this(r2, r3, 0);
    }
}
